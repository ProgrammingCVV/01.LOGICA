<?php
echo("");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPPHPHPHPHPHPHPHPHPHPHPHPHPH<br>");
echo("READ A TOW-DIGITS INTEGER AND DETERMINE IF BOTH DIGITS ARE EVEN<br>");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPPHPHPHPHPHPHPHPHPHPHPHPHPH<br><br>");
echo("");

$num = 85   ;
$dig1 = 0;
$dig2 = 0;

echo($num . "<br>");

if($num < 0)
    {
        $num *= -1;
    }

if($num >= 10 & $num <=99)
    {
        $dig2 = $num % 10;
        $dig1 = intdiv($num, 10);

        if($dig1 % 2 == 0 & $dig2 % 2 == 0)
            {
                echo("Both digits are even.");
            }
            else
                {
                    echo("Both digits are not even.");
                }
    }
    else
        {
            echo("The written number doesn't have two digits. Please try again!");
        }
?>