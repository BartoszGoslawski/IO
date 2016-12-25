#pragma once

class LecturerPreferredHours
{
public:
	int group_id;
	int day_id;
	int hour_id;
	int count;

	LecturerPreferredHours(int group, int day, int hour, int count);
};