
from sympy import symbols, diff, solve, integrate
t = symbols('t')
s = t**3 - 6*t**2 + 9*t + 5
v = diff(s, t)
a = diff(v, t)
rest = solve(v, t)
start = int(input("Enter starting time: "))
end = int(input("Enter ending time: "))
area = integrate(s, (t, start, end))
print("Velocity:", v)
print("Acceleration:", a)
print("At rest when t =", rest)
print("Definite integral of displacement:", area)
