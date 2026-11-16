
from sympy import symbols, expand, factor, simplify, solve
x = symbols('x')
expression = (x + 2) * (x + 3)
print("Expanded:", expand(expression))
print("Factorized:", factor(x**2 + 5*x + 6))
print("Simplified:", simplify((x**2 - 4) / (x - 2)))
print("Solutions:", solve(x**2 - 5*x + 6, x))
