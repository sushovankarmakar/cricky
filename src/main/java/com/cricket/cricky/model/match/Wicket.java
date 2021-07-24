package com.cricket.cricky.model.match;

import com.cricket.cricky.model.match.enums.WicketType;
import com.cricket.cricky.model.people.Player;
import com.cricket.cricky.model.people.Umpire;
import java.time.LocalTime;
import java.util.List;
import lombok.Data;

@Data
public class Wicket {

  private WicketType wicketType;
  private Player playerOut;
  private Player bowledBy;
  private Player caughtBy;
  private Player stumpedBy;
  private List<Player> runOutBy;
  private Umpire outGivenBy;
  private LocalTime dismissedAt;

}
