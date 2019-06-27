package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-06-27T09:07:38.894Z")

@RestSchema(schemaId = "projecthr4g")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Projecthr4gImpl {

    @Autowired
    private Projecthr4gDelegate userProjecthr4gDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjecthr4gDelegate.helloworld(name);
    }

}
