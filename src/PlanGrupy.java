/**
 * Created by Admin on 2017-01-10.
 */
public class PlanGrupy {
    public
    int idlect;
    int idsub;
    int idroom;

    PlanGrupy(){
        this.idlect=0;
        this.idsub=0;
        this.idroom=0;

    }
void Print() {
    System.out.print(idsub+","+" "+idlect+","+" "+idroom+"    ");
}
void Przypisz(int idsub,int idlect,int idroom){
        this.idsub=idsub;
        this.idroom=idroom;
        this.idlect=idlect;
}
}
