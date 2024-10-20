//read char e output its content to the screen
#include <stdio.h>
/*
//primeira versao

int main()
{
	int c = getchar();
	while(c != EOF){
		putchar(c);
		getchar();
	}
}
*/
//segunda versao
int main()
{
	int c;
	while((c = getchar()) != EOF) {
		putchar(c);
	}
}