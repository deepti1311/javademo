package io.tntra.javademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavademoApplication {

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


		Sum<Integer> a=new Sum<>();
		a.addNo(20,49);
		System.out.println("addition of two numbers is : "+a.getsum());
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


class Sum<T>{

	private T a,b,sum;

	public void addNo(T a,T b){
		this.a=a;
		this.b=b;

	}
	public T getsum(){
		sum=a+b;   // ERROR: The operator + is undefined for the argument type(s) T, T
		return sum;
	}
}



