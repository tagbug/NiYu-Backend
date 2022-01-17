package com.niyu.dataobject;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDO {
    private String uid;

    private String userName;

    private String password;

    private String name;

    private String photoId;

    private LocalDateTime gmtCreated;

    private LocalDateTime gmtModified;
}
