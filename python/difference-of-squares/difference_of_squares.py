def square_of_sum(number):
    digits = [i for i in range(1, number + 1)]
    return sum(digits) ** 2


def sum_of_squares(number):
    digits = [i ** 2 for i in range(1, number + 1)]
    return sum(digits)


def difference_of_squares(number):
    return square_of_sum(number) - sum_of_squares(number)
