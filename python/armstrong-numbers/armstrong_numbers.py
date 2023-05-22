def is_armstrong_number(number):
    digits = [int(d) for d in str(number)]
    return sum([d ** len(digits) for d in digits]) == number
