import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		int top = ray.length-1;
		int bottom = 0;
		
		Arrays.sort(ray);

        int mid = (bottom+top)/2;
		while(top >= bottom)
		{
			
            
			if(ray[mid]<item)
			bottom = mid +1;

			else if(ray[mid]>item)
			top = mid -1;


			else {
				return mid;
			}
			mid = (bottom + top)/2;

		}
		
		return -1;

	}
}
