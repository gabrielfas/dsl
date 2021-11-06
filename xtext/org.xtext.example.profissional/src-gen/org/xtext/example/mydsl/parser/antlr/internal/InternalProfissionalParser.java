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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DIGIT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Nome:'", "','", "'Linkedin:'", "'Lattes:'", "'{'", "'}'", "'Nome da Linguagem:'", "'Tempo de Experi\\u00EAncia:'", "'meses'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_DIGIT=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;

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
    // InternalProfissional.g:71:1: ruleModel returns [EObject current=null] : ( (lv_profissional_0_0= ruleType ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_profissional_0_0 = null;



        	enterRule();

        try {
            // InternalProfissional.g:77:2: ( ( (lv_profissional_0_0= ruleType ) )* )
            // InternalProfissional.g:78:2: ( (lv_profissional_0_0= ruleType ) )*
            {
            // InternalProfissional.g:78:2: ( (lv_profissional_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalProfissional.g:79:3: (lv_profissional_0_0= ruleType )
            	    {
            	    // InternalProfissional.g:79:3: (lv_profissional_0_0= ruleType )
            	    // InternalProfissional.g:80:4: lv_profissional_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getProfissionalTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_profissional_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"profissional",
            	    					lv_profissional_0_0,
            	    					"org.xtext.example.mydsl.Profissional.Type");
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


    // $ANTLR start "entryRuleType"
    // InternalProfissional.g:100:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalProfissional.g:100:45: (iv_ruleType= ruleType EOF )
            // InternalProfissional.g:101:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalProfissional.g:107:1: ruleType returns [EObject current=null] : (this_Academico_0= ruleAcademico | this_Empresa_1= ruleEmpresa ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Academico_0 = null;

        EObject this_Empresa_1 = null;



        	enterRule();

        try {
            // InternalProfissional.g:113:2: ( (this_Academico_0= ruleAcademico | this_Empresa_1= ruleEmpresa ) )
            // InternalProfissional.g:114:2: (this_Academico_0= ruleAcademico | this_Empresa_1= ruleEmpresa )
            {
            // InternalProfissional.g:114:2: (this_Academico_0= ruleAcademico | this_Empresa_1= ruleEmpresa )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalProfissional.g:115:3: this_Academico_0= ruleAcademico
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getAcademicoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Academico_0=ruleAcademico();

                    state._fsp--;


                    			current = this_Academico_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProfissional.g:124:3: this_Empresa_1= ruleEmpresa
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEmpresaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Empresa_1=ruleEmpresa();

                    state._fsp--;


                    			current = this_Empresa_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleAcademico"
    // InternalProfissional.g:136:1: entryRuleAcademico returns [EObject current=null] : iv_ruleAcademico= ruleAcademico EOF ;
    public final EObject entryRuleAcademico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcademico = null;


        try {
            // InternalProfissional.g:136:50: (iv_ruleAcademico= ruleAcademico EOF )
            // InternalProfissional.g:137:2: iv_ruleAcademico= ruleAcademico EOF
            {
             newCompositeNode(grammarAccess.getAcademicoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAcademico=ruleAcademico();

            state._fsp--;

             current =iv_ruleAcademico; 
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
    // $ANTLR end "entryRuleAcademico"


    // $ANTLR start "ruleAcademico"
    // InternalProfissional.g:143:1: ruleAcademico returns [EObject current=null] : (otherlv_0= 'Nome:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' (otherlv_3= 'Linkedin:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ',' )? otherlv_6= 'Lattes:' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= '{' ( (lv_linguagem_9_0= ruleLinguagens ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleAcademico() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_linguagem_9_0 = null;



        	enterRule();

        try {
            // InternalProfissional.g:149:2: ( (otherlv_0= 'Nome:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' (otherlv_3= 'Linkedin:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ',' )? otherlv_6= 'Lattes:' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= '{' ( (lv_linguagem_9_0= ruleLinguagens ) )* otherlv_10= '}' )? ) )
            // InternalProfissional.g:150:2: (otherlv_0= 'Nome:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' (otherlv_3= 'Linkedin:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ',' )? otherlv_6= 'Lattes:' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= '{' ( (lv_linguagem_9_0= ruleLinguagens ) )* otherlv_10= '}' )? )
            {
            // InternalProfissional.g:150:2: (otherlv_0= 'Nome:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' (otherlv_3= 'Linkedin:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ',' )? otherlv_6= 'Lattes:' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= '{' ( (lv_linguagem_9_0= ruleLinguagens ) )* otherlv_10= '}' )? )
            // InternalProfissional.g:151:3: otherlv_0= 'Nome:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' (otherlv_3= 'Linkedin:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ',' )? otherlv_6= 'Lattes:' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= '{' ( (lv_linguagem_9_0= ruleLinguagens ) )* otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAcademicoAccess().getNomeKeyword_0());
            		
            // InternalProfissional.g:155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProfissional.g:156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProfissional.g:156:4: (lv_name_1_0= RULE_ID )
            // InternalProfissional.g:157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAcademicoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAcademicoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAcademicoAccess().getCommaKeyword_2());
            		
            // InternalProfissional.g:177:3: (otherlv_3= 'Linkedin:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ',' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalProfissional.g:178:4: otherlv_3= 'Linkedin:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ','
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getAcademicoAccess().getLinkedinKeyword_3_0());
                    			
                    // InternalProfissional.g:182:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalProfissional.g:183:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalProfissional.g:183:5: (lv_name_4_0= RULE_ID )
                    // InternalProfissional.g:184:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getAcademicoAccess().getNameIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAcademicoRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getAcademicoAccess().getCommaKeyword_3_2());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getAcademicoAccess().getLattesKeyword_4());
            		
            // InternalProfissional.g:209:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalProfissional.g:210:4: (lv_name_7_0= RULE_ID )
            {
            // InternalProfissional.g:210:4: (lv_name_7_0= RULE_ID )
            // InternalProfissional.g:211:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_7_0, grammarAccess.getAcademicoAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAcademicoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalProfissional.g:227:3: (otherlv_8= '{' ( (lv_linguagem_9_0= ruleLinguagens ) )* otherlv_10= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalProfissional.g:228:4: otherlv_8= '{' ( (lv_linguagem_9_0= ruleLinguagens ) )* otherlv_10= '}'
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getAcademicoAccess().getLeftCurlyBracketKeyword_6_0());
                    			
                    // InternalProfissional.g:232:4: ( (lv_linguagem_9_0= ruleLinguagens ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==18) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalProfissional.g:233:5: (lv_linguagem_9_0= ruleLinguagens )
                    	    {
                    	    // InternalProfissional.g:233:5: (lv_linguagem_9_0= ruleLinguagens )
                    	    // InternalProfissional.g:234:6: lv_linguagem_9_0= ruleLinguagens
                    	    {

                    	    						newCompositeNode(grammarAccess.getAcademicoAccess().getLinguagemLinguagensParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_linguagem_9_0=ruleLinguagens();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAcademicoRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"linguagem",
                    	    							lv_linguagem_9_0,
                    	    							"org.xtext.example.mydsl.Profissional.Linguagens");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getAcademicoAccess().getRightCurlyBracketKeyword_6_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleAcademico"


    // $ANTLR start "entryRuleEmpresa"
    // InternalProfissional.g:260:1: entryRuleEmpresa returns [EObject current=null] : iv_ruleEmpresa= ruleEmpresa EOF ;
    public final EObject entryRuleEmpresa() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmpresa = null;


        try {
            // InternalProfissional.g:260:48: (iv_ruleEmpresa= ruleEmpresa EOF )
            // InternalProfissional.g:261:2: iv_ruleEmpresa= ruleEmpresa EOF
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
    // InternalProfissional.g:267:1: ruleEmpresa returns [EObject current=null] : (otherlv_0= 'Nome:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' (otherlv_3= 'Lattes:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ',' )? otherlv_6= 'Linkedin:' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= '{' ( (lv_linguagem_9_0= ruleLinguagens ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleEmpresa() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_linguagem_9_0 = null;



        	enterRule();

        try {
            // InternalProfissional.g:273:2: ( (otherlv_0= 'Nome:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' (otherlv_3= 'Lattes:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ',' )? otherlv_6= 'Linkedin:' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= '{' ( (lv_linguagem_9_0= ruleLinguagens ) )* otherlv_10= '}' )? ) )
            // InternalProfissional.g:274:2: (otherlv_0= 'Nome:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' (otherlv_3= 'Lattes:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ',' )? otherlv_6= 'Linkedin:' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= '{' ( (lv_linguagem_9_0= ruleLinguagens ) )* otherlv_10= '}' )? )
            {
            // InternalProfissional.g:274:2: (otherlv_0= 'Nome:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' (otherlv_3= 'Lattes:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ',' )? otherlv_6= 'Linkedin:' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= '{' ( (lv_linguagem_9_0= ruleLinguagens ) )* otherlv_10= '}' )? )
            // InternalProfissional.g:275:3: otherlv_0= 'Nome:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' (otherlv_3= 'Lattes:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ',' )? otherlv_6= 'Linkedin:' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= '{' ( (lv_linguagem_9_0= ruleLinguagens ) )* otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEmpresaAccess().getNomeKeyword_0());
            		
            // InternalProfissional.g:279:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProfissional.g:280:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProfissional.g:280:4: (lv_name_1_0= RULE_ID )
            // InternalProfissional.g:281:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getEmpresaAccess().getCommaKeyword_2());
            		
            // InternalProfissional.g:301:3: (otherlv_3= 'Lattes:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ',' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalProfissional.g:302:4: otherlv_3= 'Lattes:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ','
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getEmpresaAccess().getLattesKeyword_3_0());
                    			
                    // InternalProfissional.g:306:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalProfissional.g:307:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalProfissional.g:307:5: (lv_name_4_0= RULE_ID )
                    // InternalProfissional.g:308:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getEmpresaAccess().getNameIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEmpresaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,13,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getEmpresaAccess().getCommaKeyword_3_2());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getEmpresaAccess().getLinkedinKeyword_4());
            		
            // InternalProfissional.g:333:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalProfissional.g:334:4: (lv_name_7_0= RULE_ID )
            {
            // InternalProfissional.g:334:4: (lv_name_7_0= RULE_ID )
            // InternalProfissional.g:335:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_7_0, grammarAccess.getEmpresaAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmpresaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalProfissional.g:351:3: (otherlv_8= '{' ( (lv_linguagem_9_0= ruleLinguagens ) )* otherlv_10= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalProfissional.g:352:4: otherlv_8= '{' ( (lv_linguagem_9_0= ruleLinguagens ) )* otherlv_10= '}'
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getEmpresaAccess().getLeftCurlyBracketKeyword_6_0());
                    			
                    // InternalProfissional.g:356:4: ( (lv_linguagem_9_0= ruleLinguagens ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==18) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalProfissional.g:357:5: (lv_linguagem_9_0= ruleLinguagens )
                    	    {
                    	    // InternalProfissional.g:357:5: (lv_linguagem_9_0= ruleLinguagens )
                    	    // InternalProfissional.g:358:6: lv_linguagem_9_0= ruleLinguagens
                    	    {

                    	    						newCompositeNode(grammarAccess.getEmpresaAccess().getLinguagemLinguagensParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_linguagem_9_0=ruleLinguagens();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEmpresaRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"linguagem",
                    	    							lv_linguagem_9_0,
                    	    							"org.xtext.example.mydsl.Profissional.Linguagens");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getEmpresaAccess().getRightCurlyBracketKeyword_6_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleEmpresa"


    // $ANTLR start "entryRuleLinguagens"
    // InternalProfissional.g:384:1: entryRuleLinguagens returns [EObject current=null] : iv_ruleLinguagens= ruleLinguagens EOF ;
    public final EObject entryRuleLinguagens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinguagens = null;


        try {
            // InternalProfissional.g:384:51: (iv_ruleLinguagens= ruleLinguagens EOF )
            // InternalProfissional.g:385:2: iv_ruleLinguagens= ruleLinguagens EOF
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
    // InternalProfissional.g:391:1: ruleLinguagens returns [EObject current=null] : (otherlv_0= 'Nome da Linguagem:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'Tempo de Experi\\u00EAncia:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'meses' ) ;
    public final EObject ruleLinguagens() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalProfissional.g:397:2: ( (otherlv_0= 'Nome da Linguagem:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'Tempo de Experi\\u00EAncia:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'meses' ) )
            // InternalProfissional.g:398:2: (otherlv_0= 'Nome da Linguagem:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'Tempo de Experi\\u00EAncia:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'meses' )
            {
            // InternalProfissional.g:398:2: (otherlv_0= 'Nome da Linguagem:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'Tempo de Experi\\u00EAncia:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'meses' )
            // InternalProfissional.g:399:3: otherlv_0= 'Nome da Linguagem:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' otherlv_3= 'Tempo de Experi\\u00EAncia:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'meses'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLinguagensAccess().getNomeDaLinguagemKeyword_0());
            		
            // InternalProfissional.g:403:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProfissional.g:404:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProfissional.g:404:4: (lv_name_1_0= RULE_ID )
            // InternalProfissional.g:405:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLinguagensAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinguagensRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getLinguagensAccess().getCommaKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getLinguagensAccess().getTempoDeExperiNciaKeyword_3());
            		
            // InternalProfissional.g:429:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalProfissional.g:430:4: (lv_name_4_0= RULE_ID )
            {
            // InternalProfissional.g:430:4: (lv_name_4_0= RULE_ID )
            // InternalProfissional.g:431:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_4_0, grammarAccess.getLinguagensAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinguagensRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLinguagensAccess().getMesesKeyword_5());
            		

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


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\6\uffff\1\10\1\11\2\uffff";
    static final String dfa_3s = "\1\14\1\4\1\15\1\16\2\4\2\14\2\uffff";
    static final String dfa_4s = "\1\14\1\4\1\15\1\17\2\4\2\20\2\uffff";
    static final String dfa_5s = "\10\uffff\1\1\1\2";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\5\1\4",
            "\1\6",
            "\1\7",
            "\1\10\1\11\2\uffff\1\10",
            "\1\11\1\10\2\uffff\1\11",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "114:2: (this_Academico_0= ruleAcademico | this_Empresa_1= ruleEmpresa )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});

}