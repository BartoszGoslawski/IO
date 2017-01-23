import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Before;
import org.junit.Test;

import java.io.FileReader;

import static org.junit.Assert.*;

/**
 * Created by Grzegorz on 2017-01-23.
 */
public class ParserTest {

    //Test odpowiedzialny za poprawne wczytywanie preferencji grup z pliku JSON
    @Test
    public void parseGroupsprefferedhours() throws Exception {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("groupsPreferredHours.json"));
        assertNotNull(object);
        System.out.println("Wczytywanie preferencji grup przetestowane");
    }

    //Test odpowiedzialny za poprawne wczytywanie preferencji prowadzących z pliku JSON
    @Test
    public void parseLecturerpreferredhours() throws Exception {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("lecturersPreferredHours.json"));
        assertNotNull(object);
        System.out.println("Wczytywanie preferencji prowadzących przetestowane");
    }

    //Test odpowiedzialny za poprawne wczytywanie preferencji sal z pliku JSON
    @Test
    public void parseRoompreferrences() throws Exception {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("roomPreferences.json"));
        assertNotNull(object);
        System.out.println("Wczytywanie preferencji sal przetestowane");
    }

    //Test odpowiedzialny za poprawne wczytywanie sal z pliku JSON
    @Test
    public void parseRoom() throws Exception {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("roomsJSON.json"));
        assertNotNull(object);
        System.out.println("Wczytywanie danych o salach przetestowane");
    }

    //Test odpowiedzialny za poprawność indeksowania sal z pliku JSON
    @Test
    public void test_IDparseRoom() throws Exception {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("roomsJSON.json"));
        org.json.simple.JSONArray array = (org.json.simple.JSONArray)object;
        String pom;
        for(int i = 0; i < array.size(); i++) {
            Room actual = new Room(0, 0, 0);
            JSONObject obj2 = (JSONObject) array.get(i);
            pom = obj2.get("id").toString();
            actual.id = (int) Double.parseDouble(pom);

            assertEquals(i+1 , actual.id);
        }
        System.out.println("Indeksy sal przetestowane");
    }

    //Test odpowiedzialny za poprawne wczytywanie prowadzących z pliku JSON
    @Test
    public void parselecturers() throws Exception {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("lecturersJSON.json"));
        assertNotNull(object);
        System.out.println("Wczytywanie danych o prowadzących przetestowane");
    }

    //Test odpowiedzialny za poprawność indeksowania prowadzących z pliku JSON
    @Test
    public void test_IDparselecturers() throws Exception {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("lecturersJSON.json"));
        org.json.simple.JSONArray array = (org.json.simple.JSONArray)object;
        String pom;
        for(int i = 0; i < array.size(); i++) {
            Lecturer actual = new Lecturer();
            JSONObject obj2 = (JSONObject) array.get(i);
            pom = obj2.get("id").toString();
            actual.id = (int) Double.parseDouble(pom);

            assertEquals(i+1 , actual.id);
        }
        System.out.println("Indeksy prowadzacych przetestowane");
    }

    //Test odpowiedzialny za poprawne wczytywanie przedmiotów z pliku JSON
    @Test
    public void parseSubject() throws Exception {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("subjectsJSON.json"));
        assertNotNull(object);
        System.out.println("Wczytywanie danych o przedmiotach przetestowane");
    }

    //Test odpowiedzialny za poprawość indeksowania przedmiotów z pliku JSON
    @Test
    public void test_IDparseSubject() throws Exception {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("subjectsJSON.json"));
        org.json.simple.JSONArray array = (org.json.simple.JSONArray)object;
        String pom;
        for(int i = 0; i < array.size(); i++) {
            Subject actual = new Subject();
            JSONObject obj2 = (JSONObject) array.get(i);
            pom = obj2.get("id").toString();
            actual.id = (int) Double.parseDouble(pom);

            assertEquals(i+1 , actual.id);
        }
        System.out.println("Indeksy przedmiotów przetestowane");
    }


}