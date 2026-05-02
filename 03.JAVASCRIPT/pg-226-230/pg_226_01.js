console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("READ AN INTEGER AND DISPLAY ALL NUMBERS BETWEEN 1 AND THE GIVEN NUMBER");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("");

let numInput = document.querySelector(".num");
let btnPoof = document.querySelector(".btnProof");
let textar = document.querySelector(".textar");

function validateNumber()
{
    let num = Number(numInput.value);
    let i = 1;

    if(num < 0)
    {
        num *= -1;
    }
/*
    while(i <= num)
    {
        textar.value += i + ", ";
        i++;
    }
*/

    for(i; i<=num; i++)
    {
        textar.value += i + " - ";
    }
    
}

btnProof.addEventListener("click", validateNumber);
numInput.addEventListener("keydown", function(event)
{
    if(event.key === "Enter")
    {
        validateNumber();
    }
});