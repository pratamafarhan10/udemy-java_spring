package com.workbook.two.one.workbooktwoone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {
    @GetMapping("/")
    public String getShows(){
        return "shows";
    }
}
