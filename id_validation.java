/*method for id_validation
eg--VALID ID : empno5
*/

int id_validation(String user_id)                 //id_validation
	{
	    int flag_id=0;
	   int length_id=user_id.length();
	   String part1=user_id.substring(0,5);
	   String part2=user_id.substring(5);
	   if(length_id==9)
	    	  if(part1.equals("empno"))
	           if(part2.matches("[0-9]+"))
	           flag_id++;
	   if(flag_id==1)        
	   return(1);
	   else 
	   return(0); 
	 }
