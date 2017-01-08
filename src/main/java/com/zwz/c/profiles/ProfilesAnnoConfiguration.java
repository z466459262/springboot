package com.zwz.c.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by zhouwenzhe on 16/12/16.
 */
@Configuration
public class ProfilesAnnoConfiguration {

    /**
     * 只有dev的profile激活我才会激活这个bean,但其他配置文件生效
     * @return
     */
    @Bean
    @Profile("dev")
    public Runnable devProfileBean(){
        return ()->{};
    }
}
