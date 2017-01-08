package com.zwz.d.enable.import4beanregistrar;

import com.zwz.d.enable.A;
import com.zwz.d.enable.B;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * Created by zhouwenzhe on 16/12/17.
 */
public class BeanDefinitionRegistar4Word implements ImportBeanDefinitionRegistrar {
    @Override public void registerBeanDefinitions(AnnotationMetadata annotationMetadata,
                                                  BeanDefinitionRegistry beanDefinitionRegistry) {
        Map<String, Object> map = annotationMetadata
                .getAnnotationAttributes(EnableWordUseRegistar.class.getName());
        String name = (String)map.get("name");
        if ("a".equalsIgnoreCase(name)){
            BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(A.class);
            AbstractBeanDefinition aBean = builder.getBeanDefinition();
            beanDefinitionRegistry.registerBeanDefinition("a",aBean);
        }else if("b".equalsIgnoreCase(name)){
            BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(B.class);
            AbstractBeanDefinition bBean = builder.getBeanDefinition();
            beanDefinitionRegistry.registerBeanDefinition("b",bBean);
        }

    }
}
