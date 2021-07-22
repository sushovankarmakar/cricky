package com.cricket.cricky.model.people;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class Player extends Person {

  private String profileSummary;
  private PlayingCareer career;
  private String battingStyle; // right hand bat
  private String bowlingStyle; // right arm medium
  private String playingRole;  // top order batter, batting all rounder

}
