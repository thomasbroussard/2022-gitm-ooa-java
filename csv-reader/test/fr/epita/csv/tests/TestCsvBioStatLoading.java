package fr.epita.csv.tests;

import fr.epita.datamodel.BioStatData;
import fr.epita.datamodel.Person;
import fr.epita.services.CSVBioStatReader;
import fr.epita.services.CSVReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.List;
import java.util.OptionalDouble;

public class TestCsvBioStatLoading {

    public static void main(String[] args) throws FileNotFoundException {
        //
        CSVBioStatReader reader = new CSVBioStatReader(new File("freshman_kgs.csv"));
        List<BioStatData> bioStatDataList = reader.readBioStatData();
        System.out.println(bioStatDataList);

        int total = 0;
        for (BioStatData bioStatData : bioStatDataList){
            Integer weightSeptember = bioStatData.getWeightSeptember();
            total = total + weightSeptember;
        }
        Double average = (double) (total / bioStatDataList.size());
        System.out.println(average);

        Double average2 = bioStatDataList.stream()
                .mapToInt(BioStatData::getWeightSeptember)
                .average()
                .getAsDouble();
        //majority gender?
        //entry with max bmi in april
        System.out.println(average2);

    }
}
