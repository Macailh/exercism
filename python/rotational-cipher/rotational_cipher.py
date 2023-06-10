def rotate(text, key):
    alphabet = 'abcdefghijklmnopqrstuvwxyz'
    shifted_alphabet = alphabet[key:] + alphabet[:key]
    ciphered_text = ''

    for char in text:
        if char.isalpha():
            if char.islower():
                index = alphabet.index(char)
                ciphered_text += shifted_alphabet[index]
            else:
                index = alphabet.upper().index(char)
                ciphered_text += shifted_alphabet.upper()[index]
        else:
            ciphered_text += char

    return ciphered_text
