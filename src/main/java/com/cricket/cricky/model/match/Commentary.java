package com.cricket.cricky.model.match;

import com.cricket.cricky.model.people.Commentator;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Commentary {

  private String comment;
  private Commentator createdBy;
  private LocalDateTime createdAt;

}
