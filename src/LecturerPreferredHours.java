/**
 * Created by Admin on 2017-01-06.
 */
public class LecturerPreferredHours {
    public
    int lecturer_id;
    int day_id;
    int hour_id;
    int count;

    LecturerPreferredHours(int lecturer, int day, int hour, int count){
this.lecturer_id=lecturer;
this.day_id=day;
this.hour_id=hour;
this.count=count;
    }

   static void printHeader(){
        System.out.println("Lecturer\tDay\tHour\tCount\n");
    }
    void printData(){
    System.out.println(lecturer_id+"\t   "+day_id+"\t   "+hour_id+"\t   "+count);
    }
}
