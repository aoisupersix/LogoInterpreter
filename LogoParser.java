// $ANTLR 3.5.2 Logo.g 2017-12-16 17:41:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class LogoParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BACK", "CALL", "CLEAR", "COMMENT", 
		"COMPOUND", "DIV", "END", "EQ", "FORWARD", "GREATER", "HIDE", "IF", "LEFT", 
		"LESS", "LOCAL", "LST", "MAKE", "MINUS", "MULT", "NEG", "NEQ", "NUM", 
		"PENDOWN", "PENUP", "PLUS", "REPCOUNT", "REPEAT", "RIGHT", "SETH", "SETPCRGB", 
		"SETPENSIZE", "SETPOS", "SHOW", "SIMPLE", "STOP", "TO", "VAR", "WS", "'\"'", 
		"'('", "')'", "'*'", "'+'", "'-'", "'/'", "':'", "'['", "']'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public LogoParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public LogoParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[42+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return LogoParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Logo.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// Logo.g:22:1: prog : stats EOF -> stats ;
	public final LogoParser.prog_return prog() throws RecognitionException {
		LogoParser.prog_return retval = new LogoParser.prog_return();
		retval.start = input.LT(1);
		int prog_StartIndex = input.index();

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope stats1 =null;

		Object EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_stats=new RewriteRuleSubtreeStream(adaptor,"rule stats");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// Logo.g:22:6: ( stats EOF -> stats )
			// Logo.g:23:7: stats EOF
			{
			pushFollow(FOLLOW_stats_in_prog123);
			stats1=stats();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_stats.add(stats1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog125); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: stats
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 23:17: -> stats
			{
				adaptor.addChild(root_0, stream_stats.nextTree());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, prog_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class stats_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stats"
	// Logo.g:26:1: stats : ( stat stats -> ^( COMPOUND stat stats ) | stat -> ^( SIMPLE stat ) );
	public final LogoParser.stats_return stats() throws RecognitionException {
		LogoParser.stats_return retval = new LogoParser.stats_return();
		retval.start = input.LT(1);
		int stats_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope stat3 =null;
		ParserRuleReturnScope stats4 =null;
		ParserRuleReturnScope stat5 =null;

		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
		RewriteRuleSubtreeStream stream_stats=new RewriteRuleSubtreeStream(adaptor,"rule stats");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// Logo.g:26:7: ( stat stats -> ^( COMPOUND stat stats ) | stat -> ^( SIMPLE stat ) )
			int alt1=2;
			switch ( input.LA(1) ) {
			case FORWARD:
				{
				int LA1_1 = input.LA(2);
				if ( (synpred1_Logo()) ) {
					alt1=1;
				}
				else if ( (true) ) {
					alt1=2;
				}

				}
				break;
			case RIGHT:
				{
				int LA1_2 = input.LA(2);
				if ( (synpred1_Logo()) ) {
					alt1=1;
				}
				else if ( (true) ) {
					alt1=2;
				}

				}
				break;
			case LEFT:
				{
				int LA1_3 = input.LA(2);
				if ( (synpred1_Logo()) ) {
					alt1=1;
				}
				else if ( (true) ) {
					alt1=2;
				}

				}
				break;
			case BACK:
				{
				int LA1_4 = input.LA(2);
				if ( (synpred1_Logo()) ) {
					alt1=1;
				}
				else if ( (true) ) {
					alt1=2;
				}

				}
				break;
			case PENUP:
				{
				int LA1_5 = input.LA(2);
				if ( (synpred1_Logo()) ) {
					alt1=1;
				}
				else if ( (true) ) {
					alt1=2;
				}

				}
				break;
			case PENDOWN:
				{
				int LA1_6 = input.LA(2);
				if ( (synpred1_Logo()) ) {
					alt1=1;
				}
				else if ( (true) ) {
					alt1=2;
				}

				}
				break;
			case REPEAT:
				{
				int LA1_7 = input.LA(2);
				if ( (synpred1_Logo()) ) {
					alt1=1;
				}
				else if ( (true) ) {
					alt1=2;
				}

				}
				break;
			case MAKE:
				{
				int LA1_8 = input.LA(2);
				if ( (synpred1_Logo()) ) {
					alt1=1;
				}
				else if ( (true) ) {
					alt1=2;
				}

				}
				break;
			case LOCAL:
				{
				int LA1_9 = input.LA(2);
				if ( (synpred1_Logo()) ) {
					alt1=1;
				}
				else if ( (true) ) {
					alt1=2;
				}

				}
				break;
			case CLEAR:
				{
				int LA1_10 = input.LA(2);
				if ( (synpred1_Logo()) ) {
					alt1=1;
				}
				else if ( (true) ) {
					alt1=2;
				}

				}
				break;
			case IF:
				{
				int LA1_11 = input.LA(2);
				if ( (synpred1_Logo()) ) {
					alt1=1;
				}
				else if ( (true) ) {
					alt1=2;
				}

				}
				break;
			case SHOW:
				{
				int LA1_12 = input.LA(2);
				if ( (synpred1_Logo()) ) {
					alt1=1;
				}
				else if ( (true) ) {
					alt1=2;
				}

				}
				break;
			case HIDE:
				{
				int LA1_13 = input.LA(2);
				if ( (synpred1_Logo()) ) {
					alt1=1;
				}
				else if ( (true) ) {
					alt1=2;
				}

				}
				break;
			case SETPCRGB:
				{
				int LA1_14 = input.LA(2);
				if ( (synpred1_Logo()) ) {
					alt1=1;
				}
				else if ( (true) ) {
					alt1=2;
				}

				}
				break;
			case SETPENSIZE:
				{
				int LA1_15 = input.LA(2);
				if ( (synpred1_Logo()) ) {
					alt1=1;
				}
				else if ( (true) ) {
					alt1=2;
				}

				}
				break;
			case SETPOS:
				{
				int LA1_16 = input.LA(2);
				if ( (synpred1_Logo()) ) {
					alt1=1;
				}
				else if ( (true) ) {
					alt1=2;
				}

				}
				break;
			case SETH:
				{
				int LA1_17 = input.LA(2);
				if ( (synpred1_Logo()) ) {
					alt1=1;
				}
				else if ( (true) ) {
					alt1=2;
				}

				}
				break;
			case TO:
				{
				int LA1_18 = input.LA(2);
				if ( (synpred1_Logo()) ) {
					alt1=1;
				}
				else if ( (true) ) {
					alt1=2;
				}

				}
				break;
			case CALL:
				{
				int LA1_19 = input.LA(2);
				if ( (synpred1_Logo()) ) {
					alt1=1;
				}
				else if ( (true) ) {
					alt1=2;
				}

				}
				break;
			case STOP:
				{
				int LA1_20 = input.LA(2);
				if ( (synpred1_Logo()) ) {
					alt1=1;
				}
				else if ( (true) ) {
					alt1=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// Logo.g:27:7: stat stats
					{
					pushFollow(FOLLOW_stat_in_stats148);
					stat3=stat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_stat.add(stat3.getTree());
					pushFollow(FOLLOW_stats_in_stats150);
					stats4=stats();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_stats.add(stats4.getTree());
					// AST REWRITE
					// elements: stat, stats
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 27:18: -> ^( COMPOUND stat stats )
					{
						// Logo.g:27:21: ^( COMPOUND stat stats )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMPOUND, "COMPOUND"), root_1);
						adaptor.addChild(root_1, stream_stat.nextTree());
						adaptor.addChild(root_1, stream_stats.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Logo.g:28:7: stat
					{
					pushFollow(FOLLOW_stat_in_stats168);
					stat5=stat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_stat.add(stat5.getTree());
					// AST REWRITE
					// elements: stat
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 28:12: -> ^( SIMPLE stat )
					{
						// Logo.g:28:15: ^( SIMPLE stat )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SIMPLE, "SIMPLE"), root_1);
						adaptor.addChild(root_1, stream_stat.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, stats_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "stats"


	public static class stat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// Logo.g:31:1: stat : ( FORWARD expr -> ^( FORWARD expr ) | RIGHT expr -> ^( RIGHT expr ) | LEFT expr -> ^( LEFT expr ) | BACK expr -> ^( BACK expr ) | PENUP -> ^( PENUP ) | PENDOWN -> ^( PENDOWN ) | REPEAT expr '[' stats ']' -> ^( REPEAT expr stats ) | MAKE '\"' VAR expr -> ^( MAKE VAR expr ) | LOCAL '\"' VAR -> ^( LOCAL VAR ) | CLEAR -> ^( CLEAR ) | IF bexpr '[' stats ']' -> ^( IF bexpr stats ) | SHOW | HIDE | SETPCRGB ^ expr expr expr | SETPENSIZE expr -> ^( SETPENSIZE expr ) | SETPOS ^ expr expr | SETH ^ expr | TO VAR params stats END -> ^( TO VAR params stats ) | CALL VAR exprs -> ^( CALL VAR exprs ) | STOP );
	public final LogoParser.stat_return stat() throws RecognitionException {
		LogoParser.stat_return retval = new LogoParser.stat_return();
		retval.start = input.LT(1);
		int stat_StartIndex = input.index();

		Object root_0 = null;

		Token FORWARD6=null;
		Token RIGHT8=null;
		Token LEFT10=null;
		Token BACK12=null;
		Token PENUP14=null;
		Token PENDOWN15=null;
		Token REPEAT16=null;
		Token char_literal18=null;
		Token char_literal20=null;
		Token MAKE21=null;
		Token char_literal22=null;
		Token VAR23=null;
		Token LOCAL25=null;
		Token char_literal26=null;
		Token VAR27=null;
		Token CLEAR28=null;
		Token IF29=null;
		Token char_literal31=null;
		Token char_literal33=null;
		Token SHOW34=null;
		Token HIDE35=null;
		Token SETPCRGB36=null;
		Token SETPENSIZE40=null;
		Token SETPOS42=null;
		Token SETH45=null;
		Token TO47=null;
		Token VAR48=null;
		Token END51=null;
		Token CALL52=null;
		Token VAR53=null;
		Token STOP55=null;
		ParserRuleReturnScope expr7 =null;
		ParserRuleReturnScope expr9 =null;
		ParserRuleReturnScope expr11 =null;
		ParserRuleReturnScope expr13 =null;
		ParserRuleReturnScope expr17 =null;
		ParserRuleReturnScope stats19 =null;
		ParserRuleReturnScope expr24 =null;
		ParserRuleReturnScope bexpr30 =null;
		ParserRuleReturnScope stats32 =null;
		ParserRuleReturnScope expr37 =null;
		ParserRuleReturnScope expr38 =null;
		ParserRuleReturnScope expr39 =null;
		ParserRuleReturnScope expr41 =null;
		ParserRuleReturnScope expr43 =null;
		ParserRuleReturnScope expr44 =null;
		ParserRuleReturnScope expr46 =null;
		ParserRuleReturnScope params49 =null;
		ParserRuleReturnScope stats50 =null;
		ParserRuleReturnScope exprs54 =null;

		Object FORWARD6_tree=null;
		Object RIGHT8_tree=null;
		Object LEFT10_tree=null;
		Object BACK12_tree=null;
		Object PENUP14_tree=null;
		Object PENDOWN15_tree=null;
		Object REPEAT16_tree=null;
		Object char_literal18_tree=null;
		Object char_literal20_tree=null;
		Object MAKE21_tree=null;
		Object char_literal22_tree=null;
		Object VAR23_tree=null;
		Object LOCAL25_tree=null;
		Object char_literal26_tree=null;
		Object VAR27_tree=null;
		Object CLEAR28_tree=null;
		Object IF29_tree=null;
		Object char_literal31_tree=null;
		Object char_literal33_tree=null;
		Object SHOW34_tree=null;
		Object HIDE35_tree=null;
		Object SETPCRGB36_tree=null;
		Object SETPENSIZE40_tree=null;
		Object SETPOS42_tree=null;
		Object SETH45_tree=null;
		Object TO47_tree=null;
		Object VAR48_tree=null;
		Object END51_tree=null;
		Object CALL52_tree=null;
		Object VAR53_tree=null;
		Object STOP55_tree=null;
		RewriteRuleTokenStream stream_CALL=new RewriteRuleTokenStream(adaptor,"token CALL");
		RewriteRuleTokenStream stream_LEFT=new RewriteRuleTokenStream(adaptor,"token LEFT");
		RewriteRuleTokenStream stream_REPEAT=new RewriteRuleTokenStream(adaptor,"token REPEAT");
		RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
		RewriteRuleTokenStream stream_PENDOWN=new RewriteRuleTokenStream(adaptor,"token PENDOWN");
		RewriteRuleTokenStream stream_FORWARD=new RewriteRuleTokenStream(adaptor,"token FORWARD");
		RewriteRuleTokenStream stream_MAKE=new RewriteRuleTokenStream(adaptor,"token MAKE");
		RewriteRuleTokenStream stream_PENUP=new RewriteRuleTokenStream(adaptor,"token PENUP");
		RewriteRuleTokenStream stream_LOCAL=new RewriteRuleTokenStream(adaptor,"token LOCAL");
		RewriteRuleTokenStream stream_RIGHT=new RewriteRuleTokenStream(adaptor,"token RIGHT");
		RewriteRuleTokenStream stream_BACK=new RewriteRuleTokenStream(adaptor,"token BACK");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_CLEAR=new RewriteRuleTokenStream(adaptor,"token CLEAR");
		RewriteRuleTokenStream stream_SETPENSIZE=new RewriteRuleTokenStream(adaptor,"token SETPENSIZE");
		RewriteRuleSubtreeStream stream_bexpr=new RewriteRuleSubtreeStream(adaptor,"rule bexpr");
		RewriteRuleSubtreeStream stream_stats=new RewriteRuleSubtreeStream(adaptor,"rule stats");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// Logo.g:31:6: ( FORWARD expr -> ^( FORWARD expr ) | RIGHT expr -> ^( RIGHT expr ) | LEFT expr -> ^( LEFT expr ) | BACK expr -> ^( BACK expr ) | PENUP -> ^( PENUP ) | PENDOWN -> ^( PENDOWN ) | REPEAT expr '[' stats ']' -> ^( REPEAT expr stats ) | MAKE '\"' VAR expr -> ^( MAKE VAR expr ) | LOCAL '\"' VAR -> ^( LOCAL VAR ) | CLEAR -> ^( CLEAR ) | IF bexpr '[' stats ']' -> ^( IF bexpr stats ) | SHOW | HIDE | SETPCRGB ^ expr expr expr | SETPENSIZE expr -> ^( SETPENSIZE expr ) | SETPOS ^ expr expr | SETH ^ expr | TO VAR params stats END -> ^( TO VAR params stats ) | CALL VAR exprs -> ^( CALL VAR exprs ) | STOP )
			int alt2=20;
			switch ( input.LA(1) ) {
			case FORWARD:
				{
				alt2=1;
				}
				break;
			case RIGHT:
				{
				alt2=2;
				}
				break;
			case LEFT:
				{
				alt2=3;
				}
				break;
			case BACK:
				{
				alt2=4;
				}
				break;
			case PENUP:
				{
				alt2=5;
				}
				break;
			case PENDOWN:
				{
				alt2=6;
				}
				break;
			case REPEAT:
				{
				alt2=7;
				}
				break;
			case MAKE:
				{
				alt2=8;
				}
				break;
			case LOCAL:
				{
				alt2=9;
				}
				break;
			case CLEAR:
				{
				alt2=10;
				}
				break;
			case IF:
				{
				alt2=11;
				}
				break;
			case SHOW:
				{
				alt2=12;
				}
				break;
			case HIDE:
				{
				alt2=13;
				}
				break;
			case SETPCRGB:
				{
				alt2=14;
				}
				break;
			case SETPENSIZE:
				{
				alt2=15;
				}
				break;
			case SETPOS:
				{
				alt2=16;
				}
				break;
			case SETH:
				{
				alt2=17;
				}
				break;
			case TO:
				{
				alt2=18;
				}
				break;
			case CALL:
				{
				alt2=19;
				}
				break;
			case STOP:
				{
				alt2=20;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// Logo.g:32:7: FORWARD expr
					{
					FORWARD6=(Token)match(input,FORWARD,FOLLOW_FORWARD_in_stat195); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FORWARD.add(FORWARD6);

					pushFollow(FOLLOW_expr_in_stat197);
					expr7=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr7.getTree());
					// AST REWRITE
					// elements: FORWARD, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 32:20: -> ^( FORWARD expr )
					{
						// Logo.g:32:23: ^( FORWARD expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_FORWARD.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Logo.g:33:7: RIGHT expr
					{
					RIGHT8=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_stat213); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT.add(RIGHT8);

					pushFollow(FOLLOW_expr_in_stat215);
					expr9=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr9.getTree());
					// AST REWRITE
					// elements: RIGHT, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 33:18: -> ^( RIGHT expr )
					{
						// Logo.g:33:21: ^( RIGHT expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_RIGHT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Logo.g:34:7: LEFT expr
					{
					LEFT10=(Token)match(input,LEFT,FOLLOW_LEFT_in_stat231); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT.add(LEFT10);

					pushFollow(FOLLOW_expr_in_stat233);
					expr11=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr11.getTree());
					// AST REWRITE
					// elements: LEFT, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 34:17: -> ^( LEFT expr )
					{
						// Logo.g:34:20: ^( LEFT expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_LEFT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// Logo.g:35:7: BACK expr
					{
					BACK12=(Token)match(input,BACK,FOLLOW_BACK_in_stat249); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BACK.add(BACK12);

					pushFollow(FOLLOW_expr_in_stat251);
					expr13=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr13.getTree());
					// AST REWRITE
					// elements: BACK, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 35:17: -> ^( BACK expr )
					{
						// Logo.g:35:20: ^( BACK expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_BACK.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// Logo.g:36:7: PENUP
					{
					PENUP14=(Token)match(input,PENUP,FOLLOW_PENUP_in_stat267); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PENUP.add(PENUP14);

					// AST REWRITE
					// elements: PENUP
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 36:13: -> ^( PENUP )
					{
						// Logo.g:36:16: ^( PENUP )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_PENUP.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// Logo.g:37:7: PENDOWN
					{
					PENDOWN15=(Token)match(input,PENDOWN,FOLLOW_PENDOWN_in_stat281); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PENDOWN.add(PENDOWN15);

					// AST REWRITE
					// elements: PENDOWN
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 37:15: -> ^( PENDOWN )
					{
						// Logo.g:37:18: ^( PENDOWN )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_PENDOWN.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// Logo.g:38:7: REPEAT expr '[' stats ']'
					{
					REPEAT16=(Token)match(input,REPEAT,FOLLOW_REPEAT_in_stat295); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_REPEAT.add(REPEAT16);

					pushFollow(FOLLOW_expr_in_stat297);
					expr17=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr17.getTree());
					char_literal18=(Token)match(input,50,FOLLOW_50_in_stat299); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_50.add(char_literal18);

					pushFollow(FOLLOW_stats_in_stat301);
					stats19=stats();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_stats.add(stats19.getTree());
					char_literal20=(Token)match(input,51,FOLLOW_51_in_stat303); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_51.add(char_literal20);

					// AST REWRITE
					// elements: expr, REPEAT, stats
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 38:33: -> ^( REPEAT expr stats )
					{
						// Logo.g:38:36: ^( REPEAT expr stats )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_REPEAT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_1, stream_stats.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					// Logo.g:39:7: MAKE '\"' VAR expr
					{
					MAKE21=(Token)match(input,MAKE,FOLLOW_MAKE_in_stat321); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MAKE.add(MAKE21);

					char_literal22=(Token)match(input,42,FOLLOW_42_in_stat323); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_42.add(char_literal22);

					VAR23=(Token)match(input,VAR,FOLLOW_VAR_in_stat325); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VAR.add(VAR23);

					pushFollow(FOLLOW_expr_in_stat327);
					expr24=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr24.getTree());
					// AST REWRITE
					// elements: expr, MAKE, VAR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 39:25: -> ^( MAKE VAR expr )
					{
						// Logo.g:39:28: ^( MAKE VAR expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_MAKE.nextNode(), root_1);
						adaptor.addChild(root_1, stream_VAR.nextNode());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 9 :
					// Logo.g:40:7: LOCAL '\"' VAR
					{
					LOCAL25=(Token)match(input,LOCAL,FOLLOW_LOCAL_in_stat345); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LOCAL.add(LOCAL25);

					char_literal26=(Token)match(input,42,FOLLOW_42_in_stat347); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_42.add(char_literal26);

					VAR27=(Token)match(input,VAR,FOLLOW_VAR_in_stat349); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VAR.add(VAR27);

					// AST REWRITE
					// elements: VAR, LOCAL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 40:21: -> ^( LOCAL VAR )
					{
						// Logo.g:40:24: ^( LOCAL VAR )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_LOCAL.nextNode(), root_1);
						adaptor.addChild(root_1, stream_VAR.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 10 :
					// Logo.g:41:7: CLEAR
					{
					CLEAR28=(Token)match(input,CLEAR,FOLLOW_CLEAR_in_stat365); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CLEAR.add(CLEAR28);

					// AST REWRITE
					// elements: CLEAR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 41:13: -> ^( CLEAR )
					{
						// Logo.g:41:16: ^( CLEAR )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_CLEAR.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 11 :
					// Logo.g:42:7: IF bexpr '[' stats ']'
					{
					IF29=(Token)match(input,IF,FOLLOW_IF_in_stat379); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IF.add(IF29);

					pushFollow(FOLLOW_bexpr_in_stat381);
					bexpr30=bexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_bexpr.add(bexpr30.getTree());
					char_literal31=(Token)match(input,50,FOLLOW_50_in_stat383); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_50.add(char_literal31);

					pushFollow(FOLLOW_stats_in_stat385);
					stats32=stats();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_stats.add(stats32.getTree());
					char_literal33=(Token)match(input,51,FOLLOW_51_in_stat387); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_51.add(char_literal33);

					// AST REWRITE
					// elements: stats, IF, bexpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 42:30: -> ^( IF bexpr stats )
					{
						// Logo.g:42:33: ^( IF bexpr stats )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
						adaptor.addChild(root_1, stream_bexpr.nextTree());
						adaptor.addChild(root_1, stream_stats.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 12 :
					// Logo.g:43:7: SHOW
					{
					root_0 = (Object)adaptor.nil();


					SHOW34=(Token)match(input,SHOW,FOLLOW_SHOW_in_stat405); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SHOW34_tree = (Object)adaptor.create(SHOW34);
					adaptor.addChild(root_0, SHOW34_tree);
					}

					}
					break;
				case 13 :
					// Logo.g:44:7: HIDE
					{
					root_0 = (Object)adaptor.nil();


					HIDE35=(Token)match(input,HIDE,FOLLOW_HIDE_in_stat413); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					HIDE35_tree = (Object)adaptor.create(HIDE35);
					adaptor.addChild(root_0, HIDE35_tree);
					}

					}
					break;
				case 14 :
					// Logo.g:45:7: SETPCRGB ^ expr expr expr
					{
					root_0 = (Object)adaptor.nil();


					SETPCRGB36=(Token)match(input,SETPCRGB,FOLLOW_SETPCRGB_in_stat421); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SETPCRGB36_tree = (Object)adaptor.create(SETPCRGB36);
					root_0 = (Object)adaptor.becomeRoot(SETPCRGB36_tree, root_0);
					}

					pushFollow(FOLLOW_expr_in_stat424);
					expr37=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr37.getTree());

					pushFollow(FOLLOW_expr_in_stat426);
					expr38=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr38.getTree());

					pushFollow(FOLLOW_expr_in_stat428);
					expr39=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr39.getTree());

					}
					break;
				case 15 :
					// Logo.g:46:7: SETPENSIZE expr
					{
					SETPENSIZE40=(Token)match(input,SETPENSIZE,FOLLOW_SETPENSIZE_in_stat436); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SETPENSIZE.add(SETPENSIZE40);

					pushFollow(FOLLOW_expr_in_stat438);
					expr41=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr41.getTree());
					// AST REWRITE
					// elements: expr, SETPENSIZE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 46:23: -> ^( SETPENSIZE expr )
					{
						// Logo.g:46:26: ^( SETPENSIZE expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_SETPENSIZE.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 16 :
					// Logo.g:47:7: SETPOS ^ expr expr
					{
					root_0 = (Object)adaptor.nil();


					SETPOS42=(Token)match(input,SETPOS,FOLLOW_SETPOS_in_stat454); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SETPOS42_tree = (Object)adaptor.create(SETPOS42);
					root_0 = (Object)adaptor.becomeRoot(SETPOS42_tree, root_0);
					}

					pushFollow(FOLLOW_expr_in_stat457);
					expr43=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr43.getTree());

					pushFollow(FOLLOW_expr_in_stat459);
					expr44=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr44.getTree());

					}
					break;
				case 17 :
					// Logo.g:48:7: SETH ^ expr
					{
					root_0 = (Object)adaptor.nil();


					SETH45=(Token)match(input,SETH,FOLLOW_SETH_in_stat467); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SETH45_tree = (Object)adaptor.create(SETH45);
					root_0 = (Object)adaptor.becomeRoot(SETH45_tree, root_0);
					}

					pushFollow(FOLLOW_expr_in_stat470);
					expr46=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr46.getTree());

					}
					break;
				case 18 :
					// Logo.g:49:7: TO VAR params stats END
					{
					TO47=(Token)match(input,TO,FOLLOW_TO_in_stat478); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TO.add(TO47);

					VAR48=(Token)match(input,VAR,FOLLOW_VAR_in_stat480); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VAR.add(VAR48);

					pushFollow(FOLLOW_params_in_stat482);
					params49=params();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_params.add(params49.getTree());
					pushFollow(FOLLOW_stats_in_stat484);
					stats50=stats();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_stats.add(stats50.getTree());
					END51=(Token)match(input,END,FOLLOW_END_in_stat486); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_END.add(END51);

					// AST REWRITE
					// elements: TO, stats, params, VAR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 49:31: -> ^( TO VAR params stats )
					{
						// Logo.g:49:34: ^( TO VAR params stats )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_TO.nextNode(), root_1);
						adaptor.addChild(root_1, stream_VAR.nextNode());
						adaptor.addChild(root_1, stream_params.nextTree());
						adaptor.addChild(root_1, stream_stats.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 19 :
					// Logo.g:50:7: CALL VAR exprs
					{
					CALL52=(Token)match(input,CALL,FOLLOW_CALL_in_stat506); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CALL.add(CALL52);

					VAR53=(Token)match(input,VAR,FOLLOW_VAR_in_stat508); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VAR.add(VAR53);

					pushFollow(FOLLOW_exprs_in_stat510);
					exprs54=exprs();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_exprs.add(exprs54.getTree());
					// AST REWRITE
					// elements: VAR, CALL, exprs
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 50:22: -> ^( CALL VAR exprs )
					{
						// Logo.g:50:25: ^( CALL VAR exprs )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_CALL.nextNode(), root_1);
						adaptor.addChild(root_1, stream_VAR.nextNode());
						adaptor.addChild(root_1, stream_exprs.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 20 :
					// Logo.g:51:7: STOP
					{
					root_0 = (Object)adaptor.nil();


					STOP55=(Token)match(input,STOP,FOLLOW_STOP_in_stat528); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STOP55_tree = (Object)adaptor.create(STOP55);
					adaptor.addChild(root_0, STOP55_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, stat_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class params_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "params"
	// Logo.g:54:1: params : ( ':' VAR )* -> ^( LST ( VAR )* ) ;
	public final LogoParser.params_return params() throws RecognitionException {
		LogoParser.params_return retval = new LogoParser.params_return();
		retval.start = input.LT(1);
		int params_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal56=null;
		Token VAR57=null;

		Object char_literal56_tree=null;
		Object VAR57_tree=null;
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// Logo.g:54:8: ( ( ':' VAR )* -> ^( LST ( VAR )* ) )
			// Logo.g:55:5: ( ':' VAR )*
			{
			// Logo.g:55:5: ( ':' VAR )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==49) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Logo.g:55:6: ':' VAR
					{
					char_literal56=(Token)match(input,49,FOLLOW_49_in_params546); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_49.add(char_literal56);

					VAR57=(Token)match(input,VAR,FOLLOW_VAR_in_params548); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VAR.add(VAR57);

					}
					break;

				default :
					break loop3;
				}
			}

			// AST REWRITE
			// elements: VAR
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 55:16: -> ^( LST ( VAR )* )
			{
				// Logo.g:55:19: ^( LST ( VAR )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LST, "LST"), root_1);
				// Logo.g:55:25: ( VAR )*
				while ( stream_VAR.hasNext() ) {
					adaptor.addChild(root_1, stream_VAR.nextNode());
				}
				stream_VAR.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, params_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "params"


	public static class exprs_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprs"
	// Logo.g:58:1: exprs : ( expr )* -> ^( LST ( expr )* ) ;
	public final LogoParser.exprs_return exprs() throws RecognitionException {
		LogoParser.exprs_return retval = new LogoParser.exprs_return();
		retval.start = input.LT(1);
		int exprs_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope expr58 =null;

		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// Logo.g:58:7: ( ( expr )* -> ^( LST ( expr )* ) )
			// Logo.g:59:5: ( expr )*
			{
			// Logo.g:59:5: ( expr )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==NUM||LA4_0==REPCOUNT||LA4_0==43||LA4_0==47||LA4_0==49) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Logo.g:59:5: expr
					{
					pushFollow(FOLLOW_expr_in_exprs576);
					expr58=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr58.getTree());
					}
					break;

				default :
					break loop4;
				}
			}

			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 59:11: -> ^( LST ( expr )* )
			{
				// Logo.g:59:14: ^( LST ( expr )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LST, "LST"), root_1);
				// Logo.g:59:20: ( expr )*
				while ( stream_expr.hasNext() ) {
					adaptor.addChild(root_1, stream_expr.nextTree());
				}
				stream_expr.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, exprs_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "exprs"


	public static class bexpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bexpr"
	// Logo.g:62:1: bexpr : ( expr EQ ^ expr | expr NEQ ^ expr | expr LESS ^ expr | expr GREATER ^ expr );
	public final LogoParser.bexpr_return bexpr() throws RecognitionException {
		LogoParser.bexpr_return retval = new LogoParser.bexpr_return();
		retval.start = input.LT(1);
		int bexpr_StartIndex = input.index();

		Object root_0 = null;

		Token EQ60=null;
		Token NEQ63=null;
		Token LESS66=null;
		Token GREATER69=null;
		ParserRuleReturnScope expr59 =null;
		ParserRuleReturnScope expr61 =null;
		ParserRuleReturnScope expr62 =null;
		ParserRuleReturnScope expr64 =null;
		ParserRuleReturnScope expr65 =null;
		ParserRuleReturnScope expr67 =null;
		ParserRuleReturnScope expr68 =null;
		ParserRuleReturnScope expr70 =null;

		Object EQ60_tree=null;
		Object NEQ63_tree=null;
		Object LESS66_tree=null;
		Object GREATER69_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// Logo.g:62:7: ( expr EQ ^ expr | expr NEQ ^ expr | expr LESS ^ expr | expr GREATER ^ expr )
			int alt5=4;
			switch ( input.LA(1) ) {
			case NUM:
				{
				int LA5_1 = input.LA(2);
				if ( (synpred23_Logo()) ) {
					alt5=1;
				}
				else if ( (synpred24_Logo()) ) {
					alt5=2;
				}
				else if ( (synpred25_Logo()) ) {
					alt5=3;
				}
				else if ( (true) ) {
					alt5=4;
				}

				}
				break;
			case 43:
				{
				int LA5_2 = input.LA(2);
				if ( (synpred23_Logo()) ) {
					alt5=1;
				}
				else if ( (synpred24_Logo()) ) {
					alt5=2;
				}
				else if ( (synpred25_Logo()) ) {
					alt5=3;
				}
				else if ( (true) ) {
					alt5=4;
				}

				}
				break;
			case 47:
				{
				int LA5_3 = input.LA(2);
				if ( (synpred23_Logo()) ) {
					alt5=1;
				}
				else if ( (synpred24_Logo()) ) {
					alt5=2;
				}
				else if ( (synpred25_Logo()) ) {
					alt5=3;
				}
				else if ( (true) ) {
					alt5=4;
				}

				}
				break;
			case REPCOUNT:
				{
				int LA5_4 = input.LA(2);
				if ( (synpred23_Logo()) ) {
					alt5=1;
				}
				else if ( (synpred24_Logo()) ) {
					alt5=2;
				}
				else if ( (synpred25_Logo()) ) {
					alt5=3;
				}
				else if ( (true) ) {
					alt5=4;
				}

				}
				break;
			case 49:
				{
				int LA5_5 = input.LA(2);
				if ( (synpred23_Logo()) ) {
					alt5=1;
				}
				else if ( (synpred24_Logo()) ) {
					alt5=2;
				}
				else if ( (synpred25_Logo()) ) {
					alt5=3;
				}
				else if ( (true) ) {
					alt5=4;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// Logo.g:63:7: expr EQ ^ expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_in_bexpr605);
					expr59=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr59.getTree());

					EQ60=(Token)match(input,EQ,FOLLOW_EQ_in_bexpr607); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EQ60_tree = (Object)adaptor.create(EQ60);
					root_0 = (Object)adaptor.becomeRoot(EQ60_tree, root_0);
					}

					pushFollow(FOLLOW_expr_in_bexpr610);
					expr61=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr61.getTree());

					}
					break;
				case 2 :
					// Logo.g:64:7: expr NEQ ^ expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_in_bexpr618);
					expr62=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr62.getTree());

					NEQ63=(Token)match(input,NEQ,FOLLOW_NEQ_in_bexpr620); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NEQ63_tree = (Object)adaptor.create(NEQ63);
					root_0 = (Object)adaptor.becomeRoot(NEQ63_tree, root_0);
					}

					pushFollow(FOLLOW_expr_in_bexpr623);
					expr64=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr64.getTree());

					}
					break;
				case 3 :
					// Logo.g:65:7: expr LESS ^ expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_in_bexpr631);
					expr65=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr65.getTree());

					LESS66=(Token)match(input,LESS,FOLLOW_LESS_in_bexpr633); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LESS66_tree = (Object)adaptor.create(LESS66);
					root_0 = (Object)adaptor.becomeRoot(LESS66_tree, root_0);
					}

					pushFollow(FOLLOW_expr_in_bexpr636);
					expr67=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr67.getTree());

					}
					break;
				case 4 :
					// Logo.g:66:7: expr GREATER ^ expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_in_bexpr644);
					expr68=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr68.getTree());

					GREATER69=(Token)match(input,GREATER,FOLLOW_GREATER_in_bexpr646); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					GREATER69_tree = (Object)adaptor.create(GREATER69);
					root_0 = (Object)adaptor.becomeRoot(GREATER69_tree, root_0);
					}

					pushFollow(FOLLOW_expr_in_bexpr649);
					expr70=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr70.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, bexpr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bexpr"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// Logo.g:69:1: expr : ( multExpr '+' expr -> ^( PLUS multExpr expr ) | multExpr '-' expr -> ^( MINUS multExpr expr ) | multExpr -> multExpr );
	public final LogoParser.expr_return expr() throws RecognitionException {
		LogoParser.expr_return retval = new LogoParser.expr_return();
		retval.start = input.LT(1);
		int expr_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal72=null;
		Token char_literal75=null;
		ParserRuleReturnScope multExpr71 =null;
		ParserRuleReturnScope expr73 =null;
		ParserRuleReturnScope multExpr74 =null;
		ParserRuleReturnScope expr76 =null;
		ParserRuleReturnScope multExpr77 =null;

		Object char_literal72_tree=null;
		Object char_literal75_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_multExpr=new RewriteRuleSubtreeStream(adaptor,"rule multExpr");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// Logo.g:69:6: ( multExpr '+' expr -> ^( PLUS multExpr expr ) | multExpr '-' expr -> ^( MINUS multExpr expr ) | multExpr -> multExpr )
			int alt6=3;
			switch ( input.LA(1) ) {
			case NUM:
				{
				int LA6_1 = input.LA(2);
				if ( (synpred26_Logo()) ) {
					alt6=1;
				}
				else if ( (synpred27_Logo()) ) {
					alt6=2;
				}
				else if ( (true) ) {
					alt6=3;
				}

				}
				break;
			case 43:
				{
				int LA6_2 = input.LA(2);
				if ( (synpred26_Logo()) ) {
					alt6=1;
				}
				else if ( (synpred27_Logo()) ) {
					alt6=2;
				}
				else if ( (true) ) {
					alt6=3;
				}

				}
				break;
			case 47:
				{
				int LA6_3 = input.LA(2);
				if ( (synpred26_Logo()) ) {
					alt6=1;
				}
				else if ( (synpred27_Logo()) ) {
					alt6=2;
				}
				else if ( (true) ) {
					alt6=3;
				}

				}
				break;
			case REPCOUNT:
				{
				int LA6_4 = input.LA(2);
				if ( (synpred26_Logo()) ) {
					alt6=1;
				}
				else if ( (synpred27_Logo()) ) {
					alt6=2;
				}
				else if ( (true) ) {
					alt6=3;
				}

				}
				break;
			case 49:
				{
				int LA6_5 = input.LA(2);
				if ( (synpred26_Logo()) ) {
					alt6=1;
				}
				else if ( (synpred27_Logo()) ) {
					alt6=2;
				}
				else if ( (true) ) {
					alt6=3;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// Logo.g:70:4: multExpr '+' expr
					{
					pushFollow(FOLLOW_multExpr_in_expr665);
					multExpr71=multExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_multExpr.add(multExpr71.getTree());
					char_literal72=(Token)match(input,46,FOLLOW_46_in_expr667); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_46.add(char_literal72);

					pushFollow(FOLLOW_expr_in_expr669);
					expr73=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr73.getTree());
					// AST REWRITE
					// elements: expr, multExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 70:22: -> ^( PLUS multExpr expr )
					{
						// Logo.g:70:25: ^( PLUS multExpr expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLUS, "PLUS"), root_1);
						adaptor.addChild(root_1, stream_multExpr.nextTree());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Logo.g:71:7: multExpr '-' expr
					{
					pushFollow(FOLLOW_multExpr_in_expr687);
					multExpr74=multExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_multExpr.add(multExpr74.getTree());
					char_literal75=(Token)match(input,47,FOLLOW_47_in_expr689); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_47.add(char_literal75);

					pushFollow(FOLLOW_expr_in_expr691);
					expr76=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr76.getTree());
					// AST REWRITE
					// elements: expr, multExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 71:25: -> ^( MINUS multExpr expr )
					{
						// Logo.g:71:28: ^( MINUS multExpr expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUS, "MINUS"), root_1);
						adaptor.addChild(root_1, stream_multExpr.nextTree());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Logo.g:72:4: multExpr
					{
					pushFollow(FOLLOW_multExpr_in_expr706);
					multExpr77=multExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_multExpr.add(multExpr77.getTree());
					// AST REWRITE
					// elements: multExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 72:13: -> multExpr
					{
						adaptor.addChild(root_0, stream_multExpr.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, expr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class multExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multExpr"
	// Logo.g:75:1: multExpr : ( atom '*' multExpr -> ^( MULT atom multExpr ) | atom '/' multExpr -> ^( DIV atom multExpr ) | atom -> atom );
	public final LogoParser.multExpr_return multExpr() throws RecognitionException {
		LogoParser.multExpr_return retval = new LogoParser.multExpr_return();
		retval.start = input.LT(1);
		int multExpr_StartIndex = input.index();

		Object root_0 = null;

		Token char_literal79=null;
		Token char_literal82=null;
		ParserRuleReturnScope atom78 =null;
		ParserRuleReturnScope multExpr80 =null;
		ParserRuleReturnScope atom81 =null;
		ParserRuleReturnScope multExpr83 =null;
		ParserRuleReturnScope atom84 =null;

		Object char_literal79_tree=null;
		Object char_literal82_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
		RewriteRuleSubtreeStream stream_multExpr=new RewriteRuleSubtreeStream(adaptor,"rule multExpr");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// Logo.g:75:10: ( atom '*' multExpr -> ^( MULT atom multExpr ) | atom '/' multExpr -> ^( DIV atom multExpr ) | atom -> atom )
			int alt7=3;
			switch ( input.LA(1) ) {
			case NUM:
				{
				int LA7_1 = input.LA(2);
				if ( (synpred28_Logo()) ) {
					alt7=1;
				}
				else if ( (synpred29_Logo()) ) {
					alt7=2;
				}
				else if ( (true) ) {
					alt7=3;
				}

				}
				break;
			case 43:
				{
				int LA7_2 = input.LA(2);
				if ( (synpred28_Logo()) ) {
					alt7=1;
				}
				else if ( (synpred29_Logo()) ) {
					alt7=2;
				}
				else if ( (true) ) {
					alt7=3;
				}

				}
				break;
			case 47:
				{
				int LA7_3 = input.LA(2);
				if ( (synpred28_Logo()) ) {
					alt7=1;
				}
				else if ( (synpred29_Logo()) ) {
					alt7=2;
				}
				else if ( (true) ) {
					alt7=3;
				}

				}
				break;
			case REPCOUNT:
				{
				int LA7_4 = input.LA(2);
				if ( (synpred28_Logo()) ) {
					alt7=1;
				}
				else if ( (synpred29_Logo()) ) {
					alt7=2;
				}
				else if ( (true) ) {
					alt7=3;
				}

				}
				break;
			case 49:
				{
				int LA7_5 = input.LA(2);
				if ( (synpred28_Logo()) ) {
					alt7=1;
				}
				else if ( (synpred29_Logo()) ) {
					alt7=2;
				}
				else if ( (true) ) {
					alt7=3;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// Logo.g:76:4: atom '*' multExpr
					{
					pushFollow(FOLLOW_atom_in_multExpr723);
					atom78=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_atom.add(atom78.getTree());
					char_literal79=(Token)match(input,45,FOLLOW_45_in_multExpr725); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_45.add(char_literal79);

					pushFollow(FOLLOW_multExpr_in_multExpr727);
					multExpr80=multExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_multExpr.add(multExpr80.getTree());
					// AST REWRITE
					// elements: atom, multExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 76:22: -> ^( MULT atom multExpr )
					{
						// Logo.g:76:25: ^( MULT atom multExpr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MULT, "MULT"), root_1);
						adaptor.addChild(root_1, stream_atom.nextTree());
						adaptor.addChild(root_1, stream_multExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Logo.g:77:7: atom '/' multExpr
					{
					pushFollow(FOLLOW_atom_in_multExpr745);
					atom81=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_atom.add(atom81.getTree());
					char_literal82=(Token)match(input,48,FOLLOW_48_in_multExpr747); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_48.add(char_literal82);

					pushFollow(FOLLOW_multExpr_in_multExpr749);
					multExpr83=multExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_multExpr.add(multExpr83.getTree());
					// AST REWRITE
					// elements: multExpr, atom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 77:25: -> ^( DIV atom multExpr )
					{
						// Logo.g:77:28: ^( DIV atom multExpr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DIV, "DIV"), root_1);
						adaptor.addChild(root_1, stream_atom.nextTree());
						adaptor.addChild(root_1, stream_multExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Logo.g:78:4: atom
					{
					pushFollow(FOLLOW_atom_in_multExpr764);
					atom84=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_atom.add(atom84.getTree());
					// AST REWRITE
					// elements: atom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 78:9: -> atom
					{
						adaptor.addChild(root_0, stream_atom.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, multExpr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "multExpr"


	public static class atom_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// Logo.g:81:1: atom : ( NUM -> ^( NUM ) | '(' expr ')' -> expr | '-' atom -> ^( NEG atom ) | REPCOUNT -> REPCOUNT | ':' VAR -> ^( VAR ) );
	public final LogoParser.atom_return atom() throws RecognitionException {
		LogoParser.atom_return retval = new LogoParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		Object root_0 = null;

		Token NUM85=null;
		Token char_literal86=null;
		Token char_literal88=null;
		Token char_literal89=null;
		Token REPCOUNT91=null;
		Token char_literal92=null;
		Token VAR93=null;
		ParserRuleReturnScope expr87 =null;
		ParserRuleReturnScope atom90 =null;

		Object NUM85_tree=null;
		Object char_literal86_tree=null;
		Object char_literal88_tree=null;
		Object char_literal89_tree=null;
		Object REPCOUNT91_tree=null;
		Object char_literal92_tree=null;
		Object VAR93_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_REPCOUNT=new RewriteRuleTokenStream(adaptor,"token REPCOUNT");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
		RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// Logo.g:81:6: ( NUM -> ^( NUM ) | '(' expr ')' -> expr | '-' atom -> ^( NEG atom ) | REPCOUNT -> REPCOUNT | ':' VAR -> ^( VAR ) )
			int alt8=5;
			switch ( input.LA(1) ) {
			case NUM:
				{
				alt8=1;
				}
				break;
			case 43:
				{
				alt8=2;
				}
				break;
			case 47:
				{
				alt8=3;
				}
				break;
			case REPCOUNT:
				{
				alt8=4;
				}
				break;
			case 49:
				{
				alt8=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// Logo.g:82:4: NUM
					{
					NUM85=(Token)match(input,NUM,FOLLOW_NUM_in_atom781); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NUM.add(NUM85);

					// AST REWRITE
					// elements: NUM
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 82:8: -> ^( NUM )
					{
						// Logo.g:82:11: ^( NUM )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_NUM.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Logo.g:83:4: '(' expr ')'
					{
					char_literal86=(Token)match(input,43,FOLLOW_43_in_atom792); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_43.add(char_literal86);

					pushFollow(FOLLOW_expr_in_atom794);
					expr87=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr87.getTree());
					char_literal88=(Token)match(input,44,FOLLOW_44_in_atom796); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_44.add(char_literal88);

					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 83:17: -> expr
					{
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Logo.g:84:4: '-' atom
					{
					char_literal89=(Token)match(input,47,FOLLOW_47_in_atom805); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_47.add(char_literal89);

					pushFollow(FOLLOW_atom_in_atom807);
					atom90=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_atom.add(atom90.getTree());
					// AST REWRITE
					// elements: atom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 84:13: -> ^( NEG atom )
					{
						// Logo.g:84:16: ^( NEG atom )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEG, "NEG"), root_1);
						adaptor.addChild(root_1, stream_atom.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// Logo.g:85:7: REPCOUNT
					{
					REPCOUNT91=(Token)match(input,REPCOUNT,FOLLOW_REPCOUNT_in_atom823); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_REPCOUNT.add(REPCOUNT91);

					// AST REWRITE
					// elements: REPCOUNT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 85:16: -> REPCOUNT
					{
						adaptor.addChild(root_0, stream_REPCOUNT.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// Logo.g:86:7: ':' VAR
					{
					char_literal92=(Token)match(input,49,FOLLOW_49_in_atom835); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_49.add(char_literal92);

					VAR93=(Token)match(input,VAR,FOLLOW_VAR_in_atom837); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VAR.add(VAR93);

					// AST REWRITE
					// elements: VAR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 86:15: -> ^( VAR )
					{
						// Logo.g:86:18: ^( VAR )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, atom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "atom"

	// $ANTLR start synpred1_Logo
	public final void synpred1_Logo_fragment() throws RecognitionException {
		// Logo.g:27:7: ( stat stats )
		// Logo.g:27:7: stat stats
		{
		pushFollow(FOLLOW_stat_in_synpred1_Logo148);
		stat();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_stats_in_synpred1_Logo150);
		stats();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_Logo

	// $ANTLR start synpred23_Logo
	public final void synpred23_Logo_fragment() throws RecognitionException {
		// Logo.g:63:7: ( expr EQ expr )
		// Logo.g:63:7: expr EQ expr
		{
		pushFollow(FOLLOW_expr_in_synpred23_Logo605);
		expr();
		state._fsp--;
		if (state.failed) return;

		match(input,EQ,FOLLOW_EQ_in_synpred23_Logo607); if (state.failed) return;

		pushFollow(FOLLOW_expr_in_synpred23_Logo610);
		expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred23_Logo

	// $ANTLR start synpred24_Logo
	public final void synpred24_Logo_fragment() throws RecognitionException {
		// Logo.g:64:7: ( expr NEQ expr )
		// Logo.g:64:7: expr NEQ expr
		{
		pushFollow(FOLLOW_expr_in_synpred24_Logo618);
		expr();
		state._fsp--;
		if (state.failed) return;

		match(input,NEQ,FOLLOW_NEQ_in_synpred24_Logo620); if (state.failed) return;

		pushFollow(FOLLOW_expr_in_synpred24_Logo623);
		expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred24_Logo

	// $ANTLR start synpred25_Logo
	public final void synpred25_Logo_fragment() throws RecognitionException {
		// Logo.g:65:7: ( expr LESS expr )
		// Logo.g:65:7: expr LESS expr
		{
		pushFollow(FOLLOW_expr_in_synpred25_Logo631);
		expr();
		state._fsp--;
		if (state.failed) return;

		match(input,LESS,FOLLOW_LESS_in_synpred25_Logo633); if (state.failed) return;

		pushFollow(FOLLOW_expr_in_synpred25_Logo636);
		expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred25_Logo

	// $ANTLR start synpred26_Logo
	public final void synpred26_Logo_fragment() throws RecognitionException {
		// Logo.g:70:4: ( multExpr '+' expr )
		// Logo.g:70:4: multExpr '+' expr
		{
		pushFollow(FOLLOW_multExpr_in_synpred26_Logo665);
		multExpr();
		state._fsp--;
		if (state.failed) return;

		match(input,46,FOLLOW_46_in_synpred26_Logo667); if (state.failed) return;

		pushFollow(FOLLOW_expr_in_synpred26_Logo669);
		expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred26_Logo

	// $ANTLR start synpred27_Logo
	public final void synpred27_Logo_fragment() throws RecognitionException {
		// Logo.g:71:7: ( multExpr '-' expr )
		// Logo.g:71:7: multExpr '-' expr
		{
		pushFollow(FOLLOW_multExpr_in_synpred27_Logo687);
		multExpr();
		state._fsp--;
		if (state.failed) return;

		match(input,47,FOLLOW_47_in_synpred27_Logo689); if (state.failed) return;

		pushFollow(FOLLOW_expr_in_synpred27_Logo691);
		expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred27_Logo

	// $ANTLR start synpred28_Logo
	public final void synpred28_Logo_fragment() throws RecognitionException {
		// Logo.g:76:4: ( atom '*' multExpr )
		// Logo.g:76:4: atom '*' multExpr
		{
		pushFollow(FOLLOW_atom_in_synpred28_Logo723);
		atom();
		state._fsp--;
		if (state.failed) return;

		match(input,45,FOLLOW_45_in_synpred28_Logo725); if (state.failed) return;

		pushFollow(FOLLOW_multExpr_in_synpred28_Logo727);
		multExpr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred28_Logo

	// $ANTLR start synpred29_Logo
	public final void synpred29_Logo_fragment() throws RecognitionException {
		// Logo.g:77:7: ( atom '/' multExpr )
		// Logo.g:77:7: atom '/' multExpr
		{
		pushFollow(FOLLOW_atom_in_synpred29_Logo745);
		atom();
		state._fsp--;
		if (state.failed) return;

		match(input,48,FOLLOW_48_in_synpred29_Logo747); if (state.failed) return;

		pushFollow(FOLLOW_multExpr_in_synpred29_Logo749);
		multExpr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred29_Logo

	// Delegated rules

	public final boolean synpred24_Logo() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred24_Logo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred27_Logo() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred27_Logo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred26_Logo() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred26_Logo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_Logo() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_Logo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred28_Logo() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred28_Logo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred23_Logo() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred23_Logo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred25_Logo() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred25_Logo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred29_Logo() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred29_Logo_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_stats_in_prog123 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_stats148 = new BitSet(new long[]{0x000000DFCC15D070L});
	public static final BitSet FOLLOW_stats_in_stats150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_stats168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORWARD_in_stat195 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_stat197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RIGHT_in_stat213 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_stat215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_stat231 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_stat233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BACK_in_stat249 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_stat251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PENUP_in_stat267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PENDOWN_in_stat281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REPEAT_in_stat295 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_stat297 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_stat299 = new BitSet(new long[]{0x000000DFCC15D070L});
	public static final BitSet FOLLOW_stats_in_stat301 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_stat303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAKE_in_stat321 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_stat323 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_VAR_in_stat325 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_stat327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOCAL_in_stat345 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_stat347 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_VAR_in_stat349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLEAR_in_stat365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_stat379 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_bexpr_in_stat381 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_stat383 = new BitSet(new long[]{0x000000DFCC15D070L});
	public static final BitSet FOLLOW_stats_in_stat385 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_stat387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHOW_in_stat405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HIDE_in_stat413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SETPCRGB_in_stat421 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_stat424 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_stat426 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_stat428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SETPENSIZE_in_stat436 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_stat438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SETPOS_in_stat454 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_stat457 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_stat459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SETH_in_stat467 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_stat470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TO_in_stat478 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_VAR_in_stat480 = new BitSet(new long[]{0x000200DFCC15D070L});
	public static final BitSet FOLLOW_params_in_stat482 = new BitSet(new long[]{0x000000DFCC15D070L});
	public static final BitSet FOLLOW_stats_in_stat484 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_END_in_stat486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CALL_in_stat506 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_VAR_in_stat508 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_exprs_in_stat510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STOP_in_stat528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_params546 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_VAR_in_params548 = new BitSet(new long[]{0x0002000000000002L});
	public static final BitSet FOLLOW_expr_in_exprs576 = new BitSet(new long[]{0x0002880022000002L});
	public static final BitSet FOLLOW_expr_in_bexpr605 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQ_in_bexpr607 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_bexpr610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_bexpr618 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_NEQ_in_bexpr620 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_bexpr623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_bexpr631 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_LESS_in_bexpr633 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_bexpr636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_bexpr644 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_GREATER_in_bexpr646 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_bexpr649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr665 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_expr667 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_expr669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr687 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_expr689 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_expr691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_multExpr723 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_multExpr725 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_multExpr_in_multExpr727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_multExpr745 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_multExpr747 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_multExpr_in_multExpr749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_multExpr764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_atom781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_atom792 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_atom794 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_atom796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_atom805 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_atom_in_atom807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REPCOUNT_in_atom823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_atom835 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_VAR_in_atom837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_synpred1_Logo148 = new BitSet(new long[]{0x000000DFCC15D070L});
	public static final BitSet FOLLOW_stats_in_synpred1_Logo150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_synpred23_Logo605 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQ_in_synpred23_Logo607 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_synpred23_Logo610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_synpred24_Logo618 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_NEQ_in_synpred24_Logo620 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_synpred24_Logo623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_synpred25_Logo631 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_LESS_in_synpred25_Logo633 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_synpred25_Logo636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_synpred26_Logo665 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_synpred26_Logo667 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_synpred26_Logo669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_synpred27_Logo687 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_synpred27_Logo689 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_expr_in_synpred27_Logo691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_synpred28_Logo723 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_synpred28_Logo725 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_multExpr_in_synpred28_Logo727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_synpred29_Logo745 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_synpred29_Logo747 = new BitSet(new long[]{0x0002880022000000L});
	public static final BitSet FOLLOW_multExpr_in_synpred29_Logo749 = new BitSet(new long[]{0x0000000000000002L});
}
