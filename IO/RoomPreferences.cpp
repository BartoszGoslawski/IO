#include "RoomPreferences.h"
#include <iostream>

RoomPreferences::RoomPreferences(int lecturer, int room)
	:
	lecturer_id(lecturer),
	room_number(room){}

void RoomPreferences::printHeader() {
	std::cout << "Lecturer\tRoom\n";
}

void RoomPreferences::printData() {
	std::cout << lecturer_id << "\t" << room_number << std::endl;
}