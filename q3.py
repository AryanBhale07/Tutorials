prices = [500, 1200, 2500, 800, 1500] 
def discount(price): 
	if price > 1000:
		return price * 0.80
	return price
eligible = list(filter(lambda x: x > 1000, prices)) 
new_prices = list(map(discount, prices)) 
print("Original prices:", prices) 
print("Eligible prices:", eligible) 
print("Prices after discount:", new_prices) 
