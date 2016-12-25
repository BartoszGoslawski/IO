#include <iostream>
#include <vector>
#include <fstream>

#include "GroupPreferredHours.h"
#include "LecturerPreferredHours.h"
#include "RoomPreferences.h"
#include "Parser.h"
#include "Displayer.h"

std::vector<GroupPreferredHours> groupsPreferredHours;
std::vector<LecturerPreferredHours> lecturersPreferredHours;
std::vector<RoomPreferences> roomPreferences;

int main()
{
	if (Parser::parseGroups("groupsPreferredHours.json", groupsPreferredHours)) std::cout << "Groups imported" << std::endl;
	else std::cout << "Couldn't import groups prefferences" << std::endl;

	if (Parser::parseLecturers("lecturersPreferredHours.json", lecturersPreferredHours)) std::cout << "Lecturers imported" << std::endl;
	else std::cout << "Couldn't import lecturers prefferences" << std::endl;

	if (Parser::parseRooms("roomPreferences.json", roomPreferences)) std::cout << "Rooms imported" << std::endl;
	else std::cout << "Couldn't import rooms prefferences" << std::endl;
	

	Displayer::printPreferences(groupsPreferredHours);
	Displayer::printPreferences(lecturersPreferredHours);
	Displayer::printPreferences(roomPreferences);
	std::cin.get();
}