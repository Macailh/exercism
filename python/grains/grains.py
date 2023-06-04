def square(number):
    if number >= 1 and number <= 64:
        cont = 0.5
        i = 1
        while i <= number:
            cont += cont
            i += 1

        return int(cont)
    else:
        raise ValueError("square must be between 1 and 64")


def total():
    num = square(64)
    num = num * 2
    num -= 1
    return int(num)
