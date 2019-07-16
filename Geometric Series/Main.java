#include<stdio.h>
#include<math.h>
int main()
{
  //type your code here
  int n,a;
  scanf("%d",&n);
  if(n==1 || n==2)
  {
    printf("1");
    return 0;
  }
  if(n%2==0)
  {
    n=(n/2)-1;
    a=pow(3,n);
    printf("%d",a);
  }
  else
  {
    n=n/2;
    a=pow(2,n);
    printf("%d",a);
  }
  return 0;
}