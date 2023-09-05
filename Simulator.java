import java.util.Scanner;
import java.util.*;

class Node{   //Node class for creating Node 
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

class Simulator{

    public static void name(String name) //To print which Sorting algo is going on
    {
        System.out.println("\n\n\t\t\t\t\t\t"+name);
        System.out.println("\t\t\t\t\t****************************");
    }

    public static void traverse(int arr[],int swap) //Traverse the final output and final no of swaps
    {
        int n=arr.length;
        System.out.println("\n\t\t\t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("\t\t\t Final Output: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        if(swap!=-1)
        {
            System.out.print("\n\t\t\t Final SwapCount: "+swap);
        }
        System.out.println("\n\t\t\t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void print_func(int arr[])    //Print the array
    {
        System.out.print("\t\t\t|arr=[");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]+" ");
        }
        System.out.print("]\t\t\t\t\t\t|\n");
        System.out.println("\t\t\t|\t\t\t\t\t\t\t\t|");
    }
    
    public static void traverse_Pass(int arr[],int pass_no,int swap) // traverse output and no of swaps after each pass
    {
        int n=arr.length;
        System.out.println("\t\t\t|---------------------------------------------------------------|");
        System.out.print("\t\t\t|Result after Pass "+pass_no+": ");

        int count=0;
        while(true)
        {
            if(count==n)
            {
                System.out.print("\t\t\t\t\t\t");
                for(int i=0;i<n;i++)
                {
                    System.out.print(arr[i]+" ");
                }
                break;
            }
            else{
                System.out.print("\t\t\t\t\t        |\r");
                count=n;
            }
        }
        if(swap!=-1)
        {
            System.out.println("\n\t\t\t|SwapCount: "+swap+"\t\t\t\t\t\t        |");
        }
    }
    
    public static int choice()      //Entering choice whether Ascending or Descending
    {
        System.out.println("\n\t\t\t\t\t----------------------------------");
        System.out.println("\t\t\t\t\t| 1.) Ascending\t\t\t |\n\t\t\t\t\t| 2.) Descending\t\t |");
        System.out.println("\t\t\t\t\t----------------------------------");

        System.out.print("\n\t\t\t\t\tEnter your choice: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        return n;
    }

    public static int[]  input()    //Taking input of array
    {
        System.out.println("\n\t\t\t----------------------------------------------------------------");
        System.out.print("\t\t\tEnter the size of array: ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("\t\t\tEnter the "+size+" elements of array: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("\t\t\t----------------------------------------------------------------");
        return arr;
    }

    public static String exit_func()    //Check if user want ot continue or exit
    {
        System.out.println("\n\t\t\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("\t\t\t Enter Yes to continue and No to exit: ");
        Scanner sc=new Scanner(System.in);
        String choice=sc.nextLine();
        System.out.print("\t\t\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        if(choice.equalsIgnoreCase("Yes"))
        {
            return "No";
        }
        else{
            System.exit(0);
        }
        return "Yes";
    }

    public static void  BubbleSort()//Performing Bubble Sort
    {
        int arr[],FinalSwap=0;
        if(choice()==1)//Ascending
        {
            arr=input();
            int n=arr.length;
            name("BUBBLE SORT");
            for(int i=0;i<n-1;i++)
            {
                int swap=0;
                System.out.println("\n\t\t\t ===============================================================");
                System.out.println("\t\t\t|Pass No: "+(i+1)+"\t\t\t\t\t\t\t|");
                System.out.print("\t\t\t|------------\t\t\t\t\t\t\t|\n");
                print_func(arr);
                for(int j=0;j<n-i-1;j++)
                {
                    
                    if(arr[j]>arr[j+1])
                    {
                        swap++;
                        System.out.println("\t\t\t|"+arr[j]+" > "+arr[j+1]+"\tSwap\t\t\t\t\t\t\t|");
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        System.out.println("\t\t\t|\t\t\t\t\t\t\t\t|");
                    }
                    else{
                        System.out.println("\t\t\t|"+arr[j]+" < "+arr[j+1]+"\tNo Swap\t\t\t\t\t\t\t|");
                        System.out.println("\t\t\t|\t\t\t\t\t\t\t\t|");
                    }
                }
                FinalSwap+=swap;
                traverse_Pass(arr,i+1,swap);
                System.out.println("\t\t\t ===============================================================");
            }
        }
        else{ //Descending

            arr=input();
            int n=arr.length;
            name("BUBBLE SORT");
            for(int i=0;i<n-1;i++)
            {
                int swap=0;
                System.out.println("\n\t\t\t ===============================================================");
                System.out.println("\t\t\t|Pass No: "+(i+1)+"\t\t\t\t\t\t\t|");
                System.out.print("\t\t\t|------------\t\t\t\t\t\t\t|\n");
                print_func(arr);
                for(int j=0;j<n-i-1;j++)
                {
                  
                    if(arr[j]<arr[j+1])
                    {
                        swap++;
                        System.out.println("\t\t\t|"+arr[j]+" < "+arr[j+1]+"\tSwap\t\t\t\t\t\t\t|");
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        System.out.println("\t\t\t|\t\t\t\t\t\t\t\t|");
                    }
                    else{
                        System.out.println("\t\t\t|"+arr[j]+" > "+arr[j+1]+"\tNo Swap\t\t\t\t\t\t\t|");
                    }
                }
                FinalSwap+=swap;
                traverse_Pass(arr,i+1,swap);
                System.out.println("\t\t\t ===============================================================");
            }
        }
        traverse(arr,FinalSwap);
    }


    public static void SelectionSort()//Performing Selection Sort
    {
        int arr[],FinalSwap=0;
        if(choice()==1)//Ascending
        {
        arr=input();
        int n=arr.length;
        name("SELECTION SORT");
        for(int i=0;i<n-1;i++)
        {
            System.out.println("\n\t\t\t ===============================================================");
            System.out.println("\t\t\t|Pass No: "+(i+1)+"\t\t\t\t\t\t\t|");
            System.out.print("\t\t\t|------------\t\t\t\t\t\t\t|\n");
            print_func(arr);
            int min=i;
            int swap=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    System.out.println("\t\t\t|"+arr[j]+" < "+arr[min]+"\t\t\t\t\t\t\t\t|");
                    min=j;
                    System.out.println("\t\t\t|min = "+min+"\t\t\t\t\t\t\t|");
                }
            }
            if(i!=min)
            {
                swap++;
                System.out.println("\t\t\t|Swap "+arr[i]+" with "+arr[min]+"\t\t\t\t\t\t\t|");
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
            else{
                System.out.println("\t\t\t|No Swap\t\t\t\t\t\t\t|");
            }
            FinalSwap+=swap;
            traverse_Pass(arr,i+1,swap);
            System.out.println("\t\t\t ===============================================================");
        }
        traverse(arr,FinalSwap);
        }

        else{//Descending
        arr=input();
        int n=arr.length;
        name("SELECTION SORT");
        for(int i=0;i<n-1;i++)
        {
            System.out.println("\n\t\t\t ===============================================================");
            System.out.println("\t\t\t|Pass No: "+(i+1)+"\t\t\t\t\t\t\t|");
            System.out.print("\t\t\t|------------\t\t\t\t\t\t\t|\n");
            print_func(arr);
            int max=i;
            int swap=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>arr[max])
                {
                    System.out.println("\t\t\t|"+arr[j]+" > "+arr[max]+"\t\t\t\t\t\t\t\t|");
                    max=j;
                    System.out.println("\t\t\t|max = "+max+"\t\t\t\t\t\t\t|");
                }
            }
            if(i!=max)
            {
                swap++;
               System.out.println("\t\t\t|Swap "+arr[i]+" with "+arr[max]+"\t\t\t\t\t\t\t|");
                int temp=arr[i];
                arr[i]=arr[max];
                arr[max]=temp;
            }
            else{
                System.out.println("\t\t\t|No Swap\t\t\t\t\t\t\t|");
            }
            FinalSwap+=swap;
            traverse_Pass(arr,i+1,swap);
            System.out.println("\t\t\t ===============================================================");
        }
        traverse(arr,FinalSwap);
        }
    }

    public static void InsertionSort()  //Perfroming Insertion Sort
    {
        int arr[];
        if(choice()==1)
        {
            arr=input();
            int n=arr.length;
            name("INSERTION SORT");
            int pass=1;
            for(int i=1;i<n;i++)
            {
                System.out.println("\n\t\t\t ===============================================================");
                System.out.println("\t\t\t|Pass No: "+pass+"\t\t\t\t\t\t\t|");
                System.out.print("\t\t\t|------------\t\t\t\t\t\t\t|\n");
                print_func(arr);
                int temp=arr[i];
                int j=i-1;
                System.out.println("\t\t\t|Compare "+arr[j]+" with "+temp+"\t\t\t\t\t\t|");
                while(j>=0 && arr[j]>temp)
                {
                    System.out.println("\t\t\t|"+arr[j]+" > "+temp+"\t\t\t\t\t\t\t\t|");
                    System.out.println("\t\t\t|Compare "+arr[j-1]+" with "+temp+"\t\t\t\t\t\t|");
                    arr[j+1]=arr[j];
                    j--;
                }

                System.out.println("\t\t\t|"+arr[j]+" < "+temp+"\t\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t|Replace "+arr[j+1]+" with "+temp+"\t\t\t\t\t\t|");
                arr[j+1]=temp;
                traverse_Pass(arr,pass,-1);
                pass++;
                System.out.println("\n\t\t\t ===============================================================");
            }
            traverse(arr,-1);
        }
        else{   //Descending

            arr=input();
            int n=arr.length;
            name("INSERTION SORT");
            int pass=1;
            for(int i=1;i<n;i++)
            {
                System.out.println("\n\t\t\t ===============================================================");
                System.out.println("\t\t\t|Pass No: "+pass+"\t\t\t\t\t\t\t|");
                System.out.print("\t\t\t|------------\t\t\t\t\t\t\t|\n");
                print_func(arr);
                int temp=arr[i];
                int j=i-1;
                System.out.println("\t\t\t|Compare "+arr[j]+" with "+temp+"\t\t\t\t\t\t|");
                while(j>=0 && arr[j]<temp)
                {
                    System.out.println("\t\t\t|"+arr[j]+" < "+temp+"\t\t\t\t\t\t\t\t|");
                    if(j>=1)
                    {
                        System.out.println("\t\t\t|Compare "+arr[j-1]+" with "+temp+"\t\t\t\t\t\t|");
                    }
                    arr[j+1]=arr[j];
                    j--;
                }
                if(j>=0)
                {
                 System.out.println("\t\t\t|"+arr[j]+" > "+temp+"\t\t\t\t\t\t\t\t|");
                }
                System.out.println("\t\t\t|Replace "+arr[j+1]+" with "+temp+"\t\t\t\t\t\t|");
                arr[j+1]=temp;
                traverse_Pass(arr,pass,-1);
                pass++;
                System.out.println("\n\t\t\t ===============================================================");
            }
            traverse(arr,-1);
        }
    }

    public static void merge(int arr[], int l, int m, int r)    //Merge Function for merge Sort
	{
		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];


		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];


        System.out.print("\t\t\t| L=[");
        for(int i=0;i<L.length;i++)
        {
            System.out.print(" "+L[i]+" ");
        }
        System.out.print("]\t\t\t\t\t\t\t|\n");
        
        System.out.print("\t\t\t| R=[");
        for(int j=0;j<R.length;j++)
        {
            System.out.print(" "+R[j]+" ");
        }
        System.out.println("]\t\t\t\t\t\t\t|");

		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
                System.out.println("\t\t\t| If "+L[i]+" <= "+R[j]+"\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t| result[ "+k+" ] = "+L[i]+"\t\t\t\t\t\t|");
				arr[k] = L[i];
				i++;
			}
			else {
                 System.out.println("\t\t\t| result[ "+k+" ] = "+R[j]+"\t\t\t\t\t\t|");
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
             System.out.println("\t\t\t| Copying remaining element L[] \t\t\t\t|");
            System.out.println("\t\t\t| result[ "+k+" ] = "+L[i]+"\t\t\t\t\t\t|");
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
             System.out.println("\t\t\t| Copying remaining element R[] \t\t\t\t|");
            System.out.println("\t\t\t| result[ "+k+" ] = "+R[j]+"\t\t\t\t\t\t|");
			arr[k] = R[j];
			j++;
			k++;
		}
        System.out.println("\t\t\t| ------------------------------------------------------------- |");
	}

 
    public static void merge1(int result[], int l, int m, int r)    //Merge for descending
    {
        
        int n1 = m - l + 1;
        int n2 = r - m;
        
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        for (int i=0; i<n1; ++i)
            L[i] = result[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = result[m + 1+ j];
        
        System.out.print("\t\t\t| L=[");
        for(int i=0;i<L.length;i++)
        {
            System.out.print(" "+L[i]+" ");
        }
        System.out.print("]\t\t\t\t\t\t\t|\n");
        
        System.out.print("\t\t\t| R=[");
        for(int j=0;j<R.length;j++)
        {
            System.out.print(" "+R[j]+" ");
        }
        System.out.println("]\t\t\t\t\t\t\t|");
        
        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] >= R[j])
            {
                System.out.println("\t\t\t| If "+L[i]+" >= "+R[j]+"\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t| result[ "+k+" ] = "+L[i]+"\t\t\t\t\t\t|");
                result[k] = L[i];
                i++;
            }
            else
            {
                System.out.println("\t\t\t| result[ "+k+" ] = "+R[j]+"\t\t\t\t\t\t|");
                result[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1)
        {
            System.out.println("\t\t\t| Copying remaining element L[] \t\t\t\t|");
            System.out.println("\t\t\t| result[ "+k+" ] = "+L[i]+"\t\t\t\t\t\t|");
            result[k] = L[i];
            i++;
            k++;
        }
 
        while (j < n2)
        {
            System.out.println("\t\t\t| Copying remaining element R[] \t\t\t\t|");
            System.out.println("\t\t\t| result[ "+k+" ] = "+R[j]+"\t\t\t\t\t\t|");
            result[k] = R[j];
            j++;
            k++;
        }
        System.out.println("\t\t\t| ------------------------------------------------------------- |");
    }

    public static void mergeSort(int arr[], int l,int r,int choice)         //MergeSort function
    {
        System.out.println("\t\t\t| MergeSort from l = "+l+" to r = "+r+"\t\t\t\t\t|");
        System.out.println("\t\t\t| "+l+" < "+r+"\t\t\t\t\t\t\t\t|");        
        if (l < r)
        {
            int m = (l+r)/2;
            System.out.println("\t\t\t| Mid point m = "+m+"\t\t\t\t\t\t|");
            mergeSort(arr, l, m,choice);
            mergeSort(arr , m+1, r,choice);
            System.out.println("\t\t\t| ------------------------------------------------------------- |");
            System.out.println("\t\t\t| Merging "+"\t\t\t\t\t\t\t|");
            if(choice==1)
            {
                merge(arr, l, m, r);
            }
            else{
                merge1(arr,l,m,r);
            }
        }
    }
    
    public static int LinearSearch()    //Performing Linear Search
    {
        int arr[]=input();
        System.out.print("\t\t\tElement to be searched: ");
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        name("Linear Search");
        System.out.println("\t\t\t =============================================================== ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("\t\t\t| Iteration No: "+(i+1)+"\t\t\t\t\t\t|");
            if(arr[i]==target)
            {
                System.out.println("\t\t\t| "+arr[i]+" == "+target+"\tFound\t\t\t\t\t\t|");
                return i;
            }
                System.out.println("\t\t\t| "+arr[i]+" != "+target+"\tNot Found\t\t\t\t\t|");
            System.out.println("\t\t\t|---------------------------------------------------------------|");

        }
        return -1;
    }

    public static void print_array(int arr[],int low,int high)  //Prints array after each binary search iteration
    {
       int n=arr.length;
        System.out.print("\t\t\t| arr =");

        int count=0;
        while(true)
        {
            if(count==n)
            {
                System.out.print("\t\t\t\t");
                for(int i=low;i<=high;i++)
                {
                    if(i!=high)
                    {
                        System.out.print(arr[i]+" , ");
                    }
                    else{
                        System.out.print(arr[i]+"  ");
                    }
                }
                break;
            }
            else{
                System.out.print("\t\t\t\t\t\t\t\t|\r");
                count=n;
            }
        }
    }
    public static int binarySearch()    //Binary Search
    {
        int arr[]=input();
        System.out.print("\t\t\tElement to be searched: ");
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        name("Binary Search");
        System.out.println("\t\t\t =============================================================== ");
        int l=0;
        int r=arr.length-1;
        int itr=1;
        while (l <= r) {
            int m =(l+r)/ 2;
            System.out.println("\t\t\t| Iteration No: "+itr+"\t\t\t\t\t\t|");
            System.out.println("\t\t\t|---------------------------------------------------------------|");
            itr++;
            print_array(arr,l,r);
            System.out.println("\n\t\t\t| low = "+l+", high = "+r+", mid = "+m+", arr[mid] = "+arr[m]+", target = "+target+"\t\t|");
            if (arr[m] == target)
            {
                System.out.println("\t\t\t| "+arr[m]+" == "+target+"\tFound at mid\t\t\t\t\t|");
                return m;
            }
    
            if (arr[m] < target)
            {
                System.out.println("\t\t\t| "+arr[m]+" < "+target+"\t\tNot found\t\t\t\t\t|");
                System.out.println("\t\t\t| Search on right side\t\t\t\t\t\t|");
                l = m + 1;
            }
    
            else
            {
                System.out.println("\t\t\t| "+arr[m]+" > "+target+"\t\tNot Found\t\t\t\t\t|");
                System.out.println("\t\t\t| Search on left side\t\t\t\t\t\t|");
                r = m - 1;
            }
            System.out.println("\t\t\t|---------------------------------------------------------------|");
        }
        return -1;
    }

    public static void valid_Parenthesis()  //check parenthesis valid or not using stack
    {
        Stack<Character> stack=new Stack<Character>();
        name("Valid Parenthesis");
        System.out.println("\t\t\t =============================================================== ");
        System.out.print("\t\t\t Enter String: ");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int flag=0;
        for(int i=0;i<input.length();i++)
        {
            System.out.println("\t\t\t|---------------------------------------------------------------|");
            System.out.println("\t\t\t| Iteration No: "+(i+1)+"\t\t\t\t\t\t|");
            if(input.charAt(i)=='(')
            {
                System.out.println("\t\t\t| Character = "+input.charAt(i)+" Push()\t\t\t\t\t\t|");
                stack.push(input.charAt(i));
            }
            else 
            {
                if(!stack.empty())
                {
                    System.out.println("\t\t\t| Character = "+input.charAt(i)+" Pop()\t\t\t\t\t\t|");
                    stack.pop();
                }
                else{
                    flag=1;
                }
            }
            System.out.println("\t\t\t|---------------------------------------------------------------|");
        }

        if(stack.empty() && flag==0)
        {
            System.out.println("\t\t\t| Balanced\t\t\t\t\t\t\t|");
        }
        else{
            System.out.println("\t\t\t| Not Balanced\t\t\t\t\t\t\t|");
        }
         System.out.println("\t\t\t =============================================================== ");
    }


    static Node head=null;
    public static void create(int arr[],int flag)       //Create Linked List
    {
       System.out.println("\t\t\t --------------------------------------------------------------- ");
        for(int i=0;i<arr.length;i++)
        {
            if(flag==0)
            {
            System.out.println("\t\t\t Add Node No "+(i+1)+" to List");
            }
            Node nd=new Node(arr[i]);
            if(head==null)
            {
                head=nd;
            }
            else{
                Node tail=head;
                while(tail.next!=null)
                {
                    tail=tail.next;
                }
                tail.next=nd;
                tail=nd;
            }
            if(flag==0)
            {
            traverse_List();
            System.out.println("\t\t\t --------------------------------------------------------------- ");
            }
        // System.out.println("\n");
        }
        if(flag==0)
        {
            System.out.println("\t\t\t --------------------------------------------------------------- ");
        }
    }
    
     public static void insert_at_beg(int data) //Insertion at beginning of Linked List
    {
        System.out.println("\n\t\t\t Links updated");
        Node nd=new Node(data);
        System.out.println("\t\t\t "+nd.data+" -> "+head.data);
        nd.next=head;
        System.out.println("\t\t\t Head -> "+nd.data);
        head=nd;
    }

    static Node x=null;
    public static void insert_at_end(int data)  //Insertion at end of Linked List
    {
        System.out.println("\n\t\t\t Links Updated");
        Node nd=new Node(data);
        if(head==null)
        {
            head=nd;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            System.out.println("\t\t\t "+temp.data+" -> "+nd.data);
            System.out.println("\t\t\t "+nd.data+" -> "+x);
            temp.next=nd;
        }
    }

    public  static void traverse_List() //Traversing the Linked List
    {
        Node temp=head;
        System.out.print("\t\t\t Head --> ");
        while(temp.next!=null)
        {
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.print(temp.data);
        System.out.println(" --> "+x);
    }
    public static void main(String args[]) //Main Method
    {
        System.out.println("\t\t\t-----------------------------------------------------------------");
        System.out.println("\t\t\t| \t\tWelcome to Algorithm Simulator\t\t\t|");
        System.out.println("\t\t\t-----------------------------------------------------------------");
        
        String exit="No";
        do{
        System.out.println("\t\t\t-----------------------------------------------------------------");
        System.out.println("\t\t\t| Sorting\t\t\t\t\t\t\t|");
        System.out.println("\t\t\t|---------------------------------------------------------------|");
        System.out.println("\t\t\t| 1.) Bubble Sort                \t\t\t\t|\n\t\t\t| 2.) Selection Sort             \t\t\t\t|\n\t\t\t| 3.) Insertion Sort             \t\t\t\t|\n\t\t\t| 4.) Merge Sort\t\t\t\t\t\t|");
        System.out.println("\t\t\t|---------------------------------------------------------------|");
        System.out.println("\t\t\t| Searching\t\t\t\t\t\t\t|");
        System.out.println("\t\t\t|---------------------------------------------------------------|");
        System.out.println("\t\t\t| 5.) Linear Search              \t\t\t\t|\n\t\t\t| 6.) Binary Search              \t\t\t\t|");
        System.out.println("\t\t\t|---------------------------------------------------------------|");
        System.out.println("\t\t\t| 7.) Check Valid Parenthesis    \t\t\t\t|");    
        System.out.println("\t\t\t|---------------------------------------------------------------|");
        System.out.println("\t\t\t| LinkedList\t\t\t\t\t\t\t|");
        System.out.println("\t\t\t|---------------------------------------------------------------|");
        System.out.println("\t\t\t| 8.) Creation              \t\t\t\t\t|\n\t\t\t| 9.) Insertion At Beginning     \t\t\t\t|\n\t\t\t| 10.) Insertion At End          \t\t\t\t|");
        System.out.println("\t\t\t-----------------------------------------------------------------");

        System.out.print("\n\t\t\t\t\tEnter Your Choice: ");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice==1)       
        {
            BubbleSort();
            exit=exit_func();
        }
        else if(choice==2)
        {
            SelectionSort();
            exit=exit_func();
        }
        else if(choice==3){
            InsertionSort();
            exit=exit_func();
        }
        else if(choice==4){
            if(choice()==1)
            {
                int arr[]=input();
                name("Merge Sort");
                System.out.println("\n\t\t\t ===============================================================");
                mergeSort(arr,0,arr.length-1,1);
                System.out.println("\n\t\t\t ===============================================================");
                traverse(arr,0);
                exit=exit_func();
            }
            else{
                int arr[]=input();
                name("Merge Sort");
                System.out.println("\n\t\t\t ===============================================================");
                mergeSort(arr,0,arr.length-1,2);
                System.out.println("\n\t\t\t ===============================================================");
                traverse(arr,0);
                exit=exit_func();
            }
        }
        else if(choice==5)
        {
            int val=LinearSearch();
            System.out.println("\t\t\t|---------------------------------------------------------------|");
            if(val!=-1)
            {
                System.out.println("\t\t\t| Element found at index: "+val+"\t\t\t\t\t|");
            }
            else{
                System.out.println("\t\t\t| Element not found\t\t\t\t\t\t|");
            }
            System.out.println("\t\t\t =============================================================== ");
            exit=exit_func();
        }
        else if(choice==6)
        {
           int val= binarySearch();
           System.out.println("\t\t\t|---------------------------------------------------------------|");
           if(val!=-1)
            {
                System.out.println("\t\t\t| Element found at index: "+val+"\t\t\t\t\t|");
            }
            else{
                System.out.println("\t\t\t| Element not found\t\t\t\t\t\t|");
            }
            System.out.println("\t\t\t =============================================================== ");
            exit=exit_func();
        }
        else if(choice==7)
        {
            valid_Parenthesis();
            exit=exit_func();
        }
        else if(choice==8)
        {
            name("Linked List");
            System.out.println("\t\t\t =============================================================== ");
            System.out.print("\t\t\t Enter the length of list: ");
            int length=sc.nextInt();
            int arr[]=new int[length];
            for(int i=0;i<length;i++)
            {
                System.out.print("\t\t\t Enter data for node no "+(i+1)+" : ");
                arr[i]=sc.nextInt();
            }
            create(arr,0);
            System.out.println("\t\t\t Your Linked List is Ready:\n");
            traverse_List();
            System.out.println("\t\t\t =============================================================== ");
            exit=exit_func();
        }
        else if(choice==9)
        {
            name("Linked List");
            System.out.println("\t\t\t =============================================================== ");
            System.out.print("\t\t\t Enter the length of list: ");
            int length=sc.nextInt();
            int arr[]=new int[length];
            for(int i=0;i<length;i++)
            {
                System.out.print("\t\t\t Enter data for node no "+(i+1)+" : ");
                arr[i]=sc.nextInt();
            }
            create(arr,1);
            System.out.println("\t\t\t Current List: ");
            traverse_List();
             System.out.println("\t\t\t --------------------------------------------------------------- ");
            System.out.print("\t\t\t Enter node to be inserted: ");
            int insert=sc.nextInt();
            insert_at_beg(insert);
            System.out.println("\n\t\t\t List after insertion: ");
            traverse_List();
            System.out.println("\t\t\t =============================================================== ");
            exit=exit_func();
        }
        else{
            name("Linked List");
            System.out.println("\t\t\t =============================================================== ");
            System.out.print("\t\t\t Enter the length of list: ");
            int length=sc.nextInt();
            int arr[]=new int[length];
            for(int i=0;i<length;i++)
            {
                System.out.print("\t\t\t Enter data for node no "+(i+1)+" : ");
                arr[i]=sc.nextInt();
            }
            create(arr,1);
            System.out.println("\t\t\t Current List: ");
            traverse_List();
            System.out.println("\t\t\t --------------------------------------------------------------- ");
            System.out.print("\t\t\t Enter node to be inserted: ");
            int insert=sc.nextInt();
            insert_at_end(insert);
            System.out.println("\n\t\t\t List after insertion: ");
            traverse_List();
            System.out.println("\t\t\t =============================================================== ");
            exit=exit_func();
        }
        }while(!exit.equals("Yes"));
    }
}