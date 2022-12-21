package com.agent.service;

import com.agent.respparam.AgentNewsEntity;

import java.util.List;

public interface AgentNewsInfoService {

    List<AgentNewsEntity> getAgentNewsEntityByType(Integer type,Integer limit);
}
