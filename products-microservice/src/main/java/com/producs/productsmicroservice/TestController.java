package com.producs.productsmicroservice;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/test")
@Getter
@Setter
@RefreshScope
public class TestController {

    @Value("${app.testProp}")
    private String testProperty;

    @GetMapping
    public String getTestProperty() {
        return this.testProperty;
    }
}
