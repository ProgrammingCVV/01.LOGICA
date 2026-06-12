console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("READ TWO INTEGERS AND DISPLAY ALL THE NUMBERS ENDED IN 4 COMPRENDED BETWEEN THEM");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("");

let numInput1 = document.querySelector("#num1");
let numInput2 = document.querySelector("#num2");
let bntProof = document.querySelector(".btnProof");
let textar = document.querySelector(".textar");
let i = 1;
let j = 1;

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

    while(i <= num1)
    {
        if(i % 10 == 4)
        {
            textar.value += (i + ", ");
        }
        i++;
    }

    textar.value += "\n";

    while(j <= num2)
    {
        if(j % 10 == 4)
        {
            textar.value += (j + ", ");
        }
        j++;
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