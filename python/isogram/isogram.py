def is_isogram(string):
    string = string.lower()
    letters = set()

    for letter in string:
        if letter == " " or letter == "-":
            continue

        if letter in letters:
            return False

        letters.add(letter)

    return True
