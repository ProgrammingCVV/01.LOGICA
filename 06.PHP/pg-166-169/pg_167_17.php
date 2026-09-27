<?php
echo("");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHP<br>");
echo("READ A THREE-DIGITS INTEGER AND DETERMINE THE POSITION OF THE DIGIT WITH THE HIGHEST VALUE<br>");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHP<br><br>");
echo("");

echo("Write a three-digits integer: ");
$num = 355;
echo($num . "<br><br>");

if($num < 0)
    {
        $num *= -1;
    }

if($num > 100 && $num < 999)
    {
        $dig3 = $num % 10;
        $dig2 = intDiv($num, 10) % 10;
        $dig1 = intDiv($num, 100) % 10;

        if($dig1 > $dig2 && $dig1 > $dig3)
            {
                echo("The first digit is higher than the others.");
            }
        else if($dig2 > $dig1 && $dig2 > $dig3)
            {
                echo("The second digit is igher than the others.");
            }
        else if($dig3 > $dig1 && $dig3 > $dig2)
            {
                echo("The third digit is higher than the others.");
            }
        else if($dig1 == $dig2 || $dig2 == $dig3)
            {
                echo("All the digits or two digits are the same.");
            }
    }
else
    {
        echo("The written number doesn't have three digits. Please try again!");
    }
?>