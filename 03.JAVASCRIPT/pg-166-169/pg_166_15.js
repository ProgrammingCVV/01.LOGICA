console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJ");
console.log("READ A THREE-DIGITS INTEGER AND DETERMINE THE SUM OF ITS DIGITS");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJ");
console.log("");

let numInput = document.querySelector("#num");
let btnProof = document.querySelector(".btnProof");
let textar = document.querySelector("#textar");

let dig1;
let dig2;
let dig3;

function validateNumber()
{
    let num = Number(numInput.value);

    if(num < 0)
    {
        num *= -1;
    }

    if(num >= 100 && num <= 999)
    {
        dig3 = num % 10;
        dig2 = Math.floor(num/10) % 10;
        dig1 = Math.floor(num/100) % 10;
    }
    else
        {
            textar.value = "The written number doesn't have three digits. Please try again!";
            return;
        }

    let sum = dig1 + dig2 + dig3;

    textar.value = "The sum of all digist is " + sum;
}

btnProof.addEventListener("click", validateNumber);
numInput.addEventListener("keydown", function(event)
{
    if(event.key === "Enter")
    {
        validateNumber();
    }
});