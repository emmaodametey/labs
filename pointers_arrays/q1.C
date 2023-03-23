# include <iostream>

int main(){
    std::string input;

    std::cout << "input a word"<<std::endl;
    std::cin >> input;
    const char * point = input.c_str();

    while(*point != '\0'){
        std::cout << *point;
        point++;
    }

}