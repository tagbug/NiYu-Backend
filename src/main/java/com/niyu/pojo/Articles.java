package com.niyu.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;

@Data
@Document
public class Articles {
  @Id
  private String articleId;
  @Indexed
  private String authorId;
  private String content;
  private ArrayList<String> images;
  private ArrayList<String>  likerList;
  private long likes;
  private Date postDate;
  private String replyTo;
  private ArrayList<String>  reviewList;
  private ArrayList<String>  starerList;
  private ArrayList<String>  tags;
  private boolean available;
  private ArrayList<String>  mentionList;

}
