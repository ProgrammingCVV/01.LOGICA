<?php
echo("");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPH<br>");
echo("READ TWO INTEGERS AND DISPLAY ALL NUMBERS BETWEEN THEM<br>");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPH<br><br>");
echo("");

echo("Write the first number: ");
$num1 = 5;
echo($num1. "<br>");
echo("Write the second number: ");
$num2 =9;
echo($num2. "<br>");

if($num1 < 0)
    $num1 *= -1;
if($num2 < 0)
    $num2 *= -1;

$i = 1;
$j = 1;

/*
for($i=1; $i<=$num1; $i++)
    echo($i. "-");

echo("<br><br>");

for($j=1; $j<=$num2; $j++)
    echo($j. "-");
*/
echo("<br>");
while($i <= $num1)
    {
        echo($i. "-");
        $i++;
    }

echo("<br>");

while($j <= $num2)
    {
        echo($j. "-");
        $j++;
    }

?>