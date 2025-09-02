# Python program to count vowels and consonants in a string

text = input("Enter a string: ")
vowels = "aeiouAEIOU"
vowel_count = 0
consonant_count = 0

for ch in text:
    if ch.isalpha():  
        if ch in vowels:
            vowel_count += 1
        else:
            consonant_count += 1


print("Number of vowels:", vowel_count)
print("Number of consonants:", consonant_count)
