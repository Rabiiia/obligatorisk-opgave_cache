package com.example.demo.controllers;

import com.example.demo.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    Cache user = new Cache();

    @GetMapping("/get-user-data")
    @ResponseBody
    public String user(@RequestParam int id) throws InterruptedException {
        if (user.has(id)) {
            return user.get(id); //random generet ID
        } else {
            User userr = new User(id);
            String Dataslow = userr.getDataSlow();
            user.set(id, Dataslow);
            return Dataslow;
        }
    }
}