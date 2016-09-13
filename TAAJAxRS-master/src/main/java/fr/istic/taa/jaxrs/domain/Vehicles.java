package fr.istic.taa.jaxrs.domain;

import java.util.List;

/**
 * Created by tp15009314 on 09/09/16.
 */
public class Vehicles {
  public String model;
  public String manufacturer;
  public String cost_in_credits;
  public String length;
  public String max_atmosphering_speed;
  public String crew;
  public String passengers;
  public String cargo_capacity;
  public String consumables;
  public String vehicle_class;
  public List<People> pilots;
  public List<Films> films;
  public String created;
  public String edited;
  public Vehicles url;
  public String  name;
  
  public Vehicles(){
    super();
  }
  
  public Vehicles( String name, String model, String cost_in_credits) {
    super();
    this.model = model;
    this.cost_in_credits = cost_in_credits;
    this.name = name;
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

  public String getLength() {
    return length;
  }

  public void setLength(String length) {
    this.length = length;
  }

  public String getMax_atmosphering_speed() {
    return max_atmosphering_speed;
  }

  public void setMax_atmosphering_speed(String max_atmosphering_speed) {
    this.max_atmosphering_speed = max_atmosphering_speed;
  }

  public String getCrew() {
    return crew;
  }

  public void setCrew(String crew) {
    this.crew = crew;
  }

  public String getPassengers() {
    return passengers;
  }

  public void setPassengers(String passengers) {
    this.passengers = passengers;
  }

  public String getCargo_capacity() {
    return cargo_capacity;
  }

  public void setCargo_capacity(String cargo_capacity) {
    this.cargo_capacity = cargo_capacity;
  }

  public String getConsumables() {
    return consumables;
  }

  public void setConsumables(String consumables) {
    this.consumables = consumables;
  }

  public String getVehicle_class() {
    return vehicle_class;
  }

  public void setVehicle_class(String vehicle_class) {
    this.vehicle_class = vehicle_class;
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

  public Vehicles getUrl() {
    return url;
  }

  public void setUrl(Vehicles url) {
    this.url = url;
  }

}