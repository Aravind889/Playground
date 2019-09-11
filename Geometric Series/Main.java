#include<stdio.h>
#include<math.h>
int main()
{
  int odd,even,k=0,n,ans=0,i,l=0;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
  if(i%2==1)
  {
    odd=pow(2,k);
    k++;
    ans=odd;
    
  }
  else
  {
    even=pow(3,l);
    l++;
    ans = even;
  }
  }
    printf("%d",ans);
  
  return 0;
}