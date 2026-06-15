console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJ");
console.log("READ THREE-DIGITS INTEGER AND DISPLAY ALL THE NUMBERS COMPRENDED BETWEEN 1 AND EACH ONE OF THE DIGITS");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJ");
console.log("");

let numInput = document.querySelector("#num");
let btnProof = document.querySelector("#btnProof");
let textar = document.querySelector("#textar");

function validateNumber()
{
    let num = Number(numInput.value);
    let dig1 = 0;
    let dig2 = 0;
    let dig3 = 0;
    let i = 1;
    let j = 1;
    let k = 1;

    if(num >= 100 && num <= 999)
    {
        dig1 = Math.floor(num / 100) % 10;
        dig2 = Math.floor(num / 10) % 10;
        dig3 = num - (Math.floor(num / 10 ) * 10);
       // textar.value = (dig1 + "" + dig2 + "" + dig3);
        
        while(i <= dig1)
        {
            textar.value += (i);
            i++;
        }

        textar.value += "\n";

        while(j <= dig2)
        {
            textar.value += (j);
            j++;
        }

        textar.value += "\n";

        while(k <= dig3)
        {
            textar.value += (k);
            k++;
        }
        
    }
    else
    {
        textar.value = "The writen number doesn't have three digits. Please try again!";
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