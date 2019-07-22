# validation
Validation of username,password and date
/* This is month validation */

  int date_validation(String date )    //month validation
	   {
			  System.out.println(date);
			  int dae=Integer.parseInt(date.substring(0,2));
			  int month=Integer.parseInt(date.substring(3,5));
			  int yer=Integer.parseInt(date.substring(6));
			//  System.out.print(date1+" "+date2+" " +date3+" ");
			  int month_flag;
			  int date_flag=0;
			  if((month>=1)&&(month<=12))
			  {
				  System.out.println("Level one");
				  if((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12))
					month_flag=1;
				  else if((month==4)||(month==6)||(month==9)||(month==11))
					month_flag=0;
				  else
					month_flag=2;
				  System.out.println("Level two");

				  		if(month_flag==2)
				  			if(yer%400==0||(yer%100!=0&&yer%4==0))
				  				month_flag=3;
				
				if(!((dae>31||dae<1) || (dae==31)&&(month_flag==0) || (dae>28&&month_flag==2) || (dae>29&&month_flag==3))) {
					  System.out.println("Level one");

				  date_flag= 1;	 
				}
			  }
			  if(date_flag==1)
			    return 1;
			  else
				  return 0;
			
	 }
