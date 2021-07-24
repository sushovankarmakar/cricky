package com.cricket.cricky.model.match;

import java.util.Map;
import lombok.Data;

@Data
public class ScoreCard {

  private String matchResultDescription;
  private Map<Integer, Innings> innings;
}
