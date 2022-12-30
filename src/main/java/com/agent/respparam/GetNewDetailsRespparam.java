package com.agent.respparam;

import lombok.Data;

import java.util.List;

@Data
public class GetNewDetailsRespparam {

    private String title;

    private Long previousId=0L;

    private String previousTitle;

    private Long nextId=0L;

    private String nextTitle;

    private String newsContent;

    private List<AgentNewsEntity> news;

    private List<AgentNewsEntity> recommends;

    private List<AgentNewsEntity> helps;

}
