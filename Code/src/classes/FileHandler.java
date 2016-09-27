package classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by dylanaird on 25/09/2016.
 */
public class FileHandler {
    private HashMap<String, Person> peopleMap = new HashMap<>();

    //collection of attribute pairs the above might have
    private ArrayList<AttributePair> attributePairs = new ArrayList<>();

    public FileHandler(){}

    public HashMap<String, Person> getPeopleMap() {
        return peopleMap;
    }

    public void setPeopleMap(HashMap<String, Person> peopleMap) {
        this.peopleMap = peopleMap;
    }

    public ArrayList<AttributePair> getAttributePairs() {
        return attributePairs;
    }

    public void setAttributePairs(ArrayList<AttributePair> attributePairs) {
        this.attributePairs = attributePairs;
    }

    public void parseFile(String fileName) throws IOException {


        BufferedReader br = new BufferedReader(new java.io.FileReader(fileName));
        String buffer;

        Person person = null;

        while ((buffer = br.readLine()) != null) {
            String[] lineArray = buffer.split("\\s");


            if (lineArray.length == 1) {

                if (lineArray[0].toCharArray().length > 1) {
                    person = new Person(lineArray[0]);

                } else if(person!= null) {
                    peopleMap.put(person.getPlayerName(), person);
                }

            } else if (lineArray.length == 2 && person != null) {// load player attributes.
                person.addattributePair(new AttributePair(lineArray[0], lineArray[1]));
            } else {//load attributes
                for (int i = 1; i < lineArray.length; i++) {
                    attributePairs.add(new AttributePair(lineArray[0], lineArray[i]));
                }
            }
        }
        peopleMap.put(person.getPlayerName(), person);
        br.close();
    }

}