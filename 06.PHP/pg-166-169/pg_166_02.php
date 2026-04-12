<?php
echo("");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPH<br>");
echo("READ AN INTEGER AND DETERMINE IF IT HAS THREE DIGITS<br>");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPH<br><br>");
echo("");

$num = 784;
echo($num . "<br><br>");

if($num < 0)
    {
        $num *= -1;
    }

if($num >= 100 and $num <= 999)
    {
        echo("The written number has 3 digits.");
    }
    else
        {
            echo("The written nomber doesn't have three digits.");
        }

?>