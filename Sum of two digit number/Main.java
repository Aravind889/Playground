#include<stdio.h>
int main()
{
  int a,b,c,d;
  scanf("%d%d",&a,&b);
  c = a / 10;
  d = a % 10;
  printf("%d", c+d);
  
  return 0;
}