package com.hua.soapwebservice.service.service;

import com.hua.soap_web_service.GetHuaRequest;
import com.hua.soap_web_service.GetHuaResponse;
import com.hua.soapwebservice.service.repository.HuaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class HuaEndpoint {
    private static final String NAMESPACE_URI = "http://hua.com/soap-web-service";

    @Autowired
    private HuaRepository repository;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getHuaRequest")
    @ResponsePayload
    public GetHuaResponse getHua(@RequestPayload GetHuaRequest request) {
        GetHuaResponse response = new GetHuaResponse();
        response.setHua(repository.findHua(request.getName()));
        return response;
    }

}
