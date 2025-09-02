#Write a Python program to remove the characters which have odd index values of a given string.

text = input("Enter a string: ")


result = text[::2]
print("original string=",text)
print("String after removing odd index characters:", result)
