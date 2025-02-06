package com.deptapp.proxyservice;

import com.deptapp.dto.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="deptapp")
public interface DepartmentServiceProxy {


    @GetMapping("departments/{name}")
    public Department getByName(@PathVariable String name);


//    public Department getByName(String name) {
//        return new Department(1,"IT", "BTM");
//    }
}
