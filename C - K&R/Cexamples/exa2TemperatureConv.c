/* print Fahrenheit-Celsius table
    for fahr = 0, 20, ..., 300 */

#include <stdio.h>

int main()
{
	float fah = 1.0;
	float cel = (5.0/9.0) * (fah - 32);
	printf("%3.0f \t%6.2f\n", fah, cel);
	fah = 20;
	while(fah < 300){
		cel = (5.0/9.0) * (fah - 32);
		printf("%3.0f \t%6.2f\n", fah, cel);
		fah += 20;
	}
}
//obs: missing 
/*
K&R
#include <stdio.h>

main()
{
	int fahr, celsius;
	int lower, upper, step;
	lower = 0; //lower limit of temperature scale
	upper = 300; //upper limit
	step = 20; //step size
	fahr = lower;
	while (fahr <= upper) {
		celsius = 5 * (fahr-32) / 9;
		printf("%d\t%d\n", fahr, celsius);
		fahr = fahr + step;
	}
}
*/

/*
K&R 
#include <stdio.h>

main()
{
	float fahr, celsius;
	float lower, upper, step;
	lower = 0; //lower limit of temperature scale
	upper = 300; //upper limit
	step = 20; //step size
	fahr = lower;
	while (fahr <= upper) {
		celsius = (5.0/9.0) * (fahr-32.0);
		printf("%3.0f %6.1f\n", fahr, celsius);
		fahr = fahr + step;
	}
}
*/

/*
GPT
#include <stdio.h>

#define LOWER 0     // lower limit of the temperature scale
#define UPPER 300   // upper limit
#define STEP  20    // step size

void print_conversion()
{
    float fah = LOWER;
    float cel;

    printf("Fahrenheit to Celsius Conversion Table:\n");
    printf("%3s \t%6s\n", "Fah", "Cel");

    while (fah <= UPPER) {
        cel = (5.0 / 9.0) * (fah - 32);
        printf("%3.0f \t%6.2f\n", fah, cel);
        fah += STEP;
    }
}

int main()
{
    print_conversion();
    return 0;
}

*/