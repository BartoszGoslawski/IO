#pragma once
#include "Preferences.h"

class RoomPreferences : Preferences
{
public:
	int lecturer_id;
	int room_number;
	RoomPreferences(int lecturer, int room);

	void printHeader() override;
	void printData() override;
};