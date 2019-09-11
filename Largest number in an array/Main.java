#include<stdio.h>
int main()
{
        int size;
        scanf("%d",&size);
        int a[10];
        for(int i = 0; i < size; i++)
        {
            scanf("%d",&a[i]);
        }
        int max;
        if(a[0] > a[1])
        {
            max = a[0];
        }
        else{
             max = a[1];
        }
        for(int i = 2; i < size; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        printf("%d",max);
    return 0;
}