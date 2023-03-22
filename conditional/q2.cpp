# include <iostream>

int main(){
    double num1, num2;
    char operate;
    
    std::cout << "enter two numbers" << std::endl;
    std::cin >> num1 >> num2;
    std::cout << "enter an operator"<< std::endl;
    std::cin >> operate;
    
    switch(operate){
        case '+': std::cout << "Adding " <<num1 << " and " << num2 << " = " << num1 + num2;
                    break;
        case '-':std::cout << "Subtracting " <<num2 << " from " << num1 << " = " << num1 - num2;
                    break;
        case '*':std::cout << "Multiplying " <<num1 << " and " << num2 << " = " << num1 * num2;
                    break;
        case '/':std::cout << "Dividing " <<num1 << " by " << num2 << " = " << num1 / num2;
                    break;
        default: std::cout << "No operation";          

    }
}