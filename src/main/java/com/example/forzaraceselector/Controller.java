package com.example.forzaraceselector;

import com.example.forzaraceselector.Lists.CarType;
import com.example.forzaraceselector.Lists.RaceType;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
    private Label raceTypeText, raceText, carTypeText, carText, performanceClassText, performanceText, tuneTypeText, tuneText;

    @FXML
    private CheckBox roadRaceCheckBox, dirtRaceCheckBox, crossCountryRaceCheckBox, dragRaceCheckBox, streetRaceCheckBox ;

    @FXML
    private CheckBox modernSupercarCheckBox, retroSupercarCheckBox, hypercarCheckBox, retroSaloonCheckBox, vanUtilityCheckBox, retroSportsCarCheckBox, modernSportsCarCheckBox,
            superSaloonCheckBox, classicRacerCheckBox, cultCarCheckBox, rareClassicCheckBox, hotHatchCheckBox, retroHotHatchCheckBox, superHotHatchCheckBox, extremeTrackToyCheckBox,
            classicMuscleCheckBox, rodCustomCheckBox, retroMuscleCheckBox, modernMuscleCheckBox, retroRallyCheckBox, classicRallyCheckBox, rallyMonsterCheckBox, modernRallyCheckBox,
            gtCarCheckBox, superGTCheckBox, unlimitedOffroadCheckBox, sportsUtilityHeroCheckBox, offroadCheckBox, unlimitedBuggyCheckBox, classicSportsCarCheckBox, trackToyCheckBox,
            vintageRacerCheckBox, truckCheckBox, buggyCheckBox, driftCarCheckBox, pickup4x4CheckBox, utvCheckBox ;

    @FXML
    private CheckBox dCheckBox, cCheckBox, bCheckBox, aCheckBox, s1CheckBox, s2CheckBox, xCheckBox, openCheckBox ;

    @FXML
    private CheckBox raceCheckBox, driftCheckBox, rallyCheckBox, offroadTuneCheckBox, dragCheckBox ;

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

        String roadRace = RaceType.RoadRace.getRoadRace();
        String dirtRace = RaceType.DirtRace.getDirtRace();
        String crossCountryRace = RaceType.CrossCountryRace.getCrossCountryRace();
        String dragRace = RaceType.DragRace.getDragRace();
        String streetRace = RaceType.StreetRace.getStreetRace();

        String type = selector(configureRaceTypeCheckBox());
        if (type.matches("Road Race")) {
            raceTypeText.setText("Road Race");
            raceText.setText(roadRace);
        } else if (type.matches("Dirt Race")) {
            raceTypeText.setText("Dirt Race");
            raceText.setText(dirtRace);
        } else if (type.matches("Cross Country Race")) {
            raceTypeText.setText("Cross Country Race");
            raceText.setText(crossCountryRace);
        } else if (type.matches("Drag Race")) {
            raceTypeText.setText("Drag Race");
            raceText.setText(dragRace);
        } else if (type.matches("Street Race")) {
            raceTypeText.setText("Street Race");
            raceText.setText(streetRace);
        }
        carTypeText.setText("Car Type");
        carText.setText(selector(configureCarTypeCheckBox()));
        performanceClassText.setText("Performance Class");
        performanceText.setText(selector(configurePerformanceCheckBox()));
        tuneTypeText.setText("Tune Type");
        tuneText.setText(selector(configureTuneCheckBox()));
    }

    private List<String> configureRaceTypeCheckBox() {
        List<String> list = new ArrayList<>();
        List<String> raceType = RaceType.getRaceType();
        List<CheckBox> raceTypeCheckBox = new ArrayList<>();
        raceTypeCheckBox.add(roadRaceCheckBox);
        raceTypeCheckBox.add(dirtRaceCheckBox);
        raceTypeCheckBox.add(crossCountryRaceCheckBox);
        raceTypeCheckBox.add(dragRaceCheckBox);
        raceTypeCheckBox.add(streetRaceCheckBox);

        for (int i = 0; i < raceTypeCheckBox.size(); i++) {
            if (raceTypeCheckBox.get(i).isSelected()) {
                list.add(raceType.get(i));
            }
        }
        return list;
    }

    private List<String> configureCarTypeCheckBox() {
        List<String> list = new ArrayList<>();
        List<String> carType = CarType.getCarType();
        List<CheckBox> carTypeCheckBox = new ArrayList<>();
        carTypeCheckBox.add(modernSupercarCheckBox);
        carTypeCheckBox.add(retroSupercarCheckBox);
        carTypeCheckBox.add(hypercarCheckBox);
        carTypeCheckBox.add(retroSaloonCheckBox);
        carTypeCheckBox.add(vanUtilityCheckBox);
        carTypeCheckBox.add(retroSportsCarCheckBox);
        carTypeCheckBox.add(modernSportsCarCheckBox);
        carTypeCheckBox.add(superSaloonCheckBox);
        carTypeCheckBox.add(classicRacerCheckBox);
        carTypeCheckBox.add(cultCarCheckBox);
        carTypeCheckBox.add(rareClassicCheckBox);
        carTypeCheckBox.add(hotHatchCheckBox);
        carTypeCheckBox.add(retroHotHatchCheckBox);
        carTypeCheckBox.add(superHotHatchCheckBox);
        carTypeCheckBox.add(extremeTrackToyCheckBox);
        carTypeCheckBox.add(classicMuscleCheckBox);
        carTypeCheckBox.add(rodCustomCheckBox);
        carTypeCheckBox.add(retroMuscleCheckBox);
        carTypeCheckBox.add(modernMuscleCheckBox);
        carTypeCheckBox.add(retroRallyCheckBox);
        carTypeCheckBox.add(classicRallyCheckBox);
        carTypeCheckBox.add(rallyMonsterCheckBox);
        carTypeCheckBox.add(modernRallyCheckBox);
        carTypeCheckBox.add(gtCarCheckBox);
        carTypeCheckBox.add(superGTCheckBox);
        carTypeCheckBox.add(unlimitedOffroadCheckBox);
        carTypeCheckBox.add(sportsUtilityHeroCheckBox);
        carTypeCheckBox.add(offroadCheckBox);
        carTypeCheckBox.add(unlimitedBuggyCheckBox);
        carTypeCheckBox.add(classicSportsCarCheckBox);
        carTypeCheckBox.add(trackToyCheckBox);
        carTypeCheckBox.add(vintageRacerCheckBox);
        carTypeCheckBox.add(truckCheckBox);
        carTypeCheckBox.add(buggyCheckBox);
        carTypeCheckBox.add(driftCarCheckBox);
        carTypeCheckBox.add(pickup4x4CheckBox);
        carTypeCheckBox.add(utvCheckBox);

        for (int i = 0; i < carTypeCheckBox.size(); i++) {
            if (carTypeCheckBox.get(i).isSelected()) {
                list.add(carType.get(i));
            }
        }
        return list;
    }

    private List<String> configurePerformanceCheckBox() {
        List<String> list = new ArrayList<>();
        List<String> performance = CarType.PerformanceClass.getPerformance();
        List<CheckBox> performanceCheckBox = new ArrayList<>();
        performanceCheckBox.add(dCheckBox);
        performanceCheckBox.add(cCheckBox);
        performanceCheckBox.add(bCheckBox);
        performanceCheckBox.add(aCheckBox);
        performanceCheckBox.add(s1CheckBox);
        performanceCheckBox.add(s2CheckBox);
        performanceCheckBox.add(xCheckBox);
        performanceCheckBox.add(openCheckBox);

        for (int i = 0; i < performanceCheckBox.size(); i++) {
            if (performanceCheckBox.get(i).isSelected()) {
                list.add(performance.get(i));
            }
        }
        return list;
    }

    private List<String> configureTuneCheckBox() {
        List<String> list = new ArrayList<>();
        List<String> tune = CarType.TuneType.getTuneType();
        List<CheckBox> tuneCheckBox = new ArrayList<>();
        tuneCheckBox.add(raceCheckBox);
        tuneCheckBox.add(driftCheckBox);
        tuneCheckBox.add(rallyCheckBox);
        tuneCheckBox.add(offroadTuneCheckBox);
        tuneCheckBox.add(dragCheckBox);

        for (int i = 0; i < tuneCheckBox.size(); i++) {
            if (tuneCheckBox.get(i).isSelected()) {
                list.add(tune.get(i));
            }
        }
        return list;
    }

    private String selector(List<String> list) {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}