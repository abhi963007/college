

a=int(input("Enter first :"))
b=int(input("Enter second:"))
ls=[]
for i in range(1,min(a,b)+1):
    if a%i==0 and b%i==0:
        ls.append(i)
print("GCD is ",max(ls))
