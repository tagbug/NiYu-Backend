package com.niyu.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Articles {
  @Id
  private String id;
  @Indexed
  private String articleId;
  private String authorId;
  private String content;
  private String images;
  private String likerList;
  private long likes;
  private String postDate;
  private String replyTo;
  private String reviewList;
  private String starerList;
  private String tags;
  private String available;
  private String mentionList;
  private long reviews;
  private long stars;


}
