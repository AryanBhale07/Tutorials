salaries = [25000, 40000, 35000, 52000, 30000] 
eligible = list(filter(lambda x: x < 40000, salaries)) 
updated = list(map(lambda x: x * 1.10 if x < 40000 else x, salaries)) 
print("Eligible salaries:", eligible) 
print("Updated salaries:", updated) 
print("Total salary expense:", sum(updated)) 
