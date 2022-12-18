package com.agent.controller;


import com.agent.respparam.RespData;
import com.agent.respparam.ReturnMsg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/faq")
public class FaqController {

    @PostMapping("/list")
    public RespData list(){

        System.err.print("-----------");
        return RespData.success(ReturnMsg.MSG_SUCC);
    }
}
