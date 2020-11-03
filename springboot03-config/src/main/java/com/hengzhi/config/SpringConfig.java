package com.hengzhi.config;

import com.hengzhi.bean.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//标注在类上表示这是配置类,相当于xxx.xml
@Configuration
public class SpringConfig{

    //标注在方法上,用来向容器中添加一个组件,将方法的返回值添加到容器中,方法名作为组件id
    @Bean
    public Address address(){
        Address address = new Address();
        address.setProvince("山东");
        address.setCity("日照");
        return address;
    }
}
