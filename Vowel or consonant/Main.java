#include <stdio.h>
 
int main()
{
  char ch;
 
  scanf("%c", &ch);

 
  if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch =='o' || ch=='O' || ch == 'u' || ch == 'U')
    printf("Vowel");
  else
    printf("Consonant");
     
  return 0;
}