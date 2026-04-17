console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJJSJSJSJSJSJSJSJS");
console.log("READ A TWO-DIGIT INTEGER AND DETERMINE IF BOTH ARE EVEN");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJJSJSJSJSJSJSJSJS");
console.log("");

let numInput = document.querySelector(".num");
let btnProof = document.querySelector(".btnProof");
let textar = document.querySelector(".textar");

let dig1 = 0;
let dig2 = 0;

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
        dig1 = Math.floor(num / 10);

        if(dig1 % 2 == 0 && dig2 % 2 == 0)
        {
            textar.value = ("Both digits are even.");
        }
        else
            {
                textar.value = ("Both digits are not even.")
            }
    }
    else
    {
        textar.value = ("The written number desn't have two digits. Try again please!");
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

