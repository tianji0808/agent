package com.agent.bean;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 新闻公告表
 */
@Data
public class AgentNewsInfo implements Serializable {
    private Long id;

    /**
     * 新闻标题
     */
    private String newsTitle;

    /**
     * 新闻类型 1：公告 2：帮助 3：资讯
     */
    private Integer type;

    /**
     * 推荐状态 0-未推荐 1-推荐
     */
    private Integer recommendStauts;

    /**
     * 置顶状态 0-未置顶 1-置顶
     */
    private Integer topStauts;

    /**
     * 新闻有效状态 0-无效 1-有效
     */
    private Integer newsStauts;

    /**
     * 操作时间
     */
    private Date createTime;

    /**
     * 新闻内容
     */
    private String newsContent;

    private static final long serialVersionUID = 1L;
}