
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Wed Dec 14 21:22:09 CET 2022
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;

/** CUP v0.10k generated parser.
  * @version Wed Dec 14 21:22:09 CET 2022
  */
public class MPParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public MPParser() {super();}

  /** Constructor which sets the default scanner. */
  public MPParser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\051\000\002\002\004\000\002\003\006\000\002\003" +
    "\006\000\002\004\006\000\002\004\006\000\002\005\004" +
    "\000\002\005\003\000\002\007\005\000\002\007\005\000" +
    "\002\011\003\000\002\011\005\000\002\010\003\000\002" +
    "\010\003\000\002\010\003\000\002\010\003\000\002\006" +
    "\004\000\002\006\003\000\002\012\003\000\002\012\006" +
    "\000\002\012\006\000\002\012\006\000\002\012\003\000" +
    "\002\013\017\000\002\014\005\000\002\014\003\000\002" +
    "\015\005\000\002\015\003\000\002\016\005\000\002\016" +
    "\003\000\002\020\003\000\002\020\003\000\002\020\003" +
    "\000\002\020\003\000\002\020\003\000\002\020\003\000" +
    "\002\017\003\000\002\017\003\000\002\017\003\000\002" +
    "\017\003\000\002\017\003\000\002\017\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\113\000\004\004\005\001\002\000\004\002\115\001" +
    "\002\000\004\030\006\001\002\000\006\003\010\031\007" +
    "\001\002\000\004\033\012\001\002\000\004\033\012\001" +
    "\002\000\004\002\uffff\001\002\000\012\005\021\006\017" +
    "\007\020\010\016\001\002\000\004\024\106\001\002\000" +
    "\020\005\ufffb\006\ufffb\007\ufffb\010\ufffb\011\ufffb\024\ufffb" +
    "\033\ufffb\001\002\000\020\005\021\006\017\007\020\010" +
    "\016\011\024\024\027\033\012\001\002\000\004\024\ufff3" +
    "\001\002\000\004\024\ufff5\001\002\000\004\024\ufff4\001" +
    "\002\000\004\024\ufff6\001\002\000\016\003\uffec\011\uffec" +
    "\012\uffec\024\uffec\033\uffec\034\uffec\001\002\000\014\003" +
    "\103\011\024\024\027\033\012\034\105\001\002\000\004" +
    "\030\067\001\002\000\020\005\ufffc\006\ufffc\007\ufffc\010" +
    "\ufffc\011\ufffc\024\ufffc\033\ufffc\001\002\000\014\003\ufff1" +
    "\011\ufff1\024\ufff1\033\ufff1\034\ufff1\001\002\000\006\003" +
    "\031\036\032\001\002\000\016\003\ufff0\011\ufff0\012\ufff0" +
    "\024\ufff0\033\ufff0\034\ufff0\001\002\000\016\020\037\021" +
    "\044\022\033\023\036\024\041\030\040\001\002\000\016" +
    "\020\037\021\044\022\033\023\036\024\041\030\040\001" +
    "\002\000\030\003\uffdb\013\uffdb\014\uffdb\015\uffdb\016\uffdb" +
    "\017\uffdb\025\uffdb\026\uffdb\027\uffdb\031\uffdb\032\uffdb\001" +
    "\002\000\014\003\uffe9\013\uffe9\014\061\031\uffe9\032\uffe9" +
    "\001\002\000\010\003\064\013\057\032\063\001\002\000" +
    "\030\003\uffdc\013\uffdc\014\uffdc\015\uffdc\016\uffdc\017\uffdc" +
    "\025\uffdc\026\uffdc\027\uffdc\031\uffdc\032\uffdc\001\002\000" +
    "\030\003\uffda\013\uffda\014\uffda\015\uffda\016\uffda\017\uffda" +
    "\025\uffda\026\uffda\027\uffda\031\uffda\032\uffda\001\002\000" +
    "\016\020\037\021\044\022\033\023\036\024\041\030\040" +
    "\001\002\000\030\003\uffde\013\uffde\014\uffde\015\uffde\016" +
    "\uffde\017\uffde\025\uffde\026\uffde\027\uffde\031\uffde\032\uffde" +
    "\001\002\000\030\003\uffe5\013\uffe5\014\uffe5\015\051\016" +
    "\046\017\052\025\053\026\050\027\047\031\uffe5\032\uffe5" +
    "\001\002\000\014\003\uffe7\013\uffe7\014\uffe7\031\uffe7\032" +
    "\uffe7\001\002\000\030\003\uffdd\013\uffdd\014\uffdd\015\uffdd" +
    "\016\uffdd\017\uffdd\025\uffdd\026\uffdd\027\uffdd\031\uffdd\032" +
    "\uffdd\001\002\000\016\020\037\021\044\022\033\023\036" +
    "\024\041\030\040\001\002\000\016\020\uffe3\021\uffe3\022" +
    "\uffe3\023\uffe3\024\uffe3\030\uffe3\001\002\000\016\020\uffdf" +
    "\021\uffdf\022\uffdf\023\uffdf\024\uffdf\030\uffdf\001\002\000" +
    "\016\020\uffe0\021\uffe0\022\uffe0\023\uffe0\024\uffe0\030\uffe0" +
    "\001\002\000\016\020\uffe4\021\uffe4\022\uffe4\023\uffe4\024" +
    "\uffe4\030\uffe4\001\002\000\016\020\uffe2\021\uffe2\022\uffe2" +
    "\023\uffe2\024\uffe2\030\uffe2\001\002\000\016\020\uffe1\021" +
    "\uffe1\022\uffe1\023\uffe1\024\uffe1\030\uffe1\001\002\000\014" +
    "\003\uffe6\013\uffe6\014\uffe6\031\uffe6\032\uffe6\001\002\000" +
    "\006\013\057\031\056\001\002\000\030\003\uffd9\013\uffd9" +
    "\014\uffd9\015\uffd9\016\uffd9\017\uffd9\025\uffd9\026\uffd9\027" +
    "\uffd9\031\uffd9\032\uffd9\001\002\000\016\020\037\021\044" +
    "\022\033\023\036\024\041\030\040\001\002\000\014\003" +
    "\uffea\013\uffea\014\061\031\uffea\032\uffea\001\002\000\016" +
    "\020\037\021\044\022\033\023\036\024\041\030\040\001" +
    "\002\000\014\003\uffe8\013\uffe8\014\uffe8\031\uffe8\032\uffe8" +
    "\001\002\000\016\003\uffef\011\uffef\012\uffef\024\uffef\033" +
    "\uffef\034\uffef\001\002\000\016\003\uffee\011\uffee\012\uffee" +
    "\024\uffee\033\uffee\034\uffee\001\002\000\006\013\057\032" +
    "\066\001\002\000\016\003\uffed\011\uffed\012\uffed\024\uffed" +
    "\033\uffed\034\uffed\001\002\000\016\020\037\021\044\022" +
    "\033\023\036\024\041\030\040\001\002\000\006\013\057" +
    "\031\071\001\002\000\004\033\072\001\002\000\010\011" +
    "\024\024\027\033\012\001\002\000\004\012\074\001\002" +
    "\000\004\030\075\001\002\000\016\020\037\021\044\022" +
    "\033\023\036\024\041\030\040\001\002\000\006\013\057" +
    "\031\077\001\002\000\004\032\100\001\002\000\010\011" +
    "\024\024\027\033\012\001\002\000\004\033\102\001\002" +
    "\000\016\003\uffeb\011\uffeb\012\uffeb\024\uffeb\033\uffeb\034" +
    "\uffeb\001\002\000\020\002\ufffd\003\ufffd\011\ufffd\012\ufffd" +
    "\024\ufffd\033\ufffd\034\ufffd\001\002\000\014\003\ufff2\011" +
    "\ufff2\024\ufff2\033\ufff2\034\ufff2\001\002\000\020\002\ufffe" +
    "\003\ufffe\011\ufffe\012\ufffe\024\ufffe\033\ufffe\034\ufffe\001" +
    "\002\000\010\003\ufff8\032\ufff8\035\ufff8\001\002\000\010" +
    "\003\112\032\111\035\110\001\002\000\004\024\113\001" +
    "\002\000\020\005\ufffa\006\ufffa\007\ufffa\010\ufffa\011\ufffa" +
    "\024\ufffa\033\ufffa\001\002\000\020\005\ufff9\006\ufff9\007" +
    "\ufff9\010\ufff9\011\ufff9\024\ufff9\033\ufff9\001\002\000\010" +
    "\003\ufff7\032\ufff7\035\ufff7\001\002\000\004\002\000\001" +
    "\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\113\000\004\003\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\113\001\001" +
    "\000\004\004\010\001\001\000\002\001\001\000\010\005" +
    "\014\007\013\010\012\001\001\000\004\011\106\001\001" +
    "\000\002\001\001\000\016\004\021\006\022\007\024\010" +
    "\012\012\025\013\027\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\010\004\021\012\103\013\027\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\012\014\064\015\033\016\042" +
    "\017\041\001\001\000\012\014\034\015\033\016\042\017" +
    "\041\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\012\014" +
    "\054\015\033\016\042\017\041\001\001\000\002\001\001" +
    "\000\004\020\044\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\017\053\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\015\057\016\042\017\041\001" +
    "\001\000\002\001\001\000\006\016\061\017\041\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\012\014\067\015\033" +
    "\016\042\017\041\001\001\000\002\001\001\000\002\001" +
    "\001\000\010\004\021\012\072\013\027\001\001\000\002" +
    "\001\001\000\002\001\001\000\012\014\075\015\033\016" +
    "\042\017\041\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\004\021\012\100\013\027\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$MPParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$MPParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$MPParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




   public int errNo = 0;
   
   public static void main( String[] args )
   {
      try
	  {
		   FileReader file = new FileReader( args[0] );
		   Scanner scanner = new MPLexer( file );
		   MPParser parser = new MPParser( scanner );
		   parser.parse();
		   if ( parser.errNo == 0 )
		      System.out.println( "Analiza zavrsena. U kodu nema gresaka." );
		   else
		      System.out.println( "Analiza zavrsena. Broj gresaka: " + parser.errNo );
	  }
	  catch( Exception e )
	  {
		   e.printStackTrace();
	  }
   }
   
   public void syntax_error(Symbol cur_token)
   {
   	  
   }
   
   public void report_error(String message, Object info)
   {
   	   System.out.print( message );
   }
   
   public int getLine()
   {
   	  return (( MPLexer) getScanner()).getLine();
   }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$MPParser$actions {
  private final MPParser parser;

  /** Constructor */
  CUP$MPParser$actions(MPParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$MPParser$do_action(
    int                        CUP$MPParser$act_num,
    java_cup.runtime.lr_parser CUP$MPParser$parser,
    java.util.Stack            CUP$MPParser$stack,
    int                        CUP$MPParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$MPParser$result;

      /* select the action based on the action number */
      switch (CUP$MPParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // Term ::= LEFTPAR Expression RIGHTPAR 
            {
              Object RESULT = null;
		
              System.out.println( "35." );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // Term ::= BOOLCONST 
            {
              Object RESULT = null;
		
              System.out.println( "34." );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // Term ::= FLOATCONST 
            {
              Object RESULT = null;
		
              System.out.println( "33." );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // Term ::= CHARCONST 
            {
              Object RESULT = null;
		
              System.out.println( "32." );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // Term ::= INTCONST 
            {
              Object RESULT = null;
		
              System.out.println( "31." );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // Term ::= ID 
            {
              Object RESULT = null;
		
              System.out.println( "30." );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // RelOp ::= GREATEROREQUAL 
            {
              Object RESULT = null;
		
             System.out.println( "29." );
          
              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // RelOp ::= GREATER 
            {
              Object RESULT = null;
		
             System.out.println( "28." );
          
              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // RelOp ::= NOTEQUAL 
            {
              Object RESULT = null;
		
             System.out.println( "27." );
          
              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // RelOp ::= EQUAL 
            {
              Object RESULT = null;
		
             System.out.println( "26." );
          
              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // RelOp ::= LOWEROREQUAL 
            {
              Object RESULT = null;
		
             System.out.println( "25." );
          
              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // RelOp ::= LOWER 
            {
              Object RESULT = null;
		
             System.out.println( "24." );
          
              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // RelExpression ::= Term 
            {
              Object RESULT = null;
		
              System.out.println( "23." );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*RelExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // RelExpression ::= Term RelOp Term 
            {
              Object RESULT = null;
		
              System.out.println( "22." );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*RelExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // AndExpression ::= RelExpression 
            {
              Object RESULT = null;
		
             System.out.println( "21." );
          
              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*AndExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // AndExpression ::= AndExpression AND RelExpression 
            {
              Object RESULT = null;
		
             System.out.println( "20." );
          
              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*AndExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // Expression ::= AndExpression 
            {
              Object RESULT = null;
		
            System.out.println( "19." );
         
              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*Expression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // Expression ::= Expression OR AndExpression 
            {
              Object RESULT = null;
		
            System.out.println( "18." );
         
              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*Expression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // RedoLoop ::= LOOP LEFTPAR Expression RIGHTPAR LEFTCURLYPAR Statement REDO LEFTPAR Expression RIGHTPAR SEMICOLON Statement LEFTCURLYPAR 
            {
              Object RESULT = null;
		
               System.out.println( "Redukcija po smeni 17." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(9/*RedoLoop*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-12)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Statement ::= Block 
            {
              Object RESULT = null;
		
              System.out.println( "16." );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Statement ::= ID error Expression SEMICOLON 
            {
              Object RESULT = null;
		
              System.out.println( "Nedostaje znak dodele." );
              parser.errNo++;
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Statement ::= ID ASSIGN Expression error 
            {
              Object RESULT = null;
		
              System.out.println( "Nedostaje tacka zarez." );
              parser.errNo++;
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Statement ::= ID ASSIGN Expression SEMICOLON 
            {
              Object RESULT = null;
		
              System.out.println( "15." );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Statement ::= RedoLoop 
            {
              Object RESULT = null;
		
              System.out.println( "14." );
           
              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // StatementList ::= Statement 
            {
              Object RESULT = null;
		
            System.out.println( "13." );
         
              CUP$MPParser$result = new java_cup.runtime.Symbol(4/*StatementList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // StatementList ::= StatementList Statement 
            {
              Object RESULT = null;
		
            System.out.println( "12." );
         
              CUP$MPParser$result = new java_cup.runtime.Symbol(4/*StatementList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Type ::= BOOL 
            {
              Object RESULT = null;
		
           System.out.println( "11." );
        
              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Type ::= FLOAT 
            {
              Object RESULT = null;
		
           System.out.println( "10." );
        
              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Type ::= CHAR 
            {
              Object RESULT = null;
		
           System.out.println( "9." );
        
              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Type ::= INT 
            {
              Object RESULT = null;
		
           System.out.println( "8." );
        
              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // NameList ::= NameList COMMA ID 
            {
              Object RESULT = null;
		
                System.out.println( "7." );
             
              CUP$MPParser$result = new java_cup.runtime.Symbol(7/*NameList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // NameList ::= ID 
            {
              Object RESULT = null;
		
                System.out.println( "6." );
             
              CUP$MPParser$result = new java_cup.runtime.Symbol(7/*NameList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // VarDecl ::= Type NameList error 
            {
              Object RESULT = null;
		
                   System.out.println( "Nedostaje tacka zarez." );
               	   parser.errNo++;
                
              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*VarDecl*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // VarDecl ::= Type NameList SEMICOLON 
            {
              Object RESULT = null;
		
                   System.out.println( "5." );
                
              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*VarDecl*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Declarations ::= VarDecl 
            {
              Object RESULT = null;
		
			   System.out.println( "3.7" );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(3/*Declarations*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Declarations ::= Declarations VarDecl 
            {
              Object RESULT = null;
		
               System.out.println( "3." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(3/*Declarations*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Block ::= LEFTCURLYPAR Declarations StatementList error 
            {
              Object RESULT = null;
		
                System.out.println( "Nedosaje zatvorena viticasta zagrada." );
                parser.errNo++;
             
              CUP$MPParser$result = new java_cup.runtime.Symbol(2/*Block*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Block ::= LEFTCURLYPAR Declarations StatementList RIGHTCURLYPAR 
            {
              Object RESULT = null;
		
                System.out.println( "2." );
             
              CUP$MPParser$result = new java_cup.runtime.Symbol(2/*Block*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Program ::= MAIN LEFTPAR error Block 
            {
              Object RESULT = null;
		
               System.out.println( "Nedosaje zatvorena zagrada." );
               parser.errNo++;
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(1/*Program*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // Program ::= MAIN LEFTPAR RIGHTPAR Block 
            {
              Object RESULT = null;
		
               System.out.println( "1." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(1/*Program*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= Program EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).value;
		RESULT = start_val;
              CUP$MPParser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$MPParser$parser.done_parsing();
          return CUP$MPParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

