package com.cricket.cricky.model.match;

import lombok.Data;

@Data
public class FallOfWicket {

  private int fallNo;
  private Wicket wicket;
  private int currentTeamRun;
  private int currentOverNumber;
  private int currentBallNumber;

}
