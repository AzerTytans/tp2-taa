package fr.istic.taa.jaxrs.domain;

import java.util.List;

public class Films {
  public String title;
  public int episode_id;
  public String opening_crawl;
  public String director;
  public String producer;
  public String release_date;
  public List<People> characters;
  public List<Planets> planets;
  public List<Spaceships> starships;
  public List<Vehicles> vehicles;
  public List<Species> species;
  public String created;
  public String edited;
  public Films url;
  
  public Films(String title, int episode_id, String release_date) {
    super();
    this.title = title;
    this.episode_id = episode_id;
    this.release_date = release_date;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public int getEpisode_id() {
    return episode_id;
  }
  public void setEpisode_id(int episode_id) {
    this.episode_id = episode_id;
  }
  public String getOpening_crawl() {
    return opening_crawl;
  }
  public void setOpening_crawl(String opening_crawl) {
    this.opening_crawl = opening_crawl;
  }
  public String getDirector() {
    return director;
  }
  public void setDirector(String director) {
    this.director = director;
  }
  public String getProducer() {
    return producer;
  }
  public void setProducer(String producer) {
    this.producer = producer;
  }
  public String getRelease_date() {
    return release_date;
  }
  public void setRelease_date(String release_date) {
    this.release_date = release_date;
  }
  public List<People> getCharacters() {
    return characters;
  }
  public void setCharacters(List<People> characters) {
    this.characters = characters;
  }
  public List<Planets> getPlanets() {
    return planets;
  }
  public void setPlanets(List<Planets> planets) {
    this.planets = planets;
  }
  public List<Spaceships> getStarships() {
    return starships;
  }
  public void setStarships(List<Spaceships> starships) {
    this.starships = starships;
  }
  public List<Vehicles> getVehicles() {
    return vehicles;
  }
  public void setVehicles(List<Vehicles> vehicles) {
    this.vehicles = vehicles;
  }
  public List<Species> getSpecies() {
    return species;
  }
  public void setSpecies(List<Species> species) {
    this.species = species;
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
  public Films getUrl() {
    return url;
  }
  public void setUrl(Films url) {
    this.url = url;
  }
}
