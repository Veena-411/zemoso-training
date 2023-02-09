import java.util.*;
public class job_location_mapping
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no.of candidates");
		int n = Integer.parseInt(in.nextLine());
		String[][] pref = new String[n][3];
        	System.out.println("Enter preferences");
		for(int i=0;i<n;i++)
		{
			System.out.print(i+": ");
		    String[] input = in.nextLine().split(" ");
		    pref[i][0]=input[0];
		    pref[i][1]=input[1];
		    pref[i][2]=input[2];
		}

		HashMap<String,ArrayList<Integer>> map = new HashMap<>();
		map.put("H",new ArrayList<Integer>());
		map.put("C", new ArrayList<Integer>());
		map.put("B",new ArrayList<Integer>());
        	System.out.println("Enter available positions in H:");
		int pos_in_hyd = Integer.parseInt(in.nextLine());
        	System.out.println("Enter available positions in C:");
		int pos_in_che = Integer.parseInt(in.nextLine());
        	System.out.println("Enter available positions in B:");
		int pos_in_Ban = Integer.parseInt(in.nextLine());
		if(pos_in_hyd + pos_in_che + pos_in_Ban >= n)
		{
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<3;j++)
		        {
		            if(pref[i][j].equals("H"))
		            {
		                if(pos_in_hyd>0)
		                {
		                    ArrayList<Integer> arr = map.get("H");
		                    arr.add(i);
                            	    map.put("H",arr);
		                    pos_in_hyd--;
		                    break;
		                }
		            }
		            else if(pref[i][j].equals("C"))
		            {
		                if(pos_in_che>0)
		                {
		                    ArrayList<Integer> arr = map.get("C");
		                    arr.add(i);
                                    map.put("C",arr);
		                    pos_in_che--;
		                    break;
		                }
		            }
		            else{
		                if(pos_in_Ban>0)
		                {
		                    ArrayList<Integer> arr = map.get("B");
		                    arr.add(i);
                                    map.put("B",arr);
		                    pos_in_Ban--;
		                    break;
		                }
		            }
		        }
		    }
		    for(Map.Entry<String,ArrayList<Integer>> Entry : map.entrySet())
		    {
                        System.out.println();
		        System.out.println(Entry.getKey());
		        ArrayList<Integer> arr = Entry.getValue();
		        for(int i=0;i<arr.size();i++)
		        System.out.print(arr.get(i)+" ");
		        System.out.println();
		    }
		}
		
	}
}

