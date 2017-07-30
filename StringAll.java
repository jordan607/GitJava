class  StringAll
{
	public static void main(String[] args) 
	{
		String s=new String();
		System.out.println("empty string"+s);
		s="java";
		String s1=new String(s);
		System.out.println("value of s="+s);
		System.out.println("value of s1="+s1);
		char c[]={'J','A','v','A'};
		String s3= new String(c);
		System.out.println("value of array conv to string="+s3);
		StringBuffer sb=new StringBuffer("Java");
		System.out.println("stringbuffer sb="+sb);
		String sd=new String(sb);
		System.out.println("StringBuffer converted to string"+sd);
		int noc=s.length();
		System.out.println("length of java="+noc);
		int non="Satya".length();
		System.out.println("length of satya="+non);
		String crs[]={"cpp","oracle","java",};
		System.out.println("no.of cources="+crs.length);
		System.out.println("no.of character in 3rd cource="+crs[2].length());
		char ch=s.charAt(1);
		System.out.println("ist character of java="+ch);
		String lc=s.toUpperCase();
		System.out.println("upper case java="+lc);
		String uc=lc.toLowerCase();
		System.out.println("lower case java="+uc);
		char v[]=s.toCharArray();
		for(int i=0;i<v.length;i++)
		System.out.print("-"+v[i]);
		String s4="prog";
		String s9=s1.concat(s4);
		System.out.println("concatinated strings using concat function"+s9);
		String s5=s1+s4+"lang";
		String pwd="   Vishal Sepaia        ";
		System.out.println("concatinated strings using  +"+s9);
		int lno=pwd.length();
		System.out.println("length of vishal sepaia with spaces="+lno);
		String tpwd=pwd.trim();
		int lno1=tpwd.length();
		System.out.println("length by using trim="+lno1);
		String p="VISHAL";
		String q="vishal";
		boolean b=p.equals(q);
		System.out.println("Demonstrates equal="+b);
		 b=p.equals("VISHAL");
		System.out.println("Demonstrates equal="+b);
		 b=p.equalsIgnoreCase(q);
		System.out.println("Demonstrates equalIgnoreCase="+b);
		 b=p.equalsIgnoreCase("vishal1");
		System.out.println("Demonstrates equalIgnores case="+b);
			 

		
}
}
