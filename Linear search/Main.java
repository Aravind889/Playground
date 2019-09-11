#include<stdio.h>
int main()
{
    int n,i,j,a,arr[n],b=0,c;
    scanf("%d",&n);
    for(i=0;i<=n-1;i++)
    {
       scanf("%d",&arr[i]);
    }
    scanf("%d",&a);
    for(i=0;i<=n-1;i++)
    {
        if(arr[i]==a)
        {
          b++;
          c=i;
          break;
        }
    }
    if(b==1)
    printf("%d",c+1);
    else 
        printf("%d isn't present in the array.",a);
        
    return 0;
}