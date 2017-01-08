package com.zwz.d.enable.import4importselector;

import com.zwz.d.enable.A;
import com.zwz.d.enable.B;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 *
 * 根据入参进行选择加载
 *
 */
public class WordSelector implements ImportSelector {
    @Override public String[] selectImports(AnnotationMetadata annotationMetadata) {
        Map<String, Object> map = annotationMetadata
                .getAnnotationAttributes(EnableWord.class.getName());
        //获取注解信息，根据注解信息返回spring管理的bean
        String name = (String)map.get("name");
        if ("a".equalsIgnoreCase(name)){
            return new String[]{A.class.getName()};
        }else if("b".equalsIgnoreCase(name)){
            return new String[]{B.class.getName()};
        }
        return new String[0];

    }
}
