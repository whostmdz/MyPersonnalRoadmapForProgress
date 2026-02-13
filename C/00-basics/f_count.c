#include <stdio.h>

int compter(char *chaine){
  int cpt= 0;
  for(int i = 0; chaine[i] != '\0'; i++){
    cpt++;
  }
  return cpt;
}

int main(){
  printf("%d\n", compter("test"));
  return 0;
}
