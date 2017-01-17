import java.util.ArrayList;

/**
 * Created by Admin on 2017-01-08.
 */
public class PlanTrywialny {

    public
    ArrayList<Subject> subjects = new ArrayList<>();
    ArrayList<Lecturer> lecturers = new ArrayList<>();
    ArrayList<Room> rooms = new ArrayList<>();




    static PlanGrupy[][][] Plan(ArrayList<Subject> subjects, ArrayList<Lecturer> lecturers, ArrayList<Room> rooms) {
        int pom = 0;
        int idsub = 0;
        int idlect = 0;
        int idroom = 0;
        int zajete=0;
        int tab[] = new int[subjects.size()];
        int pom1=0;
        int grupy=1;
        int iloscgrup=4;
        PlanGrupy[][][] planGrupies = new PlanGrupy[iloscgrup][5][12];

        for(int i=0;i<iloscgrup;i++) {
            for (int j = 0; j < 5; j++) {

                for (int k = 0; k < 12; k++) {
                    planGrupies[i][j][k] = new PlanGrupy();
                }

            }
        }

        for(int i=0;i<grupy;i++) {
            for (int j = 0; j < 12; j++) {

                for (int k = 0; k < 5; k++) {
                    planGrupies[i][k][j].Print();
                }
                System.out.println();
            }
        }
        ArrayList<Subject> subjectspom=new ArrayList<>();

        //System.out.println(subjects.size());
        while(grupy<=iloscgrup) {

            for(int rozmiar=0;rozmiar<subjects.size();rozmiar++){
                subjectspom.add(subjects.get(rozmiar));
                System.out.println("Pomocnicza");
                subjectspom.get(rozmiar).printData();

            }
            for (int i = 0; i < 12; i++) {  //for po tablicy ilosc godizn w dniu
                if (subjectspom.size()==0) break;
                for (int j = 0; j < 5; j++) { //ilosc dni
                    if (subjectspom.size()==0) break;
                    pom=0;



                    while (pom<subjectspom.size()) { //warunek dopoki nie skoncza sie przedmioty
                        idsub=0;
                        idroom=0;
                        idlect=0;

                        if(pom==subjectspom.size()) break;

                        if(planGrupies[grupy-1][j][i].idsub==0) {  //sprawdzenie czy dana godizna w danym dniu jest wolna

                            idsub = subjectspom.get(pom).id;  //spisanie id przedmiotu jezeli tak

                            for (int k = 0; k < rooms.size(); k++) {//pętla po pokojach
                                zajete=0;
                                for(int szukaj=0;szukaj<grupy-1;szukaj++) {
                                    if (planGrupies[szukaj][j][i].idroom == rooms.get(k).id){
                                        zajete=1;

                                        break;
                                    }
                                }

                                if (subjectspom.get(pom).roomType == rooms.get(k).roomType && zajete==0) {//warunek gdy roomtype
                                    //  w przedmiocie rowna sie roomtype w roomsach

                                    idroom = rooms.get(k).id;
                                    break;//
                                }

                            }


                            for (int k = 0; k < subjectspom.get(pom).lecturers.size(); k++) {  //szukam prowadzacego do danego rpzedmioty wiec
                                // lecturers musza sie zgadzac z id w klasie lecturer
                                for (int k1 = 0; k1 < lecturers.size(); k1++) {
                                    // w ifie jezeli id przedmiotu z indexem pom w prowadzacyhc ma ten sam indeks
                                    // co prowadzacy o indeksie k 1 to wpisuje do inta
                                    zajete=0;
                                    for(int szukaj=0;szukaj<grupy-1;szukaj++) {
                                        if (planGrupies[szukaj][j][i].idroom == rooms.get(k).id){
                                            zajete=1;
                                            break;
                                        }
                                    }
                                    if (subjectspom.get(pom).lecturers.get(k) == lecturers.get(k1).id && zajete==0) {
                                        idlect = lecturers.get(k1).id;
                                        break;//przerywanie petli jezeli wpisal do idlect id prowadzacego
                                    }

                                }

                                if (idlect != 0) {//przerywanie petli gdy znalazlo prowadzacego
                                    break;
                                }


                            }

                            if(idlect==0){
                                System.out.print("System nie znalazl prowadzacego dla danej godziny");
                                break;
                            }




                        }
                        else break;

                        for(int szukaj=0;szukaj<grupy-1;szukaj++)
                        {
                            if(planGrupies[szukaj][j][i].idroom==idroom || planGrupies[szukaj][j][i].idlect==idlect){
                                idroom=0;
                                idlect=0;
                                idsub=0;
                                pom++;
                                System.out.println("Sala lub prowadzacy w tej chwili sa zajeci");
                            }

                        }
                        if(pom>subjectspom.size()) break;

                        if (idroom != 0 && idlect != 0 && idsub != 0) {
                            planGrupies[grupy-1][j][i].Przypisz(idsub,idlect,idroom);
                            System.out.println("ZROBIONE" + " " + pom + " " + idsub + " " + idlect + " " + idroom + " dzien " + j + " godzina " + i);
                            idroom = 0;
                            idlect = 0;
                            idsub = 0;
                            subjectspom.remove(pom);
                            pom=0;

                        } /*else {
                            tab[pom] = pom;

                        }*/

                        System.out.println(pom);



                    }

                }
                for(int pomtab=0;pomtab<tab.length;pomtab++) {
                    if(tab[pomtab]!=0){
                        System.out.println("NIE WSZYSTKEI ZAJECIA ZOSTALY PRZYDZIELONE");
                        return null;
                    }
                }
            }





            System.out.println("Plan Grupy " +grupy);
            for (int i = 0; i < 12; i++) {  //for po tablicy ilosc godizn w dniu
                for (int j = 0; j < 5; j++) { //ilosc dni
                   planGrupies[grupy-1][j][i].Print();
                    System.out.print("\t\t");
                }

                System.out.println();
            }


            grupy++;
            pom=0;
        }
        System.out.print("\n\n");
        return planGrupies;
    }

}
