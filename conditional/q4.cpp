# include <iostream>


int count_char(char* array) {
       int numberOfChars = 0;
       while (*array++ != '\0') {
           numberOfChars++;
       }
       return numberOfChars;
   }

int main(){
    char text[1000];
    char reversed[1000];
    int i = 0;
    char c;
    std::cout << "Input a line of text"<<std::endl;;
    std::cin.get(text, 1000);

    std::cout << "this is your reversed line"<< std::endl;
    
    int len = count_char(&text[0]);
    //int len = count_char(text);
    c = text[0];
    
    while(c != '\0'){
        reversed[i] = text[len-1];
        i++;
        len--;
    }
    std::cout << reversed;

}