package com.anjani.hotelanjani.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
public class WheatherController {
    @GetMapping("/")
    public String forcast()
    {
        return "May be Rain";
    }
}
