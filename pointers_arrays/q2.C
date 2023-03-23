# include <iostream>

namespace my{
int strlen(const char *);
int strcmp(const char *l, const char *r){
    // Compares the elements of l with r and returns zero if they are all the same, a negative value if l < r and a positive value if l > r
    int len1 = my::strlen(l);
    int len2 = my::strlen(r);
    if( len1 > len2){
        return 1;
    }

    else if(my::strlen(l) == my::strlen(r)){
        return 0;
    }
    
    return -1;
}

 
int strlen(const char *s){
    // Returns the length of s excluding the termination character '\0'
    int length = 0;
    while (*s != '\0'){
        length++;
        s++;
    }
    return length;
}
 
char *strcat(char *l, const char *r){
    bool swap = false;
    char *l_copy = l;
    while(*r != '\0'){
        if (*l == '\0'){
           *l = *r;
           r++;
           swap = true;
        }
   
        ++l;

        if (swap){
            *l = '\0';
            swap = false;
        }
    }
    
    return l_copy;
}

 
char *strcpy(char *l, const char *r){
    // Copies the contents of r over the contents of l, and returns l
   //bool swap = false;
   char * l_copy = l;
   while(*r != '\0'){
    *l =*r;
    l++;
    r++;


   }
    *l = '\0';
    return l_copy;

    } 



 
char *toupper(char *s){
    // Converts the characters in s to uppercase, and returns s
    char *s_copy = s;
    while (*s != '\0')
    {
        int hold = *s;
        if(*s == ' '){
            *s = hold;
            s++;
            continue;
        }
       
        hold -= 32;
        *s = hold;
        s++;
    }
    return s_copy;

}

}

int main(){
    char word[100]{"hello world"};
    char word2[100]{"hello world"};
    const char word3[100]{"hi emma"};
    // //test strcmp
    // std::cout << "testing strcmp"<< std::endl;
    // std::cout << "testing " << word <<" and " << word2 << std::endl;
    // std::cout << my::strcmp(word, word2) <<std::endl;
    // std::cout << "testing " << word <<" and " << word3 << std::endl;
    // std::cout << my::strcmp(word, word3) << std::endl;
    // std::cout << "testing " << word3 <<" and " << word2 << std::endl;
    // std::cout << my::strcmp(word3, word2) << std::endl;

    //test strlen
    // std::cout << "testing strlen"<< std::endl;
    // int len = my::strlen(word);
    // int len2 = my::strlen(word3);
    // int len3 = my::strlen(word2);
    // std::cout << len <<" and " << len2 << " and " << len3 <<std::endl;

    // //test strcat
    // std::cout << "testing strcat"<< std::endl;
    // char * result = my::strcat(word, word3);
    // std::cout << result ;

    //test strcpy
    // std::cout << "testing strcpy"<< std::endl;
    // char * result = my::strcpy(word, word3);
    // std::cout << result ;

    //test toupper
    std::cout << "testing toupper"<< std::endl;
    char * result = my::toupper(word);
    std::cout << result ;



}