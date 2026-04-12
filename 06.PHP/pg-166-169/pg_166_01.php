<?php

echo("");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHP<br>");
echo("-------READ AN INTEGER AND DETERMINE IF IT'S LAST NUMBER IS FOUR-------<br>");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHP<br><br>");
echo("");

$num = 83833;
$four= 4;

echo($num . "<br><br>");

if($num < 0)
    {
        $num *= -1;
    }

if($num % 10 == 4)
    {
        echo("The last digit of your number is " . $four);
    }
    else
        {
            echo("The last digit of your number ISN'T " . $four);
        }

?>