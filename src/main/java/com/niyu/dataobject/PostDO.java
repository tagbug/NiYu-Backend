package com.niyu.dataobject;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostDO {
    private String id;

    private String content;

    private byte[] images;

    private String title;

    private String uid;

    private int likes;

    private int dislikes;

    private LocalDateTime postTime;

    private LocalDateTime lastReply;

    private String tag;
}
