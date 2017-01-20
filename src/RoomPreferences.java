/**
 * Created by Admin on 2017-01-06.
 */
public class RoomPreferences {

    public

    int lecturer_id;
    int id;

    RoomPreferences(int lecturer, int room){
        this.lecturer_id = lecturer;
        this.id = room;

    }


   static void printHeader() {
        System.out.println("Lecturer\tRoom\n");
    }

    void printData() {
        System.out.println(lecturer_id+"\t"+id);
    }
}
