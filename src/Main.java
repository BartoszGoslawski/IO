import org.json.JSONObject;
import jdk.nashorn.internal.parser.JSONParser;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {


        PlanGrupy[][][] planGrupy = new PlanGrupy[4][5][12]; // ilosc grup, dni, godziny
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


        planGrupy = PlanTrywialny.Plan(subject,lecturer,room);


        for (int i = 0; i < 4; ++i) {
            System.out.println("Plan Grupy " + i+1);
            for (int j = 0; j < 12; j++) {  //for po tablicy ilosc godizn w dniu
                for (int k = 0; k < 5; k++) { //ilosc dni
                    planGrupy[i][k][j].Print(); // grupa, dni, godziny
                    System.out.print("\t\t");
                }
                System.out.println();
            }
        }

        Parser.exportScheduleToJSON(planGrupy);

    }
}
