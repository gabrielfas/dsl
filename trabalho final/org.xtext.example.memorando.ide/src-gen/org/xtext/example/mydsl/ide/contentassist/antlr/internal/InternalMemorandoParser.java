package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MemorandoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMemorandoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Numero'", "':'", "'Setores Destinatarios'", "'['", "']'", "'Setor Remetente'", "'Cidade'", "'Estado'", "'Data'", "'/'", "'Cargos Destinatarios'", "'Assunto'", "'Mensagem'", "'Remetente'", "'Cargo Remetente'", "';'", "' '"
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

    	public void setGrammarAccess(MemorandoGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMemorando.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMemorando.g:54:1: ( ruleModel EOF )
            // InternalMemorando.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMemorando.g:62:1: ruleModel : ( ( rule__Model__MemorandosAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:66:2: ( ( ( rule__Model__MemorandosAssignment )* ) )
            // InternalMemorando.g:67:2: ( ( rule__Model__MemorandosAssignment )* )
            {
            // InternalMemorando.g:67:2: ( ( rule__Model__MemorandosAssignment )* )
            // InternalMemorando.g:68:3: ( rule__Model__MemorandosAssignment )*
            {
             before(grammarAccess.getModelAccess().getMemorandosAssignment()); 
            // InternalMemorando.g:69:3: ( rule__Model__MemorandosAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMemorando.g:69:4: rule__Model__MemorandosAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__MemorandosAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getMemorandosAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMemorando"
    // InternalMemorando.g:78:1: entryRuleMemorando : ruleMemorando EOF ;
    public final void entryRuleMemorando() throws RecognitionException {
        try {
            // InternalMemorando.g:79:1: ( ruleMemorando EOF )
            // InternalMemorando.g:80:1: ruleMemorando EOF
            {
             before(grammarAccess.getMemorandoRule()); 
            pushFollow(FOLLOW_1);
            ruleMemorando();

            state._fsp--;

             after(grammarAccess.getMemorandoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMemorando"


    // $ANTLR start "ruleMemorando"
    // InternalMemorando.g:87:1: ruleMemorando : ( ( rule__Memorando__Group__0 ) ) ;
    public final void ruleMemorando() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:91:2: ( ( ( rule__Memorando__Group__0 ) ) )
            // InternalMemorando.g:92:2: ( ( rule__Memorando__Group__0 ) )
            {
            // InternalMemorando.g:92:2: ( ( rule__Memorando__Group__0 ) )
            // InternalMemorando.g:93:3: ( rule__Memorando__Group__0 )
            {
             before(grammarAccess.getMemorandoAccess().getGroup()); 
            // InternalMemorando.g:94:3: ( rule__Memorando__Group__0 )
            // InternalMemorando.g:94:4: rule__Memorando__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMemorando"


    // $ANTLR start "entryRuleParagrafo"
    // InternalMemorando.g:103:1: entryRuleParagrafo : ruleParagrafo EOF ;
    public final void entryRuleParagrafo() throws RecognitionException {
        try {
            // InternalMemorando.g:104:1: ( ruleParagrafo EOF )
            // InternalMemorando.g:105:1: ruleParagrafo EOF
            {
             before(grammarAccess.getParagrafoRule()); 
            pushFollow(FOLLOW_1);
            ruleParagrafo();

            state._fsp--;

             after(grammarAccess.getParagrafoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParagrafo"


    // $ANTLR start "ruleParagrafo"
    // InternalMemorando.g:112:1: ruleParagrafo : ( ( rule__Paragrafo__Group__0 ) ) ;
    public final void ruleParagrafo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:116:2: ( ( ( rule__Paragrafo__Group__0 ) ) )
            // InternalMemorando.g:117:2: ( ( rule__Paragrafo__Group__0 ) )
            {
            // InternalMemorando.g:117:2: ( ( rule__Paragrafo__Group__0 ) )
            // InternalMemorando.g:118:3: ( rule__Paragrafo__Group__0 )
            {
             before(grammarAccess.getParagrafoAccess().getGroup()); 
            // InternalMemorando.g:119:3: ( rule__Paragrafo__Group__0 )
            // InternalMemorando.g:119:4: rule__Paragrafo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Paragrafo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParagrafoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParagrafo"


    // $ANTLR start "entryRuleSetorDestinatario"
    // InternalMemorando.g:128:1: entryRuleSetorDestinatario : ruleSetorDestinatario EOF ;
    public final void entryRuleSetorDestinatario() throws RecognitionException {
        try {
            // InternalMemorando.g:129:1: ( ruleSetorDestinatario EOF )
            // InternalMemorando.g:130:1: ruleSetorDestinatario EOF
            {
             before(grammarAccess.getSetorDestinatarioRule()); 
            pushFollow(FOLLOW_1);
            ruleSetorDestinatario();

            state._fsp--;

             after(grammarAccess.getSetorDestinatarioRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetorDestinatario"


    // $ANTLR start "ruleSetorDestinatario"
    // InternalMemorando.g:137:1: ruleSetorDestinatario : ( ( rule__SetorDestinatario__Group__0 ) ) ;
    public final void ruleSetorDestinatario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:141:2: ( ( ( rule__SetorDestinatario__Group__0 ) ) )
            // InternalMemorando.g:142:2: ( ( rule__SetorDestinatario__Group__0 ) )
            {
            // InternalMemorando.g:142:2: ( ( rule__SetorDestinatario__Group__0 ) )
            // InternalMemorando.g:143:3: ( rule__SetorDestinatario__Group__0 )
            {
             before(grammarAccess.getSetorDestinatarioAccess().getGroup()); 
            // InternalMemorando.g:144:3: ( rule__SetorDestinatario__Group__0 )
            // InternalMemorando.g:144:4: rule__SetorDestinatario__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetorDestinatario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetorDestinatarioAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetorDestinatario"


    // $ANTLR start "entryRuleCargoDestinatario"
    // InternalMemorando.g:153:1: entryRuleCargoDestinatario : ruleCargoDestinatario EOF ;
    public final void entryRuleCargoDestinatario() throws RecognitionException {
        try {
            // InternalMemorando.g:154:1: ( ruleCargoDestinatario EOF )
            // InternalMemorando.g:155:1: ruleCargoDestinatario EOF
            {
             before(grammarAccess.getCargoDestinatarioRule()); 
            pushFollow(FOLLOW_1);
            ruleCargoDestinatario();

            state._fsp--;

             after(grammarAccess.getCargoDestinatarioRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCargoDestinatario"


    // $ANTLR start "ruleCargoDestinatario"
    // InternalMemorando.g:162:1: ruleCargoDestinatario : ( ( rule__CargoDestinatario__Group__0 ) ) ;
    public final void ruleCargoDestinatario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:166:2: ( ( ( rule__CargoDestinatario__Group__0 ) ) )
            // InternalMemorando.g:167:2: ( ( rule__CargoDestinatario__Group__0 ) )
            {
            // InternalMemorando.g:167:2: ( ( rule__CargoDestinatario__Group__0 ) )
            // InternalMemorando.g:168:3: ( rule__CargoDestinatario__Group__0 )
            {
             before(grammarAccess.getCargoDestinatarioAccess().getGroup()); 
            // InternalMemorando.g:169:3: ( rule__CargoDestinatario__Group__0 )
            // InternalMemorando.g:169:4: rule__CargoDestinatario__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CargoDestinatario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCargoDestinatarioAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCargoDestinatario"


    // $ANTLR start "rule__Memorando__Group__0"
    // InternalMemorando.g:177:1: rule__Memorando__Group__0 : rule__Memorando__Group__0__Impl rule__Memorando__Group__1 ;
    public final void rule__Memorando__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:181:1: ( rule__Memorando__Group__0__Impl rule__Memorando__Group__1 )
            // InternalMemorando.g:182:2: rule__Memorando__Group__0__Impl rule__Memorando__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Memorando__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__0"


    // $ANTLR start "rule__Memorando__Group__0__Impl"
    // InternalMemorando.g:189:1: rule__Memorando__Group__0__Impl : ( 'Numero' ) ;
    public final void rule__Memorando__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:193:1: ( ( 'Numero' ) )
            // InternalMemorando.g:194:1: ( 'Numero' )
            {
            // InternalMemorando.g:194:1: ( 'Numero' )
            // InternalMemorando.g:195:2: 'Numero'
            {
             before(grammarAccess.getMemorandoAccess().getNumeroKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getNumeroKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__0__Impl"


    // $ANTLR start "rule__Memorando__Group__1"
    // InternalMemorando.g:204:1: rule__Memorando__Group__1 : rule__Memorando__Group__1__Impl rule__Memorando__Group__2 ;
    public final void rule__Memorando__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:208:1: ( rule__Memorando__Group__1__Impl rule__Memorando__Group__2 )
            // InternalMemorando.g:209:2: rule__Memorando__Group__1__Impl rule__Memorando__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Memorando__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__1"


    // $ANTLR start "rule__Memorando__Group__1__Impl"
    // InternalMemorando.g:216:1: rule__Memorando__Group__1__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:220:1: ( ( ':' ) )
            // InternalMemorando.g:221:1: ( ':' )
            {
            // InternalMemorando.g:221:1: ( ':' )
            // InternalMemorando.g:222:2: ':'
            {
             before(grammarAccess.getMemorandoAccess().getColonKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__1__Impl"


    // $ANTLR start "rule__Memorando__Group__2"
    // InternalMemorando.g:231:1: rule__Memorando__Group__2 : rule__Memorando__Group__2__Impl rule__Memorando__Group__3 ;
    public final void rule__Memorando__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:235:1: ( rule__Memorando__Group__2__Impl rule__Memorando__Group__3 )
            // InternalMemorando.g:236:2: rule__Memorando__Group__2__Impl rule__Memorando__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Memorando__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__2"


    // $ANTLR start "rule__Memorando__Group__2__Impl"
    // InternalMemorando.g:243:1: rule__Memorando__Group__2__Impl : ( ( rule__Memorando__NumeroAssignment_2 ) ) ;
    public final void rule__Memorando__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:247:1: ( ( ( rule__Memorando__NumeroAssignment_2 ) ) )
            // InternalMemorando.g:248:1: ( ( rule__Memorando__NumeroAssignment_2 ) )
            {
            // InternalMemorando.g:248:1: ( ( rule__Memorando__NumeroAssignment_2 ) )
            // InternalMemorando.g:249:2: ( rule__Memorando__NumeroAssignment_2 )
            {
             before(grammarAccess.getMemorandoAccess().getNumeroAssignment_2()); 
            // InternalMemorando.g:250:2: ( rule__Memorando__NumeroAssignment_2 )
            // InternalMemorando.g:250:3: rule__Memorando__NumeroAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__NumeroAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getNumeroAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__2__Impl"


    // $ANTLR start "rule__Memorando__Group__3"
    // InternalMemorando.g:258:1: rule__Memorando__Group__3 : rule__Memorando__Group__3__Impl rule__Memorando__Group__4 ;
    public final void rule__Memorando__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:262:1: ( rule__Memorando__Group__3__Impl rule__Memorando__Group__4 )
            // InternalMemorando.g:263:2: rule__Memorando__Group__3__Impl rule__Memorando__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Memorando__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__3"


    // $ANTLR start "rule__Memorando__Group__3__Impl"
    // InternalMemorando.g:270:1: rule__Memorando__Group__3__Impl : ( 'Setores Destinatarios' ) ;
    public final void rule__Memorando__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:274:1: ( ( 'Setores Destinatarios' ) )
            // InternalMemorando.g:275:1: ( 'Setores Destinatarios' )
            {
            // InternalMemorando.g:275:1: ( 'Setores Destinatarios' )
            // InternalMemorando.g:276:2: 'Setores Destinatarios'
            {
             before(grammarAccess.getMemorandoAccess().getSetoresDestinatariosKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getSetoresDestinatariosKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__3__Impl"


    // $ANTLR start "rule__Memorando__Group__4"
    // InternalMemorando.g:285:1: rule__Memorando__Group__4 : rule__Memorando__Group__4__Impl rule__Memorando__Group__5 ;
    public final void rule__Memorando__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:289:1: ( rule__Memorando__Group__4__Impl rule__Memorando__Group__5 )
            // InternalMemorando.g:290:2: rule__Memorando__Group__4__Impl rule__Memorando__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Memorando__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__4"


    // $ANTLR start "rule__Memorando__Group__4__Impl"
    // InternalMemorando.g:297:1: rule__Memorando__Group__4__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:301:1: ( ( ':' ) )
            // InternalMemorando.g:302:1: ( ':' )
            {
            // InternalMemorando.g:302:1: ( ':' )
            // InternalMemorando.g:303:2: ':'
            {
             before(grammarAccess.getMemorandoAccess().getColonKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__4__Impl"


    // $ANTLR start "rule__Memorando__Group__5"
    // InternalMemorando.g:312:1: rule__Memorando__Group__5 : rule__Memorando__Group__5__Impl rule__Memorando__Group__6 ;
    public final void rule__Memorando__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:316:1: ( rule__Memorando__Group__5__Impl rule__Memorando__Group__6 )
            // InternalMemorando.g:317:2: rule__Memorando__Group__5__Impl rule__Memorando__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Memorando__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__5"


    // $ANTLR start "rule__Memorando__Group__5__Impl"
    // InternalMemorando.g:324:1: rule__Memorando__Group__5__Impl : ( '[' ) ;
    public final void rule__Memorando__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:328:1: ( ( '[' ) )
            // InternalMemorando.g:329:1: ( '[' )
            {
            // InternalMemorando.g:329:1: ( '[' )
            // InternalMemorando.g:330:2: '['
            {
             before(grammarAccess.getMemorandoAccess().getLeftSquareBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getLeftSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__5__Impl"


    // $ANTLR start "rule__Memorando__Group__6"
    // InternalMemorando.g:339:1: rule__Memorando__Group__6 : rule__Memorando__Group__6__Impl rule__Memorando__Group__7 ;
    public final void rule__Memorando__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:343:1: ( rule__Memorando__Group__6__Impl rule__Memorando__Group__7 )
            // InternalMemorando.g:344:2: rule__Memorando__Group__6__Impl rule__Memorando__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Memorando__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__6"


    // $ANTLR start "rule__Memorando__Group__6__Impl"
    // InternalMemorando.g:351:1: rule__Memorando__Group__6__Impl : ( ( rule__Memorando__SetoresDestinatariosAssignment_6 )* ) ;
    public final void rule__Memorando__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:355:1: ( ( ( rule__Memorando__SetoresDestinatariosAssignment_6 )* ) )
            // InternalMemorando.g:356:1: ( ( rule__Memorando__SetoresDestinatariosAssignment_6 )* )
            {
            // InternalMemorando.g:356:1: ( ( rule__Memorando__SetoresDestinatariosAssignment_6 )* )
            // InternalMemorando.g:357:2: ( rule__Memorando__SetoresDestinatariosAssignment_6 )*
            {
             before(grammarAccess.getMemorandoAccess().getSetoresDestinatariosAssignment_6()); 
            // InternalMemorando.g:358:2: ( rule__Memorando__SetoresDestinatariosAssignment_6 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMemorando.g:358:3: rule__Memorando__SetoresDestinatariosAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Memorando__SetoresDestinatariosAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getSetoresDestinatariosAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__6__Impl"


    // $ANTLR start "rule__Memorando__Group__7"
    // InternalMemorando.g:366:1: rule__Memorando__Group__7 : rule__Memorando__Group__7__Impl rule__Memorando__Group__8 ;
    public final void rule__Memorando__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:370:1: ( rule__Memorando__Group__7__Impl rule__Memorando__Group__8 )
            // InternalMemorando.g:371:2: rule__Memorando__Group__7__Impl rule__Memorando__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Memorando__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__7"


    // $ANTLR start "rule__Memorando__Group__7__Impl"
    // InternalMemorando.g:378:1: rule__Memorando__Group__7__Impl : ( ']' ) ;
    public final void rule__Memorando__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:382:1: ( ( ']' ) )
            // InternalMemorando.g:383:1: ( ']' )
            {
            // InternalMemorando.g:383:1: ( ']' )
            // InternalMemorando.g:384:2: ']'
            {
             before(grammarAccess.getMemorandoAccess().getRightSquareBracketKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__7__Impl"


    // $ANTLR start "rule__Memorando__Group__8"
    // InternalMemorando.g:393:1: rule__Memorando__Group__8 : rule__Memorando__Group__8__Impl rule__Memorando__Group__9 ;
    public final void rule__Memorando__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:397:1: ( rule__Memorando__Group__8__Impl rule__Memorando__Group__9 )
            // InternalMemorando.g:398:2: rule__Memorando__Group__8__Impl rule__Memorando__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__Memorando__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__8"


    // $ANTLR start "rule__Memorando__Group__8__Impl"
    // InternalMemorando.g:405:1: rule__Memorando__Group__8__Impl : ( 'Setor Remetente' ) ;
    public final void rule__Memorando__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:409:1: ( ( 'Setor Remetente' ) )
            // InternalMemorando.g:410:1: ( 'Setor Remetente' )
            {
            // InternalMemorando.g:410:1: ( 'Setor Remetente' )
            // InternalMemorando.g:411:2: 'Setor Remetente'
            {
             before(grammarAccess.getMemorandoAccess().getSetorRemetenteKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getSetorRemetenteKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__8__Impl"


    // $ANTLR start "rule__Memorando__Group__9"
    // InternalMemorando.g:420:1: rule__Memorando__Group__9 : rule__Memorando__Group__9__Impl rule__Memorando__Group__10 ;
    public final void rule__Memorando__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:424:1: ( rule__Memorando__Group__9__Impl rule__Memorando__Group__10 )
            // InternalMemorando.g:425:2: rule__Memorando__Group__9__Impl rule__Memorando__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Memorando__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__9"


    // $ANTLR start "rule__Memorando__Group__9__Impl"
    // InternalMemorando.g:432:1: rule__Memorando__Group__9__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:436:1: ( ( ':' ) )
            // InternalMemorando.g:437:1: ( ':' )
            {
            // InternalMemorando.g:437:1: ( ':' )
            // InternalMemorando.g:438:2: ':'
            {
             before(grammarAccess.getMemorandoAccess().getColonKeyword_9()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__9__Impl"


    // $ANTLR start "rule__Memorando__Group__10"
    // InternalMemorando.g:447:1: rule__Memorando__Group__10 : rule__Memorando__Group__10__Impl rule__Memorando__Group__11 ;
    public final void rule__Memorando__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:451:1: ( rule__Memorando__Group__10__Impl rule__Memorando__Group__11 )
            // InternalMemorando.g:452:2: rule__Memorando__Group__10__Impl rule__Memorando__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__Memorando__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__10"


    // $ANTLR start "rule__Memorando__Group__10__Impl"
    // InternalMemorando.g:459:1: rule__Memorando__Group__10__Impl : ( ( rule__Memorando__SetorRemetenteAssignment_10 ) ) ;
    public final void rule__Memorando__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:463:1: ( ( ( rule__Memorando__SetorRemetenteAssignment_10 ) ) )
            // InternalMemorando.g:464:1: ( ( rule__Memorando__SetorRemetenteAssignment_10 ) )
            {
            // InternalMemorando.g:464:1: ( ( rule__Memorando__SetorRemetenteAssignment_10 ) )
            // InternalMemorando.g:465:2: ( rule__Memorando__SetorRemetenteAssignment_10 )
            {
             before(grammarAccess.getMemorandoAccess().getSetorRemetenteAssignment_10()); 
            // InternalMemorando.g:466:2: ( rule__Memorando__SetorRemetenteAssignment_10 )
            // InternalMemorando.g:466:3: rule__Memorando__SetorRemetenteAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__SetorRemetenteAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getSetorRemetenteAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__10__Impl"


    // $ANTLR start "rule__Memorando__Group__11"
    // InternalMemorando.g:474:1: rule__Memorando__Group__11 : rule__Memorando__Group__11__Impl rule__Memorando__Group__12 ;
    public final void rule__Memorando__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:478:1: ( rule__Memorando__Group__11__Impl rule__Memorando__Group__12 )
            // InternalMemorando.g:479:2: rule__Memorando__Group__11__Impl rule__Memorando__Group__12
            {
            pushFollow(FOLLOW_4);
            rule__Memorando__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__11"


    // $ANTLR start "rule__Memorando__Group__11__Impl"
    // InternalMemorando.g:486:1: rule__Memorando__Group__11__Impl : ( 'Cidade' ) ;
    public final void rule__Memorando__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:490:1: ( ( 'Cidade' ) )
            // InternalMemorando.g:491:1: ( 'Cidade' )
            {
            // InternalMemorando.g:491:1: ( 'Cidade' )
            // InternalMemorando.g:492:2: 'Cidade'
            {
             before(grammarAccess.getMemorandoAccess().getCidadeKeyword_11()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getCidadeKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__11__Impl"


    // $ANTLR start "rule__Memorando__Group__12"
    // InternalMemorando.g:501:1: rule__Memorando__Group__12 : rule__Memorando__Group__12__Impl rule__Memorando__Group__13 ;
    public final void rule__Memorando__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:505:1: ( rule__Memorando__Group__12__Impl rule__Memorando__Group__13 )
            // InternalMemorando.g:506:2: rule__Memorando__Group__12__Impl rule__Memorando__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__Memorando__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__12"


    // $ANTLR start "rule__Memorando__Group__12__Impl"
    // InternalMemorando.g:513:1: rule__Memorando__Group__12__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:517:1: ( ( ':' ) )
            // InternalMemorando.g:518:1: ( ':' )
            {
            // InternalMemorando.g:518:1: ( ':' )
            // InternalMemorando.g:519:2: ':'
            {
             before(grammarAccess.getMemorandoAccess().getColonKeyword_12()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getColonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__12__Impl"


    // $ANTLR start "rule__Memorando__Group__13"
    // InternalMemorando.g:528:1: rule__Memorando__Group__13 : rule__Memorando__Group__13__Impl rule__Memorando__Group__14 ;
    public final void rule__Memorando__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:532:1: ( rule__Memorando__Group__13__Impl rule__Memorando__Group__14 )
            // InternalMemorando.g:533:2: rule__Memorando__Group__13__Impl rule__Memorando__Group__14
            {
            pushFollow(FOLLOW_13);
            rule__Memorando__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__13"


    // $ANTLR start "rule__Memorando__Group__13__Impl"
    // InternalMemorando.g:540:1: rule__Memorando__Group__13__Impl : ( ( rule__Memorando__CidadeAssignment_13 ) ) ;
    public final void rule__Memorando__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:544:1: ( ( ( rule__Memorando__CidadeAssignment_13 ) ) )
            // InternalMemorando.g:545:1: ( ( rule__Memorando__CidadeAssignment_13 ) )
            {
            // InternalMemorando.g:545:1: ( ( rule__Memorando__CidadeAssignment_13 ) )
            // InternalMemorando.g:546:2: ( rule__Memorando__CidadeAssignment_13 )
            {
             before(grammarAccess.getMemorandoAccess().getCidadeAssignment_13()); 
            // InternalMemorando.g:547:2: ( rule__Memorando__CidadeAssignment_13 )
            // InternalMemorando.g:547:3: rule__Memorando__CidadeAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__CidadeAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getCidadeAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__13__Impl"


    // $ANTLR start "rule__Memorando__Group__14"
    // InternalMemorando.g:555:1: rule__Memorando__Group__14 : rule__Memorando__Group__14__Impl rule__Memorando__Group__15 ;
    public final void rule__Memorando__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:559:1: ( rule__Memorando__Group__14__Impl rule__Memorando__Group__15 )
            // InternalMemorando.g:560:2: rule__Memorando__Group__14__Impl rule__Memorando__Group__15
            {
            pushFollow(FOLLOW_4);
            rule__Memorando__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__14"


    // $ANTLR start "rule__Memorando__Group__14__Impl"
    // InternalMemorando.g:567:1: rule__Memorando__Group__14__Impl : ( 'Estado' ) ;
    public final void rule__Memorando__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:571:1: ( ( 'Estado' ) )
            // InternalMemorando.g:572:1: ( 'Estado' )
            {
            // InternalMemorando.g:572:1: ( 'Estado' )
            // InternalMemorando.g:573:2: 'Estado'
            {
             before(grammarAccess.getMemorandoAccess().getEstadoKeyword_14()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getEstadoKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__14__Impl"


    // $ANTLR start "rule__Memorando__Group__15"
    // InternalMemorando.g:582:1: rule__Memorando__Group__15 : rule__Memorando__Group__15__Impl rule__Memorando__Group__16 ;
    public final void rule__Memorando__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:586:1: ( rule__Memorando__Group__15__Impl rule__Memorando__Group__16 )
            // InternalMemorando.g:587:2: rule__Memorando__Group__15__Impl rule__Memorando__Group__16
            {
            pushFollow(FOLLOW_11);
            rule__Memorando__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__15"


    // $ANTLR start "rule__Memorando__Group__15__Impl"
    // InternalMemorando.g:594:1: rule__Memorando__Group__15__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:598:1: ( ( ':' ) )
            // InternalMemorando.g:599:1: ( ':' )
            {
            // InternalMemorando.g:599:1: ( ':' )
            // InternalMemorando.g:600:2: ':'
            {
             before(grammarAccess.getMemorandoAccess().getColonKeyword_15()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getColonKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__15__Impl"


    // $ANTLR start "rule__Memorando__Group__16"
    // InternalMemorando.g:609:1: rule__Memorando__Group__16 : rule__Memorando__Group__16__Impl rule__Memorando__Group__17 ;
    public final void rule__Memorando__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:613:1: ( rule__Memorando__Group__16__Impl rule__Memorando__Group__17 )
            // InternalMemorando.g:614:2: rule__Memorando__Group__16__Impl rule__Memorando__Group__17
            {
            pushFollow(FOLLOW_14);
            rule__Memorando__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__16"


    // $ANTLR start "rule__Memorando__Group__16__Impl"
    // InternalMemorando.g:621:1: rule__Memorando__Group__16__Impl : ( ( rule__Memorando__EstadoAssignment_16 ) ) ;
    public final void rule__Memorando__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:625:1: ( ( ( rule__Memorando__EstadoAssignment_16 ) ) )
            // InternalMemorando.g:626:1: ( ( rule__Memorando__EstadoAssignment_16 ) )
            {
            // InternalMemorando.g:626:1: ( ( rule__Memorando__EstadoAssignment_16 ) )
            // InternalMemorando.g:627:2: ( rule__Memorando__EstadoAssignment_16 )
            {
             before(grammarAccess.getMemorandoAccess().getEstadoAssignment_16()); 
            // InternalMemorando.g:628:2: ( rule__Memorando__EstadoAssignment_16 )
            // InternalMemorando.g:628:3: rule__Memorando__EstadoAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__EstadoAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getEstadoAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__16__Impl"


    // $ANTLR start "rule__Memorando__Group__17"
    // InternalMemorando.g:636:1: rule__Memorando__Group__17 : rule__Memorando__Group__17__Impl rule__Memorando__Group__18 ;
    public final void rule__Memorando__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:640:1: ( rule__Memorando__Group__17__Impl rule__Memorando__Group__18 )
            // InternalMemorando.g:641:2: rule__Memorando__Group__17__Impl rule__Memorando__Group__18
            {
            pushFollow(FOLLOW_4);
            rule__Memorando__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__17"


    // $ANTLR start "rule__Memorando__Group__17__Impl"
    // InternalMemorando.g:648:1: rule__Memorando__Group__17__Impl : ( 'Data' ) ;
    public final void rule__Memorando__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:652:1: ( ( 'Data' ) )
            // InternalMemorando.g:653:1: ( 'Data' )
            {
            // InternalMemorando.g:653:1: ( 'Data' )
            // InternalMemorando.g:654:2: 'Data'
            {
             before(grammarAccess.getMemorandoAccess().getDataKeyword_17()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getDataKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__17__Impl"


    // $ANTLR start "rule__Memorando__Group__18"
    // InternalMemorando.g:663:1: rule__Memorando__Group__18 : rule__Memorando__Group__18__Impl rule__Memorando__Group__19 ;
    public final void rule__Memorando__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:667:1: ( rule__Memorando__Group__18__Impl rule__Memorando__Group__19 )
            // InternalMemorando.g:668:2: rule__Memorando__Group__18__Impl rule__Memorando__Group__19
            {
            pushFollow(FOLLOW_5);
            rule__Memorando__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__18"


    // $ANTLR start "rule__Memorando__Group__18__Impl"
    // InternalMemorando.g:675:1: rule__Memorando__Group__18__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:679:1: ( ( ':' ) )
            // InternalMemorando.g:680:1: ( ':' )
            {
            // InternalMemorando.g:680:1: ( ':' )
            // InternalMemorando.g:681:2: ':'
            {
             before(grammarAccess.getMemorandoAccess().getColonKeyword_18()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getColonKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__18__Impl"


    // $ANTLR start "rule__Memorando__Group__19"
    // InternalMemorando.g:690:1: rule__Memorando__Group__19 : rule__Memorando__Group__19__Impl rule__Memorando__Group__20 ;
    public final void rule__Memorando__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:694:1: ( rule__Memorando__Group__19__Impl rule__Memorando__Group__20 )
            // InternalMemorando.g:695:2: rule__Memorando__Group__19__Impl rule__Memorando__Group__20
            {
            pushFollow(FOLLOW_15);
            rule__Memorando__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__19"


    // $ANTLR start "rule__Memorando__Group__19__Impl"
    // InternalMemorando.g:702:1: rule__Memorando__Group__19__Impl : ( ( rule__Memorando__DiaAssignment_19 ) ) ;
    public final void rule__Memorando__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:706:1: ( ( ( rule__Memorando__DiaAssignment_19 ) ) )
            // InternalMemorando.g:707:1: ( ( rule__Memorando__DiaAssignment_19 ) )
            {
            // InternalMemorando.g:707:1: ( ( rule__Memorando__DiaAssignment_19 ) )
            // InternalMemorando.g:708:2: ( rule__Memorando__DiaAssignment_19 )
            {
             before(grammarAccess.getMemorandoAccess().getDiaAssignment_19()); 
            // InternalMemorando.g:709:2: ( rule__Memorando__DiaAssignment_19 )
            // InternalMemorando.g:709:3: rule__Memorando__DiaAssignment_19
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__DiaAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getDiaAssignment_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__19__Impl"


    // $ANTLR start "rule__Memorando__Group__20"
    // InternalMemorando.g:717:1: rule__Memorando__Group__20 : rule__Memorando__Group__20__Impl rule__Memorando__Group__21 ;
    public final void rule__Memorando__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:721:1: ( rule__Memorando__Group__20__Impl rule__Memorando__Group__21 )
            // InternalMemorando.g:722:2: rule__Memorando__Group__20__Impl rule__Memorando__Group__21
            {
            pushFollow(FOLLOW_11);
            rule__Memorando__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__20"


    // $ANTLR start "rule__Memorando__Group__20__Impl"
    // InternalMemorando.g:729:1: rule__Memorando__Group__20__Impl : ( '/' ) ;
    public final void rule__Memorando__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:733:1: ( ( '/' ) )
            // InternalMemorando.g:734:1: ( '/' )
            {
            // InternalMemorando.g:734:1: ( '/' )
            // InternalMemorando.g:735:2: '/'
            {
             before(grammarAccess.getMemorandoAccess().getSolidusKeyword_20()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getSolidusKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__20__Impl"


    // $ANTLR start "rule__Memorando__Group__21"
    // InternalMemorando.g:744:1: rule__Memorando__Group__21 : rule__Memorando__Group__21__Impl rule__Memorando__Group__22 ;
    public final void rule__Memorando__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:748:1: ( rule__Memorando__Group__21__Impl rule__Memorando__Group__22 )
            // InternalMemorando.g:749:2: rule__Memorando__Group__21__Impl rule__Memorando__Group__22
            {
            pushFollow(FOLLOW_15);
            rule__Memorando__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__21"


    // $ANTLR start "rule__Memorando__Group__21__Impl"
    // InternalMemorando.g:756:1: rule__Memorando__Group__21__Impl : ( ( rule__Memorando__MesAssignment_21 ) ) ;
    public final void rule__Memorando__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:760:1: ( ( ( rule__Memorando__MesAssignment_21 ) ) )
            // InternalMemorando.g:761:1: ( ( rule__Memorando__MesAssignment_21 ) )
            {
            // InternalMemorando.g:761:1: ( ( rule__Memorando__MesAssignment_21 ) )
            // InternalMemorando.g:762:2: ( rule__Memorando__MesAssignment_21 )
            {
             before(grammarAccess.getMemorandoAccess().getMesAssignment_21()); 
            // InternalMemorando.g:763:2: ( rule__Memorando__MesAssignment_21 )
            // InternalMemorando.g:763:3: rule__Memorando__MesAssignment_21
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__MesAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getMesAssignment_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__21__Impl"


    // $ANTLR start "rule__Memorando__Group__22"
    // InternalMemorando.g:771:1: rule__Memorando__Group__22 : rule__Memorando__Group__22__Impl rule__Memorando__Group__23 ;
    public final void rule__Memorando__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:775:1: ( rule__Memorando__Group__22__Impl rule__Memorando__Group__23 )
            // InternalMemorando.g:776:2: rule__Memorando__Group__22__Impl rule__Memorando__Group__23
            {
            pushFollow(FOLLOW_5);
            rule__Memorando__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__22"


    // $ANTLR start "rule__Memorando__Group__22__Impl"
    // InternalMemorando.g:783:1: rule__Memorando__Group__22__Impl : ( '/' ) ;
    public final void rule__Memorando__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:787:1: ( ( '/' ) )
            // InternalMemorando.g:788:1: ( '/' )
            {
            // InternalMemorando.g:788:1: ( '/' )
            // InternalMemorando.g:789:2: '/'
            {
             before(grammarAccess.getMemorandoAccess().getSolidusKeyword_22()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getSolidusKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__22__Impl"


    // $ANTLR start "rule__Memorando__Group__23"
    // InternalMemorando.g:798:1: rule__Memorando__Group__23 : rule__Memorando__Group__23__Impl rule__Memorando__Group__24 ;
    public final void rule__Memorando__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:802:1: ( rule__Memorando__Group__23__Impl rule__Memorando__Group__24 )
            // InternalMemorando.g:803:2: rule__Memorando__Group__23__Impl rule__Memorando__Group__24
            {
            pushFollow(FOLLOW_16);
            rule__Memorando__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__23"


    // $ANTLR start "rule__Memorando__Group__23__Impl"
    // InternalMemorando.g:810:1: rule__Memorando__Group__23__Impl : ( ( rule__Memorando__AnoAssignment_23 ) ) ;
    public final void rule__Memorando__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:814:1: ( ( ( rule__Memorando__AnoAssignment_23 ) ) )
            // InternalMemorando.g:815:1: ( ( rule__Memorando__AnoAssignment_23 ) )
            {
            // InternalMemorando.g:815:1: ( ( rule__Memorando__AnoAssignment_23 ) )
            // InternalMemorando.g:816:2: ( rule__Memorando__AnoAssignment_23 )
            {
             before(grammarAccess.getMemorandoAccess().getAnoAssignment_23()); 
            // InternalMemorando.g:817:2: ( rule__Memorando__AnoAssignment_23 )
            // InternalMemorando.g:817:3: rule__Memorando__AnoAssignment_23
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__AnoAssignment_23();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getAnoAssignment_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__23__Impl"


    // $ANTLR start "rule__Memorando__Group__24"
    // InternalMemorando.g:825:1: rule__Memorando__Group__24 : rule__Memorando__Group__24__Impl rule__Memorando__Group__25 ;
    public final void rule__Memorando__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:829:1: ( rule__Memorando__Group__24__Impl rule__Memorando__Group__25 )
            // InternalMemorando.g:830:2: rule__Memorando__Group__24__Impl rule__Memorando__Group__25
            {
            pushFollow(FOLLOW_4);
            rule__Memorando__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__24"


    // $ANTLR start "rule__Memorando__Group__24__Impl"
    // InternalMemorando.g:837:1: rule__Memorando__Group__24__Impl : ( 'Cargos Destinatarios' ) ;
    public final void rule__Memorando__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:841:1: ( ( 'Cargos Destinatarios' ) )
            // InternalMemorando.g:842:1: ( 'Cargos Destinatarios' )
            {
            // InternalMemorando.g:842:1: ( 'Cargos Destinatarios' )
            // InternalMemorando.g:843:2: 'Cargos Destinatarios'
            {
             before(grammarAccess.getMemorandoAccess().getCargosDestinatariosKeyword_24()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getCargosDestinatariosKeyword_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__24__Impl"


    // $ANTLR start "rule__Memorando__Group__25"
    // InternalMemorando.g:852:1: rule__Memorando__Group__25 : rule__Memorando__Group__25__Impl rule__Memorando__Group__26 ;
    public final void rule__Memorando__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:856:1: ( rule__Memorando__Group__25__Impl rule__Memorando__Group__26 )
            // InternalMemorando.g:857:2: rule__Memorando__Group__25__Impl rule__Memorando__Group__26
            {
            pushFollow(FOLLOW_7);
            rule__Memorando__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__26();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__25"


    // $ANTLR start "rule__Memorando__Group__25__Impl"
    // InternalMemorando.g:864:1: rule__Memorando__Group__25__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:868:1: ( ( ':' ) )
            // InternalMemorando.g:869:1: ( ':' )
            {
            // InternalMemorando.g:869:1: ( ':' )
            // InternalMemorando.g:870:2: ':'
            {
             before(grammarAccess.getMemorandoAccess().getColonKeyword_25()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getColonKeyword_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__25__Impl"


    // $ANTLR start "rule__Memorando__Group__26"
    // InternalMemorando.g:879:1: rule__Memorando__Group__26 : rule__Memorando__Group__26__Impl rule__Memorando__Group__27 ;
    public final void rule__Memorando__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:883:1: ( rule__Memorando__Group__26__Impl rule__Memorando__Group__27 )
            // InternalMemorando.g:884:2: rule__Memorando__Group__26__Impl rule__Memorando__Group__27
            {
            pushFollow(FOLLOW_17);
            rule__Memorando__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__27();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__26"


    // $ANTLR start "rule__Memorando__Group__26__Impl"
    // InternalMemorando.g:891:1: rule__Memorando__Group__26__Impl : ( '[' ) ;
    public final void rule__Memorando__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:895:1: ( ( '[' ) )
            // InternalMemorando.g:896:1: ( '[' )
            {
            // InternalMemorando.g:896:1: ( '[' )
            // InternalMemorando.g:897:2: '['
            {
             before(grammarAccess.getMemorandoAccess().getLeftSquareBracketKeyword_26()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getLeftSquareBracketKeyword_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__26__Impl"


    // $ANTLR start "rule__Memorando__Group__27"
    // InternalMemorando.g:906:1: rule__Memorando__Group__27 : rule__Memorando__Group__27__Impl rule__Memorando__Group__28 ;
    public final void rule__Memorando__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:910:1: ( rule__Memorando__Group__27__Impl rule__Memorando__Group__28 )
            // InternalMemorando.g:911:2: rule__Memorando__Group__27__Impl rule__Memorando__Group__28
            {
            pushFollow(FOLLOW_17);
            rule__Memorando__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__28();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__27"


    // $ANTLR start "rule__Memorando__Group__27__Impl"
    // InternalMemorando.g:918:1: rule__Memorando__Group__27__Impl : ( ( rule__Memorando__CargosDestinatariosAssignment_27 )* ) ;
    public final void rule__Memorando__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:922:1: ( ( ( rule__Memorando__CargosDestinatariosAssignment_27 )* ) )
            // InternalMemorando.g:923:1: ( ( rule__Memorando__CargosDestinatariosAssignment_27 )* )
            {
            // InternalMemorando.g:923:1: ( ( rule__Memorando__CargosDestinatariosAssignment_27 )* )
            // InternalMemorando.g:924:2: ( rule__Memorando__CargosDestinatariosAssignment_27 )*
            {
             before(grammarAccess.getMemorandoAccess().getCargosDestinatariosAssignment_27()); 
            // InternalMemorando.g:925:2: ( rule__Memorando__CargosDestinatariosAssignment_27 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMemorando.g:925:3: rule__Memorando__CargosDestinatariosAssignment_27
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Memorando__CargosDestinatariosAssignment_27();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getCargosDestinatariosAssignment_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__27__Impl"


    // $ANTLR start "rule__Memorando__Group__28"
    // InternalMemorando.g:933:1: rule__Memorando__Group__28 : rule__Memorando__Group__28__Impl rule__Memorando__Group__29 ;
    public final void rule__Memorando__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:937:1: ( rule__Memorando__Group__28__Impl rule__Memorando__Group__29 )
            // InternalMemorando.g:938:2: rule__Memorando__Group__28__Impl rule__Memorando__Group__29
            {
            pushFollow(FOLLOW_19);
            rule__Memorando__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__29();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__28"


    // $ANTLR start "rule__Memorando__Group__28__Impl"
    // InternalMemorando.g:945:1: rule__Memorando__Group__28__Impl : ( ']' ) ;
    public final void rule__Memorando__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:949:1: ( ( ']' ) )
            // InternalMemorando.g:950:1: ( ']' )
            {
            // InternalMemorando.g:950:1: ( ']' )
            // InternalMemorando.g:951:2: ']'
            {
             before(grammarAccess.getMemorandoAccess().getRightSquareBracketKeyword_28()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getRightSquareBracketKeyword_28()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__28__Impl"


    // $ANTLR start "rule__Memorando__Group__29"
    // InternalMemorando.g:960:1: rule__Memorando__Group__29 : rule__Memorando__Group__29__Impl rule__Memorando__Group__30 ;
    public final void rule__Memorando__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:964:1: ( rule__Memorando__Group__29__Impl rule__Memorando__Group__30 )
            // InternalMemorando.g:965:2: rule__Memorando__Group__29__Impl rule__Memorando__Group__30
            {
            pushFollow(FOLLOW_4);
            rule__Memorando__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__30();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__29"


    // $ANTLR start "rule__Memorando__Group__29__Impl"
    // InternalMemorando.g:972:1: rule__Memorando__Group__29__Impl : ( 'Assunto' ) ;
    public final void rule__Memorando__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:976:1: ( ( 'Assunto' ) )
            // InternalMemorando.g:977:1: ( 'Assunto' )
            {
            // InternalMemorando.g:977:1: ( 'Assunto' )
            // InternalMemorando.g:978:2: 'Assunto'
            {
             before(grammarAccess.getMemorandoAccess().getAssuntoKeyword_29()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getAssuntoKeyword_29()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__29__Impl"


    // $ANTLR start "rule__Memorando__Group__30"
    // InternalMemorando.g:987:1: rule__Memorando__Group__30 : rule__Memorando__Group__30__Impl rule__Memorando__Group__31 ;
    public final void rule__Memorando__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:991:1: ( rule__Memorando__Group__30__Impl rule__Memorando__Group__31 )
            // InternalMemorando.g:992:2: rule__Memorando__Group__30__Impl rule__Memorando__Group__31
            {
            pushFollow(FOLLOW_20);
            rule__Memorando__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__31();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__30"


    // $ANTLR start "rule__Memorando__Group__30__Impl"
    // InternalMemorando.g:999:1: rule__Memorando__Group__30__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1003:1: ( ( ':' ) )
            // InternalMemorando.g:1004:1: ( ':' )
            {
            // InternalMemorando.g:1004:1: ( ':' )
            // InternalMemorando.g:1005:2: ':'
            {
             before(grammarAccess.getMemorandoAccess().getColonKeyword_30()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getColonKeyword_30()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__30__Impl"


    // $ANTLR start "rule__Memorando__Group__31"
    // InternalMemorando.g:1014:1: rule__Memorando__Group__31 : rule__Memorando__Group__31__Impl rule__Memorando__Group__32 ;
    public final void rule__Memorando__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1018:1: ( rule__Memorando__Group__31__Impl rule__Memorando__Group__32 )
            // InternalMemorando.g:1019:2: rule__Memorando__Group__31__Impl rule__Memorando__Group__32
            {
            pushFollow(FOLLOW_21);
            rule__Memorando__Group__31__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__32();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__31"


    // $ANTLR start "rule__Memorando__Group__31__Impl"
    // InternalMemorando.g:1026:1: rule__Memorando__Group__31__Impl : ( ( rule__Memorando__AssuntoAssignment_31 ) ) ;
    public final void rule__Memorando__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1030:1: ( ( ( rule__Memorando__AssuntoAssignment_31 ) ) )
            // InternalMemorando.g:1031:1: ( ( rule__Memorando__AssuntoAssignment_31 ) )
            {
            // InternalMemorando.g:1031:1: ( ( rule__Memorando__AssuntoAssignment_31 ) )
            // InternalMemorando.g:1032:2: ( rule__Memorando__AssuntoAssignment_31 )
            {
             before(grammarAccess.getMemorandoAccess().getAssuntoAssignment_31()); 
            // InternalMemorando.g:1033:2: ( rule__Memorando__AssuntoAssignment_31 )
            // InternalMemorando.g:1033:3: rule__Memorando__AssuntoAssignment_31
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__AssuntoAssignment_31();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getAssuntoAssignment_31()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__31__Impl"


    // $ANTLR start "rule__Memorando__Group__32"
    // InternalMemorando.g:1041:1: rule__Memorando__Group__32 : rule__Memorando__Group__32__Impl rule__Memorando__Group__33 ;
    public final void rule__Memorando__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1045:1: ( rule__Memorando__Group__32__Impl rule__Memorando__Group__33 )
            // InternalMemorando.g:1046:2: rule__Memorando__Group__32__Impl rule__Memorando__Group__33
            {
            pushFollow(FOLLOW_4);
            rule__Memorando__Group__32__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__33();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__32"


    // $ANTLR start "rule__Memorando__Group__32__Impl"
    // InternalMemorando.g:1053:1: rule__Memorando__Group__32__Impl : ( 'Mensagem' ) ;
    public final void rule__Memorando__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1057:1: ( ( 'Mensagem' ) )
            // InternalMemorando.g:1058:1: ( 'Mensagem' )
            {
            // InternalMemorando.g:1058:1: ( 'Mensagem' )
            // InternalMemorando.g:1059:2: 'Mensagem'
            {
             before(grammarAccess.getMemorandoAccess().getMensagemKeyword_32()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getMensagemKeyword_32()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__32__Impl"


    // $ANTLR start "rule__Memorando__Group__33"
    // InternalMemorando.g:1068:1: rule__Memorando__Group__33 : rule__Memorando__Group__33__Impl rule__Memorando__Group__34 ;
    public final void rule__Memorando__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1072:1: ( rule__Memorando__Group__33__Impl rule__Memorando__Group__34 )
            // InternalMemorando.g:1073:2: rule__Memorando__Group__33__Impl rule__Memorando__Group__34
            {
            pushFollow(FOLLOW_7);
            rule__Memorando__Group__33__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__34();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__33"


    // $ANTLR start "rule__Memorando__Group__33__Impl"
    // InternalMemorando.g:1080:1: rule__Memorando__Group__33__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1084:1: ( ( ':' ) )
            // InternalMemorando.g:1085:1: ( ':' )
            {
            // InternalMemorando.g:1085:1: ( ':' )
            // InternalMemorando.g:1086:2: ':'
            {
             before(grammarAccess.getMemorandoAccess().getColonKeyword_33()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getColonKeyword_33()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__33__Impl"


    // $ANTLR start "rule__Memorando__Group__34"
    // InternalMemorando.g:1095:1: rule__Memorando__Group__34 : rule__Memorando__Group__34__Impl rule__Memorando__Group__35 ;
    public final void rule__Memorando__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1099:1: ( rule__Memorando__Group__34__Impl rule__Memorando__Group__35 )
            // InternalMemorando.g:1100:2: rule__Memorando__Group__34__Impl rule__Memorando__Group__35
            {
            pushFollow(FOLLOW_17);
            rule__Memorando__Group__34__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__35();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__34"


    // $ANTLR start "rule__Memorando__Group__34__Impl"
    // InternalMemorando.g:1107:1: rule__Memorando__Group__34__Impl : ( '[' ) ;
    public final void rule__Memorando__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1111:1: ( ( '[' ) )
            // InternalMemorando.g:1112:1: ( '[' )
            {
            // InternalMemorando.g:1112:1: ( '[' )
            // InternalMemorando.g:1113:2: '['
            {
             before(grammarAccess.getMemorandoAccess().getLeftSquareBracketKeyword_34()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getLeftSquareBracketKeyword_34()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__34__Impl"


    // $ANTLR start "rule__Memorando__Group__35"
    // InternalMemorando.g:1122:1: rule__Memorando__Group__35 : rule__Memorando__Group__35__Impl rule__Memorando__Group__36 ;
    public final void rule__Memorando__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1126:1: ( rule__Memorando__Group__35__Impl rule__Memorando__Group__36 )
            // InternalMemorando.g:1127:2: rule__Memorando__Group__35__Impl rule__Memorando__Group__36
            {
            pushFollow(FOLLOW_17);
            rule__Memorando__Group__35__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__36();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__35"


    // $ANTLR start "rule__Memorando__Group__35__Impl"
    // InternalMemorando.g:1134:1: rule__Memorando__Group__35__Impl : ( ( rule__Memorando__ParagrafosAssignment_35 )* ) ;
    public final void rule__Memorando__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1138:1: ( ( ( rule__Memorando__ParagrafosAssignment_35 )* ) )
            // InternalMemorando.g:1139:1: ( ( rule__Memorando__ParagrafosAssignment_35 )* )
            {
            // InternalMemorando.g:1139:1: ( ( rule__Memorando__ParagrafosAssignment_35 )* )
            // InternalMemorando.g:1140:2: ( rule__Memorando__ParagrafosAssignment_35 )*
            {
             before(grammarAccess.getMemorandoAccess().getParagrafosAssignment_35()); 
            // InternalMemorando.g:1141:2: ( rule__Memorando__ParagrafosAssignment_35 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMemorando.g:1141:3: rule__Memorando__ParagrafosAssignment_35
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Memorando__ParagrafosAssignment_35();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getParagrafosAssignment_35()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__35__Impl"


    // $ANTLR start "rule__Memorando__Group__36"
    // InternalMemorando.g:1149:1: rule__Memorando__Group__36 : rule__Memorando__Group__36__Impl rule__Memorando__Group__37 ;
    public final void rule__Memorando__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1153:1: ( rule__Memorando__Group__36__Impl rule__Memorando__Group__37 )
            // InternalMemorando.g:1154:2: rule__Memorando__Group__36__Impl rule__Memorando__Group__37
            {
            pushFollow(FOLLOW_22);
            rule__Memorando__Group__36__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__37();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__36"


    // $ANTLR start "rule__Memorando__Group__36__Impl"
    // InternalMemorando.g:1161:1: rule__Memorando__Group__36__Impl : ( ']' ) ;
    public final void rule__Memorando__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1165:1: ( ( ']' ) )
            // InternalMemorando.g:1166:1: ( ']' )
            {
            // InternalMemorando.g:1166:1: ( ']' )
            // InternalMemorando.g:1167:2: ']'
            {
             before(grammarAccess.getMemorandoAccess().getRightSquareBracketKeyword_36()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getRightSquareBracketKeyword_36()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__36__Impl"


    // $ANTLR start "rule__Memorando__Group__37"
    // InternalMemorando.g:1176:1: rule__Memorando__Group__37 : rule__Memorando__Group__37__Impl rule__Memorando__Group__38 ;
    public final void rule__Memorando__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1180:1: ( rule__Memorando__Group__37__Impl rule__Memorando__Group__38 )
            // InternalMemorando.g:1181:2: rule__Memorando__Group__37__Impl rule__Memorando__Group__38
            {
            pushFollow(FOLLOW_4);
            rule__Memorando__Group__37__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__38();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__37"


    // $ANTLR start "rule__Memorando__Group__37__Impl"
    // InternalMemorando.g:1188:1: rule__Memorando__Group__37__Impl : ( 'Remetente' ) ;
    public final void rule__Memorando__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1192:1: ( ( 'Remetente' ) )
            // InternalMemorando.g:1193:1: ( 'Remetente' )
            {
            // InternalMemorando.g:1193:1: ( 'Remetente' )
            // InternalMemorando.g:1194:2: 'Remetente'
            {
             before(grammarAccess.getMemorandoAccess().getRemetenteKeyword_37()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getRemetenteKeyword_37()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__37__Impl"


    // $ANTLR start "rule__Memorando__Group__38"
    // InternalMemorando.g:1203:1: rule__Memorando__Group__38 : rule__Memorando__Group__38__Impl rule__Memorando__Group__39 ;
    public final void rule__Memorando__Group__38() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1207:1: ( rule__Memorando__Group__38__Impl rule__Memorando__Group__39 )
            // InternalMemorando.g:1208:2: rule__Memorando__Group__38__Impl rule__Memorando__Group__39
            {
            pushFollow(FOLLOW_20);
            rule__Memorando__Group__38__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__39();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__38"


    // $ANTLR start "rule__Memorando__Group__38__Impl"
    // InternalMemorando.g:1215:1: rule__Memorando__Group__38__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__38__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1219:1: ( ( ':' ) )
            // InternalMemorando.g:1220:1: ( ':' )
            {
            // InternalMemorando.g:1220:1: ( ':' )
            // InternalMemorando.g:1221:2: ':'
            {
             before(grammarAccess.getMemorandoAccess().getColonKeyword_38()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getColonKeyword_38()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__38__Impl"


    // $ANTLR start "rule__Memorando__Group__39"
    // InternalMemorando.g:1230:1: rule__Memorando__Group__39 : rule__Memorando__Group__39__Impl rule__Memorando__Group__40 ;
    public final void rule__Memorando__Group__39() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1234:1: ( rule__Memorando__Group__39__Impl rule__Memorando__Group__40 )
            // InternalMemorando.g:1235:2: rule__Memorando__Group__39__Impl rule__Memorando__Group__40
            {
            pushFollow(FOLLOW_23);
            rule__Memorando__Group__39__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__40();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__39"


    // $ANTLR start "rule__Memorando__Group__39__Impl"
    // InternalMemorando.g:1242:1: rule__Memorando__Group__39__Impl : ( ( rule__Memorando__RemetenteAssignment_39 ) ) ;
    public final void rule__Memorando__Group__39__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1246:1: ( ( ( rule__Memorando__RemetenteAssignment_39 ) ) )
            // InternalMemorando.g:1247:1: ( ( rule__Memorando__RemetenteAssignment_39 ) )
            {
            // InternalMemorando.g:1247:1: ( ( rule__Memorando__RemetenteAssignment_39 ) )
            // InternalMemorando.g:1248:2: ( rule__Memorando__RemetenteAssignment_39 )
            {
             before(grammarAccess.getMemorandoAccess().getRemetenteAssignment_39()); 
            // InternalMemorando.g:1249:2: ( rule__Memorando__RemetenteAssignment_39 )
            // InternalMemorando.g:1249:3: rule__Memorando__RemetenteAssignment_39
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__RemetenteAssignment_39();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getRemetenteAssignment_39()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__39__Impl"


    // $ANTLR start "rule__Memorando__Group__40"
    // InternalMemorando.g:1257:1: rule__Memorando__Group__40 : rule__Memorando__Group__40__Impl rule__Memorando__Group__41 ;
    public final void rule__Memorando__Group__40() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1261:1: ( rule__Memorando__Group__40__Impl rule__Memorando__Group__41 )
            // InternalMemorando.g:1262:2: rule__Memorando__Group__40__Impl rule__Memorando__Group__41
            {
            pushFollow(FOLLOW_4);
            rule__Memorando__Group__40__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__41();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__40"


    // $ANTLR start "rule__Memorando__Group__40__Impl"
    // InternalMemorando.g:1269:1: rule__Memorando__Group__40__Impl : ( 'Cargo Remetente' ) ;
    public final void rule__Memorando__Group__40__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1273:1: ( ( 'Cargo Remetente' ) )
            // InternalMemorando.g:1274:1: ( 'Cargo Remetente' )
            {
            // InternalMemorando.g:1274:1: ( 'Cargo Remetente' )
            // InternalMemorando.g:1275:2: 'Cargo Remetente'
            {
             before(grammarAccess.getMemorandoAccess().getCargoRemetenteKeyword_40()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getCargoRemetenteKeyword_40()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__40__Impl"


    // $ANTLR start "rule__Memorando__Group__41"
    // InternalMemorando.g:1284:1: rule__Memorando__Group__41 : rule__Memorando__Group__41__Impl rule__Memorando__Group__42 ;
    public final void rule__Memorando__Group__41() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1288:1: ( rule__Memorando__Group__41__Impl rule__Memorando__Group__42 )
            // InternalMemorando.g:1289:2: rule__Memorando__Group__41__Impl rule__Memorando__Group__42
            {
            pushFollow(FOLLOW_20);
            rule__Memorando__Group__41__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__42();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__41"


    // $ANTLR start "rule__Memorando__Group__41__Impl"
    // InternalMemorando.g:1296:1: rule__Memorando__Group__41__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__41__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1300:1: ( ( ':' ) )
            // InternalMemorando.g:1301:1: ( ':' )
            {
            // InternalMemorando.g:1301:1: ( ':' )
            // InternalMemorando.g:1302:2: ':'
            {
             before(grammarAccess.getMemorandoAccess().getColonKeyword_41()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getColonKeyword_41()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__41__Impl"


    // $ANTLR start "rule__Memorando__Group__42"
    // InternalMemorando.g:1311:1: rule__Memorando__Group__42 : rule__Memorando__Group__42__Impl rule__Memorando__Group__43 ;
    public final void rule__Memorando__Group__42() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1315:1: ( rule__Memorando__Group__42__Impl rule__Memorando__Group__43 )
            // InternalMemorando.g:1316:2: rule__Memorando__Group__42__Impl rule__Memorando__Group__43
            {
            pushFollow(FOLLOW_24);
            rule__Memorando__Group__42__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__43();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__42"


    // $ANTLR start "rule__Memorando__Group__42__Impl"
    // InternalMemorando.g:1323:1: rule__Memorando__Group__42__Impl : ( ( rule__Memorando__CargoRemetenteAssignment_42 ) ) ;
    public final void rule__Memorando__Group__42__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1327:1: ( ( ( rule__Memorando__CargoRemetenteAssignment_42 ) ) )
            // InternalMemorando.g:1328:1: ( ( rule__Memorando__CargoRemetenteAssignment_42 ) )
            {
            // InternalMemorando.g:1328:1: ( ( rule__Memorando__CargoRemetenteAssignment_42 ) )
            // InternalMemorando.g:1329:2: ( rule__Memorando__CargoRemetenteAssignment_42 )
            {
             before(grammarAccess.getMemorandoAccess().getCargoRemetenteAssignment_42()); 
            // InternalMemorando.g:1330:2: ( rule__Memorando__CargoRemetenteAssignment_42 )
            // InternalMemorando.g:1330:3: rule__Memorando__CargoRemetenteAssignment_42
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__CargoRemetenteAssignment_42();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getCargoRemetenteAssignment_42()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__42__Impl"


    // $ANTLR start "rule__Memorando__Group__43"
    // InternalMemorando.g:1338:1: rule__Memorando__Group__43 : rule__Memorando__Group__43__Impl ;
    public final void rule__Memorando__Group__43() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1342:1: ( rule__Memorando__Group__43__Impl )
            // InternalMemorando.g:1343:2: rule__Memorando__Group__43__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__Group__43__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__43"


    // $ANTLR start "rule__Memorando__Group__43__Impl"
    // InternalMemorando.g:1349:1: rule__Memorando__Group__43__Impl : ( ';' ) ;
    public final void rule__Memorando__Group__43__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1353:1: ( ( ';' ) )
            // InternalMemorando.g:1354:1: ( ';' )
            {
            // InternalMemorando.g:1354:1: ( ';' )
            // InternalMemorando.g:1355:2: ';'
            {
             before(grammarAccess.getMemorandoAccess().getSemicolonKeyword_43()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getSemicolonKeyword_43()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__Group__43__Impl"


    // $ANTLR start "rule__Paragrafo__Group__0"
    // InternalMemorando.g:1365:1: rule__Paragrafo__Group__0 : rule__Paragrafo__Group__0__Impl rule__Paragrafo__Group__1 ;
    public final void rule__Paragrafo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1369:1: ( rule__Paragrafo__Group__0__Impl rule__Paragrafo__Group__1 )
            // InternalMemorando.g:1370:2: rule__Paragrafo__Group__0__Impl rule__Paragrafo__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Paragrafo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paragrafo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__Group__0"


    // $ANTLR start "rule__Paragrafo__Group__0__Impl"
    // InternalMemorando.g:1377:1: rule__Paragrafo__Group__0__Impl : ( ( rule__Paragrafo__ParagrafoAssignment_0 ) ) ;
    public final void rule__Paragrafo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1381:1: ( ( ( rule__Paragrafo__ParagrafoAssignment_0 ) ) )
            // InternalMemorando.g:1382:1: ( ( rule__Paragrafo__ParagrafoAssignment_0 ) )
            {
            // InternalMemorando.g:1382:1: ( ( rule__Paragrafo__ParagrafoAssignment_0 ) )
            // InternalMemorando.g:1383:2: ( rule__Paragrafo__ParagrafoAssignment_0 )
            {
             before(grammarAccess.getParagrafoAccess().getParagrafoAssignment_0()); 
            // InternalMemorando.g:1384:2: ( rule__Paragrafo__ParagrafoAssignment_0 )
            // InternalMemorando.g:1384:3: rule__Paragrafo__ParagrafoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Paragrafo__ParagrafoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParagrafoAccess().getParagrafoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__Group__0__Impl"


    // $ANTLR start "rule__Paragrafo__Group__1"
    // InternalMemorando.g:1392:1: rule__Paragrafo__Group__1 : rule__Paragrafo__Group__1__Impl ;
    public final void rule__Paragrafo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1396:1: ( rule__Paragrafo__Group__1__Impl )
            // InternalMemorando.g:1397:2: rule__Paragrafo__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paragrafo__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__Group__1"


    // $ANTLR start "rule__Paragrafo__Group__1__Impl"
    // InternalMemorando.g:1403:1: rule__Paragrafo__Group__1__Impl : ( ( ' ' )? ) ;
    public final void rule__Paragrafo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1407:1: ( ( ( ' ' )? ) )
            // InternalMemorando.g:1408:1: ( ( ' ' )? )
            {
            // InternalMemorando.g:1408:1: ( ( ' ' )? )
            // InternalMemorando.g:1409:2: ( ' ' )?
            {
             before(grammarAccess.getParagrafoAccess().getSpaceKeyword_1()); 
            // InternalMemorando.g:1410:2: ( ' ' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMemorando.g:1410:3: ' '
                    {
                    match(input,27,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getParagrafoAccess().getSpaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__Group__1__Impl"


    // $ANTLR start "rule__SetorDestinatario__Group__0"
    // InternalMemorando.g:1419:1: rule__SetorDestinatario__Group__0 : rule__SetorDestinatario__Group__0__Impl rule__SetorDestinatario__Group__1 ;
    public final void rule__SetorDestinatario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1423:1: ( rule__SetorDestinatario__Group__0__Impl rule__SetorDestinatario__Group__1 )
            // InternalMemorando.g:1424:2: rule__SetorDestinatario__Group__0__Impl rule__SetorDestinatario__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__SetorDestinatario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetorDestinatario__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetorDestinatario__Group__0"


    // $ANTLR start "rule__SetorDestinatario__Group__0__Impl"
    // InternalMemorando.g:1431:1: rule__SetorDestinatario__Group__0__Impl : ( ( rule__SetorDestinatario__SetorDestinatarioAssignment_0 ) ) ;
    public final void rule__SetorDestinatario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1435:1: ( ( ( rule__SetorDestinatario__SetorDestinatarioAssignment_0 ) ) )
            // InternalMemorando.g:1436:1: ( ( rule__SetorDestinatario__SetorDestinatarioAssignment_0 ) )
            {
            // InternalMemorando.g:1436:1: ( ( rule__SetorDestinatario__SetorDestinatarioAssignment_0 ) )
            // InternalMemorando.g:1437:2: ( rule__SetorDestinatario__SetorDestinatarioAssignment_0 )
            {
             before(grammarAccess.getSetorDestinatarioAccess().getSetorDestinatarioAssignment_0()); 
            // InternalMemorando.g:1438:2: ( rule__SetorDestinatario__SetorDestinatarioAssignment_0 )
            // InternalMemorando.g:1438:3: rule__SetorDestinatario__SetorDestinatarioAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SetorDestinatario__SetorDestinatarioAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSetorDestinatarioAccess().getSetorDestinatarioAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetorDestinatario__Group__0__Impl"


    // $ANTLR start "rule__SetorDestinatario__Group__1"
    // InternalMemorando.g:1446:1: rule__SetorDestinatario__Group__1 : rule__SetorDestinatario__Group__1__Impl ;
    public final void rule__SetorDestinatario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1450:1: ( rule__SetorDestinatario__Group__1__Impl )
            // InternalMemorando.g:1451:2: rule__SetorDestinatario__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetorDestinatario__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetorDestinatario__Group__1"


    // $ANTLR start "rule__SetorDestinatario__Group__1__Impl"
    // InternalMemorando.g:1457:1: rule__SetorDestinatario__Group__1__Impl : ( ( ' ' )? ) ;
    public final void rule__SetorDestinatario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1461:1: ( ( ( ' ' )? ) )
            // InternalMemorando.g:1462:1: ( ( ' ' )? )
            {
            // InternalMemorando.g:1462:1: ( ( ' ' )? )
            // InternalMemorando.g:1463:2: ( ' ' )?
            {
             before(grammarAccess.getSetorDestinatarioAccess().getSpaceKeyword_1()); 
            // InternalMemorando.g:1464:2: ( ' ' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMemorando.g:1464:3: ' '
                    {
                    match(input,27,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSetorDestinatarioAccess().getSpaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetorDestinatario__Group__1__Impl"


    // $ANTLR start "rule__CargoDestinatario__Group__0"
    // InternalMemorando.g:1473:1: rule__CargoDestinatario__Group__0 : rule__CargoDestinatario__Group__0__Impl rule__CargoDestinatario__Group__1 ;
    public final void rule__CargoDestinatario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1477:1: ( rule__CargoDestinatario__Group__0__Impl rule__CargoDestinatario__Group__1 )
            // InternalMemorando.g:1478:2: rule__CargoDestinatario__Group__0__Impl rule__CargoDestinatario__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__CargoDestinatario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CargoDestinatario__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CargoDestinatario__Group__0"


    // $ANTLR start "rule__CargoDestinatario__Group__0__Impl"
    // InternalMemorando.g:1485:1: rule__CargoDestinatario__Group__0__Impl : ( ( rule__CargoDestinatario__CargoDestinatarioAssignment_0 ) ) ;
    public final void rule__CargoDestinatario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1489:1: ( ( ( rule__CargoDestinatario__CargoDestinatarioAssignment_0 ) ) )
            // InternalMemorando.g:1490:1: ( ( rule__CargoDestinatario__CargoDestinatarioAssignment_0 ) )
            {
            // InternalMemorando.g:1490:1: ( ( rule__CargoDestinatario__CargoDestinatarioAssignment_0 ) )
            // InternalMemorando.g:1491:2: ( rule__CargoDestinatario__CargoDestinatarioAssignment_0 )
            {
             before(grammarAccess.getCargoDestinatarioAccess().getCargoDestinatarioAssignment_0()); 
            // InternalMemorando.g:1492:2: ( rule__CargoDestinatario__CargoDestinatarioAssignment_0 )
            // InternalMemorando.g:1492:3: rule__CargoDestinatario__CargoDestinatarioAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CargoDestinatario__CargoDestinatarioAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCargoDestinatarioAccess().getCargoDestinatarioAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CargoDestinatario__Group__0__Impl"


    // $ANTLR start "rule__CargoDestinatario__Group__1"
    // InternalMemorando.g:1500:1: rule__CargoDestinatario__Group__1 : rule__CargoDestinatario__Group__1__Impl ;
    public final void rule__CargoDestinatario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1504:1: ( rule__CargoDestinatario__Group__1__Impl )
            // InternalMemorando.g:1505:2: rule__CargoDestinatario__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CargoDestinatario__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CargoDestinatario__Group__1"


    // $ANTLR start "rule__CargoDestinatario__Group__1__Impl"
    // InternalMemorando.g:1511:1: rule__CargoDestinatario__Group__1__Impl : ( ( ' ' )? ) ;
    public final void rule__CargoDestinatario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1515:1: ( ( ( ' ' )? ) )
            // InternalMemorando.g:1516:1: ( ( ' ' )? )
            {
            // InternalMemorando.g:1516:1: ( ( ' ' )? )
            // InternalMemorando.g:1517:2: ( ' ' )?
            {
             before(grammarAccess.getCargoDestinatarioAccess().getSpaceKeyword_1()); 
            // InternalMemorando.g:1518:2: ( ' ' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMemorando.g:1518:3: ' '
                    {
                    match(input,27,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCargoDestinatarioAccess().getSpaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CargoDestinatario__Group__1__Impl"


    // $ANTLR start "rule__Model__MemorandosAssignment"
    // InternalMemorando.g:1527:1: rule__Model__MemorandosAssignment : ( ruleMemorando ) ;
    public final void rule__Model__MemorandosAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1531:1: ( ( ruleMemorando ) )
            // InternalMemorando.g:1532:2: ( ruleMemorando )
            {
            // InternalMemorando.g:1532:2: ( ruleMemorando )
            // InternalMemorando.g:1533:3: ruleMemorando
            {
             before(grammarAccess.getModelAccess().getMemorandosMemorandoParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMemorando();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMemorandosMemorandoParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MemorandosAssignment"


    // $ANTLR start "rule__Memorando__NumeroAssignment_2"
    // InternalMemorando.g:1542:1: rule__Memorando__NumeroAssignment_2 : ( RULE_INT ) ;
    public final void rule__Memorando__NumeroAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1546:1: ( ( RULE_INT ) )
            // InternalMemorando.g:1547:2: ( RULE_INT )
            {
            // InternalMemorando.g:1547:2: ( RULE_INT )
            // InternalMemorando.g:1548:3: RULE_INT
            {
             before(grammarAccess.getMemorandoAccess().getNumeroINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getNumeroINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__NumeroAssignment_2"


    // $ANTLR start "rule__Memorando__SetoresDestinatariosAssignment_6"
    // InternalMemorando.g:1557:1: rule__Memorando__SetoresDestinatariosAssignment_6 : ( ruleSetorDestinatario ) ;
    public final void rule__Memorando__SetoresDestinatariosAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1561:1: ( ( ruleSetorDestinatario ) )
            // InternalMemorando.g:1562:2: ( ruleSetorDestinatario )
            {
            // InternalMemorando.g:1562:2: ( ruleSetorDestinatario )
            // InternalMemorando.g:1563:3: ruleSetorDestinatario
            {
             before(grammarAccess.getMemorandoAccess().getSetoresDestinatariosSetorDestinatarioParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSetorDestinatario();

            state._fsp--;

             after(grammarAccess.getMemorandoAccess().getSetoresDestinatariosSetorDestinatarioParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__SetoresDestinatariosAssignment_6"


    // $ANTLR start "rule__Memorando__SetorRemetenteAssignment_10"
    // InternalMemorando.g:1572:1: rule__Memorando__SetorRemetenteAssignment_10 : ( RULE_ID ) ;
    public final void rule__Memorando__SetorRemetenteAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1576:1: ( ( RULE_ID ) )
            // InternalMemorando.g:1577:2: ( RULE_ID )
            {
            // InternalMemorando.g:1577:2: ( RULE_ID )
            // InternalMemorando.g:1578:3: RULE_ID
            {
             before(grammarAccess.getMemorandoAccess().getSetorRemetenteIDTerminalRuleCall_10_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getSetorRemetenteIDTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__SetorRemetenteAssignment_10"


    // $ANTLR start "rule__Memorando__CidadeAssignment_13"
    // InternalMemorando.g:1587:1: rule__Memorando__CidadeAssignment_13 : ( RULE_ID ) ;
    public final void rule__Memorando__CidadeAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1591:1: ( ( RULE_ID ) )
            // InternalMemorando.g:1592:2: ( RULE_ID )
            {
            // InternalMemorando.g:1592:2: ( RULE_ID )
            // InternalMemorando.g:1593:3: RULE_ID
            {
             before(grammarAccess.getMemorandoAccess().getCidadeIDTerminalRuleCall_13_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getCidadeIDTerminalRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__CidadeAssignment_13"


    // $ANTLR start "rule__Memorando__EstadoAssignment_16"
    // InternalMemorando.g:1602:1: rule__Memorando__EstadoAssignment_16 : ( RULE_ID ) ;
    public final void rule__Memorando__EstadoAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1606:1: ( ( RULE_ID ) )
            // InternalMemorando.g:1607:2: ( RULE_ID )
            {
            // InternalMemorando.g:1607:2: ( RULE_ID )
            // InternalMemorando.g:1608:3: RULE_ID
            {
             before(grammarAccess.getMemorandoAccess().getEstadoIDTerminalRuleCall_16_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getEstadoIDTerminalRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__EstadoAssignment_16"


    // $ANTLR start "rule__Memorando__DiaAssignment_19"
    // InternalMemorando.g:1617:1: rule__Memorando__DiaAssignment_19 : ( RULE_INT ) ;
    public final void rule__Memorando__DiaAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1621:1: ( ( RULE_INT ) )
            // InternalMemorando.g:1622:2: ( RULE_INT )
            {
            // InternalMemorando.g:1622:2: ( RULE_INT )
            // InternalMemorando.g:1623:3: RULE_INT
            {
             before(grammarAccess.getMemorandoAccess().getDiaINTTerminalRuleCall_19_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getDiaINTTerminalRuleCall_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__DiaAssignment_19"


    // $ANTLR start "rule__Memorando__MesAssignment_21"
    // InternalMemorando.g:1632:1: rule__Memorando__MesAssignment_21 : ( RULE_ID ) ;
    public final void rule__Memorando__MesAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1636:1: ( ( RULE_ID ) )
            // InternalMemorando.g:1637:2: ( RULE_ID )
            {
            // InternalMemorando.g:1637:2: ( RULE_ID )
            // InternalMemorando.g:1638:3: RULE_ID
            {
             before(grammarAccess.getMemorandoAccess().getMesIDTerminalRuleCall_21_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getMesIDTerminalRuleCall_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__MesAssignment_21"


    // $ANTLR start "rule__Memorando__AnoAssignment_23"
    // InternalMemorando.g:1647:1: rule__Memorando__AnoAssignment_23 : ( RULE_INT ) ;
    public final void rule__Memorando__AnoAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1651:1: ( ( RULE_INT ) )
            // InternalMemorando.g:1652:2: ( RULE_INT )
            {
            // InternalMemorando.g:1652:2: ( RULE_INT )
            // InternalMemorando.g:1653:3: RULE_INT
            {
             before(grammarAccess.getMemorandoAccess().getAnoINTTerminalRuleCall_23_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getAnoINTTerminalRuleCall_23_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__AnoAssignment_23"


    // $ANTLR start "rule__Memorando__CargosDestinatariosAssignment_27"
    // InternalMemorando.g:1662:1: rule__Memorando__CargosDestinatariosAssignment_27 : ( ruleCargoDestinatario ) ;
    public final void rule__Memorando__CargosDestinatariosAssignment_27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1666:1: ( ( ruleCargoDestinatario ) )
            // InternalMemorando.g:1667:2: ( ruleCargoDestinatario )
            {
            // InternalMemorando.g:1667:2: ( ruleCargoDestinatario )
            // InternalMemorando.g:1668:3: ruleCargoDestinatario
            {
             before(grammarAccess.getMemorandoAccess().getCargosDestinatariosCargoDestinatarioParserRuleCall_27_0()); 
            pushFollow(FOLLOW_2);
            ruleCargoDestinatario();

            state._fsp--;

             after(grammarAccess.getMemorandoAccess().getCargosDestinatariosCargoDestinatarioParserRuleCall_27_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__CargosDestinatariosAssignment_27"


    // $ANTLR start "rule__Memorando__AssuntoAssignment_31"
    // InternalMemorando.g:1677:1: rule__Memorando__AssuntoAssignment_31 : ( RULE_STRING ) ;
    public final void rule__Memorando__AssuntoAssignment_31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1681:1: ( ( RULE_STRING ) )
            // InternalMemorando.g:1682:2: ( RULE_STRING )
            {
            // InternalMemorando.g:1682:2: ( RULE_STRING )
            // InternalMemorando.g:1683:3: RULE_STRING
            {
             before(grammarAccess.getMemorandoAccess().getAssuntoSTRINGTerminalRuleCall_31_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getAssuntoSTRINGTerminalRuleCall_31_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__AssuntoAssignment_31"


    // $ANTLR start "rule__Memorando__ParagrafosAssignment_35"
    // InternalMemorando.g:1692:1: rule__Memorando__ParagrafosAssignment_35 : ( ruleParagrafo ) ;
    public final void rule__Memorando__ParagrafosAssignment_35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1696:1: ( ( ruleParagrafo ) )
            // InternalMemorando.g:1697:2: ( ruleParagrafo )
            {
            // InternalMemorando.g:1697:2: ( ruleParagrafo )
            // InternalMemorando.g:1698:3: ruleParagrafo
            {
             before(grammarAccess.getMemorandoAccess().getParagrafosParagrafoParserRuleCall_35_0()); 
            pushFollow(FOLLOW_2);
            ruleParagrafo();

            state._fsp--;

             after(grammarAccess.getMemorandoAccess().getParagrafosParagrafoParserRuleCall_35_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__ParagrafosAssignment_35"


    // $ANTLR start "rule__Memorando__RemetenteAssignment_39"
    // InternalMemorando.g:1707:1: rule__Memorando__RemetenteAssignment_39 : ( RULE_STRING ) ;
    public final void rule__Memorando__RemetenteAssignment_39() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1711:1: ( ( RULE_STRING ) )
            // InternalMemorando.g:1712:2: ( RULE_STRING )
            {
            // InternalMemorando.g:1712:2: ( RULE_STRING )
            // InternalMemorando.g:1713:3: RULE_STRING
            {
             before(grammarAccess.getMemorandoAccess().getRemetenteSTRINGTerminalRuleCall_39_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getRemetenteSTRINGTerminalRuleCall_39_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__RemetenteAssignment_39"


    // $ANTLR start "rule__Memorando__CargoRemetenteAssignment_42"
    // InternalMemorando.g:1722:1: rule__Memorando__CargoRemetenteAssignment_42 : ( RULE_STRING ) ;
    public final void rule__Memorando__CargoRemetenteAssignment_42() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1726:1: ( ( RULE_STRING ) )
            // InternalMemorando.g:1727:2: ( RULE_STRING )
            {
            // InternalMemorando.g:1727:2: ( RULE_STRING )
            // InternalMemorando.g:1728:3: RULE_STRING
            {
             before(grammarAccess.getMemorandoAccess().getCargoRemetenteSTRINGTerminalRuleCall_42_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getCargoRemetenteSTRINGTerminalRuleCall_42_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memorando__CargoRemetenteAssignment_42"


    // $ANTLR start "rule__Paragrafo__ParagrafoAssignment_0"
    // InternalMemorando.g:1737:1: rule__Paragrafo__ParagrafoAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Paragrafo__ParagrafoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1741:1: ( ( RULE_STRING ) )
            // InternalMemorando.g:1742:2: ( RULE_STRING )
            {
            // InternalMemorando.g:1742:2: ( RULE_STRING )
            // InternalMemorando.g:1743:3: RULE_STRING
            {
             before(grammarAccess.getParagrafoAccess().getParagrafoSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParagrafoAccess().getParagrafoSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragrafo__ParagrafoAssignment_0"


    // $ANTLR start "rule__SetorDestinatario__SetorDestinatarioAssignment_0"
    // InternalMemorando.g:1752:1: rule__SetorDestinatario__SetorDestinatarioAssignment_0 : ( RULE_ID ) ;
    public final void rule__SetorDestinatario__SetorDestinatarioAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1756:1: ( ( RULE_ID ) )
            // InternalMemorando.g:1757:2: ( RULE_ID )
            {
            // InternalMemorando.g:1757:2: ( RULE_ID )
            // InternalMemorando.g:1758:3: RULE_ID
            {
             before(grammarAccess.getSetorDestinatarioAccess().getSetorDestinatarioIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSetorDestinatarioAccess().getSetorDestinatarioIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetorDestinatario__SetorDestinatarioAssignment_0"


    // $ANTLR start "rule__CargoDestinatario__CargoDestinatarioAssignment_0"
    // InternalMemorando.g:1767:1: rule__CargoDestinatario__CargoDestinatarioAssignment_0 : ( RULE_STRING ) ;
    public final void rule__CargoDestinatario__CargoDestinatarioAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1771:1: ( ( RULE_STRING ) )
            // InternalMemorando.g:1772:2: ( RULE_STRING )
            {
            // InternalMemorando.g:1772:2: ( RULE_STRING )
            // InternalMemorando.g:1773:3: RULE_STRING
            {
             before(grammarAccess.getCargoDestinatarioAccess().getCargoDestinatarioSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCargoDestinatarioAccess().getCargoDestinatarioSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CargoDestinatario__CargoDestinatarioAssignment_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});

}