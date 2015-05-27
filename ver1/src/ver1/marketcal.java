package ver1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class marketcal {
	//---fixed para------------
	private static int group_nom = 10;
	private static int enddate   = 3;
	
	public static int nom_coljbroad=3;

	//SQL TABLE NOM
	public static String USERNAME         ="root";
	public static String PASSWORD         ="xie";
	public static String nom_jbroad       ="JBROAD";
	public static String nom_IDlisttable  ="IDLISTTABLE";
	
	static String STATE = 
			"create table STATE (" +
				"DATE int not null, " +
				"PRICENOW int not null, " +
				
				"CAP_1 int not null, " +
				"OWN_1 int not null, " + 
				"MOOD_1 int not null, " +
				"factor1_1 int not null, " +
				"factor2_1 int not null, " +
				"factor3_1 int not null, " +
				"factor4_1 int not null, " +
				"CAP_2 int not null, " +
				"OWN_2 int not null, " +
				"MOOD_2 int not null, " +
				"factor1_2 int not null, " +
				"factor2_2 int not null, " +
				"factor3_2 int not null, " +
				"factor4_2 int not null, " +
				"CAP_3 int not null, " +
				"OWN_3 int not null, " +
				"MOOD_3 int not null, " +
				"factor1_3 int not null, " +
				"factor2_3 int not null, " +
				"factor3_3 int not null, " +
				"factor4_3 int not null, " +
				"CAP_4 int not null, " +
				"OWN_4 int not null, " +
				"MOOD_4 int not null, " +
				"factor1_4 int not null, " +
				"factor2_4 int not null, " +
				"factor3_4 int not null, " +
				"factor4_4 int not null, " +
				"CAP_5 int not null, " +
				"OWN_5 int not null, " +
				"MOOD_5 int not null, " +
				"factor1_5 int not null, " +
				"factor2_5 int not null, " +
				"factor3_5 int not null, " +
				"factor4_5 int not null, " +
				"CAP_6 int not null, " +
				"OWN_6 int not null, " +
				"MOOD_6 int not null, " +
				"factor1_6 int not null, " +
				"factor2_6 int not null, " +
				"factor3_6 int not null, " +
				"factor4_6 int not null, " +
				"CAP_7 int not null, " +
				"OWN_7 int not null, " +
				"MOOD_7 int not null, " +
				"factor1_7 int not null, " +
				"factor2_7 int not null, " +
				"factor3_7 int not null, " +
				"factor4_7 int not null, " +
				"CAP_8 int not null, " +
				"OWN_8 int not null, " +
				"MOOD_8 int not null, " +
				"factor1_8 int not null, " +
				"factor2_8 int not null, " +
				"factor3_8 int not null, " +
				"factor4_8 int not null, " +
				"CAP_9 int not null, " +
				"OWN_9 int not null, " +
				"MOOD_9 int not null, " +
				"factor1_9 int not null, " +
				"factor2_9 int not null, " +
				"factor3_9 int not null, " +
				"factor4_9 int not null, " +
				"CAP_10 int not null, " +
				"OWN_10 int not null, " +
				"MOOD_10 int not null, " +
				"factor1_10 int not null, " +
				"factor2_10 int not null, " +
				"factor3_10 int not null, " +
				"factor4_10 int not null, " +	

				"INFO int)";                                      //TOTAL : 73
	
	static String	MOODTABLE = 
			"create table MOODTABLE (" +
					"DATE int not null, " +
					"PRICENOW int not null, " +
					
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
					
					"INFO int)";                                    //TOTAL : 53
	
	
	/*fixed part : DATE PRICENOW
	*buy[] : howmuch nom in j group
	*nom_buyerID[] : howmuch id
	*buyerID[][] : the ID * group_nom
	*buyerNOMOP[][] : * group_nom
	*
	*/
	
	
    static String JBROAD = 
    		"create table JBROAD (" +
    			"DATE int not null, " +
    			"PRICENOW int not null, " +
    			
    			"BUY1 int not null, " + 
    			"BUY2 int not null, " +
    			"BUY3 int not null, " +         
    			
    			"SEL1 int not null, " +     
    			"SEL2 int not null, " +
    			"SEL3 int not null, " +  
    			
    			"BUY1_ID_NOM int not null, " +
    			"BUY2_ID_NOM int not null, " +
    			"BUY3_ID_NOM int not null, " +          
    			"SEL1_ID_NOM int not null, " + 
    			"SEL2_ID_NOM int not null, " + 
    			"SEL3_ID_NOM int not null, " + 	
	
    			"SUM_BUY int not null, " +
    			"SUM_SELL int not null, " +
    			"INFO int);";                          //total : 17 row
    
    static String JBROAD_NOMOP = 
    		"create table JBROAD_NOMOP (" +
    		"DATE int not null, " +
		    "BUY_NOMOP10 int not null, " +
			"BUY_NOMOP11 int not null, " +
			"BUY_NOMOP12 int not null, " +
			"BUY_NOMOP13 int not null, " +
			"BUY_NOMOP14 int not null, " +
			"BUY_NOMOP15 int not null, " +
			"BUY_NOMOP16 int not null, " +
			"BUY_NOMOP17 int not null, " +
			"BUY_NOMOP18 int not null, " +
			"BUY_NOMOP19 int not null, " +
			"BUY_NOMOP20 int not null, " +
			"BUY_NOMOP21 int not null, " +
			"BUY_NOMOP22 int not null, " +
			"BUY_NOMOP23 int not null, " +
			"BUY_NOMOP24 int not null, " +
			"BUY_NOMOP25 int not null, " +
			"BUY_NOMOP26 int not null, " +
			"BUY_NOMOP27 int not null, " +
			"BUY_NOMOP28 int not null, " +
			"BUY_NOMOP29 int not null, " +
			"BUY_NOMOP30 int not null, " +
			"BUY_NOMOP31 int not null, " +
			"BUY_NOMOP32 int not null, " +
			"BUY_NOMOP33 int not null, " +
			"BUY_NOMOP34 int not null, " +
			"BUY_NOMOP35 int not null, " +
			"BUY_NOMOP36 int not null, " +
			"BUY_NOMOP37 int not null, " +
			"BUY_NOMOP38 int not null, " +
			"BUY_NOMOP39 int not null, " +
		
			"SEL_NOMOP10 int not null, " +
			"SEL_NOMOP11 int not null, " +
			"SEL_NOMOP12 int not null, " +
			"SEL_NOMOP13 int not null, " +
			"SEL_NOMOP14 int not null, " +
			"SEL_NOMOP15 int not null, " +
			"SEL_NOMOP16 int not null, " +
			"SEL_NOMOP17 int not null, " +
			"SEL_NOMOP18 int not null, " +
			"SEL_NOMOP19 int not null, " +
			"SEL_NOMOP20 int not null, " +
			"SEL_NOMOP21 int not null, " +
			"SEL_NOMOP22 int not null, " +
			"SEL_NOMOP23 int not null, " +
			"SEL_NOMOP24 int not null, " +
			"SEL_NOMOP25 int not null, " +
			"SEL_NOMOP26 int not null, " +
			"SEL_NOMOP27 int not null, " +
			"SEL_NOMOP28 int not null, " +
			"SEL_NOMOP29 int not null, " +
			"SEL_NOMOP30 int not null, " +
			"SEL_NOMOP31 int not null, " +
			"SEL_NOMOP32 int not null, " +
			"SEL_NOMOP33 int not null, " +
			"SEL_NOMOP34 int not null, " +
			"SEL_NOMOP35 int not null, " +
			"SEL_NOMOP36 int not null, " +
			"SEL_NOMOP37 int not null, " +
			"SEL_NOMOP38 int not null, " +
			"SEL_NOMOP39 int not null, " +
			"INFO int);";                              //total : 62 rows
    static String JBROAD_ID = 
    		"create table JBROAD_ID (" +
    		"DATE int not null, " +
		    "BUY_ID10 int not null, " +
			"BUY_ID11 int not null, " +
			"BUY_ID12 int not null, " +
			"BUY_ID13 int not null, " +
			"BUY_ID14 int not null, " +
			"BUY_ID15 int not null, " +
			"BUY_ID16 int not null, " +
			"BUY_ID17 int not null, " +
			"BUY_ID18 int not null, " +
			"BUY_ID19 int not null, " +
			"BUY_ID20 int not null, " +
			"BUY_ID21 int not null, " +
			"BUY_ID22 int not null, " +
			"BUY_ID23 int not null, " +
			"BUY_ID24 int not null, " +
			"BUY_ID25 int not null, " +
			"BUY_ID26 int not null, " +
			"BUY_ID27 int not null, " +
			"BUY_ID28 int not null, " +
			"BUY_ID29 int not null, " +
			"BUY_ID30 int not null, " +
			"BUY_ID31 int not null, " +
			"BUY_ID32 int not null, " +
			"BUY_ID33 int not null, " +
			"BUY_ID34 int not null, " +
			"BUY_ID35 int not null, " +
			"BUY_ID36 int not null, " +
			"BUY_ID37 int not null, " +
			"BUY_ID38 int not null, " +
			"BUY_ID39 int not null, " +
			"SEL_ID10 int not null, " +
			"SEL_ID11 int not null, " +
			"SEL_ID12 int not null, " +
			"SEL_ID13 int not null, " +
			"SEL_ID14 int not null, " +
			"SEL_ID15 int not null, " +
			"SEL_ID16 int not null, " +
			"SEL_ID17 int not null, " +
			"SEL_ID18 int not null, " +
			"SEL_ID19 int not null, " +
			"SEL_ID20 int not null, " +
			"SEL_ID21 int not null, " +
			"SEL_ID22 int not null, " +
			"SEL_ID23 int not null, " +
			"SEL_ID24 int not null, " +
			"SEL_ID25 int not null, " +
			"SEL_ID26 int not null, " +
			"SEL_ID27 int not null, " +
			"SEL_ID28 int not null, " +
			"SEL_ID29 int not null, " +
			"SEL_ID30 int not null, " +
			"SEL_ID31 int not null, " +
			"SEL_ID32 int not null, " +
			"SEL_ID33 int not null, " +
			"SEL_ID34 int not null, " +
			"SEL_ID35 int not null, " +
			"SEL_ID36 int not null, " +
			"SEL_ID37 int not null, " +
			"SEL_ID38 int not null, " +
			"SEL_ID39 int not null, " +
			"INFO int);";                           //total : 62 row

	static String IDLIST = 
			"create table IDLIST (" +
				"DATE int not null, " +
				"PRICENOW int not null, " +
				
				"buyerIDlist1 int not null, " +
				"buyerIDlist2 int not null, " +
				"buyerIDlist3 int not null, " +
				"buyerIDlist4 int not null, " +
				"buyerIDlist5 int not null, " +
				"buyerIDlist6 int not null, " +
				"buyerIDlist7 int not null, " +
				"buyerIDlist8 int not null, " +
				"buyerIDlist9 int not null, " +
				"buyerIDlist10 int not null, " +

				"sellerIDlist1 int not null, " +
				"sellerIDlist2 int not null, " +
				"sellerIDlist3 int not null, " +
				"sellerIDlist4 int not null, " +
				"sellerIDlist5 int not null, " +
				"sellerIDlist6 int not null, " +
				"sellerIDlist7 int not null, " +
				"sellerIDlist8 int not null, " +
				"sellerIDlist9 int not null, " +
				"sellerIDlist10 int not null, " +

				"buyerNOMOPlist1 int not null, " +
				"buyerNOMOPlist2 int not null, " +
				"buyerNOMOPlist3 int not null, " +
				"buyerNOMOPlist4 int not null, " +
				"buyerNOMOPlist5 int not null, " +
				"buyerNOMOPlist6 int not null, " +
				"buyerNOMOPlist7 int not null, " +
				"buyerNOMOPlist8 int not null, " +
				"buyerNOMOPlist9 int not null, " +
				"buyerNOMOPlist10 int not null, " +
				
				"sellerNOMOPlist1 int not null, " +
				"sellerNOMOPlist2 int not null, " +
				"sellerNOMOPlist3 int not null, " +
				"sellerNOMOPlist4 int not null, " +
				"sellerNOMOPlist5 int not null, " +
				"sellerNOMOPlist6 int not null, " +
				"sellerNOMOPlist7 int not null, " +
				"sellerNOMOPlist8 int not null, " +
				"sellerNOMOPlist9 int not null, " +
				"sellerNOMOPlist10 int not null, " +

				"nom_buyerIDlist int not null, " + 
				"nom_sellerIDlist int not null, " + 
				"INFO int);";                                    //total : 45

	
	
	public static int date;
	public static int price_now  = 20;
	public static int market_type =0;             //1 buying 2 selling
	public static int sum_buy=0;
	public static int sum_sell=0;

	
	public static int ID[]      = new int[] {1,2,3,4,5,6,7,8,9,10};  // ID always = j+1
	public static int cap[]     = new int[] {555,555,555,555,555,555,555,555,555,555};
	private static int mood[]   = new int[] {2,1,2,1,-2,2,3,2,1,-1,-3};
	private static int nom[]    = new int[] {1,2,25,3,2,20,24,20,222,200};
	
	
	
	//should be renew every deal
	private static int buy[]    = new int[3];
	private static int sell[]   = new int[3];
	private static int buyerID[][]   = new int [3][group_nom];
	private static int sellerID[][]  = new int [3][group_nom];
	private static int nom_buyerID[]   = new int [3];             // NOT nombre of buying BUT buyer
	private static int nom_sellerID[]  = new int [3];
	private static int buyerNOMOP[][]   = new int [3][group_nom]; // SAME AS NOM_OP
	private static int sellerNOMOP[][]  = new int [3][group_nom];
	
	
	private static int buyerIDlist[] = new int [group_nom];
	private static int buyerNOMOPlist[] = new int [group_nom];
	private static int nom_buyerIDlist = 0;
	
	private static int sellerIDlist[] = new int [group_nom];
	private static int sellerNOMOPlist[] = new int [group_nom];
	private static int nom_sellerIDlist = 0;
	
	private static int nom_op[]      = new int [group_nom];  // nom of deal FOR RECORD
	private static int dir_op[]      = new int [group_nom];  //1 for buy,2 for sell
	
	private static int factor1[]        = new int [group_nom];
	private static int factor2[]        = new int [group_nom];
	private static int factor3[]        = new int [group_nom];
	private static int factor4[]        = new int [group_nom];
	
	private static int etat1[]         = new int [group_nom];
	private static int etat2[]         = new int [group_nom];
	private static int etat3[]         = new int [group_nom];
	private static int etat4[]         = new int [group_nom];
	
	private static int
	mart_moodf1[][] = {
		// mood/own  much mid less
					{ -2, -2, -3 },
					{ -1, -1, -2 },	
					{ 0, -1, -1 },		
					{ 1, 1, 0 },	
					{ 2, 1, 1 },	
					{ 3, 2, 1 },
					{ 3, 2, -1 },	
					{ 1, 0, -1 }           // this is [5] and 3+3			
	};
	
	private static int
	mart_moodf2[][] = {
			// mood/own  much mid less
						{ -3, -2, -2 },
						{ -2, -1, -1 },	
						{ -1, -1, 0 },		
						{ 0, 1, 1 },	
						{ 1, 1, 2 },	
						{ 1, 2, 3 },
						{ -1, 2, 3 },	
						{ -1, 0, 1 }           // this is [5] and 3+3			
		};
	
	
	public static void
	main(String[] args) 
	{
		//SQL test
		String comm = new String();
		comm = insertcom_jbroad();
		try {
		SQLLoad(comm);
		} catch(Exception e)
		{
			
		}
		System.out.println("hello\n TEST OF MARKETCAL");
		System.out.println("********************");
		/* trying to init les valeurs
		 * date, buyerIDGROUP to0,
		 * */
		date=1;
		sum_buy=0;
		sum_sell=0;
		
		for(int i=0;i<group_nom;i++) {
			factor1[i]=0;
			factor2[i]=0;
			factor3[i]=0;
			factor4[i]=0;
			
			etat1[i]=0;
			etat2[i]=0;
			etat3[i]=0;
			etat4[i]=0;

		}
		
		for(int i=0;i<3;i++) {
			buyerID[i][0]=0;
			nom_buyerID[i]=0;
			sellerID[i][0]=0;
			nom_sellerID[i]=0;
		}
		try {
			SQL_droptables();
			SQL_creatjbroad();
		} catch (Exception ex)
		{
		}
		
		for (int i=0;i<60;i++)
		{
			if (buyandsell()>=0) 
			{
			
			}
			else System.out.println("error fixme\n");
		}
	}
	
	
	public static void renew_mood()
	{
		for (int i=0; i<group_nom; i++)
		{
			renew_factor1();
			mood[i]= mart_moodf2[mood[i]+3][factor1[i]];         //can change matrix here
		}
		mood[9]=-3;

	}
	
	
	public static void renew_factor1()
	{
		for (int i=0; i<group_nom; i++)
		{
			if (nom[i]>2)
				factor1[i] = 2;
			else if (nom[i]>1)
				factor1[i] = 1;
			else 
				factor1[i] = 0;
		}
	}

	public static void renew_factor2()
	{
		for (int i=0; i<group_nom; i++)
		{
			if (nom[i]>0 && cap[i]>0)
				factor2[i] = (555-cap[i])/nom[i];
			else 
				factor2[i] = 20;
		}
	}
	public static void change_weather()
	{
		System.out.println("*****new weather changing*****\n");
		renew_factor1();
		renew_mood();
	}
	public static int buyandsell()
	{
		System.out.println("new buyandsell\n");
		//date checking but not necessary
		//if (date>=enddate) return -1;
		System.out.println("new day"+date+"\n");

		
		int nom_op=0;
		int dir=1;
		int temp_j = 0;
		for (int i=0; i<group_nom; i++)
		{
			//finding in group for buyer and seller
			if(mood[i]==0)
				continue;
			//geting buy and sell table
			if( (mood[i] > 0) && (cap[i]>0)) 
			{
				dir = 1;
				temp_j = mood[i]-1;
				nom_op=get_nomop(i);
			} else if ((mood[i] < 0) && (nom[i]>0)) {
				dir = 2;
				temp_j = -mood[i]-1;
				nom_op=get_nomop(i);
			} else continue;
			
			
			regi_buysell(i,temp_j,dir,nom_op);

			res_print();

			
		}//end for group
		
		try {
			SQL_savejbroad();
			//SQL_saveIDLIST();

		} catch (Exception ex)
		{
		}
		
		
		//market type
		if ( sum_buy ==0 || sum_sell==0)
		{
			System.out.println("oneside market--");
			/*oneside market, only buyer or only seller, cant deal*/
			market_type=3;
		} else if ( sum_buy > sum_sell)
		{
			/*buying market, price_now become the lowest of buying side*/
			System.out.println("buying market--");
			market_type=1;
		} else if( sum_buy <= sum_sell) {
			/*selling market, price_now become the highest of selling side*/
			System.out.println("selling market\n");
			market_type=2;
		}
		
		
		//cal sum and deal
		//cleanup jgroup for j loop on strong side and all on side side		
		int temp_sum_op=0;
		if (market_type == 1)
		{
			
			for (int j=2;j>=0;j--)
			{
				if (buy[j]==0) 
				{
					System.out.println(" jgroup "+j+" uni 0--");
					continue;
				}
				temp_sum_op+=buy[j];
				if (temp_sum_op>sum_sell)
				{
					//cleaning up JGROUP
					int temp_nomop = sum_sell-(temp_sum_op-buy[j]);
					System.out.println("halfcleanup jgroup "+j+"nomop = sum - sumop + buy[j"+temp_nomop+" "+sum_sell+" "+ temp_sum_op+" "+buy[j]+"\n");
					cleanup_jgroup(j,1,temp_nomop);
					
					price_now+=(j+1);            //price change
					System.out.println("--pricechanged"+j+"\n");
					//after price changed, to clear the temp para
					
					sum_buy=sum_buy-sum_sell;   //TABLE ONE
					sum_sell=0;
					 
					break;
				} else {
					//already addup temp sum_buy
					cleanup_jgroup(j,1);
				}
			}//end of for
					
		} else if (market_type == 2) {

			for (int j=2;j>=0;j--)
			{
				if (sell[j]==0) continue;
				temp_sum_op+=sell[j];
				if (temp_sum_op>=sum_buy)
				{
					int temp_nomop = sum_buy-(temp_sum_op-sell[j]);            // in the last j group, j needed 
					cleanup_jgroup(j,2,temp_nomop);
					
					price_now-=(j+1);
					System.out.println("--pricechanged"+j+"\n");
					
					sum_sell=sum_sell-sum_buy;
					sum_buy=0;
	
					break;
				} else {					
					//already addup temp sum_sell
					cleanup_jgroup(j,2);
				}
			}//end of for
		} else if (market_type == 3) {
			
			
		}
		cleanup_jgroup_weakside();
		
		
		
		
		
		res_print();
			
		try {
			//SQL_savejbroad();
			//SQL_saveIDLIST();

		} catch (Exception ex)
		{
		}

		//reset all: jbroad, idlist
		System.out.println("day "+date+" ends.date++\n");
		dayclosing_reset();
		try {
			SQL_saveSTATE();
			//SQL_saveMOODTABLE();
		} catch (Exception ex)
		{
		}
		
		change_weather();
		
		
		check_cleanup();
		res_print();
		tables_print();
		date++;
		
		return 0;
	}//end of buying
	
	public static void res_print()
	{
		for (int i=0;i<3;i++)
		{
		System.out.println("buy "+i+" "+buy[i]);
		System.out.println("sel "+i+" "+sell[i]);
		}
		System.out.println("sum_sel "+sum_sell);
		System.out.println("sum_buy "+sum_buy);
		System.out.println("price_now "+price_now);

	}
	public static void tables_print()
	{
		System.out.println("*******table********");
		System.out.println("ID "+" "+ID[0]+" "+ID[1]+" "+ID[2]+" "+ID[3]);
		System.out.println("mood "+mood[0]+" "+mood[1]+" "+mood[2]+" "+mood[3]);
		System.out.println("cap "+cap[0]+" "+cap[1]+" "+cap[2]+" "+cap[3]);
		System.out.println("nom "+nom[0]+" "+nom[1]+" "+nom[2]+" "+nom[3]);
		System.out.println("*******table********");

	}
	public static void check_cleanup()
	{
		/* which is needed check everyday
		 * table1---------
		 * sum_sell         == rest of day
		 * table2---------
		 * nom_sellerIDlist == 0
		 * table3---------
		 */
		if( (nom_sellerIDlist==0)&&(sum_sell!=0) )
			System.out.println("wrong"+"1");
		if( (nom_buyerIDlist==0)&&(sum_buy!=0) )
			System.out.println("wrong"+"2");
		
	}
	

	/* J BROAD: THE ONE 3 2 1  -1 -2 -3
	 * buy[mood - 1]
	 * mood :         3 2 1         -1 -2 -3
	 * buy[]:         2 1 0   sel[]: 0  1  2 
	 * buyerID[]:     2 1 0
	 * 
	 * ...COLLECTING INFO STAGE...
	 * TABLE ONE: FOR COLLECTING THE BUYER SELLER IOFO FOR EVERY J GROUP
	 * 
	 * 
	 * TABLE TWO: FOR IDLIST AND NOM_IDLIST(EASY WEAKSIDE CLEANUP)
	 * TABLE THREE: FOR HISTORY RECORD OF BUYING AND DIRECTION AND CLEAN UP EVERY DAY
	 * ...AFTER 1 STAGE...
	 * JUDGING PRICE_NOW USING TABLE ONE AND DEAL THE STRONG SIDE
	 * FINAL RES: J BROAD LEAVING AND SUM_SELL OR SUM_BUY
	 * SETTING MARKET TYPE AND CLEAN UP IN TABLE TWO(WEAKSIDE)
	 * CLEAN UP TABLE TREE
	 */
	public static void regi_buysell(int i,int j,int temp_dir_op,int temp_nom_op)
	{
		if (j<0||i<0||temp_nom_op<0) throw_EX("neg para fun regi");
		if (temp_dir_op==1)
		{
			buy[j]  += temp_nom_op;
			buyerID[j][nom_buyerID[j]]=ID[i];  //puting buyerID and sellerID         TABLE ONE
			buyerNOMOP[j][nom_buyerID[j]]=temp_nom_op;   //puting buyerNOMOP         TABLE ONE
			nom_buyerID[j]++;
			sum_buy+= temp_nom_op;
			
			buyerIDlist[nom_buyerIDlist]=ID[i];  //should take care the nom id list  TABLE TWO
			buyerNOMOPlist[nom_buyerIDlist]=temp_nom_op;
			nom_buyerIDlist++;
			
			dir_op[j]=1;                         //op direction 1=buy, 0=sell          TABLE THREE
			nom_op[j]+= temp_nom_op;                 //puting op nom(a list of all) should 			
		} else if (temp_dir_op==2) {
			sell[j] += temp_nom_op;// this should be aware
			sellerID[j][nom_sellerID[j]]=ID[i];
			sellerNOMOP[j][nom_sellerID[j]]=temp_nom_op;   //puting sellerNOMOP         TABLE ONE
			nom_sellerID[j]++;
			sum_sell+= temp_nom_op;

			sellerIDlist[nom_sellerIDlist]=ID[i];
			sellerNOMOPlist[nom_sellerIDlist]=temp_nom_op;
			nom_sellerIDlist++;
			
			dir_op[j]=2;                         //op direction 1=buy, 0=sell
			nom_op[j]+= temp_nom_op;                 //puting op nom(a list of all) should have direction
		}

	}
	
	public static void cleanup_jgroup(int j,int dir)
	{
		int temp_id=0;
		int temp_nomop=0;
		if (dir==1)
		{
			//in this j group id list, we clean all              TABLE ONE
			//cleaning up the list of ID                         TABLE TWO

			int temp_nomid=nom_buyerID[j];
			for (int l=0 ;l<temp_nomid;l++)
			{
				temp_id=buyerID[j][l];
				temp_nomop=buyerNOMOP[j][l];
				buyerID[j][l]=0;
				buyerNOMOP[j][l]=0;
				
				//doing our deal
				System.out.println("dealed ID: "+temp_id+" for nom : "+temp_nomop+"\n");
				cap[temp_id-1]-=(temp_nomop*price_now);
				nom[temp_id-1]+=temp_nomop;

			}
			
			nom_buyerID[j]=0;
			buy[j]=0;
			System.out.println("--Jgroupbuy "+j+" cleanup\n");					
		} else if (dir==2) {
			//cleaning up the list of ID
			
			int temp_nomid=nom_sellerID[j];
			nom_sellerID[j]=0;
			for (int l=0;l<temp_nomid;l++)
			{
				temp_id=sellerID[j][l];
				if (temp_id==0) break;  
				temp_nomop=buyerNOMOP[j][l];
				sellerID[j][l]=0;
				sellerNOMOP[j][l]=0;
				
				System.out.println("dealed ID: "+temp_id+" for nom : "+temp_nomop+"\n");
				cap[temp_id-1]+=(temp_nomop*price_now);
				nom[temp_id-1]-=temp_nomop;
			}
			
			nom_sellerID[j]=0;
			sell[j]=0;
			System.out.println("--Jgroupsell "+j+" cleanup\n");
		}

	}
	public static void 
	cleanup_jgroup(int j,int dir, int temp_max_nomop)
	{
		
		if (temp_max_nomop <0) throw_EX("neg val");
					
		int temp_id=0;
		int temp_nomop=0;
		int temp_nomid=0;
		int temp_total=0;
		int temp_rest=0;
		int temp_nomid_dealed=0;
		
		if (dir==1)
		{
			//in this j group id list, we clean all              TABLE ONE
			//cleaning up the list of ID                         TABLE TWO
			
			temp_nomid=nom_buyerID[j];
			for (int l=0 ;l<temp_nomid;l++)
			{
				temp_id=buyerID[j][l];
				temp_nomop=buyerNOMOP[j][l];
				buyerID[j][l]=0;
				buyerNOMOP[j][l]=0;
				temp_total+=temp_nomop;
				System.out.println("jgroupid: No"+l+" total "+temp_total+" + op "+temp_nomop+" while need "+temp_max_nomop);
				if (temp_total>temp_max_nomop)
				{
					temp_rest=temp_total-temp_max_nomop;
					temp_nomop=temp_nomop-temp_rest; //cut the rest
					temp_total=temp_max_nomop;
					buyerNOMOP[j][l]=temp_rest;
					System.out.println("jgroupid: "+temp_id+" rest nom : "+temp_rest+"\n");
					
				} else if (temp_total==temp_max_nomop)
				{
					System.out.println("jgroupid: "+temp_id+" no rest");
				}
				
				//doing our deal
				cap[temp_id-1]-=(temp_nomop*price_now);
				nom[temp_id-1]+=temp_nomop;
				
				if (temp_total>=temp_max_nomop) 
				{
					temp_nomid_dealed =l+1;
					break;
				}
			}
			//collecting and put the left ahead and clean till end
			int temp_i= 0;
			for (int l=temp_nomid_dealed; l<temp_nomid ;l++)
			{
				buyerID[j][temp_i]=buyerID[j][l];
				buyerNOMOP[j][temp_i]=buyerNOMOP[j][l];
				temp_i++;
			}
			for (;temp_i<group_nom;temp_i++)
			{
				buyerID[j][temp_i]=0;
				buyerNOMOP[j][temp_i]=0;
			}
			
			nom_buyerID[j]-=temp_nomid_dealed;  //jbroad IDnom renewing 
			buy[j]-=temp_max_nomop;
			System.out.println("--Jgroupbuy "+j+" halfcleanup"+buy[j]+"\n");					
		} else if (dir==2) {
			//cleaning up the list of ID
			temp_nomid=nom_sellerID[j];

			for (int l=0;( l<temp_nomid );l++)
			{
				temp_id=sellerID[j][l];		
				temp_nomop=sellerNOMOP[j][l];
				sellerID[j][l]=0;
				sellerNOMOP[j][l]=0;
				temp_total+=temp_nomop;
				if (temp_total>temp_max_nomop)
				{
					temp_rest=temp_total-temp_max_nomop;
					System.out.println("****"+temp_rest+" "+temp_total+" "+temp_max_nomop+"\n");
					temp_nomop=temp_nomop-temp_rest; //cut the rest
					temp_total=temp_max_nomop;
					sellerNOMOP[j][l]=temp_rest;
					System.out.println("jgroupid: "+temp_id+" rest nom : "+temp_rest+"\n");
				} else if (temp_total==temp_max_nomop)
				{
					System.out.println("jgroupid: "+temp_id+" no rest");
				}
				
				cap[temp_id-1]+=(temp_nomop*price_now);
				nom[temp_id-1]-=temp_nomop;
				
				if (temp_total>=temp_max_nomop)
				{
					temp_nomid_dealed =l+1;
					break;
				}
			}
			//collecting and put the left ahead
			int temp_i= 0;
			for (int l=temp_nomid_dealed; l<temp_nomid ;l++)
			{
				sellerID[j][temp_i]=sellerID[j][l];
				sellerNOMOP[j][temp_i]=sellerNOMOP[j][l];
				temp_i++;
			}
			for (;temp_i<group_nom;temp_i++)
			{
				sellerID[j][temp_i]=0;
				sellerNOMOP[j][temp_i]=0;
			}
			
			nom_sellerID[j]-=temp_nomid_dealed;  //jbroad IDnom renewing 
			sell[j]-=temp_max_nomop;
			System.out.println("--Jgroupsell "+j+" halfcleanup"+sell[j]+"\n");
		}

	
	}
	public static void cleanup_jgroup_weakside()
	{
		if (market_type == 1)
		{
			//clean up jbroad weak side
			for (int j=0;j<nom_coljbroad;j++) 
			{
				sell[j]=0;
				for (int i=0;i<group_nom;i++) 
				{
				sellerID[j][i]=0;
				}
				nom_sellerID[j]=0;
			}
			
			cleanup_IDlist(2);                 //deal the IDlisttable two
			
		} else if (market_type == 2) {
			
			for (int j=0;j<nom_coljbroad;j++) 
			{
				buy[j]=0;
				for (int i=0;i<group_nom;i++) 
				{
				buyerID[j][i]=0;
				}
				nom_buyerID[j]=0;
			}
			cleanup_IDlist(1);
			
		} else if (market_type == 3) {
			
			
		}
	}
	

	public static void cleanup_IDlist(int dir)
	{
		/* TABLE 2: IDLIST
		 * FOR THE BUYER IN SELLING MARK
		 * AND MAKE DEAL ALONG THE IDLIST
		 * SO : WEAKSIDE CLEANING
		 */
		int temp_nomop=0;
		int temp_id=0;
		
		//empty strongside
		if (dir ==1)
		{
			for (int l=0;l<group_nom;l++)
			{
				sellerIDlist[l]=0;
				sellerNOMOPlist[l] = 0;
			}
			nom_sellerIDlist=0;
		} else if (dir == 2)
		{
			for (int l=0;l<group_nom;l++)
			{
				buyerIDlist[l]=0;
				buyerNOMOPlist[l] = 0;
			}
			nom_buyerIDlist=0;
		}
		
		if (dir ==1)
		{
			for (int l=0;l<nom_buyerIDlist;l++)
			{
				temp_nomop= buyerNOMOPlist[l]; 
				buyerNOMOPlist[l] = 0;
				temp_id   = buyerIDlist[l];
				buyerIDlist[l] = 0;
				
				cap[temp_id-1]-=(temp_nomop*price_now);
				nom[temp_id-1]+=temp_nomop;
			}
			nom_buyerIDlist=0;
		} else if (dir == 2)
		{
			for (int l=0;l<nom_sellerIDlist;l++)
			{
				temp_nomop= sellerNOMOPlist[l]; 
				sellerNOMOPlist[l] = 0;
				temp_id   = sellerIDlist[l];
				sellerIDlist[l] = 0;

				cap[temp_id-1]+=(temp_nomop*price_now);
				nom[temp_id-1]-=temp_nomop;
			}
			nom_sellerIDlist=0;
		}

	}


	public static void reset_IDlist() 
	{
		for (int l=0;l<group_nom;l++)
		{
			sellerIDlist[l]=0;
			sellerNOMOPlist[l] = 0;
			buyerIDlist[l]=0;
			buyerNOMOPlist[l] = 0;
		}
		nom_buyerIDlist=0;
		nom_sellerIDlist=0;
	}
	
	public static void throw_EX (String message)
	{
		System.out.println("*****exception********");
	    System.out.println(message);
		System.out.println("*****exception********");
	}
	
	public static int get_nomop(int i)
	{
		if (cap[i]>0 && mood[i]>0)
		{
			return mood[i];
		} else if ( nom[i]>0 && mood[i]<0)
		{
			return -mood[i];
		}
		
		return 0;
	}
	
    private static String insertcom_jbroad()
    {
    	
    	String res="insert into JBROAD"+" values ('";
    	
    	res=res+date+"','";
    	res=res+price_now+"','";
    	for(int i=0;i<nom_coljbroad;i++)
    	{
    		res=res+buy[i]+"','";
    	}
		for(int i=0;i<nom_coljbroad;i++)
    	{
    		res=res+sell[i]+"','";
    	}
		
    	for(int i=0;i<nom_coljbroad;i++)
    	{
    		res=res+nom_buyerID[i]+"','";
    	}
		for(int i=0;i<nom_coljbroad;i++)
    	{
    		res=res+nom_sellerID[i]+"','";
    	}


    	res=res+sum_buy+"','";
		res=res+sum_sell+"','";
		res=res+0+"')";         //info
    	return res;

    }
    private static String insertcom_jbroad_ID()
    {
	    String res="insert into JBROAD_ID"+" values ('";

	    res=res+date+"','";
	    
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

	    res=res+date+"','";
	    
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
	
	 private static String insertcom_IDLIST()  // ID LIST NOT list
	{
	    	
    	String res="insert into IDLIST"+" values ('";
	
		res=res+date+"','";
		res=res+price_now+"','";
		for(int i=0;i<group_nom;i++)
    	{
    		res=res+buyerIDlist[i]+"','";
    	}		
		for(int i=0;i<group_nom;i++)
    	{
    		res=res+sellerIDlist[i]+"','";
    	}
		
		for(int i=0;i<group_nom;i++)
    	{
    		res=res+buyerNOMOPlist[i]+"','";
    	}		
		for(int i=0;i<group_nom;i++)
    	{
    		res=res+sellerNOMOPlist[i]+"','";
    	}
		
		res=res+nom_buyerIDlist+"','";
		res=res+nom_sellerIDlist+"','";
		res=res+0+"')";         //info
    	return res;	    	
	}
	 
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
    		res=res+factor1[i]+"','";
    		res=res+factor2[i]+"','";
    		res=res+factor3[i]+"','";
    		res=res+factor4[i]+"','";
    	}

		res=res+0+"')";         //info
    	return res;

    }
    private static String insertcom_MOODTABLE()
    {
    	
    	String res="insert into MOODTABLE"+" values ('";
    	
    	res=res+date+"','";
    	res=res+price_now+"','";
    	
    	for(int i=0;i<group_nom;i++)
    	{
    		res=res+mood[i]+"','";
    		res=res+etat1[i]+"','";
    		res=res+etat2[i]+"','";
    		res=res+etat3[i]+"','";
    		res=res+etat4[i]+"','";
    	}

		res=res+0+"')";         //info
    	return res;

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
    
    public static void
    SQLLoad(String[] comm) throws ClassNotFoundException
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
			
			for (int i=0; i<comm.length; ++i)
			{
				System.out.print(comm[i] + "...");
				int rowsAffected = stmt.executeUpdate(comm[i]);
				if (rowsAffected == 0)	// DDL statements return rowcount of 0
					System.out.println("OK--");
			}

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
    
    public static void SQL_savejbroad()  throws ClassNotFoundException
    {
    	String comm= new String();
    	comm = insertcom_jbroad_NOMOP();
    	System.out.println(comm);
    	SQLLoad(comm);
    	comm = insertcom_jbroad_ID();
    	System.out.println(comm);
    	SQLLoad(comm);
    	comm =  insertcom_jbroad();
    	System.out.println(comm);
    	SQLLoad(comm);
    }
    
    public static void SQL_saveIDLIST()  throws ClassNotFoundException
    {
    	String comm= new String();
    	comm = insertcom_IDLIST();
    	System.out.println(comm);
    	SQLLoad(comm);
    }
    
    public static void SQL_saveMOODTABLE()  throws ClassNotFoundException
    {
    	String comm= new String();
    	comm = insertcom_MOODTABLE();
    	System.out.println(comm);
    	SQLLoad(comm);
    }
    
    public static void SQL_saveSTATE()  throws ClassNotFoundException
    {
    	String comm= new String();
    	comm = insertcom_STATE();
    	System.out.println(comm);
    	SQLLoad(comm);
    }
        
    
    public static void SQL_creatjbroad()  throws ClassNotFoundException
    {
    	String[] comm= {
    			JBROAD,
    			JBROAD_ID,
    			JBROAD_NOMOP,
    			IDLIST,
    			STATE,
    			MOODTABLE
    	};
    	
    	System.out.println(comm);
    	SQLLoad(comm);
    }
    
    public static void SQL_droptables()  throws ClassNotFoundException
    {
    	String [] drop_tables = {
    		"drop table JBROAD;"
    		, "drop table JBROAD_ID;"
    		, "drop table JBROAD_NOMOP;"
    		, "drop table IDLIST;"
    		, "drop table STATE;"
    		, "drop table MOODTABLE;"
    	};
    	String[] comm= drop_tables;
    	System.out.println(comm);
    	SQLLoad(comm);
    }
    
    public static void dayclosing_reset() 
    {
    	sum_buy=0;
		sum_sell=0; 
	    for (int j=0;j<nom_coljbroad;j++) 
		{
			buy[j]=0;
			sell[j]=0;
			
			for (int i=0;i<group_nom;i++) 
			{
				buyerID[j][i]=0;
				sellerID[j][i]=0;
			}
			nom_buyerID[j]=0;
			nom_sellerID[j]=0;
		}
	    
	    reset_IDlist();
    }
	
}//class_end
