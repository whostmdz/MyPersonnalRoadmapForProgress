#include <stdio.h>

int count_char(const char *s, char c){
  int i;
  int cpt=0;
  for(i=0; s[i]!='\0'; i++){
    if(c == s[i]){
      cpt++;
    }
  }
  return cpt;
}


