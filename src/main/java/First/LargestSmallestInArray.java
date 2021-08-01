package First;

public class LargestSmallestInArray {

public static void main(String[] args) {
	
	int a[]= {34,55,66,86,78,289,348};

int smallest,largest;
smallest=largest=a[0];
System.out.println(smallest +" "+ largest);

for (int i = 1; i < a.length; i++) {
	
largest=(a[i]>largest)?a[i]:largest;
smallest=(a[i]<smallest)? a[i]:smallest;
}

System.out.println("Largest: "+largest);
System.out.println("Smallest: "+smallest);
}
}
