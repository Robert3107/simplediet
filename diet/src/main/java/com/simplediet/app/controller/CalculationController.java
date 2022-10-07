package com.simplediet.app.controller;

import com.simplediet.app.model.service.CalculationFormula.DieteticCalculator;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/calculation")
public class CalculationController {

    DieteticCalculator dieteticCalculator = new DieteticCalculator();

    @PostMapping("/general")
    public Map<String, Double> generalCalculation(@RequestParam double stomachWaits,
                                                  @RequestParam double hips,
                                                  @RequestParam double weightInKG,
                                                  @RequestParam double heightInMeters,
                                                  @RequestParam int age,
                                                  @RequestParam String sex,
                                                  @RequestParam double heightInCM,
                                                  @RequestParam String bmrFormula,
                                                  @RequestParam double physicActivity,
                                                  @RequestParam double proteinInGrams,
                                                  @RequestParam double phosphorusInMg,
                                                  @RequestParam double potassiumInMg,
                                                  @RequestParam double magnesiumInMg,
                                                  @RequestParam double calciumInMg,
                                                  @RequestParam double waist) {
        return dieteticCalculator.generalCalculation(stomachWaits,
                hips,
                weightInKG,
                heightInMeters,
                age,
                sex,
                heightInCM,
                bmrFormula,
                physicActivity,
                proteinInGrams,
                phosphorusInMg,
                potassiumInMg,
                magnesiumInMg,
                calciumInMg,
                waist);
    }

    @PostMapping("/whr")
    public String calculationWHR(@RequestParam double stomachWaits, @RequestParam double hips) {
        return String.valueOf(dieteticCalculator.WHRCalculation(stomachWaits, hips));
    }

    @PostMapping("/whtr")
    public String calculationWHtR(@RequestParam double stomachWaits, @RequestParam double hips) {
        return String.valueOf(dieteticCalculator.WHtRCalculation(stomachWaits, hips));
    }

    @PostMapping("/bmi")
    public String CalculationBMI(@RequestParam double weightInKG, @RequestParam double heightInMeters) {
        return String.valueOf(dieteticCalculator.BMICalculation(weightInKG, heightInMeters));
    }

    @PostMapping("/broc")
    public String calculationBrocFormula(@RequestParam int age) {
        return String.valueOf(dieteticCalculator.BrocFormula(age));
    }

    @PostMapping("/lorentz")
    public String calculationLorentzFormula(@RequestParam String sex, @RequestParam double heightInCM) {
        return String.valueOf(dieteticCalculator.LorentzFormula(sex, heightInCM));
    }

    @PostMapping("/paton")
    public String calculationPatonFormula(@RequestParam String sex, @RequestParam double heightInCM) {
        return String.valueOf(dieteticCalculator.PatonFormula(sex, heightInCM));
    }

    @PostMapping("/mifflin")
    public String calculationBMR_MifflinFormula(@RequestParam double weightInKG,
                                                @RequestParam double heightInCM,
                                                @RequestParam int age,
                                                @RequestParam String sex) {
        return String.valueOf(dieteticCalculator.BMR_MifflinFormula(weightInKG, heightInCM, age, sex));
    }

    @PostMapping("/harris-benedict")
    public String calculationBMR_HarrisBenedictFormula(@RequestParam double weightInKG,
                                                       @RequestParam double heightInCM,
                                                       @RequestParam int age,
                                                       @RequestParam String sex) {
        return String.valueOf(dieteticCalculator.BMR_HarrisBenedictFormula(weightInKG, heightInCM, age, sex));
    }

    @PostMapping("/cunningham")
    public String calculationBRM_CunninghamFormula(@RequestParam String sex,
                                                   @RequestParam double weightInKG,
                                                   @RequestParam double heightInCM) {
        return String.valueOf(dieteticCalculator.BRM_CunninghamFormula(sex, heightInCM, weightInKG));
    }

    @PostMapping("/mcardle")
    public String calculationBRM_KatchMcArdleFormula(@RequestParam String sex,
                                                     @RequestParam double weightInKG,
                                                     @RequestParam double heightInCM) {
        return String.valueOf(dieteticCalculator.BRM_KatchMcArdleFormula(sex, heightInCM, weightInKG));
    }

    @PostMapping("/lbm")
    public String calculationleanBodyMass(@RequestParam String sex,
                                          @RequestParam double weightInKG,
                                          @RequestParam double heightInCM) {
        return String.valueOf(dieteticCalculator.leanBodyMass(sex, heightInCM, weightInKG));
    }

    @PostMapping("/cpm")
    public String calculationCPM_Formula(@RequestParam String bmrFormula,
                                         @RequestParam double physicActivity,
                                         @RequestParam double weightInKG,
                                         @RequestParam double heightInCM,
                                         @RequestParam int age,
                                         @RequestParam String sex) {
        return String.valueOf(dieteticCalculator.CPM_Formula(bmrFormula, physicActivity, weightInKG, heightInCM, age, sex));
    }

    @PostMapping("/pral")
    public String calculationPRAL_Formula(@RequestParam double proteinInGrams,
                                          @RequestParam double phosphorusInMg,
                                          @RequestParam double potassiumInMg,
                                          @RequestParam double magnesiumInMg,
                                          @RequestParam double calciumInMg) {
        return String.valueOf(dieteticCalculator.PRAL_Formula(proteinInGrams, phosphorusInMg, potassiumInMg, magnesiumInMg, calciumInMg));
    }

    @PostMapping("/ymca")
    public String calculationYMCA_Formula(@RequestParam String sex,
                                          @RequestParam double waist,
                                          @RequestParam double weightInKG) {
        return String.valueOf(dieteticCalculator.YMCA_Formula(sex, waist, weightInKG));
    }
}
