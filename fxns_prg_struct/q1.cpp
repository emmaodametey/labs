# include <iostream>
void input(int &num1, int &num2){
    
    std::cout << "input two numbers"<<std::endl;

    std::cin >> num1 >>num2;



}

int main(){
    int first, second;
    
    input(first, second);
    std::cout << "the sum is " << first + second;

}