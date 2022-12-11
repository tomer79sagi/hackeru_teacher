function prepare(ingredients, func) {
    console.log("Preparing ingredients " + ingredients);
    func();
}

function chop() {
    console.log("Chopping");
}

function cook() {
    console.log("Cooking");
}

prepare("onions and garlic", chop);
prepare("onions and garlic", cook);