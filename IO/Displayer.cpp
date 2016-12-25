#include "Displayer.h"
#include "GroupPreferredHours.h"
#include "LecturerPreferredHours.h"
#include "RoomPreferences.h"

// ugly code. It should be refactored to templates(possible?) / pointers to get use of polimorfism
void Displayer::printPreferences(std::vector<GroupPreferredHours> preferences) {
	if (!preferences.empty()) {

		preferences[0].printHeader();
		std::cout << "\n";
		for (auto & pref : preferences)
			pref.printData();
	}
	else std::cout << "There is no preferences. Try to import them first" << std::endl;
}

void Displayer::printPreferences(std::vector<LecturerPreferredHours> preferences) {
	if (!preferences.empty()) {

		preferences[0].printHeader();
		std::cout << "\n";
		for (auto & pref : preferences)
			pref.printData();
	}
	else std::cout << "There is no preferences. Try to import them first" << std::endl;
}

void Displayer::printPreferences(std::vector<RoomPreferences> preferences) {
	if (!preferences.empty()) {

		preferences[0].printHeader();
		std::cout << "\n";
		for (auto & pref : preferences)
			pref.printData();
	}
	else std::cout << "There is no preferences. Try to import them first" << std::endl;
}