console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJ");
console.log("READ A TWO-DIGITS INTEGER LESS THAN 20 AND DETERMINE IF IT'S A PRIME NUMBER");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJ");
console.log("");

let numInput = document.querySelector("#num");
let btnProof = document.querySelector("#btnProof");
let textar = document.querySelector("#textar");

function validateNumber()
{
    let num = Number(numInput.value);
    let prime = true;

    if(num >= 10 && num < 20)
    {
        for(let i = 2; i < num; i++)
        {
            if(num % i == 0)
            {
                prime = false;
                break;
            }
        }
        if(prime)
                {
                    textar.value = "The written number is prime.";
                }
                else
                {
                    textar.value = "The written number isn't prime.";
                } 
    }
    else if(num <= 9 || num >= 100)
        {
            textar.value = "The written number doesn't have two digits. Please try again!";
        }
    else
        {
            textar.value = "The written number isn't less than 20.";
        }
    
}

    btnProof.addEventListener("click", validateNumber);
    numInput.addEventListener("keydown", function(event)
    {
        if(event.key == "Enter")
            {
                validateNumber();
            }
    });