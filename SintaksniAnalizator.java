import java.io.IOException;
import java.util.*;

public class SintaksniAnalizator {
	
	HashMap<String,Integer> mVrste = new HashMap<>();
	HashMap<String,Integer> mKolone = new HashMap<>();
	
	String[][] sTabela = new String[18][12];
	String[] smene = new String[10];
	
	public SintaksniAnalizator() {
		mVrste.put("RL", 0);
		mVrste.put("E", 1);
		mVrste.put("E'", 2);
		mVrste.put("AE", 3);
		mVrste.put("AE'", 4);
		mVrste.put("T", 5);
		mVrste.put("S", 6);
		mVrste.put("loop", 7);
		mVrste.put("(", 8);
		mVrste.put(")", 9);
		mVrste.put("{", 10);
		mVrste.put("redo", 11);
		mVrste.put(";", 12);
		mVrste.put("}", 13);
		mVrste.put("||", 14);
		mVrste.put("&&", 15);
		mVrste.put("ID", 16);
		mVrste.put("CONST", 17);
		mVrste.put("#", 18);
		
		mKolone.put("loop", 0);
		mKolone.put("(", 1);
		mKolone.put(")", 2);
		mKolone.put("{", 3);
		mKolone.put("redo", 4);
		mKolone.put(";", 5);
		mKolone.put("}", 6);
		mKolone.put("||", 7);
		mKolone.put("&&", 8);
		mKolone.put("ID", 9);
		mKolone.put("CONST", 10);
		mKolone.put("#", 11);
		
		smene[0] = "loop ( E ){ S redo ( E ) ; S }";
		smene[1] = "AE E'";
		smene[2] = "|| AE E'";
		smene[3]= "";
		smene[4] = "T AE'";
		smene[5] = "&& T AE'";
		smene[6] = "";
		smene[7] = "ID";
		smene[8] = "CONST";
		smene[9] = "RL";
		smene[10] ="ID = E";
		
		for(int i=0; i<17; i++)
		{
			for(int j=0; j<11; j++)
			{
				sTabela[i][j] = "";
			}
		}
		for(int i=7; i<17;i++)
		{
			sTabela[i][i-7] = "pop";
		}
		
		sTabela[17][11] = "acc";
		
		sTabela[0][0] = "0";
		sTabela[1][9] = "1";
		sTabela[1][10] = "1";
		sTabela[2][2] = "3";
		sTabela[2][5] = "3";
		sTabela[2][7] = "2";
		sTabela[3][9] = "4";
		sTabela[3][10] = "4";
		sTabela[4][2] = "6";
		sTabela[4][5] = "6";
		sTabela[4][7] = "6";
		sTabela[4][8] = "5";
		sTabela[5][9] = "7";
		sTabela[5][10] = "8";
		sTabela[6][0] = "10";
		sTabela[6][9] = "10";
		
		for(int i=0; i<17; i++)
		{
			for(int j=0; j<11; j++)
			{
				if(sTabela[i][j] == "")
					sTabela[i][j] = "err";
			}
		}
	}
	
	public String get_from_Table(String top, Yytoken next)
	{
		String [] topS = top.split(" ");
		if(next.m_index == 8) //ID
		{
			if(topS[0].equals("ID"))
			{
				return "pop";
			}
			return sTabela[mVrste.get(top)][mKolone.get("ID")];
		}
		if(next.m_index == 9) //CONST
		{
			if(topS[0].equals("CONST"))
				return "pop";
			else
				return sTabela[mVrste.get(top)][mKolone.get("CONST")];
		}
		if(topS[0].equals("#") && next.m_text.equals("#")) //dodaj #
		{
			return "acc";
		}
		if(topS[0].equals(next.m_text))
		{
			return "pop";
		}
		if(mKolone.containsKey(next.m_text))
		return sTabela[mVrste.get(top)][mKolone.get(next.m_text)];
		
		return "err";
	}
	
	public boolean SA_LL1(MPLexerLab17727 lexer)
	{
		Stack<String> stek = new Stack<>();
		stek.push("#");
		stek.push("RL");
		boolean prepoznat = false;
		boolean greska = false;
		String pomS;
		String[] niz;
		try {
			 Yytoken next = lexer.next_token();
			do
			{
				pomS = get_from_Table(stek.peek(), next);
				switch(pomS)
				{
				case "pop":
					stek.pop();
					next = lexer.next_token();
					break;
				case "acc":
					prepoznat = true;
					break;
				case "err":
					greska = true;
					break;
				default:
					stek.pop();
					niz = smene[Integer.parseInt(pomS)].split(" ");
					String[] b = new String[niz.length];
			        int j = niz.length;
			        for (int i = 0; i < niz.length; i++) {
			            b[j - 1] = niz[i];
			            j = j - 1;
			        }
					for(String str : b)
					{
						if(!str.equals(""))
						stek.push(str);
					}
					break;
				}								
			}while(!(prepoznat || greska));
			
			return prepoznat;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prepoznat;
		
	}
}
