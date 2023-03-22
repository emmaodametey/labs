# include <iostream>
# include <string>

int main(){
    typedef std::string ten_strings[10];
    ten_strings choice;
    long long unsigned int size = 0;
    std::string largest;

    std::cout << "input 10 string objects"<<std::endl;
    for(int i = 0 ; i < 10; i++){
        std::cout << "string["<<i << "] ";
        std::cin >> choice[i];
        if (sizeof(choice[i]) > size){
            size = sizeof(choice);
            largest = choice[i];
        }


    }
    std::cout << "the largest string is " << largest;
    }