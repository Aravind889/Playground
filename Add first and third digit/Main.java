#include<stdio.h>
int main()
{
  int num;
  int first;
  int third;
  scanf("%d",&num);
  first = num /100;
  third = num % 10;
  num = first + third;
  printf("%d",num);
  return 0;
}