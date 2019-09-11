#include<stdio.h>
int square(int s)
{
  int ans = s * s;
  return ans;
}
int main() 
{
  int s,ans1;
  scanf("%d",&s);
  ans1 = square(s);
  printf("%d",ans1);
   return 0;
}