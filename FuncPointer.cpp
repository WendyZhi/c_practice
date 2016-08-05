#include<stdio.h>
#include<stdlib.h>
typedef struct _Student {
	char *number;
	char *name;
	int course1;
	int course2;
	int course3;
	int average;
}Student;

Student* creatStudent(char *number,char *name,int course1,int course2,int course3,int average) {
	Student * s=(Student*)malloc(sizeof(Student));
	s->number = number;
	s->name = name;
	s->course1 = course1;
	s->course2 = course2;
	s->course3 = course3;
	s->average = average;
	//printf("number=%s,name=%s,course1=%d,course2=%d,course3=%d,average=%d\n", s->number, s->name, s->course1, s->course2, s->course3, s->average);
	return s;
}
void deleteStudent(Student *p){
	free(p);
	printf("delete successfully\n");
}
Student* compareStudent(Student*s1, Student*s2) {
	Student*p;

	if (s1->average > s2->average) {
		p = s1;
	}
	else
	{
		p = s2;
	}
	printf("number=%s,name=%s,course1=%d,course2=%d,course3=%d,average=%d\n", p->number, p->name, p->course1, p->course2, p->course3, p->average);
	return p;

}
int main(){
	Student*s1, *s2,*s3,*s4,*s5;
	s5 = creatStudent("000", "zhiyuan1", 100, 100, 100, 100);
	s2 = creatStudent("001", "zhiyuan2", 10, 10, 10, 80);
	s3 = creatStudent("002", "zhiyuan3", 100, 100, 100, 70);
	s4 = creatStudent("003", "zhiyuan4", 10, 10, 10, 60);
	s1 = creatStudent("004", "zhiyuan5", 100, 100, 100, 50);
	compareStudent(s5, (compareStudent(s4, compareStudent(s3, compareStudent(s2, s1)))));
	system("pause");
	return 0;
}

