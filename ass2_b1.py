#Write a Python program to get a string made of the first 2 and the last 2 chars from a given a string. 
#If the string length is less than 2, return instead of the empty string. 
#Sample String : 'General12' 
#Expected Result : 'Ge12' 
#Sample String : 'Ka' 
#Expected Result : 'KaKa' 
#Sample String : ' K'  
#Expected Result : Empty String


text = input("Enter a string: ")

if len(text) < 2:
    result = ""
elif len(text) == 2:
    print(" repeat the string two times")
    result = text * 2
else:
    print(" first 2 and last 2 characters")
    result = text[:2] + text[-2:]

print("Result:", result)
