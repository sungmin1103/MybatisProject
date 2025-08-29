package com.spring.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    /*@ResponseBody
    @GetMapping("/")
    public String home() {
        return "프로젝트 메인 확인";
    }*/

    /** 실제 메인 페이지 */
    @GetMapping("/")
    public String main() {
        return "client/main";
    }
}
