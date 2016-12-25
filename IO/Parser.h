#pragma once
#include <iostream>
#include <vector>

class GroupPreferredHours;
class LecturerPreferredHours;
class RoomPreferences;

class Parser
{
public:
	static bool parseGroups(std::string filename, std::vector<GroupPreferredHours> & groupPrefHours);
	static bool parseLecturers(std::string filename, std::vector<LecturerPreferredHours> & lecturerPrefHours);
	static bool parseRooms(std::string filename, std::vector<RoomPreferences> & roomPref);
private:
};