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
import org.xtext.example.mydsl.services.MemorandoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMemorandoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Numero: '", "', Setor Destinatario: '", "', Setor Remetente: '", "', Cidade: '", "', Estado: '", "', Data: '", "'/'", "', Cargo Destinatario: '", "', Assunto: '", "', Destinos: '", "', Mensagem: '", "', Remetente: '", "', Cargo Remetente: '"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMemorandoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMemorandoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMemorandoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMemorando.g"; }



     	private MemorandoGrammarAccess grammarAccess;

        public InternalMemorandoParser(TokenStream input, MemorandoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MemorandoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMemorando.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMemorando.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMemorando.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalMemorando.g:71:1: ruleModel returns [EObject current=null] : ( (lv_memorandos_0_0= ruleMemorando ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_memorandos_0_0 = null;



        	enterRule();

        try {
            // InternalMemorando.g:77:2: ( ( (lv_memorandos_0_0= ruleMemorando ) )* )
            // InternalMemorando.g:78:2: ( (lv_memorandos_0_0= ruleMemorando ) )*
            {
            // InternalMemorando.g:78:2: ( (lv_memorandos_0_0= ruleMemorando ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMemorando.g:79:3: (lv_memorandos_0_0= ruleMemorando )
            	    {
            	    // InternalMemorando.g:79:3: (lv_memorandos_0_0= ruleMemorando )
            	    // InternalMemorando.g:80:4: lv_memorandos_0_0= ruleMemorando
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getMemorandosMemorandoParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_memorandos_0_0=ruleMemorando();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"memorandos",
            	    					lv_memorandos_0_0,
            	    					"org.xtext.example.mydsl.Memorando.Memorando");
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


    // $ANTLR start "entryRuleMemorando"
    // InternalMemorando.g:100:1: entryRuleMemorando returns [EObject current=null] : iv_ruleMemorando= ruleMemorando EOF ;
    public final EObject entryRuleMemorando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemorando = null;


        try {
            // InternalMemorando.g:100:50: (iv_ruleMemorando= ruleMemorando EOF )
            // InternalMemorando.g:101:2: iv_ruleMemorando= ruleMemorando EOF
            {
             newCompositeNode(grammarAccess.getMemorandoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemorando=ruleMemorando();

            state._fsp--;

             current =iv_ruleMemorando; 
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
    // $ANTLR end "entryRuleMemorando"


    // $ANTLR start "ruleMemorando"
    // InternalMemorando.g:107:1: ruleMemorando returns [EObject current=null] : ( (otherlv_0= 'Numero: ' )+ ( (lv_numero_1_0= RULE_INT ) )+ (otherlv_2= ', Setor Destinatario: ' )+ ( (lv_setorDestinatario_3_0= RULE_ID ) )+ (otherlv_4= ', Setor Remetente: ' )+ ( (lv_setorRemetente_5_0= RULE_ID ) )+ otherlv_6= ', Cidade: ' ( (lv_cidade_7_0= RULE_ID ) )+ otherlv_8= ', Estado: ' ( (lv_estado_9_0= RULE_ID ) )+ otherlv_10= ', Data: ' ( (lv_dia_11_0= RULE_INT ) )+ otherlv_12= '/' ( (lv_mes_13_0= RULE_ID ) )+ otherlv_14= '/' ( (lv_ano_15_0= RULE_INT ) )+ otherlv_16= ', Cargo Destinatario: ' ( (lv_cargoDestinatario_17_0= RULE_STRING ) )+ (otherlv_18= ', Assunto: ' )+ ( (lv_assunto_19_0= RULE_STRING ) )+ (otherlv_20= ', Destinos: ' )+ ( (lv_destinos_21_0= ruleDestino ) )* (otherlv_22= ', Mensagem: ' )+ ( (lv_paragrafos_23_0= ruleParagrafo ) )* (otherlv_24= ', Remetente: ' )+ ( (lv_remetente_25_0= RULE_STRING ) )+ (otherlv_26= ', Cargo Remetente: ' )+ ( (lv_cargoRemetente_27_0= RULE_STRING ) ) ) ;
    public final EObject ruleMemorando() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_numero_1_0=null;
        Token otherlv_2=null;
        Token lv_setorDestinatario_3_0=null;
        Token otherlv_4=null;
        Token lv_setorRemetente_5_0=null;
        Token otherlv_6=null;
        Token lv_cidade_7_0=null;
        Token otherlv_8=null;
        Token lv_estado_9_0=null;
        Token otherlv_10=null;
        Token lv_dia_11_0=null;
        Token otherlv_12=null;
        Token lv_mes_13_0=null;
        Token otherlv_14=null;
        Token lv_ano_15_0=null;
        Token otherlv_16=null;
        Token lv_cargoDestinatario_17_0=null;
        Token otherlv_18=null;
        Token lv_assunto_19_0=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token lv_remetente_25_0=null;
        Token otherlv_26=null;
        Token lv_cargoRemetente_27_0=null;
        EObject lv_destinos_21_0 = null;

        EObject lv_paragrafos_23_0 = null;



        	enterRule();

        try {
            // InternalMemorando.g:113:2: ( ( (otherlv_0= 'Numero: ' )+ ( (lv_numero_1_0= RULE_INT ) )+ (otherlv_2= ', Setor Destinatario: ' )+ ( (lv_setorDestinatario_3_0= RULE_ID ) )+ (otherlv_4= ', Setor Remetente: ' )+ ( (lv_setorRemetente_5_0= RULE_ID ) )+ otherlv_6= ', Cidade: ' ( (lv_cidade_7_0= RULE_ID ) )+ otherlv_8= ', Estado: ' ( (lv_estado_9_0= RULE_ID ) )+ otherlv_10= ', Data: ' ( (lv_dia_11_0= RULE_INT ) )+ otherlv_12= '/' ( (lv_mes_13_0= RULE_ID ) )+ otherlv_14= '/' ( (lv_ano_15_0= RULE_INT ) )+ otherlv_16= ', Cargo Destinatario: ' ( (lv_cargoDestinatario_17_0= RULE_STRING ) )+ (otherlv_18= ', Assunto: ' )+ ( (lv_assunto_19_0= RULE_STRING ) )+ (otherlv_20= ', Destinos: ' )+ ( (lv_destinos_21_0= ruleDestino ) )* (otherlv_22= ', Mensagem: ' )+ ( (lv_paragrafos_23_0= ruleParagrafo ) )* (otherlv_24= ', Remetente: ' )+ ( (lv_remetente_25_0= RULE_STRING ) )+ (otherlv_26= ', Cargo Remetente: ' )+ ( (lv_cargoRemetente_27_0= RULE_STRING ) ) ) )
            // InternalMemorando.g:114:2: ( (otherlv_0= 'Numero: ' )+ ( (lv_numero_1_0= RULE_INT ) )+ (otherlv_2= ', Setor Destinatario: ' )+ ( (lv_setorDestinatario_3_0= RULE_ID ) )+ (otherlv_4= ', Setor Remetente: ' )+ ( (lv_setorRemetente_5_0= RULE_ID ) )+ otherlv_6= ', Cidade: ' ( (lv_cidade_7_0= RULE_ID ) )+ otherlv_8= ', Estado: ' ( (lv_estado_9_0= RULE_ID ) )+ otherlv_10= ', Data: ' ( (lv_dia_11_0= RULE_INT ) )+ otherlv_12= '/' ( (lv_mes_13_0= RULE_ID ) )+ otherlv_14= '/' ( (lv_ano_15_0= RULE_INT ) )+ otherlv_16= ', Cargo Destinatario: ' ( (lv_cargoDestinatario_17_0= RULE_STRING ) )+ (otherlv_18= ', Assunto: ' )+ ( (lv_assunto_19_0= RULE_STRING ) )+ (otherlv_20= ', Destinos: ' )+ ( (lv_destinos_21_0= ruleDestino ) )* (otherlv_22= ', Mensagem: ' )+ ( (lv_paragrafos_23_0= ruleParagrafo ) )* (otherlv_24= ', Remetente: ' )+ ( (lv_remetente_25_0= RULE_STRING ) )+ (otherlv_26= ', Cargo Remetente: ' )+ ( (lv_cargoRemetente_27_0= RULE_STRING ) ) )
            {
            // InternalMemorando.g:114:2: ( (otherlv_0= 'Numero: ' )+ ( (lv_numero_1_0= RULE_INT ) )+ (otherlv_2= ', Setor Destinatario: ' )+ ( (lv_setorDestinatario_3_0= RULE_ID ) )+ (otherlv_4= ', Setor Remetente: ' )+ ( (lv_setorRemetente_5_0= RULE_ID ) )+ otherlv_6= ', Cidade: ' ( (lv_cidade_7_0= RULE_ID ) )+ otherlv_8= ', Estado: ' ( (lv_estado_9_0= RULE_ID ) )+ otherlv_10= ', Data: ' ( (lv_dia_11_0= RULE_INT ) )+ otherlv_12= '/' ( (lv_mes_13_0= RULE_ID ) )+ otherlv_14= '/' ( (lv_ano_15_0= RULE_INT ) )+ otherlv_16= ', Cargo Destinatario: ' ( (lv_cargoDestinatario_17_0= RULE_STRING ) )+ (otherlv_18= ', Assunto: ' )+ ( (lv_assunto_19_0= RULE_STRING ) )+ (otherlv_20= ', Destinos: ' )+ ( (lv_destinos_21_0= ruleDestino ) )* (otherlv_22= ', Mensagem: ' )+ ( (lv_paragrafos_23_0= ruleParagrafo ) )* (otherlv_24= ', Remetente: ' )+ ( (lv_remetente_25_0= RULE_STRING ) )+ (otherlv_26= ', Cargo Remetente: ' )+ ( (lv_cargoRemetente_27_0= RULE_STRING ) ) )
            // InternalMemorando.g:115:3: (otherlv_0= 'Numero: ' )+ ( (lv_numero_1_0= RULE_INT ) )+ (otherlv_2= ', Setor Destinatario: ' )+ ( (lv_setorDestinatario_3_0= RULE_ID ) )+ (otherlv_4= ', Setor Remetente: ' )+ ( (lv_setorRemetente_5_0= RULE_ID ) )+ otherlv_6= ', Cidade: ' ( (lv_cidade_7_0= RULE_ID ) )+ otherlv_8= ', Estado: ' ( (lv_estado_9_0= RULE_ID ) )+ otherlv_10= ', Data: ' ( (lv_dia_11_0= RULE_INT ) )+ otherlv_12= '/' ( (lv_mes_13_0= RULE_ID ) )+ otherlv_14= '/' ( (lv_ano_15_0= RULE_INT ) )+ otherlv_16= ', Cargo Destinatario: ' ( (lv_cargoDestinatario_17_0= RULE_STRING ) )+ (otherlv_18= ', Assunto: ' )+ ( (lv_assunto_19_0= RULE_STRING ) )+ (otherlv_20= ', Destinos: ' )+ ( (lv_destinos_21_0= ruleDestino ) )* (otherlv_22= ', Mensagem: ' )+ ( (lv_paragrafos_23_0= ruleParagrafo ) )* (otherlv_24= ', Remetente: ' )+ ( (lv_remetente_25_0= RULE_STRING ) )+ (otherlv_26= ', Cargo Remetente: ' )+ ( (lv_cargoRemetente_27_0= RULE_STRING ) )
            {
            // InternalMemorando.g:115:3: (otherlv_0= 'Numero: ' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMemorando.g:116:4: otherlv_0= 'Numero: '
            	    {
            	    otherlv_0=(Token)match(input,11,FOLLOW_4); 

            	    				newLeafNode(otherlv_0, grammarAccess.getMemorandoAccess().getNumeroKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalMemorando.g:121:3: ( (lv_numero_1_0= RULE_INT ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_INT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMemorando.g:122:4: (lv_numero_1_0= RULE_INT )
            	    {
            	    // InternalMemorando.g:122:4: (lv_numero_1_0= RULE_INT )
            	    // InternalMemorando.g:123:5: lv_numero_1_0= RULE_INT
            	    {
            	    lv_numero_1_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            	    					newLeafNode(lv_numero_1_0, grammarAccess.getMemorandoAccess().getNumeroINTTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMemorandoRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"numero",
            	    						lv_numero_1_0,
            	    						"org.eclipse.xtext.common.Terminals.INT");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalMemorando.g:139:3: (otherlv_2= ', Setor Destinatario: ' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMemorando.g:140:4: otherlv_2= ', Setor Destinatario: '
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMemorandoAccess().getSetorDestinatarioKeyword_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // InternalMemorando.g:145:3: ( (lv_setorDestinatario_3_0= RULE_ID ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMemorando.g:146:4: (lv_setorDestinatario_3_0= RULE_ID )
            	    {
            	    // InternalMemorando.g:146:4: (lv_setorDestinatario_3_0= RULE_ID )
            	    // InternalMemorando.g:147:5: lv_setorDestinatario_3_0= RULE_ID
            	    {
            	    lv_setorDestinatario_3_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    					newLeafNode(lv_setorDestinatario_3_0, grammarAccess.getMemorandoAccess().getSetorDestinatarioIDTerminalRuleCall_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMemorandoRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"setorDestinatario",
            	    						lv_setorDestinatario_3_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // InternalMemorando.g:163:3: (otherlv_4= ', Setor Remetente: ' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMemorando.g:164:4: otherlv_4= ', Setor Remetente: '
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_7); 

            	    				newLeafNode(otherlv_4, grammarAccess.getMemorandoAccess().getSetorRemetenteKeyword_4());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // InternalMemorando.g:169:3: ( (lv_setorRemetente_5_0= RULE_ID ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMemorando.g:170:4: (lv_setorRemetente_5_0= RULE_ID )
            	    {
            	    // InternalMemorando.g:170:4: (lv_setorRemetente_5_0= RULE_ID )
            	    // InternalMemorando.g:171:5: lv_setorRemetente_5_0= RULE_ID
            	    {
            	    lv_setorRemetente_5_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    					newLeafNode(lv_setorRemetente_5_0, grammarAccess.getMemorandoAccess().getSetorRemetenteIDTerminalRuleCall_5_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMemorandoRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"setorRemetente",
            	    						lv_setorRemetente_5_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getMemorandoAccess().getCidadeKeyword_6());
            		
            // InternalMemorando.g:191:3: ( (lv_cidade_7_0= RULE_ID ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMemorando.g:192:4: (lv_cidade_7_0= RULE_ID )
            	    {
            	    // InternalMemorando.g:192:4: (lv_cidade_7_0= RULE_ID )
            	    // InternalMemorando.g:193:5: lv_cidade_7_0= RULE_ID
            	    {
            	    lv_cidade_7_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    					newLeafNode(lv_cidade_7_0, grammarAccess.getMemorandoAccess().getCidadeIDTerminalRuleCall_7_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMemorandoRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"cidade",
            	    						lv_cidade_7_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getMemorandoAccess().getEstadoKeyword_8());
            		
            // InternalMemorando.g:213:3: ( (lv_estado_9_0= RULE_ID ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMemorando.g:214:4: (lv_estado_9_0= RULE_ID )
            	    {
            	    // InternalMemorando.g:214:4: (lv_estado_9_0= RULE_ID )
            	    // InternalMemorando.g:215:5: lv_estado_9_0= RULE_ID
            	    {
            	    lv_estado_9_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    					newLeafNode(lv_estado_9_0, grammarAccess.getMemorandoAccess().getEstadoIDTerminalRuleCall_9_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMemorandoRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"estado",
            	    						lv_estado_9_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getMemorandoAccess().getDataKeyword_10());
            		
            // InternalMemorando.g:235:3: ( (lv_dia_11_0= RULE_INT ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_INT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMemorando.g:236:4: (lv_dia_11_0= RULE_INT )
            	    {
            	    // InternalMemorando.g:236:4: (lv_dia_11_0= RULE_INT )
            	    // InternalMemorando.g:237:5: lv_dia_11_0= RULE_INT
            	    {
            	    lv_dia_11_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            	    					newLeafNode(lv_dia_11_0, grammarAccess.getMemorandoAccess().getDiaINTTerminalRuleCall_11_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMemorandoRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"dia",
            	    						lv_dia_11_0,
            	    						"org.eclipse.xtext.common.Terminals.INT");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_12, grammarAccess.getMemorandoAccess().getSolidusKeyword_12());
            		
            // InternalMemorando.g:257:3: ( (lv_mes_13_0= RULE_ID ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMemorando.g:258:4: (lv_mes_13_0= RULE_ID )
            	    {
            	    // InternalMemorando.g:258:4: (lv_mes_13_0= RULE_ID )
            	    // InternalMemorando.g:259:5: lv_mes_13_0= RULE_ID
            	    {
            	    lv_mes_13_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    					newLeafNode(lv_mes_13_0, grammarAccess.getMemorandoAccess().getMesIDTerminalRuleCall_13_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMemorandoRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"mes",
            	    						lv_mes_13_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_14=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_14, grammarAccess.getMemorandoAccess().getSolidusKeyword_14());
            		
            // InternalMemorando.g:279:3: ( (lv_ano_15_0= RULE_INT ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_INT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMemorando.g:280:4: (lv_ano_15_0= RULE_INT )
            	    {
            	    // InternalMemorando.g:280:4: (lv_ano_15_0= RULE_INT )
            	    // InternalMemorando.g:281:5: lv_ano_15_0= RULE_INT
            	    {
            	    lv_ano_15_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            	    					newLeafNode(lv_ano_15_0, grammarAccess.getMemorandoAccess().getAnoINTTerminalRuleCall_15_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMemorandoRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"ano",
            	    						lv_ano_15_0,
            	    						"org.eclipse.xtext.common.Terminals.INT");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_16=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_16, grammarAccess.getMemorandoAccess().getCargoDestinatarioKeyword_16());
            		
            // InternalMemorando.g:301:3: ( (lv_cargoDestinatario_17_0= RULE_STRING ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMemorando.g:302:4: (lv_cargoDestinatario_17_0= RULE_STRING )
            	    {
            	    // InternalMemorando.g:302:4: (lv_cargoDestinatario_17_0= RULE_STRING )
            	    // InternalMemorando.g:303:5: lv_cargoDestinatario_17_0= RULE_STRING
            	    {
            	    lv_cargoDestinatario_17_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    					newLeafNode(lv_cargoDestinatario_17_0, grammarAccess.getMemorandoAccess().getCargoDestinatarioSTRINGTerminalRuleCall_17_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMemorandoRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"cargoDestinatario",
            	    						lv_cargoDestinatario_17_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            // InternalMemorando.g:319:3: (otherlv_18= ', Assunto: ' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMemorando.g:320:4: otherlv_18= ', Assunto: '
            	    {
            	    otherlv_18=(Token)match(input,19,FOLLOW_17); 

            	    				newLeafNode(otherlv_18, grammarAccess.getMemorandoAccess().getAssuntoKeyword_18());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            // InternalMemorando.g:325:3: ( (lv_assunto_19_0= RULE_STRING ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STRING) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMemorando.g:326:4: (lv_assunto_19_0= RULE_STRING )
            	    {
            	    // InternalMemorando.g:326:4: (lv_assunto_19_0= RULE_STRING )
            	    // InternalMemorando.g:327:5: lv_assunto_19_0= RULE_STRING
            	    {
            	    lv_assunto_19_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            	    					newLeafNode(lv_assunto_19_0, grammarAccess.getMemorandoAccess().getAssuntoSTRINGTerminalRuleCall_19_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMemorandoRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"assunto",
            	    						lv_assunto_19_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            // InternalMemorando.g:343:3: (otherlv_20= ', Destinos: ' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMemorando.g:344:4: otherlv_20= ', Destinos: '
            	    {
            	    otherlv_20=(Token)match(input,20,FOLLOW_19); 

            	    				newLeafNode(otherlv_20, grammarAccess.getMemorandoAccess().getDestinosKeyword_20());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            // InternalMemorando.g:349:3: ( (lv_destinos_21_0= ruleDestino ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMemorando.g:350:4: (lv_destinos_21_0= ruleDestino )
            	    {
            	    // InternalMemorando.g:350:4: (lv_destinos_21_0= ruleDestino )
            	    // InternalMemorando.g:351:5: lv_destinos_21_0= ruleDestino
            	    {

            	    					newCompositeNode(grammarAccess.getMemorandoAccess().getDestinosDestinoParserRuleCall_21_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_destinos_21_0=ruleDestino();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMemorandoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"destinos",
            	    						lv_destinos_21_0,
            	    						"org.xtext.example.mydsl.Memorando.Destino");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalMemorando.g:368:3: (otherlv_22= ', Mensagem: ' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMemorando.g:369:4: otherlv_22= ', Mensagem: '
            	    {
            	    otherlv_22=(Token)match(input,21,FOLLOW_21); 

            	    				newLeafNode(otherlv_22, grammarAccess.getMemorandoAccess().getMensagemKeyword_22());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            // InternalMemorando.g:374:3: ( (lv_paragrafos_23_0= ruleParagrafo ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_STRING) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMemorando.g:375:4: (lv_paragrafos_23_0= ruleParagrafo )
            	    {
            	    // InternalMemorando.g:375:4: (lv_paragrafos_23_0= ruleParagrafo )
            	    // InternalMemorando.g:376:5: lv_paragrafos_23_0= ruleParagrafo
            	    {

            	    					newCompositeNode(grammarAccess.getMemorandoAccess().getParagrafosParagrafoParserRuleCall_23_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_paragrafos_23_0=ruleParagrafo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMemorandoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"paragrafos",
            	    						lv_paragrafos_23_0,
            	    						"org.xtext.example.mydsl.Memorando.Paragrafo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalMemorando.g:393:3: (otherlv_24= ', Remetente: ' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMemorando.g:394:4: otherlv_24= ', Remetente: '
            	    {
            	    otherlv_24=(Token)match(input,22,FOLLOW_22); 

            	    				newLeafNode(otherlv_24, grammarAccess.getMemorandoAccess().getRemetenteKeyword_24());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            // InternalMemorando.g:399:3: ( (lv_remetente_25_0= RULE_STRING ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMemorando.g:400:4: (lv_remetente_25_0= RULE_STRING )
            	    {
            	    // InternalMemorando.g:400:4: (lv_remetente_25_0= RULE_STRING )
            	    // InternalMemorando.g:401:5: lv_remetente_25_0= RULE_STRING
            	    {
            	    lv_remetente_25_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            	    					newLeafNode(lv_remetente_25_0, grammarAccess.getMemorandoAccess().getRemetenteSTRINGTerminalRuleCall_25_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMemorandoRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"remetente",
            	    						lv_remetente_25_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            // InternalMemorando.g:417:3: (otherlv_26= ', Cargo Remetente: ' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==23) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMemorando.g:418:4: otherlv_26= ', Cargo Remetente: '
            	    {
            	    otherlv_26=(Token)match(input,23,FOLLOW_23); 

            	    				newLeafNode(otherlv_26, grammarAccess.getMemorandoAccess().getCargoRemetenteKeyword_26());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            // InternalMemorando.g:423:3: ( (lv_cargoRemetente_27_0= RULE_STRING ) )
            // InternalMemorando.g:424:4: (lv_cargoRemetente_27_0= RULE_STRING )
            {
            // InternalMemorando.g:424:4: (lv_cargoRemetente_27_0= RULE_STRING )
            // InternalMemorando.g:425:5: lv_cargoRemetente_27_0= RULE_STRING
            {
            lv_cargoRemetente_27_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_cargoRemetente_27_0, grammarAccess.getMemorandoAccess().getCargoRemetenteSTRINGTerminalRuleCall_27_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemorandoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cargoRemetente",
            						lv_cargoRemetente_27_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleMemorando"


    // $ANTLR start "entryRuleDestino"
    // InternalMemorando.g:445:1: entryRuleDestino returns [EObject current=null] : iv_ruleDestino= ruleDestino EOF ;
    public final EObject entryRuleDestino() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestino = null;


        try {
            // InternalMemorando.g:445:48: (iv_ruleDestino= ruleDestino EOF )
            // InternalMemorando.g:446:2: iv_ruleDestino= ruleDestino EOF
            {
             newCompositeNode(grammarAccess.getDestinoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDestino=ruleDestino();

            state._fsp--;

             current =iv_ruleDestino; 
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
    // $ANTLR end "entryRuleDestino"


    // $ANTLR start "ruleDestino"
    // InternalMemorando.g:452:1: ruleDestino returns [EObject current=null] : ( (lv_destino_0_0= RULE_ID ) ) ;
    public final EObject ruleDestino() throws RecognitionException {
        EObject current = null;

        Token lv_destino_0_0=null;


        	enterRule();

        try {
            // InternalMemorando.g:458:2: ( ( (lv_destino_0_0= RULE_ID ) ) )
            // InternalMemorando.g:459:2: ( (lv_destino_0_0= RULE_ID ) )
            {
            // InternalMemorando.g:459:2: ( (lv_destino_0_0= RULE_ID ) )
            // InternalMemorando.g:460:3: (lv_destino_0_0= RULE_ID )
            {
            // InternalMemorando.g:460:3: (lv_destino_0_0= RULE_ID )
            // InternalMemorando.g:461:4: lv_destino_0_0= RULE_ID
            {
            lv_destino_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_destino_0_0, grammarAccess.getDestinoAccess().getDestinoIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDestinoRule());
            				}
            				setWithLastConsumed(
            					current,
            					"destino",
            					lv_destino_0_0,
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
    // $ANTLR end "ruleDestino"


    // $ANTLR start "entryRuleParagrafo"
    // InternalMemorando.g:480:1: entryRuleParagrafo returns [EObject current=null] : iv_ruleParagrafo= ruleParagrafo EOF ;
    public final EObject entryRuleParagrafo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagrafo = null;


        try {
            // InternalMemorando.g:480:50: (iv_ruleParagrafo= ruleParagrafo EOF )
            // InternalMemorando.g:481:2: iv_ruleParagrafo= ruleParagrafo EOF
            {
             newCompositeNode(grammarAccess.getParagrafoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParagrafo=ruleParagrafo();

            state._fsp--;

             current =iv_ruleParagrafo; 
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
    // $ANTLR end "entryRuleParagrafo"


    // $ANTLR start "ruleParagrafo"
    // InternalMemorando.g:487:1: ruleParagrafo returns [EObject current=null] : ( (lv_paragrafo_0_0= RULE_STRING ) ) ;
    public final EObject ruleParagrafo() throws RecognitionException {
        EObject current = null;

        Token lv_paragrafo_0_0=null;


        	enterRule();

        try {
            // InternalMemorando.g:493:2: ( ( (lv_paragrafo_0_0= RULE_STRING ) ) )
            // InternalMemorando.g:494:2: ( (lv_paragrafo_0_0= RULE_STRING ) )
            {
            // InternalMemorando.g:494:2: ( (lv_paragrafo_0_0= RULE_STRING ) )
            // InternalMemorando.g:495:3: (lv_paragrafo_0_0= RULE_STRING )
            {
            // InternalMemorando.g:495:3: (lv_paragrafo_0_0= RULE_STRING )
            // InternalMemorando.g:496:4: lv_paragrafo_0_0= RULE_STRING
            {
            lv_paragrafo_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_paragrafo_0_0, grammarAccess.getParagrafoAccess().getParagrafoSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParagrafoRule());
            				}
            				setWithLastConsumed(
            					current,
            					"paragrafo",
            					lv_paragrafo_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleParagrafo"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000300020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000600040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800040L});

}