#!/bin/bash

# List files in the current directory with detailed information
# Filter to include only files with read, write, and execute permissions for the owner
# Extract filenames of those files

ls -l | grep "^-rwx" | tr -s " " | cut -d " " -f 9

