package com.agent.controller;


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

        System.err.println("-----------");
        return RespData.success(respparam,ReturnMsg.MSG_SUCC);
    }


    @PostMapping("/getDetails")
    public RespData getDetails(DetailsReqParam reqParam){

        System.err.println(reqParam.getDetailId());
        GetNewDetailsRespparam respparam = new GetNewDetailsRespparam();
        String title = "API使用说明";
        respparam.setTitle(title);
        String newsContent = "<p>API使用说明：</p><p>一. 取帐号API示例：</p><p>最上面就是分配给贵司的TOKEN，请注意不要泄露，一但泄露，请及时与我司联系。</p><p>curl -H Token:\"*********\" -X GET \"http://api.ipweb.cc:8004/api/agent/account2?country=BR&amp;times=5&amp;limit=1\"</p><p>返回：</p><p>{\"msg\":\"操作成功\",\"code\":200,\"data\":{\"passWord\":\"a6d28872bb23eae6c2a6fceae3108c04\",\"userName\":\"101348109354-ENRSjASy\"}}</p><p><br></p><p><br></p><p>TOKEN ：****** 这是区分客户的唯一ID</p><p>times： IP使用时长 单位：分钟 最低时长5分钟，最高180分钟，可以大于180（不建议），一定要大于等于5</p><p>country: 国家代码，如果不填写国家代码那么就是全球随机分配ip，国家代码表请查看后台的国家代码</p><p>limit：帐号数量</p><p><br></p><p>server IP :gate1.ipweb.cc (美国) 或者 gate2.ipweb.c(香港)</p><p>端口：7778</p><p>同时支持SOCKS5 与 HTTP协议</p><p><br></p><p>二 总流量查询</p><p><br></p><p>curl http://api.ipweb.cc:8004/api/agent/flow -H 'Token:XXXXX'</p><p>返回格式：</p><p>{\"msg\": \"操作成功\", //返回文字描述</p><p>\"code\": 200,</p><p>\"data\": {\"download\": 132272.01407, //下载流量(MB)</p><p>\"upload\": 35573.84433 //上传流量(MB)</p><p>} //返回数据</p><p>}</p><p><br></p><p>说明：返回的是所有消耗的流量</p><p><br></p><p><br></p><p>三 切换ip</p><p>http://api.ipweb.cc:8004//api/agent/release?account=?</p><p>示例：</p><p>curl http://api.ipweb.cc:8004/api/agent/release?account=1234 -H 'Token:XXXXX'</p><p>account 切换的代理子帐号</p><p>一样带上分配的TOKEN就可以。</p>";
        respparam.setNewsContent(newsContent);



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

        AgentNewsEntity news4 = new AgentNewsEntity();
        news4.setId(9L);
        news4.setCreateTime("12-17");
        news4.setNewsTitle("IP代理本身以及背后的工作原理了解有多少");
        newsList.add(news4);

        respparam.setNews(newsList);

        List<AgentNewsEntity> recommendList = new ArrayList<>();

        AgentNewsEntity notice1 = new AgentNewsEntity();
        notice1.setId(1L);
        notice1.setCreateTime("09-21");
        notice1.setNewsTitle("ipweb禁用和适用场景说明");
        recommendList.add(notice1);

        AgentNewsEntity notice2 = new AgentNewsEntity();
        notice2.setId(2L);
        notice2.setCreateTime("03-16");
        notice2.setNewsTitle("ipweb修改器现已上线百度手机助手");

        recommendList.add(notice2);

        AgentNewsEntity notice3 = new AgentNewsEntity();
        notice3.setId(3L);
        notice3.setCreateTime("03-04");
        notice3.setNewsTitle("禁止挖矿相关应用和访问虚拟货币交易相关网站的通知");
        recommendList.add(notice3);

        AgentNewsEntity notice4 = new AgentNewsEntity();
        notice4.setId(3L);
        notice4.setCreateTime("03-04");
        notice4.setNewsTitle("禁止挖矿相关应用和访问虚拟货币交易相关网站的通知");
        recommendList.add(notice4);

        AgentNewsEntity notice5 = new AgentNewsEntity();
        notice5.setId(3L);
        notice5.setCreateTime("03-04");
        notice5.setNewsTitle("禁止挖矿相关应用和访问虚拟货币交易相关网站的通知");
        recommendList.add(notice5);

        respparam.setRecommends(recommendList);

        return RespData.success(respparam,ReturnMsg.MSG_SUCC);
    }
}
