#define _CRT_SECURE_NO_WARNINGS
#include <fstream>
#include <vector>

#include "Parser.h"
#include "json.hpp"
#include "GroupPreferredHours.h"
#include "LecturerPreferredHours.h"
#include "RoomPreferences.h"

using json = nlohmann::json;

bool Parser::parseGroups(std::string filename, std::vector<GroupPreferredHours> & groupPrefHours){

	std::ifstream groupsPreferredHoursFile;

	groupsPreferredHoursFile.open(filename);
	if (!groupsPreferredHoursFile.good())
	{
		std::cout << "Unable to open" << std::endl;
		return false;
	}
	json groupPreferredHoursJSON;
	groupsPreferredHoursFile >> groupPreferredHoursJSON;

	for (auto& element : groupPreferredHoursJSON) {
		groupPrefHours.emplace_back(
			element.at("group_id"),
			element.at("day_id"),
			element.at("hour_id"),
			element.at("count"));
	}
	groupsPreferredHoursFile.close();
	return true;
}

bool Parser::parseLecturers(std::string filename, std::vector<LecturerPreferredHours> & lecturerPrefHours){

	std::ifstream lecturersPreferredHoursFile;

	lecturersPreferredHoursFile.open(filename);
	if (!lecturersPreferredHoursFile.good())
	{
		std::cout << "Unable to open" << std::endl;
		return false;
	}
	json lecturerPreferredHoursJSON;
	lecturersPreferredHoursFile >> lecturerPreferredHoursJSON;

	for (auto& element : lecturerPreferredHoursJSON) {
		lecturerPrefHours.emplace_back(
			element.at("lecturer_id"),
			element.at("day_id"),
			element.at("hour_id"),
			element.at("count"));
	}
	lecturersPreferredHoursFile.close();
	return true;
}

bool Parser::parseRooms(std::string filename, std::vector<RoomPreferences> & roomPref)
{
	std::ifstream roomPreferredHoursFile;

	roomPreferredHoursFile.open(filename);
	if (!roomPreferredHoursFile.good())
	{
		std::cout << "Unable to open" << std::endl;
		return false;
	}
	json roomPreferredHoursJSON;
	roomPreferredHoursFile >> roomPreferredHoursJSON;

	for (auto& element : roomPreferredHoursJSON) {
		roomPref.emplace_back(
			element.at("lecturer_id"),
			element.at("room_number"));
	}
	roomPreferredHoursFile.close();
	return true;
}
