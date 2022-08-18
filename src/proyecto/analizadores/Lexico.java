/* The following code was generated by JFlex 1.7.0 */

package proyecto.analizadores;
import java_cup.runtime.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>C:/Users/gerar/Documents/NetBeansProjects/Compi1Proyecto1-201700945/src/proyecto/analizadores/Lexico.jflex</tt>
 */
public class Lexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\7\1\12\1\12\1\11\22\0\1\1\1\16\1\6"+
    "\2\5\1\27\1\5\1\4\2\5\1\15\1\17\1\25\1\24\1\21"+
    "\1\14\12\3\1\30\1\31\1\5\1\0\1\32\1\23\1\5\1\52"+
    "\1\2\1\40\1\47\1\45\1\42\1\53\1\55\1\37\1\61\1\2"+
    "\1\50\1\57\1\35\1\41\1\56\1\60\1\51\1\44\1\46\1\54"+
    "\5\2\1\5\1\10\2\5\1\13\1\5\1\52\1\2\1\40\1\47"+
    "\1\45\1\42\1\53\1\55\1\37\1\61\1\2\1\50\1\57\1\35"+
    "\1\41\1\56\1\60\1\51\1\44\1\46\1\54\5\2\1\34\1\20"+
    "\1\33\1\26\6\0\1\12\71\0\1\22\160\0\2\36\115\0\1\43"+
    "\u1ea8\0\1\12\1\12\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\2\1\1\5\2\1"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\1"+
    "\4\3\1\1\7\3\2\0\1\25\1\0\1\26\1\27"+
    "\1\30\3\0\3\3\1\0\2\3\1\31\1\0\1\31"+
    "\7\3\1\0\2\3\1\32\1\2\2\0\1\3\1\33"+
    "\1\0\1\3\2\34\1\3\1\0\7\3\1\0\1\3"+
    "\1\0\2\3\1\0\2\3\1\2\1\0\1\3\2\35"+
    "\1\0\2\3\1\0\7\3\1\0\1\3\1\0\1\3"+
    "\1\36\1\0\2\3\1\0\1\3\4\0\4\3\1\0"+
    "\1\3\2\37\5\3\1\40\2\41\1\0\1\3\1\0"+
    "\2\3\2\42\1\0\1\43\4\0\1\3\1\43\4\3"+
    "\1\0\5\3\1\0\1\3\1\0\1\3\2\44\1\0"+
    "\1\3\1\45\5\0\5\3\2\46\4\3\2\47\1\0"+
    "\1\3\1\0\1\3\2\0\1\50\2\0\2\3\1\50"+
    "\2\3\2\51\1\52\1\3\1\53\1\0\1\3\2\54"+
    "\1\0\1\55\2\0\1\3\1\55\3\3\2\56\2\0"+
    "\1\57\2\3\1\57\1\3\1\60\1\0\1\60\2\3"+
    "\2\61\2\3\1\0\1\3\2\62";

  private static int [] zzUnpackAction() {
    int [] result = new int[246];
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
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\u012c\0\144"+
    "\0\u015e\0\u0190\0\62\0\62\0\62\0\62\0\62\0\62"+
    "\0\62\0\62\0\62\0\62\0\62\0\62\0\62\0\62"+
    "\0\62\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc\0\u02ee"+
    "\0\u0320\0\u0352\0\u0384\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u012c"+
    "\0\62\0\u047e\0\62\0\62\0\62\0\u04b0\0\u04e2\0\u0514"+
    "\0\u0546\0\u0578\0\u05aa\0\u05dc\0\u060e\0\u0640\0\62\0\u0672"+
    "\0\226\0\u06a4\0\u06d6\0\u0708\0\u073a\0\u076c\0\u079e\0\u07d0"+
    "\0\u0802\0\u0834\0\u0866\0\62\0\62\0\u0898\0\u08ca\0\u08fc"+
    "\0\226\0\u092e\0\u0960\0\u0992\0\u09c4\0\u09f6\0\u0a28\0\u0a5a"+
    "\0\u0a8c\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea"+
    "\0\u0c1c\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u04e2\0\u0d48"+
    "\0\u0d7a\0\62\0\226\0\u0dac\0\u0dde\0\u0e10\0\u0e42\0\u0e74"+
    "\0\u0ea6\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004"+
    "\0\u1036\0\u1068\0\226\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u1162"+
    "\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u125c\0\u128e\0\u12c0\0\u12f2"+
    "\0\u1324\0\u1356\0\62\0\226\0\u1388\0\u13ba\0\u13ec\0\u141e"+
    "\0\u1450\0\226\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u154a\0\u157c"+
    "\0\u15ae\0\62\0\226\0\u15e0\0\62\0\u1612\0\u1644\0\u1676"+
    "\0\u16a8\0\u16da\0\226\0\u170c\0\u173e\0\u1770\0\u17a2\0\u17d4"+
    "\0\u1806\0\u1838\0\u186a\0\u189c\0\u18ce\0\u1900\0\u1932\0\u1964"+
    "\0\u1996\0\62\0\226\0\u19c8\0\u19fa\0\226\0\u1a2c\0\u1a5e"+
    "\0\u1a90\0\u1ac2\0\u1af4\0\u1b26\0\u1b58\0\u1b8a\0\u1bbc\0\u1bee"+
    "\0\62\0\226\0\u1c20\0\u1c52\0\u1c84\0\u1cb6\0\62\0\226"+
    "\0\u1ce8\0\u1d1a\0\u1d4c\0\u1d7e\0\u1db0\0\u1de2\0\62\0\u1e14"+
    "\0\u1e46\0\u1e78\0\u1eaa\0\226\0\u1edc\0\u1f0e\0\62\0\226"+
    "\0\226\0\u1f40\0\226\0\u1f72\0\u1fa4\0\62\0\226\0\u1fd6"+
    "\0\62\0\u2008\0\u203a\0\u206c\0\226\0\u209e\0\u20d0\0\u2102"+
    "\0\62\0\226\0\u2134\0\u2166\0\62\0\u2198\0\u21ca\0\226"+
    "\0\u21fc\0\62\0\u222e\0\226\0\u2260\0\u2292\0\62\0\226"+
    "\0\u22c4\0\u22f6\0\u2328\0\u235a\0\62\0\226";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[246];
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
    "\1\2\1\3\1\4\1\5\1\6\1\2\1\7\1\10"+
    "\1\11\1\3\1\0\1\2\1\12\1\13\1\2\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\4\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\4\1\42"+
    "\1\4\1\43\3\4\1\44\1\45\1\46\2\4\63\0"+
    "\1\3\5\0\1\3\1\0\1\3\52\0\2\4\7\0"+
    "\1\4\21\0\1\4\1\0\4\4\1\0\16\4\3\0"+
    "\1\5\63\0\1\47\2\0\1\47\2\0\2\47\1\0"+
    "\1\47\1\0\1\47\41\0\6\50\1\51\1\0\1\52"+
    "\51\50\4\0\1\53\1\0\1\54\26\0\1\55\40\0"+
    "\1\56\1\57\101\0\1\60\26\0\2\4\7\0\1\4"+
    "\21\0\1\61\1\0\4\4\1\0\16\4\2\0\2\4"+
    "\7\0\1\4\21\0\1\4\1\0\2\4\1\62\1\4"+
    "\1\0\16\4\2\0\2\4\7\0\1\63\21\0\1\4"+
    "\1\0\4\4\1\0\16\4\2\0\2\4\7\0\1\4"+
    "\21\0\1\4\1\64\1\65\3\4\1\0\10\4\1\66"+
    "\5\4\36\0\2\67\5\0\1\70\16\0\2\4\7\0"+
    "\1\4\21\0\1\4\1\67\1\71\3\4\1\0\1\4"+
    "\1\72\14\4\2\0\2\4\7\0\1\4\21\0\1\73"+
    "\1\0\4\4\1\0\15\4\1\74\2\0\2\4\7\0"+
    "\1\4\21\0\1\4\1\0\4\4\1\0\1\4\1\75"+
    "\14\4\2\0\2\4\7\0\1\4\21\0\1\4\1\0"+
    "\4\4\1\0\1\4\1\76\14\4\2\0\2\4\7\0"+
    "\1\4\21\0\1\4\1\0\4\4\1\0\6\4\1\77"+
    "\7\4\2\0\2\4\7\0\1\4\21\0\1\4\1\0"+
    "\4\4\1\0\6\4\1\100\7\4\2\0\2\4\7\0"+
    "\1\4\21\0\1\4\1\101\1\102\3\4\1\0\1\4"+
    "\1\103\14\4\4\0\1\104\1\47\2\0\1\47\2\0"+
    "\2\47\1\0\1\47\1\0\1\47\41\0\7\50\1\0"+
    "\1\50\2\0\47\50\7\56\1\105\1\56\1\105\1\0"+
    "\47\56\15\57\1\106\1\0\43\57\36\0\2\107\24\0"+
    "\2\4\7\0\1\4\21\0\1\4\1\107\1\110\3\4"+
    "\1\0\16\4\2\0\2\4\7\0\1\4\21\0\1\111"+
    "\1\0\4\4\1\0\16\4\2\0\2\4\7\0\1\4"+
    "\21\0\1\4\1\0\4\4\1\112\1\113\15\4\35\0"+
    "\1\114\26\0\2\4\7\0\1\4\21\0\1\115\1\0"+
    "\4\4\1\0\16\4\2\0\2\4\7\0\1\4\21\0"+
    "\1\116\1\0\4\4\1\0\16\4\53\0\1\117\10\0"+
    "\2\4\7\0\1\4\21\0\1\4\1\0\4\4\1\0"+
    "\7\4\1\120\6\4\2\0\2\4\7\0\1\4\21\0"+
    "\1\4\1\0\4\4\1\0\2\4\1\121\13\4\2\0"+
    "\2\4\7\0\1\4\21\0\1\4\1\0\4\4\1\0"+
    "\1\4\1\122\14\4\2\0\2\4\7\0\1\123\21\0"+
    "\1\4\1\0\4\4\1\0\16\4\2\0\2\4\7\0"+
    "\1\4\21\0\1\4\1\0\4\4\1\0\2\4\1\124"+
    "\7\4\1\125\3\4\2\0\2\4\7\0\1\4\21\0"+
    "\1\4\1\0\1\4\1\126\2\4\1\127\1\130\15\4"+
    "\2\0\2\4\7\0\1\4\21\0\1\4\1\0\4\4"+
    "\1\131\1\132\4\4\1\133\10\4\45\0\1\134\16\0"+
    "\2\4\7\0\1\4\21\0\1\4\1\0\4\4\1\0"+
    "\1\4\1\135\14\4\2\0\2\4\7\0\1\4\21\0"+
    "\1\4\1\0\4\4\1\0\2\4\1\136\13\4\14\57"+
    "\1\137\1\106\1\0\43\57\40\0\1\140\23\0\2\4"+
    "\7\0\1\4\21\0\1\4\1\0\1\4\1\141\2\4"+
    "\1\0\16\4\36\0\2\142\24\0\2\4\7\0\1\4"+
    "\21\0\1\4\1\142\1\143\3\4\1\0\16\4\13\0"+
    "\1\144\50\0\2\4\7\0\1\145\21\0\1\4\1\0"+
    "\4\4\1\0\16\4\2\0\2\4\7\0\1\4\21\0"+
    "\1\4\1\0\1\4\1\146\2\4\1\0\16\4\54\0"+
    "\1\147\7\0\2\4\7\0\1\4\21\0\1\4\1\0"+
    "\4\4\1\0\10\4\1\150\5\4\2\0\2\4\7\0"+
    "\1\4\21\0\1\4\1\0\2\4\1\151\1\4\1\0"+
    "\16\4\2\0\2\4\7\0\1\4\21\0\1\4\1\0"+
    "\1\4\1\152\2\4\1\0\16\4\2\0\2\4\7\0"+
    "\1\4\21\0\1\4\1\0\4\4\1\0\4\4\1\153"+
    "\11\4\2\0\2\4\7\0\1\4\21\0\1\4\1\0"+
    "\2\4\1\154\1\4\1\0\16\4\2\0\2\4\7\0"+
    "\1\4\21\0\1\4\1\0\4\4\1\0\1\4\1\155"+
    "\14\4\2\0\2\4\7\0\1\4\21\0\1\4\1\0"+
    "\4\4\1\0\1\4\1\156\14\4\46\0\1\157\15\0"+
    "\2\4\7\0\1\4\21\0\1\4\1\0\4\4\1\0"+
    "\2\4\1\160\13\4\36\0\2\161\24\0\2\4\7\0"+
    "\1\4\21\0\1\4\1\161\1\162\3\4\1\0\16\4"+
    "\2\0\2\4\7\0\1\4\21\0\1\4\1\0\4\4"+
    "\1\0\6\4\1\163\7\4\35\0\1\164\26\0\2\4"+
    "\7\0\1\4\21\0\1\165\1\0\4\4\1\0\16\4"+
    "\2\0\2\4\7\0\1\4\21\0\1\4\1\0\2\4"+
    "\1\166\1\4\1\0\16\4\36\0\2\167\24\0\2\4"+
    "\7\0\1\4\21\0\1\4\1\167\1\170\3\4\1\0"+
    "\16\4\42\0\1\171\2\172\11\0\1\173\1\174\4\0"+
    "\2\4\7\0\1\4\21\0\1\4\1\0\3\4\1\175"+
    "\1\172\1\176\11\4\1\177\1\200\2\4\2\0\2\4"+
    "\7\0\1\4\21\0\1\4\1\201\1\202\3\4\1\0"+
    "\16\4\35\0\1\203\26\0\2\4\7\0\1\4\21\0"+
    "\1\204\1\0\4\4\1\0\16\4\2\0\2\4\7\0"+
    "\1\4\21\0\1\205\1\0\4\4\1\0\16\4\2\0"+
    "\2\4\7\0\1\4\21\0\1\4\1\0\4\4\1\0"+
    "\10\4\1\206\5\4\2\0\2\4\7\0\1\4\21\0"+
    "\1\4\1\0\2\4\1\207\1\4\1\0\16\4\2\0"+
    "\2\4\7\0\1\4\21\0\1\4\1\0\4\4\1\0"+
    "\5\4\1\210\10\4\2\0\2\4\7\0\1\4\21\0"+
    "\1\4\1\0\4\4\1\0\2\4\1\211\13\4\2\0"+
    "\2\4\7\0\1\4\21\0\1\4\1\0\4\4\1\0"+
    "\5\4\1\212\10\4\52\0\1\213\11\0\2\4\7\0"+
    "\1\4\21\0\1\4\1\0\4\4\1\0\6\4\1\214"+
    "\7\4\46\0\1\215\15\0\2\4\7\0\1\4\21\0"+
    "\1\4\1\0\4\4\1\0\2\4\1\216\13\4\46\0"+
    "\1\217\15\0\2\4\7\0\1\4\21\0\1\4\1\0"+
    "\4\4\1\0\2\4\1\220\13\4\2\0\2\4\7\0"+
    "\1\4\21\0\1\4\1\0\4\4\1\0\3\4\1\221"+
    "\12\4\41\0\1\222\22\0\2\4\7\0\1\4\21\0"+
    "\1\4\1\0\2\4\1\223\1\4\1\0\16\4\54\0"+
    "\1\224\43\0\2\225\5\0\1\226\66\0\1\227\45\0"+
    "\2\230\5\0\1\231\16\0\2\4\7\0\1\4\21\0"+
    "\1\4\1\0\4\4\1\0\10\4\1\232\5\4\2\0"+
    "\2\4\7\0\1\4\21\0\1\4\1\225\1\233\3\4"+
    "\1\0\1\4\1\234\14\4\2\0\2\4\7\0\1\4"+
    "\21\0\1\4\1\0\4\4\1\0\6\4\1\235\7\4"+
    "\2\0\2\4\7\0\1\4\21\0\1\4\1\230\1\236"+
    "\3\4\1\0\1\4\1\237\14\4\41\0\1\240\22\0"+
    "\2\4\7\0\1\4\21\0\1\4\1\0\2\4\1\241"+
    "\1\4\1\0\16\4\2\0\2\4\7\0\1\4\21\0"+
    "\1\4\1\0\1\4\1\242\2\4\1\0\16\4\2\0"+
    "\2\4\7\0\1\4\21\0\1\4\1\0\4\4\1\0"+
    "\2\4\1\243\13\4\2\0\2\4\7\0\1\244\21\0"+
    "\1\4\1\0\4\4\1\0\16\4\2\0\2\4\7\0"+
    "\1\4\21\0\1\245\1\0\4\4\1\0\16\4\2\0"+
    "\2\4\7\0\1\4\21\0\1\4\1\246\1\247\3\4"+
    "\1\0\16\4\13\0\1\250\50\0\2\4\7\0\1\251"+
    "\21\0\1\4\1\0\4\4\1\0\16\4\41\0\1\252"+
    "\22\0\2\4\7\0\1\4\21\0\1\4\1\0\2\4"+
    "\1\253\1\4\1\0\16\4\51\0\1\254\12\0\2\4"+
    "\7\0\1\4\21\0\1\4\1\0\4\4\1\0\5\4"+
    "\1\255\10\4\2\0\2\4\7\0\1\4\21\0\1\4"+
    "\1\0\2\4\1\256\1\4\1\0\16\4\35\0\1\257"+
    "\77\0\1\260\57\0\1\261\55\0\1\262\62\0\1\263"+
    "\15\0\2\4\7\0\1\4\21\0\1\264\1\0\4\4"+
    "\1\0\16\4\2\0\2\4\7\0\1\4\21\0\1\4"+
    "\1\0\4\4\1\0\7\4\1\265\6\4\2\0\2\4"+
    "\7\0\1\4\21\0\1\4\1\0\4\4\1\0\5\4"+
    "\1\266\10\4\2\0\2\4\7\0\1\4\21\0\1\4"+
    "\1\0\4\4\1\0\1\4\1\267\14\4\2\0\2\4"+
    "\7\0\1\4\21\0\1\4\1\0\4\4\1\0\2\4"+
    "\1\270\13\4\35\0\1\271\26\0\2\4\7\0\1\4"+
    "\21\0\1\272\1\0\4\4\1\0\16\4\2\0\2\4"+
    "\7\0\1\4\21\0\1\4\1\0\4\4\1\0\1\4"+
    "\1\273\14\4\2\0\2\4\7\0\1\4\21\0\1\4"+
    "\1\0\4\4\1\0\6\4\1\274\7\4\2\0\2\4"+
    "\7\0\1\4\21\0\1\4\1\0\1\4\1\275\2\4"+
    "\1\0\16\4\2\0\2\4\7\0\1\4\21\0\1\4"+
    "\1\0\4\4\1\0\6\4\1\276\7\4\51\0\1\277"+
    "\12\0\2\4\7\0\1\4\21\0\1\4\1\0\4\4"+
    "\1\0\5\4\1\300\10\4\60\0\1\301\3\0\2\4"+
    "\7\0\1\4\21\0\1\4\1\0\4\4\1\0\14\4"+
    "\1\302\1\4\52\0\1\303\11\0\2\4\7\0\1\4"+
    "\21\0\1\4\1\0\4\4\1\0\6\4\1\304\7\4"+
    "\40\0\1\305\75\0\1\306\57\0\1\307\44\0\1\310"+
    "\65\0\1\311\22\0\2\4\7\0\1\4\21\0\1\4"+
    "\1\0\1\4\1\312\2\4\1\0\16\4\2\0\2\4"+
    "\7\0\1\4\21\0\1\4\1\0\4\4\1\0\10\4"+
    "\1\313\5\4\2\0\2\4\7\0\1\4\21\0\1\4"+
    "\1\0\4\4\1\0\6\4\1\314\7\4\2\0\2\4"+
    "\7\0\1\4\21\0\1\315\1\0\4\4\1\0\16\4"+
    "\2\0\2\4\7\0\1\4\21\0\1\4\1\0\2\4"+
    "\1\316\1\4\1\0\16\4\2\0\2\4\7\0\1\4"+
    "\21\0\1\4\1\0\4\4\1\317\1\320\15\4\2\0"+
    "\2\4\7\0\1\4\21\0\1\4\1\0\4\4\1\0"+
    "\5\4\1\321\10\4\2\0\2\4\7\0\1\4\21\0"+
    "\1\4\1\0\2\4\1\322\1\4\1\0\16\4\2\0"+
    "\2\4\7\0\1\4\21\0\1\4\1\0\4\4\1\0"+
    "\5\4\1\323\10\4\54\0\1\324\7\0\2\4\7\0"+
    "\1\4\21\0\1\4\1\0\4\4\1\0\10\4\1\325"+
    "\5\4\43\0\2\326\17\0\2\4\7\0\1\4\21\0"+
    "\1\4\1\0\4\4\1\326\1\327\15\4\36\0\2\330"+
    "\57\0\1\331\72\0\1\332\62\0\1\333\14\0\2\4"+
    "\7\0\1\4\21\0\1\4\1\330\1\334\3\4\1\0"+
    "\16\4\2\0\2\4\7\0\1\4\21\0\1\335\1\0"+
    "\4\4\1\0\16\4\2\0\2\4\7\0\1\4\21\0"+
    "\1\4\1\0\4\4\1\0\2\4\1\336\13\4\2\0"+
    "\2\4\7\0\1\4\21\0\1\4\1\0\4\4\1\0"+
    "\3\4\1\337\12\4\2\0\2\4\7\0\1\4\21\0"+
    "\1\340\1\0\4\4\1\0\16\4\45\0\1\341\16\0"+
    "\2\4\7\0\1\4\21\0\1\4\1\0\4\4\1\0"+
    "\1\4\1\342\14\4\41\0\1\343\71\0\1\344\51\0"+
    "\1\345\22\0\2\4\7\0\1\4\21\0\1\4\1\0"+
    "\2\4\1\346\1\4\1\0\16\4\2\0\2\4\7\0"+
    "\1\4\21\0\1\4\1\0\4\4\1\0\5\4\1\347"+
    "\10\4\2\0\2\4\7\0\1\4\21\0\1\4\1\0"+
    "\2\4\1\350\1\4\1\0\16\4\2\0\2\4\7\0"+
    "\1\4\21\0\1\4\1\0\4\4\1\0\2\4\1\351"+
    "\13\4\35\0\1\352\76\0\1\353\11\0\2\4\7\0"+
    "\1\4\21\0\1\354\1\0\4\4\1\0\16\4\2\0"+
    "\2\4\7\0\1\4\21\0\1\4\1\0\4\4\1\0"+
    "\6\4\1\355\7\4\2\0\2\4\7\0\1\4\21\0"+
    "\1\4\1\0\4\4\1\0\5\4\1\356\10\4\43\0"+
    "\2\357\17\0\2\4\7\0\1\4\21\0\1\4\1\0"+
    "\4\4\1\357\1\360\15\4\2\0\2\4\7\0\1\4"+
    "\21\0\1\4\1\0\4\4\1\0\6\4\1\361\7\4"+
    "\2\0\2\4\7\0\1\4\21\0\1\4\1\0\4\4"+
    "\1\0\5\4\1\362\10\4\2\0\2\4\7\0\1\4"+
    "\21\0\1\4\1\363\1\364\3\4\1\0\16\4\41\0"+
    "\1\365\22\0\2\4\7\0\1\4\21\0\1\4\1\0"+
    "\2\4\1\366\1\4\1\0\16\4";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9100];
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


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\10\1\17\11\15\1\2\0\1\11\1\0"+
    "\3\11\3\0\3\1\1\0\2\1\1\11\1\0\10\1"+
    "\1\0\2\1\2\11\2\0\2\1\1\0\4\1\1\0"+
    "\7\1\1\0\1\1\1\0\2\1\1\0\3\1\1\0"+
    "\1\1\1\11\1\1\1\0\2\1\1\0\7\1\1\0"+
    "\1\1\1\0\2\1\1\0\2\1\1\0\1\1\4\0"+
    "\4\1\1\0\1\1\1\11\11\1\1\0\1\1\1\0"+
    "\2\1\1\11\1\1\1\0\1\11\4\0\6\1\1\0"+
    "\5\1\1\0\1\1\1\0\1\1\1\11\1\1\1\0"+
    "\2\1\5\0\5\1\1\11\5\1\1\11\1\1\1\0"+
    "\1\1\1\0\1\1\2\0\1\11\2\0\5\1\1\11"+
    "\4\1\1\0\1\1\1\11\1\1\1\0\1\11\2\0"+
    "\5\1\1\11\1\1\2\0\1\11\4\1\1\11\1\0"+
    "\3\1\1\11\3\1\1\0\1\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[246];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexico(java.io.Reader in) {
  	yyline = 1; 
	yychar = 1; 
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 220) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
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
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
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
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

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
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
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
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
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
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { // JOptionPane.showMessageDialog(null, "Se Encontraron Errores Lexicos");
    System.err.println("Error lexico: "+yytext()+ " Linea:"+(yyline)+" Columna:"+(yycolumn));
    //ErrorLexicoySintactico.listaerrores.add(new ErrorLexicoySintactico("Error Lexico", "El caracter :"+yytext()+"no pertenece al lenguaje",  (yyline), (yycolumn)));
     //ErrorLexicoySintactico.contadorerror++;
            } 
            // fall through
          case 51: break;
          case 2: 
            { /*Se ignoran*/
            } 
            // fall through
          case 52: break;
          case 3: 
            { return new Symbol(sym.identificador,yycolumn,yyline,yytext());
            } 
            // fall through
          case 53: break;
          case 4: 
            { return new Symbol(sym.digito,yycolumn,yyline,yytext());
            } 
            // fall through
          case 54: break;
          case 5: 
            { yycolumn=1;
            } 
            // fall through
          case 55: break;
          case 6: 
            { return new Symbol(sym.por,yycolumn,yyline,yytext());
            } 
            // fall through
          case 56: break;
          case 7: 
            { return new Symbol(sym.suma,yycolumn,yyline,yytext());
            } 
            // fall through
          case 57: break;
          case 8: 
            { return new Symbol(sym.disyuncion,yycolumn,yyline,yytext());
            } 
            // fall through
          case 58: break;
          case 9: 
            { return new Symbol(sym.punto,yycolumn,yyline,yytext());
            } 
            // fall through
          case 59: break;
          case 10: 
            { return new Symbol(sym.interrogacionA,yycolumn,yyline,yytext());
            } 
            // fall through
          case 60: break;
          case 11: 
            { return new Symbol(sym.interrogacionC,yycolumn,yyline,yytext());
            } 
            // fall through
          case 61: break;
          case 12: 
            { return new Symbol(sym.resta,yycolumn,yyline,yytext());
            } 
            // fall through
          case 62: break;
          case 13: 
            { return new Symbol(sym.coma,yycolumn,yyline,yytext());
            } 
            // fall through
          case 63: break;
          case 14: 
            { return new Symbol(sym.colocho,yycolumn,yyline,yytext());
            } 
            // fall through
          case 64: break;
          case 15: 
            { return new Symbol(sym.porcentaje,yycolumn,yyline,yytext());
            } 
            // fall through
          case 65: break;
          case 16: 
            { return new Symbol(sym.dospuntos,yycolumn,yyline,yytext());
            } 
            // fall through
          case 66: break;
          case 17: 
            { return new Symbol(sym.puntocoma,yycolumn,yyline,yytext());
            } 
            // fall through
          case 67: break;
          case 18: 
            { return new Symbol(sym.mayor,yycolumn,yyline,yytext());
            } 
            // fall through
          case 68: break;
          case 19: 
            { return new Symbol(sym.cllave,yycolumn,yyline,yytext());
            } 
            // fall through
          case 69: break;
          case 20: 
            { return new Symbol(sym.allave,yycolumn,yyline,yytext());
            } 
            // fall through
          case 70: break;
          case 21: 
            { return new Symbol(sym.cadena,yycolumn,yyline,yytext());
            } 
            // fall through
          case 71: break;
          case 22: 
            { return new Symbol(sym.comillasimple,yycolumn,yyline,yytext());
            } 
            // fall through
          case 72: break;
          case 23: 
            { return new Symbol(sym.comillasd,yycolumn,yyline,yytext());
            } 
            // fall through
          case 73: break;
          case 24: 
            { return new Symbol(sym.salto,yycolumn,yyline,yytext());
            } 
            // fall through
          case 74: break;
          case 25: 
            { return new Symbol(sym.si,yycolumn,yyline,yytext());
            } 
            // fall through
          case 75: break;
          case 26: 
            { return new Symbol(sym.caracter,yycolumn,yyline,yytext());
            } 
            // fall through
          case 76: break;
          case 27: 
            { return new Symbol(sym.con,yycolumn,yyline,yytext());
            } 
            // fall through
          case 77: break;
          case 28: 
            { return new Symbol(sym.fin,yycolumn,yyline,yytext());
            } 
            // fall through
          case 78: break;
          case 29: 
            { return new Symbol(sym.o_si,yycolumn,yyline,yytext());
            } 
            // fall through
          case 79: break;
          case 30: 
            { return new Symbol(sym.para,yycolumn,yyline,yytext());
            } 
            // fall through
          case 80: break;
          case 31: 
            { return new Symbol(sym.segun,yycolumn,yyline,yytext());
            } 
            // fall through
          case 81: break;
          case 32: 
            { return new Symbol(sym.hacer,yycolumn,yyline,yytext());
            } 
            // fall through
          case 82: break;
          case 33: 
            { return new Symbol(sym.hasta,yycolumn,yyline,yytext());
            } 
            // fall through
          case 83: break;
          case 34: 
            { return new Symbol(sym.inicio,yycolumn,yyline,yytext());
            } 
            // fall through
          case 84: break;
          case 35: 
            { return new Symbol(sym.fin_si,yycolumn,yyline,yytext());
            } 
            // fall through
          case 85: break;
          case 36: 
            { return new Symbol(sym.pasito,yycolumn,yyline,yytext());
            } 
            // fall through
          case 86: break;
          case 37: 
            { return new Symbol(sym.metodo,yycolumn,yyline,yytext());
            } 
            // fall through
          case 87: break;
          case 38: 
            { return new Symbol(sym.funcion,yycolumn,yyline,yytext());
            } 
            // fall through
          case 88: break;
          case 39: 
            { return new Symbol(sym.repetir,yycolumn,yyline,yytext());
            } 
            // fall through
          case 89: break;
          case 40: 
            { return new Symbol(sym.fin_para,yycolumn,yyline,yytext());
            } 
            // fall through
          case 90: break;
          case 41: 
            { return new Symbol(sym.entonces,yycolumn,yyline,yytext());
            } 
            // fall through
          case 91: break;
          case 42: 
            { return new Symbol(sym.ejecutar,yycolumn,yyline,yytext());
            } 
            // fall through
          case 92: break;
          case 43: 
            { return new Symbol(sym.retornar,yycolumn,yyline,yytext());
            } 
            // fall through
          case 93: break;
          case 44: 
            { return new Symbol(sym.mientras,yycolumn,yyline,yytext());
            } 
            // fall through
          case 94: break;
          case 45: 
            { return new Symbol(sym.fin_segun,yycolumn,yyline,yytext());
            } 
            // fall through
          case 95: break;
          case 46: 
            { return new Symbol(sym.hasta_que,yycolumn,yyline,yytext());
            } 
            // fall through
          case 96: break;
          case 47: 
            { return new Symbol(sym.fin_metodo,yycolumn,yyline,yytext());
            } 
            // fall through
          case 97: break;
          case 48: 
            { return new Symbol(sym.fin_funcion,yycolumn,yyline,yytext());
            } 
            // fall through
          case 98: break;
          case 49: 
            { return new Symbol(sym.fin_mientras,yycolumn,yyline,yytext());
            } 
            // fall through
          case 99: break;
          case 50: 
            { return new Symbol(sym.de_lo_contrario,yycolumn,yyline,yytext());
            } 
            // fall through
          case 100: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
