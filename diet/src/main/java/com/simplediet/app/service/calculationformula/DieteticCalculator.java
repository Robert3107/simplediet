package com.simplediet.app.service.calculationformula;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DieteticCalculator {

    public double WHRCalculation(double stomachWaits, double hips) {
        return formatDouble(stomachWaits / hips);
    }

    public double WHtRCalculation(double stomachWaits, double hips) {
        return formatDouble((stomachWaits / hips) * 100);
    }

    public double BMICalculation(double weightInKG, double heightInMeters) {
        return formatDouble(weightInKG / heightInMeters);
    }

    public double BrocFormula(int age) {
        return formatDouble(age - 100);
    }

    public double LorentzFormula(String sex, double heightInCM) {
        double resultLorentzFormula = 0;
        if (Objects.equals(sex, "male")) {
            resultLorentzFormula = heightInCM - 100 - ((heightInCM - 150) / 4);
        } else if (Objects.equals(sex, "female"))
            resultLorentzFormula = heightInCM - 100 - ((heightInCM - 150) / 2);

        return formatDouble(resultLorentzFormula);
    }

    public double PatonFormula(String sex, double heightInCM) {
        double resultPatonFormula = 0;
        if (Objects.equals(sex, "male")) {
            resultPatonFormula = heightInCM - 100 - ((heightInCM - 100) / 20);
        } else if (Objects.equals(sex, "female"))
            resultPatonFormula = heightInCM - 100 - ((heightInCM - 100) / 10);

        return formatDouble(resultPatonFormula);
    }

    public double BMR_MifflinFormula(double weightInKG, double heightInCM, int age, String sex) {
        double resultBMRFormula = 0;
        if (Objects.equals(sex, "male")) {
            resultBMRFormula = (10 * weightInKG) + (6.25 * heightInCM) - (5 * age) + 5;
        } else if (Objects.equals(sex, "female")) {
            resultBMRFormula = (10 * weightInKG) + (6.25 * heightInCM) - (5 * age) - 161;
        }
        return formatDouble(resultBMRFormula);
    }

    public double BMR_HarrisBenedictFormula(double weightInKG, double heightInCM, int age, String sex) {
        double resultHarrisBenedictFormula = 0;
        if (Objects.equals(sex, "male")) {
            resultHarrisBenedictFormula = 66.5 + (13.75 * weightInKG) + (5.003 * heightInCM) - (6.775 * age);
        } else if (Objects.equals(sex, "female")) {
            resultHarrisBenedictFormula = 655.1 + (9.563 * weightInKG) + (1.85 * heightInCM) - (4.676 * age);
        }
        return formatDouble(resultHarrisBenedictFormula);
    }

    public double BRM_CunninghamFormula(String sex, double weightInKG, double heightInCM) {
        return formatDouble(500 + (22 * leanBodyMass(sex, weightInKG, heightInCM)));
    }

    public double BRM_KatchMcArdleFormula(String sex, double weightInKG, double heightInCM) {
        return formatDouble(370 + (21.6 * leanBodyMass(sex, weightInKG, heightInCM)));
    }

    public double leanBodyMass(String sex, double weightInKG, double heightInCM) {
        double resultLeanBodyMass = 0;
        if (Objects.equals(sex, "male")) {
            resultLeanBodyMass = 1.1 * weightInKG - 128 * Math.pow((weightInKG / heightInCM), 2);
        } else if (Objects.equals(sex, "female")) {
            resultLeanBodyMass = 1.07 * weightInKG - 148 * Math.pow((weightInKG / heightInCM), 2);
        }
        return formatDouble(resultLeanBodyMass);
    }

    public double CPM_Formula(String bmrFormula, double physicActivity, double weightInKG, double heightInCM, int age, String sex) {
        double resultCPM = 0;
        if (Objects.equals("mifflin", bmrFormula)) {
            resultCPM = BMR_MifflinFormula(weightInKG, heightInCM, age, sex) * physicActivity;
        } else if (Objects.equals("harris_benedict", bmrFormula)) {
            resultCPM = BMR_HarrisBenedictFormula(weightInKG, heightInCM, age, sex) * physicActivity;
        }
        return formatDouble(resultCPM);
    }

    public double PRAL_Formula(double proteinInGrams, double phosphorusInMg, double potassiumInMg, double magnesiumInMg, double calciumInMg) {
        return (0.49 * proteinInGrams + 0.037 * phosphorusInMg) - (0.021 * potassiumInMg - 0.026 * magnesiumInMg - 0.013 * calciumInMg);
    }

    public double YMCA_Formula(String sex, double waist, double weightInKG) {
        double resultYMCA = 0;
        if (Objects.equals(sex, "male")) {
            resultYMCA = ((1.634 * waist - 0.1804 * weightInKG - 98.42) / 2.2 * weightInKG) * 100;
        } else if (Objects.equals(sex, "female")) {
            resultYMCA = ((1.634 * waist - 0.1804 * weightInKG - 76.76) / 2.2 * weightInKG) * 100;
        }
        return formatDouble(resultYMCA);
    }

    public double formatDouble(double value) {
        BigDecimal bigDecimal = new BigDecimal(value);
        bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    public Map<String, Double> generalCalculation(double stomachWaits,
                                                  double hips,
                                                  double weightInKG,
                                                  double heightInMeters,
                                                  int age,
                                                  String sex,
                                                  double heightInCM,
                                                  String bmrFormula,
                                                  double physicActivity,
                                                  double proteinInGrams,
                                                  double phosphorusInMg,
                                                  double potassiumInMg,
                                                  double magnesiumInMg,
                                                  double calciumInMg,
                                                  double waist) {
        DieteticCalculator dieteticCalculator = new DieteticCalculator();
        Map<String, Double> generalCalculationList = new HashMap<>();
        generalCalculationList.put("WHR", dieteticCalculator.WHRCalculation(stomachWaits, hips));
        generalCalculationList.put("WHTR", dieteticCalculator.WHtRCalculation(stomachWaits, hips));
        generalCalculationList.put("BMI", dieteticCalculator.BMICalculation(weightInKG, heightInMeters));
        generalCalculationList.put("Broc", dieteticCalculator.BrocFormula(age));
        generalCalculationList.put("Lorentz", dieteticCalculator.LorentzFormula(sex, heightInCM));
        generalCalculationList.put("Paton", dieteticCalculator.PatonFormula(sex, heightInCM));
        generalCalculationList.put("BMR_Mifflin", dieteticCalculator.BMR_MifflinFormula(weightInKG, heightInCM, age, sex));
        generalCalculationList.put("BRM_Cunningham", dieteticCalculator.BRM_CunninghamFormula(sex, weightInKG, heightInCM));
        generalCalculationList.put("BRM_KatchMcArdle", dieteticCalculator.BRM_KatchMcArdleFormula(sex, weightInKG, heightInCM));
        generalCalculationList.put("LBM", dieteticCalculator.leanBodyMass(sex, weightInKG, heightInCM));
        generalCalculationList.put("CPM", dieteticCalculator.CPM_Formula(bmrFormula, physicActivity, weightInKG, heightInCM, age, sex));
        generalCalculationList.put("PRAL", dieteticCalculator.PRAL_Formula(proteinInGrams, phosphorusInMg, potassiumInMg, magnesiumInMg, calciumInMg));
        generalCalculationList.put("YMCA", dieteticCalculator.YMCA_Formula(sex, waist, weightInKG));

        return generalCalculationList;
    }

}
