package io.tntra.javademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavademoApplication {





    public static <T> void PrintArray(T[] array){

        for (T t : array) {
             System.out.printf("%s ",t);

        }
        System.out.println();

    }

	
	public static void main(String[] args) {
		SpringApplication.run(JavademoApplication.class, args);

		// Ex <String, Integer> obj1 =
		// new Ex<String, Integer>("GfG", 15);

	    // obj1.print();

		// Ex <String,String> obj2=
		// new Ex <String,String>("sdf","SJDcg");
		// obj2.print();


		// Ex <Double,String> obj3=
		// new Ex <Double,String>(23.09,"SJDcg");
		// obj3.print();

		// Ex <Double,Integer> obj4=
		// new Ex <Double,Integer>(23.09,67);
		// obj4.print();


		// Sum<Integer> a=new Sum<>();
		// a.addNo(20,49);
		// System.out.println("addition of two numbers is : "+a.getsum());









		Integer[] array1={1,2,2,3,4,3};

		Character[] array2={'H','i'};

		// double[] array3={1.2,3.4};

		System.out.println("array created using "+array1.getClass().getName());
		PrintArray(array1);

		System.out.println("array created using "+array2.getClass().getName());
		PrintArray(array2);

		// System.out.println("array created using "+array3.getClass().getName());
		// PrintArray(array3);   //  The method PrintArray(T[]) in the type JavademoApplication is not applicable for the arguments (double[])
	}



}

class Ex<T,U> {


    T obj1;
    U obj2;


    Ex(T obj1,U obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }

     public void print(){
        System.out.println("generic type created from  "+obj1.getClass().getName());
        System.out.println("value = "+obj1);
		System.out.println("generic type created from  "+obj2.getClass().getName());
        System.out.println("value = "+obj2);

		System.out.println("\n\n");
     }    
}


// class Sum<T>{

// 	private T a,b,sum;

// 	public void addNo(T a,T b){
// 		this.a=a;
// 		this.b=b;

// 	}
// 	public T getsum(){
// 		sum=a+b;   // ERROR: The operator + is undefined for the argument type(s) T, T
// 		return sum;
// 	}
// }



