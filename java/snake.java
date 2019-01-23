import java.util.Scanner;
public class Snake {
public static void main(String[] args) {

Scanner reader = new Scanner(System.in);
System.out.println("Введите размерность массива");
int n = reader.nextInt(); //Размерность массива
int array[][] = new int[n][n]; //массив 
int s = 0; //строка
int c = 0; //столбец
int step = 0; //шаги в цикле
int i = 0; //значение конкретной ячейки

for(int z = 0; i < n*n-1; z++){
for(int j = 0; j < n-step; j++){ 
array[s][c++] = ++i;
}
c--;
++step;
for(int k = 0; k < n-step; k++){
array[++s][c] = ++i;
}
for(int m = 0; m < n-step; m++){
array[s][--c] = ++i;
} 
++step;
for(int x = 0; x < n-step; x++){
array[--s][c] = ++i;
}
c++;
}
for(int d=0;d<n;d++){
for(int f=0;f<n;f++){
System.out.print(array[d][f]+"\t");
}
System.out.println();
}
} 
}