<?php
echo("");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHP<br>");
echo("READ AN INTEGER AND DISPLAY ALL EVEN NUMBERS BETWEEN ONE AND THE GIVEN NUMBER<br>");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHP<br><br>");
echo("");


echo("Write an integer: ");
$num = 33;
echo($num . "<br>");

if($num < 0)
    {
        $num *= -1;
    }
$i = 1;
/*
for($i=1; $i<=$num; $i++)
    {
        if($i % 2 == 0)
        {
            echo($i . ", ");
        }
    }
*/

while($i <= $num)
    {
        if($i % 2 == 0)
        {
            echo($i . "-");
        }
        $i ++;
    }
?>