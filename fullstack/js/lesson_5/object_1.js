let first_name = "Tomer"; // Global variable

// Model / Structure
let student = { // Global object
    first_name: "Tomer",
    last_name: "Sagi"
}

// document.write("First Name: " + first_name);
document.write("First Name: " + student.first_name + " " + student.last_name);

first_name = "Shimon";

document.write("<br/>" + first_name);
var key = "first_name";

// student.first_name = "Richard";
student["first_name"] = "Richard"; // Key => String
student["last_name"] = "The King";
student[key] = "The King"; // student["first_name"]

student["grade"] = 76; // SHOULD be an error

document.write("<br/>" + student.first_name);
document.write("<br/>" + student.grade);