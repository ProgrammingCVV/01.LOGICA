console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("READ AN INTEGER AND DETERMINE IF IT HAS THREE DIGITS");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("");

// Enlazar elementos
let numInput = document.querySelector(".num");
let button = document.querySelector(".btnProof");
let textar = document.querySelector(".textar");

// Función reutilizable
function validateNumber()
{
/*
    let num = Number(numInput.value);


    if (num < 0){
        num *= -1;
    }

    if(num >= 100 && num <= 999){
        textar.value = "The written number has 3 digits.";
    }else{
        textar.value = "The written number doesn't have three digits.";
    }
*/

let num = Number(numInput.value);
let lastDigit = 0;
let count = 0;

while(num > 0)
{
    lastDigit = num % 10;
    num = Math.floor(num / 10);
    count += 1;
}

if(count == 3)
{
    textar.value = "The written number has " + count + " digits.";
}
else
{
    textar.value = "The written number doesn't have three digits.";
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

