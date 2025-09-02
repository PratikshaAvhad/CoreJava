#Write a Python program to get a string from a given string where all occurrences of its first char 
#have been changed to '$', except the first char itself. Sample String: 'restart'  Expected 'resta$t' 

text = input("Enter a string: ")

first_char = text[0]        
result = first_char + text[1:].replace(first_char, '$')

print("Result:", result)
