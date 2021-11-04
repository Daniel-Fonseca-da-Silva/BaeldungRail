package com.project.webdev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
public class ParamController {

    @GetMapping("/api/id")
    @ResponseBody
    public String get(@RequestParam(name = "id") String id, @RequestParam("name") String name) {
        return "id: " + id + " name " + name;
    }

    @GetMapping("/api/name")
    @ResponseBody
    public String getOptional(@RequestParam(required = false) String name) {
        return "Name: " + name;
    }

    @GetMapping("/api/java")
    @ResponseBody
    public String getOptionalJava(@RequestParam Optional<String> name) {
        return "Name: " + name.orElseGet(() -> "This is not provider!");
    }

    @GetMapping("/api/default")
    @ResponseBody
    public String getDefault(@RequestParam(defaultValue = "empty value") String name) {
        return "Name: " + name;
    }

    @GetMapping("/api/map")
    @ResponseBody
    public String getMap(@RequestParam Map<String, String> allParams) {
        return "Parameters are: " + allParams.entrySet();
    }

    @GetMapping("/api/many")
    @ResponseBody
    public String getMany(@RequestParam List<String> ids) {
        return "Ids in the BD are: " + ids;
    }

}
