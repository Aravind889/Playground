#include<stdio.h>
int main()
{
  int n,i=0,b[1000],j;
  scanf("%d",&n);
  while(n>0)
  {
    b[i]=n%2;
    n=n/2;
    i++;
  }
  for(j=i-1;j>=0;j--)
  {
    printf("%d",b[j]);
  }
  return 0;
}