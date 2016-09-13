package fr.istic.taa.jaxrs;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;

import fr.istic.taa.jaxrs.domain.Films;
import fr.istic.taa.jaxrs.domain.People;
import fr.istic.taa.jaxrs.domain.Planets;
import fr.istic.taa.jaxrs.domain.Spaceships;
import fr.istic.taa.jaxrs.domain.Species;
import fr.istic.taa.jaxrs.domain.Vehicles;
import io.undertow.Undertow;

/**
 * RESTfull microservice, based on JAX-RS and JBoss Undertow
 *
 */
public class RestServer {
  public static List<Films> films;
  public static List<Vehicles> vehicles;
  public static List<People> peoples;
  public static List<Species> species;
  public static List<Spaceships> spaceships;
  public static List<Planets> planets;

  private static final Logger logger = Logger.getLogger(RestServer.class.getName());

  public static void main( String[] args ) {

    UndertowJaxrsServer ut = new UndertowJaxrsServer();
    TestApplication ta = new TestApplication();

    ut.deploy(ta);
    ut.start(Undertow.builder().addHttpListener(8080, "localhost"));

    logger.info("JAX-RS based micro-service running!");

    createListData();

  }

  public static void createListData(){
    films = new ArrayList<Films>();
    films.add(new Films("A New Hope", 4, "1977-05-25"));
    films.add(new Films("The Empire Strikes Back", 5, "1980-05-17"));
    films.add(new Films("Return of the Jedi", 6, "1983-05-25"));
    films.add(new Films("The Phantom Menace", 1, "1999-05-19"));
    films.add(new Films("Attack of the Clones", 2, "2002-05-16"));
    films.add(new Films("Revenge of the Sith", 3, "2005-05-19"));
    films.add(new Films("Le retour de Vivien ; The slapper-man", 8, "2016-09-09"));
    films.add(new Films("The Force Awakens", 7, "2015-12-11"));

    peoples = new ArrayList<People>();
    peoples.add(new People("dark vador","2.0m", "100kg" ));
    peoples.add(new People("Obi Wine Kanabis","1.75m","75kg"));
    peoples.add(new People("Yahourt","0.5m","40kg"));
    peoples.add(new People("Jabba", "2.5m","400kg"));
    peoples.add(new People("Gary","1.68m","85kg"));

    planets = new ArrayList<Planets>();
    planets.add(new Planets("Coruscant",12240,92448200));
    planets.add(new Planets("Tatooine",15000,3782));
    planets.add(new Planets("Mustafar",4000,10));
    planets.add(new Planets("Mandalore",7800,8700));
    planets.add(new Planets("Naboo",12400,547850));
    planets.add(new Planets("Alderaan",0,0));

    vehicles = new ArrayList<Vehicles>();
    vehicles.add(new Vehicles("X-34 landspeeder", "X-34 landspeeder", "10550"));
    vehicles.add(new Vehicles("TIE/LN starfighter", "Twin Ion Engine/Ln Starfighter", "unknown"));
    vehicles.add(new Vehicles("T-16 skyhopper", "T-16 skyhopper", "14500"));
    vehicles.add(new Vehicles("TR", "TT", "24580"));
    vehicles.add(new Vehicles("TB", "TT", "50000"));
    vehicles.add(new Vehicles("LandSpeader", "KHT-450", "2000"));
    vehicles.add(new Vehicles("Speader", "A210", "1500"));

    species = new ArrayList<Species>();
    species.add(new Species("Human", "mammal", "sentient"));
    species.add(new Species("Droid", "artificial", "sentient"));
    species.add(new Species("Wookie", "mammal", "sentient"));
    species.add(new Species("Ewok", "mammal", "sentient"));

    spaceships = new ArrayList<Spaceships>();
    spaceships.add(new Spaceships("X-wing","1337","20000 CR"));
    spaceships.add(new Spaceships("DeathStar","42","9999999999999 CR"));
    spaceships.add(new  Spaceships("TIE Fighter","3.5.1.2","50 CR"));
  }
}
