package com.agent.controller;


import com.agent.bean.AgentNewsInfo;
import com.agent.reqparam.DetailsReqParam;
import com.agent.respparam.*;
import com.agent.service.AgentNewsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {


    @Autowired
    private AgentNewsInfoService agentNewsInfoService;

    @PostMapping("/getNewslist")
    public RespData getNewslist(){

        GetNewslistRespparam respparam = new GetNewslistRespparam();

        List<AgentNewsEntity> noticeList = agentNewsInfoService.getAgentNewsEntityByType(1,3);
        respparam.setNotices(noticeList);


        List<AgentNewsEntity> helpList = agentNewsInfoService.getAgentNewsEntityByType(2,3);
        respparam.setHelps(helpList);


        List<AgentNewsEntity> newsList = agentNewsInfoService.getAgentNewsEntityByType(3,3);
        respparam.setNews(newsList);

        return RespData.success(respparam,ReturnMsg.MSG_SUCC);
    }


    @PostMapping("/getDetails")
    public RespData getDetails(DetailsReqParam reqParam){

        GetNewDetailsRespparam respparam = new GetNewDetailsRespparam();
        Long detailId = reqParam.getDetailId();
        AgentNewsInfo agentNewsInfo = agentNewsInfoService.getAgentNewsInfoById(detailId);
        String title = agentNewsInfo.getNewsTitle();
        respparam.setTitle(title);
        String newsContent = agentNewsInfo.getNewsContent();
        respparam.setNewsContent(newsContent);

        List<AgentNewsEntity> newsList = agentNewsInfoService.getAgentNewsEntityNotice(5);
        respparam.setNews(newsList);

        List<AgentNewsEntity> recommendList = agentNewsInfoService.getAgentNewsEntityRecommend(5);
        respparam.setRecommends(recommendList);

        return RespData.success(respparam,ReturnMsg.MSG_SUCC);
    }

    @PostMapping("/getHelp")
    public RespData getHelp(){

        GetNewDetailsRespparam respparam = new GetNewDetailsRespparam();

        List<AgentNewsEntity> newsList = agentNewsInfoService.getAgentNewsEntityNotice(5);
        respparam.setNews(newsList);

        List<AgentNewsEntity> recommendList = agentNewsInfoService.getAgentNewsEntityRecommend(5);
        respparam.setRecommends(recommendList);

        List<AgentNewsEntity> helpList = agentNewsInfoService.getAgentNewsEntityByType(2,3);
        respparam.setHelps(helpList);

        return RespData.success(respparam,ReturnMsg.MSG_SUCC);
    }
}
