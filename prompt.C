# include <iostream>

int main(){
	int x;
	int y = 1;
	std::cout << "Input a number";
	std::cin >> x;
	if (x%2 ==0){
		while(y<=20){
			std::cout<<y<<"x"<<x<< "=" << y * x <<std::endl;
			y++;

		}
	
	}

	else{
		int z = 1;
		while(z < 31){
			if(y%x != 0){
				std::cout<< y<< std::endl;
				z++;

			}
			y++;
		
		}
	}
}
