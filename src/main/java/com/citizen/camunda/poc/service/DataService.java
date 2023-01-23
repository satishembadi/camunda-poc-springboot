package com.citizen.camunda.poc.service;

import com.citizen.camunda.poc.model.Data;
import org.springframework.stereotype.Service;

@Service
public class DataService implements IDataService {
  private String state;

  public DataService() {
    this.state = "DEFAULT";
  }

  @Override
  public void setState(String state) {
    this.state = state;
  }

  @Override
  public Data getSecuredData(String source) {
    return new Data(source, "Some Data", System.currentTimeMillis(), state);
  }
}
