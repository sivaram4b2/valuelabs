package ValueLabs.ValueLabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String s="Java Programming";
        
        //Prathi Sivaram
        //Sivaramakrishna Prathi
        
        char[] charString=s.toCharArray();
        
        char[] temp=new char[charString.length];
        
        char[] characterstoberemoved= {'a','r','m'};
        
        List<Character> list=new ArrayList<Character>();
        Arrays.asList(characterstoberemoved);
       
        int count=0;
        
        for(int index=0;index<charString.length;index++)
        {
//       	if(!(charString[index]=='a'|| charString[index]=='r'))
			 if(!list.contains(charString[index])) 
        	{
        		temp[count]=charString[index];
        		
        		count++;
        		
        	}
        }
        
        for(char ele:temp)
        {
        	System.out.print(ele);
        }
    }
    
    
    //frame 1,id=1[frame2,id=2[frame 3,id=3]
    
    
    //try{
  
}
    
    
    
    
    
    
    
    
    

