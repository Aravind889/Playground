#include<stdio.h>
int main()
{
  float arc,pi=3.14,r,center;
  scanf("%f%f",&r,&center);
  arc = (2 * pi * r * center)/360;
  printf("%.2f",arc);
  return 0;
}