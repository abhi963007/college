#!/bin/bash

echo -n "Enter the file name: "
read file

if [ -e "$file" ]; then
    echo "Content of $file:"
    cat "$file"
    echo "Reversed content:"
    tac -r "$file"
else
    echo "File does not exist."
fi

