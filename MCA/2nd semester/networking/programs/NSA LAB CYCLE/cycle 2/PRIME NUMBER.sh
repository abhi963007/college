#!/bin/bash

echo "Enter the number"
read n

i=2
s=0

while [ $i -le $((n/2)) ]
do
    if [ $((n%i)) -eq 0 ]
    then
        s=1
        break
    fi
    i=$((i+1))
done

if [ $n -eq 1 ]
then
    echo "Not prime"
elif [ $s -eq 0 ]
then
    echo "Prime Number"
else
    echo "Not prime"
fi

