# include <iostream>


void funct(char sentence[1000], int start, int length){
    sentence += start;
    while(length > 0){
        std::cout << *sentence;
        sentence++;
        length--;
    }
    std::cout<<std::endl;
    if(length == -1){
        std::cout << sentence<<std::endl;
    }

    
}

void funct(char sentence[1000]){
    std::cout << sentence;
    std::cout<<std::endl; 
}

void funct(char sentence[1000], int start){
    sentence += start;
    while(*sentence != '\0'){
        std::cout << *sentence;
        sentence++;
     }
    std::cout<<std::endl;
}

int main(){
    funct("emma");
    funct("emma", 1);
    funct("emma", 1, 2);

}