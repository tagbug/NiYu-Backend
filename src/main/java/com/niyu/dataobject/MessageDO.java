package com.niyu.dataobject;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MessageDO {
    private String chatId;

    private String content;

    private String uid;

    private LocalDateTime time;

    private int id;
}
