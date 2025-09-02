#Write a python program to count repeated characters in a string. 
#Sample string: 'thequickbrownfoxjumpsoverthelazydog' 
#Expected output: 
#o 4 
#e 3 
#u 2 
#h 2 
#r 2 
#t 2


text = "hellobba(ca)"

count = {}

for ch in text:
    count[ch] = count.get(ch, 0) + 1

print("Repeated characters:")
for ch in count:
    if count[ch] > 1:
        print(ch, count[ch])
