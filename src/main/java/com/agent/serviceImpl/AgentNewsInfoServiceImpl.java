package com.agent.serviceImpl;

import com.agent.bean.AgentNewsInfo;
import com.agent.mapper.AgentNewsInfoMapper;
import com.agent.respparam.AgentNewsEntity;
import com.agent.service.AgentNewsInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AgentNewsInfoServiceImpl implements AgentNewsInfoService {


    @Resource
    private AgentNewsInfoMapper agentNewsInfoMapper;


    @Override
    public List<AgentNewsEntity> getAgentNewsEntityByType(Integer type, Integer limit) {
        List<AgentNewsEntity> entities = new ArrayList<>();
        List<AgentNewsInfo> list = agentNewsInfoMapper.selectAgentNewsEntityByType(type,limit);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd");
        for (AgentNewsInfo agentNewsInfo:list){
            AgentNewsEntity entity = new AgentNewsEntity();
            entity.setId(agentNewsInfo.getId());
            entity.setNewsTitle(agentNewsInfo.getNewsTitle());
            entity.setNewsContent(agentNewsInfo.getNewsContent());
            entity.setNewsImgUrl(agentNewsInfo.getNewsImgUrl());

            String time = simpleDateFormat.format(agentNewsInfo.getCreateTime());
            entity.setCreateTime(time);
            entities.add(entity);
        }
        return entities;
    }

    @Override
    public AgentNewsInfo getAgentNewsInfoById(Long id) {
        return agentNewsInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<AgentNewsEntity> getAgentNewsEntityNotice(Integer limit) {
        List<AgentNewsEntity> entities = new ArrayList<>();
        List<AgentNewsInfo> list = agentNewsInfoMapper.selectAgentNewsEntityNotice(limit);
        for (AgentNewsInfo agentNewsInfo:list){
            AgentNewsEntity entity = new AgentNewsEntity();
            entity.setId(agentNewsInfo.getId());
            entity.setNewsTitle(agentNewsInfo.getNewsTitle());
            entities.add(entity);
        }
        return entities;
    }

    @Override
    public List<AgentNewsEntity> getAgentNewsEntityRecommend(Integer limit) {
        List<AgentNewsEntity> entities = new ArrayList<>();
        List<AgentNewsInfo> list = agentNewsInfoMapper.selectAgentNewsEntityRecommend(limit);
        for (AgentNewsInfo agentNewsInfo:list){
            AgentNewsEntity entity = new AgentNewsEntity();
            entity.setId(agentNewsInfo.getId());
            entity.setNewsTitle(agentNewsInfo.getNewsTitle());
            entities.add(entity);
        }
        return entities;
    }

    @Override
    public AgentNewsInfo getAgentNewsInfoPreviousByType(Integer type, Long id) {
        return agentNewsInfoMapper.getAgentNewsInfoPreviousByType(type,id);
    }

    @Override
    public AgentNewsInfo getAgentNewsInfoNextByType(Integer type, Long id) {
        return agentNewsInfoMapper.getAgentNewsInfoNextByType(type,id);
    }
}
