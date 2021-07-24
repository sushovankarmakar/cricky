package com.cricket.cricky.model.match;

import com.cricket.cricky.model.match.enums.BallType;
import com.cricket.cricky.model.match.enums.RunType;
import lombok.Data;

@Data
public class Ball {

  private int overNumber;
  private BallType ballType;
  private String bowledBy;
  private String facedBy;
  private RunType runType;
  private Wicket wicket;
  private Commentary commentary;
}
