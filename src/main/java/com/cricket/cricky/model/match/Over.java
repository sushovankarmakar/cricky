package com.cricket.cricky.model.match;

import com.cricket.cricky.model.match.enums.PowerPlayType;
import java.util.Map;
import lombok.Data;

@Data
public class Over {

  private int number;
  private int runScoredByBatsman = 0;
  private int extras = 0;
  private int totalRuns = 0;

  private Map<Integer, Run> runsByBall;
  private PowerPlayType powerPlayType;

  private boolean isMaidenOver() {
    return runScoredByBatsman == 0;
  }

}
