package com.cricket.cricky.model.people;

import com.cricket.cricky.model.people.enums.CoachType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Coach extends SupportStaff {

  private String license;
  private CoachType coachType;
  private CoachingCareer career;
}
