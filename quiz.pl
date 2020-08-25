person(carlos,cooperation,5).
person(roberto,negotiation,3).
person(carla,adaptability,4).
person(alex,negotiation,3).
person(leo,leader,1).
person(vanessa,creative,2).
person(ana,adaptability,4).


colorSkill(cooperation,yellow).
colorSkill(adaptability,green).
colorSkill(creative,blue).
colorSkill(leader,red).
colorSkill(negotiation,white).

whoIs(X,X2):- person(X2,X,R).
whatColor(X,X2):- colorSkill(X,X2).
whoAreColor(X,X2):- colorSkill(S,X), person(X2,S,R).

getBest(C,G):- colorSkill(leader,C), person(X,leader,G).
getWorst(C,G):- colorSkill(cooperation,C), person(X,cooperation,G).
getRank(C,G):- getBest(C,J), getWorst(G,K).


