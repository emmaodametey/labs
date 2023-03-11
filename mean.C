# include <iostream>
# include <algorithm>

int mode(int arr[], int len){
	std::sort (arr.begin(), arr.end());
	int hold = arr[0];
	int count = 0;
	for(int i =0; i < len; i++){
		if (arr[i] == hold)
			count++;

	}
}
int main(){

	int a, b, c, d, e;
	std::cout<< "enter 5 integers : \n";
	std::cin >>a>>b>>c>>d>>e;
	float sum = a+b+c+d+e;
	float mean = sum/5;
	std::cout<< "the mean is " << mean;

}
