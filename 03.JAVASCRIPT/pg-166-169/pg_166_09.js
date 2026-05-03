console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("READ A TWO-DIGIT INTEGER AND DETERMINE IF ONE OF ITS DIGITS IS A MULTIPLE OF THE OTHER");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("");

let numInput = document.querySelector(".num");
let btnProof = document.querySelector(".btnProof");
let textar = document.querySelector(".textar");
let dig1, dig2;

function validateNumber()
{
    let num = Number(numInput.value);

    if(num < 0)
        num *= -1;

    if(num >= 10 && num <= 99)
    {
        dig2 = num % 10;
        dig1 = Math.floor(num / 10);

        if(dig1 % dig2 == 0)
        {
            textar.value = "The first digit is multiple of the second digit.";
        }
        else
        {
            textar.value = "The first digit isn't multiple of the second digit.";
        }

        if(dig2 % dig1 == 0)
        {
            textar.value += "The second digit is multiple of the first digit.";
        }
        else
        {
            textar.value += "The second digit isn't multiple of the first digit.";
        }
    }
    else
    {
        textar.value = "The written number doesn't have two digits. Please try again!";
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