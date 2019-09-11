#include <stdio.h>
int main() {
  int i,j,n,num;
  scanf("%d",&n);
  num=n;
  for(i=1;i<=n;i++)
  {
    for(j=num;j>=1;j--)
    {
      printf("%d",j);
    }
    num--;
    printf("\n");
  }
	return 0;
}