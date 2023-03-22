# include <iostream>

int main(){
    int num;
    int* point = &num;
    int &ref = num;
    const int foundation = 512;

    num = 5;
    ++*point;
    ref++;
    std::cout<< num;

    int hex = 0xf3f2;
    int hund = 0437;
    int alph = 'a';

    std::cout <<"the decimal value of 0xf3f2 " << hex << std::endl;
    std::cout <<"the decimal of 0437 " << hund << std::endl;;
    std::cout <<"the decimal of a " << alph << std::endl;;

}