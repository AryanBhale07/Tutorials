
python_pass(arun).
python_pass(bala).
python_pass(charan).
ds_pass(arun).
ds_pass(charan).
ds_pass(divya).

eligible(X) :- python_pass(X), ds_pass(X).

% Query: eligible(X).
% Answer: X = arun ; X = charan.
