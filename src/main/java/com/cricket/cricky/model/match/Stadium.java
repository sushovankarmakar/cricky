package com.cricket.cricky.model.match;

import com.cricket.cricky.model.common.Location;
import com.cricket.cricky.model.people.PitchCurator;
import com.cricket.cricky.model.people.Scorer;
import com.cricket.cricky.model.people.Team;
import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Data
public class Stadium {

  private String name;
  private LocalDate openedAt;
  private int capacity;
  private List<String> ends;
  private Location address;
  private List<Team> homeTeams;
  private boolean isFloodLightPresent;
  private List<Scorer> scorers;
  private List<PitchCurator> pitchCurators;
}
