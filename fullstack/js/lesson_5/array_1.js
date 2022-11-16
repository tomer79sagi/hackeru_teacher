// 1. Primitive array
const student_names = ["Tomer", "Richard", "Heather", "Shimon", "Natan", "Or"]; // Array of strings

// Access array element
document.write(student_names[0] + "<br/>"); // "Tomer"
document.write(student_names[5] + "<br/>"); // "Or"

// Assignment of value to array element
student_names[3] = "John";

// Add new element at the end
student_names.push("George"); // Find last index, add new element at last index + 1
student_names[student_names.length] = "Michael"; // 6 elements, element 1 [0], element 6 [5] 0..5 | 1..6

document.write("Array length: " + student_names.length + "<br/>");

let a = student_names.pop();

document.write("Popped element: " + a + "<br/>");
document.write("Array length: " + student_names.length + "<br/>");

for (let i=0 ; i<student_names.length ; i++) {
    document.write(student_names[i] + "<br/>");
}

// A

// 2. Student object array


