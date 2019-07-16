#include<stdio.h>

int main()
{
  //Type your code here
  char s[100];
  int count=0,i;
  gets(s);
  for(i=0;s[i]!='\0';i++)
  {
    if(s[i]==' ')
      count++;
  }
  printf("%d",count+1);
  return 0;
  
}