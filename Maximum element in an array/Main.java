#include <stdio.h>
int main()
{
    int i, n,max;
    int arr[100];
    scanf("%d", &n);
    for(i = 0; i < n; i++)
    {
       scanf("%d", &arr[i]);
    }
    for(i = 1; i < n; ++i)
    {
      
       if(arr[0] < arr[i])
           arr[0] = arr[i];
    }
    printf("%d", arr[0]);
    return 0;
}