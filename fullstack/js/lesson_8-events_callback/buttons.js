function print_name() {
    let prompt_user = prompt("Please enter your full name");
    print_name_2(prompt_user);
    print_name_2("Sagi");
}

// Relates to Exercise 2
// INPUT: A string variable
function print_name_2(full_name) {
    let div_obj = document.querySelector("div");
    div_obj.innerHTML = full_name;

    print_name_2("John");
}


