package Blackbuck;
public class BarcodeExpansion {

	public static void main(String[] args) {
		//String email="kamlesh.ghugare@blackbuck.com";
		String From="608116-027-0309957";
		String To="608116-027-0310004";
		String FromCommon=From.substring(0, 11);
		int m=Integer.parseInt(From.substring(11, 18));
		int n=Integer.parseInt(To.substring(11, 18));
		for(int m1=m;m1<=n;m1++)
		{
			System.out.println(FromCommon+m1);
		}
		
	}
}
