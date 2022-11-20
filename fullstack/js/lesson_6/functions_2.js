let max_divider = 0;
let min = 0;
let prompt_number_1 = 9;
let prompt_number_2 = 3;

// 1. Find lowest number
// INPUT: 2 numbers
// OUTPUT: Minimum value
function find_lowest_number() {
    if (prompt_number_1 < prompt_number_2) {
        min = prompt_number_1;
    } else {
        min = prompt_number_2;
    }
}

find_lowest_number();

// 2. Loop from 1 until the lowest number
for (let i=1 ; i<=min ; i++) {
    // 3. Check if both numbers return 0 for a modulu check
    if ((prompt_number_1 % i === 0) && (prompt_number_2 % i === 0) && (i>max_divider)) {
        // 4. If yes, store as max and continue
        max_divider = i;
    }
}

// 5. Print the max number
document.write("The largest divider of both numbers is: " + max_divider);




