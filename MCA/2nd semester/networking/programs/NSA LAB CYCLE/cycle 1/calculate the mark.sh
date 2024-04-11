#!/bin/bash

echo -n "Enter the limit: "
read n

for ((i=0; i<n; i++))
do
    echo -n "Enter the roll number: "
    read rn
    echo -n "Enter the name: "
    read name
    echo -n "Enter the marks: "
    read m1 m2 m3

    total=$(echo "$m1 + $m2 + $m3" | bc)
    per=$(echo "scale=2; $total*100/300" | bc)

    echo "MARK LIST"
    echo "--------------"
    echo "RollNo: $rn"
    echo "Name: $name"
    echo "Total: $total"
    echo "Percentage: $per"

    if (( $(echo "$per >= 80" | bc -l) )); then
        echo "Grade: A"
    elif (( $(echo "$per >= 70" | bc -l) )); then
        echo "Grade: B"
    elif (( $(echo "$per >= 60" | bc -l) )); then
        echo "Grade: C"
    else
        echo "Result: FAILED"
    fi
done

