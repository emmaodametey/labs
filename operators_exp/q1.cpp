# include <iostream>
// ((i<limit-1 && (c=getchar()) != '\n') && c != 'A')
int main(){
// (!(!(i<limit-1) || !(c=getchar()) == '\n') || !(c != 'A'))
    int i = 0; 
    int limit = 3;
    char c = 'a';

    if((i<limit-1 && (c=getchar()) != '\n') && c != 'A'){
       std::cout << "yes"<<std::endl;

    }
    else if(!(!(i<limit-1) || !(c=getchar()) == '\n') || !(c != 'A')){
        std::cout << "another yes" <<std::endl;
    }
    else{
        std::cout << "try again"<<std::endl;
    }
}

