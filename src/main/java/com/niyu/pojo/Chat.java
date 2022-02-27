package com.niyu.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Chat {
  @Id
  private String id;
  @Indexed
  private String message;
  private String receiverId;
  private String time;
  private String userId;
  private String messageId;



}
