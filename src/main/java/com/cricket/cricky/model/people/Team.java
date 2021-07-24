package com.cricket.cricky.model.people;

import com.cricket.cricky.model.common.Contact;
import com.cricket.cricky.model.common.NewsAndEditorials;
import com.cricket.cricky.model.common.Video;
import com.cricket.cricky.model.match.enums.MatchFormat;
import java.util.List;
import java.util.Map;
import lombok.Data;

@Data
public class Team {

  private final String name;
  private final String tourName;
  private List<Player> players;
  private Contact contact;
  private List<SupportStaff> supportStaffs;
  private Map<MatchFormat, TeamStatistics> statistics;
  private List<NewsAndEditorials> news;
  private List<Video> videos;

}
