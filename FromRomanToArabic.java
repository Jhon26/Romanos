package src;

public class FromRomanToEntero{
    
        //Convierte un arreglo de numeros enteros a un único número arábigo
        //siguiendo la regla de la conversión de romanos
        public int getEntero(int[] numeros, int size){
		int i = 0, response = 0, first, second;
		do{
                    second = 0;
                    first=numeros[i];
                    if(i+1<size) second = numeros[i+1];
                    //Si el primero es menor al segundo entonces tal numero es la resta del 2° menos el 1°
                    if(first<second){
                        first = second - first;
                        i++;
                    }                    
                    response+=first;
                    i++;
		}while(i<size);
		return response;
	} 
    
        //Convierte un romano en string a su respectivo arreglo de arábigos
	public int toEntero(String roman){
                int size = roman.length();
		char[] split = roman.toCharArray();
		int[] enteros = new int[size];
		for(int i=0; i<size; i++){
			switch(split[i]){
                            case 'I':
                                    enteros[i]=1;
                                    break;
                            case 'V':
                                    enteros[i]=5;
                                    break;
                            case 'X':
                                    enteros[i]=10;
                                    break;
                            case 'L':
                                    enteros[i]=50;
                                    break;
                            case 'C':
                                    enteros[i]=100;
                                    break;
                            case 'D':
                                    enteros[i]=500;
                                    break;
                            case 'M':
                                    enteros[i]=1000;
                                    break;
			}
		}
		return getEntero(enteros, size);
	}      
}