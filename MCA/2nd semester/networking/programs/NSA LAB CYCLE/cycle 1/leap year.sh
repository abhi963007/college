#!/bin/bash

yr=$1

# Check if no argument is provided, use the current year
if [ $# -eq 0 ]; then
    yr=$(date +"%Y")
fi

# Check if the year is divisible by 4, 100, and 400
a=$((yr % 4))
b=$((yr % 100))
c=$((yr % 400))

# Check if it's a leap year
if [ $a -eq 0 -a $b -ne 0 ] || [ $c -eq 0 ]; then
    echo "$yr is a leap year"
else
    echo "$yr is not a leap year"
fi

