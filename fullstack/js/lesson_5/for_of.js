const student_names = ["Tomer", "John", "Michael"]; // 3 elements

// for..of (loop over array elements)

// Loop over all elements
// 1st element [0] ==> student = "Tomer"
// 2nd element [1] ==> student = "John"
// 3rd element [2] ==> student = "Michael"

let student;

for (student of student_names) {
    document.write(student + "<br/>");
}

document.write(Array.isArray(student_names));
document.write(student_names instanceof Array); // if (student_names is object of class Array)

document.write("<br/>");

// STRINGS and arrays
let city = "Jerusalem";
document.write(city[4]);

// Split string into array using delimiter
let sentence = "Today is a beautiful day"; // string
let sentence_array = sentence.split("a"); // Create array with each element divided by space

for (let word of sentence_array) {
    document.write(word + "<br/>");
}


// for..in (loop over object properties and methods)