console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("READ TWO INTEGERS AND DETERMINE WHICH IS GREATER");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("");

let numInput1 = document.querySelector(".num1");
let numInput2 = document.querySelector(".num2");
let btnProof = document.querySelector(".btnProof");
let textar = document.querySelector(".textar");

function validateNumber()
{
    let num1 = Number(numInput1.value);
    let num2 = Number(numInput2.value);

    if(num1 > num2)
    {
        textar.value = "The first number is greater than the second.";
    }
    else if(num2 > num1)
    {
        textar.value = "The second number is greater than the first.";
    }
    else
    {
        textar.value = "Both numbers are the same.";
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