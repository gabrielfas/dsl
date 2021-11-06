/*
 * generated by Xtext 2.25.0
 */
grammar InternalProfissional;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getProfissionalTypeParserRuleCall_0());
			}
			lv_profissional_0_0=ruleType
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"profissional",
					lv_profissional_0_0,
					"org.xtext.example.mydsl.Profissional.Type");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTypeAccess().getAcademicoParserRuleCall_0());
		}
		this_Academico_0=ruleAcademico
		{
			$current = $this_Academico_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getEmpresaParserRuleCall_1());
		}
		this_Empresa_1=ruleEmpresa
		{
			$current = $this_Empresa_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAcademico
entryRuleAcademico returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAcademicoRule()); }
	iv_ruleAcademico=ruleAcademico
	{ $current=$iv_ruleAcademico.current; }
	EOF;

// Rule Academico
ruleAcademico returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Nome:'
		{
			newLeafNode(otherlv_0, grammarAccess.getAcademicoAccess().getNomeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAcademicoAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAcademicoRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=','
		{
			newLeafNode(otherlv_2, grammarAccess.getAcademicoAccess().getCommaKeyword_2());
		}
		(
			otherlv_3='Linkedin:'
			{
				newLeafNode(otherlv_3, grammarAccess.getAcademicoAccess().getLinkedinKeyword_3_0());
			}
			(
				(
					lv_name_4_0=RULE_ID
					{
						newLeafNode(lv_name_4_0, grammarAccess.getAcademicoAccess().getNameIDTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAcademicoRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_4_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getAcademicoAccess().getCommaKeyword_3_2());
			}
		)?
		otherlv_6='Lattes:'
		{
			newLeafNode(otherlv_6, grammarAccess.getAcademicoAccess().getLattesKeyword_4());
		}
		(
			(
				lv_name_7_0=RULE_ID
				{
					newLeafNode(lv_name_7_0, grammarAccess.getAcademicoAccess().getNameIDTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAcademicoRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_7_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_8='{'
			{
				newLeafNode(otherlv_8, grammarAccess.getAcademicoAccess().getLeftCurlyBracketKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAcademicoAccess().getLinguagemLinguagensParserRuleCall_6_1_0());
					}
					lv_linguagem_9_0=ruleLinguagens
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAcademicoRule());
						}
						add(
							$current,
							"linguagem",
							lv_linguagem_9_0,
							"org.xtext.example.mydsl.Profissional.Linguagens");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_10='}'
			{
				newLeafNode(otherlv_10, grammarAccess.getAcademicoAccess().getRightCurlyBracketKeyword_6_2());
			}
		)?
	)
;

// Entry rule entryRuleEmpresa
entryRuleEmpresa returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEmpresaRule()); }
	iv_ruleEmpresa=ruleEmpresa
	{ $current=$iv_ruleEmpresa.current; }
	EOF;

// Rule Empresa
ruleEmpresa returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Nome:'
		{
			newLeafNode(otherlv_0, grammarAccess.getEmpresaAccess().getNomeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEmpresaAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEmpresaRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=','
		{
			newLeafNode(otherlv_2, grammarAccess.getEmpresaAccess().getCommaKeyword_2());
		}
		(
			otherlv_3='Lattes:'
			{
				newLeafNode(otherlv_3, grammarAccess.getEmpresaAccess().getLattesKeyword_3_0());
			}
			(
				(
					lv_name_4_0=RULE_ID
					{
						newLeafNode(lv_name_4_0, grammarAccess.getEmpresaAccess().getNameIDTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEmpresaRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_4_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getEmpresaAccess().getCommaKeyword_3_2());
			}
		)?
		otherlv_6='Linkedin:'
		{
			newLeafNode(otherlv_6, grammarAccess.getEmpresaAccess().getLinkedinKeyword_4());
		}
		(
			(
				lv_name_7_0=RULE_ID
				{
					newLeafNode(lv_name_7_0, grammarAccess.getEmpresaAccess().getNameIDTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEmpresaRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_7_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_8='{'
			{
				newLeafNode(otherlv_8, grammarAccess.getEmpresaAccess().getLeftCurlyBracketKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEmpresaAccess().getLinguagemLinguagensParserRuleCall_6_1_0());
					}
					lv_linguagem_9_0=ruleLinguagens
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEmpresaRule());
						}
						add(
							$current,
							"linguagem",
							lv_linguagem_9_0,
							"org.xtext.example.mydsl.Profissional.Linguagens");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_10='}'
			{
				newLeafNode(otherlv_10, grammarAccess.getEmpresaAccess().getRightCurlyBracketKeyword_6_2());
			}
		)?
	)
;

// Entry rule entryRuleLinguagens
entryRuleLinguagens returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLinguagensRule()); }
	iv_ruleLinguagens=ruleLinguagens
	{ $current=$iv_ruleLinguagens.current; }
	EOF;

// Rule Linguagens
ruleLinguagens returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Nome da Linguagem:'
		{
			newLeafNode(otherlv_0, grammarAccess.getLinguagensAccess().getNomeDaLinguagemKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getLinguagensAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLinguagensRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=','
		{
			newLeafNode(otherlv_2, grammarAccess.getLinguagensAccess().getCommaKeyword_2());
		}
		otherlv_3='Tempo de Experi\u00EAncia:'
		{
			newLeafNode(otherlv_3, grammarAccess.getLinguagensAccess().getTempoDeExperiNciaKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_ID
				{
					newLeafNode(lv_name_4_0, grammarAccess.getLinguagensAccess().getNameIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLinguagensRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5='meses'
		{
			newLeafNode(otherlv_5, grammarAccess.getLinguagensAccess().getMesesKeyword_5());
		}
	)
;

RULE_DIGIT : '0'..'9';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;