package com.cricket.cricky.model.people;

import com.cricket.cricky.model.match.enums.MatchFormat;
import com.cricket.cricky.model.people.enums.UmpireType;
import java.time.LocalDate;
import java.util.Map;
import lombok.Data;

@Data
public abstract class UmpiringCareer {

  private Map<MatchFormat, LocalDate> careerSpan;
  private Map<MatchFormat, Statistics> statistics;

  @Data
  private static class Statistics {

    private Map<UmpireType, Integer> matchUmpired;
  }

}
