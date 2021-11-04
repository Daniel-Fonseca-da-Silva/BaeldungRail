package com.project.status.controller;

import com.project.status.exception.ForbiddenException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class StatusController {

    @RequestMapping(value = "/controller", method = RequestMethod.GET)
    @ResponseBody
    ResponseEntity sendResponse() {
        return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
    }

    @RequestMapping(value = "/exception", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity sendByException() {
        throw new ForbiddenException();
    }

    @GetMapping("/api/name")
    @ResponseBody
    public String getName(@RequestParam String name) {
        return "Name: " + name;
    }

}
