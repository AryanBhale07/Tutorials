from functools import reduce 
units = [8, 12, 6, 15, 11, 9, 14] 
def bill(readings): 
 return sum(readings) * 6 
high_days = list(filter(lambda x: x > 10, units)) 
daily_cost = list(map(lambda x: x * 6, units)) 
total_units = reduce(lambda a, b: a + b, units, 0) 
print("Days above 10 units:", high_days) 
print("Daily costs:", daily_cost) 
print("Total units:", total_units) 
print("Electricity bill: Rs.", bill(units)) 
