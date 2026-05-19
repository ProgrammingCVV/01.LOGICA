console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("READ TWO TWO-DIGIT INTEGERS AND DETERMINE IF THEY BOTH HAVE DIGITS IN COMMON");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("");

let numInput1 = document.querySelector("#num1");
let numInput2 = document.querySelector("#num2");
let btnProof = document.querySelector("#btnProof");
let textar = document.querySelector("#textar");

function validateNumber()
{
    let num1 = Number(numInput1.value);
    let num2 = Number(numInput2.value);
    let dig1 = dig2 = dig3 = dig4 = 0;

    if(num1 < 0)
        num1 *= -1;
    if(num2 < 0)
        num2 *= -1;

    if(num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99)
    {
        dig4 = num2 % 10;
        dig3 = Math.floor(num2 / 10);
        dig2 = num1 % 10;
        dig1 = Math.floor(num1 / 10);

        if(dig1 == dig3 || dig1 == dig4 || dig2 == dig3 || dig2 == dig4)
        {
            textar.value = ("There are digits in common.");
        }
        else
        {
            textar.value = ("There are not digits in common.");
        }

    }
    else
        {
            textar.value = ("Some of the written number doesn't have two digits. Please try again!");
        }
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