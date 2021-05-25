/* The following code was generated by JFlex 1.3.5 on 25/05/2021 14:20 */

package fr.n7.stl.block;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.3.5
 * on 25/05/2021 14:20 from the specification file
 * <tt>file:/home/n7student/2A/TDL/fr.n7.stl.block/lexer.jflex</tt>
 */
public class Lexer implements sym, java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  final public static int YYEOF = -1;

  /** initial size of the lookahead buffer */
  final private static int YY_BUFFERSIZE = 16384;

  /** lexical states */
  final public static int CODESEG = 1;
  final public static int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  final private static String yycmap_packed = 
    "\11\13\1\3\1\2\1\0\1\3\1\1\16\13\4\0\1\3\1\21"+
    "\1\7\1\0\1\12\1\27\1\31\1\11\1\32\1\33\1\6\1\25"+
    "\1\15\1\26\1\16\1\5\12\4\1\17\1\14\1\23\1\22\1\24"+
    "\1\20\1\0\22\12\1\52\7\12\1\36\1\10\1\37\1\0\1\12"+
    "\1\0\1\47\1\54\1\40\1\57\1\51\1\60\1\53\1\46\1\45"+
    "\2\12\1\55\1\64\1\42\1\41\1\61\1\12\1\50\1\43\1\44"+
    "\1\63\1\56\1\62\1\65\1\66\1\12\1\34\1\30\1\35\1\0"+
    "\41\13\2\0\4\12\4\0\1\12\2\0\1\13\7\0\1\12\4\0"+
    "\1\12\5\0\27\12\1\0\37\12\1\0\u01ca\12\4\0\14\12\16\0"+
    "\5\12\7\0\1\12\1\0\1\12\21\0\160\13\5\12\1\0\2\12"+
    "\2\0\4\12\1\0\1\12\6\0\1\12\1\0\3\12\1\0\1\12"+
    "\1\0\24\12\1\0\123\12\1\0\213\12\1\0\5\13\2\0\246\12"+
    "\1\0\46\12\2\0\1\12\7\0\47\12\7\0\1\12\1\0\55\13"+
    "\1\0\1\13\1\0\2\13\1\0\2\13\1\0\1\13\10\0\33\12"+
    "\5\0\3\12\15\0\6\13\5\0\1\12\4\0\13\13\1\0\1\13"+
    "\3\0\53\12\37\13\4\0\2\12\1\13\143\12\1\0\1\12\10\13"+
    "\1\0\6\13\2\12\2\13\1\0\4\13\2\12\12\13\3\12\2\0"+
    "\1\12\17\0\1\13\1\12\1\13\36\12\33\13\2\0\131\12\13\13"+
    "\1\12\16\0\12\13\41\12\11\13\2\12\4\0\1\12\5\0\26\12"+
    "\4\13\1\12\11\13\1\12\3\13\1\12\5\13\22\0\31\12\3\13"+
    "\4\0\13\12\65\0\25\12\1\0\10\12\26\0\60\13\66\12\3\13"+
    "\1\12\22\13\1\12\7\13\12\12\2\13\2\0\12\13\1\0\20\12"+
    "\3\13\1\0\10\12\2\0\2\12\2\0\26\12\1\0\7\12\1\0"+
    "\1\12\3\0\4\12\2\0\1\13\1\12\7\13\2\0\2\13\2\0"+
    "\3\13\1\12\10\0\1\13\4\0\2\12\1\0\3\12\2\13\2\0"+
    "\12\13\4\12\7\0\2\12\4\0\3\13\1\0\6\12\4\0\2\12"+
    "\2\0\26\12\1\0\7\12\1\0\2\12\1\0\2\12\1\0\2\12"+
    "\2\0\1\13\1\0\5\13\4\0\2\13\2\0\3\13\3\0\1\13"+
    "\7\0\4\12\1\0\1\12\7\0\14\13\3\12\1\13\13\0\3\13"+
    "\1\0\11\12\1\0\3\12\1\0\26\12\1\0\7\12\1\0\2\12"+
    "\1\0\5\12\2\0\1\13\1\12\10\13\1\0\3\13\1\0\3\13"+
    "\2\0\1\12\17\0\2\12\2\13\2\0\12\13\1\0\1\12\7\0"+
    "\1\12\6\13\1\0\3\13\1\0\10\12\2\0\2\12\2\0\26\12"+
    "\1\0\7\12\1\0\2\12\1\0\5\12\2\0\1\13\1\12\7\13"+
    "\2\0\2\13\2\0\3\13\10\0\2\13\4\0\2\12\1\0\3\12"+
    "\2\13\2\0\12\13\1\0\1\12\20\0\1\13\1\12\1\0\6\12"+
    "\3\0\3\12\1\0\4\12\3\0\2\12\1\0\1\12\1\0\2\12"+
    "\3\0\2\12\3\0\3\12\3\0\14\12\4\0\5\13\3\0\3\13"+
    "\1\0\4\13\2\0\1\12\6\0\1\13\16\0\12\13\11\0\1\12"+
    "\6\0\4\13\1\0\10\12\1\0\3\12\1\0\27\12\1\0\20\12"+
    "\3\0\1\12\7\13\1\0\3\13\1\0\4\13\7\0\2\13\1\0"+
    "\3\12\5\0\2\12\2\13\2\0\12\13\20\0\1\12\3\13\1\0"+
    "\10\12\1\0\3\12\1\0\27\12\1\0\12\12\1\0\5\12\2\0"+
    "\1\13\1\12\7\13\1\0\3\13\1\0\4\13\7\0\2\13\7\0"+
    "\1\12\1\0\2\12\2\13\2\0\12\13\1\0\2\12\15\0\4\13"+
    "\1\0\10\12\1\0\3\12\1\0\51\12\2\13\1\12\7\13\1\0"+
    "\3\13\1\0\4\13\1\12\5\0\3\12\1\13\7\0\3\12\2\13"+
    "\2\0\12\13\12\0\6\12\2\0\2\13\1\0\22\12\3\0\30\12"+
    "\1\0\11\12\1\0\1\12\2\0\7\12\3\0\1\13\4\0\6\13"+
    "\1\0\1\13\1\0\10\13\6\0\12\13\2\0\2\13\15\0\60\12"+
    "\1\13\2\12\7\13\4\0\10\12\10\13\1\0\12\13\47\0\2\12"+
    "\1\0\1\12\2\0\2\12\1\0\1\12\2\0\1\12\6\0\4\12"+
    "\1\0\7\12\1\0\3\12\1\0\1\12\1\0\1\12\2\0\2\12"+
    "\1\0\4\12\1\13\2\12\6\13\1\0\2\13\1\12\2\0\5\12"+
    "\1\0\1\12\1\0\6\13\2\0\12\13\2\0\4\12\40\0\1\12"+
    "\27\0\2\13\6\0\12\13\13\0\1\13\1\0\1\13\1\0\1\13"+
    "\4\0\2\13\10\12\1\0\44\12\4\0\24\13\1\0\2\13\5\12"+
    "\13\13\1\0\44\13\11\0\1\13\71\0\53\12\24\13\1\12\12\13"+
    "\6\0\6\12\4\13\4\12\3\13\1\12\3\13\2\12\7\13\3\12"+
    "\4\13\15\12\14\13\1\12\17\13\2\0\46\12\1\0\1\12\5\0"+
    "\1\12\2\0\53\12\1\0\u014d\12\1\0\4\12\2\0\7\12\1\0"+
    "\1\12\1\0\4\12\2\0\51\12\1\0\4\12\2\0\41\12\1\0"+
    "\4\12\2\0\7\12\1\0\1\12\1\0\4\12\2\0\17\12\1\0"+
    "\71\12\1\0\4\12\2\0\103\12\2\0\3\13\40\0\20\12\20\0"+
    "\126\12\2\0\6\12\3\0\u026c\12\2\0\21\12\1\0\32\12\5\0"+
    "\113\12\3\0\13\12\7\0\15\12\1\0\4\12\3\13\13\0\22\12"+
    "\3\13\13\0\22\12\2\13\14\0\15\12\1\0\3\12\1\0\2\13"+
    "\14\0\64\12\40\13\3\0\1\12\3\0\2\12\1\13\2\0\12\13"+
    "\41\0\4\13\1\0\12\13\6\0\130\12\10\0\5\12\2\13\42\12"+
    "\1\13\1\12\5\0\106\12\12\0\37\12\1\0\14\13\4\0\14\13"+
    "\12\0\12\13\36\12\2\0\5\12\13\0\54\12\4\0\32\12\6\0"+
    "\12\13\46\0\27\12\5\13\4\0\65\12\12\13\1\0\35\13\2\0"+
    "\13\13\6\0\12\13\15\0\1\12\10\0\16\13\102\0\5\13\57\12"+
    "\21\13\7\12\4\0\12\13\21\0\11\13\14\0\3\13\36\12\15\13"+
    "\2\12\12\13\54\12\16\13\14\0\44\12\24\13\10\0\12\13\3\0"+
    "\3\12\12\13\44\12\2\0\11\12\107\0\3\13\1\0\25\13\4\12"+
    "\1\13\4\12\3\13\2\12\3\13\6\0\300\12\72\13\1\0\5\13"+
    "\u0116\12\2\0\6\12\2\0\46\12\2\0\6\12\2\0\10\12\1\0"+
    "\1\12\1\0\1\12\1\0\1\12\1\0\37\12\2\0\65\12\1\0"+
    "\7\12\1\0\1\12\3\0\3\12\1\0\7\12\3\0\4\12\2\0"+
    "\6\12\4\0\15\12\5\0\3\12\1\0\7\12\16\0\5\13\32\0"+
    "\5\13\20\0\2\12\23\0\1\12\13\0\5\13\1\0\12\13\1\0"+
    "\1\12\15\0\1\12\20\0\15\12\3\0\40\12\20\0\15\13\4\0"+
    "\1\13\3\0\14\13\21\0\1\12\4\0\1\12\2\0\12\12\1\0"+
    "\1\12\3\0\5\12\6\0\1\12\1\0\1\12\1\0\1\12\1\0"+
    "\4\12\1\0\13\12\2\0\4\12\5\0\5\12\4\0\1\12\21\0"+
    "\51\12\u0a77\0\57\12\1\0\57\12\1\0\205\12\6\0\4\12\3\13"+
    "\2\12\14\0\46\12\1\0\1\12\5\0\1\12\2\0\70\12\7\0"+
    "\1\12\17\0\1\13\27\12\11\0\7\12\1\0\7\12\1\0\7\12"+
    "\1\0\7\12\1\0\7\12\1\0\7\12\1\0\7\12\1\0\7\12"+
    "\1\0\40\13\57\0\1\12\u01d5\0\3\12\31\0\11\12\6\13\1\0"+
    "\5\12\2\0\5\12\4\0\126\12\2\0\2\13\2\0\3\12\1\0"+
    "\132\12\1\0\4\12\5\0\52\12\2\0\136\12\21\0\33\12\65\0"+
    "\20\12\u0200\0\u19b6\12\112\0\u51eb\12\25\0\u048d\12\103\0\56\12\2\0"+
    "\u010d\12\3\0\20\12\12\13\2\12\24\0\57\12\1\13\4\0\12\13"+
    "\1\0\37\12\2\13\120\12\2\13\45\0\11\12\2\0\147\12\2\0"+
    "\44\12\1\0\10\12\77\0\13\12\1\13\3\12\1\13\4\12\1\13"+
    "\27\12\5\13\20\0\1\12\7\0\64\12\14\0\2\13\62\12\22\13"+
    "\12\0\12\13\6\0\22\13\6\12\3\0\1\12\1\0\1\12\2\0"+
    "\12\13\34\12\10\13\2\0\27\12\15\13\14\0\35\12\3\0\4\13"+
    "\57\12\16\13\16\0\1\12\12\13\6\0\5\12\1\13\12\12\12\13"+
    "\5\12\1\0\51\12\16\13\11\0\3\12\1\13\10\12\2\13\2\0"+
    "\12\13\6\0\27\12\3\0\1\12\3\13\62\12\1\13\1\12\3\13"+
    "\2\12\2\13\5\12\2\13\1\12\1\13\1\12\30\0\3\12\2\0"+
    "\13\12\5\13\2\0\3\12\2\13\12\0\6\12\2\0\6\12\2\0"+
    "\6\12\11\0\7\12\1\0\7\12\1\0\53\12\1\0\12\12\12\0"+
    "\163\12\10\13\1\0\2\13\2\0\12\13\6\0\u2ba4\12\14\0\27\12"+
    "\4\0\61\12\u2104\0\u016e\12\2\0\152\12\46\0\7\12\14\0\5\12"+
    "\5\0\1\12\1\13\12\12\1\0\15\12\1\0\5\12\1\0\1\12"+
    "\1\0\2\12\1\0\2\12\1\0\154\12\41\0\u016b\12\22\0\100\12"+
    "\2\0\66\12\50\0\15\12\3\0\20\13\20\0\20\13\3\0\2\12"+
    "\30\0\3\12\31\0\1\12\6\0\5\12\1\0\207\12\2\0\1\13"+
    "\4\0\1\12\13\0\12\13\7\0\32\12\4\0\1\12\1\0\32\12"+
    "\13\0\131\12\3\0\6\12\2\0\6\12\2\0\6\12\2\0\3\12"+
    "\3\0\2\12\3\0\2\12\22\0\3\13\4\0";

  /** 
   * Translates characters to character classes
   */
  final private static char [] yycmap = yy_unpack_cmap(yycmap_packed);

  /** 
   * Translates a state to a row index in the transition table
   */
  final private static int yy_rowMap [] = { 
        0,    55,   110,   165,   110,   220,   275,   110,   330,   385, 
      440,   110,   110,   110,   110,   110,   495,   550,   605,   660, 
      715,   770,   110,   825,   880,   110,   110,   110,   110,   110, 
      110,   935,   990,  1045,  1100,  1155,  1210,  1265,  1320,  1375, 
     1430,  1485,  1540,  1595,  1650,  1705,  1760,   330,   110,  1815, 
     1870,  1925,   110,   110,   110,   110,   110,   110,   110,   110, 
     1980,  2035,  2090,  2145,  2200,  2255,  2310,  2365,   440,  2420, 
     2475,  2530,  2585,  2640,  2695,  2750,  2805,  2860,  2915,  2970, 
     3025,  3080,  3135,  3190,   330,   110,  3245,  3300,  3355,   440, 
     3410,  3465,  3520,  3575,  3630,  3685,  3740,  3795,  3850,  3905, 
     3960,  4015,  4070,  4125,  4180,  4235,  4290,  4345,  4400,  4455, 
     4510,   440,  4565,   440,  4620,  4675,  4730,  4785,   440,  4840, 
     4895,  4950,  5005,   440,  5060,  5115,  5170,  5225,  5280,  5335, 
      440,  5390,   440,  5445,  5500,  5555,  5610,  5665,  5720,  5775, 
     5830,  5885,   440,   440,   440,  5940,  5995,   440,  6050,   440, 
     6105,  6160,  6215,   440,  6270,   440,  6325,  6380,  6435,   440, 
     6490,  6545,  6600,  6655,   440,  6710,   440,   440,  6765,  6820, 
     6875,   440,  6930,   440,   440,  6985,  7040,   440,  7095,  7150, 
     7205,  7260,  7315,  7370,  7425,  7480,   110
  };

  /** 
   * The packed transition table of the DFA (part 0)
   */
  final private static String yy_packed0 = 
    "\1\3\1\4\2\5\1\6\1\7\1\10\1\11\1\3"+
    "\1\12\1\13\1\3\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\13\1\41\1\42\1\43\1\44\1\13\1\45\1\46"+
    "\1\47\1\50\1\13\1\51\1\13\1\52\1\13\1\53"+
    "\1\54\1\55\4\13\67\3\71\0\1\5\70\0\1\6"+
    "\67\0\1\56\1\57\60\0\7\60\1\61\1\62\56\60"+
    "\10\63\1\64\56\63\4\0\1\13\5\0\2\13\24\0"+
    "\27\13\22\0\1\65\66\0\1\66\66\0\1\67\66\0"+
    "\1\70\71\0\1\71\67\0\1\72\70\0\1\73\67\0"+
    "\1\74\41\0\1\13\5\0\2\13\24\0\1\13\1\75"+
    "\4\13\1\76\6\13\1\77\11\13\4\0\1\13\5\0"+
    "\2\13\24\0\11\13\1\100\11\13\1\101\3\13\4\0"+
    "\1\13\5\0\2\13\24\0\4\13\1\102\22\13\4\0"+
    "\1\13\5\0\2\13\24\0\10\13\1\103\16\13\4\0"+
    "\1\13\5\0\2\13\24\0\2\13\1\104\15\13\1\105"+
    "\3\13\1\106\2\13\4\0\1\13\5\0\2\13\24\0"+
    "\14\13\1\107\12\13\4\0\1\13\5\0\2\13\24\0"+
    "\11\13\1\110\15\13\4\0\1\13\5\0\2\13\24\0"+
    "\15\13\1\111\7\13\1\112\1\13\4\0\1\13\5\0"+
    "\2\13\24\0\4\13\1\113\21\13\1\114\4\0\1\13"+
    "\5\0\2\13\24\0\1\13\1\115\25\13\4\0\1\13"+
    "\5\0\2\13\24\0\1\13\1\116\25\13\4\0\1\13"+
    "\5\0\2\13\24\0\5\13\1\117\1\13\1\120\17\13"+
    "\4\0\1\13\5\0\2\13\24\0\10\13\1\121\12\13"+
    "\1\122\3\13\4\0\1\13\5\0\2\13\24\0\6\13"+
    "\1\123\20\13\1\56\1\4\1\5\64\56\6\57\1\124"+
    "\60\57\7\60\1\125\1\62\56\60\11\0\1\126\65\0"+
    "\1\63\62\0\1\13\5\0\2\13\24\0\2\13\1\127"+
    "\24\13\4\0\1\13\5\0\2\13\24\0\7\13\1\130"+
    "\17\13\4\0\1\13\5\0\2\13\24\0\7\13\1\131"+
    "\17\13\4\0\1\13\5\0\2\13\24\0\22\13\1\132"+
    "\4\13\4\0\1\13\5\0\2\13\24\0\15\13\1\133"+
    "\11\13\4\0\1\13\5\0\2\13\24\0\7\13\1\134"+
    "\17\13\4\0\1\13\5\0\2\13\24\0\23\13\1\135"+
    "\3\13\4\0\1\13\5\0\2\13\24\0\4\13\1\136"+
    "\22\13\4\0\1\13\5\0\2\13\24\0\21\13\1\137"+
    "\5\13\4\0\1\13\5\0\2\13\24\0\3\13\1\140"+
    "\23\13\4\0\1\13\5\0\2\13\24\0\4\13\1\141"+
    "\22\13\4\0\1\13\5\0\2\13\24\0\3\13\1\142"+
    "\23\13\4\0\1\13\5\0\2\13\24\0\4\13\1\143"+
    "\22\13\4\0\1\13\5\0\2\13\24\0\10\13\1\144"+
    "\16\13\4\0\1\13\5\0\2\13\24\0\3\13\1\145"+
    "\23\13\4\0\1\13\5\0\2\13\24\0\1\13\1\146"+
    "\25\13\4\0\1\13\5\0\2\13\24\0\5\13\1\147"+
    "\21\13\4\0\1\13\5\0\2\13\24\0\2\13\1\150"+
    "\24\13\4\0\1\13\5\0\2\13\24\0\15\13\1\151"+
    "\11\13\4\0\1\13\5\0\2\13\24\0\5\13\1\152"+
    "\21\13\4\0\1\13\5\0\2\13\24\0\14\13\1\153"+
    "\12\13\4\0\1\13\5\0\2\13\24\0\5\13\1\154"+
    "\21\13\5\57\1\5\1\124\60\57\4\0\1\13\5\0"+
    "\2\13\24\0\3\13\1\155\23\13\4\0\1\13\5\0"+
    "\2\13\24\0\10\13\1\156\16\13\4\0\1\13\5\0"+
    "\2\13\24\0\3\13\1\157\23\13\4\0\1\13\5\0"+
    "\2\13\24\0\15\13\1\160\11\13\4\0\1\13\5\0"+
    "\2\13\24\0\4\13\1\161\22\13\4\0\1\13\5\0"+
    "\2\13\24\0\11\13\1\162\15\13\4\0\1\13\5\0"+
    "\2\13\24\0\11\13\1\163\15\13\4\0\1\13\5\0"+
    "\2\13\24\0\15\13\1\164\11\13\4\0\1\13\5\0"+
    "\2\13\24\0\4\13\1\165\22\13\4\0\1\13\5\0"+
    "\2\13\24\0\23\13\1\166\3\13\4\0\1\13\5\0"+
    "\2\13\24\0\11\13\1\167\15\13\4\0\1\13\5\0"+
    "\2\13\24\0\11\13\1\170\15\13\4\0\1\13\5\0"+
    "\2\13\24\0\5\13\1\171\21\13\4\0\1\13\5\0"+
    "\2\13\24\0\4\13\1\172\22\13\4\0\1\13\5\0"+
    "\2\13\24\0\15\13\1\173\11\13\4\0\1\13\5\0"+
    "\2\13\24\0\17\13\1\174\7\13\4\0\1\13\5\0"+
    "\2\13\24\0\7\13\1\175\17\13\4\0\1\13\5\0"+
    "\2\13\24\0\3\13\1\176\23\13\4\0\1\13\5\0"+
    "\2\13\24\0\2\13\1\177\13\13\1\200\10\13\4\0"+
    "\1\13\5\0\2\13\24\0\15\13\1\201\11\13\4\0"+
    "\1\13\5\0\2\13\24\0\15\13\1\202\11\13\4\0"+
    "\1\13\5\0\2\13\24\0\4\13\1\203\22\13\4\0"+
    "\1\13\5\0\2\13\24\0\7\13\1\204\17\13\4\0"+
    "\1\13\5\0\2\13\24\0\3\13\1\205\23\13\4\0"+
    "\1\13\5\0\2\13\24\0\5\13\1\206\21\13\4\0"+
    "\1\13\5\0\2\13\24\0\10\13\1\207\16\13\4\0"+
    "\1\13\5\0\2\13\24\0\11\13\1\210\15\13\4\0"+
    "\1\13\5\0\2\13\24\0\10\13\1\211\16\13\4\0"+
    "\1\13\5\0\2\13\24\0\10\13\1\212\16\13\4\0"+
    "\1\13\5\0\2\13\24\0\2\13\1\213\24\13\4\0"+
    "\1\13\5\0\2\13\24\0\2\13\1\214\24\13\4\0"+
    "\1\13\5\0\2\13\24\0\11\13\1\215\15\13\4\0"+
    "\1\13\5\0\2\13\24\0\11\13\1\216\15\13\4\0"+
    "\1\13\5\0\2\13\24\0\15\13\1\217\11\13\4\0"+
    "\1\13\5\0\2\13\24\0\11\13\1\220\15\13\4\0"+
    "\1\13\5\0\2\13\24\0\4\13\1\221\22\13\4\0"+
    "\1\13\5\0\2\13\24\0\7\13\1\222\17\13\4\0"+
    "\1\13\5\0\2\13\24\0\5\13\1\223\21\13\4\0"+
    "\1\13\5\0\2\13\24\0\11\13\1\224\15\13\4\0"+
    "\1\13\5\0\2\13\24\0\1\225\26\13\4\0\1\13"+
    "\5\0\2\13\24\0\1\226\26\13\4\0\1\13\5\0"+
    "\2\13\24\0\20\13\1\227\6\13\4\0\1\13\5\0"+
    "\2\13\24\0\24\13\1\230\2\13\4\0\1\13\5\0"+
    "\2\13\24\0\7\13\1\231\17\13\4\0\1\13\5\0"+
    "\2\13\24\0\2\13\1\232\24\13\4\0\1\13\5\0"+
    "\2\13\24\0\17\13\1\233\7\13\4\0\1\13\5\0"+
    "\2\13\24\0\13\13\1\234\13\13\4\0\1\13\5\0"+
    "\2\13\24\0\24\13\1\235\2\13\4\0\1\13\5\0"+
    "\2\13\24\0\7\13\1\236\17\13\4\0\1\13\5\0"+
    "\2\13\24\0\4\13\1\237\22\13\4\0\1\13\5\0"+
    "\2\13\24\0\1\240\26\13\4\0\1\13\5\0\2\13"+
    "\24\0\4\13\1\241\22\13\4\0\1\13\5\0\2\13"+
    "\24\0\7\13\1\242\17\13\4\0\1\13\5\0\2\13"+
    "\24\0\11\13\1\243\15\13\4\0\1\13\5\0\2\13"+
    "\24\0\1\244\26\13\4\0\1\13\5\0\2\13\24\0"+
    "\3\13\1\245\23\13\4\0\1\13\5\0\2\13\2\0"+
    "\1\246\21\0\27\13\4\0\1\13\5\0\2\13\24\0"+
    "\2\13\1\247\24\13\4\0\1\13\5\0\2\13\24\0"+
    "\11\13\1\250\15\13\4\0\1\13\5\0\2\13\24\0"+
    "\11\13\1\251\15\13\4\0\1\13\5\0\2\13\24\0"+
    "\1\252\26\13\4\0\1\13\5\0\2\13\24\0\2\13"+
    "\1\253\24\13\4\0\1\13\5\0\2\13\24\0\4\13"+
    "\1\254\22\13\41\0\1\255\31\0\1\13\5\0\2\13"+
    "\24\0\10\13\1\256\16\13\4\0\1\13\5\0\2\13"+
    "\24\0\11\13\1\257\15\13\4\0\1\13\5\0\2\13"+
    "\24\0\4\13\1\260\22\13\63\0\1\261\7\0\1\13"+
    "\5\0\2\13\24\0\3\13\1\262\23\13\44\0\1\263"+
    "\40\0\1\264\131\0\1\265\55\0\1\266\63\0\1\267"+
    "\63\0\1\270\70\0\1\271\77\0\1\272\53\0\1\273"+
    "\24\0";

  /** 
   * The transition table of the DFA
   */
  final private static int yytrans [] = yy_unpack();


  /* error codes */
  final private static int YY_UNKNOWN_ERROR = 0;
  final private static int YY_ILLEGAL_STATE = 1;
  final private static int YY_NO_MATCH = 2;
  final private static int YY_PUSHBACK_2BIG = 3;

  /* error messages for the codes above */
  final private static String YY_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Internal error: unknown state",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * YY_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private final static byte YY_ATTRIBUTE[] = {
     0,  0,  9,  1,  9,  1,  1,  9,  1,  1,  1,  9,  9,  9,  9,  9, 
     1,  1,  1,  1,  1,  1,  9,  1,  1,  9,  9,  9,  9,  9,  9,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  0,  0,  0, 
     9,  0,  0,  0,  9,  9,  9,  9,  9,  9,  9,  9,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  0,  1,  9,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  0,  1,  1,  1,  1,  1,  1,  0,  1,  1,  1, 
     0,  1,  0,  0,  0,  0,  0,  0,  0,  0,  9
  };

  /** the input device */
  private java.io.Reader yy_reader;

  /** the current state of the DFA */
  private int yy_state;

  /** the current lexical state */
  private int yy_lexical_state = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char yy_buffer[] = new char[YY_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int yy_markedPos;

  /** the textposition at the last state to be included in yytext */
  private int yy_pushbackPos;

  /** the current text position in the buffer */
  private int yy_currentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int yy_startRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int yy_endRead;

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
   * yy_atBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean yy_atBOL = true;

  /** yy_atEOF == true <=> the scanner is at the EOF */
  private boolean yy_atEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean yy_eof_done;

  /* user code: */
    public Lexer(ComplexSymbolFactory _symbolFactory, java.io.InputStream _inputStream){
		this(_inputStream);
        this.symbolFactory = _symbolFactory;
    }

	public Lexer(ComplexSymbolFactory _symbolFactory, java.io.Reader _reader){
		this(_reader);
        this.symbolFactory = _symbolFactory;
    }

    private StringBuffer sb;
    private ComplexSymbolFactory symbolFactory;
    private int csline,cscolumn;

    public Symbol symbol(String name, int code){
		return symbolFactory.newSymbol(name, code,
						new Location(yyline+1,yycolumn+1, yychar), // -yylength()
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength())
				);
    }
    public Symbol symbol(String name, int code, String lexem){
		return symbolFactory.newSymbol(name, code,
						new Location(yyline+1, yycolumn +1, yychar),
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength()), lexem);
    }

    protected void emit_warning(String message){
    		System.out.println("scanner warning: " + message + " at : 2 "+
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }

    protected void emit_error(String message){
    		System.out.println("scanner error: " + message + " at : 2" +
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.yy_reader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the split, compressed DFA transition table.
   *
   * @return the unpacked transition table
   */
  private static int [] yy_unpack() {
    int [] trans = new int[7535];
    int offset = 0;
    offset = yy_unpack(yy_packed0, offset, trans);
    return trans;
  }

  /** 
   * Unpacks the compressed DFA transition table.
   *
   * @param packed   the packed transition table
   * @return         the index of the last entry
   */
  private static int yy_unpack(String packed, int offset, int [] trans) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do trans[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] yy_unpack_cmap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2294) {
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
   * @exception   IOException  if any I/O-Error occurs
   */
  private boolean yy_refill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (yy_startRead > 0) {
      System.arraycopy(yy_buffer, yy_startRead, 
                       yy_buffer, 0, 
                       yy_endRead-yy_startRead);

      /* translate stored positions */
      yy_endRead-= yy_startRead;
      yy_currentPos-= yy_startRead;
      yy_markedPos-= yy_startRead;
      yy_pushbackPos-= yy_startRead;
      yy_startRead = 0;
    }

    /* is the buffer big enough? */
    if (yy_currentPos >= yy_buffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[yy_currentPos*2];
      System.arraycopy(yy_buffer, 0, newBuffer, 0, yy_buffer.length);
      yy_buffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = yy_reader.read(yy_buffer, yy_endRead, 
                                            yy_buffer.length-yy_endRead);

    if (numRead < 0) {
      return true;
    }
    else {
      yy_endRead+= numRead;  
      return false;
    }
  }


  /**
   * Closes the input stream.
   */
  final public void yyclose() throws java.io.IOException {
    yy_atEOF = true;            /* indicate end of file */
    yy_endRead = yy_startRead;  /* invalidate buffer    */

    if (yy_reader != null)
      yy_reader.close();
  }


  /**
   * Closes the current stream, and resets the
   * scanner to read from a new input stream.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>YY_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  final public void yyreset(java.io.Reader reader) throws java.io.IOException {
    yyclose();
    yy_reader = reader;
    yy_atBOL  = true;
    yy_atEOF  = false;
    yy_endRead = yy_startRead = 0;
    yy_currentPos = yy_markedPos = yy_pushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    yy_lexical_state = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  final public int yystate() {
    return yy_lexical_state;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  final public void yybegin(int newState) {
    yy_lexical_state = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  final public String yytext() {
    return new String( yy_buffer, yy_startRead, yy_markedPos-yy_startRead );
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
  final public char yycharat(int pos) {
    return yy_buffer[yy_startRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  final public int yylength() {
    return yy_markedPos-yy_startRead;
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
  private void yy_ScanError(int errorCode) {
    String message;
    try {
      message = YY_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = YY_ERROR_MSG[YY_UNKNOWN_ERROR];
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
  private void yypushback(int number)  {
    if ( number > yylength() )
      yy_ScanError(YY_PUSHBACK_2BIG);

    yy_markedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void yy_do_eof() throws java.io.IOException {
    if (!yy_eof_done) {
      yy_eof_done = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int yy_input;
    int yy_action;

    // cached fields:
    int yy_currentPos_l;
    int yy_startRead_l;
    int yy_markedPos_l;
    int yy_endRead_l = yy_endRead;
    char [] yy_buffer_l = yy_buffer;
    char [] yycmap_l = yycmap;

    int [] yytrans_l = yytrans;
    int [] yy_rowMap_l = yy_rowMap;
    byte [] yy_attr_l = YY_ATTRIBUTE;

    while (true) {
      yy_markedPos_l = yy_markedPos;

      yychar+= yy_markedPos_l-yy_startRead;

      boolean yy_r = false;
      for (yy_currentPos_l = yy_startRead; yy_currentPos_l < yy_markedPos_l;
                                                             yy_currentPos_l++) {
        switch (yy_buffer_l[yy_currentPos_l]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          yy_r = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          yy_r = true;
          break;
        case '\n':
          if (yy_r)
            yy_r = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          yy_r = false;
          yycolumn++;
        }
      }

      if (yy_r) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean yy_peek;
        if (yy_markedPos_l < yy_endRead_l)
          yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        else if (yy_atEOF)
          yy_peek = false;
        else {
          boolean eof = yy_refill();
          yy_markedPos_l = yy_markedPos;
          yy_buffer_l = yy_buffer;
          if (eof) 
            yy_peek = false;
          else 
            yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        }
        if (yy_peek) yyline--;
      }
      yy_action = -1;

      yy_startRead_l = yy_currentPos_l = yy_currentPos = 
                       yy_startRead = yy_markedPos_l;

      yy_state = yy_lexical_state;


      yy_forAction: {
        while (true) {

          if (yy_currentPos_l < yy_endRead_l)
            yy_input = yy_buffer_l[yy_currentPos_l++];
          else if (yy_atEOF) {
            yy_input = YYEOF;
            break yy_forAction;
          }
          else {
            // store back cached positions
            yy_currentPos  = yy_currentPos_l;
            yy_markedPos   = yy_markedPos_l;
            boolean eof = yy_refill();
            // get translated positions and possibly new buffer
            yy_currentPos_l  = yy_currentPos;
            yy_markedPos_l   = yy_markedPos;
            yy_buffer_l      = yy_buffer;
            yy_endRead_l     = yy_endRead;
            if (eof) {
              yy_input = YYEOF;
              break yy_forAction;
            }
            else {
              yy_input = yy_buffer_l[yy_currentPos_l++];
            }
          }
          int yy_next = yytrans_l[ yy_rowMap_l[yy_state] + yycmap_l[yy_input] ];
          if (yy_next == -1) break yy_forAction;
          yy_state = yy_next;

          int yy_attributes = yy_attr_l[yy_state];
          if ( (yy_attributes & 1) == 1 ) {
            yy_action = yy_state; 
            yy_markedPos_l = yy_currentPos_l; 
            if ( (yy_attributes & 8) == 8 ) break yy_forAction;
          }

        }
      }

      // store back cached position
      yy_markedPos = yy_markedPos_l;

      switch (yy_action) {

        case 177: 
          {  return symbolFactory.newSymbol("Implements", UL_Implements);  }
        case 188: break;
        case 7: 
          {  return symbolFactory.newSymbol("Asterisque", UL_Asterisque);  }
        case 189: break;
        case 155: 
          {  return symbolFactory.newSymbol("Type Chaîne", UL_Type_Chaine);  }
        case 190: break;
        case 93: 
          {  return symbolFactory.newSymbol("Type Entier", UL_Type_Entier);  }
        case 191: break;
        case 14: 
          {  return symbolFactory.newSymbol("Deux Points", UL_Deux_Points);  }
        case 192: break;
        case 24: 
          {  return symbolFactory.newSymbol("Esperluette", UL_Esperluette);  }
        case 193: break;
        case 53: 
          {  return symbolFactory.newSymbol("Double Egal", UL_Double_Egal);  }
        case 194: break;
        case 56: 
          {  return symbolFactory.newSymbol("Double Plus", UL_Double_Plus);  }
        case 195: break;
        case 3: 
        case 4: 
          {   }
        case 196: break;
        case 5: 
          {  return symbolFactory.newSymbol("Nombre Entier", UL_Nombre_Entier, yytext());  }
        case 197: break;
        case 48: 
        case 84: 
          {  return symbolFactory.newSymbol("Chaine de caractères", UL_Chaine, yytext());  }
        case 198: break;
        case 59: 
          {  return symbolFactory.newSymbol("Double Esperluette", UL_Double_Esperluette);  }
        case 199: break;
        case 142: 
          {  return symbolFactory.newSymbol("Final", UL_Final);  }
        case 200: break;
        case 132: 
          {  return symbolFactory.newSymbol("Classe", UL_Class);  }
        case 201: break;
        case 118: 
          {  return symbolFactory.newSymbol("Sinon", UL_Sinon);  }
        case 202: break;
        case 21: 
          {  return symbolFactory.newSymbol("Moins", UL_Moins);  }
        case 203: break;
        case 13: 
          {  return symbolFactory.newSymbol("Point", UL_Point);  }
        case 204: break;
        case 186: 
          {  return symbolFactory.newSymbol("Log", UL_Log);  }
        case 205: break;
        case 111: 
          {  return symbolFactory.newSymbol("Nul", UL_Nul);  }
        case 206: break;
        case 85: 
          {  return symbolFactory.newSymbol("Caractère", UL_Caractere, yytext());  }
        case 207: break;
        case 173: 
          {  return symbolFactory.newSymbol("Type Caractère", UL_Type_Caractere);  }
        case 208: break;
        case 55: 
          {  return symbolFactory.newSymbol("Supérieur Egal", UL_Superieur_Egal);  }
        case 209: break;
        case 171: 
          {  return symbolFactory.newSymbol("Abstract", UL_Abstract);  }
        case 210: break;
        case 147: 
          {  return symbolFactory.newSymbol("Tant que", UL_Tant_Que);  }
        case 211: break;
        case 144: 
          {  return symbolFactory.newSymbol("Afficher", UL_Afficher);  }
        case 212: break;
        case 130: 
          {  return symbolFactory.newSymbol("Définition Constante", UL_Definition_Constante);  }
        case 213: break;
        case 11: 
          {  return symbolFactory.newSymbol("Point Virgule", UL_Point_Virgule);  }
        case 214: break;
        case 159: 
          {  return symbolFactory.newSymbol("Public", UL_Public);	 }
        case 215: break;
        case 153: 
          {  return symbolFactory.newSymbol("Return", UL_Retour);  }
        case 216: break;
        case 149: 
          {  return symbolFactory.newSymbol("Static", UL_Static);  }
        case 217: break;
        case 174: 
          {  return symbolFactory.newSymbol("Interface", UL_Interface);  }
        case 218: break;
        case 123: 
          {  return symbolFactory.newSymbol("Type Vide", UL_Type_Vide);  }
        case 219: break;
        case 19: 
          {  return symbolFactory.newSymbol("Supérieur", UL_Superieur);  }
        case 220: break;
        case 18: 
          {  return symbolFactory.newSymbol("Inférieur", UL_Inferieur);  }
        case 221: break;
        case 22: 
          {  return symbolFactory.newSymbol("Pour Cent", UL_Pour_Cent);  }
        case 222: break;
        case 10: 
        case 31: 
        case 32: 
        case 33: 
        case 34: 
        case 35: 
        case 36: 
        case 37: 
        case 38: 
        case 39: 
        case 40: 
        case 41: 
        case 42: 
        case 43: 
        case 44: 
        case 60: 
        case 61: 
        case 62: 
        case 63: 
        case 64: 
        case 65: 
        case 66: 
        case 67: 
        case 69: 
        case 70: 
        case 71: 
        case 72: 
        case 73: 
        case 74: 
        case 75: 
        case 76: 
        case 77: 
        case 78: 
        case 79: 
        case 80: 
        case 81: 
        case 82: 
        case 86: 
        case 87: 
        case 88: 
        case 90: 
        case 91: 
        case 92: 
        case 94: 
        case 95: 
        case 96: 
        case 97: 
        case 98: 
        case 99: 
        case 100: 
        case 101: 
        case 102: 
        case 103: 
        case 104: 
        case 105: 
        case 106: 
        case 107: 
        case 108: 
        case 109: 
        case 110: 
        case 112: 
        case 114: 
        case 115: 
        case 116: 
        case 117: 
        case 119: 
        case 120: 
        case 121: 
        case 122: 
        case 124: 
        case 125: 
        case 126: 
        case 127: 
        case 128: 
        case 129: 
        case 131: 
        case 133: 
        case 134: 
        case 135: 
        case 136: 
        case 137: 
        case 138: 
        case 139: 
        case 140: 
        case 141: 
        case 145: 
        case 146: 
        case 148: 
        case 150: 
        case 151: 
        case 152: 
        case 154: 
        case 156: 
        case 157: 
        case 158: 
        case 160: 
        case 161: 
        case 162: 
        case 163: 
        case 168: 
        case 169: 
        case 170: 
        case 175: 
          {  return symbolFactory.newSymbol("Identificateur", UL_Identificateur, yytext());  }
        case 223: break;
        case 54: 
          {  return symbolFactory.newSymbol("Inférieur Egal", UL_Inferieur_Egal);  }
        case 224: break;
        case 2: 
        case 8: 
        case 9: 
        case 23: 
          {  emit_warning( "Unrecognized character '" + yytext() + "' -- ignored" );  }
        case 225: break;
        case 25: 
          {  return symbolFactory.newSymbol("Parenthese Ouvrante", UL_Parenthese_Ouvrante);  }
        case 226: break;
        case 26: 
          {  return symbolFactory.newSymbol("Parenthese Fermante", UL_Parenthese_Fermante);  }
        case 227: break;
        case 68: 
          {  return symbolFactory.newSymbol("Si", UL_Si);  }
        case 228: break;
        case 16: 
          {  return symbolFactory.newSymbol("Point d'Exclamation", UL_Point_Exclamation);  }
        case 229: break;
        case 29: 
          {  return symbolFactory.newSymbol("Crochet Ouvrant", UL_Crochet_Ouvrant);  }
        case 230: break;
        case 30: 
          {  return symbolFactory.newSymbol("Crochet Fermant", UL_Crochet_Fermant);  }
        case 231: break;
        case 167: 
          {  return symbolFactory.newSymbol("Private", UL_Private);  }
        case 232: break;
        case 164: 
          {  return symbolFactory.newSymbol("Extends", UL_Extends);  }
        case 233: break;
        case 89: 
          {  return symbolFactory.newSymbol("Nouveau", UL_Nouveau);  }
        case 234: break;
        case 6: 
          {  return symbolFactory.newSymbol("Oblique", UL_Oblique);  }
        case 235: break;
        case 12: 
          {  return symbolFactory.newSymbol("Virgule", UL_Virgule);  }
        case 236: break;
        case 27: 
          {  return symbolFactory.newSymbol("Accolade Ouvrante", UL_Accolade_Ouvrante);  }
        case 237: break;
        case 28: 
          {  return symbolFactory.newSymbol("Accolade Fermante", UL_Accolade_Fermante);  }
        case 238: break;
        case 52: 
          {  return symbolFactory.newSymbol("Exclamation Egal", UL_Exclamation_Egal);  }
        case 239: break;
        case 166: 
          {  return symbolFactory.newSymbol("Type Booléen", UL_Type_Booleen);  }
        case 240: break;
        case 143: 
          {  return symbolFactory.newSymbol("Faux", UL_Faux);  }
        case 241: break;
        case 113: 
          {  return symbolFactory.newSymbol("Vrai", UL_Vrai);  }
        case 242: break;
        case 20: 
          {  return symbolFactory.newSymbol("Plus", UL_Plus);  }
        case 243: break;
        case 17: 
          {  return symbolFactory.newSymbol("Egal", UL_Egal);  }
        case 244: break;
        case 15: 
          {  return symbolFactory.newSymbol("Point d'Interrogation", UL_Point_Interrogation);  }
        case 245: break;
        case 57: 
          {  return symbolFactory.newSymbol("Double Moins", UL_Double_Moins);  }
        case 246: break;
        case 58: 
          {  return symbolFactory.newSymbol("Double Barre", UL_Double_Barre);  }
        case 247: break;
        default: 
          if (yy_input == YYEOF && yy_startRead == yy_currentPos) {
            yy_atEOF = true;
            yy_do_eof();
              {     return symbolFactory.newSymbol("EOF",sym.EOF);
 }
          } 
          else {
            yy_ScanError(YY_NO_MATCH);
          }
      }
    }
  }


}
