package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.ProfissionalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProfissionalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Nome:'", "','", "'Empresa:'", "',Linguagens:{'", "'}'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalProfissionalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProfissionalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProfissionalParser.tokenNames; }
    public String getGrammarFileName() { return "InternalProfissional.g"; }



     	private ProfissionalGrammarAccess grammarAccess;

        public InternalProfissionalParser(TokenStream input, ProfissionalGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ProfissionalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalProfissional.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalProfissional.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalProfissional.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalProfissional.g:71:1: ruleModel returns [EObject current=null] : ( (lv_profissional_0_0= rulePessoa ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_profissional_0_0 = null;



        	enterRule();

        try {
            // InternalProfissional.g:77:2: ( ( (lv_profissional_0_0= rulePessoa ) )* )
            // InternalProfissional.g:78:2: ( (lv_profissional_0_0= rulePessoa ) )*
            {
            // InternalProfissional.g:78:2: ( (lv_profissional_0_0= rulePessoa ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalProfissional.g:79:3: (lv_profissional_0_0= rulePessoa )
            	    {
            	    // InternalProfissional.g:79:3: (lv_profissional_0_0= rulePessoa )
            	    // InternalProfissional.g:80:4: lv_profissional_0_0= rulePessoa
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getProfissionalPessoaParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_profissional_0_0=rulePessoa();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"profissional",
            	    					lv_profissional_0_0,
            	    					"org.xtext.example.mydsl.Profissional.Pessoa");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePessoa"
    // InternalProfissional.g:100:1: entryRulePessoa returns [EObject current=null] : iv_rulePessoa= rulePessoa EOF ;
    public final EObject entryRulePessoa() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePessoa = null;


        try {
            // InternalProfissional.g:100:47: (iv_rulePessoa= rulePessoa EOF )
            // InternalProfissional.g:101:2: iv_rulePessoa= rulePessoa EOF
            {
             newCompositeNode(grammarAccess.getPessoaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePessoa=rulePessoa();

            state._fsp--;

             current =iv_rulePessoa; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePessoa"


    // $ANTLR start "rulePessoa"
    // InternalProfissional.g:107:1: rulePessoa returns [EObject current=null] : (otherlv_0= 'Nome:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_empresa_3_0= ruleEmpresa ) ) ) ;
    public final EObject rulePessoa() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_empresa_3_0 = null;



        	enterRule();

        try {
            // InternalProfissional.g:113:2: ( (otherlv_0= 'Nome:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_empresa_3_0= ruleEmpresa ) ) ) )
            // InternalProfissional.g:114:2: (otherlv_0= 'Nome:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_empresa_3_0= ruleEmpresa ) ) )
            {
            // InternalProfissional.g:114:2: (otherlv_0= 'Nome:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_empresa_3_0= ruleEmpresa ) ) )
            // InternalProfissional.g:115:3: otherlv_0= 'Nome:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_empresa_3_0= ruleEmpresa ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPessoaAccess().getNomeKeyword_0());
            		
            // InternalProfissional.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProfissional.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProfissional.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalProfissional.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPessoaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPessoaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPessoaAccess().getCommaKeyword_2());
            		
            // InternalProfissional.g:141:3: ( (lv_empresa_3_0= ruleEmpresa ) )
            // InternalProfissional.g:142:4: (lv_empresa_3_0= ruleEmpresa )
            {
            // InternalProfissional.g:142:4: (lv_empresa_3_0= ruleEmpresa )
            // InternalProfissional.g:143:5: lv_empresa_3_0= ruleEmpresa
            {

            					newCompositeNode(grammarAccess.getPessoaAccess().getEmpresaEmpresaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_empresa_3_0=ruleEmpresa();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPessoaRule());
            					}
            					add(
            						current,
            						"empresa",
            						lv_empresa_3_0,
            						"org.xtext.example.mydsl.Profissional.Empresa");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePessoa"


    // $ANTLR start "entryRuleEmpresa"
    // InternalProfissional.g:164:1: entryRuleEmpresa returns [EObject current=null] : iv_ruleEmpresa= ruleEmpresa EOF ;
    public final EObject entryRuleEmpresa() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmpresa = null;


        try {
            // InternalProfissional.g:164:48: (iv_ruleEmpresa= ruleEmpresa EOF )
            // InternalProfissional.g:165:2: iv_ruleEmpresa= ruleEmpresa EOF
            {
             newCompositeNode(grammarAccess.getEmpresaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmpresa=ruleEmpresa();

            state._fsp--;

             current =iv_ruleEmpresa; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmpresa"


    // $ANTLR start "ruleEmpresa"
    // InternalProfissional.g:171:1: ruleEmpresa returns [EObject current=null] : (otherlv_0= 'Empresa:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',Linguagens:{' ( (lv_linguagens_3_0= ruleLinguagens ) )* otherlv_4= '}' ) ;
    public final EObject ruleEmpresa() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_linguagens_3_0 = null;



        	enterRule();

        try {
            // InternalProfissional.g:177:2: ( (otherlv_0= 'Empresa:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',Linguagens:{' ( (lv_linguagens_3_0= ruleLinguagens ) )* otherlv_4= '}' ) )
            // InternalProfissional.g:178:2: (otherlv_0= 'Empresa:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',Linguagens:{' ( (lv_linguagens_3_0= ruleLinguagens ) )* otherlv_4= '}' )
            {
            // InternalProfissional.g:178:2: (otherlv_0= 'Empresa:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',Linguagens:{' ( (lv_linguagens_3_0= ruleLinguagens ) )* otherlv_4= '}' )
            // InternalProfissional.g:179:3: otherlv_0= 'Empresa:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',Linguagens:{' ( (lv_linguagens_3_0= ruleLinguagens ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEmpresaAccess().getEmpresaKeyword_0());
            		
            // InternalProfissional.g:183:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProfissional.g:184:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProfissional.g:184:4: (lv_name_1_0= RULE_ID )
            // InternalProfissional.g:185:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEmpresaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmpresaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getEmpresaAccess().getLinguagensKeyword_2());
            		
            // InternalProfissional.g:205:3: ( (lv_linguagens_3_0= ruleLinguagens ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalProfissional.g:206:4: (lv_linguagens_3_0= ruleLinguagens )
            	    {
            	    // InternalProfissional.g:206:4: (lv_linguagens_3_0= ruleLinguagens )
            	    // InternalProfissional.g:207:5: lv_linguagens_3_0= ruleLinguagens
            	    {

            	    					newCompositeNode(grammarAccess.getEmpresaAccess().getLinguagensLinguagensParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_linguagens_3_0=ruleLinguagens();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEmpresaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"linguagens",
            	    						lv_linguagens_3_0,
            	    						"org.xtext.example.mydsl.Profissional.Linguagens");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEmpresaAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmpresa"


    // $ANTLR start "entryRuleLinguagens"
    // InternalProfissional.g:232:1: entryRuleLinguagens returns [EObject current=null] : iv_ruleLinguagens= ruleLinguagens EOF ;
    public final EObject entryRuleLinguagens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinguagens = null;


        try {
            // InternalProfissional.g:232:51: (iv_ruleLinguagens= ruleLinguagens EOF )
            // InternalProfissional.g:233:2: iv_ruleLinguagens= ruleLinguagens EOF
            {
             newCompositeNode(grammarAccess.getLinguagensRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinguagens=ruleLinguagens();

            state._fsp--;

             current =iv_ruleLinguagens; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinguagens"


    // $ANTLR start "ruleLinguagens"
    // InternalProfissional.g:239:1: ruleLinguagens returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleLinguagens() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalProfissional.g:245:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalProfissional.g:246:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalProfissional.g:246:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalProfissional.g:247:3: (lv_name_0_0= RULE_ID )
            {
            // InternalProfissional.g:247:3: (lv_name_0_0= RULE_ID )
            // InternalProfissional.g:248:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getLinguagensAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLinguagensRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinguagens"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008010L});

}