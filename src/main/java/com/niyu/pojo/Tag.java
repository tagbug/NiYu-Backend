package com.niyu.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Tag {
  @Id
  private String topicId;
  @Indexed
  private long articleNum;
  private String tag;
  private String title;



}
