#include<stdio.h>
int main()
{
        int n;
        scanf("%d",&n);
        int a[10];
        for(int i = 0; i < n ; i++)
        {
            scanf("%d",&a[i]);
        }
        int elem1;
        scanf("%d",&elem1);
        int elem2;
        scanf("%d",&elem2);
        int elem_1_idx = 0;
        int elem_2_idx = -1;
        for(int i = 0; i < n; i++)
        {
            if(elem1 == a[i])
            {
                elem_1_idx = i;
            }
            if(elem2 == a[i])
            {
                elem_2_idx = i;
            }
        }
        printf("%d\n",elem_1_idx);
        printf("%d\n",elem_2_idx);
    return 0;
}