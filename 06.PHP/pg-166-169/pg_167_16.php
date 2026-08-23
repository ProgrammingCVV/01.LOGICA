<?php
echo("");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPH<br>");
echo("READ A THREE-DIGITS INTEGER AND DETERMINE IF LEAST TWO OF THE THREE ARE THE SAME<br>");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPH<br><br>");
echo("");

echo("Write a three-digit integer: ");

$dig1 = 0;
$dig2 = 0;
$dig3 = 0;

$num = 877;
echo($num . "<br>");

if($num < 0)
    {
        $num *= -1;
    }

if($num > 100 && $num < 999)
    {
        $dig3 = $num % 10;
        $dig2 = intDiv($num, 10) % 10;
        $dig1 = intDiv($num, 100) % 10;

        echo("<br><br>");
    }
else
    {
        echo("The written number doesn't have three digits. Please try again!<br><br>");
    }

if($dig1 == $dig2)
    {
        echo("The first and second digits are the same.");
    }
elseif($dig1 == $dig3)
{
    echo("The first and third digits are the same.");
}
elseif($dig2 == $dig3)
    {
        echo("The second and third digit are the same.");
    }
else
    {
        echo("None of the digits are rhe same.");
    }

?>