console.log("");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJ");
console.log("READ AN INTEGER AND DISPLAY ALL EVEN NUMBERS BETWEEN ONE AND THE GIVEN NUMBER");
console.log("JSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJSJ");
console.log("");

let numInput = document.querySelector("#num");
let bntProof = document.querySelector("#btnProof");
let textar = document.querySelector("#textar");

let i = 1;

function validateNumber()
{
    let num = Number(numInput.value);

    if(num < 0)
        {
            num *= -1;
        }
/*
    for(i=1; i<=num; i++)
        if(i % 2 == 0)
        {
            textar.value += (i+ ", ");
        }
*/

    while(i <= num)
    {
        if(i % 2 == 0)
        {
            textar.value += (i+ "-");
        }
        i++;
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