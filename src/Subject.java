import java.util.ArrayList;

/**
 * Created by Admin on 2017-01-07.
 */
public class Subject {
     String name;
     ArrayList<Integer> lecturers=new ArrayList();
     int roomType;
    int id;
    int subjecttype;
     Subject(String name,ArrayList<Integer> lecturers,int roomType,int id){
         this.name=name;
         this.lecturers=lecturers;
         this.roomType=roomType;
         this.id=id;
     }
     Subject(){
         this.id=0;
         this.name="Null";
         this.roomType=0;
     }
    static void printHeader() {
        System.out.println("id \tname \t roomType\t   lecturers ");
    }

    void printData() {
        System.out.print(id+"\t||"+name+"\t  ||"+roomType+"\t || ");
        for(int i=0;i<lecturers.size();i++){
            System.out.print(lecturers.get(i)+" ");
        }
        System.out.print("\n");

    }
}
