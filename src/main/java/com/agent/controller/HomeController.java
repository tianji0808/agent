package com.agent.controller;


import com.agent.respparam.AgentNewsEntity;
import com.agent.respparam.GetNewslistRespparam;
import com.agent.respparam.RespData;
import com.agent.respparam.ReturnMsg;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {



    @PostMapping("/getNewslist")
    public RespData getNewslist(){

        GetNewslistRespparam respparam = new GetNewslistRespparam();

        List<AgentNewsEntity> noticeList = new ArrayList<>();

        AgentNewsEntity notice1 = new AgentNewsEntity();
        notice1.setId(1L);
        notice1.setCreateTime("09-21");
        notice1.setNewsTitle("ipweb禁用和适用场景说明");
        noticeList.add(notice1);

        AgentNewsEntity notice2 = new AgentNewsEntity();
        notice2.setId(2L);
        notice2.setCreateTime("03-16");
        notice2.setNewsTitle("ipweb修改器现已上线百度手机助手");

        noticeList.add(notice2);

        AgentNewsEntity notice3 = new AgentNewsEntity();
        notice3.setId(3L);
        notice3.setCreateTime("03-04");
        notice3.setNewsTitle("禁止挖矿相关应用和访问虚拟货币交易相关网站的通知");
        noticeList.add(notice3);

        respparam.setNotices(noticeList);


        List<AgentNewsEntity> helpList = new ArrayList<>();

        AgentNewsEntity help1 = new AgentNewsEntity();
        help1.setId(4L);
        help1.setCreateTime("07-25");
        help1.setNewsTitle("【自建拨号】Windows10电脑PPTP/L2TP设置IP代理教程");
        helpList.add(help1);

        AgentNewsEntity help2 = new AgentNewsEntity();
        help2.setId(5L);
        help2.setCreateTime("05-09");
        help2.setNewsTitle("【视频演示】ipweb安卓APP切换IP代理使用方法");

        helpList.add(help2);

        AgentNewsEntity help3 = new AgentNewsEntity();
        help3.setId(6L);
        help3.setCreateTime("06-17");
        help3.setNewsTitle("【ipweb安卓APP】切换IP软件使用教程");
        helpList.add(help3);

        respparam.setHelps(helpList);


        List<AgentNewsEntity> newsList = new ArrayList<>();

        AgentNewsEntity news1 = new AgentNewsEntity();
        news1.setId(7L);
        news1.setCreateTime("12-25");
        news1.setNewsTitle("IP地址是什么？有什么作用");
        newsList.add(news1);

        AgentNewsEntity news2 = new AgentNewsEntity();
        news2.setId(8L);
        news2.setCreateTime("12-09");
        news2.setNewsTitle("ip地址不是无限的,而是数量有限的");

        newsList.add(news2);

        AgentNewsEntity news3 = new AgentNewsEntity();
        news3.setId(9L);
        news3.setCreateTime("12-17");
        news3.setNewsTitle("IP代理本身以及背后的工作原理了解有多少");
        newsList.add(news3);

        respparam.setNews(newsList);

        System.err.print("-----------");
        return RespData.success(respparam,ReturnMsg.MSG_SUCC);
    }
}
