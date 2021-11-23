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


    // $ANTLR start "entryRuleDestino"
    // InternalMemorando.g:103:1: entryRuleDestino : ruleDestino EOF ;
    public final void entryRuleDestino() throws RecognitionException {
        try {
            // InternalMemorando.g:104:1: ( ruleDestino EOF )
            // InternalMemorando.g:105:1: ruleDestino EOF
            {
             before(grammarAccess.getDestinoRule()); 
            pushFollow(FOLLOW_1);
            ruleDestino();

            state._fsp--;

             after(grammarAccess.getDestinoRule()); 
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
    // $ANTLR end "entryRuleDestino"


    // $ANTLR start "ruleDestino"
    // InternalMemorando.g:112:1: ruleDestino : ( ( rule__Destino__Group__0 ) ) ;
    public final void ruleDestino() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:116:2: ( ( ( rule__Destino__Group__0 ) ) )
            // InternalMemorando.g:117:2: ( ( rule__Destino__Group__0 ) )
            {
            // InternalMemorando.g:117:2: ( ( rule__Destino__Group__0 ) )
            // InternalMemorando.g:118:3: ( rule__Destino__Group__0 )
            {
             before(grammarAccess.getDestinoAccess().getGroup()); 
            // InternalMemorando.g:119:3: ( rule__Destino__Group__0 )
            // InternalMemorando.g:119:4: rule__Destino__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Destino__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDestinoAccess().getGroup()); 

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
    // $ANTLR end "ruleDestino"


    // $ANTLR start "entryRuleParagrafo"
    // InternalMemorando.g:128:1: entryRuleParagrafo : ruleParagrafo EOF ;
    public final void entryRuleParagrafo() throws RecognitionException {
        try {
            // InternalMemorando.g:129:1: ( ruleParagrafo EOF )
            // InternalMemorando.g:130:1: ruleParagrafo EOF
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
    // InternalMemorando.g:137:1: ruleParagrafo : ( ( rule__Paragrafo__Group__0 ) ) ;
    public final void ruleParagrafo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:141:2: ( ( ( rule__Paragrafo__Group__0 ) ) )
            // InternalMemorando.g:142:2: ( ( rule__Paragrafo__Group__0 ) )
            {
            // InternalMemorando.g:142:2: ( ( rule__Paragrafo__Group__0 ) )
            // InternalMemorando.g:143:3: ( rule__Paragrafo__Group__0 )
            {
             before(grammarAccess.getParagrafoAccess().getGroup()); 
            // InternalMemorando.g:144:3: ( rule__Paragrafo__Group__0 )
            // InternalMemorando.g:144:4: rule__Paragrafo__Group__0
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


    // $ANTLR start "rule__Memorando__Group__0"
    // InternalMemorando.g:152:1: rule__Memorando__Group__0 : rule__Memorando__Group__0__Impl rule__Memorando__Group__1 ;
    public final void rule__Memorando__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:156:1: ( rule__Memorando__Group__0__Impl rule__Memorando__Group__1 )
            // InternalMemorando.g:157:2: rule__Memorando__Group__0__Impl rule__Memorando__Group__1
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
    // InternalMemorando.g:164:1: rule__Memorando__Group__0__Impl : ( 'Numero' ) ;
    public final void rule__Memorando__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:168:1: ( ( 'Numero' ) )
            // InternalMemorando.g:169:1: ( 'Numero' )
            {
            // InternalMemorando.g:169:1: ( 'Numero' )
            // InternalMemorando.g:170:2: 'Numero'
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
    // InternalMemorando.g:179:1: rule__Memorando__Group__1 : rule__Memorando__Group__1__Impl rule__Memorando__Group__2 ;
    public final void rule__Memorando__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:183:1: ( rule__Memorando__Group__1__Impl rule__Memorando__Group__2 )
            // InternalMemorando.g:184:2: rule__Memorando__Group__1__Impl rule__Memorando__Group__2
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
    // InternalMemorando.g:191:1: rule__Memorando__Group__1__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:195:1: ( ( ':' ) )
            // InternalMemorando.g:196:1: ( ':' )
            {
            // InternalMemorando.g:196:1: ( ':' )
            // InternalMemorando.g:197:2: ':'
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
    // InternalMemorando.g:206:1: rule__Memorando__Group__2 : rule__Memorando__Group__2__Impl rule__Memorando__Group__3 ;
    public final void rule__Memorando__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:210:1: ( rule__Memorando__Group__2__Impl rule__Memorando__Group__3 )
            // InternalMemorando.g:211:2: rule__Memorando__Group__2__Impl rule__Memorando__Group__3
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
    // InternalMemorando.g:218:1: rule__Memorando__Group__2__Impl : ( ( rule__Memorando__NumeroAssignment_2 ) ) ;
    public final void rule__Memorando__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:222:1: ( ( ( rule__Memorando__NumeroAssignment_2 ) ) )
            // InternalMemorando.g:223:1: ( ( rule__Memorando__NumeroAssignment_2 ) )
            {
            // InternalMemorando.g:223:1: ( ( rule__Memorando__NumeroAssignment_2 ) )
            // InternalMemorando.g:224:2: ( rule__Memorando__NumeroAssignment_2 )
            {
             before(grammarAccess.getMemorandoAccess().getNumeroAssignment_2()); 
            // InternalMemorando.g:225:2: ( rule__Memorando__NumeroAssignment_2 )
            // InternalMemorando.g:225:3: rule__Memorando__NumeroAssignment_2
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
    // InternalMemorando.g:233:1: rule__Memorando__Group__3 : rule__Memorando__Group__3__Impl rule__Memorando__Group__4 ;
    public final void rule__Memorando__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:237:1: ( rule__Memorando__Group__3__Impl rule__Memorando__Group__4 )
            // InternalMemorando.g:238:2: rule__Memorando__Group__3__Impl rule__Memorando__Group__4
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
    // InternalMemorando.g:245:1: rule__Memorando__Group__3__Impl : ( 'Setor Destinatario' ) ;
    public final void rule__Memorando__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:249:1: ( ( 'Setor Destinatario' ) )
            // InternalMemorando.g:250:1: ( 'Setor Destinatario' )
            {
            // InternalMemorando.g:250:1: ( 'Setor Destinatario' )
            // InternalMemorando.g:251:2: 'Setor Destinatario'
            {
             before(grammarAccess.getMemorandoAccess().getSetorDestinatarioKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getSetorDestinatarioKeyword_3()); 

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
    // InternalMemorando.g:260:1: rule__Memorando__Group__4 : rule__Memorando__Group__4__Impl rule__Memorando__Group__5 ;
    public final void rule__Memorando__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:264:1: ( rule__Memorando__Group__4__Impl rule__Memorando__Group__5 )
            // InternalMemorando.g:265:2: rule__Memorando__Group__4__Impl rule__Memorando__Group__5
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
    // InternalMemorando.g:272:1: rule__Memorando__Group__4__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:276:1: ( ( ':' ) )
            // InternalMemorando.g:277:1: ( ':' )
            {
            // InternalMemorando.g:277:1: ( ':' )
            // InternalMemorando.g:278:2: ':'
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
    // InternalMemorando.g:287:1: rule__Memorando__Group__5 : rule__Memorando__Group__5__Impl rule__Memorando__Group__6 ;
    public final void rule__Memorando__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:291:1: ( rule__Memorando__Group__5__Impl rule__Memorando__Group__6 )
            // InternalMemorando.g:292:2: rule__Memorando__Group__5__Impl rule__Memorando__Group__6
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
    // InternalMemorando.g:299:1: rule__Memorando__Group__5__Impl : ( ( rule__Memorando__SetorDestinatarioAssignment_5 ) ) ;
    public final void rule__Memorando__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:303:1: ( ( ( rule__Memorando__SetorDestinatarioAssignment_5 ) ) )
            // InternalMemorando.g:304:1: ( ( rule__Memorando__SetorDestinatarioAssignment_5 ) )
            {
            // InternalMemorando.g:304:1: ( ( rule__Memorando__SetorDestinatarioAssignment_5 ) )
            // InternalMemorando.g:305:2: ( rule__Memorando__SetorDestinatarioAssignment_5 )
            {
             before(grammarAccess.getMemorandoAccess().getSetorDestinatarioAssignment_5()); 
            // InternalMemorando.g:306:2: ( rule__Memorando__SetorDestinatarioAssignment_5 )
            // InternalMemorando.g:306:3: rule__Memorando__SetorDestinatarioAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__SetorDestinatarioAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getSetorDestinatarioAssignment_5()); 

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
    // InternalMemorando.g:314:1: rule__Memorando__Group__6 : rule__Memorando__Group__6__Impl rule__Memorando__Group__7 ;
    public final void rule__Memorando__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:318:1: ( rule__Memorando__Group__6__Impl rule__Memorando__Group__7 )
            // InternalMemorando.g:319:2: rule__Memorando__Group__6__Impl rule__Memorando__Group__7
            {
            pushFollow(FOLLOW_4);
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
    // InternalMemorando.g:326:1: rule__Memorando__Group__6__Impl : ( 'Setor Remetente' ) ;
    public final void rule__Memorando__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:330:1: ( ( 'Setor Remetente' ) )
            // InternalMemorando.g:331:1: ( 'Setor Remetente' )
            {
            // InternalMemorando.g:331:1: ( 'Setor Remetente' )
            // InternalMemorando.g:332:2: 'Setor Remetente'
            {
             before(grammarAccess.getMemorandoAccess().getSetorRemetenteKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getSetorRemetenteKeyword_6()); 

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
    // InternalMemorando.g:341:1: rule__Memorando__Group__7 : rule__Memorando__Group__7__Impl rule__Memorando__Group__8 ;
    public final void rule__Memorando__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:345:1: ( rule__Memorando__Group__7__Impl rule__Memorando__Group__8 )
            // InternalMemorando.g:346:2: rule__Memorando__Group__7__Impl rule__Memorando__Group__8
            {
            pushFollow(FOLLOW_7);
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
    // InternalMemorando.g:353:1: rule__Memorando__Group__7__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:357:1: ( ( ':' ) )
            // InternalMemorando.g:358:1: ( ':' )
            {
            // InternalMemorando.g:358:1: ( ':' )
            // InternalMemorando.g:359:2: ':'
            {
             before(grammarAccess.getMemorandoAccess().getColonKeyword_7()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getColonKeyword_7()); 

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
    // InternalMemorando.g:368:1: rule__Memorando__Group__8 : rule__Memorando__Group__8__Impl rule__Memorando__Group__9 ;
    public final void rule__Memorando__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:372:1: ( rule__Memorando__Group__8__Impl rule__Memorando__Group__9 )
            // InternalMemorando.g:373:2: rule__Memorando__Group__8__Impl rule__Memorando__Group__9
            {
            pushFollow(FOLLOW_9);
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
    // InternalMemorando.g:380:1: rule__Memorando__Group__8__Impl : ( ( rule__Memorando__SetorRemetenteAssignment_8 ) ) ;
    public final void rule__Memorando__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:384:1: ( ( ( rule__Memorando__SetorRemetenteAssignment_8 ) ) )
            // InternalMemorando.g:385:1: ( ( rule__Memorando__SetorRemetenteAssignment_8 ) )
            {
            // InternalMemorando.g:385:1: ( ( rule__Memorando__SetorRemetenteAssignment_8 ) )
            // InternalMemorando.g:386:2: ( rule__Memorando__SetorRemetenteAssignment_8 )
            {
             before(grammarAccess.getMemorandoAccess().getSetorRemetenteAssignment_8()); 
            // InternalMemorando.g:387:2: ( rule__Memorando__SetorRemetenteAssignment_8 )
            // InternalMemorando.g:387:3: rule__Memorando__SetorRemetenteAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__SetorRemetenteAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getSetorRemetenteAssignment_8()); 

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
    // InternalMemorando.g:395:1: rule__Memorando__Group__9 : rule__Memorando__Group__9__Impl rule__Memorando__Group__10 ;
    public final void rule__Memorando__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:399:1: ( rule__Memorando__Group__9__Impl rule__Memorando__Group__10 )
            // InternalMemorando.g:400:2: rule__Memorando__Group__9__Impl rule__Memorando__Group__10
            {
            pushFollow(FOLLOW_4);
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
    // InternalMemorando.g:407:1: rule__Memorando__Group__9__Impl : ( 'Cidade' ) ;
    public final void rule__Memorando__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:411:1: ( ( 'Cidade' ) )
            // InternalMemorando.g:412:1: ( 'Cidade' )
            {
            // InternalMemorando.g:412:1: ( 'Cidade' )
            // InternalMemorando.g:413:2: 'Cidade'
            {
             before(grammarAccess.getMemorandoAccess().getCidadeKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getCidadeKeyword_9()); 

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
    // InternalMemorando.g:422:1: rule__Memorando__Group__10 : rule__Memorando__Group__10__Impl rule__Memorando__Group__11 ;
    public final void rule__Memorando__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:426:1: ( rule__Memorando__Group__10__Impl rule__Memorando__Group__11 )
            // InternalMemorando.g:427:2: rule__Memorando__Group__10__Impl rule__Memorando__Group__11
            {
            pushFollow(FOLLOW_7);
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
    // InternalMemorando.g:434:1: rule__Memorando__Group__10__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:438:1: ( ( ':' ) )
            // InternalMemorando.g:439:1: ( ':' )
            {
            // InternalMemorando.g:439:1: ( ':' )
            // InternalMemorando.g:440:2: ':'
            {
             before(grammarAccess.getMemorandoAccess().getColonKeyword_10()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getColonKeyword_10()); 

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
    // InternalMemorando.g:449:1: rule__Memorando__Group__11 : rule__Memorando__Group__11__Impl rule__Memorando__Group__12 ;
    public final void rule__Memorando__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:453:1: ( rule__Memorando__Group__11__Impl rule__Memorando__Group__12 )
            // InternalMemorando.g:454:2: rule__Memorando__Group__11__Impl rule__Memorando__Group__12
            {
            pushFollow(FOLLOW_10);
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
    // InternalMemorando.g:461:1: rule__Memorando__Group__11__Impl : ( ( rule__Memorando__CidadeAssignment_11 ) ) ;
    public final void rule__Memorando__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:465:1: ( ( ( rule__Memorando__CidadeAssignment_11 ) ) )
            // InternalMemorando.g:466:1: ( ( rule__Memorando__CidadeAssignment_11 ) )
            {
            // InternalMemorando.g:466:1: ( ( rule__Memorando__CidadeAssignment_11 ) )
            // InternalMemorando.g:467:2: ( rule__Memorando__CidadeAssignment_11 )
            {
             before(grammarAccess.getMemorandoAccess().getCidadeAssignment_11()); 
            // InternalMemorando.g:468:2: ( rule__Memorando__CidadeAssignment_11 )
            // InternalMemorando.g:468:3: rule__Memorando__CidadeAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__CidadeAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getCidadeAssignment_11()); 

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
    // InternalMemorando.g:476:1: rule__Memorando__Group__12 : rule__Memorando__Group__12__Impl rule__Memorando__Group__13 ;
    public final void rule__Memorando__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:480:1: ( rule__Memorando__Group__12__Impl rule__Memorando__Group__13 )
            // InternalMemorando.g:481:2: rule__Memorando__Group__12__Impl rule__Memorando__Group__13
            {
            pushFollow(FOLLOW_4);
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
    // InternalMemorando.g:488:1: rule__Memorando__Group__12__Impl : ( 'Estado' ) ;
    public final void rule__Memorando__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:492:1: ( ( 'Estado' ) )
            // InternalMemorando.g:493:1: ( 'Estado' )
            {
            // InternalMemorando.g:493:1: ( 'Estado' )
            // InternalMemorando.g:494:2: 'Estado'
            {
             before(grammarAccess.getMemorandoAccess().getEstadoKeyword_12()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getEstadoKeyword_12()); 

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
    // InternalMemorando.g:503:1: rule__Memorando__Group__13 : rule__Memorando__Group__13__Impl rule__Memorando__Group__14 ;
    public final void rule__Memorando__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:507:1: ( rule__Memorando__Group__13__Impl rule__Memorando__Group__14 )
            // InternalMemorando.g:508:2: rule__Memorando__Group__13__Impl rule__Memorando__Group__14
            {
            pushFollow(FOLLOW_7);
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
    // InternalMemorando.g:515:1: rule__Memorando__Group__13__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:519:1: ( ( ':' ) )
            // InternalMemorando.g:520:1: ( ':' )
            {
            // InternalMemorando.g:520:1: ( ':' )
            // InternalMemorando.g:521:2: ':'
            {
             before(grammarAccess.getMemorandoAccess().getColonKeyword_13()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getColonKeyword_13()); 

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
    // InternalMemorando.g:530:1: rule__Memorando__Group__14 : rule__Memorando__Group__14__Impl rule__Memorando__Group__15 ;
    public final void rule__Memorando__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:534:1: ( rule__Memorando__Group__14__Impl rule__Memorando__Group__15 )
            // InternalMemorando.g:535:2: rule__Memorando__Group__14__Impl rule__Memorando__Group__15
            {
            pushFollow(FOLLOW_11);
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
    // InternalMemorando.g:542:1: rule__Memorando__Group__14__Impl : ( ( rule__Memorando__EstadoAssignment_14 ) ) ;
    public final void rule__Memorando__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:546:1: ( ( ( rule__Memorando__EstadoAssignment_14 ) ) )
            // InternalMemorando.g:547:1: ( ( rule__Memorando__EstadoAssignment_14 ) )
            {
            // InternalMemorando.g:547:1: ( ( rule__Memorando__EstadoAssignment_14 ) )
            // InternalMemorando.g:548:2: ( rule__Memorando__EstadoAssignment_14 )
            {
             before(grammarAccess.getMemorandoAccess().getEstadoAssignment_14()); 
            // InternalMemorando.g:549:2: ( rule__Memorando__EstadoAssignment_14 )
            // InternalMemorando.g:549:3: rule__Memorando__EstadoAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__EstadoAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getEstadoAssignment_14()); 

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
    // InternalMemorando.g:557:1: rule__Memorando__Group__15 : rule__Memorando__Group__15__Impl rule__Memorando__Group__16 ;
    public final void rule__Memorando__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:561:1: ( rule__Memorando__Group__15__Impl rule__Memorando__Group__16 )
            // InternalMemorando.g:562:2: rule__Memorando__Group__15__Impl rule__Memorando__Group__16
            {
            pushFollow(FOLLOW_4);
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
    // InternalMemorando.g:569:1: rule__Memorando__Group__15__Impl : ( 'Data' ) ;
    public final void rule__Memorando__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:573:1: ( ( 'Data' ) )
            // InternalMemorando.g:574:1: ( 'Data' )
            {
            // InternalMemorando.g:574:1: ( 'Data' )
            // InternalMemorando.g:575:2: 'Data'
            {
             before(grammarAccess.getMemorandoAccess().getDataKeyword_15()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getDataKeyword_15()); 

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
    // InternalMemorando.g:584:1: rule__Memorando__Group__16 : rule__Memorando__Group__16__Impl rule__Memorando__Group__17 ;
    public final void rule__Memorando__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:588:1: ( rule__Memorando__Group__16__Impl rule__Memorando__Group__17 )
            // InternalMemorando.g:589:2: rule__Memorando__Group__16__Impl rule__Memorando__Group__17
            {
            pushFollow(FOLLOW_5);
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
    // InternalMemorando.g:596:1: rule__Memorando__Group__16__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:600:1: ( ( ':' ) )
            // InternalMemorando.g:601:1: ( ':' )
            {
            // InternalMemorando.g:601:1: ( ':' )
            // InternalMemorando.g:602:2: ':'
            {
             before(grammarAccess.getMemorandoAccess().getColonKeyword_16()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getColonKeyword_16()); 

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
    // InternalMemorando.g:611:1: rule__Memorando__Group__17 : rule__Memorando__Group__17__Impl rule__Memorando__Group__18 ;
    public final void rule__Memorando__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:615:1: ( rule__Memorando__Group__17__Impl rule__Memorando__Group__18 )
            // InternalMemorando.g:616:2: rule__Memorando__Group__17__Impl rule__Memorando__Group__18
            {
            pushFollow(FOLLOW_12);
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
    // InternalMemorando.g:623:1: rule__Memorando__Group__17__Impl : ( ( rule__Memorando__DiaAssignment_17 ) ) ;
    public final void rule__Memorando__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:627:1: ( ( ( rule__Memorando__DiaAssignment_17 ) ) )
            // InternalMemorando.g:628:1: ( ( rule__Memorando__DiaAssignment_17 ) )
            {
            // InternalMemorando.g:628:1: ( ( rule__Memorando__DiaAssignment_17 ) )
            // InternalMemorando.g:629:2: ( rule__Memorando__DiaAssignment_17 )
            {
             before(grammarAccess.getMemorandoAccess().getDiaAssignment_17()); 
            // InternalMemorando.g:630:2: ( rule__Memorando__DiaAssignment_17 )
            // InternalMemorando.g:630:3: rule__Memorando__DiaAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__DiaAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getDiaAssignment_17()); 

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
    // InternalMemorando.g:638:1: rule__Memorando__Group__18 : rule__Memorando__Group__18__Impl rule__Memorando__Group__19 ;
    public final void rule__Memorando__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:642:1: ( rule__Memorando__Group__18__Impl rule__Memorando__Group__19 )
            // InternalMemorando.g:643:2: rule__Memorando__Group__18__Impl rule__Memorando__Group__19
            {
            pushFollow(FOLLOW_7);
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
    // InternalMemorando.g:650:1: rule__Memorando__Group__18__Impl : ( '/' ) ;
    public final void rule__Memorando__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:654:1: ( ( '/' ) )
            // InternalMemorando.g:655:1: ( '/' )
            {
            // InternalMemorando.g:655:1: ( '/' )
            // InternalMemorando.g:656:2: '/'
            {
             before(grammarAccess.getMemorandoAccess().getSolidusKeyword_18()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getSolidusKeyword_18()); 

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
    // InternalMemorando.g:665:1: rule__Memorando__Group__19 : rule__Memorando__Group__19__Impl rule__Memorando__Group__20 ;
    public final void rule__Memorando__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:669:1: ( rule__Memorando__Group__19__Impl rule__Memorando__Group__20 )
            // InternalMemorando.g:670:2: rule__Memorando__Group__19__Impl rule__Memorando__Group__20
            {
            pushFollow(FOLLOW_12);
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
    // InternalMemorando.g:677:1: rule__Memorando__Group__19__Impl : ( ( rule__Memorando__MesAssignment_19 ) ) ;
    public final void rule__Memorando__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:681:1: ( ( ( rule__Memorando__MesAssignment_19 ) ) )
            // InternalMemorando.g:682:1: ( ( rule__Memorando__MesAssignment_19 ) )
            {
            // InternalMemorando.g:682:1: ( ( rule__Memorando__MesAssignment_19 ) )
            // InternalMemorando.g:683:2: ( rule__Memorando__MesAssignment_19 )
            {
             before(grammarAccess.getMemorandoAccess().getMesAssignment_19()); 
            // InternalMemorando.g:684:2: ( rule__Memorando__MesAssignment_19 )
            // InternalMemorando.g:684:3: rule__Memorando__MesAssignment_19
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__MesAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getMesAssignment_19()); 

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
    // InternalMemorando.g:692:1: rule__Memorando__Group__20 : rule__Memorando__Group__20__Impl rule__Memorando__Group__21 ;
    public final void rule__Memorando__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:696:1: ( rule__Memorando__Group__20__Impl rule__Memorando__Group__21 )
            // InternalMemorando.g:697:2: rule__Memorando__Group__20__Impl rule__Memorando__Group__21
            {
            pushFollow(FOLLOW_5);
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
    // InternalMemorando.g:704:1: rule__Memorando__Group__20__Impl : ( '/' ) ;
    public final void rule__Memorando__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:708:1: ( ( '/' ) )
            // InternalMemorando.g:709:1: ( '/' )
            {
            // InternalMemorando.g:709:1: ( '/' )
            // InternalMemorando.g:710:2: '/'
            {
             before(grammarAccess.getMemorandoAccess().getSolidusKeyword_20()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMemorando.g:719:1: rule__Memorando__Group__21 : rule__Memorando__Group__21__Impl rule__Memorando__Group__22 ;
    public final void rule__Memorando__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:723:1: ( rule__Memorando__Group__21__Impl rule__Memorando__Group__22 )
            // InternalMemorando.g:724:2: rule__Memorando__Group__21__Impl rule__Memorando__Group__22
            {
            pushFollow(FOLLOW_13);
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
    // InternalMemorando.g:731:1: rule__Memorando__Group__21__Impl : ( ( rule__Memorando__AnoAssignment_21 ) ) ;
    public final void rule__Memorando__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:735:1: ( ( ( rule__Memorando__AnoAssignment_21 ) ) )
            // InternalMemorando.g:736:1: ( ( rule__Memorando__AnoAssignment_21 ) )
            {
            // InternalMemorando.g:736:1: ( ( rule__Memorando__AnoAssignment_21 ) )
            // InternalMemorando.g:737:2: ( rule__Memorando__AnoAssignment_21 )
            {
             before(grammarAccess.getMemorandoAccess().getAnoAssignment_21()); 
            // InternalMemorando.g:738:2: ( rule__Memorando__AnoAssignment_21 )
            // InternalMemorando.g:738:3: rule__Memorando__AnoAssignment_21
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__AnoAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getAnoAssignment_21()); 

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
    // InternalMemorando.g:746:1: rule__Memorando__Group__22 : rule__Memorando__Group__22__Impl rule__Memorando__Group__23 ;
    public final void rule__Memorando__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:750:1: ( rule__Memorando__Group__22__Impl rule__Memorando__Group__23 )
            // InternalMemorando.g:751:2: rule__Memorando__Group__22__Impl rule__Memorando__Group__23
            {
            pushFollow(FOLLOW_4);
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
    // InternalMemorando.g:758:1: rule__Memorando__Group__22__Impl : ( 'Cargo Destinatario' ) ;
    public final void rule__Memorando__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:762:1: ( ( 'Cargo Destinatario' ) )
            // InternalMemorando.g:763:1: ( 'Cargo Destinatario' )
            {
            // InternalMemorando.g:763:1: ( 'Cargo Destinatario' )
            // InternalMemorando.g:764:2: 'Cargo Destinatario'
            {
             before(grammarAccess.getMemorandoAccess().getCargoDestinatarioKeyword_22()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getCargoDestinatarioKeyword_22()); 

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
    // InternalMemorando.g:773:1: rule__Memorando__Group__23 : rule__Memorando__Group__23__Impl rule__Memorando__Group__24 ;
    public final void rule__Memorando__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:777:1: ( rule__Memorando__Group__23__Impl rule__Memorando__Group__24 )
            // InternalMemorando.g:778:2: rule__Memorando__Group__23__Impl rule__Memorando__Group__24
            {
            pushFollow(FOLLOW_14);
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
    // InternalMemorando.g:785:1: rule__Memorando__Group__23__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:789:1: ( ( ':' ) )
            // InternalMemorando.g:790:1: ( ':' )
            {
            // InternalMemorando.g:790:1: ( ':' )
            // InternalMemorando.g:791:2: ':'
            {
             before(grammarAccess.getMemorandoAccess().getColonKeyword_23()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getColonKeyword_23()); 

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
    // InternalMemorando.g:800:1: rule__Memorando__Group__24 : rule__Memorando__Group__24__Impl rule__Memorando__Group__25 ;
    public final void rule__Memorando__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:804:1: ( rule__Memorando__Group__24__Impl rule__Memorando__Group__25 )
            // InternalMemorando.g:805:2: rule__Memorando__Group__24__Impl rule__Memorando__Group__25
            {
            pushFollow(FOLLOW_15);
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
    // InternalMemorando.g:812:1: rule__Memorando__Group__24__Impl : ( ( rule__Memorando__CargoDestinatarioAssignment_24 ) ) ;
    public final void rule__Memorando__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:816:1: ( ( ( rule__Memorando__CargoDestinatarioAssignment_24 ) ) )
            // InternalMemorando.g:817:1: ( ( rule__Memorando__CargoDestinatarioAssignment_24 ) )
            {
            // InternalMemorando.g:817:1: ( ( rule__Memorando__CargoDestinatarioAssignment_24 ) )
            // InternalMemorando.g:818:2: ( rule__Memorando__CargoDestinatarioAssignment_24 )
            {
             before(grammarAccess.getMemorandoAccess().getCargoDestinatarioAssignment_24()); 
            // InternalMemorando.g:819:2: ( rule__Memorando__CargoDestinatarioAssignment_24 )
            // InternalMemorando.g:819:3: rule__Memorando__CargoDestinatarioAssignment_24
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__CargoDestinatarioAssignment_24();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getCargoDestinatarioAssignment_24()); 

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
    // InternalMemorando.g:827:1: rule__Memorando__Group__25 : rule__Memorando__Group__25__Impl rule__Memorando__Group__26 ;
    public final void rule__Memorando__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:831:1: ( rule__Memorando__Group__25__Impl rule__Memorando__Group__26 )
            // InternalMemorando.g:832:2: rule__Memorando__Group__25__Impl rule__Memorando__Group__26
            {
            pushFollow(FOLLOW_4);
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
    // InternalMemorando.g:839:1: rule__Memorando__Group__25__Impl : ( 'Assunto' ) ;
    public final void rule__Memorando__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:843:1: ( ( 'Assunto' ) )
            // InternalMemorando.g:844:1: ( 'Assunto' )
            {
            // InternalMemorando.g:844:1: ( 'Assunto' )
            // InternalMemorando.g:845:2: 'Assunto'
            {
             before(grammarAccess.getMemorandoAccess().getAssuntoKeyword_25()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getAssuntoKeyword_25()); 

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
    // InternalMemorando.g:854:1: rule__Memorando__Group__26 : rule__Memorando__Group__26__Impl rule__Memorando__Group__27 ;
    public final void rule__Memorando__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:858:1: ( rule__Memorando__Group__26__Impl rule__Memorando__Group__27 )
            // InternalMemorando.g:859:2: rule__Memorando__Group__26__Impl rule__Memorando__Group__27
            {
            pushFollow(FOLLOW_14);
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
    // InternalMemorando.g:866:1: rule__Memorando__Group__26__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:870:1: ( ( ':' ) )
            // InternalMemorando.g:871:1: ( ':' )
            {
            // InternalMemorando.g:871:1: ( ':' )
            // InternalMemorando.g:872:2: ':'
            {
             before(grammarAccess.getMemorandoAccess().getColonKeyword_26()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getColonKeyword_26()); 

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
    // InternalMemorando.g:881:1: rule__Memorando__Group__27 : rule__Memorando__Group__27__Impl rule__Memorando__Group__28 ;
    public final void rule__Memorando__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:885:1: ( rule__Memorando__Group__27__Impl rule__Memorando__Group__28 )
            // InternalMemorando.g:886:2: rule__Memorando__Group__27__Impl rule__Memorando__Group__28
            {
            pushFollow(FOLLOW_16);
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
    // InternalMemorando.g:893:1: rule__Memorando__Group__27__Impl : ( ( rule__Memorando__AssuntoAssignment_27 ) ) ;
    public final void rule__Memorando__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:897:1: ( ( ( rule__Memorando__AssuntoAssignment_27 ) ) )
            // InternalMemorando.g:898:1: ( ( rule__Memorando__AssuntoAssignment_27 ) )
            {
            // InternalMemorando.g:898:1: ( ( rule__Memorando__AssuntoAssignment_27 ) )
            // InternalMemorando.g:899:2: ( rule__Memorando__AssuntoAssignment_27 )
            {
             before(grammarAccess.getMemorandoAccess().getAssuntoAssignment_27()); 
            // InternalMemorando.g:900:2: ( rule__Memorando__AssuntoAssignment_27 )
            // InternalMemorando.g:900:3: rule__Memorando__AssuntoAssignment_27
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__AssuntoAssignment_27();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getAssuntoAssignment_27()); 

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
    // InternalMemorando.g:908:1: rule__Memorando__Group__28 : rule__Memorando__Group__28__Impl rule__Memorando__Group__29 ;
    public final void rule__Memorando__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:912:1: ( rule__Memorando__Group__28__Impl rule__Memorando__Group__29 )
            // InternalMemorando.g:913:2: rule__Memorando__Group__28__Impl rule__Memorando__Group__29
            {
            pushFollow(FOLLOW_4);
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
    // InternalMemorando.g:920:1: rule__Memorando__Group__28__Impl : ( 'Destinos' ) ;
    public final void rule__Memorando__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:924:1: ( ( 'Destinos' ) )
            // InternalMemorando.g:925:1: ( 'Destinos' )
            {
            // InternalMemorando.g:925:1: ( 'Destinos' )
            // InternalMemorando.g:926:2: 'Destinos'
            {
             before(grammarAccess.getMemorandoAccess().getDestinosKeyword_28()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getDestinosKeyword_28()); 

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
    // InternalMemorando.g:935:1: rule__Memorando__Group__29 : rule__Memorando__Group__29__Impl rule__Memorando__Group__30 ;
    public final void rule__Memorando__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:939:1: ( rule__Memorando__Group__29__Impl rule__Memorando__Group__30 )
            // InternalMemorando.g:940:2: rule__Memorando__Group__29__Impl rule__Memorando__Group__30
            {
            pushFollow(FOLLOW_17);
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
    // InternalMemorando.g:947:1: rule__Memorando__Group__29__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:951:1: ( ( ':' ) )
            // InternalMemorando.g:952:1: ( ':' )
            {
            // InternalMemorando.g:952:1: ( ':' )
            // InternalMemorando.g:953:2: ':'
            {
             before(grammarAccess.getMemorandoAccess().getColonKeyword_29()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getColonKeyword_29()); 

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
    // InternalMemorando.g:962:1: rule__Memorando__Group__30 : rule__Memorando__Group__30__Impl rule__Memorando__Group__31 ;
    public final void rule__Memorando__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:966:1: ( rule__Memorando__Group__30__Impl rule__Memorando__Group__31 )
            // InternalMemorando.g:967:2: rule__Memorando__Group__30__Impl rule__Memorando__Group__31
            {
            pushFollow(FOLLOW_18);
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
    // InternalMemorando.g:974:1: rule__Memorando__Group__30__Impl : ( '[' ) ;
    public final void rule__Memorando__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:978:1: ( ( '[' ) )
            // InternalMemorando.g:979:1: ( '[' )
            {
            // InternalMemorando.g:979:1: ( '[' )
            // InternalMemorando.g:980:2: '['
            {
             before(grammarAccess.getMemorandoAccess().getLeftSquareBracketKeyword_30()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getLeftSquareBracketKeyword_30()); 

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
    // InternalMemorando.g:989:1: rule__Memorando__Group__31 : rule__Memorando__Group__31__Impl rule__Memorando__Group__32 ;
    public final void rule__Memorando__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:993:1: ( rule__Memorando__Group__31__Impl rule__Memorando__Group__32 )
            // InternalMemorando.g:994:2: rule__Memorando__Group__31__Impl rule__Memorando__Group__32
            {
            pushFollow(FOLLOW_18);
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
    // InternalMemorando.g:1001:1: rule__Memorando__Group__31__Impl : ( ( rule__Memorando__DestinosAssignment_31 )* ) ;
    public final void rule__Memorando__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1005:1: ( ( ( rule__Memorando__DestinosAssignment_31 )* ) )
            // InternalMemorando.g:1006:1: ( ( rule__Memorando__DestinosAssignment_31 )* )
            {
            // InternalMemorando.g:1006:1: ( ( rule__Memorando__DestinosAssignment_31 )* )
            // InternalMemorando.g:1007:2: ( rule__Memorando__DestinosAssignment_31 )*
            {
             before(grammarAccess.getMemorandoAccess().getDestinosAssignment_31()); 
            // InternalMemorando.g:1008:2: ( rule__Memorando__DestinosAssignment_31 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMemorando.g:1008:3: rule__Memorando__DestinosAssignment_31
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Memorando__DestinosAssignment_31();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getDestinosAssignment_31()); 

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
    // InternalMemorando.g:1016:1: rule__Memorando__Group__32 : rule__Memorando__Group__32__Impl rule__Memorando__Group__33 ;
    public final void rule__Memorando__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1020:1: ( rule__Memorando__Group__32__Impl rule__Memorando__Group__33 )
            // InternalMemorando.g:1021:2: rule__Memorando__Group__32__Impl rule__Memorando__Group__33
            {
            pushFollow(FOLLOW_20);
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
    // InternalMemorando.g:1028:1: rule__Memorando__Group__32__Impl : ( ']' ) ;
    public final void rule__Memorando__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1032:1: ( ( ']' ) )
            // InternalMemorando.g:1033:1: ( ']' )
            {
            // InternalMemorando.g:1033:1: ( ']' )
            // InternalMemorando.g:1034:2: ']'
            {
             before(grammarAccess.getMemorandoAccess().getRightSquareBracketKeyword_32()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getRightSquareBracketKeyword_32()); 

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
    // InternalMemorando.g:1043:1: rule__Memorando__Group__33 : rule__Memorando__Group__33__Impl rule__Memorando__Group__34 ;
    public final void rule__Memorando__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1047:1: ( rule__Memorando__Group__33__Impl rule__Memorando__Group__34 )
            // InternalMemorando.g:1048:2: rule__Memorando__Group__33__Impl rule__Memorando__Group__34
            {
            pushFollow(FOLLOW_4);
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
    // InternalMemorando.g:1055:1: rule__Memorando__Group__33__Impl : ( 'Mensagem' ) ;
    public final void rule__Memorando__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1059:1: ( ( 'Mensagem' ) )
            // InternalMemorando.g:1060:1: ( 'Mensagem' )
            {
            // InternalMemorando.g:1060:1: ( 'Mensagem' )
            // InternalMemorando.g:1061:2: 'Mensagem'
            {
             before(grammarAccess.getMemorandoAccess().getMensagemKeyword_33()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getMensagemKeyword_33()); 

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
    // InternalMemorando.g:1070:1: rule__Memorando__Group__34 : rule__Memorando__Group__34__Impl rule__Memorando__Group__35 ;
    public final void rule__Memorando__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1074:1: ( rule__Memorando__Group__34__Impl rule__Memorando__Group__35 )
            // InternalMemorando.g:1075:2: rule__Memorando__Group__34__Impl rule__Memorando__Group__35
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
    // InternalMemorando.g:1082:1: rule__Memorando__Group__34__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1086:1: ( ( ':' ) )
            // InternalMemorando.g:1087:1: ( ':' )
            {
            // InternalMemorando.g:1087:1: ( ':' )
            // InternalMemorando.g:1088:2: ':'
            {
             before(grammarAccess.getMemorandoAccess().getColonKeyword_34()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getColonKeyword_34()); 

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
    // InternalMemorando.g:1097:1: rule__Memorando__Group__35 : rule__Memorando__Group__35__Impl rule__Memorando__Group__36 ;
    public final void rule__Memorando__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1101:1: ( rule__Memorando__Group__35__Impl rule__Memorando__Group__36 )
            // InternalMemorando.g:1102:2: rule__Memorando__Group__35__Impl rule__Memorando__Group__36
            {
            pushFollow(FOLLOW_21);
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
    // InternalMemorando.g:1109:1: rule__Memorando__Group__35__Impl : ( '[' ) ;
    public final void rule__Memorando__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1113:1: ( ( '[' ) )
            // InternalMemorando.g:1114:1: ( '[' )
            {
            // InternalMemorando.g:1114:1: ( '[' )
            // InternalMemorando.g:1115:2: '['
            {
             before(grammarAccess.getMemorandoAccess().getLeftSquareBracketKeyword_35()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getLeftSquareBracketKeyword_35()); 

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
    // InternalMemorando.g:1124:1: rule__Memorando__Group__36 : rule__Memorando__Group__36__Impl rule__Memorando__Group__37 ;
    public final void rule__Memorando__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1128:1: ( rule__Memorando__Group__36__Impl rule__Memorando__Group__37 )
            // InternalMemorando.g:1129:2: rule__Memorando__Group__36__Impl rule__Memorando__Group__37
            {
            pushFollow(FOLLOW_21);
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
    // InternalMemorando.g:1136:1: rule__Memorando__Group__36__Impl : ( ( rule__Memorando__ParagrafosAssignment_36 )* ) ;
    public final void rule__Memorando__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1140:1: ( ( ( rule__Memorando__ParagrafosAssignment_36 )* ) )
            // InternalMemorando.g:1141:1: ( ( rule__Memorando__ParagrafosAssignment_36 )* )
            {
            // InternalMemorando.g:1141:1: ( ( rule__Memorando__ParagrafosAssignment_36 )* )
            // InternalMemorando.g:1142:2: ( rule__Memorando__ParagrafosAssignment_36 )*
            {
             before(grammarAccess.getMemorandoAccess().getParagrafosAssignment_36()); 
            // InternalMemorando.g:1143:2: ( rule__Memorando__ParagrafosAssignment_36 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMemorando.g:1143:3: rule__Memorando__ParagrafosAssignment_36
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Memorando__ParagrafosAssignment_36();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getParagrafosAssignment_36()); 

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
    // InternalMemorando.g:1151:1: rule__Memorando__Group__37 : rule__Memorando__Group__37__Impl rule__Memorando__Group__38 ;
    public final void rule__Memorando__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1155:1: ( rule__Memorando__Group__37__Impl rule__Memorando__Group__38 )
            // InternalMemorando.g:1156:2: rule__Memorando__Group__37__Impl rule__Memorando__Group__38
            {
            pushFollow(FOLLOW_23);
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
    // InternalMemorando.g:1163:1: rule__Memorando__Group__37__Impl : ( ']' ) ;
    public final void rule__Memorando__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1167:1: ( ( ']' ) )
            // InternalMemorando.g:1168:1: ( ']' )
            {
            // InternalMemorando.g:1168:1: ( ']' )
            // InternalMemorando.g:1169:2: ']'
            {
             before(grammarAccess.getMemorandoAccess().getRightSquareBracketKeyword_37()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getRightSquareBracketKeyword_37()); 

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
    // InternalMemorando.g:1178:1: rule__Memorando__Group__38 : rule__Memorando__Group__38__Impl rule__Memorando__Group__39 ;
    public final void rule__Memorando__Group__38() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1182:1: ( rule__Memorando__Group__38__Impl rule__Memorando__Group__39 )
            // InternalMemorando.g:1183:2: rule__Memorando__Group__38__Impl rule__Memorando__Group__39
            {
            pushFollow(FOLLOW_4);
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
    // InternalMemorando.g:1190:1: rule__Memorando__Group__38__Impl : ( 'Remetente' ) ;
    public final void rule__Memorando__Group__38__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1194:1: ( ( 'Remetente' ) )
            // InternalMemorando.g:1195:1: ( 'Remetente' )
            {
            // InternalMemorando.g:1195:1: ( 'Remetente' )
            // InternalMemorando.g:1196:2: 'Remetente'
            {
             before(grammarAccess.getMemorandoAccess().getRemetenteKeyword_38()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getRemetenteKeyword_38()); 

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
    // InternalMemorando.g:1205:1: rule__Memorando__Group__39 : rule__Memorando__Group__39__Impl rule__Memorando__Group__40 ;
    public final void rule__Memorando__Group__39() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1209:1: ( rule__Memorando__Group__39__Impl rule__Memorando__Group__40 )
            // InternalMemorando.g:1210:2: rule__Memorando__Group__39__Impl rule__Memorando__Group__40
            {
            pushFollow(FOLLOW_14);
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
    // InternalMemorando.g:1217:1: rule__Memorando__Group__39__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__39__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1221:1: ( ( ':' ) )
            // InternalMemorando.g:1222:1: ( ':' )
            {
            // InternalMemorando.g:1222:1: ( ':' )
            // InternalMemorando.g:1223:2: ':'
            {
             before(grammarAccess.getMemorandoAccess().getColonKeyword_39()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getColonKeyword_39()); 

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
    // InternalMemorando.g:1232:1: rule__Memorando__Group__40 : rule__Memorando__Group__40__Impl rule__Memorando__Group__41 ;
    public final void rule__Memorando__Group__40() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1236:1: ( rule__Memorando__Group__40__Impl rule__Memorando__Group__41 )
            // InternalMemorando.g:1237:2: rule__Memorando__Group__40__Impl rule__Memorando__Group__41
            {
            pushFollow(FOLLOW_24);
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
    // InternalMemorando.g:1244:1: rule__Memorando__Group__40__Impl : ( ( rule__Memorando__RemetenteAssignment_40 ) ) ;
    public final void rule__Memorando__Group__40__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1248:1: ( ( ( rule__Memorando__RemetenteAssignment_40 ) ) )
            // InternalMemorando.g:1249:1: ( ( rule__Memorando__RemetenteAssignment_40 ) )
            {
            // InternalMemorando.g:1249:1: ( ( rule__Memorando__RemetenteAssignment_40 ) )
            // InternalMemorando.g:1250:2: ( rule__Memorando__RemetenteAssignment_40 )
            {
             before(grammarAccess.getMemorandoAccess().getRemetenteAssignment_40()); 
            // InternalMemorando.g:1251:2: ( rule__Memorando__RemetenteAssignment_40 )
            // InternalMemorando.g:1251:3: rule__Memorando__RemetenteAssignment_40
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__RemetenteAssignment_40();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getRemetenteAssignment_40()); 

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
    // InternalMemorando.g:1259:1: rule__Memorando__Group__41 : rule__Memorando__Group__41__Impl rule__Memorando__Group__42 ;
    public final void rule__Memorando__Group__41() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1263:1: ( rule__Memorando__Group__41__Impl rule__Memorando__Group__42 )
            // InternalMemorando.g:1264:2: rule__Memorando__Group__41__Impl rule__Memorando__Group__42
            {
            pushFollow(FOLLOW_4);
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
    // InternalMemorando.g:1271:1: rule__Memorando__Group__41__Impl : ( 'Cargo Remetente' ) ;
    public final void rule__Memorando__Group__41__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1275:1: ( ( 'Cargo Remetente' ) )
            // InternalMemorando.g:1276:1: ( 'Cargo Remetente' )
            {
            // InternalMemorando.g:1276:1: ( 'Cargo Remetente' )
            // InternalMemorando.g:1277:2: 'Cargo Remetente'
            {
             before(grammarAccess.getMemorandoAccess().getCargoRemetenteKeyword_41()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getCargoRemetenteKeyword_41()); 

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
    // InternalMemorando.g:1286:1: rule__Memorando__Group__42 : rule__Memorando__Group__42__Impl rule__Memorando__Group__43 ;
    public final void rule__Memorando__Group__42() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1290:1: ( rule__Memorando__Group__42__Impl rule__Memorando__Group__43 )
            // InternalMemorando.g:1291:2: rule__Memorando__Group__42__Impl rule__Memorando__Group__43
            {
            pushFollow(FOLLOW_14);
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
    // InternalMemorando.g:1298:1: rule__Memorando__Group__42__Impl : ( ':' ) ;
    public final void rule__Memorando__Group__42__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1302:1: ( ( ':' ) )
            // InternalMemorando.g:1303:1: ( ':' )
            {
            // InternalMemorando.g:1303:1: ( ':' )
            // InternalMemorando.g:1304:2: ':'
            {
             before(grammarAccess.getMemorandoAccess().getColonKeyword_42()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getColonKeyword_42()); 

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
    // InternalMemorando.g:1313:1: rule__Memorando__Group__43 : rule__Memorando__Group__43__Impl rule__Memorando__Group__44 ;
    public final void rule__Memorando__Group__43() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1317:1: ( rule__Memorando__Group__43__Impl rule__Memorando__Group__44 )
            // InternalMemorando.g:1318:2: rule__Memorando__Group__43__Impl rule__Memorando__Group__44
            {
            pushFollow(FOLLOW_25);
            rule__Memorando__Group__43__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memorando__Group__44();

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
    // InternalMemorando.g:1325:1: rule__Memorando__Group__43__Impl : ( ( rule__Memorando__CargoRemetenteAssignment_43 ) ) ;
    public final void rule__Memorando__Group__43__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1329:1: ( ( ( rule__Memorando__CargoRemetenteAssignment_43 ) ) )
            // InternalMemorando.g:1330:1: ( ( rule__Memorando__CargoRemetenteAssignment_43 ) )
            {
            // InternalMemorando.g:1330:1: ( ( rule__Memorando__CargoRemetenteAssignment_43 ) )
            // InternalMemorando.g:1331:2: ( rule__Memorando__CargoRemetenteAssignment_43 )
            {
             before(grammarAccess.getMemorandoAccess().getCargoRemetenteAssignment_43()); 
            // InternalMemorando.g:1332:2: ( rule__Memorando__CargoRemetenteAssignment_43 )
            // InternalMemorando.g:1332:3: rule__Memorando__CargoRemetenteAssignment_43
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__CargoRemetenteAssignment_43();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getCargoRemetenteAssignment_43()); 

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


    // $ANTLR start "rule__Memorando__Group__44"
    // InternalMemorando.g:1340:1: rule__Memorando__Group__44 : rule__Memorando__Group__44__Impl ;
    public final void rule__Memorando__Group__44() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1344:1: ( rule__Memorando__Group__44__Impl )
            // InternalMemorando.g:1345:2: rule__Memorando__Group__44__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__Group__44__Impl();

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
    // $ANTLR end "rule__Memorando__Group__44"


    // $ANTLR start "rule__Memorando__Group__44__Impl"
    // InternalMemorando.g:1351:1: rule__Memorando__Group__44__Impl : ( ';' ) ;
    public final void rule__Memorando__Group__44__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1355:1: ( ( ';' ) )
            // InternalMemorando.g:1356:1: ( ';' )
            {
            // InternalMemorando.g:1356:1: ( ';' )
            // InternalMemorando.g:1357:2: ';'
            {
             before(grammarAccess.getMemorandoAccess().getSemicolonKeyword_44()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getSemicolonKeyword_44()); 

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
    // $ANTLR end "rule__Memorando__Group__44__Impl"


    // $ANTLR start "rule__Destino__Group__0"
    // InternalMemorando.g:1367:1: rule__Destino__Group__0 : rule__Destino__Group__0__Impl rule__Destino__Group__1 ;
    public final void rule__Destino__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1371:1: ( rule__Destino__Group__0__Impl rule__Destino__Group__1 )
            // InternalMemorando.g:1372:2: rule__Destino__Group__0__Impl rule__Destino__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Destino__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destino__Group__1();

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
    // $ANTLR end "rule__Destino__Group__0"


    // $ANTLR start "rule__Destino__Group__0__Impl"
    // InternalMemorando.g:1379:1: rule__Destino__Group__0__Impl : ( ( rule__Destino__DestinoAssignment_0 ) ) ;
    public final void rule__Destino__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1383:1: ( ( ( rule__Destino__DestinoAssignment_0 ) ) )
            // InternalMemorando.g:1384:1: ( ( rule__Destino__DestinoAssignment_0 ) )
            {
            // InternalMemorando.g:1384:1: ( ( rule__Destino__DestinoAssignment_0 ) )
            // InternalMemorando.g:1385:2: ( rule__Destino__DestinoAssignment_0 )
            {
             before(grammarAccess.getDestinoAccess().getDestinoAssignment_0()); 
            // InternalMemorando.g:1386:2: ( rule__Destino__DestinoAssignment_0 )
            // InternalMemorando.g:1386:3: rule__Destino__DestinoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Destino__DestinoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDestinoAccess().getDestinoAssignment_0()); 

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
    // $ANTLR end "rule__Destino__Group__0__Impl"


    // $ANTLR start "rule__Destino__Group__1"
    // InternalMemorando.g:1394:1: rule__Destino__Group__1 : rule__Destino__Group__1__Impl ;
    public final void rule__Destino__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1398:1: ( rule__Destino__Group__1__Impl )
            // InternalMemorando.g:1399:2: rule__Destino__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Destino__Group__1__Impl();

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
    // $ANTLR end "rule__Destino__Group__1"


    // $ANTLR start "rule__Destino__Group__1__Impl"
    // InternalMemorando.g:1405:1: rule__Destino__Group__1__Impl : ( ( ' ' )? ) ;
    public final void rule__Destino__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1409:1: ( ( ( ' ' )? ) )
            // InternalMemorando.g:1410:1: ( ( ' ' )? )
            {
            // InternalMemorando.g:1410:1: ( ( ' ' )? )
            // InternalMemorando.g:1411:2: ( ' ' )?
            {
             before(grammarAccess.getDestinoAccess().getSpaceKeyword_1()); 
            // InternalMemorando.g:1412:2: ( ' ' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMemorando.g:1412:3: ' '
                    {
                    match(input,28,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDestinoAccess().getSpaceKeyword_1()); 

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
    // $ANTLR end "rule__Destino__Group__1__Impl"


    // $ANTLR start "rule__Paragrafo__Group__0"
    // InternalMemorando.g:1421:1: rule__Paragrafo__Group__0 : rule__Paragrafo__Group__0__Impl rule__Paragrafo__Group__1 ;
    public final void rule__Paragrafo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1425:1: ( rule__Paragrafo__Group__0__Impl rule__Paragrafo__Group__1 )
            // InternalMemorando.g:1426:2: rule__Paragrafo__Group__0__Impl rule__Paragrafo__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMemorando.g:1433:1: rule__Paragrafo__Group__0__Impl : ( ( rule__Paragrafo__ParagrafoAssignment_0 ) ) ;
    public final void rule__Paragrafo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1437:1: ( ( ( rule__Paragrafo__ParagrafoAssignment_0 ) ) )
            // InternalMemorando.g:1438:1: ( ( rule__Paragrafo__ParagrafoAssignment_0 ) )
            {
            // InternalMemorando.g:1438:1: ( ( rule__Paragrafo__ParagrafoAssignment_0 ) )
            // InternalMemorando.g:1439:2: ( rule__Paragrafo__ParagrafoAssignment_0 )
            {
             before(grammarAccess.getParagrafoAccess().getParagrafoAssignment_0()); 
            // InternalMemorando.g:1440:2: ( rule__Paragrafo__ParagrafoAssignment_0 )
            // InternalMemorando.g:1440:3: rule__Paragrafo__ParagrafoAssignment_0
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
    // InternalMemorando.g:1448:1: rule__Paragrafo__Group__1 : rule__Paragrafo__Group__1__Impl ;
    public final void rule__Paragrafo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1452:1: ( rule__Paragrafo__Group__1__Impl )
            // InternalMemorando.g:1453:2: rule__Paragrafo__Group__1__Impl
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
    // InternalMemorando.g:1459:1: rule__Paragrafo__Group__1__Impl : ( ( ' ' )? ) ;
    public final void rule__Paragrafo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1463:1: ( ( ( ' ' )? ) )
            // InternalMemorando.g:1464:1: ( ( ' ' )? )
            {
            // InternalMemorando.g:1464:1: ( ( ' ' )? )
            // InternalMemorando.g:1465:2: ( ' ' )?
            {
             before(grammarAccess.getParagrafoAccess().getSpaceKeyword_1()); 
            // InternalMemorando.g:1466:2: ( ' ' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMemorando.g:1466:3: ' '
                    {
                    match(input,28,FOLLOW_2); 

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


    // $ANTLR start "rule__Model__MemorandosAssignment"
    // InternalMemorando.g:1475:1: rule__Model__MemorandosAssignment : ( ruleMemorando ) ;
    public final void rule__Model__MemorandosAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1479:1: ( ( ruleMemorando ) )
            // InternalMemorando.g:1480:2: ( ruleMemorando )
            {
            // InternalMemorando.g:1480:2: ( ruleMemorando )
            // InternalMemorando.g:1481:3: ruleMemorando
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
    // InternalMemorando.g:1490:1: rule__Memorando__NumeroAssignment_2 : ( RULE_INT ) ;
    public final void rule__Memorando__NumeroAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1494:1: ( ( RULE_INT ) )
            // InternalMemorando.g:1495:2: ( RULE_INT )
            {
            // InternalMemorando.g:1495:2: ( RULE_INT )
            // InternalMemorando.g:1496:3: RULE_INT
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


    // $ANTLR start "rule__Memorando__SetorDestinatarioAssignment_5"
    // InternalMemorando.g:1505:1: rule__Memorando__SetorDestinatarioAssignment_5 : ( RULE_ID ) ;
    public final void rule__Memorando__SetorDestinatarioAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1509:1: ( ( RULE_ID ) )
            // InternalMemorando.g:1510:2: ( RULE_ID )
            {
            // InternalMemorando.g:1510:2: ( RULE_ID )
            // InternalMemorando.g:1511:3: RULE_ID
            {
             before(grammarAccess.getMemorandoAccess().getSetorDestinatarioIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getSetorDestinatarioIDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Memorando__SetorDestinatarioAssignment_5"


    // $ANTLR start "rule__Memorando__SetorRemetenteAssignment_8"
    // InternalMemorando.g:1520:1: rule__Memorando__SetorRemetenteAssignment_8 : ( RULE_ID ) ;
    public final void rule__Memorando__SetorRemetenteAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1524:1: ( ( RULE_ID ) )
            // InternalMemorando.g:1525:2: ( RULE_ID )
            {
            // InternalMemorando.g:1525:2: ( RULE_ID )
            // InternalMemorando.g:1526:3: RULE_ID
            {
             before(grammarAccess.getMemorandoAccess().getSetorRemetenteIDTerminalRuleCall_8_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getSetorRemetenteIDTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__Memorando__SetorRemetenteAssignment_8"


    // $ANTLR start "rule__Memorando__CidadeAssignment_11"
    // InternalMemorando.g:1535:1: rule__Memorando__CidadeAssignment_11 : ( RULE_ID ) ;
    public final void rule__Memorando__CidadeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1539:1: ( ( RULE_ID ) )
            // InternalMemorando.g:1540:2: ( RULE_ID )
            {
            // InternalMemorando.g:1540:2: ( RULE_ID )
            // InternalMemorando.g:1541:3: RULE_ID
            {
             before(grammarAccess.getMemorandoAccess().getCidadeIDTerminalRuleCall_11_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getCidadeIDTerminalRuleCall_11_0()); 

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
    // $ANTLR end "rule__Memorando__CidadeAssignment_11"


    // $ANTLR start "rule__Memorando__EstadoAssignment_14"
    // InternalMemorando.g:1550:1: rule__Memorando__EstadoAssignment_14 : ( RULE_ID ) ;
    public final void rule__Memorando__EstadoAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1554:1: ( ( RULE_ID ) )
            // InternalMemorando.g:1555:2: ( RULE_ID )
            {
            // InternalMemorando.g:1555:2: ( RULE_ID )
            // InternalMemorando.g:1556:3: RULE_ID
            {
             before(grammarAccess.getMemorandoAccess().getEstadoIDTerminalRuleCall_14_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getEstadoIDTerminalRuleCall_14_0()); 

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
    // $ANTLR end "rule__Memorando__EstadoAssignment_14"


    // $ANTLR start "rule__Memorando__DiaAssignment_17"
    // InternalMemorando.g:1565:1: rule__Memorando__DiaAssignment_17 : ( RULE_INT ) ;
    public final void rule__Memorando__DiaAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1569:1: ( ( RULE_INT ) )
            // InternalMemorando.g:1570:2: ( RULE_INT )
            {
            // InternalMemorando.g:1570:2: ( RULE_INT )
            // InternalMemorando.g:1571:3: RULE_INT
            {
             before(grammarAccess.getMemorandoAccess().getDiaINTTerminalRuleCall_17_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getDiaINTTerminalRuleCall_17_0()); 

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
    // $ANTLR end "rule__Memorando__DiaAssignment_17"


    // $ANTLR start "rule__Memorando__MesAssignment_19"
    // InternalMemorando.g:1580:1: rule__Memorando__MesAssignment_19 : ( RULE_ID ) ;
    public final void rule__Memorando__MesAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1584:1: ( ( RULE_ID ) )
            // InternalMemorando.g:1585:2: ( RULE_ID )
            {
            // InternalMemorando.g:1585:2: ( RULE_ID )
            // InternalMemorando.g:1586:3: RULE_ID
            {
             before(grammarAccess.getMemorandoAccess().getMesIDTerminalRuleCall_19_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getMesIDTerminalRuleCall_19_0()); 

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
    // $ANTLR end "rule__Memorando__MesAssignment_19"


    // $ANTLR start "rule__Memorando__AnoAssignment_21"
    // InternalMemorando.g:1595:1: rule__Memorando__AnoAssignment_21 : ( RULE_INT ) ;
    public final void rule__Memorando__AnoAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1599:1: ( ( RULE_INT ) )
            // InternalMemorando.g:1600:2: ( RULE_INT )
            {
            // InternalMemorando.g:1600:2: ( RULE_INT )
            // InternalMemorando.g:1601:3: RULE_INT
            {
             before(grammarAccess.getMemorandoAccess().getAnoINTTerminalRuleCall_21_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getAnoINTTerminalRuleCall_21_0()); 

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
    // $ANTLR end "rule__Memorando__AnoAssignment_21"


    // $ANTLR start "rule__Memorando__CargoDestinatarioAssignment_24"
    // InternalMemorando.g:1610:1: rule__Memorando__CargoDestinatarioAssignment_24 : ( RULE_STRING ) ;
    public final void rule__Memorando__CargoDestinatarioAssignment_24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1614:1: ( ( RULE_STRING ) )
            // InternalMemorando.g:1615:2: ( RULE_STRING )
            {
            // InternalMemorando.g:1615:2: ( RULE_STRING )
            // InternalMemorando.g:1616:3: RULE_STRING
            {
             before(grammarAccess.getMemorandoAccess().getCargoDestinatarioSTRINGTerminalRuleCall_24_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getCargoDestinatarioSTRINGTerminalRuleCall_24_0()); 

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
    // $ANTLR end "rule__Memorando__CargoDestinatarioAssignment_24"


    // $ANTLR start "rule__Memorando__AssuntoAssignment_27"
    // InternalMemorando.g:1625:1: rule__Memorando__AssuntoAssignment_27 : ( RULE_STRING ) ;
    public final void rule__Memorando__AssuntoAssignment_27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1629:1: ( ( RULE_STRING ) )
            // InternalMemorando.g:1630:2: ( RULE_STRING )
            {
            // InternalMemorando.g:1630:2: ( RULE_STRING )
            // InternalMemorando.g:1631:3: RULE_STRING
            {
             before(grammarAccess.getMemorandoAccess().getAssuntoSTRINGTerminalRuleCall_27_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getAssuntoSTRINGTerminalRuleCall_27_0()); 

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
    // $ANTLR end "rule__Memorando__AssuntoAssignment_27"


    // $ANTLR start "rule__Memorando__DestinosAssignment_31"
    // InternalMemorando.g:1640:1: rule__Memorando__DestinosAssignment_31 : ( ruleDestino ) ;
    public final void rule__Memorando__DestinosAssignment_31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1644:1: ( ( ruleDestino ) )
            // InternalMemorando.g:1645:2: ( ruleDestino )
            {
            // InternalMemorando.g:1645:2: ( ruleDestino )
            // InternalMemorando.g:1646:3: ruleDestino
            {
             before(grammarAccess.getMemorandoAccess().getDestinosDestinoParserRuleCall_31_0()); 
            pushFollow(FOLLOW_2);
            ruleDestino();

            state._fsp--;

             after(grammarAccess.getMemorandoAccess().getDestinosDestinoParserRuleCall_31_0()); 

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
    // $ANTLR end "rule__Memorando__DestinosAssignment_31"


    // $ANTLR start "rule__Memorando__ParagrafosAssignment_36"
    // InternalMemorando.g:1655:1: rule__Memorando__ParagrafosAssignment_36 : ( ruleParagrafo ) ;
    public final void rule__Memorando__ParagrafosAssignment_36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1659:1: ( ( ruleParagrafo ) )
            // InternalMemorando.g:1660:2: ( ruleParagrafo )
            {
            // InternalMemorando.g:1660:2: ( ruleParagrafo )
            // InternalMemorando.g:1661:3: ruleParagrafo
            {
             before(grammarAccess.getMemorandoAccess().getParagrafosParagrafoParserRuleCall_36_0()); 
            pushFollow(FOLLOW_2);
            ruleParagrafo();

            state._fsp--;

             after(grammarAccess.getMemorandoAccess().getParagrafosParagrafoParserRuleCall_36_0()); 

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
    // $ANTLR end "rule__Memorando__ParagrafosAssignment_36"


    // $ANTLR start "rule__Memorando__RemetenteAssignment_40"
    // InternalMemorando.g:1670:1: rule__Memorando__RemetenteAssignment_40 : ( RULE_STRING ) ;
    public final void rule__Memorando__RemetenteAssignment_40() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1674:1: ( ( RULE_STRING ) )
            // InternalMemorando.g:1675:2: ( RULE_STRING )
            {
            // InternalMemorando.g:1675:2: ( RULE_STRING )
            // InternalMemorando.g:1676:3: RULE_STRING
            {
             before(grammarAccess.getMemorandoAccess().getRemetenteSTRINGTerminalRuleCall_40_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getRemetenteSTRINGTerminalRuleCall_40_0()); 

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
    // $ANTLR end "rule__Memorando__RemetenteAssignment_40"


    // $ANTLR start "rule__Memorando__CargoRemetenteAssignment_43"
    // InternalMemorando.g:1685:1: rule__Memorando__CargoRemetenteAssignment_43 : ( RULE_STRING ) ;
    public final void rule__Memorando__CargoRemetenteAssignment_43() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1689:1: ( ( RULE_STRING ) )
            // InternalMemorando.g:1690:2: ( RULE_STRING )
            {
            // InternalMemorando.g:1690:2: ( RULE_STRING )
            // InternalMemorando.g:1691:3: RULE_STRING
            {
             before(grammarAccess.getMemorandoAccess().getCargoRemetenteSTRINGTerminalRuleCall_43_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getCargoRemetenteSTRINGTerminalRuleCall_43_0()); 

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
    // $ANTLR end "rule__Memorando__CargoRemetenteAssignment_43"


    // $ANTLR start "rule__Destino__DestinoAssignment_0"
    // InternalMemorando.g:1700:1: rule__Destino__DestinoAssignment_0 : ( RULE_ID ) ;
    public final void rule__Destino__DestinoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1704:1: ( ( RULE_ID ) )
            // InternalMemorando.g:1705:2: ( RULE_ID )
            {
            // InternalMemorando.g:1705:2: ( RULE_ID )
            // InternalMemorando.g:1706:3: RULE_ID
            {
             before(grammarAccess.getDestinoAccess().getDestinoIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDestinoAccess().getDestinoIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Destino__DestinoAssignment_0"


    // $ANTLR start "rule__Paragrafo__ParagrafoAssignment_0"
    // InternalMemorando.g:1715:1: rule__Paragrafo__ParagrafoAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Paragrafo__ParagrafoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1719:1: ( ( RULE_STRING ) )
            // InternalMemorando.g:1720:2: ( RULE_STRING )
            {
            // InternalMemorando.g:1720:2: ( RULE_STRING )
            // InternalMemorando.g:1721:3: RULE_STRING
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
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});

}