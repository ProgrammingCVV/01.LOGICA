console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJ");
console.log("READ A TWO-DIGITS INTEGER AND DETERMINE IF IT'S A PRIME AND NEGATIVE NUMBER");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJ");
console.log("");

let numInput = document.querySelector(".num");
let btnProof = document.querySelector(".btnProof");
let textar = document.querySelector(".textar");

function validateNumber()
{
    num = Number(numInput.value);
    let i = 2;
    let prime = true;

    if(num < 0)
    {
        textar.value = "The written number is negative ";
        num *= -1;
    }
    else
    {
        textar.value = "The written number is positive ";
    }

    if(num >= 10 && num <= 99)
    {
        while(i < num)
        {
            if(num % i == 0)
            {
                prime = false;
                break;
            }
            i += 1;
        }   
        if(prime)
        {
            textar.value += "and is prime.";
        }
        else
        {
            textar.value += "and isn't prime.";
        }
    }
    else
    {
        textar.value += "but doesn´t have two digits. Please try again!";
    }
}

btnProof.addEventListener("click", validateNumber);
numInput.addEventListener("keydown", function(event)
{
    if (event.key == "Enter")
    {
        validateNumber();
    }
});