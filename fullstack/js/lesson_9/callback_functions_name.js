function print(variable) { // text = "Tomer"
    alert(variable);
}

let myName = "Tomer";

print(myName);
print(123); // Server call? (5 seconds) --> callback fucntion....
print(true);



///////////////////////////////////


function print(variable) { // text = function myFunction() { docoument.write("XXX"); }
    alert(variable);
}

function myFunction() {
    docoument.write("XXX");
}

// print(myFunction);
document.querySelector('button').onclick = myFunction; // Only when a click ocurred, IN THE FUTURE, call the function 'print()' 