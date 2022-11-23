
function findElementById() {
    // Retrieve the <p> element as HTMLElement object
    const p_element_object = document.getElementById("first_name");

    // Update the 'innerHTML' property
    p_element_object.innerHTML = "Tomer Sagi";
}

function findTags() {
     // Retrieve the <p> element as HTMLElement object
     const array = document.getElementsByTagName("div");

     for (let i=0 ; i<array.length ; i++) {
        array[i].innerHTML = i;
     }

     // Update the 'innerHTML' property
    //  p_element_object.innerHTML = "Tomer Sagi";
}