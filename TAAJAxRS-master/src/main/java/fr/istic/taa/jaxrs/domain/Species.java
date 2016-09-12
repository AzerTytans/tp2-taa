package fr.istic.taa.jaxrs.domain;

public class Species {
  public String name;
  public String classification;
  public String designation;
  public int average_height;
  public String skin_colors;
  public String hair_colors;
  public String eye_colors;
  public int average_lifespan;
  public Planets homeworld;
  public String language;
  public People people;
  public Films films;
  public String created;
  public String edited;
  public Species url;
  
  
  public Species(String name, String classification, String designation) {
    super();
    this.name = name;
    this.classification = classification;
    this.designation = designation;
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getClassification() {
    return classification;
  }
  public void setClassification(String classification) {
    this.classification = classification;
  }
  public String getDesignation() {
    return designation;
  }
  public void setDesignation(String designation) {
    this.designation = designation;
  }
  public int getAverage_height() {
    return average_height;
  }
  public void setAverage_height(int average_height) {
    this.average_height = average_height;
  }
  public String getSkin_colors() {
    return skin_colors;
  }
  public void setSkin_colors(String skin_colors) {
    this.skin_colors = skin_colors;
  }
  public String getHair_colors() {
    return hair_colors;
  }
  public void setHair_colors(String hair_colors) {
    this.hair_colors = hair_colors;
  }
  public String getEye_colors() {
    return eye_colors;
  }
  public void setEye_colors(String eye_colors) {
    this.eye_colors = eye_colors;
  }
  public int getAverage_lifespan() {
    return average_lifespan;
  }
  public void setAverage_lifespan(int average_lifespan) {
    this.average_lifespan = average_lifespan;
  }
  public Planets getHomeworld() {
    return homeworld;
  }
  public void setHomeworld(Planets homeworld) {
    this.homeworld = homeworld;
  }
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }
  public People getPeople() {
    return people;
  }
  public void setPeople(People people) {
    this.people = people;
  }
  public Films getFilms() {
    return films;
  }
  public void setFilms(Films films) {
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
  public Species getUrl() {
    return url;
  }
  public void setUrl(Species url) {
    this.url = url;
  }
}
