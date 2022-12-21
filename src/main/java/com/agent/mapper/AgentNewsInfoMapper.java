package com.agent.mapper;

import com.agent.bean.AgentNewsInfo;
import com.agent.respparam.AgentNewsEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AgentNewsInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(AgentNewsInfo record);

    int insertSelective(AgentNewsInfo record);

    AgentNewsInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AgentNewsInfo record);

    int updateByPrimaryKeyWithBLOBs(AgentNewsInfo record);

    int updateByPrimaryKey(AgentNewsInfo record);

    List<AgentNewsInfo> selectAgentNewsEntityByType(@Param("type") Integer type,
                                                      @Param("limit") Integer limit);
}