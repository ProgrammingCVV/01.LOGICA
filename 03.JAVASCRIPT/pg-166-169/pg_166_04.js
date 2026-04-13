console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJ");
console.log("READ TWO-DIGITS INTEGER AND DETERMINE THE SUM OF ITS DIGITS");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJ");
console.log("");

let numInput = document.querySelector(".num");
let button = document.querySelector(".btnProof");
let textar = document.querySelector(".textar");

digit = 0;
sum = 0;

function evaluateNumber()
{
    let num = Number(numInput.value);

    if(num < 0)
    {
        num *= (-1);
    }

    if(num >= 10 && num <= 99)
    {
        digit = num % 10;
        num = Math.floor(num / 10);
        sum = num + digit;
        textar.value = ("The sum of the two digits is "+ sum);
    }
    else
    {
        textar.value = ("The written number doesn't have two digits. Please try again!");
    }
}
    button.addEventListener("click", evaluateNumber);
    numInput.addEventListener("keydown", function(event)
{
    if(event.key === "Enter")
    {
        evaluateNumber();
    }
});