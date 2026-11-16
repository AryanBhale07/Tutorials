from functools import reduce 
marks = [45, 67, 92, 38, 98] 
passed = list(filter(lambda x: x >= 50, marks)) 
new_marks = list(map(lambda x: min(x + 5, 100), marks)) 
total = reduce(lambda a, b: a + b, new_marks, 0) 
print("Students with 50 or more:", passed) 
print("Marks after grace:", new_marks) 
print("Total marks:", total) 
