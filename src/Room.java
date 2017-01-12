/**
 * Created by Admin on 2017-01-06.
 */
public class Room {
    int id;
    int roomNumber;
    int roomType;
    Room(int id, int roomNumber,int roomType){

        this.id=id;
        this.roomNumber=roomNumber;
        this.roomType=roomType;
    }

    static void printHeader() {
        System.out.println("id\troomNumber \troomType");
    }

    void printData() {
        System.out.print(id+"\t  "+roomNumber+"\t "+roomType);
        System.out.print("\n");

    }
}

