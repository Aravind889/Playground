#include<stdio.h>
int main()
{
  float dia,pi=3.14,area;
  scanf("%f",&dia);
  area=pi*(dia/2)*(dia/2);
  printf("%.2f",area);
  return 0;
}