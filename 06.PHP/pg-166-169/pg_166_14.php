<?
echo("");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPH<br>");
echo("READ TWO TWO-DIGIT INTEGERS AND DEETERMINE THE SUM OF ALL THE DIGITS<br>");
echo("PHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPHPH<br><br>");
echo("");

$num1 = 34;
$num2 = 24;

echo("Write the first integer: " . $num1 . "<br>");

echo("Write the second integer: " . $num2 . "<br>");

if($num1 < 0)
    {
        $num1 *= -1;
    }

if($num2 < 0)
    {
        $num2 *= -1;
    }

if($num1 > 10 && $num1 < 99)
    {
        $dig2 = $num1 % 10;
        $dig1 = intdiv($num1, 10);
    }
    else
        {
            echo("The written number doesn't have two digits. Please try again!");
        }

if($num2 > 10 && $num2 <99)
    {
        $dig4 = $num2 % 10;
        $dig3 = intdiv($num2, 10);
    }
    else
        {
            echo("The written number doesn't have two digits. Please try again!");
        }

echo("The sum of all digits is " . ($dig1 + $dig2 + $dig3 + $dig4));

?>