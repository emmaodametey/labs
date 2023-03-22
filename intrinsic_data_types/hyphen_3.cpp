# include <iostream>
# include <string>
int count_char(char word[100]){
    int len = 0;
    while(word[len]){
        len++;
    }
    return len;
}

int main(){
    char input[100];
    std::cout << "enter hyphen connected word" <<std::endl;
    std::cin >> input;    

    int len = count_char(input);

    // std::string out;
    // out = "";
    //char *out;
    for(int i = 0; i < len; i++){
        if(input[i] == '-' || input[i] =='\0'){
           // int length = count_char(out);
            std::cout<< std::endl;
            //std::cout << "["<< length << "] " << out <<std::endl;
            //out = "";
        }
        else{
            std::cout << input[i];
            // out = out + input[i];
        }
    }


}