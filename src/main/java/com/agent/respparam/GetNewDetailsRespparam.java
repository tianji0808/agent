package com.agent.respparam;

import lombok.Data;

import java.util.List;

@Data
public class GetNewDetailsRespparam {

    private String title;

    private String newsContent;

    private List<AgentNewsEntity> news;

    private List<AgentNewsEntity> recommends;

    private List<AgentNewsEntity> helps;

}
