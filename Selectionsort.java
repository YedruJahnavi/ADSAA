import java.util.Scanner;
import java.util.Arrays;
public class selectionsort{
	public static void selectionsort(int[] arr){
		int n=arr.length;
		for(int i=0;i<n;i++){
			int minindex=i;
		for(int j=i+1;j<n;j++){
			if(arr[j]<arr[minindex]){
				minindex=j;
				}
			}
			int temp=arr[minindex];
			arr[minindex]=arr[i];
			arr[i]=temp;
			}
		} 
		public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number of elements:");
		int n = scanner.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements:");
		for(int i=0;i<n;i++){
			arr[i] = scanner.nextInt();
		}
		selectionsort(arr);
		System.out.println("sorted array:");
		for(int num : arr){
			System.out.print(num+" ");
		}
	}
}
