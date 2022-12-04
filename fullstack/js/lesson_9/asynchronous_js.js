const myTimer = setTimeout(myFunction, 30000); // 30 seconds. Miliseconds, 1/1000 seconds

function myFunction() {
    document.getElementById('main').innerHTML = 'Tomer Sagi';
}

function stopTimer() {
    clearTimeout(myTimer);
    alert("Stopped");
}

setTimeout(stopTimer, 5000);

