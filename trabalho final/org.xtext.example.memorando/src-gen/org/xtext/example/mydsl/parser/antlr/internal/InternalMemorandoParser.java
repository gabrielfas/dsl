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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Numero'", "':'", "'Setor Destinatario'", "'Setor Remetente'", "'Cidade'", "'Estado'", "'Data'", "'/'", "'Cargo Destinatario'", "'Assunto'", "'Destinos'", "'['", "']'", "'Mensagem'", "'Remetente'", "'Cargo Remetente'", "';'", "' '"
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalMemorando.g:107:1: ruleMemorando returns [EObject current=null] : (otherlv_0= 'Numero' otherlv_1= ':' ( (lv_numero_2_0= RULE_INT ) ) otherlv_3= 'Setor Destinatario' otherlv_4= ':' ( (lv_setorDestinatario_5_0= RULE_ID ) ) otherlv_6= 'Setor Remetente' otherlv_7= ':' ( (lv_setorRemetente_8_0= RULE_ID ) ) otherlv_9= 'Cidade' otherlv_10= ':' ( (lv_cidade_11_0= RULE_ID ) ) otherlv_12= 'Estado' otherlv_13= ':' ( (lv_estado_14_0= RULE_ID ) ) otherlv_15= 'Data' otherlv_16= ':' ( (lv_dia_17_0= RULE_INT ) ) otherlv_18= '/' ( (lv_mes_19_0= RULE_ID ) ) otherlv_20= '/' ( (lv_ano_21_0= RULE_INT ) ) otherlv_22= 'Cargo Destinatario' otherlv_23= ':' ( (lv_cargoDestinatario_24_0= RULE_STRING ) ) otherlv_25= 'Assunto' otherlv_26= ':' ( (lv_assunto_27_0= RULE_STRING ) ) otherlv_28= 'Destinos' otherlv_29= ':' otherlv_30= '[' ( (lv_destinos_31_0= ruleDestino ) )* otherlv_32= ']' otherlv_33= 'Mensagem' otherlv_34= ':' otherlv_35= '[' ( (lv_paragrafos_36_0= ruleParagrafo ) )* otherlv_37= ']' otherlv_38= 'Remetente' otherlv_39= ':' ( (lv_remetente_40_0= RULE_STRING ) ) otherlv_41= 'Cargo Remetente' otherlv_42= ':' ( (lv_cargoRemetente_43_0= RULE_STRING ) ) otherlv_44= ';' ) ;
    public final EObject ruleMemorando() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_numero_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_setorDestinatario_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_setorRemetente_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_cidade_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_estado_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_dia_17_0=null;
        Token otherlv_18=null;
        Token lv_mes_19_0=null;
        Token otherlv_20=null;
        Token lv_ano_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_cargoDestinatario_24_0=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token lv_assunto_27_0=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token lv_remetente_40_0=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token lv_cargoRemetente_43_0=null;
        Token otherlv_44=null;
        EObject lv_destinos_31_0 = null;

        EObject lv_paragrafos_36_0 = null;



        	enterRule();

        try {
            // InternalMemorando.g:113:2: ( (otherlv_0= 'Numero' otherlv_1= ':' ( (lv_numero_2_0= RULE_INT ) ) otherlv_3= 'Setor Destinatario' otherlv_4= ':' ( (lv_setorDestinatario_5_0= RULE_ID ) ) otherlv_6= 'Setor Remetente' otherlv_7= ':' ( (lv_setorRemetente_8_0= RULE_ID ) ) otherlv_9= 'Cidade' otherlv_10= ':' ( (lv_cidade_11_0= RULE_ID ) ) otherlv_12= 'Estado' otherlv_13= ':' ( (lv_estado_14_0= RULE_ID ) ) otherlv_15= 'Data' otherlv_16= ':' ( (lv_dia_17_0= RULE_INT ) ) otherlv_18= '/' ( (lv_mes_19_0= RULE_ID ) ) otherlv_20= '/' ( (lv_ano_21_0= RULE_INT ) ) otherlv_22= 'Cargo Destinatario' otherlv_23= ':' ( (lv_cargoDestinatario_24_0= RULE_STRING ) ) otherlv_25= 'Assunto' otherlv_26= ':' ( (lv_assunto_27_0= RULE_STRING ) ) otherlv_28= 'Destinos' otherlv_29= ':' otherlv_30= '[' ( (lv_destinos_31_0= ruleDestino ) )* otherlv_32= ']' otherlv_33= 'Mensagem' otherlv_34= ':' otherlv_35= '[' ( (lv_paragrafos_36_0= ruleParagrafo ) )* otherlv_37= ']' otherlv_38= 'Remetente' otherlv_39= ':' ( (lv_remetente_40_0= RULE_STRING ) ) otherlv_41= 'Cargo Remetente' otherlv_42= ':' ( (lv_cargoRemetente_43_0= RULE_STRING ) ) otherlv_44= ';' ) )
            // InternalMemorando.g:114:2: (otherlv_0= 'Numero' otherlv_1= ':' ( (lv_numero_2_0= RULE_INT ) ) otherlv_3= 'Setor Destinatario' otherlv_4= ':' ( (lv_setorDestinatario_5_0= RULE_ID ) ) otherlv_6= 'Setor Remetente' otherlv_7= ':' ( (lv_setorRemetente_8_0= RULE_ID ) ) otherlv_9= 'Cidade' otherlv_10= ':' ( (lv_cidade_11_0= RULE_ID ) ) otherlv_12= 'Estado' otherlv_13= ':' ( (lv_estado_14_0= RULE_ID ) ) otherlv_15= 'Data' otherlv_16= ':' ( (lv_dia_17_0= RULE_INT ) ) otherlv_18= '/' ( (lv_mes_19_0= RULE_ID ) ) otherlv_20= '/' ( (lv_ano_21_0= RULE_INT ) ) otherlv_22= 'Cargo Destinatario' otherlv_23= ':' ( (lv_cargoDestinatario_24_0= RULE_STRING ) ) otherlv_25= 'Assunto' otherlv_26= ':' ( (lv_assunto_27_0= RULE_STRING ) ) otherlv_28= 'Destinos' otherlv_29= ':' otherlv_30= '[' ( (lv_destinos_31_0= ruleDestino ) )* otherlv_32= ']' otherlv_33= 'Mensagem' otherlv_34= ':' otherlv_35= '[' ( (lv_paragrafos_36_0= ruleParagrafo ) )* otherlv_37= ']' otherlv_38= 'Remetente' otherlv_39= ':' ( (lv_remetente_40_0= RULE_STRING ) ) otherlv_41= 'Cargo Remetente' otherlv_42= ':' ( (lv_cargoRemetente_43_0= RULE_STRING ) ) otherlv_44= ';' )
            {
            // InternalMemorando.g:114:2: (otherlv_0= 'Numero' otherlv_1= ':' ( (lv_numero_2_0= RULE_INT ) ) otherlv_3= 'Setor Destinatario' otherlv_4= ':' ( (lv_setorDestinatario_5_0= RULE_ID ) ) otherlv_6= 'Setor Remetente' otherlv_7= ':' ( (lv_setorRemetente_8_0= RULE_ID ) ) otherlv_9= 'Cidade' otherlv_10= ':' ( (lv_cidade_11_0= RULE_ID ) ) otherlv_12= 'Estado' otherlv_13= ':' ( (lv_estado_14_0= RULE_ID ) ) otherlv_15= 'Data' otherlv_16= ':' ( (lv_dia_17_0= RULE_INT ) ) otherlv_18= '/' ( (lv_mes_19_0= RULE_ID ) ) otherlv_20= '/' ( (lv_ano_21_0= RULE_INT ) ) otherlv_22= 'Cargo Destinatario' otherlv_23= ':' ( (lv_cargoDestinatario_24_0= RULE_STRING ) ) otherlv_25= 'Assunto' otherlv_26= ':' ( (lv_assunto_27_0= RULE_STRING ) ) otherlv_28= 'Destinos' otherlv_29= ':' otherlv_30= '[' ( (lv_destinos_31_0= ruleDestino ) )* otherlv_32= ']' otherlv_33= 'Mensagem' otherlv_34= ':' otherlv_35= '[' ( (lv_paragrafos_36_0= ruleParagrafo ) )* otherlv_37= ']' otherlv_38= 'Remetente' otherlv_39= ':' ( (lv_remetente_40_0= RULE_STRING ) ) otherlv_41= 'Cargo Remetente' otherlv_42= ':' ( (lv_cargoRemetente_43_0= RULE_STRING ) ) otherlv_44= ';' )
            // InternalMemorando.g:115:3: otherlv_0= 'Numero' otherlv_1= ':' ( (lv_numero_2_0= RULE_INT ) ) otherlv_3= 'Setor Destinatario' otherlv_4= ':' ( (lv_setorDestinatario_5_0= RULE_ID ) ) otherlv_6= 'Setor Remetente' otherlv_7= ':' ( (lv_setorRemetente_8_0= RULE_ID ) ) otherlv_9= 'Cidade' otherlv_10= ':' ( (lv_cidade_11_0= RULE_ID ) ) otherlv_12= 'Estado' otherlv_13= ':' ( (lv_estado_14_0= RULE_ID ) ) otherlv_15= 'Data' otherlv_16= ':' ( (lv_dia_17_0= RULE_INT ) ) otherlv_18= '/' ( (lv_mes_19_0= RULE_ID ) ) otherlv_20= '/' ( (lv_ano_21_0= RULE_INT ) ) otherlv_22= 'Cargo Destinatario' otherlv_23= ':' ( (lv_cargoDestinatario_24_0= RULE_STRING ) ) otherlv_25= 'Assunto' otherlv_26= ':' ( (lv_assunto_27_0= RULE_STRING ) ) otherlv_28= 'Destinos' otherlv_29= ':' otherlv_30= '[' ( (lv_destinos_31_0= ruleDestino ) )* otherlv_32= ']' otherlv_33= 'Mensagem' otherlv_34= ':' otherlv_35= '[' ( (lv_paragrafos_36_0= ruleParagrafo ) )* otherlv_37= ']' otherlv_38= 'Remetente' otherlv_39= ':' ( (lv_remetente_40_0= RULE_STRING ) ) otherlv_41= 'Cargo Remetente' otherlv_42= ':' ( (lv_cargoRemetente_43_0= RULE_STRING ) ) otherlv_44= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMemorandoAccess().getNumeroKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMemorandoAccess().getColonKeyword_1());
            		
            // InternalMemorando.g:123:3: ( (lv_numero_2_0= RULE_INT ) )
            // InternalMemorando.g:124:4: (lv_numero_2_0= RULE_INT )
            {
            // InternalMemorando.g:124:4: (lv_numero_2_0= RULE_INT )
            // InternalMemorando.g:125:5: lv_numero_2_0= RULE_INT
            {
            lv_numero_2_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_numero_2_0, grammarAccess.getMemorandoAccess().getNumeroINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemorandoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"numero",
            						lv_numero_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getMemorandoAccess().getSetorDestinatarioKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getMemorandoAccess().getColonKeyword_4());
            		
            // InternalMemorando.g:149:3: ( (lv_setorDestinatario_5_0= RULE_ID ) )
            // InternalMemorando.g:150:4: (lv_setorDestinatario_5_0= RULE_ID )
            {
            // InternalMemorando.g:150:4: (lv_setorDestinatario_5_0= RULE_ID )
            // InternalMemorando.g:151:5: lv_setorDestinatario_5_0= RULE_ID
            {
            lv_setorDestinatario_5_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_setorDestinatario_5_0, grammarAccess.getMemorandoAccess().getSetorDestinatarioIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemorandoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"setorDestinatario",
            						lv_setorDestinatario_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getMemorandoAccess().getSetorRemetenteKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getMemorandoAccess().getColonKeyword_7());
            		
            // InternalMemorando.g:175:3: ( (lv_setorRemetente_8_0= RULE_ID ) )
            // InternalMemorando.g:176:4: (lv_setorRemetente_8_0= RULE_ID )
            {
            // InternalMemorando.g:176:4: (lv_setorRemetente_8_0= RULE_ID )
            // InternalMemorando.g:177:5: lv_setorRemetente_8_0= RULE_ID
            {
            lv_setorRemetente_8_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_setorRemetente_8_0, grammarAccess.getMemorandoAccess().getSetorRemetenteIDTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemorandoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"setorRemetente",
            						lv_setorRemetente_8_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getMemorandoAccess().getCidadeKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getMemorandoAccess().getColonKeyword_10());
            		
            // InternalMemorando.g:201:3: ( (lv_cidade_11_0= RULE_ID ) )
            // InternalMemorando.g:202:4: (lv_cidade_11_0= RULE_ID )
            {
            // InternalMemorando.g:202:4: (lv_cidade_11_0= RULE_ID )
            // InternalMemorando.g:203:5: lv_cidade_11_0= RULE_ID
            {
            lv_cidade_11_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_cidade_11_0, grammarAccess.getMemorandoAccess().getCidadeIDTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemorandoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cidade",
            						lv_cidade_11_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getMemorandoAccess().getEstadoKeyword_12());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_13, grammarAccess.getMemorandoAccess().getColonKeyword_13());
            		
            // InternalMemorando.g:227:3: ( (lv_estado_14_0= RULE_ID ) )
            // InternalMemorando.g:228:4: (lv_estado_14_0= RULE_ID )
            {
            // InternalMemorando.g:228:4: (lv_estado_14_0= RULE_ID )
            // InternalMemorando.g:229:5: lv_estado_14_0= RULE_ID
            {
            lv_estado_14_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_estado_14_0, grammarAccess.getMemorandoAccess().getEstadoIDTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemorandoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"estado",
            						lv_estado_14_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_15=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_15, grammarAccess.getMemorandoAccess().getDataKeyword_15());
            		
            otherlv_16=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_16, grammarAccess.getMemorandoAccess().getColonKeyword_16());
            		
            // InternalMemorando.g:253:3: ( (lv_dia_17_0= RULE_INT ) )
            // InternalMemorando.g:254:4: (lv_dia_17_0= RULE_INT )
            {
            // InternalMemorando.g:254:4: (lv_dia_17_0= RULE_INT )
            // InternalMemorando.g:255:5: lv_dia_17_0= RULE_INT
            {
            lv_dia_17_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_dia_17_0, grammarAccess.getMemorandoAccess().getDiaINTTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemorandoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dia",
            						lv_dia_17_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_18=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_18, grammarAccess.getMemorandoAccess().getSolidusKeyword_18());
            		
            // InternalMemorando.g:275:3: ( (lv_mes_19_0= RULE_ID ) )
            // InternalMemorando.g:276:4: (lv_mes_19_0= RULE_ID )
            {
            // InternalMemorando.g:276:4: (lv_mes_19_0= RULE_ID )
            // InternalMemorando.g:277:5: lv_mes_19_0= RULE_ID
            {
            lv_mes_19_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_mes_19_0, grammarAccess.getMemorandoAccess().getMesIDTerminalRuleCall_19_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemorandoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mes",
            						lv_mes_19_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_20=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_20, grammarAccess.getMemorandoAccess().getSolidusKeyword_20());
            		
            // InternalMemorando.g:297:3: ( (lv_ano_21_0= RULE_INT ) )
            // InternalMemorando.g:298:4: (lv_ano_21_0= RULE_INT )
            {
            // InternalMemorando.g:298:4: (lv_ano_21_0= RULE_INT )
            // InternalMemorando.g:299:5: lv_ano_21_0= RULE_INT
            {
            lv_ano_21_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_ano_21_0, grammarAccess.getMemorandoAccess().getAnoINTTerminalRuleCall_21_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemorandoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ano",
            						lv_ano_21_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_22=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_22, grammarAccess.getMemorandoAccess().getCargoDestinatarioKeyword_22());
            		
            otherlv_23=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_23, grammarAccess.getMemorandoAccess().getColonKeyword_23());
            		
            // InternalMemorando.g:323:3: ( (lv_cargoDestinatario_24_0= RULE_STRING ) )
            // InternalMemorando.g:324:4: (lv_cargoDestinatario_24_0= RULE_STRING )
            {
            // InternalMemorando.g:324:4: (lv_cargoDestinatario_24_0= RULE_STRING )
            // InternalMemorando.g:325:5: lv_cargoDestinatario_24_0= RULE_STRING
            {
            lv_cargoDestinatario_24_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_cargoDestinatario_24_0, grammarAccess.getMemorandoAccess().getCargoDestinatarioSTRINGTerminalRuleCall_24_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemorandoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cargoDestinatario",
            						lv_cargoDestinatario_24_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_25=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_25, grammarAccess.getMemorandoAccess().getAssuntoKeyword_25());
            		
            otherlv_26=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_26, grammarAccess.getMemorandoAccess().getColonKeyword_26());
            		
            // InternalMemorando.g:349:3: ( (lv_assunto_27_0= RULE_STRING ) )
            // InternalMemorando.g:350:4: (lv_assunto_27_0= RULE_STRING )
            {
            // InternalMemorando.g:350:4: (lv_assunto_27_0= RULE_STRING )
            // InternalMemorando.g:351:5: lv_assunto_27_0= RULE_STRING
            {
            lv_assunto_27_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_assunto_27_0, grammarAccess.getMemorandoAccess().getAssuntoSTRINGTerminalRuleCall_27_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemorandoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"assunto",
            						lv_assunto_27_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_28=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_28, grammarAccess.getMemorandoAccess().getDestinosKeyword_28());
            		
            otherlv_29=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_29, grammarAccess.getMemorandoAccess().getColonKeyword_29());
            		
            otherlv_30=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_30, grammarAccess.getMemorandoAccess().getLeftSquareBracketKeyword_30());
            		
            // InternalMemorando.g:379:3: ( (lv_destinos_31_0= ruleDestino ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMemorando.g:380:4: (lv_destinos_31_0= ruleDestino )
            	    {
            	    // InternalMemorando.g:380:4: (lv_destinos_31_0= ruleDestino )
            	    // InternalMemorando.g:381:5: lv_destinos_31_0= ruleDestino
            	    {

            	    					newCompositeNode(grammarAccess.getMemorandoAccess().getDestinosDestinoParserRuleCall_31_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_destinos_31_0=ruleDestino();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMemorandoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"destinos",
            	    						lv_destinos_31_0,
            	    						"org.xtext.example.mydsl.Memorando.Destino");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_32=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_32, grammarAccess.getMemorandoAccess().getRightSquareBracketKeyword_32());
            		
            otherlv_33=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_33, grammarAccess.getMemorandoAccess().getMensagemKeyword_33());
            		
            otherlv_34=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_34, grammarAccess.getMemorandoAccess().getColonKeyword_34());
            		
            otherlv_35=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_35, grammarAccess.getMemorandoAccess().getLeftSquareBracketKeyword_35());
            		
            // InternalMemorando.g:414:3: ( (lv_paragrafos_36_0= ruleParagrafo ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMemorando.g:415:4: (lv_paragrafos_36_0= ruleParagrafo )
            	    {
            	    // InternalMemorando.g:415:4: (lv_paragrafos_36_0= ruleParagrafo )
            	    // InternalMemorando.g:416:5: lv_paragrafos_36_0= ruleParagrafo
            	    {

            	    					newCompositeNode(grammarAccess.getMemorandoAccess().getParagrafosParagrafoParserRuleCall_36_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_paragrafos_36_0=ruleParagrafo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMemorandoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"paragrafos",
            	    						lv_paragrafos_36_0,
            	    						"org.xtext.example.mydsl.Memorando.Paragrafo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_37=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_37, grammarAccess.getMemorandoAccess().getRightSquareBracketKeyword_37());
            		
            otherlv_38=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_38, grammarAccess.getMemorandoAccess().getRemetenteKeyword_38());
            		
            otherlv_39=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_39, grammarAccess.getMemorandoAccess().getColonKeyword_39());
            		
            // InternalMemorando.g:445:3: ( (lv_remetente_40_0= RULE_STRING ) )
            // InternalMemorando.g:446:4: (lv_remetente_40_0= RULE_STRING )
            {
            // InternalMemorando.g:446:4: (lv_remetente_40_0= RULE_STRING )
            // InternalMemorando.g:447:5: lv_remetente_40_0= RULE_STRING
            {
            lv_remetente_40_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_remetente_40_0, grammarAccess.getMemorandoAccess().getRemetenteSTRINGTerminalRuleCall_40_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemorandoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"remetente",
            						lv_remetente_40_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_41=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_41, grammarAccess.getMemorandoAccess().getCargoRemetenteKeyword_41());
            		
            otherlv_42=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_42, grammarAccess.getMemorandoAccess().getColonKeyword_42());
            		
            // InternalMemorando.g:471:3: ( (lv_cargoRemetente_43_0= RULE_STRING ) )
            // InternalMemorando.g:472:4: (lv_cargoRemetente_43_0= RULE_STRING )
            {
            // InternalMemorando.g:472:4: (lv_cargoRemetente_43_0= RULE_STRING )
            // InternalMemorando.g:473:5: lv_cargoRemetente_43_0= RULE_STRING
            {
            lv_cargoRemetente_43_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_cargoRemetente_43_0, grammarAccess.getMemorandoAccess().getCargoRemetenteSTRINGTerminalRuleCall_43_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemorandoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cargoRemetente",
            						lv_cargoRemetente_43_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_44=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_44, grammarAccess.getMemorandoAccess().getSemicolonKeyword_44());
            		

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
    // InternalMemorando.g:497:1: entryRuleDestino returns [EObject current=null] : iv_ruleDestino= ruleDestino EOF ;
    public final EObject entryRuleDestino() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestino = null;


        try {
            // InternalMemorando.g:497:48: (iv_ruleDestino= ruleDestino EOF )
            // InternalMemorando.g:498:2: iv_ruleDestino= ruleDestino EOF
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
    // InternalMemorando.g:504:1: ruleDestino returns [EObject current=null] : ( ( (lv_destino_0_0= RULE_ID ) ) (otherlv_1= ' ' )? ) ;
    public final EObject ruleDestino() throws RecognitionException {
        EObject current = null;

        Token lv_destino_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMemorando.g:510:2: ( ( ( (lv_destino_0_0= RULE_ID ) ) (otherlv_1= ' ' )? ) )
            // InternalMemorando.g:511:2: ( ( (lv_destino_0_0= RULE_ID ) ) (otherlv_1= ' ' )? )
            {
            // InternalMemorando.g:511:2: ( ( (lv_destino_0_0= RULE_ID ) ) (otherlv_1= ' ' )? )
            // InternalMemorando.g:512:3: ( (lv_destino_0_0= RULE_ID ) ) (otherlv_1= ' ' )?
            {
            // InternalMemorando.g:512:3: ( (lv_destino_0_0= RULE_ID ) )
            // InternalMemorando.g:513:4: (lv_destino_0_0= RULE_ID )
            {
            // InternalMemorando.g:513:4: (lv_destino_0_0= RULE_ID )
            // InternalMemorando.g:514:5: lv_destino_0_0= RULE_ID
            {
            lv_destino_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_destino_0_0, grammarAccess.getDestinoAccess().getDestinoIDTerminalRuleCall_0_0());
            				

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

            // InternalMemorando.g:530:3: (otherlv_1= ' ' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMemorando.g:531:4: otherlv_1= ' '
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getDestinoAccess().getSpaceKeyword_1());
                    			

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
    // $ANTLR end "ruleDestino"


    // $ANTLR start "entryRuleParagrafo"
    // InternalMemorando.g:540:1: entryRuleParagrafo returns [EObject current=null] : iv_ruleParagrafo= ruleParagrafo EOF ;
    public final EObject entryRuleParagrafo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagrafo = null;


        try {
            // InternalMemorando.g:540:50: (iv_ruleParagrafo= ruleParagrafo EOF )
            // InternalMemorando.g:541:2: iv_ruleParagrafo= ruleParagrafo EOF
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
    // InternalMemorando.g:547:1: ruleParagrafo returns [EObject current=null] : ( ( (lv_paragrafo_0_0= RULE_STRING ) ) (otherlv_1= ' ' )? ) ;
    public final EObject ruleParagrafo() throws RecognitionException {
        EObject current = null;

        Token lv_paragrafo_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMemorando.g:553:2: ( ( ( (lv_paragrafo_0_0= RULE_STRING ) ) (otherlv_1= ' ' )? ) )
            // InternalMemorando.g:554:2: ( ( (lv_paragrafo_0_0= RULE_STRING ) ) (otherlv_1= ' ' )? )
            {
            // InternalMemorando.g:554:2: ( ( (lv_paragrafo_0_0= RULE_STRING ) ) (otherlv_1= ' ' )? )
            // InternalMemorando.g:555:3: ( (lv_paragrafo_0_0= RULE_STRING ) ) (otherlv_1= ' ' )?
            {
            // InternalMemorando.g:555:3: ( (lv_paragrafo_0_0= RULE_STRING ) )
            // InternalMemorando.g:556:4: (lv_paragrafo_0_0= RULE_STRING )
            {
            // InternalMemorando.g:556:4: (lv_paragrafo_0_0= RULE_STRING )
            // InternalMemorando.g:557:5: lv_paragrafo_0_0= RULE_STRING
            {
            lv_paragrafo_0_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_paragrafo_0_0, grammarAccess.getParagrafoAccess().getParagrafoSTRINGTerminalRuleCall_0_0());
            				

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

            // InternalMemorando.g:573:3: (otherlv_1= ' ' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMemorando.g:574:4: otherlv_1= ' '
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getParagrafoAccess().getSpaceKeyword_1());
                    			

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
    // $ANTLR end "ruleParagrafo"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000002L});

}