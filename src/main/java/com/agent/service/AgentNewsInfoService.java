package com.agent.service;

import com.agent.bean.AgentNewsInfo;
import com.agent.respparam.AgentNewsEntity;

import java.util.List;

public interface AgentNewsInfoService {

    List<AgentNewsEntity> getAgentNewsEntityByType(Integer type,Integer limit);

    AgentNewsInfo getAgentNewsInfoById(Long id);

    List<AgentNewsEntity> getAgentNewsEntityNotice(Integer limit);

    List<AgentNewsEntity> getAgentNewsEntityRecommend(Integer limit);
}
