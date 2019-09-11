#include<stdio.h>
int natural(int n)
{
  int sum;
  for(int i=1;i<=n;i++)
  {
    sum = sum + i;
  }
  return sum;
}
int main() 
{
  int a,n;
  scanf("%d",&n);
  a=natural(n);
  printf("%d",a);
  	return 0;
}