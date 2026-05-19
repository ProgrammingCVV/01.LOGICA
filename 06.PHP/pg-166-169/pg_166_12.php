<?php
echo("");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHP<br>");
echo("READ TWO TWO-DIGIT INTEGERS AND DETERMINE IF THEY BOTH HAVE DIGITS IN COMMON<br>");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHP<br><br>");
echo("");

$num1 = 82;
$num2 = 338;
$dig1 = $dig2 = $dig3 = $dig4 = 0;

echo("Write the first integer: " . $num1 . "<br>");
echo("Write the second integer: ". $num2 . "<br><br>");

if($num1 < 0)
    {
    $num1 *= -1;
    }

if($num2 < 0)
    {
    $num2 *= -1;
    }

if($num1 >= 10 && $num1 <= 99 && $num2 >= 10 && $num2 <= 99)
    {
    $dig4 = $num2 % 10;
    $dig3 = intdiv($num2, 10);
    $dig2 = $num1 % 10;
    $dig1 = intdiv($num1, 10);

    if($dig1 == $dig3 || $dig1 == $dig4 || $dig2 == $dig3 || $dig2 == $dig4)
        {
            echo("There are digits in common.");
        }
    else
        {
            echo("There are not digits in common.");
        }
    }
else
    {
        echo("Some of the written number doesn't have two digits. Please try again.");
    }
?>