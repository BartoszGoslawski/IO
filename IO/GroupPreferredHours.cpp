#include "GroupPreferredHours.h"
#include <iostream>


GroupPreferredHours::GroupPreferredHours(int group, int day, int hour, int count)
	:
	group_id(group),
	day_id(day),
	hour_id(hour),
	count(count) {}

void GroupPreferredHours::printHeader(){
	std::cout << "Group\tDay\tHour\tCount\n";
}

void GroupPreferredHours::printData(){
	std::cout << group_id << "\t" << day_id << "\t" << hour_id << "\t" << count << std::endl;
}
