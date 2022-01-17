package com.niyu.dataobject;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserSettingDO {
    private String uid;

    private boolean privateChat;

    private int settingId;

    private LocalDateTime gmtCreated;

    private LocalDateTime gmtModified;
}
