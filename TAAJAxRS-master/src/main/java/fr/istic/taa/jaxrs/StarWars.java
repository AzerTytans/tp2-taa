/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.istic.taa.jaxrs;

import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fr.istic.taa.jaxrs.domain.Films;
import fr.istic.taa.jaxrs.domain.People;
import fr.istic.taa.jaxrs.domain.Planets;
import fr.istic.taa.jaxrs.domain.Spaceships;
import fr.istic.taa.jaxrs.domain.Species;
import fr.istic.taa.jaxrs.domain.Vehicles;

@Path("/swapi")
public class StarWars {
  private static final Logger logger = Logger.getLogger(StarWars.class.getName());
   
  @GET
  public Response getStatus() {
    return Response.status(Response.Status.OK).entity("Bienvenue sur notre magnifique api Star Wars !").build();
  }

  @GET
  @Path("/people/{id}/")
  @Produces(MediaType.APPLICATION_JSON)
  public People getPeople(@PathParam("id") String id) {
    return RestServer.peoples.get(Integer.parseInt(id));
  }

  @GET
  @Path("/planets/{id}/")
  @Produces(MediaType.APPLICATION_JSON)
  public Planets getPlanets(@PathParam("id") String id) {
    return RestServer.planets.get(Integer.parseInt(id));
  }

  @GET
  @Path("/films/{id}/")
  @Produces(MediaType.APPLICATION_JSON)
  public Films getFilms(@PathParam("id") String id) {
    return RestServer.films.get(Integer.parseInt(id));
  }

  @GET
  @Path("/spaceships/{id}/")
  @Produces(MediaType.APPLICATION_JSON)
  public Spaceships getSpaceships(@PathParam("id") String id) {
    return RestServer.spaceships.get(Integer.parseInt(id));
  }

  @GET
  @Path("/species/{id}/")
  @Produces(MediaType.APPLICATION_JSON)
  public Species getSpecies(@PathParam("id") String id) {
    return RestServer.species.get(Integer.parseInt(id));
  }

  @GET
  @Path("/vehicles/{id}/")
  @Produces(MediaType.APPLICATION_JSON)
  public Vehicles getVehicles(@PathParam("id") String id) {
    return RestServer.vehicles.get(Integer.parseInt(id));
  }
  
  @POST
  @Path("/vehicles")
  @Consumes(MediaType.APPLICATION_JSON)
  public void addVehicle(Vehicles v) {
    RestServer.vehicles.add(new Vehicles(v.getName(), v.getModel(), v.getCost_in_credits()));
  }
  
  @POST
  @Path("/people")
  @Consumes(MediaType.APPLICATION_JSON)
  public void addPeople(People p) {
    RestServer.peoples.add(new People(p.getName(), p.getHeight(), p.getMass()));
  }
  
  @POST
  @Path("/planets")
  @Consumes(MediaType.APPLICATION_JSON)
  public void addPlanets(Planets p) {
    RestServer.planets.add(new Planets(p.getName(), p.getDiameter(), p.getPopulation()));
  }
  
  @POST
  @Path("/films")
  @Consumes(MediaType.APPLICATION_JSON)
  public void addFilms(Films p) {
    RestServer.films.add(new Films(p.getTitle(), p.getEpisode_id(), p.getRelease_date()));
  }
  
  @POST
  @Path("/spaceships")
  @Consumes(MediaType.APPLICATION_JSON)
  public void addSpaceships(Spaceships p) {
    RestServer.spaceships.add(new Spaceships(p.getName(), p.getModel(), p.getCost_in_credits()));
  }
  
  @POST
  @Path("/species")
  @Consumes(MediaType.APPLICATION_JSON)
  public void addSpecies(Species p) {
    RestServer.species.add(new Species(p.getName(), p.getClassification(), p.getDesignation()));
  }
  
  @DELETE
  @Path("/people/{id}/")
  public People deletePeople(@PathParam("id") String id) {
    return RestServer.peoples.remove(Integer.parseInt(id));
  }
}

