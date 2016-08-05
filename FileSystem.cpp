#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main() {
	/*write file
	FILE *f;
	fopen_s(&f, "D:\data.txt", "w");
	if (f != NULL) {
		fputc('s',f);
		fputs("zhiyuan is the most beautiful girl in the world!",f);
	}else
		puts("cannot save file");
	*/
	/*read file*/
	FILE *f;
	fopen_s(&f,"D:\data.txt", "r");
	if (f) {
		//char ch = fgetc(f);
		//printf("%c\n", ch);
		/*char buf[100];
		fgets(buf, 90, f);
		puts(buf);
		*/
		char buf[100];
		memset(buf,0,100);
		for (int i = 0;i < 100;i++) {
			char ch = fgetc(f);
			if (ch != EOF) {
				buf[i] = ch;
			}
			else
				break;
		}
		printf("%s\n", buf);
		fclose(f);
	}
	else {
		printf("can not read the file\n");
	}
	system("pause");
	return 0;
}