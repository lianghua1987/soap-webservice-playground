package com.hua.soapwebservice.service.service;

import com.hua.soapwebservice.service.Stuff;
import org.apache.cxf.feature.Features;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class HelloWebService {

    @WebMethod
    public String hello() {
        return "Hello Hua";
    }

    @WebMethod
    public Stuff hua(String str) {
        return new Stuff(str, "this is a test");
    }


}
