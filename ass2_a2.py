#Write a python script to count the number of characters (character frequency) in a string. Sample 
#String : google.com'. Expected Result : {'o': 3, 'g': 2, '.': 1, 'e': 1, 'l': 1, 'm': 1, 'c': 1} 

s = input("Enter a string: ")

char_freq = {}

for ch in s:
    char_freq[ch] = char_freq.get(ch, 0) + 1


print("Character Frequency:", char_freq)
