#include <stdio.h>
int main() {
	int a, b = 0;
    scanf("%d",&a);
    while(a != 0)
    {
      int c = a % 10;
      b = b + c;
      a = a / 10;
    }
  printf("%d",b);
      
      
  
	return 0;
}