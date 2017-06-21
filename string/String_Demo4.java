// String Demo
class String_Demo4 // class
{
	public static void main(String args[])
	{
		String s1="     sachtech";
		String s2="SACHTECH";
		String s3="i am live in mohali";
		
		System.out.println("length of string "+s1.length());
		System.out.println("starts with "+s1.startsWith("a"));
		System.out.println("ends with "+s1.endsWith("h"));
		System.out.println("Uppercase "+s1.toUpperCase());
		System.out.println("Lowercase "+s2.toLowerCase());
		System.out.println("Equals method "+s1.equals(s2));
		System.out.println("EqualsIGnorecase "+s1.equalsIgnoreCase(s2));
		System.out.println("substring "+s1.substring(4));
		System.out.println("substring "+s1.substring(2,6));
		System.out.println("char at "+s1.charAt(7));
		System.out.println("index of "+s1.indexOf('c'));
		System.out.println("last index of "+s1.lastIndexOf('c'));
		System.out.println("replace "+s1.replace("c","z"));
		System.out.println("replace first "+s1.replaceFirst("c","z"));
		System.out.println("replace "+s1.replace("sachtech","STS"));
		System.out.println("length of string "+s1.length());
		s1=s1.trim();
		System.out.println("length of string after trim "+s1.length());
		//----------------------------------------------------
		byte b[]=s1.getBytes();
		for(byte x:b)
		{
			System.out.println(x);
		}
		//-----------------------------------------------------
		char c[]=new char[s1.length()];
		s1.getChars(0,s1.length(),c,0);
		for(char x:c)
		{
			System.out.println(x);
		}
		//-----------------------------------------------------
		String ss[]=s3.split("\\s");
		for(String x:ss)
		{
			System.out.println(x);
		}
		
		
		
		
		
		
		
	}
}