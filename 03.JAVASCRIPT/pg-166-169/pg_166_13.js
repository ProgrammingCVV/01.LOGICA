console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJ");
console.log("READ TWO TWO-DIGIT INTEGERS AND DETERMINE IF THE SUM OF BOTH INTERGERS PRODUCE AN EVEN NUMBER");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJ");
console.log("");

let numInput1 = document.querySelector("#num1");
let numInput2 = document.querySelector("#num2");
let btnProof = document.querySelector("#btnProof");
let textar = document.querySelector("#textar");

function validateNumber()
{
    let num1 = Number(numInput1.value);
    let num2 = Number(numInput2.value);

    let sum = num1 + num2;

    if((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <=99))
    {
        if(sum % 2 == 0)
        {
            textar.value = "The sum of the both integers (" + sum + ") is an even number";
        }
        else
        {
            textar.value = "The sum of the both integers (" + sum + ") isn't an even number";
        }
    }
    else
        {
            textar.value = "Some of the written numbers doesn't have two digits. Please try again!";
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