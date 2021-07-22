package com.cricket.cricky.model.organization;

import com.cricket.cricky.model.match.Stadium;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Association extends Organization {

  private List<Stadium> stadiums;

}
