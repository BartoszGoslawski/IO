import java.util.ArrayList;

/**
 * Created by wacne_000 on 17.01.2017.
 */
public class ScheduleGenerator
{
    ArrayList<Lecturer> lecturers;
    ArrayList<Subject> subjects;
    ArrayList<Room> rooms;

    ArrayList<GroupPreferredHours> groupPrefs;
    ArrayList<LecturerPreferredHours> lecturersPrefs;

    //ArrayList<Cell> schedule;
    PlanGrupy[][][] schedule;



    int groups;
    int days = 5;
    int hours = 12;

    public ScheduleGenerator(ArrayList<Lecturer> lecturers,
                             ArrayList<Subject> subjects,
                             ArrayList<Room> rooms,
                             ArrayList<LecturerPreferredHours> lecturersPrefs,
                             ArrayList<GroupPreferredHours> groupPrefs,
                             int groupsAmount)
    {
        this.lecturers = lecturers;
        this.subjects = subjects;
        this.rooms = rooms;
        this.lecturersPrefs = lecturersPrefs;
        this.groupPrefs = groupPrefs;

        this.groups = groupsAmount;
        //this.schedule = new ArrayList<Cell>();
        this.schedule = new PlanGrupy[groups][days][hours];
        initializeSchedule();
    }

    private void initializeSchedule()
    {
        for (int i = 0; i < groups; ++i)
            for (int j = 0; j < days; ++j)
                for (int k = 0; k < hours; ++k)
                    schedule[i][j][k] = new PlanGrupy();
    }

    private boolean checkIfRoomAvailable(int wantedRoom, int day, int hour, int group)
    {
        for (int i = 0; i < groups; ++i)
        {
            if (i == group) continue; // not for ourselves
            if (schedule[i][day][hour].idroom == wantedRoom) return false; // occupied
        }
        return true; // room is available
    }
    private boolean checkLecturer(int wantedLecturer, int day, int hour, int group)
    {
        for (int i = 0; i < groups; ++i)
        {
            if (i == group) continue; // not for ourselves
            if (schedule[i][day][hour].idlect == wantedLecturer) return false; // occupied
        }
        return true; // lecturer is available
    }

    private int chooseLecturer(Subject sub, int day, int hour, int group)
    {
        for (int i = 0; i < sub.lecturers.size(); ++i)
        {
            if (checkLecturer(sub.lecturers.get(i), day, hour, group)) return sub.lecturers.get(i);
        }
        return -1; // no available lecturer for this hour
    }

    private int chooseRoom(Subject sub, int day, int hour, int group)
    {
        for (int i = 0; i < rooms.size(); ++i)
        {
            if (rooms.get(i).roomType == sub.roomType)
                if (checkIfRoomAvailable(rooms.get(i).id, day, hour, group))
                    return rooms.get(i).id;
        }
        return -1; // no available lecturer for this hour
    }

    private boolean insertIntoSchedule(Subject sub, int group, int day, int hour)
    {
        int room = chooseRoom(sub, day, hour, group);
        if (room == -1) return false;

        int lecturer = chooseLecturer(sub, day, hour, group);
        if (lecturer == -1) return false;

        schedule[group][day][hour] = new PlanGrupy(lecturer, sub.id, room);
        //System.out.println("Dodano przedmiot! Grupa: " + group +  " Dzien: " + day + " Godzina: " + hour);
        schedule[group][day][hour].Print();
        return true;
    }


    public PlanGrupy[][][] generateSchedule()
    {
        for (int i = 0; i < groups; ++i) // dla każdej grupy
        {
            ArrayList<Subject> subjectsCopy = new ArrayList<Subject>(subjects); // kopiujemy do lokalnej tablicy przedmiotow
            while (!subjectsCopy.isEmpty()) // dopóki są przedmioty do rozdania dla grupy
            {
                for (int j = 0; j < days; ++j)
                {
                    if (subjectsCopy.isEmpty()) break; // jesli skonczyly sie przedmioty, zmieniamy grupe
                    for (int k = 0; k < hours; ++k)
                    {
                        if (subjectsCopy.isEmpty()) break; // jesli skonczyly sie przedmioty, zmieniamy grupe
                        for (int sub = 0; sub < subjectsCopy.size(); ++sub) // jesli pierwszy sprawdzany przedmiot nie pasuje na ta godzine, sprawdzamy kolejny
                        {
                            Subject temp = subjectsCopy.remove(0);
                            if (!insertIntoSchedule(temp, i, j, k))
                            {
                                subjectsCopy.add(temp); // jesli nie dodal, na koniec kolejki
                            }
                            else break;
                            sub++;
                        }
                    }
                }
            }
        }
        return schedule;
    }

}
