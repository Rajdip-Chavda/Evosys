class help
{
	public static void main(String args[])
		throws java.io.IOException
		{
			char choice,ignore;
			do
			{
				System.out.println(" HELP : ");
				System.out.println(" 1 : IF ");
				System.out.println(" 2 : SWITCH ");
				System.out.println(" 3 : FOR ");
				System.out.println(" 4 : WHILE ");
				System.out.println(" 5 : DO_WHILE ");
				System.out.println(" 6 : BREAK ");
				System.out.println(" 7 : CONTINUE ");
				System.out.println(" 0 : EXIT...");
				
				System.out.println("\n Enter your choice : ");
				choice=(char)System.in.read();
				do
				{
					ignore=(char)System.in.read();
				}while(ignore!='\n');
				if(choice!='0')
				{
					System.out.println("\n.....Enter only Menu Options.....\n");
				}
				else
				{
					System.out.println("\n ......Exit......");
				}
			}while(choice!='0' & choice<='0'|choice>='8'); 
			
			switch(choice)
			{
				case '1':
					System.out.println("THe If :\n");
					System.out.println("if(condition) statment;");
					System.out.println("else statment;");
					break;
				case '2':
					System.out.println("The Switch :\n");
					System.out.println("switch(expression) {");
					System.out.println("	case condition:");
					System.out.println("		statment swquence");
					System.out.println("		break;");
					System.out.println("	// ...");
					System.out.println("}");
					break;
				case '3':
					System.out.println("The For :\n");
					System.out.println("for(init;condition;iteration)");
					System.out.println("	statment;");
					break;
				case '4':
					System.out.println("The While :\n");
					System.out.println("while(condition) statment;");
					break;
				case '5':
					System.out.println("The do-while :\n");
					System.out.println("do {");
					System.out.println(" statment");
					System.out.println("} while (condition);");
					break;
				case '6':
					System.out.println("The break :\n");
					System.out.println("break; or break label ;");
					break;
				case '7':
					System.out.println("The continue :\n");
					System.out.println("continue; or continue label;");
					break;
				case '0':
					break;
			}
			System.out.println();
		}
}