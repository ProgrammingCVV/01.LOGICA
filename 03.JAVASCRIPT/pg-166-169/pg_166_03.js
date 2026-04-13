console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("READ AN INTEGER AND DETERMINE IF IT'S NEGATIVE");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("");

let numInput = document.querySelector("#num");
let button = document.querySelector("#btnProof");
let textar = document.querySelector("#textar");

function validateNumber()
{
    let num = Number(numInput.value);

    if(num < 0)
    {
        textar.value = ("The written number is negative: " + num);
    }
    else
    {
        textar.value = ("The written number ISN'T negative: " + num);
    }

}

button.addEventListener("click", validateNumber);
numInput.addEventListener("keydown", function (event) 
{
    if (event.key === "Enter") {
        validateNumber();
    }

});