#pragma once
#include "Preferences.h"

class GroupPreferredHours : public Preferences
{
public:
	int group_id;
	int day_id;
	int hour_id;
	int count;

	GroupPreferredHours(int group, int day, int hour, int count);

	void printHeader() override;
	void printData() override;


};