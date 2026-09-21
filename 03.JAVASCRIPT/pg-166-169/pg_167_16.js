console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("READ A THREE-DIGITS INTEGER AND DETERMINE IF AT LEAST TWO OF THE THREE DIGITS ARE THE SAME");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("");

let numInput = document.querySelector(".num");
let btnProof = document.querySelector("#btnProof");
let textar = document.querySelector(".textar");

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

    if(dig1 == dig2 && dig1 == dig3)
    {
        textar.value = "All digits are the same!";
    }
    else if(dig1 == dig2)
    {
        textar.value = "The first and second digit are the same.";
    }
    else if(dig1 == dig3)
    {
        textar.value = "The first and third digit are the same.";
    }
    else if(dig2 == dig3)
    {
        textar.value = "The second and third digit are the same.";
    }
    else
    {
        textar.value = "None digit are the same.";
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