#include<stdio.h>
#include<math.h>
int main()
{
  float hyp,opp,adj;
  scanf("%f%f",&opp,&adj);
  hyp = sqrt((opp*opp)+(adj*adj));
  printf("%.2f",hyp);
  return 0;
}