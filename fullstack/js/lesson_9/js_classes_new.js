// Class => Object template
class Student {
    first_name = "";
    last_name = "";
    age;

    print_name() {
        alert(this.first_name);
    }
}

function start() {
    // const student = new Student(); // Create an 'object'

    student.first_name = "Tomer";
    alert(student.first_name);
}