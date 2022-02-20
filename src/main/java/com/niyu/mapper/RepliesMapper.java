package com.niyu.mapper;

import com.niyu.pojo.Replies;
import com.niyu.pojo.RepliesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RepliesMapper {
    long countByExample(RepliesExample example);

    int deleteByExample(RepliesExample example);

    int deleteByPrimaryKey(String id);

    int insert(Replies record);

    int insertSelective(Replies record);

    List<Replies> selectByExample(RepliesExample example);

    Replies selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Replies record, @Param("example") RepliesExample example);

    int updateByExample(@Param("record") Replies record, @Param("example") RepliesExample example);

    int updateByPrimaryKeySelective(Replies record);

    int updateByPrimaryKey(Replies record);
}