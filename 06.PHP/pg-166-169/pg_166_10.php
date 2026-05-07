<?php
echo("");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPPHPHPHPHPHPHPHPHPHPHPHPHPHPHP<br>");
echo("READ A TWO-DIGIT INTEGER AND DETERMINE IF BOTH DIGITS ARE THE SAME<br>");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPPHPHPHPHPHPHPHPHPHPHPHPHPHPHP<br><br>");
echo("");

echo("Write a two-digit integer: ");
$num = 8;
echo($num . "<br>");

if($num < 0)
    {
        $num *= -1;
    }

if($num >= 10 && $num <= 99)
    {
        $dig2 = $num % 10;
        $dig1 = intdiv ($num, 10); 

        if($dig1 == $dig2)
            {
                echo("Both digits are the same.");
            }
        else
            {
                echo("Both digits aren't the same.");
            }
    }
else
    {
        echo("The written number doesn't have two digits. Please try again!");
    }

?>