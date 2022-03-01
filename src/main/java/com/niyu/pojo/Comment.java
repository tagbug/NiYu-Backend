package com.niyu.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@Document
public class Comment {
  @Id
  private String authorId;
  @Indexed
  private String content;
  private ArrayList<String> likerList;
  private long likes;
  private String parentReviewId;
  private String postDate;
  private String replyToArticleId;
  private String replyToUserId;
  private String reviewId;
  private ArrayList<String>  reviewList;


}
