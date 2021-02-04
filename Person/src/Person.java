class Person{
String name;
int personID;
int phoneNumber;
static int age;
String college;
String department;
String position;
Person(){
}
Person(String newName,int newStudentID,int
newPhoneNumber,int newAge,String
newCollege,String newDepartment,String
newPosition) {
name=newName;
personID=newStudentID;
phoneNumber=newPhoneNumber;
age=newAge;
college=newCollege;
department=newDepartment;
position=newPosition;
}
String getName() {
return name;
}
int personID() {
return personID;
}
}