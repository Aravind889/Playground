#include<stdio.h>
int main()
{
  char a[50];
  int length,i,count=1;
  gets(a);
  length = strlen(a);
  if(length>20)
  {
    printf("Invalid Input");
  }
  else
  {
  for(i=0;i<length;i++)
  {
    if(a[i]==a[i+1])
    {
      count = count+1;
    }
    else
    {
      printf("%c%d",a[i],count);
      count=1;
    }
    }
  }
}