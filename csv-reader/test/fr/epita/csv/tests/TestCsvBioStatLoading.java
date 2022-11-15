package fr.epita.csv.tests;

import fr.epita.datamodel.BioStatData;
import fr.epita.datamodel.Person;
import fr.epita.services.CSVBioStatReader;
import fr.epita.services.CSVReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class TestCsvBioStatLoading {

    public static void main(String[] args) throws FileNotFoundException {
        //
        CSVBioStatReader reader = new CSVBioStatReader(new File("freshman_kgs.csv"));
        List<BioStatData> bioStatData = reader.readBioStatData();
        System.out.println(bioStatData);


    }
}
