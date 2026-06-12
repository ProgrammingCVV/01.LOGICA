<?php

echo("");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPH<br>");
echo("READ TWO INTEGERS AND DISPLAY ALL THE NUMBERS ENDED IN 4 COMPRENDED BETWEEN THEM<br>");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPH<br><br>");
echo("");

$i = 1;
$j = 1;
$num1 = 25;
$num2 = 44;

echo("Write the first number: " . $num1 . "<br>");
echo("Write the second number: " . $num2 . "<br><br>");

/*
while($i <= $num1)
    {
        if($i % 10 == 4)
            {
                echo($i . ", ");
            }
        $i++;
    }

    echo("<br><br>");

    while($j <= $num2)
    {
        if($j % 10 == 4)
            {
                echo($j . ", ");
            }
        $j++;
    }
*/

for($i; $i<=$num1; $i++)
    {
        if($i % 10 == 4)
            {
                echo($i . ", ");
            }
    }

    echo("<br><br>");

    for($j; $j<=$num2; $j++)
    {
        if($j % 10 == 4)
            {
                echo($j . ", ");
            }
    }

?>