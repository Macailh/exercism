def is_pangram(sentence):
    alphabet_lowercase = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                          'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}

    return alphabet_lowercase <= set(sentence.lower())


print(is_pangram("the quick brown fox jumps over the lazy dog"))
