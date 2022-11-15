package fr.epita.services;

import fr.epita.datamodel.BioStatData;
import fr.epita.datamodel.Person;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVBioStatReader {


    private final File file;

    /*  the csv reader in here reads a csv and creates new Person objects   */
    public CSVBioStatReader(File file)throws FileNotFoundException {
        this.file = file;
    }


    public List<BioStatData> readBioStatData() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(file);
        Scanner scanner = new Scanner(fis);
        scanner.nextLine();/* to skip the first line in the file */

        List<BioStatData> personList = new ArrayList<>();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            readBioStatRecord(line); /* calls the fct readPerson to create a new person from line */
            personList.add(readBioStatRecord(line));/* not sure if this one would work  */
        }
        return personList;
    }
    private BioStatData readBioStatRecord(String record){

        String[] lineParts = record.split(",");/*  */
        BioStatData bioStatData = new BioStatData();
        bioStatData.setSex(lineParts[0]);
        bioStatData.setWeightSeptember(Integer.valueOf(lineParts[1].trim()));

        bioStatData.setBmiSeptember(Double.valueOf(lineParts[3].trim()));
        return bioStatData ;
    }
}
