package com.wclient.wclient.serviceproxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="wservices")
public interface WeatherServiceProxy {
    @GetMapping(path = "/weatherservice/{temp}")
    public String getWeatherInfo(@PathVariable int temp);
}
