// $ANTLR 3.5.2 Logo.g 2017-12-16 17:41:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class LogoLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int BACK=4;
	public static final int CALL=5;
	public static final int CLEAR=6;
	public static final int COMMENT=7;
	public static final int COMPOUND=8;
	public static final int DIV=9;
	public static final int END=10;
	public static final int EQ=11;
	public static final int FORWARD=12;
	public static final int GREATER=13;
	public static final int HIDE=14;
	public static final int IF=15;
	public static final int LEFT=16;
	public static final int LESS=17;
	public static final int LOCAL=18;
	public static final int LST=19;
	public static final int MAKE=20;
	public static final int MINUS=21;
	public static final int MULT=22;
	public static final int NEG=23;
	public static final int NEQ=24;
	public static final int NUM=25;
	public static final int PENDOWN=26;
	public static final int PENUP=27;
	public static final int PLUS=28;
	public static final int REPCOUNT=29;
	public static final int REPEAT=30;
	public static final int RIGHT=31;
	public static final int SETH=32;
	public static final int SETPCRGB=33;
	public static final int SETPENSIZE=34;
	public static final int SETPOS=35;
	public static final int SHOW=36;
	public static final int SIMPLE=37;
	public static final int STOP=38;
	public static final int TO=39;
	public static final int VAR=40;
	public static final int WS=41;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public LogoLexer() {} 
	public LogoLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public LogoLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Logo.g"; }

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:2:7: ( '\"' )
			// Logo.g:2:9: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:3:7: ( '(' )
			// Logo.g:3:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:4:7: ( ')' )
			// Logo.g:4:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:5:7: ( '*' )
			// Logo.g:5:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:6:7: ( '+' )
			// Logo.g:6:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:7:7: ( '-' )
			// Logo.g:7:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:8:7: ( '/' )
			// Logo.g:8:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:9:7: ( ':' )
			// Logo.g:9:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:10:7: ( '[' )
			// Logo.g:10:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:11:7: ( ']' )
			// Logo.g:11:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "FORWARD"
	public final void mFORWARD() throws RecognitionException {
		try {
			int _type = FORWARD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:90:9: ( 'FD' )
			// Logo.g:90:11: 'FD'
			{
			match("FD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FORWARD"

	// $ANTLR start "RIGHT"
	public final void mRIGHT() throws RecognitionException {
		try {
			int _type = RIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:91:7: ( 'RT' )
			// Logo.g:91:9: 'RT'
			{
			match("RT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT"

	// $ANTLR start "LEFT"
	public final void mLEFT() throws RecognitionException {
		try {
			int _type = LEFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:92:6: ( 'LT' )
			// Logo.g:92:8: 'LT'
			{
			match("LT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT"

	// $ANTLR start "BACK"
	public final void mBACK() throws RecognitionException {
		try {
			int _type = BACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:93:6: ( 'BK' )
			// Logo.g:93:8: 'BK'
			{
			match("BK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BACK"

	// $ANTLR start "PENUP"
	public final void mPENUP() throws RecognitionException {
		try {
			int _type = PENUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:94:7: ( 'PU' )
			// Logo.g:94:9: 'PU'
			{
			match("PU"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PENUP"

	// $ANTLR start "PENDOWN"
	public final void mPENDOWN() throws RecognitionException {
		try {
			int _type = PENDOWN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:95:9: ( 'PD' )
			// Logo.g:95:11: 'PD'
			{
			match("PD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PENDOWN"

	// $ANTLR start "REPEAT"
	public final void mREPEAT() throws RecognitionException {
		try {
			int _type = REPEAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:96:8: ( 'REPEAT' )
			// Logo.g:96:10: 'REPEAT'
			{
			match("REPEAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REPEAT"

	// $ANTLR start "REPCOUNT"
	public final void mREPCOUNT() throws RecognitionException {
		try {
			int _type = REPCOUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:97:10: ( 'REPCOUNT' )
			// Logo.g:97:12: 'REPCOUNT'
			{
			match("REPCOUNT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REPCOUNT"

	// $ANTLR start "CLEAR"
	public final void mCLEAR() throws RecognitionException {
		try {
			int _type = CLEAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:98:7: ( 'CS' )
			// Logo.g:98:9: 'CS'
			{
			match("CS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLEAR"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:99:4: ( 'IF' )
			// Logo.g:99:6: 'IF'
			{
			match("IF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "SHOW"
	public final void mSHOW() throws RecognitionException {
		try {
			int _type = SHOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:100:6: ( 'ST' )
			// Logo.g:100:8: 'ST'
			{
			match("ST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHOW"

	// $ANTLR start "HIDE"
	public final void mHIDE() throws RecognitionException {
		try {
			int _type = HIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:101:6: ( 'HT' )
			// Logo.g:101:8: 'HT'
			{
			match("HT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HIDE"

	// $ANTLR start "SETPCRGB"
	public final void mSETPCRGB() throws RecognitionException {
		try {
			int _type = SETPCRGB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:102:10: ( 'SETPCRGB' )
			// Logo.g:102:12: 'SETPCRGB'
			{
			match("SETPCRGB"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SETPCRGB"

	// $ANTLR start "SETPENSIZE"
	public final void mSETPENSIZE() throws RecognitionException {
		try {
			int _type = SETPENSIZE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:103:12: ( 'SETPENSIZE' )
			// Logo.g:103:14: 'SETPENSIZE'
			{
			match("SETPENSIZE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SETPENSIZE"

	// $ANTLR start "SETPOS"
	public final void mSETPOS() throws RecognitionException {
		try {
			int _type = SETPOS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:104:8: ( 'SETPOS' )
			// Logo.g:104:10: 'SETPOS'
			{
			match("SETPOS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SETPOS"

	// $ANTLR start "SETH"
	public final void mSETH() throws RecognitionException {
		try {
			int _type = SETH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:105:6: ( 'SETH' )
			// Logo.g:105:8: 'SETH'
			{
			match("SETH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SETH"

	// $ANTLR start "TO"
	public final void mTO() throws RecognitionException {
		try {
			int _type = TO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:106:4: ( 'TO' )
			// Logo.g:106:6: 'TO'
			{
			match("TO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TO"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:107:5: ( 'END' )
			// Logo.g:107:7: 'END'
			{
			match("END"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "CALL"
	public final void mCALL() throws RecognitionException {
		try {
			int _type = CALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:108:6: ( 'CALL' )
			// Logo.g:108:8: 'CALL'
			{
			match("CALL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CALL"

	// $ANTLR start "STOP"
	public final void mSTOP() throws RecognitionException {
		try {
			int _type = STOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:109:6: ( 'STOP' )
			// Logo.g:109:8: 'STOP'
			{
			match("STOP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STOP"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:110:4: ( '==' )
			// Logo.g:110:6: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:111:5: ( '!=' )
			// Logo.g:111:7: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQ"

	// $ANTLR start "LESS"
	public final void mLESS() throws RecognitionException {
		try {
			int _type = LESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:112:6: ( '<' )
			// Logo.g:112:8: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESS"

	// $ANTLR start "GREATER"
	public final void mGREATER() throws RecognitionException {
		try {
			int _type = GREATER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:113:9: ( '>' )
			// Logo.g:113:11: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATER"

	// $ANTLR start "MAKE"
	public final void mMAKE() throws RecognitionException {
		try {
			int _type = MAKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:114:6: ( 'MAKE' )
			// Logo.g:114:8: 'MAKE'
			{
			match("MAKE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAKE"

	// $ANTLR start "LOCAL"
	public final void mLOCAL() throws RecognitionException {
		try {
			int _type = LOCAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:115:7: ( 'LOCAL' )
			// Logo.g:115:9: 'LOCAL'
			{
			match("LOCAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOCAL"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:116:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
			// Logo.g:116:7: ( 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// Logo.g:116:7: ( 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Logo.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:117:5: ( ( ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ) )
			int alt5=2;
			alt5 = dfa5.predict(input);
			switch (alt5) {
				case 1 :
					// Logo.g:117:7: ( ( '0' .. '9' )+ )
					{
					// Logo.g:117:7: ( ( '0' .. '9' )+ )
					// Logo.g:117:8: ( '0' .. '9' )+
					{
					// Logo.g:117:8: ( '0' .. '9' )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// Logo.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					}

					}
					break;
				case 2 :
					// Logo.g:117:21: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
					{
					// Logo.g:117:21: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
					// Logo.g:117:22: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
					{
					// Logo.g:117:22: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// Logo.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match('.'); 
					// Logo.g:117:36: ( '0' .. '9' )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// Logo.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:118:9: ( ( '//' | '#' ) (~ ( '\\r' | '\\n' ) )* )
			// Logo.g:118:11: ( '//' | '#' ) (~ ( '\\r' | '\\n' ) )*
			{
			// Logo.g:118:11: ( '//' | '#' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='/') ) {
				alt6=1;
			}
			else if ( (LA6_0=='#') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// Logo.g:118:12: '//'
					{
					match("//"); 

					}
					break;
				case 2 :
					// Logo.g:118:19: '#'
					{
					match('#'); 
					}
					break;

			}

			// Logo.g:118:24: (~ ( '\\r' | '\\n' ) )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Logo.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Logo.g:119:4: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// Logo.g:119:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// Logo.g:119:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||LA8_0=='\r'||LA8_0==' ') ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Logo.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// Logo.g:1:8: ( T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | FORWARD | RIGHT | LEFT | BACK | PENUP | PENDOWN | REPEAT | REPCOUNT | CLEAR | IF | SHOW | HIDE | SETPCRGB | SETPENSIZE | SETPOS | SETH | TO | END | CALL | STOP | EQ | NEQ | LESS | GREATER | MAKE | LOCAL | VAR | NUM | COMMENT | WS )
		int alt9=40;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// Logo.g:1:10: T__42
				{
				mT__42(); 

				}
				break;
			case 2 :
				// Logo.g:1:16: T__43
				{
				mT__43(); 

				}
				break;
			case 3 :
				// Logo.g:1:22: T__44
				{
				mT__44(); 

				}
				break;
			case 4 :
				// Logo.g:1:28: T__45
				{
				mT__45(); 

				}
				break;
			case 5 :
				// Logo.g:1:34: T__46
				{
				mT__46(); 

				}
				break;
			case 6 :
				// Logo.g:1:40: T__47
				{
				mT__47(); 

				}
				break;
			case 7 :
				// Logo.g:1:46: T__48
				{
				mT__48(); 

				}
				break;
			case 8 :
				// Logo.g:1:52: T__49
				{
				mT__49(); 

				}
				break;
			case 9 :
				// Logo.g:1:58: T__50
				{
				mT__50(); 

				}
				break;
			case 10 :
				// Logo.g:1:64: T__51
				{
				mT__51(); 

				}
				break;
			case 11 :
				// Logo.g:1:70: FORWARD
				{
				mFORWARD(); 

				}
				break;
			case 12 :
				// Logo.g:1:78: RIGHT
				{
				mRIGHT(); 

				}
				break;
			case 13 :
				// Logo.g:1:84: LEFT
				{
				mLEFT(); 

				}
				break;
			case 14 :
				// Logo.g:1:89: BACK
				{
				mBACK(); 

				}
				break;
			case 15 :
				// Logo.g:1:94: PENUP
				{
				mPENUP(); 

				}
				break;
			case 16 :
				// Logo.g:1:100: PENDOWN
				{
				mPENDOWN(); 

				}
				break;
			case 17 :
				// Logo.g:1:108: REPEAT
				{
				mREPEAT(); 

				}
				break;
			case 18 :
				// Logo.g:1:115: REPCOUNT
				{
				mREPCOUNT(); 

				}
				break;
			case 19 :
				// Logo.g:1:124: CLEAR
				{
				mCLEAR(); 

				}
				break;
			case 20 :
				// Logo.g:1:130: IF
				{
				mIF(); 

				}
				break;
			case 21 :
				// Logo.g:1:133: SHOW
				{
				mSHOW(); 

				}
				break;
			case 22 :
				// Logo.g:1:138: HIDE
				{
				mHIDE(); 

				}
				break;
			case 23 :
				// Logo.g:1:143: SETPCRGB
				{
				mSETPCRGB(); 

				}
				break;
			case 24 :
				// Logo.g:1:152: SETPENSIZE
				{
				mSETPENSIZE(); 

				}
				break;
			case 25 :
				// Logo.g:1:163: SETPOS
				{
				mSETPOS(); 

				}
				break;
			case 26 :
				// Logo.g:1:170: SETH
				{
				mSETH(); 

				}
				break;
			case 27 :
				// Logo.g:1:175: TO
				{
				mTO(); 

				}
				break;
			case 28 :
				// Logo.g:1:178: END
				{
				mEND(); 

				}
				break;
			case 29 :
				// Logo.g:1:182: CALL
				{
				mCALL(); 

				}
				break;
			case 30 :
				// Logo.g:1:187: STOP
				{
				mSTOP(); 

				}
				break;
			case 31 :
				// Logo.g:1:192: EQ
				{
				mEQ(); 

				}
				break;
			case 32 :
				// Logo.g:1:195: NEQ
				{
				mNEQ(); 

				}
				break;
			case 33 :
				// Logo.g:1:199: LESS
				{
				mLESS(); 

				}
				break;
			case 34 :
				// Logo.g:1:204: GREATER
				{
				mGREATER(); 

				}
				break;
			case 35 :
				// Logo.g:1:212: MAKE
				{
				mMAKE(); 

				}
				break;
			case 36 :
				// Logo.g:1:217: LOCAL
				{
				mLOCAL(); 

				}
				break;
			case 37 :
				// Logo.g:1:223: VAR
				{
				mVAR(); 

				}
				break;
			case 38 :
				// Logo.g:1:227: NUM
				{
				mNUM(); 

				}
				break;
			case 39 :
				// Logo.g:1:231: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 40 :
				// Logo.g:1:239: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA5_eotS =
		"\1\uffff\1\2\2\uffff";
	static final String DFA5_eofS =
		"\4\uffff";
	static final String DFA5_minS =
		"\1\60\1\56\2\uffff";
	static final String DFA5_maxS =
		"\2\71\2\uffff";
	static final String DFA5_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA5_specialS =
		"\4\uffff}>";
	static final String[] DFA5_transitionS = {
			"\12\1",
			"\1\3\1\uffff\12\1",
			"",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "117:1: NUM : ( ( ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ) );";
		}
	}

	static final String DFA9_eotS =
		"\7\uffff\1\37\3\uffff\13\33\4\uffff\1\33\5\uffff\1\61\1\62\1\33\1\64\1"+
		"\33\1\66\1\67\1\70\1\71\1\33\1\73\1\75\1\33\1\77\1\100\2\33\2\uffff\1"+
		"\33\1\uffff\1\33\4\uffff\1\33\1\uffff\1\33\1\uffff\1\33\2\uffff\1\112"+
		"\4\33\1\117\1\120\1\33\1\124\1\uffff\1\125\2\33\1\130\2\uffff\3\33\2\uffff"+
		"\1\134\1\33\1\uffff\2\33\1\140\1\uffff\3\33\1\uffff\1\144\1\145\1\33\2"+
		"\uffff\1\33\1\150\1\uffff";
	static final String DFA9_eofS =
		"\151\uffff";
	static final String DFA9_minS =
		"\1\11\6\uffff\1\57\3\uffff\1\104\1\105\1\117\1\113\1\104\1\101\1\106\1"+
		"\105\1\124\1\117\1\116\4\uffff\1\101\5\uffff\2\101\1\120\1\101\1\103\4"+
		"\101\1\114\2\101\1\124\2\101\1\104\1\113\2\uffff\1\103\1\uffff\1\101\4"+
		"\uffff\1\114\1\uffff\1\120\1\uffff\1\110\2\uffff\1\101\1\105\1\101\1\117"+
		"\1\114\2\101\1\103\1\101\1\uffff\1\101\1\124\1\125\1\101\2\uffff\1\122"+
		"\1\116\1\123\2\uffff\1\101\1\116\1\uffff\1\107\1\123\1\101\1\uffff\1\124"+
		"\1\102\1\111\1\uffff\2\101\1\132\2\uffff\1\105\1\101\1\uffff";
	static final String DFA9_maxS =
		"\1\172\6\uffff\1\57\3\uffff\1\104\2\124\1\113\1\125\1\123\1\106\2\124"+
		"\1\117\1\116\4\uffff\1\101\5\uffff\2\172\1\120\1\172\1\103\4\172\1\114"+
		"\2\172\1\124\2\172\1\104\1\113\2\uffff\1\105\1\uffff\1\101\4\uffff\1\114"+
		"\1\uffff\1\120\1\uffff\1\120\2\uffff\1\172\1\105\1\101\1\117\1\114\2\172"+
		"\1\117\1\172\1\uffff\1\172\1\124\1\125\1\172\2\uffff\1\122\1\116\1\123"+
		"\2\uffff\1\172\1\116\1\uffff\1\107\1\123\1\172\1\uffff\1\124\1\102\1\111"+
		"\1\uffff\2\172\1\132\2\uffff\1\105\1\172\1\uffff";
	static final String DFA9_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\13\uffff\1\37"+
		"\1\40\1\41\1\42\1\uffff\1\45\1\46\1\47\1\50\1\7\21\uffff\1\13\1\14\1\uffff"+
		"\1\15\1\uffff\1\16\1\17\1\20\1\23\1\uffff\1\24\1\uffff\1\25\1\uffff\1"+
		"\26\1\33\11\uffff\1\34\4\uffff\1\35\1\36\3\uffff\1\32\1\43\2\uffff\1\44"+
		"\3\uffff\1\21\3\uffff\1\31\3\uffff\1\22\1\27\2\uffff\1\30";
	static final String DFA9_specialS =
		"\151\uffff}>";
	static final String[] DFA9_transitionS = {
			"\2\36\2\uffff\1\36\22\uffff\1\36\1\27\1\1\1\35\4\uffff\1\2\1\3\1\4\1"+
			"\5\1\uffff\1\6\1\uffff\1\7\12\34\1\10\1\uffff\1\30\1\26\1\31\2\uffff"+
			"\1\33\1\16\1\20\1\33\1\25\1\13\1\33\1\23\1\21\2\33\1\15\1\32\2\33\1\17"+
			"\1\33\1\14\1\22\1\24\6\33\1\11\1\uffff\1\12\3\uffff\32\33",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\35",
			"",
			"",
			"",
			"\1\40",
			"\1\42\16\uffff\1\41",
			"\1\44\4\uffff\1\43",
			"\1\45",
			"\1\47\20\uffff\1\46",
			"\1\51\21\uffff\1\50",
			"\1\52",
			"\1\54\16\uffff\1\53",
			"\1\55",
			"\1\56",
			"\1\57",
			"",
			"",
			"",
			"",
			"\1\60",
			"",
			"",
			"",
			"",
			"",
			"\32\33\6\uffff\32\33",
			"\32\33\6\uffff\32\33",
			"\1\63",
			"\32\33\6\uffff\32\33",
			"\1\65",
			"\32\33\6\uffff\32\33",
			"\32\33\6\uffff\32\33",
			"\32\33\6\uffff\32\33",
			"\32\33\6\uffff\32\33",
			"\1\72",
			"\32\33\6\uffff\32\33",
			"\16\33\1\74\13\33\6\uffff\32\33",
			"\1\76",
			"\32\33\6\uffff\32\33",
			"\32\33\6\uffff\32\33",
			"\1\101",
			"\1\102",
			"",
			"",
			"\1\104\1\uffff\1\103",
			"",
			"\1\105",
			"",
			"",
			"",
			"",
			"\1\106",
			"",
			"\1\107",
			"",
			"\1\111\7\uffff\1\110",
			"",
			"",
			"\32\33\6\uffff\32\33",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\32\33\6\uffff\32\33",
			"\32\33\6\uffff\32\33",
			"\1\121\1\uffff\1\122\11\uffff\1\123",
			"\32\33\6\uffff\32\33",
			"",
			"\32\33\6\uffff\32\33",
			"\1\126",
			"\1\127",
			"\32\33\6\uffff\32\33",
			"",
			"",
			"\1\131",
			"\1\132",
			"\1\133",
			"",
			"",
			"\32\33\6\uffff\32\33",
			"\1\135",
			"",
			"\1\136",
			"\1\137",
			"\32\33\6\uffff\32\33",
			"",
			"\1\141",
			"\1\142",
			"\1\143",
			"",
			"\32\33\6\uffff\32\33",
			"\32\33\6\uffff\32\33",
			"\1\146",
			"",
			"",
			"\1\147",
			"\32\33\6\uffff\32\33",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | FORWARD | RIGHT | LEFT | BACK | PENUP | PENDOWN | REPEAT | REPCOUNT | CLEAR | IF | SHOW | HIDE | SETPCRGB | SETPENSIZE | SETPOS | SETH | TO | END | CALL | STOP | EQ | NEQ | LESS | GREATER | MAKE | LOCAL | VAR | NUM | COMMENT | WS );";
		}
	}

}
