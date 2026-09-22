console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("READ A THREE-DIGITS INTEGER AND DETERMINE THE POSITION OF THE DIGIT WITH THE HIGHEST VALUE");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJJSJSJSJSJSJSJSJ");
console.log("");

let numInput = document.querySelector(".num");
let btnProof = document.querySelector(".btnProof");
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

    if(num >= 100 && num <=999)
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

    if(dig1 > dig2 && dig1 > dig3)
    {
        textar.value = "The first digit is larger than the others.";
    }
    else if (dig2 > dig1 && dig2 > dig3)
    {
        textar.value = "The second digit is larger than the others.";
    }
    else if (dig3 > dig1 && dig3 > dig2)
    {
        textar.value = "The third digit is larger than the others.";
    }
    else
    {
        textar.value = "There are same digits.";
    }
}

btnProof.addEventListener("click", validateNumber);
numInput.addEventListener("keydown", function(event)
{
    if(event.key === "Enter")
    {
        validateNumber();
    }
}
);