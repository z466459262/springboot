package com.zwz.b.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by zhouwenzhe on 16/12/14.
 */
@Component
public class PropertiesEnvPostProcessor implements EnvironmentPostProcessor{

    @Override public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        DefaultResourceLoader dr = new DefaultResourceLoader();
        Resource resource = dr
                .getResource("file:/Users/zhouwenzhe/Documents/src/git_src/startspringboot/src/main/resources/b.config/envloadproperties.txt");
        Properties source = new Properties();
        try {
            source.load(resource.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        PropertiesPropertySource pps = new PropertiesPropertySource("justAName",source);
        environment.getPropertySources().addLast(pps);


    }
}
