#!/bin/bash
i=1
while test $i -gt 0
do
echo -e"1.Contents of /etc/password\n2.List of output of ‘who’\n3.Present
working directory\n4.Exit\nEnter your choice"
read ch
case $ch in
1)cat /etc/passwd;;
2)who -a;;
3)pwd;;
4)exit;;
*)echo "Wrong choice";;
esac
done
