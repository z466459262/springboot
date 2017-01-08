package com.zwz.b.properties;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(value = "bproperties.defaultproperties.prefixa")

public class PropertiesTest implements InitializingBean {

    /**
     * 使用默认的文件进行配置注入,不要做任何额外配置
     * 默认文件是classpath:/application.properties 或  classpath:/config/application.properties
     */
    @Value("${bproperties.defaultproperties.a}") private String defaultPropertiesA;

    /**
     * 使用默认文件，但是通过env来获取值，而不是注入方式获取
     */
    @Autowired private Environment env;

    /**
     * 这个值启动，需要PropertySource4ClassPathProperties类对source进行加载
     */
    @Value("${bproperties.classpathproperties.a}") private String classPathPropertiesA;

    @Value("${bproperties.envloadproperties.a}") private String envLoadPropertiesA;

    /**
     * @ConfigurationProperties("bproperties.defaultproperties.prefixa") 会找List<xxx>的东西，然
     * 后在上面进行注入,bproperties.defaultproperties.prefixa.xxx的list,然后注入到这个类中的list上面
     * 注意 get,set方法必不可少
     */
    private List<String> myList;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    private String port;

    public List<String> getMyList() {
        return myList;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;

    }

    @Override public void afterPropertiesSet() throws Exception {
        System.err.println(defaultPropertiesA);
        System.err.println(env.getProperty("defaultproperties.b"));
        System.err.println(env.getProperty("defaultproperties.c"));

        System.err.println(classPathPropertiesA);
        System.err.println(envLoadPropertiesA);
        System.err.println(myList);
        System.err.println(port);
    }
}
