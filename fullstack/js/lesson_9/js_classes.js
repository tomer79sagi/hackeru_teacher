// Object 'person'
const person = {
    first_name: "Tomer",
    print_name: function() {
        alert(this.first_name);
    }
}

//////////////

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
    // person.print_name();
    let student_array = [];

    for (let i=0 ; i<5 ; i++) {
        let person = {
            first_name: "Tomer " + i,
            print_name: function() {
                alert(this.first_name);
            }
        }

        student_array.push(person);
    }

    //
    const student2 = {
        nam: "John"
    }
    student_array.push(student2);


    // Using CLASS
    // Person.print_name(); // error

    // const person = new Person(); // Create object from class
    // person.first_name = "Tomer";
    // person.print_name();
}