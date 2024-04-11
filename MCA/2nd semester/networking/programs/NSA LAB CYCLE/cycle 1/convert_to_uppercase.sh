#!/bin/bash

# Prompt the user to enter the file name
echo "Enter the file name:"
read filename

# Check if the file exists
if [ -f "$filename" ]; then
    # Convert the contents of the file to uppercase and output to a new file
    tr '[:lower:]' '[:upper:]' < "$filename" > "${filename}_uppercase"
    echo "Contents of $filename have been converted to uppercase and saved in ${filename}_uppercase."
else
    echo "File $filename not found."
fi

