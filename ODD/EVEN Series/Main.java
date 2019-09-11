#include<stdio.h>
#include<math.h>
int main()
{
  int odd,even,k=0,n,i,l=0;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
  if(i%2==1)
  {
    odd=odd+2;
    k++;
  }
  else
  {
    even=l+1;
    l++;
  }
  }
  if(n%2==1)
  {
    printf("%d",odd-2);
  }
  else
  {
   printf("%d",even-1);
  }
  return 0;
}