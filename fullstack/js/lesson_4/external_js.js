// Example: 'number = 5'
let number = +prompt("enter a number");
            
for (let row = 1 ; row <= number ; row++) {

    debugger;
    if (row === 3) {
        continue; // Skip to next iteration, just to start of loop
    } else if (row === 9) {
        break; // Stop immediately and exit loop
    }

    for (let columns = 1 ; columns <= row ; columns++) {
        document.write(row);
    }

    document.write("<br/>");
}