package com.niyu.dataobject;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ChatDO {
    private String id;

    private String sender;

    private String receiver;

    private LocalDateTime gmtCreated;
}
