<?php
echo("");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPH<br>");
echo("READ A TWO-DIGITS INTEGER AND DETERMINE IF ITS DIGITS ARE PRIMES<br>");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPH<br><br>");
echo("");

echo("Write a two-digits integer: <br>");

$num = -77;
echo($num . "<br>");

$prime1 = true;
$prime2 = true;
$i = 2;
$j = 2;

if($num < 0)
    {
        $num *= -1;
    }

if($num >= 10 && $num <= 99)
    {
        $dig2 = $num % 10;
        $dig1 = intdiv($num, 10);

        for($i=2; $i < $dig1; $i++)
            {
                if($dig1 % $i == 0)
                    {
                        $prime1 = false;
                        break;
                    }
            }

        for($j=2; $j < $dig2; $j++)
            {
                if($dig2 % $j == 0)
                    {
                        $prime2 = false;
                        break;
                    }
            }

        if($prime1)
            {
                echo("The first digit is prime ");
            }
            else
                {
                    echo("The first digit isn't prime ");
                }

        if($prime2)
            {
                echo("and the second digit is prime.");
            }
            else
                {
                    echo("and the second digit isn't prime.");
                }
    }
    else
        {
            echo("The written number doesn't have two digits. Please try again!");
        }
?>