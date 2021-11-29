package com.example.forzaraceselector;

import com.example.forzaraceselector.Lists.CarType;
import com.example.forzaraceselector.Lists.RaceType;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import java.util.List;

public class Controller {
    private RaceType raceType;
    private RaceType.RoadRace roadRace;
    private RaceType.DirtRace dirtRace;
    private RaceType.CrossCountryRace crossCountryRace;
    private RaceType.DragRace dragRace;
    private RaceType.StreetRace streetRace;

    private CarType carType;
    private CarType.PerformanceClass performance;
    private CarType.TuneType tune;

    @FXML
    private Label raceText;
    @FXML
    private Label carText;
    @FXML
    private Label performanceText;
    @FXML
    private Label tuneText;

    @FXML
    private CheckBox roadRaceCheckBox ;
    @FXML
    private CheckBox dirtRaceCheckBox ;
    @FXML
    private CheckBox crossCountryRaceCheckBox ;
    @FXML
    private CheckBox dragRaceCheckBox ;
    @FXML
    private CheckBox streetRaceCheckBox ;

    @FXML
    protected void onSelectButtonClick() {
        raceType = new RaceType();
        roadRace = new RaceType.RoadRace();
        dirtRace = new RaceType.DirtRace();
        crossCountryRace = new RaceType.CrossCountryRace();
        dragRace = new RaceType.DragRace();
        streetRace = new RaceType.StreetRace();
        
        carType = new CarType();
        performance = new CarType.PerformanceClass();
        tune = new CarType.TuneType();

        String raceType = RaceType.getRaceType();
        String roadRace = RaceType.RoadRace.getRoadRace();
        String dirtRace = RaceType.DirtRace.getDirtRace();
        String crossCountryRace = RaceType.CrossCountryRace.getCrossCountryRace();
        String dragRace = RaceType.DragRace.getDragRace();
        String streetRace = RaceType.StreetRace.getStreetRace();

        String carType = CarType.getCarType();
        String performance = CarType.PerformanceClass.getPerformanceClass();
        String tune = CarType.TuneType.getTuneType();

        if (raceType.matches("Road Race") && roadRaceCheckBox.isSelected()) {
            raceText.setText("Road Race: " + roadRace);
        } else if (raceType.matches("Dirt Race") && dirtRaceCheckBox.isSelected()) {
            raceText.setText("Dirt Race: " + dirtRace);
        } else if (raceType.matches("Cross Country Race") && crossCountryRaceCheckBox.isSelected()) {
            raceText.setText("Cross Country Race: " + crossCountryRace);
        } else if (raceType.matches("Drag Race") && dragRaceCheckBox.isSelected()) {
            raceText.setText("Drag Race: " + dragRace);
        } else if (raceType.matches("Street Race") && streetRaceCheckBox.isSelected()) {
            raceText.setText("Street Race: " + streetRace);
        }
        carText.setText("Car Type: " + carType);
        performanceText.setText("Performance Class: " + performance);
        tuneText.setText("Tune Type: " + tune);
    }
}