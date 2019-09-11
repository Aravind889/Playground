#include <stdio.h>
int main() {
  char x;
  scanf("%c",x);
   x = getchar();
  if(islower(x))
  {
   x = toupper(x);
    printf("%c",x);
  }
  else
  {
    x = tolower(x);
    printf("%c",x);
  }
  return 0;
}