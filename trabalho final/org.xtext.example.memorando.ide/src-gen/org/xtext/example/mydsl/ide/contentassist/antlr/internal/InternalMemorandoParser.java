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
    // InternalMemorando.g:112:1: ruleDestino : ( ( rule__Destino__DestinoAssignment ) ) ;
    public final void ruleDestino() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:116:2: ( ( ( rule__Destino__DestinoAssignment ) ) )
            // InternalMemorando.g:117:2: ( ( rule__Destino__DestinoAssignment ) )
            {
            // InternalMemorando.g:117:2: ( ( rule__Destino__DestinoAssignment ) )
            // InternalMemorando.g:118:3: ( rule__Destino__DestinoAssignment )
            {
             before(grammarAccess.getDestinoAccess().getDestinoAssignment()); 
            // InternalMemorando.g:119:3: ( rule__Destino__DestinoAssignment )
            // InternalMemorando.g:119:4: rule__Destino__DestinoAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Destino__DestinoAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDestinoAccess().getDestinoAssignment()); 

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
    // InternalMemorando.g:137:1: ruleParagrafo : ( ( rule__Paragrafo__ParagrafoAssignment ) ) ;
    public final void ruleParagrafo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:141:2: ( ( ( rule__Paragrafo__ParagrafoAssignment ) ) )
            // InternalMemorando.g:142:2: ( ( rule__Paragrafo__ParagrafoAssignment ) )
            {
            // InternalMemorando.g:142:2: ( ( rule__Paragrafo__ParagrafoAssignment ) )
            // InternalMemorando.g:143:3: ( rule__Paragrafo__ParagrafoAssignment )
            {
             before(grammarAccess.getParagrafoAccess().getParagrafoAssignment()); 
            // InternalMemorando.g:144:3: ( rule__Paragrafo__ParagrafoAssignment )
            // InternalMemorando.g:144:4: rule__Paragrafo__ParagrafoAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Paragrafo__ParagrafoAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParagrafoAccess().getParagrafoAssignment()); 

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
    // InternalMemorando.g:164:1: rule__Memorando__Group__0__Impl : ( ( ( 'Numero: ' ) ) ( ( 'Numero: ' )* ) ) ;
    public final void rule__Memorando__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:168:1: ( ( ( ( 'Numero: ' ) ) ( ( 'Numero: ' )* ) ) )
            // InternalMemorando.g:169:1: ( ( ( 'Numero: ' ) ) ( ( 'Numero: ' )* ) )
            {
            // InternalMemorando.g:169:1: ( ( ( 'Numero: ' ) ) ( ( 'Numero: ' )* ) )
            // InternalMemorando.g:170:2: ( ( 'Numero: ' ) ) ( ( 'Numero: ' )* )
            {
            // InternalMemorando.g:170:2: ( ( 'Numero: ' ) )
            // InternalMemorando.g:171:3: ( 'Numero: ' )
            {
             before(grammarAccess.getMemorandoAccess().getNumeroKeyword_0()); 
            // InternalMemorando.g:172:3: ( 'Numero: ' )
            // InternalMemorando.g:172:4: 'Numero: '
            {
            match(input,11,FOLLOW_3); 

            }

             after(grammarAccess.getMemorandoAccess().getNumeroKeyword_0()); 

            }

            // InternalMemorando.g:175:2: ( ( 'Numero: ' )* )
            // InternalMemorando.g:176:3: ( 'Numero: ' )*
            {
             before(grammarAccess.getMemorandoAccess().getNumeroKeyword_0()); 
            // InternalMemorando.g:177:3: ( 'Numero: ' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMemorando.g:177:4: 'Numero: '
            	    {
            	    match(input,11,FOLLOW_3); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getNumeroKeyword_0()); 

            }


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
    // InternalMemorando.g:186:1: rule__Memorando__Group__1 : rule__Memorando__Group__1__Impl rule__Memorando__Group__2 ;
    public final void rule__Memorando__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:190:1: ( rule__Memorando__Group__1__Impl rule__Memorando__Group__2 )
            // InternalMemorando.g:191:2: rule__Memorando__Group__1__Impl rule__Memorando__Group__2
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
    // InternalMemorando.g:198:1: rule__Memorando__Group__1__Impl : ( ( ( rule__Memorando__NumeroAssignment_1 ) ) ( ( rule__Memorando__NumeroAssignment_1 )* ) ) ;
    public final void rule__Memorando__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:202:1: ( ( ( ( rule__Memorando__NumeroAssignment_1 ) ) ( ( rule__Memorando__NumeroAssignment_1 )* ) ) )
            // InternalMemorando.g:203:1: ( ( ( rule__Memorando__NumeroAssignment_1 ) ) ( ( rule__Memorando__NumeroAssignment_1 )* ) )
            {
            // InternalMemorando.g:203:1: ( ( ( rule__Memorando__NumeroAssignment_1 ) ) ( ( rule__Memorando__NumeroAssignment_1 )* ) )
            // InternalMemorando.g:204:2: ( ( rule__Memorando__NumeroAssignment_1 ) ) ( ( rule__Memorando__NumeroAssignment_1 )* )
            {
            // InternalMemorando.g:204:2: ( ( rule__Memorando__NumeroAssignment_1 ) )
            // InternalMemorando.g:205:3: ( rule__Memorando__NumeroAssignment_1 )
            {
             before(grammarAccess.getMemorandoAccess().getNumeroAssignment_1()); 
            // InternalMemorando.g:206:3: ( rule__Memorando__NumeroAssignment_1 )
            // InternalMemorando.g:206:4: rule__Memorando__NumeroAssignment_1
            {
            pushFollow(FOLLOW_6);
            rule__Memorando__NumeroAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getNumeroAssignment_1()); 

            }

            // InternalMemorando.g:209:2: ( ( rule__Memorando__NumeroAssignment_1 )* )
            // InternalMemorando.g:210:3: ( rule__Memorando__NumeroAssignment_1 )*
            {
             before(grammarAccess.getMemorandoAccess().getNumeroAssignment_1()); 
            // InternalMemorando.g:211:3: ( rule__Memorando__NumeroAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_INT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMemorando.g:211:4: rule__Memorando__NumeroAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Memorando__NumeroAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getNumeroAssignment_1()); 

            }


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
    // InternalMemorando.g:220:1: rule__Memorando__Group__2 : rule__Memorando__Group__2__Impl rule__Memorando__Group__3 ;
    public final void rule__Memorando__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:224:1: ( rule__Memorando__Group__2__Impl rule__Memorando__Group__3 )
            // InternalMemorando.g:225:2: rule__Memorando__Group__2__Impl rule__Memorando__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalMemorando.g:232:1: rule__Memorando__Group__2__Impl : ( ( ( ', Setor Destinatario: ' ) ) ( ( ', Setor Destinatario: ' )* ) ) ;
    public final void rule__Memorando__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:236:1: ( ( ( ( ', Setor Destinatario: ' ) ) ( ( ', Setor Destinatario: ' )* ) ) )
            // InternalMemorando.g:237:1: ( ( ( ', Setor Destinatario: ' ) ) ( ( ', Setor Destinatario: ' )* ) )
            {
            // InternalMemorando.g:237:1: ( ( ( ', Setor Destinatario: ' ) ) ( ( ', Setor Destinatario: ' )* ) )
            // InternalMemorando.g:238:2: ( ( ', Setor Destinatario: ' ) ) ( ( ', Setor Destinatario: ' )* )
            {
            // InternalMemorando.g:238:2: ( ( ', Setor Destinatario: ' ) )
            // InternalMemorando.g:239:3: ( ', Setor Destinatario: ' )
            {
             before(grammarAccess.getMemorandoAccess().getSetorDestinatarioKeyword_2()); 
            // InternalMemorando.g:240:3: ( ', Setor Destinatario: ' )
            // InternalMemorando.g:240:4: ', Setor Destinatario: '
            {
            match(input,12,FOLLOW_8); 

            }

             after(grammarAccess.getMemorandoAccess().getSetorDestinatarioKeyword_2()); 

            }

            // InternalMemorando.g:243:2: ( ( ', Setor Destinatario: ' )* )
            // InternalMemorando.g:244:3: ( ', Setor Destinatario: ' )*
            {
             before(grammarAccess.getMemorandoAccess().getSetorDestinatarioKeyword_2()); 
            // InternalMemorando.g:245:3: ( ', Setor Destinatario: ' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMemorando.g:245:4: ', Setor Destinatario: '
            	    {
            	    match(input,12,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getSetorDestinatarioKeyword_2()); 

            }


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
    // InternalMemorando.g:254:1: rule__Memorando__Group__3 : rule__Memorando__Group__3__Impl rule__Memorando__Group__4 ;
    public final void rule__Memorando__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:258:1: ( rule__Memorando__Group__3__Impl rule__Memorando__Group__4 )
            // InternalMemorando.g:259:2: rule__Memorando__Group__3__Impl rule__Memorando__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalMemorando.g:266:1: rule__Memorando__Group__3__Impl : ( ( ( rule__Memorando__SetorDestinatarioAssignment_3 ) ) ( ( rule__Memorando__SetorDestinatarioAssignment_3 )* ) ) ;
    public final void rule__Memorando__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:270:1: ( ( ( ( rule__Memorando__SetorDestinatarioAssignment_3 ) ) ( ( rule__Memorando__SetorDestinatarioAssignment_3 )* ) ) )
            // InternalMemorando.g:271:1: ( ( ( rule__Memorando__SetorDestinatarioAssignment_3 ) ) ( ( rule__Memorando__SetorDestinatarioAssignment_3 )* ) )
            {
            // InternalMemorando.g:271:1: ( ( ( rule__Memorando__SetorDestinatarioAssignment_3 ) ) ( ( rule__Memorando__SetorDestinatarioAssignment_3 )* ) )
            // InternalMemorando.g:272:2: ( ( rule__Memorando__SetorDestinatarioAssignment_3 ) ) ( ( rule__Memorando__SetorDestinatarioAssignment_3 )* )
            {
            // InternalMemorando.g:272:2: ( ( rule__Memorando__SetorDestinatarioAssignment_3 ) )
            // InternalMemorando.g:273:3: ( rule__Memorando__SetorDestinatarioAssignment_3 )
            {
             before(grammarAccess.getMemorandoAccess().getSetorDestinatarioAssignment_3()); 
            // InternalMemorando.g:274:3: ( rule__Memorando__SetorDestinatarioAssignment_3 )
            // InternalMemorando.g:274:4: rule__Memorando__SetorDestinatarioAssignment_3
            {
            pushFollow(FOLLOW_10);
            rule__Memorando__SetorDestinatarioAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getSetorDestinatarioAssignment_3()); 

            }

            // InternalMemorando.g:277:2: ( ( rule__Memorando__SetorDestinatarioAssignment_3 )* )
            // InternalMemorando.g:278:3: ( rule__Memorando__SetorDestinatarioAssignment_3 )*
            {
             before(grammarAccess.getMemorandoAccess().getSetorDestinatarioAssignment_3()); 
            // InternalMemorando.g:279:3: ( rule__Memorando__SetorDestinatarioAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMemorando.g:279:4: rule__Memorando__SetorDestinatarioAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Memorando__SetorDestinatarioAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getSetorDestinatarioAssignment_3()); 

            }


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
    // InternalMemorando.g:288:1: rule__Memorando__Group__4 : rule__Memorando__Group__4__Impl rule__Memorando__Group__5 ;
    public final void rule__Memorando__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:292:1: ( rule__Memorando__Group__4__Impl rule__Memorando__Group__5 )
            // InternalMemorando.g:293:2: rule__Memorando__Group__4__Impl rule__Memorando__Group__5
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
    // InternalMemorando.g:300:1: rule__Memorando__Group__4__Impl : ( ( ( ', Setor Remetente: ' ) ) ( ( ', Setor Remetente: ' )* ) ) ;
    public final void rule__Memorando__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:304:1: ( ( ( ( ', Setor Remetente: ' ) ) ( ( ', Setor Remetente: ' )* ) ) )
            // InternalMemorando.g:305:1: ( ( ( ', Setor Remetente: ' ) ) ( ( ', Setor Remetente: ' )* ) )
            {
            // InternalMemorando.g:305:1: ( ( ( ', Setor Remetente: ' ) ) ( ( ', Setor Remetente: ' )* ) )
            // InternalMemorando.g:306:2: ( ( ', Setor Remetente: ' ) ) ( ( ', Setor Remetente: ' )* )
            {
            // InternalMemorando.g:306:2: ( ( ', Setor Remetente: ' ) )
            // InternalMemorando.g:307:3: ( ', Setor Remetente: ' )
            {
             before(grammarAccess.getMemorandoAccess().getSetorRemetenteKeyword_4()); 
            // InternalMemorando.g:308:3: ( ', Setor Remetente: ' )
            // InternalMemorando.g:308:4: ', Setor Remetente: '
            {
            match(input,13,FOLLOW_11); 

            }

             after(grammarAccess.getMemorandoAccess().getSetorRemetenteKeyword_4()); 

            }

            // InternalMemorando.g:311:2: ( ( ', Setor Remetente: ' )* )
            // InternalMemorando.g:312:3: ( ', Setor Remetente: ' )*
            {
             before(grammarAccess.getMemorandoAccess().getSetorRemetenteKeyword_4()); 
            // InternalMemorando.g:313:3: ( ', Setor Remetente: ' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMemorando.g:313:4: ', Setor Remetente: '
            	    {
            	    match(input,13,FOLLOW_11); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getSetorRemetenteKeyword_4()); 

            }


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
    // InternalMemorando.g:322:1: rule__Memorando__Group__5 : rule__Memorando__Group__5__Impl rule__Memorando__Group__6 ;
    public final void rule__Memorando__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:326:1: ( rule__Memorando__Group__5__Impl rule__Memorando__Group__6 )
            // InternalMemorando.g:327:2: rule__Memorando__Group__5__Impl rule__Memorando__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalMemorando.g:334:1: rule__Memorando__Group__5__Impl : ( ( ( rule__Memorando__SetorRemetenteAssignment_5 ) ) ( ( rule__Memorando__SetorRemetenteAssignment_5 )* ) ) ;
    public final void rule__Memorando__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:338:1: ( ( ( ( rule__Memorando__SetorRemetenteAssignment_5 ) ) ( ( rule__Memorando__SetorRemetenteAssignment_5 )* ) ) )
            // InternalMemorando.g:339:1: ( ( ( rule__Memorando__SetorRemetenteAssignment_5 ) ) ( ( rule__Memorando__SetorRemetenteAssignment_5 )* ) )
            {
            // InternalMemorando.g:339:1: ( ( ( rule__Memorando__SetorRemetenteAssignment_5 ) ) ( ( rule__Memorando__SetorRemetenteAssignment_5 )* ) )
            // InternalMemorando.g:340:2: ( ( rule__Memorando__SetorRemetenteAssignment_5 ) ) ( ( rule__Memorando__SetorRemetenteAssignment_5 )* )
            {
            // InternalMemorando.g:340:2: ( ( rule__Memorando__SetorRemetenteAssignment_5 ) )
            // InternalMemorando.g:341:3: ( rule__Memorando__SetorRemetenteAssignment_5 )
            {
             before(grammarAccess.getMemorandoAccess().getSetorRemetenteAssignment_5()); 
            // InternalMemorando.g:342:3: ( rule__Memorando__SetorRemetenteAssignment_5 )
            // InternalMemorando.g:342:4: rule__Memorando__SetorRemetenteAssignment_5
            {
            pushFollow(FOLLOW_10);
            rule__Memorando__SetorRemetenteAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getSetorRemetenteAssignment_5()); 

            }

            // InternalMemorando.g:345:2: ( ( rule__Memorando__SetorRemetenteAssignment_5 )* )
            // InternalMemorando.g:346:3: ( rule__Memorando__SetorRemetenteAssignment_5 )*
            {
             before(grammarAccess.getMemorandoAccess().getSetorRemetenteAssignment_5()); 
            // InternalMemorando.g:347:3: ( rule__Memorando__SetorRemetenteAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMemorando.g:347:4: rule__Memorando__SetorRemetenteAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Memorando__SetorRemetenteAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getSetorRemetenteAssignment_5()); 

            }


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
    // InternalMemorando.g:356:1: rule__Memorando__Group__6 : rule__Memorando__Group__6__Impl rule__Memorando__Group__7 ;
    public final void rule__Memorando__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:360:1: ( rule__Memorando__Group__6__Impl rule__Memorando__Group__7 )
            // InternalMemorando.g:361:2: rule__Memorando__Group__6__Impl rule__Memorando__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalMemorando.g:368:1: rule__Memorando__Group__6__Impl : ( ', Cidade: ' ) ;
    public final void rule__Memorando__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:372:1: ( ( ', Cidade: ' ) )
            // InternalMemorando.g:373:1: ( ', Cidade: ' )
            {
            // InternalMemorando.g:373:1: ( ', Cidade: ' )
            // InternalMemorando.g:374:2: ', Cidade: '
            {
             before(grammarAccess.getMemorandoAccess().getCidadeKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getCidadeKeyword_6()); 

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
    // InternalMemorando.g:383:1: rule__Memorando__Group__7 : rule__Memorando__Group__7__Impl rule__Memorando__Group__8 ;
    public final void rule__Memorando__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:387:1: ( rule__Memorando__Group__7__Impl rule__Memorando__Group__8 )
            // InternalMemorando.g:388:2: rule__Memorando__Group__7__Impl rule__Memorando__Group__8
            {
            pushFollow(FOLLOW_13);
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
    // InternalMemorando.g:395:1: rule__Memorando__Group__7__Impl : ( ( ( rule__Memorando__CidadeAssignment_7 ) ) ( ( rule__Memorando__CidadeAssignment_7 )* ) ) ;
    public final void rule__Memorando__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:399:1: ( ( ( ( rule__Memorando__CidadeAssignment_7 ) ) ( ( rule__Memorando__CidadeAssignment_7 )* ) ) )
            // InternalMemorando.g:400:1: ( ( ( rule__Memorando__CidadeAssignment_7 ) ) ( ( rule__Memorando__CidadeAssignment_7 )* ) )
            {
            // InternalMemorando.g:400:1: ( ( ( rule__Memorando__CidadeAssignment_7 ) ) ( ( rule__Memorando__CidadeAssignment_7 )* ) )
            // InternalMemorando.g:401:2: ( ( rule__Memorando__CidadeAssignment_7 ) ) ( ( rule__Memorando__CidadeAssignment_7 )* )
            {
            // InternalMemorando.g:401:2: ( ( rule__Memorando__CidadeAssignment_7 ) )
            // InternalMemorando.g:402:3: ( rule__Memorando__CidadeAssignment_7 )
            {
             before(grammarAccess.getMemorandoAccess().getCidadeAssignment_7()); 
            // InternalMemorando.g:403:3: ( rule__Memorando__CidadeAssignment_7 )
            // InternalMemorando.g:403:4: rule__Memorando__CidadeAssignment_7
            {
            pushFollow(FOLLOW_10);
            rule__Memorando__CidadeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getCidadeAssignment_7()); 

            }

            // InternalMemorando.g:406:2: ( ( rule__Memorando__CidadeAssignment_7 )* )
            // InternalMemorando.g:407:3: ( rule__Memorando__CidadeAssignment_7 )*
            {
             before(grammarAccess.getMemorandoAccess().getCidadeAssignment_7()); 
            // InternalMemorando.g:408:3: ( rule__Memorando__CidadeAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMemorando.g:408:4: rule__Memorando__CidadeAssignment_7
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Memorando__CidadeAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getCidadeAssignment_7()); 

            }


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
    // InternalMemorando.g:417:1: rule__Memorando__Group__8 : rule__Memorando__Group__8__Impl rule__Memorando__Group__9 ;
    public final void rule__Memorando__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:421:1: ( rule__Memorando__Group__8__Impl rule__Memorando__Group__9 )
            // InternalMemorando.g:422:2: rule__Memorando__Group__8__Impl rule__Memorando__Group__9
            {
            pushFollow(FOLLOW_7);
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
    // InternalMemorando.g:429:1: rule__Memorando__Group__8__Impl : ( ', Estado: ' ) ;
    public final void rule__Memorando__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:433:1: ( ( ', Estado: ' ) )
            // InternalMemorando.g:434:1: ( ', Estado: ' )
            {
            // InternalMemorando.g:434:1: ( ', Estado: ' )
            // InternalMemorando.g:435:2: ', Estado: '
            {
             before(grammarAccess.getMemorandoAccess().getEstadoKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getEstadoKeyword_8()); 

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
    // InternalMemorando.g:444:1: rule__Memorando__Group__9 : rule__Memorando__Group__9__Impl rule__Memorando__Group__10 ;
    public final void rule__Memorando__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:448:1: ( rule__Memorando__Group__9__Impl rule__Memorando__Group__10 )
            // InternalMemorando.g:449:2: rule__Memorando__Group__9__Impl rule__Memorando__Group__10
            {
            pushFollow(FOLLOW_14);
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
    // InternalMemorando.g:456:1: rule__Memorando__Group__9__Impl : ( ( ( rule__Memorando__EstadoAssignment_9 ) ) ( ( rule__Memorando__EstadoAssignment_9 )* ) ) ;
    public final void rule__Memorando__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:460:1: ( ( ( ( rule__Memorando__EstadoAssignment_9 ) ) ( ( rule__Memorando__EstadoAssignment_9 )* ) ) )
            // InternalMemorando.g:461:1: ( ( ( rule__Memorando__EstadoAssignment_9 ) ) ( ( rule__Memorando__EstadoAssignment_9 )* ) )
            {
            // InternalMemorando.g:461:1: ( ( ( rule__Memorando__EstadoAssignment_9 ) ) ( ( rule__Memorando__EstadoAssignment_9 )* ) )
            // InternalMemorando.g:462:2: ( ( rule__Memorando__EstadoAssignment_9 ) ) ( ( rule__Memorando__EstadoAssignment_9 )* )
            {
            // InternalMemorando.g:462:2: ( ( rule__Memorando__EstadoAssignment_9 ) )
            // InternalMemorando.g:463:3: ( rule__Memorando__EstadoAssignment_9 )
            {
             before(grammarAccess.getMemorandoAccess().getEstadoAssignment_9()); 
            // InternalMemorando.g:464:3: ( rule__Memorando__EstadoAssignment_9 )
            // InternalMemorando.g:464:4: rule__Memorando__EstadoAssignment_9
            {
            pushFollow(FOLLOW_10);
            rule__Memorando__EstadoAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getEstadoAssignment_9()); 

            }

            // InternalMemorando.g:467:2: ( ( rule__Memorando__EstadoAssignment_9 )* )
            // InternalMemorando.g:468:3: ( rule__Memorando__EstadoAssignment_9 )*
            {
             before(grammarAccess.getMemorandoAccess().getEstadoAssignment_9()); 
            // InternalMemorando.g:469:3: ( rule__Memorando__EstadoAssignment_9 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMemorando.g:469:4: rule__Memorando__EstadoAssignment_9
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Memorando__EstadoAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getEstadoAssignment_9()); 

            }


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
    // InternalMemorando.g:478:1: rule__Memorando__Group__10 : rule__Memorando__Group__10__Impl rule__Memorando__Group__11 ;
    public final void rule__Memorando__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:482:1: ( rule__Memorando__Group__10__Impl rule__Memorando__Group__11 )
            // InternalMemorando.g:483:2: rule__Memorando__Group__10__Impl rule__Memorando__Group__11
            {
            pushFollow(FOLLOW_4);
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
    // InternalMemorando.g:490:1: rule__Memorando__Group__10__Impl : ( ', Data: ' ) ;
    public final void rule__Memorando__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:494:1: ( ( ', Data: ' ) )
            // InternalMemorando.g:495:1: ( ', Data: ' )
            {
            // InternalMemorando.g:495:1: ( ', Data: ' )
            // InternalMemorando.g:496:2: ', Data: '
            {
             before(grammarAccess.getMemorandoAccess().getDataKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getDataKeyword_10()); 

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
    // InternalMemorando.g:505:1: rule__Memorando__Group__11 : rule__Memorando__Group__11__Impl rule__Memorando__Group__12 ;
    public final void rule__Memorando__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:509:1: ( rule__Memorando__Group__11__Impl rule__Memorando__Group__12 )
            // InternalMemorando.g:510:2: rule__Memorando__Group__11__Impl rule__Memorando__Group__12
            {
            pushFollow(FOLLOW_15);
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
    // InternalMemorando.g:517:1: rule__Memorando__Group__11__Impl : ( ( ( rule__Memorando__DiaAssignment_11 ) ) ( ( rule__Memorando__DiaAssignment_11 )* ) ) ;
    public final void rule__Memorando__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:521:1: ( ( ( ( rule__Memorando__DiaAssignment_11 ) ) ( ( rule__Memorando__DiaAssignment_11 )* ) ) )
            // InternalMemorando.g:522:1: ( ( ( rule__Memorando__DiaAssignment_11 ) ) ( ( rule__Memorando__DiaAssignment_11 )* ) )
            {
            // InternalMemorando.g:522:1: ( ( ( rule__Memorando__DiaAssignment_11 ) ) ( ( rule__Memorando__DiaAssignment_11 )* ) )
            // InternalMemorando.g:523:2: ( ( rule__Memorando__DiaAssignment_11 ) ) ( ( rule__Memorando__DiaAssignment_11 )* )
            {
            // InternalMemorando.g:523:2: ( ( rule__Memorando__DiaAssignment_11 ) )
            // InternalMemorando.g:524:3: ( rule__Memorando__DiaAssignment_11 )
            {
             before(grammarAccess.getMemorandoAccess().getDiaAssignment_11()); 
            // InternalMemorando.g:525:3: ( rule__Memorando__DiaAssignment_11 )
            // InternalMemorando.g:525:4: rule__Memorando__DiaAssignment_11
            {
            pushFollow(FOLLOW_6);
            rule__Memorando__DiaAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getDiaAssignment_11()); 

            }

            // InternalMemorando.g:528:2: ( ( rule__Memorando__DiaAssignment_11 )* )
            // InternalMemorando.g:529:3: ( rule__Memorando__DiaAssignment_11 )*
            {
             before(grammarAccess.getMemorandoAccess().getDiaAssignment_11()); 
            // InternalMemorando.g:530:3: ( rule__Memorando__DiaAssignment_11 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_INT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMemorando.g:530:4: rule__Memorando__DiaAssignment_11
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Memorando__DiaAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getDiaAssignment_11()); 

            }


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
    // InternalMemorando.g:539:1: rule__Memorando__Group__12 : rule__Memorando__Group__12__Impl rule__Memorando__Group__13 ;
    public final void rule__Memorando__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:543:1: ( rule__Memorando__Group__12__Impl rule__Memorando__Group__13 )
            // InternalMemorando.g:544:2: rule__Memorando__Group__12__Impl rule__Memorando__Group__13
            {
            pushFollow(FOLLOW_7);
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
    // InternalMemorando.g:551:1: rule__Memorando__Group__12__Impl : ( '/' ) ;
    public final void rule__Memorando__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:555:1: ( ( '/' ) )
            // InternalMemorando.g:556:1: ( '/' )
            {
            // InternalMemorando.g:556:1: ( '/' )
            // InternalMemorando.g:557:2: '/'
            {
             before(grammarAccess.getMemorandoAccess().getSolidusKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getSolidusKeyword_12()); 

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
    // InternalMemorando.g:566:1: rule__Memorando__Group__13 : rule__Memorando__Group__13__Impl rule__Memorando__Group__14 ;
    public final void rule__Memorando__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:570:1: ( rule__Memorando__Group__13__Impl rule__Memorando__Group__14 )
            // InternalMemorando.g:571:2: rule__Memorando__Group__13__Impl rule__Memorando__Group__14
            {
            pushFollow(FOLLOW_15);
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
    // InternalMemorando.g:578:1: rule__Memorando__Group__13__Impl : ( ( ( rule__Memorando__MesAssignment_13 ) ) ( ( rule__Memorando__MesAssignment_13 )* ) ) ;
    public final void rule__Memorando__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:582:1: ( ( ( ( rule__Memorando__MesAssignment_13 ) ) ( ( rule__Memorando__MesAssignment_13 )* ) ) )
            // InternalMemorando.g:583:1: ( ( ( rule__Memorando__MesAssignment_13 ) ) ( ( rule__Memorando__MesAssignment_13 )* ) )
            {
            // InternalMemorando.g:583:1: ( ( ( rule__Memorando__MesAssignment_13 ) ) ( ( rule__Memorando__MesAssignment_13 )* ) )
            // InternalMemorando.g:584:2: ( ( rule__Memorando__MesAssignment_13 ) ) ( ( rule__Memorando__MesAssignment_13 )* )
            {
            // InternalMemorando.g:584:2: ( ( rule__Memorando__MesAssignment_13 ) )
            // InternalMemorando.g:585:3: ( rule__Memorando__MesAssignment_13 )
            {
             before(grammarAccess.getMemorandoAccess().getMesAssignment_13()); 
            // InternalMemorando.g:586:3: ( rule__Memorando__MesAssignment_13 )
            // InternalMemorando.g:586:4: rule__Memorando__MesAssignment_13
            {
            pushFollow(FOLLOW_10);
            rule__Memorando__MesAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getMesAssignment_13()); 

            }

            // InternalMemorando.g:589:2: ( ( rule__Memorando__MesAssignment_13 )* )
            // InternalMemorando.g:590:3: ( rule__Memorando__MesAssignment_13 )*
            {
             before(grammarAccess.getMemorandoAccess().getMesAssignment_13()); 
            // InternalMemorando.g:591:3: ( rule__Memorando__MesAssignment_13 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMemorando.g:591:4: rule__Memorando__MesAssignment_13
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Memorando__MesAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getMesAssignment_13()); 

            }


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
    // InternalMemorando.g:600:1: rule__Memorando__Group__14 : rule__Memorando__Group__14__Impl rule__Memorando__Group__15 ;
    public final void rule__Memorando__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:604:1: ( rule__Memorando__Group__14__Impl rule__Memorando__Group__15 )
            // InternalMemorando.g:605:2: rule__Memorando__Group__14__Impl rule__Memorando__Group__15
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
    // InternalMemorando.g:612:1: rule__Memorando__Group__14__Impl : ( '/' ) ;
    public final void rule__Memorando__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:616:1: ( ( '/' ) )
            // InternalMemorando.g:617:1: ( '/' )
            {
            // InternalMemorando.g:617:1: ( '/' )
            // InternalMemorando.g:618:2: '/'
            {
             before(grammarAccess.getMemorandoAccess().getSolidusKeyword_14()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getSolidusKeyword_14()); 

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
    // InternalMemorando.g:627:1: rule__Memorando__Group__15 : rule__Memorando__Group__15__Impl rule__Memorando__Group__16 ;
    public final void rule__Memorando__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:631:1: ( rule__Memorando__Group__15__Impl rule__Memorando__Group__16 )
            // InternalMemorando.g:632:2: rule__Memorando__Group__15__Impl rule__Memorando__Group__16
            {
            pushFollow(FOLLOW_16);
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
    // InternalMemorando.g:639:1: rule__Memorando__Group__15__Impl : ( ( ( rule__Memorando__AnoAssignment_15 ) ) ( ( rule__Memorando__AnoAssignment_15 )* ) ) ;
    public final void rule__Memorando__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:643:1: ( ( ( ( rule__Memorando__AnoAssignment_15 ) ) ( ( rule__Memorando__AnoAssignment_15 )* ) ) )
            // InternalMemorando.g:644:1: ( ( ( rule__Memorando__AnoAssignment_15 ) ) ( ( rule__Memorando__AnoAssignment_15 )* ) )
            {
            // InternalMemorando.g:644:1: ( ( ( rule__Memorando__AnoAssignment_15 ) ) ( ( rule__Memorando__AnoAssignment_15 )* ) )
            // InternalMemorando.g:645:2: ( ( rule__Memorando__AnoAssignment_15 ) ) ( ( rule__Memorando__AnoAssignment_15 )* )
            {
            // InternalMemorando.g:645:2: ( ( rule__Memorando__AnoAssignment_15 ) )
            // InternalMemorando.g:646:3: ( rule__Memorando__AnoAssignment_15 )
            {
             before(grammarAccess.getMemorandoAccess().getAnoAssignment_15()); 
            // InternalMemorando.g:647:3: ( rule__Memorando__AnoAssignment_15 )
            // InternalMemorando.g:647:4: rule__Memorando__AnoAssignment_15
            {
            pushFollow(FOLLOW_6);
            rule__Memorando__AnoAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getAnoAssignment_15()); 

            }

            // InternalMemorando.g:650:2: ( ( rule__Memorando__AnoAssignment_15 )* )
            // InternalMemorando.g:651:3: ( rule__Memorando__AnoAssignment_15 )*
            {
             before(grammarAccess.getMemorandoAccess().getAnoAssignment_15()); 
            // InternalMemorando.g:652:3: ( rule__Memorando__AnoAssignment_15 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_INT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMemorando.g:652:4: rule__Memorando__AnoAssignment_15
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Memorando__AnoAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getAnoAssignment_15()); 

            }


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
    // InternalMemorando.g:661:1: rule__Memorando__Group__16 : rule__Memorando__Group__16__Impl rule__Memorando__Group__17 ;
    public final void rule__Memorando__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:665:1: ( rule__Memorando__Group__16__Impl rule__Memorando__Group__17 )
            // InternalMemorando.g:666:2: rule__Memorando__Group__16__Impl rule__Memorando__Group__17
            {
            pushFollow(FOLLOW_17);
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
    // InternalMemorando.g:673:1: rule__Memorando__Group__16__Impl : ( ', Cargo Destinatario: ' ) ;
    public final void rule__Memorando__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:677:1: ( ( ', Cargo Destinatario: ' ) )
            // InternalMemorando.g:678:1: ( ', Cargo Destinatario: ' )
            {
            // InternalMemorando.g:678:1: ( ', Cargo Destinatario: ' )
            // InternalMemorando.g:679:2: ', Cargo Destinatario: '
            {
             before(grammarAccess.getMemorandoAccess().getCargoDestinatarioKeyword_16()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getCargoDestinatarioKeyword_16()); 

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
    // InternalMemorando.g:688:1: rule__Memorando__Group__17 : rule__Memorando__Group__17__Impl rule__Memorando__Group__18 ;
    public final void rule__Memorando__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:692:1: ( rule__Memorando__Group__17__Impl rule__Memorando__Group__18 )
            // InternalMemorando.g:693:2: rule__Memorando__Group__17__Impl rule__Memorando__Group__18
            {
            pushFollow(FOLLOW_18);
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
    // InternalMemorando.g:700:1: rule__Memorando__Group__17__Impl : ( ( ( rule__Memorando__CargoDestinatarioAssignment_17 ) ) ( ( rule__Memorando__CargoDestinatarioAssignment_17 )* ) ) ;
    public final void rule__Memorando__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:704:1: ( ( ( ( rule__Memorando__CargoDestinatarioAssignment_17 ) ) ( ( rule__Memorando__CargoDestinatarioAssignment_17 )* ) ) )
            // InternalMemorando.g:705:1: ( ( ( rule__Memorando__CargoDestinatarioAssignment_17 ) ) ( ( rule__Memorando__CargoDestinatarioAssignment_17 )* ) )
            {
            // InternalMemorando.g:705:1: ( ( ( rule__Memorando__CargoDestinatarioAssignment_17 ) ) ( ( rule__Memorando__CargoDestinatarioAssignment_17 )* ) )
            // InternalMemorando.g:706:2: ( ( rule__Memorando__CargoDestinatarioAssignment_17 ) ) ( ( rule__Memorando__CargoDestinatarioAssignment_17 )* )
            {
            // InternalMemorando.g:706:2: ( ( rule__Memorando__CargoDestinatarioAssignment_17 ) )
            // InternalMemorando.g:707:3: ( rule__Memorando__CargoDestinatarioAssignment_17 )
            {
             before(grammarAccess.getMemorandoAccess().getCargoDestinatarioAssignment_17()); 
            // InternalMemorando.g:708:3: ( rule__Memorando__CargoDestinatarioAssignment_17 )
            // InternalMemorando.g:708:4: rule__Memorando__CargoDestinatarioAssignment_17
            {
            pushFollow(FOLLOW_19);
            rule__Memorando__CargoDestinatarioAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getCargoDestinatarioAssignment_17()); 

            }

            // InternalMemorando.g:711:2: ( ( rule__Memorando__CargoDestinatarioAssignment_17 )* )
            // InternalMemorando.g:712:3: ( rule__Memorando__CargoDestinatarioAssignment_17 )*
            {
             before(grammarAccess.getMemorandoAccess().getCargoDestinatarioAssignment_17()); 
            // InternalMemorando.g:713:3: ( rule__Memorando__CargoDestinatarioAssignment_17 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMemorando.g:713:4: rule__Memorando__CargoDestinatarioAssignment_17
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Memorando__CargoDestinatarioAssignment_17();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getCargoDestinatarioAssignment_17()); 

            }


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
    // InternalMemorando.g:722:1: rule__Memorando__Group__18 : rule__Memorando__Group__18__Impl rule__Memorando__Group__19 ;
    public final void rule__Memorando__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:726:1: ( rule__Memorando__Group__18__Impl rule__Memorando__Group__19 )
            // InternalMemorando.g:727:2: rule__Memorando__Group__18__Impl rule__Memorando__Group__19
            {
            pushFollow(FOLLOW_17);
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
    // InternalMemorando.g:734:1: rule__Memorando__Group__18__Impl : ( ( ( ', Assunto: ' ) ) ( ( ', Assunto: ' )* ) ) ;
    public final void rule__Memorando__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:738:1: ( ( ( ( ', Assunto: ' ) ) ( ( ', Assunto: ' )* ) ) )
            // InternalMemorando.g:739:1: ( ( ( ', Assunto: ' ) ) ( ( ', Assunto: ' )* ) )
            {
            // InternalMemorando.g:739:1: ( ( ( ', Assunto: ' ) ) ( ( ', Assunto: ' )* ) )
            // InternalMemorando.g:740:2: ( ( ', Assunto: ' ) ) ( ( ', Assunto: ' )* )
            {
            // InternalMemorando.g:740:2: ( ( ', Assunto: ' ) )
            // InternalMemorando.g:741:3: ( ', Assunto: ' )
            {
             before(grammarAccess.getMemorandoAccess().getAssuntoKeyword_18()); 
            // InternalMemorando.g:742:3: ( ', Assunto: ' )
            // InternalMemorando.g:742:4: ', Assunto: '
            {
            match(input,19,FOLLOW_20); 

            }

             after(grammarAccess.getMemorandoAccess().getAssuntoKeyword_18()); 

            }

            // InternalMemorando.g:745:2: ( ( ', Assunto: ' )* )
            // InternalMemorando.g:746:3: ( ', Assunto: ' )*
            {
             before(grammarAccess.getMemorandoAccess().getAssuntoKeyword_18()); 
            // InternalMemorando.g:747:3: ( ', Assunto: ' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMemorando.g:747:4: ', Assunto: '
            	    {
            	    match(input,19,FOLLOW_20); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getAssuntoKeyword_18()); 

            }


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
    // InternalMemorando.g:756:1: rule__Memorando__Group__19 : rule__Memorando__Group__19__Impl rule__Memorando__Group__20 ;
    public final void rule__Memorando__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:760:1: ( rule__Memorando__Group__19__Impl rule__Memorando__Group__20 )
            // InternalMemorando.g:761:2: rule__Memorando__Group__19__Impl rule__Memorando__Group__20
            {
            pushFollow(FOLLOW_21);
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
    // InternalMemorando.g:768:1: rule__Memorando__Group__19__Impl : ( ( ( rule__Memorando__AssuntoAssignment_19 ) ) ( ( rule__Memorando__AssuntoAssignment_19 )* ) ) ;
    public final void rule__Memorando__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:772:1: ( ( ( ( rule__Memorando__AssuntoAssignment_19 ) ) ( ( rule__Memorando__AssuntoAssignment_19 )* ) ) )
            // InternalMemorando.g:773:1: ( ( ( rule__Memorando__AssuntoAssignment_19 ) ) ( ( rule__Memorando__AssuntoAssignment_19 )* ) )
            {
            // InternalMemorando.g:773:1: ( ( ( rule__Memorando__AssuntoAssignment_19 ) ) ( ( rule__Memorando__AssuntoAssignment_19 )* ) )
            // InternalMemorando.g:774:2: ( ( rule__Memorando__AssuntoAssignment_19 ) ) ( ( rule__Memorando__AssuntoAssignment_19 )* )
            {
            // InternalMemorando.g:774:2: ( ( rule__Memorando__AssuntoAssignment_19 ) )
            // InternalMemorando.g:775:3: ( rule__Memorando__AssuntoAssignment_19 )
            {
             before(grammarAccess.getMemorandoAccess().getAssuntoAssignment_19()); 
            // InternalMemorando.g:776:3: ( rule__Memorando__AssuntoAssignment_19 )
            // InternalMemorando.g:776:4: rule__Memorando__AssuntoAssignment_19
            {
            pushFollow(FOLLOW_19);
            rule__Memorando__AssuntoAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getAssuntoAssignment_19()); 

            }

            // InternalMemorando.g:779:2: ( ( rule__Memorando__AssuntoAssignment_19 )* )
            // InternalMemorando.g:780:3: ( rule__Memorando__AssuntoAssignment_19 )*
            {
             before(grammarAccess.getMemorandoAccess().getAssuntoAssignment_19()); 
            // InternalMemorando.g:781:3: ( rule__Memorando__AssuntoAssignment_19 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STRING) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMemorando.g:781:4: rule__Memorando__AssuntoAssignment_19
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Memorando__AssuntoAssignment_19();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getAssuntoAssignment_19()); 

            }


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
    // InternalMemorando.g:790:1: rule__Memorando__Group__20 : rule__Memorando__Group__20__Impl rule__Memorando__Group__21 ;
    public final void rule__Memorando__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:794:1: ( rule__Memorando__Group__20__Impl rule__Memorando__Group__21 )
            // InternalMemorando.g:795:2: rule__Memorando__Group__20__Impl rule__Memorando__Group__21
            {
            pushFollow(FOLLOW_22);
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
    // InternalMemorando.g:802:1: rule__Memorando__Group__20__Impl : ( ( ( ', Destinos: ' ) ) ( ( ', Destinos: ' )* ) ) ;
    public final void rule__Memorando__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:806:1: ( ( ( ( ', Destinos: ' ) ) ( ( ', Destinos: ' )* ) ) )
            // InternalMemorando.g:807:1: ( ( ( ', Destinos: ' ) ) ( ( ', Destinos: ' )* ) )
            {
            // InternalMemorando.g:807:1: ( ( ( ', Destinos: ' ) ) ( ( ', Destinos: ' )* ) )
            // InternalMemorando.g:808:2: ( ( ', Destinos: ' ) ) ( ( ', Destinos: ' )* )
            {
            // InternalMemorando.g:808:2: ( ( ', Destinos: ' ) )
            // InternalMemorando.g:809:3: ( ', Destinos: ' )
            {
             before(grammarAccess.getMemorandoAccess().getDestinosKeyword_20()); 
            // InternalMemorando.g:810:3: ( ', Destinos: ' )
            // InternalMemorando.g:810:4: ', Destinos: '
            {
            match(input,20,FOLLOW_23); 

            }

             after(grammarAccess.getMemorandoAccess().getDestinosKeyword_20()); 

            }

            // InternalMemorando.g:813:2: ( ( ', Destinos: ' )* )
            // InternalMemorando.g:814:3: ( ', Destinos: ' )*
            {
             before(grammarAccess.getMemorandoAccess().getDestinosKeyword_20()); 
            // InternalMemorando.g:815:3: ( ', Destinos: ' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMemorando.g:815:4: ', Destinos: '
            	    {
            	    match(input,20,FOLLOW_23); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getDestinosKeyword_20()); 

            }


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
    // InternalMemorando.g:824:1: rule__Memorando__Group__21 : rule__Memorando__Group__21__Impl rule__Memorando__Group__22 ;
    public final void rule__Memorando__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:828:1: ( rule__Memorando__Group__21__Impl rule__Memorando__Group__22 )
            // InternalMemorando.g:829:2: rule__Memorando__Group__21__Impl rule__Memorando__Group__22
            {
            pushFollow(FOLLOW_22);
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
    // InternalMemorando.g:836:1: rule__Memorando__Group__21__Impl : ( ( rule__Memorando__DestinosAssignment_21 )* ) ;
    public final void rule__Memorando__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:840:1: ( ( ( rule__Memorando__DestinosAssignment_21 )* ) )
            // InternalMemorando.g:841:1: ( ( rule__Memorando__DestinosAssignment_21 )* )
            {
            // InternalMemorando.g:841:1: ( ( rule__Memorando__DestinosAssignment_21 )* )
            // InternalMemorando.g:842:2: ( rule__Memorando__DestinosAssignment_21 )*
            {
             before(grammarAccess.getMemorandoAccess().getDestinosAssignment_21()); 
            // InternalMemorando.g:843:2: ( rule__Memorando__DestinosAssignment_21 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMemorando.g:843:3: rule__Memorando__DestinosAssignment_21
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Memorando__DestinosAssignment_21();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getDestinosAssignment_21()); 

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
    // InternalMemorando.g:851:1: rule__Memorando__Group__22 : rule__Memorando__Group__22__Impl rule__Memorando__Group__23 ;
    public final void rule__Memorando__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:855:1: ( rule__Memorando__Group__22__Impl rule__Memorando__Group__23 )
            // InternalMemorando.g:856:2: rule__Memorando__Group__22__Impl rule__Memorando__Group__23
            {
            pushFollow(FOLLOW_24);
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
    // InternalMemorando.g:863:1: rule__Memorando__Group__22__Impl : ( ( ( ', Mensagem: ' ) ) ( ( ', Mensagem: ' )* ) ) ;
    public final void rule__Memorando__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:867:1: ( ( ( ( ', Mensagem: ' ) ) ( ( ', Mensagem: ' )* ) ) )
            // InternalMemorando.g:868:1: ( ( ( ', Mensagem: ' ) ) ( ( ', Mensagem: ' )* ) )
            {
            // InternalMemorando.g:868:1: ( ( ( ', Mensagem: ' ) ) ( ( ', Mensagem: ' )* ) )
            // InternalMemorando.g:869:2: ( ( ', Mensagem: ' ) ) ( ( ', Mensagem: ' )* )
            {
            // InternalMemorando.g:869:2: ( ( ', Mensagem: ' ) )
            // InternalMemorando.g:870:3: ( ', Mensagem: ' )
            {
             before(grammarAccess.getMemorandoAccess().getMensagemKeyword_22()); 
            // InternalMemorando.g:871:3: ( ', Mensagem: ' )
            // InternalMemorando.g:871:4: ', Mensagem: '
            {
            match(input,21,FOLLOW_25); 

            }

             after(grammarAccess.getMemorandoAccess().getMensagemKeyword_22()); 

            }

            // InternalMemorando.g:874:2: ( ( ', Mensagem: ' )* )
            // InternalMemorando.g:875:3: ( ', Mensagem: ' )*
            {
             before(grammarAccess.getMemorandoAccess().getMensagemKeyword_22()); 
            // InternalMemorando.g:876:3: ( ', Mensagem: ' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMemorando.g:876:4: ', Mensagem: '
            	    {
            	    match(input,21,FOLLOW_25); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getMensagemKeyword_22()); 

            }


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
    // InternalMemorando.g:885:1: rule__Memorando__Group__23 : rule__Memorando__Group__23__Impl rule__Memorando__Group__24 ;
    public final void rule__Memorando__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:889:1: ( rule__Memorando__Group__23__Impl rule__Memorando__Group__24 )
            // InternalMemorando.g:890:2: rule__Memorando__Group__23__Impl rule__Memorando__Group__24
            {
            pushFollow(FOLLOW_24);
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
    // InternalMemorando.g:897:1: rule__Memorando__Group__23__Impl : ( ( rule__Memorando__ParagrafosAssignment_23 )* ) ;
    public final void rule__Memorando__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:901:1: ( ( ( rule__Memorando__ParagrafosAssignment_23 )* ) )
            // InternalMemorando.g:902:1: ( ( rule__Memorando__ParagrafosAssignment_23 )* )
            {
            // InternalMemorando.g:902:1: ( ( rule__Memorando__ParagrafosAssignment_23 )* )
            // InternalMemorando.g:903:2: ( rule__Memorando__ParagrafosAssignment_23 )*
            {
             before(grammarAccess.getMemorandoAccess().getParagrafosAssignment_23()); 
            // InternalMemorando.g:904:2: ( rule__Memorando__ParagrafosAssignment_23 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_STRING) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMemorando.g:904:3: rule__Memorando__ParagrafosAssignment_23
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Memorando__ParagrafosAssignment_23();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getParagrafosAssignment_23()); 

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
    // InternalMemorando.g:912:1: rule__Memorando__Group__24 : rule__Memorando__Group__24__Impl rule__Memorando__Group__25 ;
    public final void rule__Memorando__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:916:1: ( rule__Memorando__Group__24__Impl rule__Memorando__Group__25 )
            // InternalMemorando.g:917:2: rule__Memorando__Group__24__Impl rule__Memorando__Group__25
            {
            pushFollow(FOLLOW_17);
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
    // InternalMemorando.g:924:1: rule__Memorando__Group__24__Impl : ( ( ( ', Remetente: ' ) ) ( ( ', Remetente: ' )* ) ) ;
    public final void rule__Memorando__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:928:1: ( ( ( ( ', Remetente: ' ) ) ( ( ', Remetente: ' )* ) ) )
            // InternalMemorando.g:929:1: ( ( ( ', Remetente: ' ) ) ( ( ', Remetente: ' )* ) )
            {
            // InternalMemorando.g:929:1: ( ( ( ', Remetente: ' ) ) ( ( ', Remetente: ' )* ) )
            // InternalMemorando.g:930:2: ( ( ', Remetente: ' ) ) ( ( ', Remetente: ' )* )
            {
            // InternalMemorando.g:930:2: ( ( ', Remetente: ' ) )
            // InternalMemorando.g:931:3: ( ', Remetente: ' )
            {
             before(grammarAccess.getMemorandoAccess().getRemetenteKeyword_24()); 
            // InternalMemorando.g:932:3: ( ', Remetente: ' )
            // InternalMemorando.g:932:4: ', Remetente: '
            {
            match(input,22,FOLLOW_26); 

            }

             after(grammarAccess.getMemorandoAccess().getRemetenteKeyword_24()); 

            }

            // InternalMemorando.g:935:2: ( ( ', Remetente: ' )* )
            // InternalMemorando.g:936:3: ( ', Remetente: ' )*
            {
             before(grammarAccess.getMemorandoAccess().getRemetenteKeyword_24()); 
            // InternalMemorando.g:937:3: ( ', Remetente: ' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMemorando.g:937:4: ', Remetente: '
            	    {
            	    match(input,22,FOLLOW_26); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getRemetenteKeyword_24()); 

            }


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
    // InternalMemorando.g:946:1: rule__Memorando__Group__25 : rule__Memorando__Group__25__Impl rule__Memorando__Group__26 ;
    public final void rule__Memorando__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:950:1: ( rule__Memorando__Group__25__Impl rule__Memorando__Group__26 )
            // InternalMemorando.g:951:2: rule__Memorando__Group__25__Impl rule__Memorando__Group__26
            {
            pushFollow(FOLLOW_27);
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
    // InternalMemorando.g:958:1: rule__Memorando__Group__25__Impl : ( ( ( rule__Memorando__RemetenteAssignment_25 ) ) ( ( rule__Memorando__RemetenteAssignment_25 )* ) ) ;
    public final void rule__Memorando__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:962:1: ( ( ( ( rule__Memorando__RemetenteAssignment_25 ) ) ( ( rule__Memorando__RemetenteAssignment_25 )* ) ) )
            // InternalMemorando.g:963:1: ( ( ( rule__Memorando__RemetenteAssignment_25 ) ) ( ( rule__Memorando__RemetenteAssignment_25 )* ) )
            {
            // InternalMemorando.g:963:1: ( ( ( rule__Memorando__RemetenteAssignment_25 ) ) ( ( rule__Memorando__RemetenteAssignment_25 )* ) )
            // InternalMemorando.g:964:2: ( ( rule__Memorando__RemetenteAssignment_25 ) ) ( ( rule__Memorando__RemetenteAssignment_25 )* )
            {
            // InternalMemorando.g:964:2: ( ( rule__Memorando__RemetenteAssignment_25 ) )
            // InternalMemorando.g:965:3: ( rule__Memorando__RemetenteAssignment_25 )
            {
             before(grammarAccess.getMemorandoAccess().getRemetenteAssignment_25()); 
            // InternalMemorando.g:966:3: ( rule__Memorando__RemetenteAssignment_25 )
            // InternalMemorando.g:966:4: rule__Memorando__RemetenteAssignment_25
            {
            pushFollow(FOLLOW_19);
            rule__Memorando__RemetenteAssignment_25();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getRemetenteAssignment_25()); 

            }

            // InternalMemorando.g:969:2: ( ( rule__Memorando__RemetenteAssignment_25 )* )
            // InternalMemorando.g:970:3: ( rule__Memorando__RemetenteAssignment_25 )*
            {
             before(grammarAccess.getMemorandoAccess().getRemetenteAssignment_25()); 
            // InternalMemorando.g:971:3: ( rule__Memorando__RemetenteAssignment_25 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMemorando.g:971:4: rule__Memorando__RemetenteAssignment_25
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Memorando__RemetenteAssignment_25();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getRemetenteAssignment_25()); 

            }


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
    // InternalMemorando.g:980:1: rule__Memorando__Group__26 : rule__Memorando__Group__26__Impl rule__Memorando__Group__27 ;
    public final void rule__Memorando__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:984:1: ( rule__Memorando__Group__26__Impl rule__Memorando__Group__27 )
            // InternalMemorando.g:985:2: rule__Memorando__Group__26__Impl rule__Memorando__Group__27
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
    // InternalMemorando.g:992:1: rule__Memorando__Group__26__Impl : ( ( ( ', Cargo Remetente: ' ) ) ( ( ', Cargo Remetente: ' )* ) ) ;
    public final void rule__Memorando__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:996:1: ( ( ( ( ', Cargo Remetente: ' ) ) ( ( ', Cargo Remetente: ' )* ) ) )
            // InternalMemorando.g:997:1: ( ( ( ', Cargo Remetente: ' ) ) ( ( ', Cargo Remetente: ' )* ) )
            {
            // InternalMemorando.g:997:1: ( ( ( ', Cargo Remetente: ' ) ) ( ( ', Cargo Remetente: ' )* ) )
            // InternalMemorando.g:998:2: ( ( ', Cargo Remetente: ' ) ) ( ( ', Cargo Remetente: ' )* )
            {
            // InternalMemorando.g:998:2: ( ( ', Cargo Remetente: ' ) )
            // InternalMemorando.g:999:3: ( ', Cargo Remetente: ' )
            {
             before(grammarAccess.getMemorandoAccess().getCargoRemetenteKeyword_26()); 
            // InternalMemorando.g:1000:3: ( ', Cargo Remetente: ' )
            // InternalMemorando.g:1000:4: ', Cargo Remetente: '
            {
            match(input,23,FOLLOW_28); 

            }

             after(grammarAccess.getMemorandoAccess().getCargoRemetenteKeyword_26()); 

            }

            // InternalMemorando.g:1003:2: ( ( ', Cargo Remetente: ' )* )
            // InternalMemorando.g:1004:3: ( ', Cargo Remetente: ' )*
            {
             before(grammarAccess.getMemorandoAccess().getCargoRemetenteKeyword_26()); 
            // InternalMemorando.g:1005:3: ( ', Cargo Remetente: ' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==23) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMemorando.g:1005:4: ', Cargo Remetente: '
            	    {
            	    match(input,23,FOLLOW_28); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getMemorandoAccess().getCargoRemetenteKeyword_26()); 

            }


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
    // InternalMemorando.g:1014:1: rule__Memorando__Group__27 : rule__Memorando__Group__27__Impl ;
    public final void rule__Memorando__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1018:1: ( rule__Memorando__Group__27__Impl )
            // InternalMemorando.g:1019:2: rule__Memorando__Group__27__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__Group__27__Impl();

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
    // InternalMemorando.g:1025:1: rule__Memorando__Group__27__Impl : ( ( rule__Memorando__CargoRemetenteAssignment_27 ) ) ;
    public final void rule__Memorando__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1029:1: ( ( ( rule__Memorando__CargoRemetenteAssignment_27 ) ) )
            // InternalMemorando.g:1030:1: ( ( rule__Memorando__CargoRemetenteAssignment_27 ) )
            {
            // InternalMemorando.g:1030:1: ( ( rule__Memorando__CargoRemetenteAssignment_27 ) )
            // InternalMemorando.g:1031:2: ( rule__Memorando__CargoRemetenteAssignment_27 )
            {
             before(grammarAccess.getMemorandoAccess().getCargoRemetenteAssignment_27()); 
            // InternalMemorando.g:1032:2: ( rule__Memorando__CargoRemetenteAssignment_27 )
            // InternalMemorando.g:1032:3: rule__Memorando__CargoRemetenteAssignment_27
            {
            pushFollow(FOLLOW_2);
            rule__Memorando__CargoRemetenteAssignment_27();

            state._fsp--;


            }

             after(grammarAccess.getMemorandoAccess().getCargoRemetenteAssignment_27()); 

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


    // $ANTLR start "rule__Model__MemorandosAssignment"
    // InternalMemorando.g:1041:1: rule__Model__MemorandosAssignment : ( ruleMemorando ) ;
    public final void rule__Model__MemorandosAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1045:1: ( ( ruleMemorando ) )
            // InternalMemorando.g:1046:2: ( ruleMemorando )
            {
            // InternalMemorando.g:1046:2: ( ruleMemorando )
            // InternalMemorando.g:1047:3: ruleMemorando
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


    // $ANTLR start "rule__Memorando__NumeroAssignment_1"
    // InternalMemorando.g:1056:1: rule__Memorando__NumeroAssignment_1 : ( RULE_INT ) ;
    public final void rule__Memorando__NumeroAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1060:1: ( ( RULE_INT ) )
            // InternalMemorando.g:1061:2: ( RULE_INT )
            {
            // InternalMemorando.g:1061:2: ( RULE_INT )
            // InternalMemorando.g:1062:3: RULE_INT
            {
             before(grammarAccess.getMemorandoAccess().getNumeroINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getNumeroINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Memorando__NumeroAssignment_1"


    // $ANTLR start "rule__Memorando__SetorDestinatarioAssignment_3"
    // InternalMemorando.g:1071:1: rule__Memorando__SetorDestinatarioAssignment_3 : ( RULE_ID ) ;
    public final void rule__Memorando__SetorDestinatarioAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1075:1: ( ( RULE_ID ) )
            // InternalMemorando.g:1076:2: ( RULE_ID )
            {
            // InternalMemorando.g:1076:2: ( RULE_ID )
            // InternalMemorando.g:1077:3: RULE_ID
            {
             before(grammarAccess.getMemorandoAccess().getSetorDestinatarioIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getSetorDestinatarioIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Memorando__SetorDestinatarioAssignment_3"


    // $ANTLR start "rule__Memorando__SetorRemetenteAssignment_5"
    // InternalMemorando.g:1086:1: rule__Memorando__SetorRemetenteAssignment_5 : ( RULE_ID ) ;
    public final void rule__Memorando__SetorRemetenteAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1090:1: ( ( RULE_ID ) )
            // InternalMemorando.g:1091:2: ( RULE_ID )
            {
            // InternalMemorando.g:1091:2: ( RULE_ID )
            // InternalMemorando.g:1092:3: RULE_ID
            {
             before(grammarAccess.getMemorandoAccess().getSetorRemetenteIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getSetorRemetenteIDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Memorando__SetorRemetenteAssignment_5"


    // $ANTLR start "rule__Memorando__CidadeAssignment_7"
    // InternalMemorando.g:1101:1: rule__Memorando__CidadeAssignment_7 : ( RULE_ID ) ;
    public final void rule__Memorando__CidadeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1105:1: ( ( RULE_ID ) )
            // InternalMemorando.g:1106:2: ( RULE_ID )
            {
            // InternalMemorando.g:1106:2: ( RULE_ID )
            // InternalMemorando.g:1107:3: RULE_ID
            {
             before(grammarAccess.getMemorandoAccess().getCidadeIDTerminalRuleCall_7_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getCidadeIDTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Memorando__CidadeAssignment_7"


    // $ANTLR start "rule__Memorando__EstadoAssignment_9"
    // InternalMemorando.g:1116:1: rule__Memorando__EstadoAssignment_9 : ( RULE_ID ) ;
    public final void rule__Memorando__EstadoAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1120:1: ( ( RULE_ID ) )
            // InternalMemorando.g:1121:2: ( RULE_ID )
            {
            // InternalMemorando.g:1121:2: ( RULE_ID )
            // InternalMemorando.g:1122:3: RULE_ID
            {
             before(grammarAccess.getMemorandoAccess().getEstadoIDTerminalRuleCall_9_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getEstadoIDTerminalRuleCall_9_0()); 

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
    // $ANTLR end "rule__Memorando__EstadoAssignment_9"


    // $ANTLR start "rule__Memorando__DiaAssignment_11"
    // InternalMemorando.g:1131:1: rule__Memorando__DiaAssignment_11 : ( RULE_INT ) ;
    public final void rule__Memorando__DiaAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1135:1: ( ( RULE_INT ) )
            // InternalMemorando.g:1136:2: ( RULE_INT )
            {
            // InternalMemorando.g:1136:2: ( RULE_INT )
            // InternalMemorando.g:1137:3: RULE_INT
            {
             before(grammarAccess.getMemorandoAccess().getDiaINTTerminalRuleCall_11_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getDiaINTTerminalRuleCall_11_0()); 

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
    // $ANTLR end "rule__Memorando__DiaAssignment_11"


    // $ANTLR start "rule__Memorando__MesAssignment_13"
    // InternalMemorando.g:1146:1: rule__Memorando__MesAssignment_13 : ( RULE_ID ) ;
    public final void rule__Memorando__MesAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1150:1: ( ( RULE_ID ) )
            // InternalMemorando.g:1151:2: ( RULE_ID )
            {
            // InternalMemorando.g:1151:2: ( RULE_ID )
            // InternalMemorando.g:1152:3: RULE_ID
            {
             before(grammarAccess.getMemorandoAccess().getMesIDTerminalRuleCall_13_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getMesIDTerminalRuleCall_13_0()); 

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
    // $ANTLR end "rule__Memorando__MesAssignment_13"


    // $ANTLR start "rule__Memorando__AnoAssignment_15"
    // InternalMemorando.g:1161:1: rule__Memorando__AnoAssignment_15 : ( RULE_INT ) ;
    public final void rule__Memorando__AnoAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1165:1: ( ( RULE_INT ) )
            // InternalMemorando.g:1166:2: ( RULE_INT )
            {
            // InternalMemorando.g:1166:2: ( RULE_INT )
            // InternalMemorando.g:1167:3: RULE_INT
            {
             before(grammarAccess.getMemorandoAccess().getAnoINTTerminalRuleCall_15_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getAnoINTTerminalRuleCall_15_0()); 

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
    // $ANTLR end "rule__Memorando__AnoAssignment_15"


    // $ANTLR start "rule__Memorando__CargoDestinatarioAssignment_17"
    // InternalMemorando.g:1176:1: rule__Memorando__CargoDestinatarioAssignment_17 : ( RULE_STRING ) ;
    public final void rule__Memorando__CargoDestinatarioAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1180:1: ( ( RULE_STRING ) )
            // InternalMemorando.g:1181:2: ( RULE_STRING )
            {
            // InternalMemorando.g:1181:2: ( RULE_STRING )
            // InternalMemorando.g:1182:3: RULE_STRING
            {
             before(grammarAccess.getMemorandoAccess().getCargoDestinatarioSTRINGTerminalRuleCall_17_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getCargoDestinatarioSTRINGTerminalRuleCall_17_0()); 

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
    // $ANTLR end "rule__Memorando__CargoDestinatarioAssignment_17"


    // $ANTLR start "rule__Memorando__AssuntoAssignment_19"
    // InternalMemorando.g:1191:1: rule__Memorando__AssuntoAssignment_19 : ( RULE_STRING ) ;
    public final void rule__Memorando__AssuntoAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1195:1: ( ( RULE_STRING ) )
            // InternalMemorando.g:1196:2: ( RULE_STRING )
            {
            // InternalMemorando.g:1196:2: ( RULE_STRING )
            // InternalMemorando.g:1197:3: RULE_STRING
            {
             before(grammarAccess.getMemorandoAccess().getAssuntoSTRINGTerminalRuleCall_19_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getAssuntoSTRINGTerminalRuleCall_19_0()); 

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
    // $ANTLR end "rule__Memorando__AssuntoAssignment_19"


    // $ANTLR start "rule__Memorando__DestinosAssignment_21"
    // InternalMemorando.g:1206:1: rule__Memorando__DestinosAssignment_21 : ( ruleDestino ) ;
    public final void rule__Memorando__DestinosAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1210:1: ( ( ruleDestino ) )
            // InternalMemorando.g:1211:2: ( ruleDestino )
            {
            // InternalMemorando.g:1211:2: ( ruleDestino )
            // InternalMemorando.g:1212:3: ruleDestino
            {
             before(grammarAccess.getMemorandoAccess().getDestinosDestinoParserRuleCall_21_0()); 
            pushFollow(FOLLOW_2);
            ruleDestino();

            state._fsp--;

             after(grammarAccess.getMemorandoAccess().getDestinosDestinoParserRuleCall_21_0()); 

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
    // $ANTLR end "rule__Memorando__DestinosAssignment_21"


    // $ANTLR start "rule__Memorando__ParagrafosAssignment_23"
    // InternalMemorando.g:1221:1: rule__Memorando__ParagrafosAssignment_23 : ( ruleParagrafo ) ;
    public final void rule__Memorando__ParagrafosAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1225:1: ( ( ruleParagrafo ) )
            // InternalMemorando.g:1226:2: ( ruleParagrafo )
            {
            // InternalMemorando.g:1226:2: ( ruleParagrafo )
            // InternalMemorando.g:1227:3: ruleParagrafo
            {
             before(grammarAccess.getMemorandoAccess().getParagrafosParagrafoParserRuleCall_23_0()); 
            pushFollow(FOLLOW_2);
            ruleParagrafo();

            state._fsp--;

             after(grammarAccess.getMemorandoAccess().getParagrafosParagrafoParserRuleCall_23_0()); 

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
    // $ANTLR end "rule__Memorando__ParagrafosAssignment_23"


    // $ANTLR start "rule__Memorando__RemetenteAssignment_25"
    // InternalMemorando.g:1236:1: rule__Memorando__RemetenteAssignment_25 : ( RULE_STRING ) ;
    public final void rule__Memorando__RemetenteAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1240:1: ( ( RULE_STRING ) )
            // InternalMemorando.g:1241:2: ( RULE_STRING )
            {
            // InternalMemorando.g:1241:2: ( RULE_STRING )
            // InternalMemorando.g:1242:3: RULE_STRING
            {
             before(grammarAccess.getMemorandoAccess().getRemetenteSTRINGTerminalRuleCall_25_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getRemetenteSTRINGTerminalRuleCall_25_0()); 

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
    // $ANTLR end "rule__Memorando__RemetenteAssignment_25"


    // $ANTLR start "rule__Memorando__CargoRemetenteAssignment_27"
    // InternalMemorando.g:1251:1: rule__Memorando__CargoRemetenteAssignment_27 : ( RULE_STRING ) ;
    public final void rule__Memorando__CargoRemetenteAssignment_27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1255:1: ( ( RULE_STRING ) )
            // InternalMemorando.g:1256:2: ( RULE_STRING )
            {
            // InternalMemorando.g:1256:2: ( RULE_STRING )
            // InternalMemorando.g:1257:3: RULE_STRING
            {
             before(grammarAccess.getMemorandoAccess().getCargoRemetenteSTRINGTerminalRuleCall_27_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMemorandoAccess().getCargoRemetenteSTRINGTerminalRuleCall_27_0()); 

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
    // $ANTLR end "rule__Memorando__CargoRemetenteAssignment_27"


    // $ANTLR start "rule__Destino__DestinoAssignment"
    // InternalMemorando.g:1266:1: rule__Destino__DestinoAssignment : ( RULE_ID ) ;
    public final void rule__Destino__DestinoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1270:1: ( ( RULE_ID ) )
            // InternalMemorando.g:1271:2: ( RULE_ID )
            {
            // InternalMemorando.g:1271:2: ( RULE_ID )
            // InternalMemorando.g:1272:3: RULE_ID
            {
             before(grammarAccess.getDestinoAccess().getDestinoIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDestinoAccess().getDestinoIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Destino__DestinoAssignment"


    // $ANTLR start "rule__Paragrafo__ParagrafoAssignment"
    // InternalMemorando.g:1281:1: rule__Paragrafo__ParagrafoAssignment : ( RULE_STRING ) ;
    public final void rule__Paragrafo__ParagrafoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMemorando.g:1285:1: ( ( RULE_STRING ) )
            // InternalMemorando.g:1286:2: ( RULE_STRING )
            {
            // InternalMemorando.g:1286:2: ( RULE_STRING )
            // InternalMemorando.g:1287:3: RULE_STRING
            {
             before(grammarAccess.getParagrafoAccess().getParagrafoSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParagrafoAccess().getParagrafoSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Paragrafo__ParagrafoAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000800002L});

}