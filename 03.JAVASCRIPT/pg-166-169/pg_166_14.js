console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJ");
console.log("READ TWO TOW-DIGIT INTEGERS AND DETERMINE THE SUM OF ALL THE DIGITS");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJ");
console.log("");

let numInput1 = document.querySelector(".num1");
let numInput2 = document.querySelector(".num2");
let btnProof = document.querySelector("#btnProof");
let textar = document.querySelector("#textar");

let dig1;
let dig2;
let dig3;
let dig4;

function validateNumber()
{
    let num1 = Number(numInput1.value);
    let num2 = Number(numInput2.value);

    if(num1 < 0)
    {
        num1 *= -1;
    }
    if(num2 < 0)
    {
        num2 *= -1;
    }

    if(num1 > 10 && num1 < 99)
        {
        dig2 = num1 % 10;
        dig1 = Math.floor(num1 / 10);
        }
    else
        {
            textar.value = "The written number doesn't have two digits. Please try again!";
            return;
        }

    if(num2 > 10 && num2 < 99)
        {
            dig4 = num2 % 10;
            dig3 = Math.floor(num2 / 10);
        }
    else
        {
            textar.value = "The written number doesn't have two digits. Please try again!";
            return;
        }
    
    let sum = dig1 + dig2 + dig3 + dig4;

    textar.value = "The sum of all digits is: " + sum;


}

btnProof.addEventListener("click", validateNumber);
numInput1.addEventListener("keydown", function(event)
{
    if(event.key === "Enter")
    {
        validateNumber();
    }
});

numInput2.addEventListener("keydown", function(event)
{
    if(event.key === "Enter")
    {
        validateNumber();
    }
});