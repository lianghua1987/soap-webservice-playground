package com.hua.soapwebservice.service.repository;

import com.hua.soap_web_service.Hua;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class HuaRepository {
    private static final Map<String, Hua> map = new HashMap<>();

    @PostConstruct
    public void initData() {
        Hua hua1 = new Hua();
        hua1.setAge(1);
        hua1.setName("Huaaaaa1");
        hua1.setProfession("Prof1");
        Hua hua2 = new Hua();
        hua2.setAge(2);
        hua2.setName("Huaaaaa2");
        hua2.setProfession("Prof2");
        map.put("hua1", hua1);
        map.put("hua2", hua2);
    }

    public Hua findHua(String name) {
        return map.getOrDefault(name, null);
    }
}
