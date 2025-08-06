package Java_advance;

public class Object_class extends Object {

	public static void main(String[] args) {
		System.out.println("------Create obj------");
		Object_class obj=new Object_class();
		System.out.println("obj tostring value:\t"+obj.toString());
		System.out.println("obj Hash code:\t"+obj.hashCode());
		
		System.out.println("\n------Create obj1------");
		Object_class obj1=new Object_class();
		System.out.println("tostring value of obj1:\t"+obj1.toString());
		System.out.println("obj1 Hash code:\t"+obj1.hashCode());
		
		System.out.println("\n------Compare obj & obj1------");
		System.out.println(" obj and obj1:\t"+obj+"\t"+obj1);
		System.out.println("compare address of obj & obj1:\t"+obj.equals(obj1));
		
		System.out.println("\n------Copy obj toString value------");
		String objc=obj.toString();
		System.out.println("objc is copy of obj:\t"+objc);
		System.out.println(" obj and objc:\t"+obj+"\t"+objc);
		System.out.println("compare address of obj & objc:\t"+obj.equals(objc));
		
		System.out.println("\n------Create obj------");
		String obj_ts=obj.toString();
		System.out.println("obj_ts and objc:\t"+obj_ts+"\t"+objc);
		System.out.println("compare address of obj & objc:\t"+obj_ts.equals(objc));
		
	}

}
