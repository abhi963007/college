#!/bin/bash

echo "Enter the limit"
read limit

echo "Fibonacci Sequence:"

# Initialize the first two numbers of the Fibonacci sequence
n1=0
n2=1

# Display the first two numbers of the sequence
echo "$n1"
echo "$n2"

# Generate and display the Fibonacci sequence
for ((i=2; i<limit; i++))
do
    n=$((n1 + n2))
    echo "$n"
    n1=$n2
    n2=$n
done

