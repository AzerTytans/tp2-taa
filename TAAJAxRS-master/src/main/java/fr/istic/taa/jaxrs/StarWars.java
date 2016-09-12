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
import javax.ws.rs.GET;
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
  private Films films[] = {new Films("A New Hope", 4, "1977-05-25"), new Films("The Empire Strikes Back", 5, "1980-05-17"), new Films("Return of the Jedi", 6, "1983-05-25"), new Films("The Phantom Menace", 1, "1999-05-19"), new Films("Attack of the Clones", 2, "2002-05-16"), new Films("Revenge of the Sith", 3, "2005-05-19"), new Films("Le retour de Vivien ; The slapper-man", 8, "2016-09-09"), new Films("The Force Awakens", 7, "2015-12-11")};
  private People peoples[] = {new People("dark vador","2.0m", "100kg" ), new People("Obi Wine Kanabis","1.75m","75kg"),             new People("Yahourt","0.5m","40kg"), new People("Jabba", "2.5m","400kg"),new People("Gary","1.68m","85kg")};
  private Planets planets[] = {new Planets("Coruscant",12240,92448200),new Planets("Tatooine",15000,3782),     new Planets("Mustafar",4000,10),new Planets("Mandalore",7800,8700),     new Planets("Naboo",12400,547850),new Planets("Alderaan",0,0)};
  private Vehicles vehicles[] = {new Vehicles("X-34 landspeeder", "X-34 landspeeder", "10550"), new Vehicles("TIE/LN starfighter", "Twin Ion Engine/Ln Starfighter", "unknown"), new Vehicles("T-16 skyhopper", "T-16 skyhopper", "14500"), new Vehicles("TR", "TT", "24580"), new Vehicles("TB", "TT", "50000"), new Vehicles("LandSpeader", "KHT-450", "2000"), new Vehicles("Speader", "A210", "1500")};
  private Species species[] = {new Species("Human", "mammal", "sentient"), new Species("Droid", "artificial", "sentient"), new Species("Wookie", "mammal", "sentient"), new Species("Ewok", "mammal", "sentient")};
  private Spaceships spaceships[] = {new Spaceships("X-wing","1337","20000 CR"), new Spaceships("DeathStar","42","9999999999999 CR"), new  Spaceships("TIE Fighter","3.5.1.2","50 CR")};
  
  @GET
  public Response getStatus() {
    return Response.status(Response.Status.OK).entity("Bienvenue sur notre magnifique api Star Wars !").build();
  }

  @GET
  @Path("/people/{id}/")
  @Produces(MediaType.APPLICATION_JSON)
  public People getPeople(@PathParam("id") String id) {
    return peoples[Integer.parseInt(id)];
  }

  @GET
  @Path("/planets/{id}/")
  @Produces(MediaType.APPLICATION_JSON)
  public Planets getPlanets(@PathParam("id") String id) {
    return planets[Integer.parseInt(id)];
  }

  @GET
  @Path("/films/{id}/")
  @Produces(MediaType.APPLICATION_JSON)
  public Films getFilms(@PathParam("id") String id) {
    return films[Integer.parseInt(id)];
  }

  @GET
  @Path("/spaceships/{id}/")
  @Produces(MediaType.APPLICATION_JSON)
  public Spaceships getSpaceships(@PathParam("id") String id) {
    return spaceships[Integer.parseInt(id)];
  }

  @GET
  @Path("/species/{id}/")
  @Produces(MediaType.APPLICATION_JSON)
  public Species getSpecies(@PathParam("id") String id) {
    return species[Integer.parseInt(id)];
  }

  @GET
  @Path("/vehicles/{id}/")
  @Produces(MediaType.APPLICATION_JSON)
  public Vehicles getVehicles(@PathParam("id") String id) {
    return vehicles[Integer.parseInt(id)];
  }

}

