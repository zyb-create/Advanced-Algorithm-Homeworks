clc,clear;

w=[1 2 6 6 6];
n=3;  #机器数量
m=5;  #工作数量
len=n*m;
Aeq=zeros(m,len);
for i=1:m
   #Aeq(i,i)=1;
   Aeq(i,i:m:end)=1;
   #Aeq(i,i+5)=1;
   #Aeq(i,i+10)=1;
end
[x,f] = fmincon(@(x)fun(x,w,m,n),[ones(1,m),zeros(1,(n-1)*m)],[],[],Aeq,ones(m,1),zeros(len,1),ones(len,1));


function f=fun(x,w,m,n)
f=sum(x(1:m).*w);
for i=2:n
    m=sum(x((i-1)*m+1:i*m).*w);
    f=max(f,m);
end
end