#include "LecturerPreferredHours.h"
#include <iostream>

LecturerPreferredHours::LecturerPreferredHours(int lecturer, int day, int hour, int count)
	:
	lecturer_id(lecturer),
	day_id(day),
	hour_id(hour),
	count(count) {}

void LecturerPreferredHours::printHeader() {
	std::cout << "Lecturer\tDay\tHour\tCount\n";
}

void LecturerPreferredHours::printData() {
	std::cout << lecturer_id << "\t" << day_id << "\t" << hour_id << "\t" << count << std::endl;
}