package com.cricket.cricky.model.common;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

@Data
public class Video {

  private String category;
  private String contentUrl;
  private LocalDateTime uploadedAt;
  private LocalDateTime updatedAt;
  private List<String> resolutions;
  private List<String> tags;

}
