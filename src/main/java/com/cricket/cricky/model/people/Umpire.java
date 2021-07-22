package com.cricket.cricky.model.people;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Umpire extends MatchOfficial {

  private String profileSummary;
  private UmpiringCareer career;
}
