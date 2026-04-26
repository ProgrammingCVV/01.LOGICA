<?php
echo("");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHP<br>");
echo("READ A TWO-DIGITS INTEGER AND DETERMINE IF IT'S A PRIME AND NEGATIVE NUMBER <br>");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHP<br><br>");
echo("");

$num = -9;
echo($num . "<br>");
$i = 2;
$prime = true;

if($num < 0)
    {
        echo("The written number is negative ");
        $num *= -1;
    }
    else 
        {
            echo("The written number is positive ");
        }
if($num >= 10 && $num <= 99)
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
                    echo("and is prime.");
                }
                else
                    {
                        echo("and isn't prime.");
                    }
    }
    else
        {
            echo("but doesn't have two-digits. Please try again!");
        }

?>