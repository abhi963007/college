
ls=[]
n=int(input("Enter limit:"))
for i in range(n):
    ls.append(int(input("Enter element: ")))
print("Unsorted list: ",ls)
for i in range(n):
    for j in range(i+1,n):
        if ls[i]>ls[j]:
            temp=ls[i]
            ls[i]=ls[j]
            ls[j]=temp
print("Sorted list",ls)
