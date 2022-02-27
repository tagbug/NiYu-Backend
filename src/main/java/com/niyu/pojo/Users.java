package com.niyu.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Users {
  @Id
  private String id;
  @Indexed
  private String avatar;
  private String description;
  private String likedArticles;
  private String nickname;
  private String password;
  private String staredArticles;
  private String userId;
  private String username;
  private String chatList;
  private String email;
  private String fans;
  private String follows;


}
