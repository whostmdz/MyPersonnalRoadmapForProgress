#include "count_char.h"
#include <stdio.h>
#include <stdlib.h>
#include <assert.h>


int main() 
{
    assert(count_char("banana", 'a') == 3);
    assert(count_char("", 'a') == 0);
    assert(count_char("xyz", 'a') == 0);
    assert(count_char("a a a", 'a') == 3);
    printf("C'EST TOUT BON\n");
    return 0;

}
