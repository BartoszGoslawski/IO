/**
 * Created by Admin on 2017-01-06.
 */
public class GroupPreferredHours {
    public
    int group_id;
    int day_id;
    int hour_id;
    int count;

    GroupPreferredHours(int group, int day, int hour, int count){

    this.group_id=group;
    this.day_id=day;
    this.hour_id=hour;
    this.count=count;

    }

     static void printHeader(){
         System.out.println(" Group\t  Day\t  Hour\t  Count\n");

     }
    void printData() {
        System.out.println(group_id +"\t   "+day_id +"\t   "+ hour_id+"\t   "+count);
    }

}
