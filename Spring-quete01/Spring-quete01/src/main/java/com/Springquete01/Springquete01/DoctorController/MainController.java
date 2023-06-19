package com.Springquete01.Springquete01.DoctorController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String index() {
        return "William Hartnell";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String index2() {
        return "David Tennant";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String index3() {
        return "Jodie Whittaker";
    }


}