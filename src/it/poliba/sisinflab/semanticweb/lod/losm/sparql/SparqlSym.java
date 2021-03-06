
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Oct 06 13:30:56 CEST 2015
//----------------------------------------------------

package sparql;

/** CUP generated interface containing symbol constants. */
public interface SparqlSym {
  /* terminals */
  public static final int IRI = 42;
  public static final int ASC = 97;
  public static final int GT = 118;
  public static final int SBRACKETO = 101;
  public static final int EQUALMARK = 116;
  public static final int PN_PREFIX = 124;
  public static final int LIMIT = 11;
  public static final int UUID = 67;
  public static final int SLASH = 112;
  public static final int SBRACKETC = 102;
  public static final int SHA512 = 73;
  public static final int ORDER = 8;
  public static final int CREATE = 125;
  public static final int LCASE = 52;
  public static final int VARNAME = 126;
  public static final int ENCODE_FOR_URI = 53;
  public static final int INTO = 127;
  public static final int SAMETERM = 28;
  public static final int WHERE = 17;
  public static final int STRBEFORE = 57;
  public static final int NAMED = 16;
  public static final int PN_LOCAL_ESC = 128;
  public static final int CONTAINS = 54;
  public static final int MD5 = 69;
  public static final int UNION = 20;
  public static final int STRENDS = 56;
  public static final int NIL = 173;
  public static final int RAND = 44;
  public static final int REPLACE = 38;
  public static final int VALUES = 79;
  public static final int DECIMAL_NEGATIVE = 167;
  public static final int LANGTAG = 159;
  public static final int CARETCARET = 110;
  public static final int ADD = 129;
  public static final int ROUND = 48;
  public static final int DOUBLEPIPE = 114;
  public static final int INTEGER_POSITIVE = 163;
  public static final int DOUBLEAMPERSAND = 115;
  public static final int HAVING = 78;
  public static final int SHA256 = 71;
  public static final int DIFFERENT = 119;
  public static final int CEIL = 46;
  public static final int PN_CHARS_U = 130;
  public static final int EOF = 0;
  public static final int ISNUMERIC = 77;
  public static final int MINUS = 84;
  public static final int ISURI = 29;
  public static final int EMARK = 105;
  public static final int MAX = 88;
  public static final int BASE = 2;
  public static final int OPERATOR = 131;
  public static final int SEPARATOR = 92;
  public static final int MOVE = 132;
  public static final int STRDT = 93;
  public static final int GROUP_CONCAT = 85;
  public static final int REDUCED = 14;
  public static final int ABS = 45;
  public static final int USING = 133;
  public static final int CONCAT = 49;
  public static final int PN_CHARS_BASE = 134;
  public static final int EXPONENT = 135;
  public static final int CONSTRUCT = 5;
  public static final int DOUBLE_NEGATIVE = 168;
  public static final int PNAME_NS = 154;
  public static final int DROP = 136;
  public static final int BNODE = 41;
  public static final int TRUE = 34;
  public static final int ISIRI = 30;
  public static final int DECIMAL_POSITIVE = 164;
  public static final int FILTER = 21;
  public static final int COUNT = 89;
  public static final int PARENTHO = 99;
  public static final int BY = 9;
  public static final int SUBSTR = 40;
  public static final int GROUP = 98;
  public static final int PARENTHC = 100;
  public static final int STRAFTER = 58;
  public static final int LANGMATCHES = 25;
  public static final int STRSTARTS = 55;
  public static final int DELETE = 137;
  public static final int DECIMAL = 161;
  public static final int PIPE = 111;
  public static final int STRING_LITERAL_LONG2 = 172;
  public static final int DESCRIBE = 6;
  public static final int SHA384 = 72;
  public static final int STRING_LITERAL_LONG1 = 171;
  public static final int AS = 39;
  public static final int HEX = 141;
  public static final int DATATYPE = 26;
  public static final int STRLANG = 76;
  public static final int UNDEF = 83;
  public static final int PNAME_LN = 155;
  public static final int PN_CHARS = 142;
  public static final int ALL = 149;
  public static final int UCASE = 51;
  public static final int EXISTS = 37;
  public static final int DOUBLE_POSITIVE = 165;
  public static final int MINUSMARK = 123;
  public static final int COPY = 144;
  public static final int SILENT = 80;
  public static final int SELECT = 4;
  public static final int PLUSMARK = 122;
  public static final int COMMA = 108;
  public static final int LT = 117;
  public static final int CARET = 96;
  public static final int BIND = 82;
  public static final int PREFIX = 3;
  public static final int SERVICE = 81;
  public static final int SUM = 86;
  public static final int SAMPLE = 90;
  public static final int NOW = 94;
  public static final int DATA = 147;
  public static final int NOT = 36;
  public static final int YEAR = 59;
  public static final int PERCENT = 140;
  public static final int MIN = 87;
  public static final int HOURS = 62;
  public static final int SECONDS = 64;
  public static final int WITH = 148;
  public static final int OFFSET = 12;
  public static final int BLANK_NODE_LABEL = 156;
  public static final int MONTH = 60;
  public static final int DESC = 10;
  public static final int GEQUAL = 121;
  public static final int STRUUID = 68;
  public static final int STR = 23;
  public static final int WS = 174;
  public static final int BOUND = 27;
  public static final int STAR = 106;
  public static final int FALSE = 35;
  public static final int AVG = 91;
  public static final int INTEGER = 160;
  public static final int DOT = 107;
  public static final int ANON = 175;
  public static final int VAR2 = 158;
  public static final int VAR1 = 157;
  public static final int DOUBLE = 162;
  public static final int INSERT = 146;
  public static final int TIMEZONE = 65;
  public static final int LOAD = 150;
  public static final int FROM = 15;
  public static final int COALESCE = 74;
  public static final int STRING_LITERAL2 = 170;
  public static final int STRING_LITERAL1 = 169;
  public static final int SEMICOLON = 109;
  public static final int CBRACKETO = 103;
  public static final int REGEX = 33;
  public static final int LANG = 24;
  public static final int DAY = 61;
  public static final int IN = 95;
  public static final int PLX = 139;
  public static final int CBRACKETC = 104;
  public static final int URI = 43;
  public static final int error = 1;
  public static final int FLOOR = 47;
  public static final int ISLITERAL = 32;
  public static final int PN_LOCAL = 138;
  public static final int IF = 75;
  public static final int LEQUAL = 120;
  public static final int QMARK = 113;
  public static final int DEFAULT = 151;
  public static final int ECHAR = 152;
  public static final int SHA1 = 70;
  public static final int ISA = 22;
  public static final int INTEGER_NEGATIVE = 166;
  public static final int IRIREF = 153;
  public static final int TZ = 66;
  public static final int OPTIONAL = 19;
  public static final int STRLEN = 50;
  public static final int CLEAR = 143;
  public static final int MINUTES = 63;
  public static final int DISTINCT = 13;
  public static final int ISBLANK = 31;
  public static final int GRAPH = 18;
  public static final int ASK = 7;
  public static final int TO = 145;
}

