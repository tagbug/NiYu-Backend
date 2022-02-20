package com.niyu.mapper;

import com.niyu.pojo.Chats;
import com.niyu.pojo.ChatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChatsMapper {
    long countByExample(ChatsExample example);

    int deleteByExample(ChatsExample example);

    int deleteByPrimaryKey(String id);

    int insert(Chats record);

    int insertSelective(Chats record);

    List<Chats> selectByExample(ChatsExample example);

    Chats selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Chats record, @Param("example") ChatsExample example);

    int updateByExample(@Param("record") Chats record, @Param("example") ChatsExample example);

    int updateByPrimaryKeySelective(Chats record);

    int updateByPrimaryKey(Chats record);
}