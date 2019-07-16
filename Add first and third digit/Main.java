#include<stdio.h>
int main()
{
  //Type your code here
  int a,b,c,d,e,n;
  scanf("%d",&n);
  a=n/10;
  b=a/10;
  c=n%100;
  d=c%10;
  e=b+d;
  printf("%d",e);
  return 0;
}