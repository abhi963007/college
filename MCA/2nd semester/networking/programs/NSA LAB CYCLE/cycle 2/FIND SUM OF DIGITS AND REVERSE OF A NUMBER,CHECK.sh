#!/bin/bash

i=1
while test $i -gt 0
do
    echo -e "1. SUM OF DIGITS\n2. REVERSE OF A NUMBER\n3. PALINDROME\nEnter your choice: "
    read ch
    case $ch in
        1)
            echo "Enter the Number: "
            read a
            sum=0
            while test $a -gt 0
            do
                b=$(( a % 10 ))
                sum=$(( sum + b ))
                a=$(( a / 10 ))
            done
            echo "Sum of Digits = $sum"
            ;;
        2)
            echo "Enter a Number: "
            read c
            r=0
            while test $c -gt 0
            do
                d=$(( c % 10 ))
                r=$(( (r * 10) + d ))
                c=$(( c / 10 ))
            done
            echo "Reverse = $r"
            ;;
        3)
            echo "Enter a Number: "
            read n1
            re=0
            n2=$n1
            while test $n1 -gt 0
            do
                m=$(( n1 % 10 ))
                re=$(( (re * 10) + m ))
                n1=$(( n1 / 10 ))
            done
            if test $n2 -eq $re
            then
                echo "Number is Palindrome"
            else
                echo "Number is not Palindrome"
            fi
            ;;
        *)
            echo "Wrong Choice"
            ;;
    esac
    echo "Do you want to continue (y/n)"
    read ans
    if test $ans = "y"
    then
        i=$(( i + 1 ))
    else
        i=0
    fi
done

