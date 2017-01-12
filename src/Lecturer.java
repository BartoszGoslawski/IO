import java.util.ArrayList;

/**
 * Created by Admin on 2017-01-06.
 */
public class Lecturer {
    int id;
    String name;
   ArrayList<Integer> subjects=new ArrayList();


    Lecturer(int id, String name,ArrayList<Integer> subjects){
        this.id=id;
        this.name=name;
        this.subjects=subjects;
    }
    Lecturer(){
        this.id=0;
        this.name="null";

    }
    static void printHeader() {
        System.out.println("id\tname    \tsubjects");
    }

    void printData() {
        System.out.print(id+"\t  "+name+"\t  ");
        for(int i=0;i<subjects.size();i++){
            System.out.print(subjects.get(i)+" ");
        }
        System.out.print("\n");

    }
}

