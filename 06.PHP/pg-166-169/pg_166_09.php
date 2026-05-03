<?php
echo("");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPH<br>");
echo("READ A TWO-DIGII INTEGER AND DETERMINE IF ONE OF ITS DIGITS IS A MULTIPLE OF THE OTHER<br>");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPH<br><br>");
echo("");

echo("Write a two-digit integer: <br>");
$num = 9;
echo($num ."<br>");

if($num < 0)
    {
        $num *= -1;
    }

if($num >= 10 && $num <= 99)
    {
        $dig2 = $num % 10;
        $dig1 = intdiv($num, 10);

        if($dig1 % $dig2 == 0)
            {
                echo("The first digit is multiple of the second digit.");
            }
            else
                {
                    echo("The first digit isn't multiple of the second digit.");               
                }
        if($dig2 % $dig1 == 0)
            {
                echo("The second digit is multiple of the first digit.");
            }
            else
                {
                    echo("The second digit isn't multiple of the first digit.");
                }
    }
    else
        {
            echo("The written number doesn't have two digits. Please try again!");
        }
?>