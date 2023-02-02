package com.hua.soapwebservice.service.controller;

import com.hua.soapwebservice.service.wsdl.GetHuaRequest;
import com.hua.soapwebservice.service.wsdl.GetHuaResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class HuaClient extends WebServiceGatewaySupport {

    public GetHuaResponse connect() {
        GetHuaRequest request = new GetHuaRequest();
        request.setName("hua2");
        GetHuaResponse response = (GetHuaResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8081/service/ws/hua", request);
        return response;
    }
}
