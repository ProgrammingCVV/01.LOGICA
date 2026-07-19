<?php
echo("");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHP<br>");
echo("READ A THREE-DIGITS INTEGER AND DETERMINE THE SUM OF ITS DIGITS<br>");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHP<br>");
echo("<br>");

$num = 723;
$dig1;
$dig2;
$dig3;

echo("Write a three-digits integer: ");
echo($num);

if($num < 0)
    {
        $num *= -1;
    }

if($num > 100 && $num < 999)
    {
        $dig3 = $num % 10;
        $dig2 = intdiv ($num, 10) % 10;
        $dig1 = intdiv ($num, 100) % 10;

        echo("<br><br>");
        $sum = $dig1 + $dig2 + $dig3;
        echo("The sum of all digits is: ". $sum);
    }
?>