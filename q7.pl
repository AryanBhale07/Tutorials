slot(s1, car, available). 
slot(s2, bike, occupied). 
slot(s3, car, available). 
slot(s4, bike, available). 
slot(s5, car, occupied). 
free_slot(Type, Slot) :- slot(Slot, Type, available). 
% Query: free_slot(car, Slot). 
% Answer: Slot = s1 ; Slot = s3. 
