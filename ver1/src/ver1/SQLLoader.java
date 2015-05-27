package ver1;
/* loading into the DATABASE test*/
import java.sql.*;

public class SQLLoader
{
	public static String USERNAME = new String("root");
    public static String PASSWORD = new String("xie");

    private static int date =2;
    private static int price_now=100;
 //   private static int buyerID[] = new int[] {5,5,5,5};
 // private static int sellerID[] = new int[] {5,5,5,5};
    

    private static int nom_coljbroad=3;
    private static int group_nom=10;
    private static int buy[]    = new int[3];
    private static int sell[]   = new int[3];
    private static int buyerID[][]   = new int [3][group_nom];
    private static int sellerID[][]  = new int [3][group_nom];
    private static int nom_buyerID[]   = new int [3];             // NOT nombre of buying BUT buyer
    private static int nom_sellerID[]  = new int [3];
    private static int buyerNOMOP[][]   = new int [3][group_nom]; // SAME AS NOM_OP
    private static int sellerNOMOP[][]  = new int [3][group_nom];
	
    private static int sum_buy =0;
    private static int sum_sell =0;
    
    private static String drop_tables = new String();
    
    public static void
	main(String[] args) throws ClassNotFoundException
	{
    	
    	String comm= new String();
    	drop_tables = "drop table jbroad; drop table JBOAD_ID; drop table JBROAD_NOMOP;";// ";
    	comm = drop_tables;
    	SQLLoad(comm);    	
    	comm = JBROAD;
    	SQLLoad(comm);


	}
	
    public static void
    SQLLoad(String comm) throws ClassNotFoundException
	{
		// Load the Oracle Driver
		Class.forName("com.mysql.jdbc.Driver");

		try
		{
		          // Get a connection from the connection factory
			Connection con = DriverManager.getConnection(
			  "jdbc:mysql://localhost/test?", USERNAME, PASSWORD);
	
			// Show some database/driver metadata
			SQLUtil.printDriverInfo(con);

			// Create a Statement object so we can submit SQL statements to the driver
			Statement stmt = con.createStatement();
			
			int rowsAffected = stmt.executeUpdate(comm);
			if (rowsAffected == 1)
				System.out.println("OK");

			// Close the statement
			stmt.close();

			// Close the connection
			con.close();
		}
		catch (SQLException e)
		{
          	 	SQLUtil.printSQLExceptions(e);		
        }
	}
    private static String insertcom_IDlist()
    {
    	//8 is needed
    	/*  IDLIST
    	 *  buyerID*10
    	 *  sellerID
    	 *  nom_buyerID*1
    	 *  sum_sellerID
    	 * 
    	 * */
    	String res="insert into Market "+" values ('";
    	res=res+date+"','";
    	res=res+price_now+"','";
    	for(int i=0;i<3;i++)
    	{
    		res=res+buyerID[i]+"','";
    		res=res+sellerID[i]+"','";
    	}
	    res=res+44+"','";
		res=res+33+"')";
    	return res;

    }
    static String CreateT = 
		"create table Market (" +
			"DATE int not null, " +
			"PRICENOW int not null, " +
			
			"BUY3 int not null, " +
			"BUY2 int not null, " + 
			"BUY1 int not null, " +
			"SEL3 int not null, " + 
			"SEL2 int not null, " +
			"SEL1 int not null, " + 
			"SUM_BUY int not null, " +
			"SUM_SELL int not null)" 
			;
	static String STATE = 
			"create table STATE (" +
				"DATE int not null, " +
    			"PRICENOW int not null, " +
				
				"CAP_1 int not null, " +
				"OWN_1 int not null, " + 
				"MOOD_1 int not null, " +
				"FATOR1_1 int not null, " +
				"FATOR2_1 int not null, " +
				"FATOR3_1 int not null, " +
				"FATOR4_1 int not null, " +
				"CAP_2 int not null, " +
				"OWN_2 int not null, " +
				"MOOD_2 int not null, " +
				"FATOR1_2 int not null, " +
				"FATOR2_2 int not null, " +
				"FATOR3_2 int not null, " +
				"FATOR4_2 int not null, " +
				"CAP_3 int not null, " +
				"OWN_3 int not null, " +
				"MOOD_3 int not null, " +
				"FATOR1_3 int not null, " +
				"FATOR2_3 int not null, " +
				"FATOR3_3 int not null, " +
				"FATOR4_3 int not null, " +
				"CAP_4 int not null, " +
				"OWN_4 int not null, " +
				"MOOD_4 int not null, " +
				"FATOR1_4 int not null, " +
				"FATOR2_4 int not null, " +
				"FATOR3_4 int not null, " +
				"FATOR4_4 int not null, " +
				"CAP_5 int not null, " +
				"OWN_5 int not null, " +
				"MOOD_5 int not null, " +
				"FATOR1_5 int not null, " +
				"FATOR2_5 int not null, " +
				"FATOR3_5 int not null, " +
				"FATOR4_5 int not null, " +
				"CAP_6 int not null, " +
				"OWN_6 int not null, " +
				"MOOD_6 int not null, " +
				"FATOR1_6 int not null, " +
				"FATOR2_6 int not null, " +
				"FATOR3_6 int not null, " +
				"FATOR4_6 int not null, " +
				"CAP_7 int not null, " +
				"OWN_7 int not null, " +
				"MOOD_7 int not null, " +
				"FATOR1_7 int not null, " +
				"FATOR2_7 int not null, " +
				"FATOR3_7 int not null, " +
				"FATOR4_7 int not null, " +
				"CAP_8 int not null, " +
				"OWN_8 int not null, " +
				"MOOD_8 int not null, " +
				"FATOR1_8 int not null, " +
				"FATOR2_8 int not null, " +
				"FATOR3_8 int not null, " +
				"FATOR4_8 int not null, " +
				"CAP_9 int not null, " +
				"OWN_9 int not null, " +
				"MOOD_9 int not null, " +
				"FATOR1_9 int not null, " +
				"FATOR2_9 int not null, " +
				"FATOR3_9 int not null, " +
				"FATOR4_9 int not null, " +
				"CAP_10 int not null, " +
				"OWN_10 int not null, " +
				"MOOD_10 int not null, " +
				"FATOR1_10 int not null, " +
				"FATOR2_10 int not null, " +
				"FATOR3_10 int not null, " +
				"FATOR4_10 int not null, " +	

				"INFO int)";                                      //TOTAL : 9
	
	static String	MOODTABLE = 
			"create table MOODTABLE (" +
					"DATE int not null, " +
					
					"MOOD_1 int not null, " +	
					"ETAT1_1 int not null, " +	
					"ETAT2_1 int not null, " +	
					"ETAT3_1 int not null, " +	
					"ETAT4_1 int not null, " +		
					"MOOD_2 int not null, " +	
					"ETAT1_2 int not null, " +	
					"ETAT2_2 int not null, " +	
					"ETAT3_2 int not null, " +	
					"ETAT4_2 int not null, " +		
					"MOOD_3 int not null, " +	
					"ETAT1_3 int not null, " +	
					"ETAT2_3 int not null, " +	
					"ETAT3_3 int not null, " +	
					"ETAT4_3 int not null, " +		
					"MOOD_4 int not null, " +	
					"ETAT1_4 int not null, " +	
					"ETAT2_4 int not null, " +	
					"ETAT3_4 int not null, " +	
					"ETAT4_4 int not null, " +		
					"MOOD_5 int not null, " +	
					"ETAT1_5 int not null, " +	
					"ETAT2_5 int not null, " +	
					"ETAT3_5 int not null, " +	
					"ETAT4_5 int not null, " +		
					"MOOD_6 int not null, " +	
					"ETAT1_6 int not null, " +	
					"ETAT2_6 int not null, " +	
					"ETAT3_6 int not null, " +	
					"ETAT4_6 int not null, " +		
					"MOOD_7 int not null, " +	
					"ETAT1_7 int not null, " +	
					"ETAT2_7 int not null, " +	
					"ETAT3_7 int not null, " +	
					"ETAT4_7 int not null, " +		
					"MOOD_8 int not null, " +	
					"ETAT1_8 int not null, " +	
					"ETAT2_8 int not null, " +	
					"ETAT3_8 int not null, " +	
					"ETAT4_8 int not null, " +	
					"MOOD_9 int not null, " +	
					"ETAT1_9 int not null, " +	
					"ETAT2_9 int not null, " +	
					"ETAT3_9 int not null, " +	
					"ETAT4_9 int not null, " +
					"MOOD_10 int not null, " +	
					"ETAT1_10 int not null, " +	
					"ETAT2_10 int not null, " +	
					"ETAT3_10 int not null, " +	
					"ETAT4_10 int not null, " +	
					
					"INFO int)";                                    //TOTAL : 73
	                    
    private static String insertcom_STATE()
    {
    	
    	String res="insert into STATE"+" values ('";
    	
    	res=res+date+"','";
    	res=res+price_now+"','";
    	
    	for(int i=0;i<group_nom;i++)
    	{
    		res=res+cap[i]+"','";
    		res=res+nom[i]+"','";
    		res=res+mood[i]+"','";
    		res=res+fator1[i]+"','";
    		res=res+fator2[i]+"','";
    		res=res+fator3[i]+"','";
    		res=res+fator4[i]+"','";
    	}

		res=res+0+"')";         //info
    	return res;

    }
    private static String insertcom_MOODTABLE()
    {
    	
    	String res="insert into MOODTABLE"+" values ('";
    	
    	res=res+date+"','";
    	
    	for(int i=0;i<group_nom;i++)
    	{
    		res=res+cap[i]+"','";
    		res=res+nom[i]+"','";
    		res=res+mood[i]+"','";
    		res=res+etat1[i]+"','";
    		res=res+etat2[i]+"','";
    		res=res+etat3[i]+"','";
    		res=res+etat4[i]+"','";
    	}

		res=res+0+"')";         //info
    	return res;

    }
    private static String insertcom_jbroad_ID()
    {
	    String res="insert into JBROAD_ID"+" values ('";
		for(int j=0;j<nom_coljbroad;j++)
		{
			for(int i=0;i<group_nom;i++)
			{
				res=res+buyerID[j][i]+"','";
			}
		}
		for(int j=0;j<nom_coljbroad;j++)
		{
			for(int i=0;i<group_nom;i++)
			{
				res=res+sellerID[j][i]+"','";
			}
		}
		res=res+0+"')";         //info
    	return res;
    }
	private static String insertcom_jbroad_NOMOP()
	{
	    String res="insert into JBROAD_NOMOP"+" values ('";
		for(int j=0;j<nom_coljbroad;j++)
		{
			for(int i=0;i<group_nom;i++)
			{
				res=res+buyerNOMOP[j][i]+"','";
			}
		}
		for(int j=0;j<nom_coljbroad;j++)
		{
			for(int i=0;i<group_nom;i++)
			{
				res=res+sellerNOMOP[j][i]+"','";
			}
		}
		res=res+0+"')";         //info
    	return res;
    }
}//end of class
