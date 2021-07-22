package com.cricket.cricky.model.organization;

import com.cricket.cricky.model.people.Commentator;
import com.cricket.cricky.model.people.TvPresenter;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Broadcaster extends Association {

  private String channel;
  private List<Commentator> commentators;
  private List<TvPresenter> tvPresenters;
}
