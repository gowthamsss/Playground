#include<stdio.h>

int main()
{
  int a,b,c,d,min;
  scanf("%d%d%d%d",&a,&b,&c,&d);
  if(a<b)
  {
    min=a;
  }
  else
  {
    min=b;
  }
  if(c<d)
  {
    if(c<min)
    {
      min=c;
    }
  }
  else
  {
    if(d<min)
    {
      min=d;
    }
  }
  printf("%d",min);
  return 0;
}