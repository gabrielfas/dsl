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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Numero'", "':'", "'Setores Destinatarios'", "'['", "']'", "'Setor Remetente'", "'Cidade'", "'Estado'", "'Data'", "'/'", "'Cargos Destinatarios'", "'Assunto'", "'Destinos'", "'Mensagem'", "'Remetente'", "'Cargo Remetente'", "';'", "' '"
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
    // InternalMemorando.g:107:1: ruleMemorando returns [EObject current=null] : (otherlv_0= 'Numero' otherlv_1= ':' ( (lv_numero_2_0= RULE_INT ) ) otherlv_3= 'Setores Destinatarios' otherlv_4= ':' otherlv_5= '[' ( (lv_setoresDestinatarios_6_0= ruleSetorDestinatario ) )* otherlv_7= ']' otherlv_8= 'Setor Remetente' otherlv_9= ':' ( (lv_setorRemetente_10_0= RULE_ID ) ) otherlv_11= 'Cidade' otherlv_12= ':' ( (lv_cidade_13_0= RULE_ID ) ) otherlv_14= 'Estado' otherlv_15= ':' ( (lv_estado_16_0= RULE_ID ) ) otherlv_17= 'Data' otherlv_18= ':' ( (lv_dia_19_0= RULE_INT ) ) otherlv_20= '/' ( (lv_mes_21_0= RULE_ID ) ) otherlv_22= '/' ( (lv_ano_23_0= RULE_INT ) ) otherlv_24= 'Cargos Destinatarios' otherlv_25= ':' otherlv_26= '[' ( (lv_cargosDestinatarios_27_0= ruleCargoDestinatario ) )* otherlv_28= ']' otherlv_29= 'Assunto' otherlv_30= ':' ( (lv_assunto_31_0= RULE_STRING ) ) otherlv_32= 'Destinos' otherlv_33= ':' otherlv_34= '[' ( (lv_destinos_35_0= ruleDestino ) )* otherlv_36= ']' otherlv_37= 'Mensagem' otherlv_38= ':' otherlv_39= '[' ( (lv_paragrafos_40_0= ruleParagrafo ) )* otherlv_41= ']' otherlv_42= 'Remetente' otherlv_43= ':' ( (lv_remetente_44_0= RULE_STRING ) ) otherlv_45= 'Cargo Remetente' otherlv_46= ':' ( (lv_cargoRemetente_47_0= RULE_STRING ) ) otherlv_48= ';' ) ;
    public final EObject ruleMemorando() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_numero_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_setorRemetente_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_cidade_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_estado_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_dia_19_0=null;
        Token otherlv_20=null;
        Token lv_mes_21_0=null;
        Token otherlv_22=null;
        Token lv_ano_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token lv_assunto_31_0=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token lv_remetente_44_0=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token lv_cargoRemetente_47_0=null;
        Token otherlv_48=null;
        EObject lv_setoresDestinatarios_6_0 = null;

        EObject lv_cargosDestinatarios_27_0 = null;

        EObject lv_destinos_35_0 = null;

        EObject lv_paragrafos_40_0 = null;



        	enterRule();

        try {
            // InternalMemorando.g:113:2: ( (otherlv_0= 'Numero' otherlv_1= ':' ( (lv_numero_2_0= RULE_INT ) ) otherlv_3= 'Setores Destinatarios' otherlv_4= ':' otherlv_5= '[' ( (lv_setoresDestinatarios_6_0= ruleSetorDestinatario ) )* otherlv_7= ']' otherlv_8= 'Setor Remetente' otherlv_9= ':' ( (lv_setorRemetente_10_0= RULE_ID ) ) otherlv_11= 'Cidade' otherlv_12= ':' ( (lv_cidade_13_0= RULE_ID ) ) otherlv_14= 'Estado' otherlv_15= ':' ( (lv_estado_16_0= RULE_ID ) ) otherlv_17= 'Data' otherlv_18= ':' ( (lv_dia_19_0= RULE_INT ) ) otherlv_20= '/' ( (lv_mes_21_0= RULE_ID ) ) otherlv_22= '/' ( (lv_ano_23_0= RULE_INT ) ) otherlv_24= 'Cargos Destinatarios' otherlv_25= ':' otherlv_26= '[' ( (lv_cargosDestinatarios_27_0= ruleCargoDestinatario ) )* otherlv_28= ']' otherlv_29= 'Assunto' otherlv_30= ':' ( (lv_assunto_31_0= RULE_STRING ) ) otherlv_32= 'Destinos' otherlv_33= ':' otherlv_34= '[' ( (lv_destinos_35_0= ruleDestino ) )* otherlv_36= ']' otherlv_37= 'Mensagem' otherlv_38= ':' otherlv_39= '[' ( (lv_paragrafos_40_0= ruleParagrafo ) )* otherlv_41= ']' otherlv_42= 'Remetente' otherlv_43= ':' ( (lv_remetente_44_0= RULE_STRING ) ) otherlv_45= 'Cargo Remetente' otherlv_46= ':' ( (lv_cargoRemetente_47_0= RULE_STRING ) ) otherlv_48= ';' ) )
            // InternalMemorando.g:114:2: (otherlv_0= 'Numero' otherlv_1= ':' ( (lv_numero_2_0= RULE_INT ) ) otherlv_3= 'Setores Destinatarios' otherlv_4= ':' otherlv_5= '[' ( (lv_setoresDestinatarios_6_0= ruleSetorDestinatario ) )* otherlv_7= ']' otherlv_8= 'Setor Remetente' otherlv_9= ':' ( (lv_setorRemetente_10_0= RULE_ID ) ) otherlv_11= 'Cidade' otherlv_12= ':' ( (lv_cidade_13_0= RULE_ID ) ) otherlv_14= 'Estado' otherlv_15= ':' ( (lv_estado_16_0= RULE_ID ) ) otherlv_17= 'Data' otherlv_18= ':' ( (lv_dia_19_0= RULE_INT ) ) otherlv_20= '/' ( (lv_mes_21_0= RULE_ID ) ) otherlv_22= '/' ( (lv_ano_23_0= RULE_INT ) ) otherlv_24= 'Cargos Destinatarios' otherlv_25= ':' otherlv_26= '[' ( (lv_cargosDestinatarios_27_0= ruleCargoDestinatario ) )* otherlv_28= ']' otherlv_29= 'Assunto' otherlv_30= ':' ( (lv_assunto_31_0= RULE_STRING ) ) otherlv_32= 'Destinos' otherlv_33= ':' otherlv_34= '[' ( (lv_destinos_35_0= ruleDestino ) )* otherlv_36= ']' otherlv_37= 'Mensagem' otherlv_38= ':' otherlv_39= '[' ( (lv_paragrafos_40_0= ruleParagrafo ) )* otherlv_41= ']' otherlv_42= 'Remetente' otherlv_43= ':' ( (lv_remetente_44_0= RULE_STRING ) ) otherlv_45= 'Cargo Remetente' otherlv_46= ':' ( (lv_cargoRemetente_47_0= RULE_STRING ) ) otherlv_48= ';' )
            {
            // InternalMemorando.g:114:2: (otherlv_0= 'Numero' otherlv_1= ':' ( (lv_numero_2_0= RULE_INT ) ) otherlv_3= 'Setores Destinatarios' otherlv_4= ':' otherlv_5= '[' ( (lv_setoresDestinatarios_6_0= ruleSetorDestinatario ) )* otherlv_7= ']' otherlv_8= 'Setor Remetente' otherlv_9= ':' ( (lv_setorRemetente_10_0= RULE_ID ) ) otherlv_11= 'Cidade' otherlv_12= ':' ( (lv_cidade_13_0= RULE_ID ) ) otherlv_14= 'Estado' otherlv_15= ':' ( (lv_estado_16_0= RULE_ID ) ) otherlv_17= 'Data' otherlv_18= ':' ( (lv_dia_19_0= RULE_INT ) ) otherlv_20= '/' ( (lv_mes_21_0= RULE_ID ) ) otherlv_22= '/' ( (lv_ano_23_0= RULE_INT ) ) otherlv_24= 'Cargos Destinatarios' otherlv_25= ':' otherlv_26= '[' ( (lv_cargosDestinatarios_27_0= ruleCargoDestinatario ) )* otherlv_28= ']' otherlv_29= 'Assunto' otherlv_30= ':' ( (lv_assunto_31_0= RULE_STRING ) ) otherlv_32= 'Destinos' otherlv_33= ':' otherlv_34= '[' ( (lv_destinos_35_0= ruleDestino ) )* otherlv_36= ']' otherlv_37= 'Mensagem' otherlv_38= ':' otherlv_39= '[' ( (lv_paragrafos_40_0= ruleParagrafo ) )* otherlv_41= ']' otherlv_42= 'Remetente' otherlv_43= ':' ( (lv_remetente_44_0= RULE_STRING ) ) otherlv_45= 'Cargo Remetente' otherlv_46= ':' ( (lv_cargoRemetente_47_0= RULE_STRING ) ) otherlv_48= ';' )
            // InternalMemorando.g:115:3: otherlv_0= 'Numero' otherlv_1= ':' ( (lv_numero_2_0= RULE_INT ) ) otherlv_3= 'Setores Destinatarios' otherlv_4= ':' otherlv_5= '[' ( (lv_setoresDestinatarios_6_0= ruleSetorDestinatario ) )* otherlv_7= ']' otherlv_8= 'Setor Remetente' otherlv_9= ':' ( (lv_setorRemetente_10_0= RULE_ID ) ) otherlv_11= 'Cidade' otherlv_12= ':' ( (lv_cidade_13_0= RULE_ID ) ) otherlv_14= 'Estado' otherlv_15= ':' ( (lv_estado_16_0= RULE_ID ) ) otherlv_17= 'Data' otherlv_18= ':' ( (lv_dia_19_0= RULE_INT ) ) otherlv_20= '/' ( (lv_mes_21_0= RULE_ID ) ) otherlv_22= '/' ( (lv_ano_23_0= RULE_INT ) ) otherlv_24= 'Cargos Destinatarios' otherlv_25= ':' otherlv_26= '[' ( (lv_cargosDestinatarios_27_0= ruleCargoDestinatario ) )* otherlv_28= ']' otherlv_29= 'Assunto' otherlv_30= ':' ( (lv_assunto_31_0= RULE_STRING ) ) otherlv_32= 'Destinos' otherlv_33= ':' otherlv_34= '[' ( (lv_destinos_35_0= ruleDestino ) )* otherlv_36= ']' otherlv_37= 'Mensagem' otherlv_38= ':' otherlv_39= '[' ( (lv_paragrafos_40_0= ruleParagrafo ) )* otherlv_41= ']' otherlv_42= 'Remetente' otherlv_43= ':' ( (lv_remetente_44_0= RULE_STRING ) ) otherlv_45= 'Cargo Remetente' otherlv_46= ':' ( (lv_cargoRemetente_47_0= RULE_STRING ) ) otherlv_48= ';'
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

            			newLeafNode(otherlv_3, grammarAccess.getMemorandoAccess().getSetoresDestinatariosKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getMemorandoAccess().getColonKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getMemorandoAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalMemorando.g:153:3: ( (lv_setoresDestinatarios_6_0= ruleSetorDestinatario ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMemorando.g:154:4: (lv_setoresDestinatarios_6_0= ruleSetorDestinatario )
            	    {
            	    // InternalMemorando.g:154:4: (lv_setoresDestinatarios_6_0= ruleSetorDestinatario )
            	    // InternalMemorando.g:155:5: lv_setoresDestinatarios_6_0= ruleSetorDestinatario
            	    {

            	    					newCompositeNode(grammarAccess.getMemorandoAccess().getSetoresDestinatariosSetorDestinatarioParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_setoresDestinatarios_6_0=ruleSetorDestinatario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMemorandoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"setoresDestinatarios",
            	    						lv_setoresDestinatarios_6_0,
            	    						"org.xtext.example.mydsl.Memorando.SetorDestinatario");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getMemorandoAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getMemorandoAccess().getSetorRemetenteKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getMemorandoAccess().getColonKeyword_9());
            		
            // InternalMemorando.g:184:3: ( (lv_setorRemetente_10_0= RULE_ID ) )
            // InternalMemorando.g:185:4: (lv_setorRemetente_10_0= RULE_ID )
            {
            // InternalMemorando.g:185:4: (lv_setorRemetente_10_0= RULE_ID )
            // InternalMemorando.g:186:5: lv_setorRemetente_10_0= RULE_ID
            {
            lv_setorRemetente_10_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_setorRemetente_10_0, grammarAccess.getMemorandoAccess().getSetorRemetenteIDTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemorandoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"setorRemetente",
            						lv_setorRemetente_10_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getMemorandoAccess().getCidadeKeyword_11());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_12, grammarAccess.getMemorandoAccess().getColonKeyword_12());
            		
            // InternalMemorando.g:210:3: ( (lv_cidade_13_0= RULE_ID ) )
            // InternalMemorando.g:211:4: (lv_cidade_13_0= RULE_ID )
            {
            // InternalMemorando.g:211:4: (lv_cidade_13_0= RULE_ID )
            // InternalMemorando.g:212:5: lv_cidade_13_0= RULE_ID
            {
            lv_cidade_13_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_cidade_13_0, grammarAccess.getMemorandoAccess().getCidadeIDTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemorandoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cidade",
            						lv_cidade_13_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_14=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_14, grammarAccess.getMemorandoAccess().getEstadoKeyword_14());
            		
            otherlv_15=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_15, grammarAccess.getMemorandoAccess().getColonKeyword_15());
            		
            // InternalMemorando.g:236:3: ( (lv_estado_16_0= RULE_ID ) )
            // InternalMemorando.g:237:4: (lv_estado_16_0= RULE_ID )
            {
            // InternalMemorando.g:237:4: (lv_estado_16_0= RULE_ID )
            // InternalMemorando.g:238:5: lv_estado_16_0= RULE_ID
            {
            lv_estado_16_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_estado_16_0, grammarAccess.getMemorandoAccess().getEstadoIDTerminalRuleCall_16_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemorandoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"estado",
            						lv_estado_16_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_17=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_17, grammarAccess.getMemorandoAccess().getDataKeyword_17());
            		
            otherlv_18=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_18, grammarAccess.getMemorandoAccess().getColonKeyword_18());
            		
            // InternalMemorando.g:262:3: ( (lv_dia_19_0= RULE_INT ) )
            // InternalMemorando.g:263:4: (lv_dia_19_0= RULE_INT )
            {
            // InternalMemorando.g:263:4: (lv_dia_19_0= RULE_INT )
            // InternalMemorando.g:264:5: lv_dia_19_0= RULE_INT
            {
            lv_dia_19_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_dia_19_0, grammarAccess.getMemorandoAccess().getDiaINTTerminalRuleCall_19_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemorandoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dia",
            						lv_dia_19_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_20=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_20, grammarAccess.getMemorandoAccess().getSolidusKeyword_20());
            		
            // InternalMemorando.g:284:3: ( (lv_mes_21_0= RULE_ID ) )
            // InternalMemorando.g:285:4: (lv_mes_21_0= RULE_ID )
            {
            // InternalMemorando.g:285:4: (lv_mes_21_0= RULE_ID )
            // InternalMemorando.g:286:5: lv_mes_21_0= RULE_ID
            {
            lv_mes_21_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_mes_21_0, grammarAccess.getMemorandoAccess().getMesIDTerminalRuleCall_21_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemorandoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mes",
            						lv_mes_21_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_22=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_22, grammarAccess.getMemorandoAccess().getSolidusKeyword_22());
            		
            // InternalMemorando.g:306:3: ( (lv_ano_23_0= RULE_INT ) )
            // InternalMemorando.g:307:4: (lv_ano_23_0= RULE_INT )
            {
            // InternalMemorando.g:307:4: (lv_ano_23_0= RULE_INT )
            // InternalMemorando.g:308:5: lv_ano_23_0= RULE_INT
            {
            lv_ano_23_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_ano_23_0, grammarAccess.getMemorandoAccess().getAnoINTTerminalRuleCall_23_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemorandoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ano",
            						lv_ano_23_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_24=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_24, grammarAccess.getMemorandoAccess().getCargosDestinatariosKeyword_24());
            		
            otherlv_25=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_25, grammarAccess.getMemorandoAccess().getColonKeyword_25());
            		
            otherlv_26=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_26, grammarAccess.getMemorandoAccess().getLeftSquareBracketKeyword_26());
            		
            // InternalMemorando.g:336:3: ( (lv_cargosDestinatarios_27_0= ruleCargoDestinatario ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMemorando.g:337:4: (lv_cargosDestinatarios_27_0= ruleCargoDestinatario )
            	    {
            	    // InternalMemorando.g:337:4: (lv_cargosDestinatarios_27_0= ruleCargoDestinatario )
            	    // InternalMemorando.g:338:5: lv_cargosDestinatarios_27_0= ruleCargoDestinatario
            	    {

            	    					newCompositeNode(grammarAccess.getMemorandoAccess().getCargosDestinatariosCargoDestinatarioParserRuleCall_27_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_cargosDestinatarios_27_0=ruleCargoDestinatario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMemorandoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cargosDestinatarios",
            	    						lv_cargosDestinatarios_27_0,
            	    						"org.xtext.example.mydsl.Memorando.CargoDestinatario");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_28=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_28, grammarAccess.getMemorandoAccess().getRightSquareBracketKeyword_28());
            		
            otherlv_29=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_29, grammarAccess.getMemorandoAccess().getAssuntoKeyword_29());
            		
            otherlv_30=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_30, grammarAccess.getMemorandoAccess().getColonKeyword_30());
            		
            // InternalMemorando.g:367:3: ( (lv_assunto_31_0= RULE_STRING ) )
            // InternalMemorando.g:368:4: (lv_assunto_31_0= RULE_STRING )
            {
            // InternalMemorando.g:368:4: (lv_assunto_31_0= RULE_STRING )
            // InternalMemorando.g:369:5: lv_assunto_31_0= RULE_STRING
            {
            lv_assunto_31_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_assunto_31_0, grammarAccess.getMemorandoAccess().getAssuntoSTRINGTerminalRuleCall_31_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemorandoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"assunto",
            						lv_assunto_31_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_32=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_32, grammarAccess.getMemorandoAccess().getDestinosKeyword_32());
            		
            otherlv_33=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_33, grammarAccess.getMemorandoAccess().getColonKeyword_33());
            		
            otherlv_34=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_34, grammarAccess.getMemorandoAccess().getLeftSquareBracketKeyword_34());
            		
            // InternalMemorando.g:397:3: ( (lv_destinos_35_0= ruleDestino ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMemorando.g:398:4: (lv_destinos_35_0= ruleDestino )
            	    {
            	    // InternalMemorando.g:398:4: (lv_destinos_35_0= ruleDestino )
            	    // InternalMemorando.g:399:5: lv_destinos_35_0= ruleDestino
            	    {

            	    					newCompositeNode(grammarAccess.getMemorandoAccess().getDestinosDestinoParserRuleCall_35_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_destinos_35_0=ruleDestino();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMemorandoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"destinos",
            	    						lv_destinos_35_0,
            	    						"org.xtext.example.mydsl.Memorando.Destino");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_36=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_36, grammarAccess.getMemorandoAccess().getRightSquareBracketKeyword_36());
            		
            otherlv_37=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_37, grammarAccess.getMemorandoAccess().getMensagemKeyword_37());
            		
            otherlv_38=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_38, grammarAccess.getMemorandoAccess().getColonKeyword_38());
            		
            otherlv_39=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_39, grammarAccess.getMemorandoAccess().getLeftSquareBracketKeyword_39());
            		
            // InternalMemorando.g:432:3: ( (lv_paragrafos_40_0= ruleParagrafo ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMemorando.g:433:4: (lv_paragrafos_40_0= ruleParagrafo )
            	    {
            	    // InternalMemorando.g:433:4: (lv_paragrafos_40_0= ruleParagrafo )
            	    // InternalMemorando.g:434:5: lv_paragrafos_40_0= ruleParagrafo
            	    {

            	    					newCompositeNode(grammarAccess.getMemorandoAccess().getParagrafosParagrafoParserRuleCall_40_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_paragrafos_40_0=ruleParagrafo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMemorandoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"paragrafos",
            	    						lv_paragrafos_40_0,
            	    						"org.xtext.example.mydsl.Memorando.Paragrafo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_41=(Token)match(input,15,FOLLOW_21); 

            			newLeafNode(otherlv_41, grammarAccess.getMemorandoAccess().getRightSquareBracketKeyword_41());
            		
            otherlv_42=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_42, grammarAccess.getMemorandoAccess().getRemetenteKeyword_42());
            		
            otherlv_43=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_43, grammarAccess.getMemorandoAccess().getColonKeyword_43());
            		
            // InternalMemorando.g:463:3: ( (lv_remetente_44_0= RULE_STRING ) )
            // InternalMemorando.g:464:4: (lv_remetente_44_0= RULE_STRING )
            {
            // InternalMemorando.g:464:4: (lv_remetente_44_0= RULE_STRING )
            // InternalMemorando.g:465:5: lv_remetente_44_0= RULE_STRING
            {
            lv_remetente_44_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_remetente_44_0, grammarAccess.getMemorandoAccess().getRemetenteSTRINGTerminalRuleCall_44_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemorandoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"remetente",
            						lv_remetente_44_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_45=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_45, grammarAccess.getMemorandoAccess().getCargoRemetenteKeyword_45());
            		
            otherlv_46=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_46, grammarAccess.getMemorandoAccess().getColonKeyword_46());
            		
            // InternalMemorando.g:489:3: ( (lv_cargoRemetente_47_0= RULE_STRING ) )
            // InternalMemorando.g:490:4: (lv_cargoRemetente_47_0= RULE_STRING )
            {
            // InternalMemorando.g:490:4: (lv_cargoRemetente_47_0= RULE_STRING )
            // InternalMemorando.g:491:5: lv_cargoRemetente_47_0= RULE_STRING
            {
            lv_cargoRemetente_47_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_cargoRemetente_47_0, grammarAccess.getMemorandoAccess().getCargoRemetenteSTRINGTerminalRuleCall_47_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemorandoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cargoRemetente",
            						lv_cargoRemetente_47_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_48=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_48, grammarAccess.getMemorandoAccess().getSemicolonKeyword_48());
            		

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
    // InternalMemorando.g:515:1: entryRuleDestino returns [EObject current=null] : iv_ruleDestino= ruleDestino EOF ;
    public final EObject entryRuleDestino() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestino = null;


        try {
            // InternalMemorando.g:515:48: (iv_ruleDestino= ruleDestino EOF )
            // InternalMemorando.g:516:2: iv_ruleDestino= ruleDestino EOF
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
    // InternalMemorando.g:522:1: ruleDestino returns [EObject current=null] : ( ( (lv_destino_0_0= RULE_ID ) ) (otherlv_1= ' ' )? ) ;
    public final EObject ruleDestino() throws RecognitionException {
        EObject current = null;

        Token lv_destino_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMemorando.g:528:2: ( ( ( (lv_destino_0_0= RULE_ID ) ) (otherlv_1= ' ' )? ) )
            // InternalMemorando.g:529:2: ( ( (lv_destino_0_0= RULE_ID ) ) (otherlv_1= ' ' )? )
            {
            // InternalMemorando.g:529:2: ( ( (lv_destino_0_0= RULE_ID ) ) (otherlv_1= ' ' )? )
            // InternalMemorando.g:530:3: ( (lv_destino_0_0= RULE_ID ) ) (otherlv_1= ' ' )?
            {
            // InternalMemorando.g:530:3: ( (lv_destino_0_0= RULE_ID ) )
            // InternalMemorando.g:531:4: (lv_destino_0_0= RULE_ID )
            {
            // InternalMemorando.g:531:4: (lv_destino_0_0= RULE_ID )
            // InternalMemorando.g:532:5: lv_destino_0_0= RULE_ID
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

            // InternalMemorando.g:548:3: (otherlv_1= ' ' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMemorando.g:549:4: otherlv_1= ' '
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
    // InternalMemorando.g:558:1: entryRuleParagrafo returns [EObject current=null] : iv_ruleParagrafo= ruleParagrafo EOF ;
    public final EObject entryRuleParagrafo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagrafo = null;


        try {
            // InternalMemorando.g:558:50: (iv_ruleParagrafo= ruleParagrafo EOF )
            // InternalMemorando.g:559:2: iv_ruleParagrafo= ruleParagrafo EOF
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
    // InternalMemorando.g:565:1: ruleParagrafo returns [EObject current=null] : ( ( (lv_paragrafo_0_0= RULE_STRING ) ) (otherlv_1= ' ' )? ) ;
    public final EObject ruleParagrafo() throws RecognitionException {
        EObject current = null;

        Token lv_paragrafo_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMemorando.g:571:2: ( ( ( (lv_paragrafo_0_0= RULE_STRING ) ) (otherlv_1= ' ' )? ) )
            // InternalMemorando.g:572:2: ( ( (lv_paragrafo_0_0= RULE_STRING ) ) (otherlv_1= ' ' )? )
            {
            // InternalMemorando.g:572:2: ( ( (lv_paragrafo_0_0= RULE_STRING ) ) (otherlv_1= ' ' )? )
            // InternalMemorando.g:573:3: ( (lv_paragrafo_0_0= RULE_STRING ) ) (otherlv_1= ' ' )?
            {
            // InternalMemorando.g:573:3: ( (lv_paragrafo_0_0= RULE_STRING ) )
            // InternalMemorando.g:574:4: (lv_paragrafo_0_0= RULE_STRING )
            {
            // InternalMemorando.g:574:4: (lv_paragrafo_0_0= RULE_STRING )
            // InternalMemorando.g:575:5: lv_paragrafo_0_0= RULE_STRING
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

            // InternalMemorando.g:591:3: (otherlv_1= ' ' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMemorando.g:592:4: otherlv_1= ' '
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


    // $ANTLR start "entryRuleSetorDestinatario"
    // InternalMemorando.g:601:1: entryRuleSetorDestinatario returns [EObject current=null] : iv_ruleSetorDestinatario= ruleSetorDestinatario EOF ;
    public final EObject entryRuleSetorDestinatario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetorDestinatario = null;


        try {
            // InternalMemorando.g:601:58: (iv_ruleSetorDestinatario= ruleSetorDestinatario EOF )
            // InternalMemorando.g:602:2: iv_ruleSetorDestinatario= ruleSetorDestinatario EOF
            {
             newCompositeNode(grammarAccess.getSetorDestinatarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetorDestinatario=ruleSetorDestinatario();

            state._fsp--;

             current =iv_ruleSetorDestinatario; 
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
    // $ANTLR end "entryRuleSetorDestinatario"


    // $ANTLR start "ruleSetorDestinatario"
    // InternalMemorando.g:608:1: ruleSetorDestinatario returns [EObject current=null] : ( ( (lv_setorDestinatario_0_0= RULE_ID ) ) (otherlv_1= ' ' )? ) ;
    public final EObject ruleSetorDestinatario() throws RecognitionException {
        EObject current = null;

        Token lv_setorDestinatario_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMemorando.g:614:2: ( ( ( (lv_setorDestinatario_0_0= RULE_ID ) ) (otherlv_1= ' ' )? ) )
            // InternalMemorando.g:615:2: ( ( (lv_setorDestinatario_0_0= RULE_ID ) ) (otherlv_1= ' ' )? )
            {
            // InternalMemorando.g:615:2: ( ( (lv_setorDestinatario_0_0= RULE_ID ) ) (otherlv_1= ' ' )? )
            // InternalMemorando.g:616:3: ( (lv_setorDestinatario_0_0= RULE_ID ) ) (otherlv_1= ' ' )?
            {
            // InternalMemorando.g:616:3: ( (lv_setorDestinatario_0_0= RULE_ID ) )
            // InternalMemorando.g:617:4: (lv_setorDestinatario_0_0= RULE_ID )
            {
            // InternalMemorando.g:617:4: (lv_setorDestinatario_0_0= RULE_ID )
            // InternalMemorando.g:618:5: lv_setorDestinatario_0_0= RULE_ID
            {
            lv_setorDestinatario_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_setorDestinatario_0_0, grammarAccess.getSetorDestinatarioAccess().getSetorDestinatarioIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetorDestinatarioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"setorDestinatario",
            						lv_setorDestinatario_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMemorando.g:634:3: (otherlv_1= ' ' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMemorando.g:635:4: otherlv_1= ' '
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getSetorDestinatarioAccess().getSpaceKeyword_1());
                    			

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
    // $ANTLR end "ruleSetorDestinatario"


    // $ANTLR start "entryRuleCargoDestinatario"
    // InternalMemorando.g:644:1: entryRuleCargoDestinatario returns [EObject current=null] : iv_ruleCargoDestinatario= ruleCargoDestinatario EOF ;
    public final EObject entryRuleCargoDestinatario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCargoDestinatario = null;


        try {
            // InternalMemorando.g:644:58: (iv_ruleCargoDestinatario= ruleCargoDestinatario EOF )
            // InternalMemorando.g:645:2: iv_ruleCargoDestinatario= ruleCargoDestinatario EOF
            {
             newCompositeNode(grammarAccess.getCargoDestinatarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCargoDestinatario=ruleCargoDestinatario();

            state._fsp--;

             current =iv_ruleCargoDestinatario; 
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
    // $ANTLR end "entryRuleCargoDestinatario"


    // $ANTLR start "ruleCargoDestinatario"
    // InternalMemorando.g:651:1: ruleCargoDestinatario returns [EObject current=null] : ( ( (lv_cargoDestinatario_0_0= RULE_STRING ) ) (otherlv_1= ' ' )? ) ;
    public final EObject ruleCargoDestinatario() throws RecognitionException {
        EObject current = null;

        Token lv_cargoDestinatario_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMemorando.g:657:2: ( ( ( (lv_cargoDestinatario_0_0= RULE_STRING ) ) (otherlv_1= ' ' )? ) )
            // InternalMemorando.g:658:2: ( ( (lv_cargoDestinatario_0_0= RULE_STRING ) ) (otherlv_1= ' ' )? )
            {
            // InternalMemorando.g:658:2: ( ( (lv_cargoDestinatario_0_0= RULE_STRING ) ) (otherlv_1= ' ' )? )
            // InternalMemorando.g:659:3: ( (lv_cargoDestinatario_0_0= RULE_STRING ) ) (otherlv_1= ' ' )?
            {
            // InternalMemorando.g:659:3: ( (lv_cargoDestinatario_0_0= RULE_STRING ) )
            // InternalMemorando.g:660:4: (lv_cargoDestinatario_0_0= RULE_STRING )
            {
            // InternalMemorando.g:660:4: (lv_cargoDestinatario_0_0= RULE_STRING )
            // InternalMemorando.g:661:5: lv_cargoDestinatario_0_0= RULE_STRING
            {
            lv_cargoDestinatario_0_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_cargoDestinatario_0_0, grammarAccess.getCargoDestinatarioAccess().getCargoDestinatarioSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCargoDestinatarioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cargoDestinatario",
            						lv_cargoDestinatario_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMemorando.g:677:3: (otherlv_1= ' ' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMemorando.g:678:4: otherlv_1= ' '
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getCargoDestinatarioAccess().getSpaceKeyword_1());
                    			

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
    // $ANTLR end "ruleCargoDestinatario"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000002L});

}