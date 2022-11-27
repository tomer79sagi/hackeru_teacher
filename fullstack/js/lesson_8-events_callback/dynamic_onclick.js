function start() {
    let btn_object = document.getElementById("btn");

    // btn_object.onclick = print_name(); // Incorrect, will invoke/call the function right now. We need to run later
    btn_object.onclick = print_name; // Correct!

    // Shortest option (not always recommended, as it might be hard to understand)
    // document.getElementById("btn").onclick = print_name; // Correct!
}

function print_name() {
    alert("Tomer Sagi");
}

