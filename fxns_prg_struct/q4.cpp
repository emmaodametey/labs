# include <iostream>


void funct(char sentence[1000], int start = 0, int length = -1){
    sentence += start;
    while(length > 0){
        std::cout << *sentence;
        sentence++;
        length--;
    }
    if(length == -1){
        std::cout << sentence;
    }

    
}

int main(){
    funct("emma");
    funct("emma", 1, 2);

}