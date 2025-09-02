#Write a python script to create a list and display the list element in reverse order
my_list = [10, 20, 30, 40, 50]
print("Original List:", my_list)
print("Reversed List:")
for item in reversed(my_list):
    print(item,end=" ")

print("\n using slicing:",my_list[::-1])

