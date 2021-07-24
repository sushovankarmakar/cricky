package com.cricket.cricky.model.common;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public abstract class Statistics {

  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

}
