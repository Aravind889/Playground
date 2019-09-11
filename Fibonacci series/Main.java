#include<stdio.h>
int main()
{
  int i,n,a=0,b=1,c;
  scanf("%d",&n);
  printf("0 ");   
  for(i=2;i<=n;i++)
  {
    
    c = a + b;
    a = b;
    b = c;
    printf("%d ",a);
  }
  
}
 