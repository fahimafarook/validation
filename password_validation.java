# validation
Validation of username,password and date

/*
A VALID password should contain a number ,special charater and a character
eg--#fahima123
*/

int password_validation(String password)         //password validation
	 {
		 int a_character=0,a_number=0,a_splchar=0;
		 int length_password=password.length();
		 for(int i=0;i<length_password;i++)
		 {
			  char c=password.charAt(i);
	          if(Character.isDigit(c))
	           a_number++;
	          else if(Character.isLetter(c))
	           a_character++;
	          else
	        	a_splchar++;
		 }
	 
	          if(a_character>=1 && a_number>=1 && a_splchar>=1)  
	        	  return(1);
	          else
	              return(0);
		
		 }
