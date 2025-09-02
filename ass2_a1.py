#Write a python script which accepts 5 integer values and prints “DUPLICATES” if any of the 
#values entered are duplicates otherwise it prints “ALL UNIQUE”. Example: Let 5 integers are (32, 
#45, 90, 45, 6) then output “DUPLICATES” to be printed. 

num = []
for i in range(5):
    n = int(input(f"Enter integer {i+1}: "))
    num.append(n)

# Check  duplicates
if len(num) != len(set(num)):
    print("DUPLICATES")
else:
    print("ALL UNIQUE")
