def translate(text):
    vowels = ['a', 'e', 'i', 'o', 'u']
    exceptions = ['y']
    consonant_clusters = ['xr', 'yt']
    words = text.split()

    translated_words = []
    for word in words:
        if word[0].lower() in vowels or word[:2] in consonant_clusters:
            translated_word = word + 'ay'
        elif word[:2] == 'qu':
            translated_word = word[2:] + word[:2] + 'ay'
        elif 'qu' in word:
            index = word.index('qu') + 2
            translated_word = word[index:] + word[:index] + 'ay'
        else:
            for i, char in enumerate(word[1:], start=1):
                if char in vowels or char in exceptions:
                    translated_word = word[i:] + word[:i] + 'ay'
                    break
            else:
                translated_word = word  # Si no se cumple ninguna regla, la palabra no se modifica

        translated_words.append(translated_word)

    return ' '.join(translated_words)
