#include<stdio.h>
int power(int base,int exp)
{
  int pow=1;
  for(int i=1;i<=exp;i++)
  {
    pow = pow * base;
  }
  return pow;
}
int main(){
  int base,exp;
  scanf("%d %d",&base,&exp);
  printf("%d",power(base,exp));
  	return 0;
}
