def is_isogram(string):
    string = string.lower()
    letters = set()

    for letter in string:
        print(letter)
        if letter in letters:
            return False

        letters.add(letter)

    return True


print(is_isogram("six-year-old"))
print("----------------------------------------")
print(is_isogram("Emily Jung Schwartzkopf"))
print("----------------------------------------")
print(is_isogram("up-to-date"))
