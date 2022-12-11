// Function receives 2 paramters (2 arrays)
function task_3(array1, array2) {
    for (let i=0 ; i<array2.length ; i++) {

        // Add element from array2 at the end of array1
        array1.push(array2[i]);
    }

    return array1;
}

function task_3_test() {
    const a1 = [1,5,7,4,33134];
    const a2 = ["Tomer", "Sagi", 4, 46,46];
    const a3 = task_3(a1, a2);

    document.write(a3);
}

const task_3_test = function() {
    alert('Tomer');
}

task_3_test();

