const myTimer = setInterval(myFunction, 3000); // 30 seconds. Miliseconds, 1/1000 seconds

function myFunction() {
    document.getElementById('main').innerHTML += 'Tomer Sagi';
}

function stopTimer() {
    clearInterval(myTimer);
    alert("Stopped");
}

setTimeout(stopTimer, 9000);

