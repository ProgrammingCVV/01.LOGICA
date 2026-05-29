<?php

echo("");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPH<br>");
echo("READ TWO TWO-DIGIT INTEGERS AND DETERMINE IF THE SUM OF BOTH INTEGERS PRODUCE AN EVEN NUMBER<br>");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPH<br><br>");
echo("");

echo("Write the first integer: ");
$num1 = 73;
echo($num1."<br>");

echo("Write the first integer: ");
$num2 = 12;
echo($num2."<br><br>");

if($num1 < 0)
    {
        $num1 *= -1;
    }
if($num2 < 0)
    {
        $num2 *= -1;
    }

if(($num1 >= 10 && $num1 <= 99) && ($num2 >= 10 && $num2 <= 99))
    {
        $sum = $num1 + $num2;

        if($sum % 2 == 0)
            {
                echo("THE SUM OF BOTH INTEGERS (".$sum.") PRODUCES AN EVEN NUMBER");
            }
            else
                {
                    echo("THE SUM OF BOTH INTEGERS (".$sum.") DOESN'T PRODUCE AN EVEN NUMBER");
                }
    }
    else
        {
            echo("Some of the written numbers doesn't have two digits. Pleas try again!");
        }
?>