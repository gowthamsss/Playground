#include<stdio.h>
#include<string.h>
int main()
{
  char str[100];
  scanf("%[^\n]s", str);
  int len=strlen(str),i;
  for(i=0;i<len;i++)
  {
    if(str[i]=='a' || str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U')
       {
       continue;
       }
    else
       {
       printf("%c",str[i]);
       }
  }
  //Type your code here
  
  return 0;
}


