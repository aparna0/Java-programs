interface Owner {
void acquire(int a);
void dispose(int a);
}

class Person implement Owner{
int real = 10;
 int tangible = 10;
int intangible = 10;
void acquire(int a) {
     if(a== this.real)      this.real++;
     else if(a == tangible ) tangible++;
     else intangible++;
}
void dispose(int a) {
     if(a== this.real)      this.real--;
     else if(a == tangible ) tangible--;
     else intangible--;
}
}