package com.niyu.dataobject;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReplyDO {
    private String id;

    private String content;

    private String postId;

    private String uid;

    private int likes;

    private int dislikes;

    private LocalDateTime postTime;
}
