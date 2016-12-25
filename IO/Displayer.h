#pragma once
#include <vector>
#include <iostream>

using std::cout;
using std::endl;

class GroupPreferredHours;
class LecturerPreferredHours;
class RoomPreferences;

// ugly code. It should be refactored to templates(possible?) / pointers to get use of polimorfism
class Displayer
{
public:
	static void printPreferences(std::vector<GroupPreferredHours> preferences);
	static void printPreferences(std::vector<LecturerPreferredHours> preferences);
	static void printPreferences(std::vector<RoomPreferences> preferences);
};

