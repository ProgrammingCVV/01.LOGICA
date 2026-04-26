<?php
echo("");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHP<br>");
echo("READ A TWO-DIGITS INTEGER LESS THAN 20 AND DETERMINE IF IT'S A PRIME NUMBER<br>");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHP<br><br>");
echo("");

$num = 11;
echo($num . "<br>");
$i = 2;
$prime = true;

if($num < 0)
    {
        $num *= -1;
    }

if($num >= 10 && $num < 20)
    {
        while($i < $num)
            {
                if($num % $i == 0)
                    {
                        $prime = false;
                        break;
                    }
                    $i++;
            }
            if($prime)
                {
                    echo("The written number is prime.");
                }
                else
                    {
                        echo("The written number isn't prime.");
                    }
    }
    else if($num <= 9 || $num >= 100)
        {
            echo("The written number doesn't have two-digits. Please try again!");
        }
    else
        {
            echo("The written number isn't less than 20.");
        }

?>