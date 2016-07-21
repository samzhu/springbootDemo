package com.sam.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by samchu on 2016/7/21.
 */
@RestController
@RequestMapping(value = "/api")
public class AuthorController {

    @RequestMapping(value = "/v1", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Map getMap() {
        HashMap map = new HashMap();
        try {
            map.put("name", "samzhu");
            map.put("doing", "Hello, World!");
        } catch (Exception e) {
            throw e;
        }
        return map;
    }
}
