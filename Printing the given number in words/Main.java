#include<stdio.h>
int main()
{
  int number;
  scanf("%d", &number);
  switch(number)
  {
    case 1:
      printf("one");
      break;
    case 2:
      printf("two");
      break;
    case 3:
      printf("Three");
      break;
    case 4:
      printf("four");
      break;
    case 5:
      printf("five");
      break;
    default:
      printf("Invalid");
      break;
  
  }
  return 0;
}