console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("READ A TWO-DIGITS INTEGER AND DETERMINE IF ITS DIGITS ARE PRIMES");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJS");
console.log("");

let numInput = document.querySelector("#num");
let btnProof = document.querySelector("#btnProof");
let textar = document.querySelector("#textar");

function validateNumber()
{
    let num = Number(numInput.value);
    let prime1 = true;
    let prime2 = true;
    let dig1, dig2, i, j;

    if(num < 0 )
    {
        num *= -1;
    }

    if(num >= 10 && num <= 99)
    {
        dig2 = num % 10;
        dig1 = Math.floor(num / 10);

        for(i = 2; i < dig1; i++)
        {
            if(dig1 % i == 0)
            {
                prime1 = false;
                break;
            }
        }

        for(j = 2; j < dig2; j++)
        {
            if(dig2 % j == 0)
            {
                prime2 = false;
                break;
            }
        }

        if(prime1)
        {
            textar.value = "The first digit is prime ";
        }
        else
        {
            textar.value = "The first digit isn't prime ";
        }

        if(prime2)
        {
            textar.value += "and the second digit is prime.";
        }
        else
        {
            textar.value += "and the second digit isn't prime.";
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