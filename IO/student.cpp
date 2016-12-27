#include "student.h"
#include <iostream>

Student::Student(int id, std::string firstName, std::string lastName, int groupId)
	:
	id(id),
	firstName(firstName),
	lastName(lastName),
	groupId(groupId) {}

