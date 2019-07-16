#include<stdio.h>
int main()
{
  	//type your code here
  int n,i,a,b,x=-1,y=-1;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
  scanf("%d%d",&a,&b);
  for(i=0;i<n;i++)
  {
    if(arr[i]==a)
      x=i;
  	if(arr[i]==b)
      y=i;
  }
  printf("Element 1 index = %d\n",x);
  printf("Element 2 index = %d",y);
}

