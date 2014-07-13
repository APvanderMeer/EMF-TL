:- lib(propia).
:- lib(ic_symbolic).
:- local domain(basetype(nat,int,real,string,bool)).
:- local struct(functiontype(formalparameters,returntype)).
:- local struct(listtype(elementtype)).
:- local struct(arraytype(elementtype,size)).

hastype(N,Ts,T) :- typeof(N,Ts), arg(N,Ts,T).

typeall(Ts) :- dim(Ts,[4]),
               (
               for(I,1,4),
               param(Ts)
               do
               typeof(I,Ts)
               ).
typeof(1,Ts) :- arg(1,Ts,V1),arg(4,Ts,V2),V2 = functiontype{formalparameters:V3,returntype:V1},V3 = a(V4,V5),arg(3,Ts,V5),arg(2,Ts,V4).
typeof(2,Ts):-arg(2,Ts,nat).
typeof(2,Ts):-arg(2,Ts,int).
typeof(2,Ts):-arg(2,Ts,real).
typeof(3,Ts):-arg(3,Ts,nat).
typeof(3,Ts):-arg(3,Ts,int).
typeof(3,Ts):-arg(3,Ts,real).
typeof(4,Ts) :- arg(4,Ts,functiontype{formalparameters:a(string,string),returntype:string}).
typeof(4,Ts) :- arg(4,Ts,functiontype{formalparameters:a(int,int),returntype:int}).
