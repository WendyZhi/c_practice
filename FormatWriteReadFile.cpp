#include<stdio.h>
#include<stdlib.h>

int main() {

	/* write
	FILE *f;
	fopen_s(&f,"D:\data1.txt", "w");

	if (f) {
		for (int i = 0;i < 50;i++) {
			fprintf(f, "item %d\n", i + 1);
		}
	}
	else
	{
		printf("can not wirte to file");
	}
	*/

	/* read
	FILE *f;
	fopen_s(&f, "D:\data1.txt","r");
	for (int i = 0;i < 50;i++) {
		int num;
		fscanf_s(f,"item %d\n",&num);
		printf("num is %d\n", num);
	}
	*/

	system("pause");
	return 0;
}