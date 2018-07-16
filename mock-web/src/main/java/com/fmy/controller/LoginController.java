package com.fmy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description:
 * @author: fengmengyang
 * @date: 2018/4/30 0:06.
 */
@RestController
public class LoginController {

    @GetMapping("/index.do")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/testCase/view");
        return modelAndView;
    }
}
