#!/bin/bash

num=1
row=1

while [ $row -le 4 ]; do
    for (( i=1; i<=$row; i++ )); do
        echo -n "$num "
        num=$((num+1))
    done
    echo ""  # Add a new line after each row
    row=$((row+1))
done

