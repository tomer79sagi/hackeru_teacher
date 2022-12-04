// Class => Object template
class Student {
    first_name = "";
    last_name = "";
    age;

    // Always invokes when 'new' is used
    constructor(first_name, last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    print_name() {
        alert(this.first_name);
    }
}

function start() {
    const student = new Student("Tomer", "Sagi"); // Create an 'object'

    alert(student.first_name);
}