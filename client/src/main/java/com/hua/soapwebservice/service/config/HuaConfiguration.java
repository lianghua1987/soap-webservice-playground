package com.hua.soapwebservice.service.config;


import com.hua.soapwebservice.service.controller.HuaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class HuaConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.hua.soapwebservice.service.wsdl");
        return marshaller;
    }

    @Bean
    public HuaClient huaClient(Jaxb2Marshaller marshaller) {
        HuaClient client = new HuaClient();
        client.setDefaultUri("http://localhost:8081/service/ws");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
