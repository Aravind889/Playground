#include <stdio.h>
int main(){
	int i,j,n,num=0;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    
    for(j=1;j<=i;j++)
    {
      if(num%2==0)
      {
      printf("*");
        num=1;
      }
      else
      {
        printf("#");
        num=0;
      }
    }
    printf("\n");
  }
  	return 0;
}