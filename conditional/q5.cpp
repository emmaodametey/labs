# include <iostream>
# include <string>


// int count_char(std::string str) {
//        int number = 0;
//        while (str[number]) {
//            number++;
//        }
//        return number;
//    }
int main(){
    int longest = 0;
    std::string input;
    std::cout << "input a line of text"<<std::endl;
    std::getline(std::cin, input, '\n');
    int lengthy = input.length();
    std::string hold, finally;
    for(int i =0; i < lengthy; i++){
        if(input[i] == ' ' || input[i]=='\0'){
            int len = hold.length();
            if (len > longest){
                longest = len;
                finally = hold;
            }
            hold = "";
        
        }
        else{
            hold += input[i];
        }
    }
    std::cout << finally << "  [" << longest << "] ";

}