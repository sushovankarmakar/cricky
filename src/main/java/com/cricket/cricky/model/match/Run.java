package com.cricket.cricky.model.match;

import com.cricket.cricky.model.match.enums.RunType;
import lombok.Data;

@Data
public class Run {

  private int scoredRun;
  private RunType runType;
}
