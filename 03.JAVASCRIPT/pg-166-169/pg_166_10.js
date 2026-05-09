console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("READ A TWO-DIGIT INTEGER AND DETERMINE IF BOTH DIGITS ARE THE SAME");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("");

let numInput = document.querySelector("#num");
let btnProof = document.querySelector(".btnProof");
let textar = document.querySelector("#textar");

let dig1, dig2;

function validateNumber()
{
    let num = Number(numInput.value);

    if(num < 0)
    {
        num *= -1;
    }

    if(num >= 10 && num <= 99)
    {
        dig2 = num % 10;
        dig1 = Math.floor(num/10);
        
        if(dig1 == dig2)
        {
            textar.value = "Both digits are the same."
        }
        else
        {
            textar.value = "Both digits aren't the same."
        }
    }
    else
    {
        textar.value = "The written number doesn't have two digits. Plese try again!";
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