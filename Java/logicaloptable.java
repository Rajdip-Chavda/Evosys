class logicaloptable
{
	public static void main(String args[])
	{
		boolean p,q;
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		System.out.println("-----------------------------------------------	");
		p=true;q=true;
		System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p));
				
		p=true;q=false;
		System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p));

		p=false;q=true;
		System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p));
		
		p=false;q=false;
		System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p));
	}
}