let max = 0;
let prompt_number = 35;

// We need to check if 'i' is the largest divider
for (let i=1 ; i<=35 ; i++) {
    // 1st valid divider = 1
    // 2st valid divider = 5
    // Check 6, 7, 8, ....
    if (prompt_number % i === 0 && i>max) {
        max = i;
    }
}



