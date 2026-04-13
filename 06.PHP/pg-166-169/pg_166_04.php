<?php

echo("");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHP<br>");
echo("READ AN TWO-DIGITS INTEGER AND DETERMINE THE SUM OF IS DIGITS<br>");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHP<br><br>");
echo("");

$digit = 0;
$sum = 0;
$num = 95;
echo($num . "<br><br>");


if($num < 0)
    {
        $num *= (-1);
    }

if($num >= 10 && $num <= 99)
    {
        $digit = $num % 10;
        $num = intdiv($num, 10);
        $sum = $num + $digit;
        echo("The sum of the two digits is {$sum}");
    }
else
    {
        echo("The written number doesn't have two digits. Please try again!");
    }

?>