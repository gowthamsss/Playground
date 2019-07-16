#include<stdio.h>
#include<string.h>

int main()
{
  // type your code here 
  char string1[100],string2[100],string3[100];
  scanf("%s", string1);
  scanf("%s", string2);
  scanf("%s", string3);
  int i,len1=strlen(string1),len2=strlen(string2),len3=strlen(string3);
  for(i=0;i<len1;i++)
  {
    if(string1[i]== 'a' || string1[i]== 'e'|| string1[i]== 'i' || string1[i]== 'o' || string1[i]== 'u'|| string1[i]== 'A' || string1[i]== 'E' || string1[i]== 'I' ||string1[i]== 'O' || string1[i]== 'U')
      printf("$");
    else
      printf("%c",string1[i]);
  }
  for(i=0;i<len2;i++)
  {
     if(string2[i]== 'a' || string2[i]== 'e'|| string2[i]== 'i' || string2[i]== 'o' || string2[i]== 'u'|| string2[i]== 'A' || string2[i]== 'E' || string2[i]== 'I' ||string2[i]== 'O' || string2[i]== 'U')
      printf("%c",string2[i]);
    else
      printf("#");  
  }
  for(i=0;i<len3;i++){
    if (string3[i] >= 'a' && string3[i] <= 'z') {
             printf("%c", string3[i]-32);
    }
    else
     	printf("%c",string3[i]); 
    
  }
  return 0;
}



