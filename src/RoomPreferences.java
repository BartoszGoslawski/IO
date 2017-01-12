/**
 * Created by Admin on 2017-01-06.
 */
public class RoomPreferences {

    public

    int lecturer_id;
    int room_number;

    RoomPreferences(int lecturer, int room){
        this.lecturer_id= lecturer;
        this.room_number= room;

    }


   static void printHeader() {
        System.out.println("Lecturer\tRoom\n");
    }

    void printData() {
        System.out.println(lecturer_id+"\t"+room_number);
    }
}
