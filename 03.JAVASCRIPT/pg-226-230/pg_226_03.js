console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJ");
console.log("READ AN INTEGER AND DISPLAY ALL ITS EXACT DIVISORS BETWEEN 1 AND THE GIVEN NUMBER");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJ");
console.log("");

let numInput = document.querySelector(".num");
let btnProof = document.querySelector(".btnProof");
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
        if(num % i == 0)
        {
            textar.value += (i + ", ");
        }
    i++;
    }
*/

    for(i=1; i<=num; i++)
    {
        if(num % i == 0)
        {
            textar.value += (i + ", ")
        }
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