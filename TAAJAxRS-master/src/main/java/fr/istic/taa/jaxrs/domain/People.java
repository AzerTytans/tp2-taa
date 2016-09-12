package fr.istic.taa.jaxrs.domain;

import java.util.List;

public class People {
  public String name;
  public String height;
  public String mass;
  public String hair_color;
  public String skin_color;
  public String eye_color;
  public String birth_year;
  public String gender;
  public Planets homeworld;
  public List<Films> films;
  public List<Species> species;
  public List<Vehicles> vehicles;
  public List<Spaceships> starships;
  public String created;
  public String edited;
  public People url;
  
  public People(String name, String height, String mass) {
    super();
    this.name = name;
    this.height = height;
    this.mass = mass;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getHeight() {
    return height;
  }
  public void setHeight(String height) {
    this.height = height;
  }
  public String getMass() {
    return mass;
  }
  public void setMass(String mass) {
    this.mass = mass;
  }
  public String getHair_color() {
    return hair_color;
  }
  public void setHair_color(String hair_color) {
    this.hair_color = hair_color;
  }
  public String getSkin_color() {
    return skin_color;
  }
  public void setSkin_color(String skin_color) {
    this.skin_color = skin_color;
  }
  public String getEye_color() {
    return eye_color;
  }
  public void setEye_color(String eye_color) {
    this.eye_color = eye_color;
  }
  public String getBirth_year() {
    return birth_year;
  }
  public void setBirth_year(String birth_year) {
    this.birth_year = birth_year;
  }
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }
  public Planets getHomeworld() {
    return homeworld;
  }
  public void setHomeworld(Planets homeworld) {
    this.homeworld = homeworld;
  }
  public List<Films> getFilms() {
    return films;
  }
  public void setFilms(List<Films> films) {
    this.films = films;
  }
  public List<Species> getSpecies() {
    return species;
  }
  public void setSpecies(List<Species> species) {
    this.species = species;
  }
  public List<Vehicles> getVehicles() {
    return vehicles;
  }
  public void setVehicles(List<Vehicles> vehicles) {
    this.vehicles = vehicles;
  }
  public List<Spaceships> getStarships() {
    return starships;
  }
  public void setStarships(List<Spaceships> starships) {
    this.starships = starships;
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
  public People getUrl() {
    return url;
  }
  public void setUrl(People url) {
    this.url = url;
  }
}
