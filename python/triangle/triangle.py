def equilateral(sides):
    return len(set(sides)) == 1 and triangle_inequality(sides)


def isosceles(sides):
    return len(set(sides)) <= 2 and triangle_inequality(sides)


def scalene(sides):
    return len(set(sides)) == 3 and triangle_inequality(sides)


def triangle_inequality(sides):
    return sides[0] + sides[1] >= sides[2] and sides[0] + sides[2] >= sides[1] and sides[1] + sides[2] >= sides[0] and all(side > 0 for side in sides)
