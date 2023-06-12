"""
This exercise stub and the test suite contain several enumerated constants.

Since Python 2 does not have the enum module, the idiomatic way to write
enumerated constants has traditionally been a NAME assigned to an arbitrary,
but unique value. An integer is traditionally used because it’s memory
efficient.
It is a common practice to export both constants and functions that work with
those constants (ex. the constants in the os, subprocess and re modules).

You can learn more here: https://en.wikipedia.org/wiki/Enumerated_type
"""

# Possible sublist categories.
# Change the values as you see fit.
SUBLIST = 1
SUPERLIST = 2
EQUAL = 3
UNEQUAL = 0


def sublist(list_one, list_two):
    res = 0
    a = len(list_one)
    b = len(list_two)
    if a <= b:
        for i in range(b-a+1):
            if list_two[i:i+a] == list_one:
                res += 1
                break
    if b <= a:
        for i in range(a-b+1):
            if list_one[i:i+b] == list_two:
                res += 2
                break
    return res
