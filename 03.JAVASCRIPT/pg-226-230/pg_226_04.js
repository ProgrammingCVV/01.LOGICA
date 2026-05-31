console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("READ TWO INTEGERS AND DISPLAY ALL NUMBERS BETWEEN THEM");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("");

let numInput1 = document.querySelector(".num1");
let numInput2 = document.querySelector(".num2");
let btnProof = document.querySelector(".btnProof");
let textar = document.querySelector(".textar");

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

    let i = 1;
    let j = 1;

    for(i=1; i<=num1; i++)
    {
        textar.value += (i + "-");
    }

    textar.value += "\n";
    
    for(j=1; j<=num2; j++)
    {
        textar.value += (j + "-");
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