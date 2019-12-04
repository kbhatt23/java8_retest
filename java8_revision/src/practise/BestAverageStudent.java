package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class BestAverageStudent {


	 public static Integer bestAvgGrade(String[][] scores)
	  {
		 
		 	
		 return 23;
	  }

	  public static boolean pass()
	  {
	    String[][] s1 = { { "Rohan", "84" },
	               { "Sachin", "100" },
	               { "Ishan", "55" },
	               { "Sachin", "80" } ,
	               {"Rohan" , "100"}};

	    return bestAvgGrade(s1) == 92;
	  }

	  public static void main(String[] args)
	  {
	    if(pass())
	    {
	      System.out.println("Pass");
	    }
	    else
	    {
	      System.out.println("Some Fail");
	    }
	  }

}
