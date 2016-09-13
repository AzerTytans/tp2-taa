package fr.istic.taa.jaxrs.domain;

import java.util.List;

public class Spaceships {
  private String name;
  private String model;
  private String manufacturer;
  private String cost_in_credits;
  private int length;
  private String max_atmosphering_speed;
  private int crew;
  private int passengers;
  private int cargo_capacity;
  private String consumables;
  private String hyperdrive_rating;
  private String MGLT;
  private String starship_class;
  private List<People> pilots;
  private List<Films> films;
  private String created;
  private String edited;
  private String url;
  
  public Spaceships(){
    super();
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }
  public String getManufacturer() {
    return manufacturer;
  }
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }
  public String getCost_in_credits() {
    return cost_in_credits;
  }
  public void setCost_in_credits(String cost_in_credits) {
    this.cost_in_credits = cost_in_credits;
  }
  public int getLength() {
    return length;
  }
  public void setLength(int length) {
    this.length = length;
  }
  public String getMax_atmosphering_speed() {
    return max_atmosphering_speed;
  }
  public void setMax_atmosphering_speed(String max_atmosphering_speed) {
    this.max_atmosphering_speed = max_atmosphering_speed;
  }
  public int getCrew() {
    return crew;
  }
  public void setCrew(int crew) {
    this.crew = crew;
  }
  public int getPassengers() {
    return passengers;
  }
  public void setPassengers(int passengers) {
    this.passengers = passengers;
  }
  public int getCargo_capacity() {
    return cargo_capacity;
  }
  public void setCargo_capacity(int cargo_capacity) {
    this.cargo_capacity = cargo_capacity;
  }
  public String getConsumables() {
    return consumables;
  }
  public void setConsumables(String consumables) {
    this.consumables = consumables;
  }
  public String getHyperdrive_rating() {
    return hyperdrive_rating;
  }
  public void setHyperdrive_rating(String hyperdrive_rating) {
    this.hyperdrive_rating = hyperdrive_rating;
  }
  public String getMGLT() {
    return MGLT;
  }
  public void setMGLT(String mGLT) {
    MGLT = mGLT;
  }
  public String getStarship_class() {
    return starship_class;
  }
  public void setStarship_class(String starship_class) {
    this.starship_class = starship_class;
  }
  public List<People> getPilots() {
    return pilots;
  }
  public void setPilots(List<People> pilots) {
    this.pilots = pilots;
  }
  public List<Films> getFilms() {
    return films;
  }
  public void setFilms(List<Films> films) {
    this.films = films;
  }
  public String getCreated() {
    return created;
  }
  public void setCreated(String created) {
    this.created = created;
  }
  public String getEdited() {
    return edited;
  }
  public void setEdited(String edited) {
    this.edited = edited;
  }
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }
  public Spaceships(String name, String model, String cost_in_credits) {
    super();
    this.name = name;
    this.model = model;
    this.cost_in_credits = cost_in_credits;
  }
}
