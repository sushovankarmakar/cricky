package com.cricket.cricky.model.common;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

@Data
public class NewsAndEditorials {

  private String headline;
  private String url;
  private String content;
  private String publisher;
  private LocalDateTime publishedAt;
  private List<Image> images;
  private LocalDateTime updatedAt;
  private List<String> tags;

}
