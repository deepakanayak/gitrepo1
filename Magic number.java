import java.util.*;

class magicnumber{
	public static void main(String[] args){
		int sum1=0;
		int sum2=0;
		int magicnumber;
		int ar[]={3,1,2,4,5,12,8,13};
		int br[]=ar.clone();
		Arrays.sort(br);
		for (int i=0;i<ar.length;i++){
			if(ar[i]==br[i]){
				sum1=sum1+br[i];
			}
			else{
				sum2=sum2+br[i];
			}

		}
		magicnumber=sum1-sum2;

		System.out.println(magicnumber);
	}
}

//comment