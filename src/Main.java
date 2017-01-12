import org.json.JSONObject;
import jdk.nashorn.internal.parser.JSONParser;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        String planGrupy[][]=new String[5][12];
        ArrayList<GroupPreferredHours>grouppref=new ArrayList<>();
        ArrayList<LecturerPreferredHours>lecturepref=new ArrayList<>();
        ArrayList<RoomPreferences>roompref=new ArrayList<>();
        ArrayList<Room>room=new ArrayList<>();
        ArrayList<Lecturer>lecturer=new ArrayList<>();
        ArrayList<Subject>subject=new ArrayList<>();

        GroupPreferredHours e=new GroupPreferredHours(1,2,3,4);

        if (Parser.parseGroupsprefferedhours("groupsPreferredHours.json", grouppref))
        { System.out.println("Groups imported");}

        else  System.out.println("Error groups");

        if (Parser.parseLecturerpreferredhours("lecturersPreferredHours.json", lecturepref)) {

            System.out.println("Groups imported");}

        else  System.out.println("Error lecturers");

        if (Parser.parseRoompreferrences("roomPreferences.json", roompref)) {

            System.out.println("Groups imported");}

        else  System.out.println("Error rooms");
        if (Parser.parseRoom("roomsJSON.json", room)) {

            System.out.println("Groups imported");}

        else  System.out.println("Error rooms");
        if (Parser.parselecturers("lecturersJSON.json", lecturer)) {

            System.out.println("lecturers imported");}

        else  System.out.println("Error lecturers");
        if (Parser.parseSubject("subjectsJSON.json", subject)) {

            System.out.println("subjects imported");}

        else  System.out.println("Error subject");
        System.out.println("\n\n\n\n\n");


        Displayer.printPreferencesgroomprefer(roompref);
        Displayer.printPreferencesgrouphours(grouppref);
        Displayer.printPreferenceslecturerhours(lecturepref);
        Displayer.printRooms(room);
        Displayer.printlecturers(lecturer);
        Displayer.printSubject(subject);

       if( PlanTrywialny.Plan(subject,lecturer,room,planGrupy))
        {
            System.out.println("Udane ukladanie planu");
        }
        else
           System.out.println("Błąd przy ukladaniu planu");



    }
}
