#include<stdio.h>
#include<string.h>
int main()
{
  char a[1000];
  int length;
  gets(a);
  length = strlen(a);
  printf("%d",length);
  
  return 0;
}