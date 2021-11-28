package com.example.forzaraceselector.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RaceType {
    private static List<String> raceType;

    public RaceType() {
        raceType = new ArrayList<>();
        raceType.add("Road Race");
        raceType.add("Dirt Race");
        raceType.add("Cross Country Race");
        raceType.add("Drag Race");
        raceType.add("Street Race");
    }

    public static String getRaceType() {
        Random rand = new Random();
        return raceType.get(rand.nextInt(raceType.size()));
    }

    public static class RoadRace {
        private static List<String> roadRace;

        public RoadRace(){
            roadRace = new ArrayList<>();
            //Circuit Road Races
            roadRace.add("Bahia de Plano Circuit");
            roadRace.add("Arch of Mulege Circuit");
            roadRace.add("Los Jardines Circuit");
            roadRace.add("Chihuahua Circuit");
            roadRace.add("Tierra Prospera Circuit");
            roadRace.add("Playa Azul Circuit");
            roadRace.add("Lookout Circuit");
            roadRace.add("Horizon Mexico Circuit");
            roadRace.add("Emerald Circuit");
            roadRace.add("Estadio Circuit");
            roadRace.add("Cathedral Circuit");
            roadRace.add("Plaza Circuit");
            roadRace.add("Bola Ocho Circuit");
            roadRace.add("The Goliath");

            //Sprint Road Races
            roadRace.add("Dunas Blancas Sprint");
            roadRace.add("Descansar Dorado Sprint");
            roadRace.add("Reservorio Sprint");
            roadRace.add("Copper Canyon Sprint");
            roadRace.add("Volcan Sprint");
            roadRace.add("Gran Pantano Sprint");
            roadRace.add("Sierra Verde Sprint");
            roadRace.add("Llanuras Sprint");
            roadRace.add("Panoramica Sprint");
            roadRace.add("Riviera Sprint");
            roadRace.add("The Colossus");
        }

        public static String getRoadRace() {
            Random rand = new Random();
            return roadRace.get(rand.nextInt(roadRace.size()));
        }
    }

    public static class DirtRace {
        private static List<String> dirtRace;

        public DirtRace() {
            dirtRace = new ArrayList<>();
            //Dirt Scramble Races
            dirtRace.add("River Scramble");
            dirtRace.add("Mangrove Scramble");
            dirtRace.add("Mulege Town Scramble");
            dirtRace.add("San Juan Scramble");
            dirtRace.add("Horizon Baja Scramble");
            dirtRace.add("Teotihuacan Scramble");
            dirtRace.add("Caldera Scramble");
            dirtRace.add("La Selva Scramble");
            dirtRace.add("El Pipila Scramble");

            //Dirt Trail Races
            dirtRace.add("Cascada Trail");
            dirtRace.add("Montana Trail");
            dirtRace.add("Desierto Trail");
            dirtRace.add("Baja California Trail");
            dirtRace.add("Bajio Trail");
            dirtRace.add("Cordillera Trail");
            dirtRace.add("Tapalpa Trail");
            dirtRace.add("Fuera del Camino Trail");
            dirtRace.add("Tulum Trail");
            dirtRace.add("Barranca Trail");
            dirtRace.add("The Gauntlet");
        }

        public static String getDirtRace() {
            Random rand = new Random();
            return dirtRace.get(rand.nextInt(dirtRace.size()));
        }
    }

    public static class CrossCountryRace {
        private static List<String> crossCountryRace;

        public CrossCountryRace() {
            crossCountryRace = new ArrayList<>();
            //Cross Country Circuit Races
            crossCountryRace.add("Baja Cross Country Circuit");
            crossCountryRace.add("Costera Cross Country Circuit");
            crossCountryRace.add("Estadio Cross Country Circuit");
            crossCountryRace.add("Urban Cross Country Circuit");
            crossCountryRace.add("Ek' Balam Cross Country Circuit");
            crossCountryRace.add("Herencia Cross Country Circuit");
            crossCountryRace.add("Airfield Cross Country Circuit");

            //Cross Country Races
            crossCountryRace.add("Las Ranas Cross Country");
            crossCountryRace.add("Las Dunas Cross Country");
            crossCountryRace.add("Ribera Rocosa Cross Country");
            crossCountryRace.add("Costa Este Cross Country");
            crossCountryRace.add("El Descenso Cross Country");
            crossCountryRace.add("Oasis Cross Country");
            crossCountryRace.add("Tropico Cross Country");
            crossCountryRace.add("Las Granjas Cross Country");
            crossCountryRace.add("Restos Cross Country");
            crossCountryRace.add("Foto Final Cross Country");
            crossCountryRace.add("Copper Conyon Cross Country");
            crossCountryRace.add("The Titan");
            crossCountryRace.add("Festival Cross Country");
        }

        public static String getCrossCountryRace() {
            Random rand = new Random();
            return crossCountryRace.get(rand.nextInt(crossCountryRace.size()));
        }
    }

    public static class DragRace {
        private static List<String> dragRace;

        public DragRace() {
            dragRace = new ArrayList<>();
            dragRace.add("Festival Drag Strip");
            dragRace.add("Aerodromo Drag Strip");
            dragRace.add("Teotihuacan Drag Strip");
        }

        public static String getDragRace() {
            Random rand = new Random();
            return dragRace.get(rand.nextInt(dragRace.size()));
        }
    }

    public static class StreetRace {
        private static List<String> streetRace;

        public StreetRace() {
            streetRace = new ArrayList<>();
            streetRace.add("El Lago Blanco");
            streetRace.add("Ruta Norte");
            streetRace.add("Festival Gatecrash");
            streetRace.add("Coast Run");
            streetRace.add("Carretera Chase");
            streetRace.add("Costa Rocosa");
            streetRace.add("Horizon Callejera");
            streetRace.add("Hilltop Descent");
            streetRace.add("Jungle Descent");
            streetRace.add("Las Laderas");
            streetRace.add("Granjas de Tapalpa");
            streetRace.add("Wetland Charge");
            streetRace.add("Las Afueras");
            streetRace.add("Cruce del Valle");
            streetRace.add("Tunnel Run");
            streetRace.add("Bosque del Sur");
            streetRace.add("Guanahuato Sur");
            streetRace.add("Highland CLimb");
            streetRace.add("Canon Run");
            streetRace.add("Castillo del Mar");
            streetRace.add("The Marathon");
        }

        public static String getStreetRace() {
            Random rand = new Random();
            return streetRace.get(rand.nextInt(streetRace.size()));
        }
    }
}
