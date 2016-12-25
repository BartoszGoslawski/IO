#pragma once

class GroupPreferredHours
{
public:
	int group_id;
	int day_id;
	int hour_id;
	int count;

	GroupPreferredHours(int group, int day, int hour, int count);
};