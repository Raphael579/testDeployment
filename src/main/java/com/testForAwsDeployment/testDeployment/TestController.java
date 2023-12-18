package com.testForAwsDeployment.testDeployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class TestController {

    @GetMapping("/info")
    public Map<String, Object> getInfo() {
        Map<String, Object> responseBody = new HashMap<>();

        responseBody.put("isBase64Encoded", false);
        responseBody.put("statusCode", 200);
        responseBody.put("statusDescription", "200 OK");

        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        responseBody.put("headers", headers);

        responseBody.put("body", "Hallo Welt");

        return responseBody;
    }
}

