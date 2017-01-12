


import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
/**
 * Created by Admin on 2017-01-06.
 */
public class Parser {


    public


//static JSONParser parser=new JSONParser();


    /*static bool parseGroups(std::string filename, std::vector<GroupPreferredHours> & groupPrefHours);
    static bool parseLecturers(std::string filename, std::vector<LecturerPreferredHours> & lecturerPrefHours);
    static bool parseRooms(std::string filename, std::vector<RoomPreferences> & roomPref);*/

 static Boolean parseGroupsprefferedhours(String filename, ArrayList<GroupPreferredHours> preferrence){
        String pom;
        try {
            JSONParser parser=new JSONParser();



            Object obj=parser.parse(new FileReader(filename));


            JSONArray array = (JSONArray)obj;
            System.out.print(array.get(0));
            System.out.println();
            GroupPreferredHours.printHeader();
            int pomint=array.size();
            System.out.print(pomint+"\n");
            for(int i=0;i<pomint;i++) {
                GroupPreferredHours rp = new GroupPreferredHours(0,0,0,0);
                JSONObject obj2 = (JSONObject) array.get(i);

                pom=obj2.get("group_id").toString();
                rp.group_id=(int)Double.parseDouble(pom);
                pom=obj2.get("day_id").toString();
                rp.day_id=(int)Double.parseDouble(pom);
                pom=obj2.get("hour_id").toString();
                rp.hour_id=(int)Double.parseDouble(pom);
                pom=obj2.get("count").toString();
                rp.count=(int)Double.parseDouble(pom);
                preferrence.add(i,rp);
              //  rp.printData();
            }

            return true;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }


    }

    static Boolean parseLecturerpreferredhours(String filename, ArrayList<LecturerPreferredHours> preferrence){
        String pom;
        try {
            JSONParser parser=new JSONParser();



            Object obj=parser.parse(new FileReader(filename));


            JSONArray array = (JSONArray)obj;
            System.out.print(array.get(0));
            System.out.println();
            LecturerPreferredHours.printHeader();
            for(int i=0;i<array.size();i++) {
                LecturerPreferredHours rp = new LecturerPreferredHours(0,0,0,0);
                JSONObject obj2 = (JSONObject) array.get(i);

                pom=obj2.get("lecturer_id").toString();
                rp.lecturer_id=(int)Double.parseDouble(pom);
                pom=obj2.get("day_id").toString();
                rp.day_id=(int)Double.parseDouble(pom);
                pom=obj2.get("hour_id").toString();
                rp.hour_id=(int)Double.parseDouble(pom);
                pom=obj2.get("count").toString();
                rp.count=(int)Double.parseDouble(pom);
                preferrence.add(i,rp);
               // rp.printData();
            }
            return true;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }




    }


    static Boolean parseRoompreferrences(String filename, ArrayList<RoomPreferences> preferrence) {
String pom;
        try {
    JSONParser parser=new JSONParser();



            Object obj=parser.parse(new FileReader(filename));


            JSONArray array = (JSONArray)obj;
            System.out.print(array.get(0));
System.out.println();
            RoomPreferences.printHeader();
for(int i=0;i<array.size();i++) {
    RoomPreferences rp = new RoomPreferences(0,0);
    JSONObject obj2 = (JSONObject) array.get(i);

    pom=obj2.get("room_number").toString();
    rp.room_number=(int)Double.parseDouble(pom);
    pom=obj2.get("lecturer_id").toString();
    rp.lecturer_id=(int)Double.parseDouble(pom);
    preferrence.add(i,rp);
   // preferrence.get(i).printData();

}
            return true;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }




    }
    static Boolean parseRoom(String filename, ArrayList<Room> preferrence) {
        String pom;
        try {
            JSONParser parser=new JSONParser();



            Object obj=parser.parse(new FileReader(filename));


            JSONArray array = (JSONArray)obj;
            System.out.print(array.get(0));
            System.out.println();
            Room.printHeader();
            for(int i=0;i<array.size();i++) {
                Room rp = new Room(0,0,0);
                JSONObject obj2 = (JSONObject) array.get(i);

                pom=obj2.get("number").toString();
                rp.roomNumber=(int)Double.parseDouble(pom);
                pom=obj2.get("id").toString();
                rp.id=(int)Double.parseDouble(pom);
                pom=obj2.get("roomType").toString();
                rp.roomType=(int)Double.parseDouble(pom);
                preferrence.add(i,rp);
                // preferrence.get(i).printData();

            }
            return true;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }




    }

    static Boolean parselecturers(String filename, ArrayList<Lecturer> preferrence) {
        String pom;
        try {
            JSONParser parser=new JSONParser();



            Object obj=parser.parse(new FileReader(filename));


            JSONArray array = (JSONArray)obj;
            System.out.print(array.get(0));
            System.out.println();
            Room.printHeader();
            Character prz=new Character(',');
            for(int i=0;i<array.size();i++) {
                Lecturer rp = new Lecturer();
                JSONObject obj2 = (JSONObject) array.get(i);

                pom=obj2.get("id").toString();
                rp.id=(int)Double.parseDouble(pom);
                pom=obj2.get("name").toString();
                rp.name=pom;
                pom=obj2.get("subjects").toString();
                for(int ch=1;ch<pom.length()-1;ch++) {
                    Character h=pom.charAt(ch);

                    if(!h.equals(prz)){
                        System.out.print(h);
                        rp.subjects.add(Character.getNumericValue(h));
                    }
                }

                preferrence.add(i,rp);
                // preferrence.get(i).printData();

            }
            return true;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }




    }
    static Boolean parseSubject(String filename, ArrayList<Subject> preferrence) {
        String pom;
        try {
            JSONParser parser=new JSONParser();



            Object obj=parser.parse(new FileReader(filename));


            JSONArray array = (JSONArray)obj;
            System.out.print(array.get(0));
            System.out.println();
            Room.printHeader();
            Character prz=new Character(',');
            for(int i=0;i<array.size();i++) {
                Subject rp = new Subject();
                JSONObject obj2 = (JSONObject) array.get(i);

                pom=obj2.get("id").toString();
                rp.id=(int)Double.parseDouble(pom);
                pom=obj2.get("name").toString();
                rp.name=pom;
                pom=obj2.get("roomType").toString();
                rp.roomType=(int)Double.parseDouble(pom);
                pom=obj2.get("lecturers").toString();
                for(int ch=1;ch<pom.length()-1;ch++) {
                    Character h=pom.charAt(ch);

                    if(!h.equals(prz)){
                        System.out.print(h);
                        rp.lecturers.add(Character.getNumericValue(h));
                    }
                }

                preferrence.add(i,rp);
                // preferrence.get(i).printData();

            }
            return true;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }




    }


}
