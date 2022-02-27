package com.niyu.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Comment {
  @Id
  private String id;
  @Indexed
  private String authorId;
  private String content;
  private String likerList;
  private long likes;
  private String parentReviewId;
  private String postDate;
  private String replyToArticleId;
  private String replyToUserId;
  private String reviewId;
  private String reviewList;



}
