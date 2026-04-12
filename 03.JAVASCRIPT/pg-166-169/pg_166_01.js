console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJ");
console.log("READ AN INTEGER AND DETERMINE IF IT'S LAST NUMBER IS FOUR");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJ");
console.log("");

// Enlazar elementos
let numInput = document.querySelector("#num");
let button = document.querySelector("#btnProof");
let answer = document.querySelector("#textar");

// Función reutilizable
function validateNumber() 
{
    let num = Number(numInput.value);
    let four = 4;

    if (num < 0){
        num *= -1;
    }

    if(num % 10 === 4) {
        textar.value = "The last digit of your number is " + four;
    }else{
        textar.value = "The last digit of your number ISN'T " + four;
    }
}

// Click del botón
button.addEventListener("click", validateNumber);

// Evento con tecla Enter
numInput.addEventListener("keydown", function (event) {
    if (event.key === "Enter") {
        validateNumber();
    }
});