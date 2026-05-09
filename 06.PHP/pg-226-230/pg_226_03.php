<?php
echo("");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHP<br>");
echo("READ AN INTEGER AND DISPLAY ALL ITS EXACT DIVISORS BETWEEN 1 AND THE GIVEN NUMBER<br>");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHP<br><br>");
echo("");

$i =1;
echo("Write an integer: ");
$num = 18;
echo($num . "<br>");

if($num < 0)
    {
        $num *= -1;
    }
/*
while($i <= $num)
    {
        if($num % $i == 0)
            {
                echo($i. ", ");
            }
    $i++;
    }
*/

for($i; $i <= $num; $i++)
    {
        if($num % $i == 0)
            {
                echo($i . ", ");
            }
    }


?>