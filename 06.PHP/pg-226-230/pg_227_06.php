<?php
echo("");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHP<br>");
echo("READ THREE-DIGITS INTEGER AND DISPLAY ALL THE NUMBERS COMPRENDED BETWEEN 1 AND EACH ONE OF THE DIGITS<br>");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHP<br><br>");
echo("");

echo("Write an integer with three digits: ");
$num = 862;
echo($num . "<br><br>");

$dig1 = 0;
$dig2 = 0;
$dig3 = 0;
$i = 1;
$j = 1;
$k = 1;

if($num < 0)
    {
        $num *= -1;
    }

if($num >= 100 && $num <= 999)
    {
        $dig1 = intdiv($num, 100) % 10;
        $dig2 = intdiv($num, 10) % 10;
        $dig3 = $num - (intdiv($num, 10) * 10);


        while($i <= $dig1)
            {
                echo($i);
                $i++;
            }

        echo("<br><br>");
        
        while($j <= $dig2)
            {
                echo($j);
                $j++;
            }

        echo("<br><br>");

        while($k <= $dig3)
            {
                echo($k);
                $k++;
            }
    }
    else
        {
            echo("The written numbres doesn't have three digits. Please try again!");
        }

?>