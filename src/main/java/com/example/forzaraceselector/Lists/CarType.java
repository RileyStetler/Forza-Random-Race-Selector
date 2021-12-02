package com.example.forzaraceselector.Lists;

import java.util.ArrayList;
import java.util.List;

public class CarType {
    private static List<String> carType;

    public CarType() {
        carType = new ArrayList<>();
        carType.add("Modern Supercars");
        carType.add("Retro Supercars");
        carType.add("Hypercars");
        carType.add("Retro Saloons");
        carType.add("Vans and Utility");
        carType.add("Retro Sports Cars");
        carType.add("Modern Sports Cars");
        carType.add("Super Saloons");
        carType.add("Classic Racers");
        carType.add("Cult Cars");
        carType.add("Rare Classics");
        carType.add("Hot Hatch");
        carType.add("Retro Hot Hatch");
        carType.add("Super Hot Hatch");
        carType.add("Extreme Track Toys");
        carType.add("Classic Muscle");
        carType.add("Rods and Customs");
        carType.add("Retro Muscle");
        carType.add("Modern Muscle");
        carType.add("Retro Rally");
        carType.add("Classic Rally");
        carType.add("Rally Monsters");
        carType.add("Modern Rally");
        carType.add("GT Cars");
        carType.add("Super GT");
        carType.add("Unlimited Offroad");
        carType.add("Sports Utility Heroes");
        carType.add("Offroad");
        carType.add("Unlimited Buggies");
        carType.add("Classic Sports Cars");
        carType.add("Track Toys");
        carType.add("Vintage Racers");
        carType.add("Trucks");
        carType.add("Buggies");
        carType.add("Drift Cars");
        carType.add("Pickups & 4x4's");
        carType.add("UTV's");
    }

    public static List<String> getCarType() {
        return carType;
    }

    public static class PerformanceClass {
        private static List<String> performance;

        public PerformanceClass() {
            performance = new ArrayList<>();
            performance.add("D");
            performance.add("C");
            performance.add("B");
            performance.add("A");
            performance.add("S1");
            performance.add("S2");
            performance.add("X");
            performance.add("Open");
        }

        public static List<String> getPerformance() {
            return performance;
        }
    }

    public static class TuneType {
        private static List<String> tune;

        public TuneType() {
            tune = new ArrayList<>();
            tune.add("Race");
            tune.add("Drift");
            tune.add("Rally");
            tune.add("Offroad");
            tune.add("Drag");
        }

        public static List<String> getTuneType() {
            return tune;
        }
    }
}
