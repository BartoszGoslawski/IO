/**
 * Created by wacne_000 on 17.01.2017.
 */
public class Cell
{
    public int przedmiot;
    public int dzien;
    public int sala;
    public int prowadzacy;
    public int grupa;
    public int godzina;

    public Cell(int grupa, int dzien, int godzina, int prowadzacy, int przedmiot, int sala)
    {
        this.grupa = grupa;
        this.dzien = dzien;
        this.godzina = godzina;
        this.prowadzacy = prowadzacy;
        this.przedmiot = przedmiot;
        this.sala = sala;
    }

    public String toString()
    {
        return "Group: " + grupa + " Dzien: "
                + dzien + " Godzina: "
                + godzina + " Prowadzacy: "
                + prowadzacy + " Przedmiot: "
                + przedmiot + " Sala: "
                + sala;
    }
}
