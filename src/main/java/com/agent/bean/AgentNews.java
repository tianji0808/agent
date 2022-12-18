package com.agent.bean;

import lombok.Data;

import java.util.Date;

@Data
public class AgentNews {


    private Long id;
    /**
     * 新闻标题
     */
    private String newsTitle;
    /**
     *  新闻类型 1：公告 2：帮助 3：资讯
     */
    private Integer type;
    /**
     * 推荐状态
     */
    private Integer recommendStauts;

    /**
     * 置顶状态
     */
    private Integer topStauts;
    /**
     * 新闻有效状态
     */
    private Integer newsStauts;
    /**
     * 新闻内容
     */
    private String newsContent;

    private Date createTime;



}
