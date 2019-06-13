import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
class AirplanePath
{
    // Driver function
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int testcase=s.nextInt();
            for(int i=0;i<testcase;i++)
            {
                System.out.print("Case #"+(i+1)+": ");
                int n=s.nextInt();
                String str[][] = new String[n][2];
                for(int x=0;x<n;x++){
                    for(int y=0;y<2;y++){
                        str[x][y]=s.next();
                    }
                }
                Map<String, String> dataSet = new HashMap<String, String>();
                for(int x=0;x<n;x++){
                    dataSet.put(str[x][0],str[x][1]);
                }

         
                printResult(dataSet);
                System.out.println();
            }
    }
 
    // This function populates 'result' for given input 'dataset'
    private static void printResult(Map<String, String> dataSet)
    {
        // To store reverse of given map
        Map<String, String> reverseMap = new HashMap<String, String>();
 
        // To fill reverse map, iterate through the given map
        for (Map.Entry<String,String> entry: dataSet.entrySet())
            reverseMap.put(entry.getValue(), entry.getKey());
 
        // Find the starting point of itinerary
        String start = null;
        for (Map.Entry<String,String> entry: dataSet.entrySet())
        {
              if (!reverseMap.containsKey(entry.getKey()))
              {
                   start = entry.getKey();
                   break;
              }
        }
 
        // If we could not find a starting point, then something wrong
        // with input
        if (start == null)
        {
           System.out.println("Invalid Input");
           return;
        }
 
        // Once we have starting point, we simple need to go next, next
        // of next using given hash map
        String to = dataSet.get(start);
        while (to != null)
        {
            System.out.print(start +  "-" + to + " ");
            start = to;
            to = dataSet.get(to);
        }
    }
}
