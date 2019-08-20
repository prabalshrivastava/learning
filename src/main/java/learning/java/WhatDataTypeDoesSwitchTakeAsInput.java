package learning.java;

public class WhatDataTypeDoesSwitchTakeAsInput {
	public static void main(String[] args) {
		//String		
		String str="abc";
		switch(str){  
			case "abc":System.out.println("String");
		}
	}


	private void primitiveTypes() {
		//byte , short , int , long , float , double , char , and boolean

		//byte	1 byte	-128 to 127
		//byte
		byte b=1;
		switch(b){  
			case 1:System.out.println("byte");
		}

		//short	2 bytes	-32,768 to 32,767
		//short
		short s=1;
		switch(s){  
			case 1:System.out.println("short");
		}

		//char	2 byte	0 to 65,536 (unsigned)
		//char
		char ch='a';
		switch(ch){  
			case 'a':System.out.println("char");
		}

		//int	4 bytes	-2,147,483,648 to 2,147,483, 647
		//int
		int i=1;
		switch(i){ 
			case 1:System.out.println("int");
		}

		//long	8 bytes	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		//long not supported
		//long l=1;
		//switch(l){  
		//	case 1:System.out.println("long");
		//}

		//float	4 bytes	approximately ±3.40282347E+38F (6-7 significant decimal digits)Java implements IEEE 754 standard
		//float not supported
		//float f=1.0f;
		//switch(f){  
		//	case 1.0:System.out.println("float");
		//}

		//double	8 bytes	approximately ±1.79769313486231570E+308		(15 significant decimal digits)
		//double not supported
		//double d=1.0;
		//switch(d){  
		//	case 1.0:System.out.println("double");
		//}
		
		//boolean not supported
		//boolean boo=true;
		//switch(boo){  
		//	case true:System.out.println("boolean");
		//}
		
	}


	private void wrapperType() {
		//Byte , Short , Integer , Long , Float , Double , Character , and boolean

		//Byte	1 Byte	-128 to 127
		//Byte
		Byte b=1;
		switch(b){  
			case 1:System.out.println("Byte");
		}

		//Short	2 Bytes	-32,768 to 32,767
		//Short
		Short s=1;
		switch(s){  
			case 1:System.out.println("Short");
		}

		//Character	2 byte	0 to 65,536 (unsigned)
		//Character
		Character ch='a';
		switch(ch){  
			case 'a':System.out.println("Character");
		}

		//Integer	4 Bytes	-2,147,483,648 to 2,147,483, 647
		//Integer
		Integer i=1;
		switch(i){  
			case 1:System.out.println("Integer");
		}

		//Long	8 Bytes	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		//Long not supported
		//Long l=1;
		//switch(l){  
		//    case 1:System.out.println("Long");
		//}

		//Float	4 Bytes	approximately ±3.40282347E+38F (6-7 significant decimal digits)Java implements IEEE 754 standard
		//Float not supported
		//Float f=1.0f;
		//switch(f){  
		//	case 1.0:System.out.println("Float");
		//}

		//Double	8 Bytes	approximately ±1.79769313486231570E+308		(15 significant decimal digits)
		//Double not supported
		//Double d=1.0;
		//switch(d){  
		//	case 1.0:System.out.println("Double");
		//}
	}
}
