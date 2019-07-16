#include<stdio.h>
int main()
{
  //Type your code here
  int n,a,b,c;
  scanf("%d",&n);
  a=n%1000;
  b=(a/10)%10;
  c=b%10;
  printf("%d",c);
  return 0;
}