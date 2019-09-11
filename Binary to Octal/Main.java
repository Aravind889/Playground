#include<stdio.h>
#include<math.h>
int main()
{
  int n,i=0,rem,sum=0;
  scanf("%d",&n);
  while(n!=0)
  {
    rem = n%10;
    sum = sum + rem * pow(2,i);
    n = n/10;
    i++;
  }
  int b[1000],j;
  i=0;
  while(sum!=0)
  {
    b[i]=sum%8;
    sum=sum/8;
    i++;
  }
  for(j=i-1;j>=0;j--)
  {
    printf("%d",b[j]);
  }
  return 0;
}