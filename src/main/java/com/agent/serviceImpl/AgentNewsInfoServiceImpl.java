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

            String time = simpleDateFormat.format(agentNewsInfo.getCreateTime());
            entity.setCreateTime(time);
            entities.add(entity);
        }
        return entities;
    }
}
