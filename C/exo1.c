#include <stdio.h>

int main(int argc, char *argv[])
{
  int i;
  for(i=0; i < argc; i++)  // i is initialised to 0 to get the first
  {
    printf("argv[%d] = %s\n",i,argv[i]);
  }
  return 0;
}
