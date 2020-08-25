habla(carlos,ruso).
habla(ana,ingles).
habla(roberto,ruso).
habla(jean,ingles).
habla(ana,ruso).

hablacon(P1,P2) :- habla(P1,X), habla(P2,X), P1 \= P2.



progenitor(clara,pedro).
progenitor(pedro,jose).
progenitor(ana,clara).
progenitor(jose,clara).

abuelos(X,Y):- progenitor(X,X2), progenitor(X2,Y).

bisabuelos(X,Y):- progenitor(X,X2), abuelos(X2,Y).



object(value1,5).
object(value2,3).
object(value3,10).
object(value4,5).
object(value5,23).
object(value6,19).
object(value7,2).
object(value8,6).



suma(X,X2,R):- R is X + X2.
subtract(X,X2,R):- R is X - X2.
multiplication(X,X2,R):- R is X * X2.
division(X,X2,R):- R is X / X2.

findValue(X,Value):- object(X,V), Value = V.

sumFindValue(Value1,Value2,Result):- findValue(Value1, X), findValue(Value2,Y), suma(X,Y,Result).
subFindValue(Value1,Value2,Result):- findValue(Value1, X), findValue(Value2,Y), subtract(X,Y,Result).
multFindValue(Value1,Value2,Result):- findValue(Value1, X), findValue(Value2,Y), multiplication(X,Y,Result).
divFindValue(Value1,Value2,Result):- findValue(Value1, X), findValue(Value2,Y), division(X,Y,Result).



conexion(d,h,4).
conexion(d,i,2).
conexion(h,f,9).
conexion(i,f,11).
conexion(f,g,10).
conexion(f,a,8).
conexion(a,b,7).

canGo(X,X2,X3):- conexion(X,X2,X3).
tieneV(X):- conexion(X,X2,X3).
findCost(X,C):- conexion(X,X2,X3), C = X3.
findSecondCost(X,Y,Cs):- conexion(X,Y,S), conexion(Y,T,X2), Cs = X2.

where(X,Y,Z,S):- findCost(X,C), findSecondCost(X,Y,Cs), S is C + Cs.
whereCost(X,Y,Z,S):- conexion(X,Z,C1), conexion(Z,Y,C2), S is C1 + C2.

