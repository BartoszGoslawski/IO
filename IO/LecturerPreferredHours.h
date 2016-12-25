#pragma once
#include "Preferences.h"

class LecturerPreferredHours : Preferences
{
public:
	int lecturer_id;
	int day_id;
	int hour_id;
	int count;

	LecturerPreferredHours(int lecturer, int day, int hour, int count);

	void printHeader() override;
	void printData() override;
};