import jdk.nashorn.internal.parser.JSONParser;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Admin on 2017-01-06.
 */



public class Displayer {

   static  void printPreferencesgrouphours(ArrayList<GroupPreferredHours> preferrences)
    {if (!preferrences.isEmpty()) {


    GroupPreferredHours.printHeader();
    for (int io=0;io<preferrences.size();io++) {
        preferrences.get(io).printData();
    }
    }
    else  System.out.println("There is no preferences. Try to import them first");

    }



  static  void printPreferenceslecturerhours(ArrayList<LecturerPreferredHours> preferrences)
    {if (!preferrences.isEmpty()) {


        LecturerPreferredHours.printHeader();
        for (int ip=0;ip<preferrences.size();ip++) {
            preferrences.get(ip).printData();
        }
    }
    else  System.out.println("There is no preferences. Try to import them first");

    }
   static void printPreferencesgroomprefer(ArrayList<RoomPreferences> preferrences)
    {if (!preferrences.isEmpty()) {


        RoomPreferences.printHeader();
        for (int ii=0;ii<preferrences.size();ii++) {
            preferrences.get(ii).printData();
        }
    }
    else  System.out.println("There is no preferences. Try to import them first");

    }
    static void printRooms(ArrayList<Room> preferrences)
    {if (!preferrences.isEmpty()) {


        Room.printHeader();
        for (int ii=0;ii<preferrences.size();ii++) {
            preferrences.get(ii).printData();
        }
    }
    else  System.out.println("There is no preferences. Try to import them first");

    }
    static void printlecturers(ArrayList<Lecturer> preferrences)
    {if (!preferrences.isEmpty()) {


        Lecturer.printHeader();
        for (int ii=0;ii<preferrences.size();ii++) {
            preferrences.get(ii).printData();
        }
    }
    else  System.out.println("There is no preferences. Try to import them first");

    }
    static void printSubject(ArrayList<Subject> preferrences)
    {if (!preferrences.isEmpty()) {


        Subject.printHeader();
        for (int ii=0;ii<preferrences.size();ii++) {
            preferrences.get(ii).printData();
        }
    }
    else  System.out.println("There is no preferences. Try to import them first");

    }
}
