// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: C:/Users/FUJITSU/Eclipse-LabPP/MPParser/src/MPLexer.flex

// import sekcija
import java_cup.runtime.*;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class MPLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int KOMENTAR = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1, 1
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\2\1\2\2\1\1\22\0\1\1\1\3\1\0"+
    "\1\4\1\0\1\5\1\6\1\7\1\10\1\11\1\0"+
    "\1\12\1\13\1\12\1\14\1\0\1\15\7\16\2\17"+
    "\1\0\1\20\1\21\1\22\1\23\2\0\4\24\1\25"+
    "\1\24\24\26\4\0\1\26\1\0\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\26\1\35\1\36\2\26\1\37"+
    "\1\40\1\41\1\42\1\43\1\26\1\44\1\45\1\46"+
    "\1\47\2\26\1\50\2\26\1\51\1\52\1\53\7\0"+
    "\1\2\u01a2\0\2\2\326\0\u0100\2";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\1\1\3\2\1\1\4\1\5"+
    "\1\6\2\7\1\10\1\11\1\12\1\13\11\14\1\15"+
    "\1\1\1\16\1\17\1\20\1\21\3\0\1\22\1\23"+
    "\1\24\11\14\1\25\1\26\4\0\4\14\1\27\4\14"+
    "\2\7\1\0\1\30\1\31\1\14\1\32\1\33\1\34"+
    "\1\35\1\0\1\36\1\37";

  private static int [] zzUnpackAction() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\54\0\130\0\130\0\204\0\130\0\260\0\334"+
    "\0\130\0\130\0\130\0\u0108\0\u0134\0\130\0\u0160\0\u018c"+
    "\0\u01b8\0\u01e4\0\u0210\0\u023c\0\u0268\0\u0294\0\u02c0\0\u02ec"+
    "\0\u0318\0\u0344\0\130\0\u0370\0\130\0\130\0\130\0\130"+
    "\0\u039c\0\u03c8\0\u03f4\0\130\0\130\0\130\0\u0420\0\u044c"+
    "\0\u0478\0\u04a4\0\u04d0\0\u04fc\0\u0528\0\u0554\0\u0580\0\130"+
    "\0\130\0\u0134\0\u05ac\0\u05d8\0\u0604\0\u0630\0\u065c\0\u0688"+
    "\0\u06b4\0\u01e4\0\u06e0\0\u070c\0\u0738\0\u0764\0\u05ac\0\u05d8"+
    "\0\u0790\0\u01e4\0\u01e4\0\u07bc\0\u01e4\0\u01e4\0\u01e4\0\u01e4"+
    "\0\u07e8\0\u01e4\0\u07e8";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\0\1\5\1\3\1\6\1\7\1\10"+
    "\1\11\1\12\1\3\1\13\1\3\1\14\2\15\1\16"+
    "\1\17\1\20\1\21\4\22\1\23\1\24\2\22\1\25"+
    "\1\22\1\26\1\27\1\30\3\22\1\31\1\22\1\32"+
    "\2\22\1\33\1\34\1\35\5\2\1\36\46\2\76\0"+
    "\1\37\37\0\1\40\45\0\54\41\4\0\1\42\7\0"+
    "\1\43\3\15\51\0\3\15\56\0\1\44\53\0\1\45"+
    "\53\0\1\46\46\0\3\22\4\0\25\22\20\0\3\22"+
    "\4\0\16\22\1\47\6\22\20\0\3\22\4\0\11\22"+
    "\1\50\13\22\20\0\3\22\4\0\3\22\1\51\7\22"+
    "\1\52\11\22\20\0\3\22\4\0\15\22\1\53\7\22"+
    "\20\0\3\22\4\0\16\22\1\54\6\22\20\0\3\22"+
    "\4\0\3\22\1\55\21\22\20\0\3\22\4\0\7\22"+
    "\1\56\15\22\20\0\3\22\4\0\20\22\1\57\4\22"+
    "\55\0\1\60\10\0\1\61\76\0\1\62\7\0\1\63"+
    "\5\0\1\64\20\0\3\65\51\0\3\22\4\0\16\22"+
    "\1\66\6\22\20\0\3\22\4\0\3\22\1\67\21\22"+
    "\20\0\3\22\4\0\13\22\1\70\11\22\20\0\3\22"+
    "\4\0\16\22\1\71\6\22\20\0\3\22\4\0\22\22"+
    "\1\72\2\22\20\0\3\22\4\0\16\22\1\73\6\22"+
    "\20\0\3\22\4\0\12\22\1\74\12\22\20\0\3\22"+
    "\4\0\6\22\1\75\16\22\20\0\3\22\4\0\23\22"+
    "\1\76\1\22\20\0\2\77\52\0\3\100\4\0\2\100"+
    "\1\0\6\100\34\0\3\65\5\0\1\101\43\0\3\22"+
    "\4\0\13\22\1\102\11\22\20\0\3\22\4\0\20\22"+
    "\1\103\4\22\20\0\3\22\4\0\21\22\1\76\3\22"+
    "\20\0\3\22\4\0\3\22\1\104\21\22\20\0\3\22"+
    "\4\0\17\22\1\105\5\22\20\0\3\22\4\0\15\22"+
    "\1\106\7\22\20\0\3\22\4\0\16\22\1\107\6\22"+
    "\20\0\3\22\4\0\7\22\1\110\15\22\15\0\1\111"+
    "\56\0\3\22\4\0\22\22\1\112\2\22\20\0\3\113"+
    "\34\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2068];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\1\1\1\11\2\1\3\11\2\1\1\11"+
    "\14\1\1\11\1\1\4\11\3\0\3\11\11\1\2\11"+
    "\4\0\13\1\1\0\7\1\1\0\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  MPLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new Symbol( sym.EOF );
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.println( "ERROR: " + yytext() );
            }
            // fall through
          case 32: break;
          case 2:
            { ;
            }
            // fall through
          case 33: break;
          case 3:
            { yybegin( KOMENTAR );
            }
            // fall through
          case 34: break;
          case 4:
            { return new Symbol( sym.LEFTPAR );
            }
            // fall through
          case 35: break;
          case 5:
            { return new Symbol( sym.RIGHTPAR );
            }
            // fall through
          case 36: break;
          case 6:
            { return new Symbol( sym.COMMA );
            }
            // fall through
          case 37: break;
          case 7:
            { return new Symbol( sym.INTCONST );
            }
            // fall through
          case 38: break;
          case 8:
            { return new Symbol( sym.SEMICOLON );
            }
            // fall through
          case 39: break;
          case 9:
            { return new Symbol( sym.LOWER );
            }
            // fall through
          case 40: break;
          case 10:
            { return new Symbol( sym.ASSIGN );
            }
            // fall through
          case 41: break;
          case 11:
            { return new Symbol( sym.GREATER );
            }
            // fall through
          case 42: break;
          case 12:
            { return new Symbol(sym.ID );
            }
            // fall through
          case 43: break;
          case 13:
            { return new Symbol( sym.LEFTCURLYPAR );
            }
            // fall through
          case 44: break;
          case 14:
            { return new Symbol( sym.RIGHTCURLYPAR );
            }
            // fall through
          case 45: break;
          case 15:
            { yybegin( YYINITIAL );
            }
            // fall through
          case 46: break;
          case 16:
            { return new Symbol( sym.NOTEQUAL );
            }
            // fall through
          case 47: break;
          case 17:
            { return new Symbol( sym.AND );
            }
            // fall through
          case 48: break;
          case 18:
            { return new Symbol( sym.LOWEROREQUAL );
            }
            // fall through
          case 49: break;
          case 19:
            { return new Symbol( sym.EQUAL );
            }
            // fall through
          case 50: break;
          case 20:
            { return new Symbol( sym.GREATEROREQUAL );
            }
            // fall through
          case 51: break;
          case 21:
            { return new Symbol( sym.OR );
            }
            // fall through
          case 52: break;
          case 22:
            { return new Symbol( sym.CHARCONST );
            }
            // fall through
          case 53: break;
          case 23:
            { return new Symbol( sym.INT );
            }
            // fall through
          case 54: break;
          case 24:
            { return new Symbol( sym.BOOL );
            }
            // fall through
          case 55: break;
          case 25:
            { return new Symbol( sym.CHAR );
            }
            // fall through
          case 56: break;
          case 26:
            { return new Symbol( sym.LOOP );
            }
            // fall through
          case 57: break;
          case 27:
            { return new Symbol( sym.MAIN );
            }
            // fall through
          case 58: break;
          case 28:
            { return new Symbol( sym.REDO );
            }
            // fall through
          case 59: break;
          case 29:
            { return new Symbol( sym.BOOLCONST );
            }
            // fall through
          case 60: break;
          case 30:
            { return new Symbol( sym.FLOAT );
            }
            // fall through
          case 61: break;
          case 31:
            { return new Symbol( sym.FLOATCONST );
            }
            // fall through
          case 62: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
