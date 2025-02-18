vowels = ['a', 'e', 'i', 'o','u']
word = input('Enter a word: ')
count = 0
for i in range(len(vowels)):
    for letter in word:
        if i == letter:
            count +=1
            