item(meats,foods,4).
item(dairyproducts,foods,1).
item(cereals,foods,2).
item(fruits,foods,3).

item(aerial,transport,3).
item(land,transport,4).
item(underground,transport,1).
item(marine,transport,2).

item(chairs,office,2).
item(tables,office,1).
item(utilery,office,3).
item(electrics,office,4).

item(cinema,entertainment,1).
item(discoteque,entertainment,2).
item(sports,entertainment,3).
item(culture,entertainment,4).

sum(X,X2,R):- R is X + X2.
add(A,B,N):- item(A,_,X), item(B,_,X2), sum(X,X2,N).
rest(X,X2,M):- M is X - X2.
menos(A,B,M):- item(A,_,X), item(B,_,X2), rest(X,X2,M).

group(A,X):- item(A,X,_).




