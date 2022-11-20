

// Print text om the page
// DECLERATIOON function
// function print_text(input_paramter) { // decleration
//     document.write(input_paramter + "<br/>");
// }

// EXPRESSION function
const print_text = function(input_paramter) { // expression
    document.write(input_paramter + "<br/>");
}

// ARROW function
const x = () => document.write(input_paramter + "<br/>");
const y = input_paramter => document.write(input_paramter + "<br/>");
const z = (input_paramter, y) => document.write(input_paramter + "<br/>");
const a = (input_paramter, y) => {
    document.write(input_paramter + "<br/>");
}


let temp_name = "Tomer";

print_text(temp_name); // string
print_text(9); // int
print_text(true); // booleam



// Person object
const person = {
    first_name: "Tomer",
    last_name: "Sagi",
    print_name: function() {
        document.write(this.first_name + " " + this.last_name);
    }
}

document.write(person.first_name);
person.print_name();

