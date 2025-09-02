# Python script to display alternate characters of a string from both directions

text = input("Enter a string: ")
print("Alternate characters (Left to Right):", text[::2])
# Alternate characters from right to left
print("Alternate characters (Right to Left):", text[::-2])
