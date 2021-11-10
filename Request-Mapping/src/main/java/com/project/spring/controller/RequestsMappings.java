package com.project.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class RequestsMappings {

    @RequestMapping(method = GET, value = "/request/path")
    @ResponseBody
    public String getByPath() {
        return "I'm returned by path" ;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/request/post")
    @ResponseBody
    public String addByPath() {
        return "Add an element by post";
    }

    @RequestMapping(value = "/request/header", headers = "key=val", method = GET)
    @ResponseBody
    public String getByHeader() {
        return "Getting element by header";
    }

    @RequestMapping(value = "/request/header",
            headers = { "key1=val1", "key2=val2" },
            method = GET)
    @ResponseBody
    public String getByHeaders() {
        return "Getting elements by headers";
    }

    @RequestMapping(
            value = "/request/json",
            method = GET,
            headers = "Accept=application/json")
    @ResponseBody
    public String getAsJson() {
        return "Get some element with Header Old";
    }

    @RequestMapping(
            value = "/request/json2",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    @ResponseBody
    public String getAsJson2() {
        return "Get some element with Header New";
    }

    @RequestMapping(value = "/request/id/{id}", method = GET)
    @ResponseBody
    public String getValueWithPathVariable(@PathVariable("id") long id) {
        return "Get a specific element with id: " + id;
    }

    @RequestMapping(value = "/request/name/{name}", method = GET)
    @ResponseBody
    public String getValueWithPathVariable2(@PathVariable String name) {
        return "Get a specific element with name: " + name;
    }

    @RequestMapping(value = "/request/elements/id/{id}/name/{name}", method = GET)
    @ResponseBody
    public String getValuesWithPathVariables(@PathVariable long id, @PathVariable String name) {
        return "Getting the first element with id: " + id + "\nand with name: " + name;
    }

    @RequestMapping(value = "/request/expr/{id:[\\d]+}", method = GET)
    @ResponseBody
    public String getOnlyNumbers(
            @PathVariable long id) {
        return "Getting only numbers: " + id;
    }
    
}
