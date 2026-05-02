<?php
echo("");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPH<br>");
echo("READ AN INTEGER AND DISPLAY ALL NUMBERS BETWEEN 1 AND THE GIVEN NUMBER<br>");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPH<br><br>");
echo("");

echo("Write an integer: <br>");
$num = 5;
echo($num . "<br>");

$i = 1;

if($num < 0)
    {
        $num *= -1;
    }
/*
while($i <= $num)
    {
        echo($i . ", ");
        $i++;
    }
*/

for($i; $i <= $num; $i++)
    {
        echo($i . " - ");
    }
?>