package com.agent.respparam;

import lombok.Data;

@Data
public class AgentNewsEntity {


    private Long id;
    /**
     * 新闻标题
     */
    private String newsTitle;

    private String createTime;

    /**
     * 新闻内容
     */
    private String newsContent;

    private String newsImgUrl;

}
