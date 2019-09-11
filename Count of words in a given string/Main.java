#include <stdio.h>
int main()
{
	char a[100];
	int len,i,word=1;
	gets(a);
	len=strlen(a);
	for(i=0;i<len;i++)
	{
		if(a[i]==' ')
			word=word+1;
	}
	printf("%d",word);
  return 0;
}