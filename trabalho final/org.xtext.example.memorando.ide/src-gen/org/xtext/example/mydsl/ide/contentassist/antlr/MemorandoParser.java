/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMemorandoParser;
import org.xtext.example.mydsl.services.MemorandoGrammarAccess;

public class MemorandoParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MemorandoGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MemorandoGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getMemorandoAccess().getGroup(), "rule__Memorando__Group__0");
			builder.put(grammarAccess.getDestinoAccess().getGroup(), "rule__Destino__Group__0");
			builder.put(grammarAccess.getParagrafoAccess().getGroup(), "rule__Paragrafo__Group__0");
			builder.put(grammarAccess.getSetorDestinatarioAccess().getGroup(), "rule__SetorDestinatario__Group__0");
			builder.put(grammarAccess.getCargoDestinatarioAccess().getGroup(), "rule__CargoDestinatario__Group__0");
			builder.put(grammarAccess.getModelAccess().getMemorandosAssignment(), "rule__Model__MemorandosAssignment");
			builder.put(grammarAccess.getMemorandoAccess().getNumeroAssignment_2(), "rule__Memorando__NumeroAssignment_2");
			builder.put(grammarAccess.getMemorandoAccess().getSetoresDestinatariosAssignment_6(), "rule__Memorando__SetoresDestinatariosAssignment_6");
			builder.put(grammarAccess.getMemorandoAccess().getSetorRemetenteAssignment_10(), "rule__Memorando__SetorRemetenteAssignment_10");
			builder.put(grammarAccess.getMemorandoAccess().getCidadeAssignment_13(), "rule__Memorando__CidadeAssignment_13");
			builder.put(grammarAccess.getMemorandoAccess().getEstadoAssignment_16(), "rule__Memorando__EstadoAssignment_16");
			builder.put(grammarAccess.getMemorandoAccess().getDiaAssignment_19(), "rule__Memorando__DiaAssignment_19");
			builder.put(grammarAccess.getMemorandoAccess().getMesAssignment_21(), "rule__Memorando__MesAssignment_21");
			builder.put(grammarAccess.getMemorandoAccess().getAnoAssignment_23(), "rule__Memorando__AnoAssignment_23");
			builder.put(grammarAccess.getMemorandoAccess().getCargosDestinatariosAssignment_27(), "rule__Memorando__CargosDestinatariosAssignment_27");
			builder.put(grammarAccess.getMemorandoAccess().getAssuntoAssignment_31(), "rule__Memorando__AssuntoAssignment_31");
			builder.put(grammarAccess.getMemorandoAccess().getDestinosAssignment_35(), "rule__Memorando__DestinosAssignment_35");
			builder.put(grammarAccess.getMemorandoAccess().getParagrafosAssignment_40(), "rule__Memorando__ParagrafosAssignment_40");
			builder.put(grammarAccess.getMemorandoAccess().getRemetenteAssignment_44(), "rule__Memorando__RemetenteAssignment_44");
			builder.put(grammarAccess.getMemorandoAccess().getCargoRemetenteAssignment_47(), "rule__Memorando__CargoRemetenteAssignment_47");
			builder.put(grammarAccess.getDestinoAccess().getDestinoAssignment_0(), "rule__Destino__DestinoAssignment_0");
			builder.put(grammarAccess.getParagrafoAccess().getParagrafoAssignment_0(), "rule__Paragrafo__ParagrafoAssignment_0");
			builder.put(grammarAccess.getSetorDestinatarioAccess().getSetorDestinatarioAssignment_0(), "rule__SetorDestinatario__SetorDestinatarioAssignment_0");
			builder.put(grammarAccess.getCargoDestinatarioAccess().getCargoDestinatarioAssignment_0(), "rule__CargoDestinatario__CargoDestinatarioAssignment_0");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MemorandoGrammarAccess grammarAccess;

	@Override
	protected InternalMemorandoParser createParser() {
		InternalMemorandoParser result = new InternalMemorandoParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MemorandoGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MemorandoGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
