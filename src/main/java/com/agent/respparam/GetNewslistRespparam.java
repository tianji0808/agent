package com.agent.respparam;

import lombok.Data;

import java.util.List;

@Data
public class GetNewslistRespparam {

    private List<AgentNewsEntity> notices;

    private List<AgentNewsEntity> helps;

    private List<AgentNewsEntity> news;

}
