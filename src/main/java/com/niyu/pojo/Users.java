package com.niyu.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;

@Data
@Document
public class Users {
  @Id
  private String id;
  @Indexed
  private String avatar;
  private String description;
  private Integer articleNum;
  private ArrayList<String> likedArticles;
  private String nickname;
  private String password;
  private ArrayList<String>  staredArticles;
  private String userId;
  private String username;
  private ArrayList<String>  chatList;
  private String email;
  private ArrayList<String>  fans;
  private ArrayList<String>  follows;
  private Date lastPostTime;

}
