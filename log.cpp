#include<stdio.h>
#include<stdlib.h>
#define LOG(LEVEL,FORMAT,...) printf(LEVEL); printf(FORMAT,__VA_ARGS__);
#define LOG_E(FORMAT,...) LOG("ERROR:",FORMAT,__VA_ARGS__);
#define LOG_W(FORMAT,...) LOG("WARN:",FORMAT,__VA_ARGS__);
#define LOG_I(FORMAT,...) LOG("INFO:",FORMAT,__VA_ARGS__);
#define LOG_D(FORMAT,...) LOG("DEBUG:",FORMAT,__VA_ARGS__);
#define FORM(FORMAT,...) printf(FORMAT,__VA_ARGS__);

int main() {
	LOG_E("%s,%d\n", "zhiyuan", 12344);
	LOG_W("%s,%d\n", "zhiyuan", 12344);
	LOG_I("%s,%d\n", "zhiyuan", 12344);
	LOG_D("%s,%d\n", "zhiyuan", 12344);
	FORM("hello %s\n", "format");
	system("pause");
	return 0;
}