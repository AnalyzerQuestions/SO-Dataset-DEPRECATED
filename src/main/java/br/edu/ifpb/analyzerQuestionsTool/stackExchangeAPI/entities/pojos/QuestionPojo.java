package br.edu.ifpb.analyzerQuestionsTool.stackExchangeAPI.entities.pojos;

import br.edu.ifpb.analyzerQuestionsTool.stackExchangeAPI.entities.types.Question;

/**
 * 
 * <p>
 * <b> POJO Dataset </b>
 * </p>
 *
 * <pre>
 * &#64;see <a href="http://www.linkreferencia.com">Link de Referencia</a>
 * </pre>
 * 
 * @author <a href="https://github.com/FranckAJ">Franck Aragão</a>
 *
 */
public class QuestionPojo {

	private Question columnQuestion;

	private Long columnDateBetwenQuestionComment;
	private Long columnDateBetwenQuestionAnswer;
	private Long columnDateBetwenCommentAnswer;

	private int columnCoerenciaTeD;
	private int columnTituloBemDefinido;
	private int columnExemplo;
	private int columnUsoNormaCultaLingua;
	private int columnEducacao;
	private int columnDetailContexto;
	private int columnDescricaoCurta;
	private int columnMuchCode;
	private int columnQuestionUnique;
	private int columnEvidentProbleam;
	private int columnEvPerguntaDuplicada;
	private int columnEvPergSobreTrabAcademicos;
	private int columnAgradecimento;
	private int columnPergBemDefinida;
	private int columnObjetividade;
	private int columnClareza;
	private int colummLink;
	private int combLink;

	public QuestionPojo() {
	}

	public int getColummLink() {
		return colummLink;
	}

	public void setColummLink(int colummLink) {
		this.colummLink = colummLink;
	}

	public int getCombLink() {
		return combLink;
	}

	public void setCombLink(int combLink) {
		this.combLink = combLink;
	}

	public Question getColumnQuestion() {
		return columnQuestion;
	}

	public void setColumnQuestion(Question columnQuestion) {
		this.columnQuestion = columnQuestion;
	}

	public Long getColumnDateBetwenQuestionComment() {
		return columnDateBetwenQuestionComment;
	}

	public void setColumnDateBetwenQuestionComment(Long columnDateBetwenQuestionComment) {
		this.columnDateBetwenQuestionComment = columnDateBetwenQuestionComment;
	}

	public Long getColumnDateBetwenQuestionAnswer() {
		return columnDateBetwenQuestionAnswer;
	}

	public void setColumnDateBetwenQuestionAnswer(Long columnDateBetwenQuestionAnswer) {
		this.columnDateBetwenQuestionAnswer = columnDateBetwenQuestionAnswer;
	}

	public Long getColumnDateBetwenCommentAnswer() {
		return columnDateBetwenCommentAnswer;
	}

	public int getColumnAgradecimento() {
		return columnAgradecimento;
	}

	public void setColumnAgradecimento(int columnAgradecimento) {
		this.columnAgradecimento = columnAgradecimento;
	}

	public void setColumnDateBetwenCommentAnswer(Long columnDateBetwenCommentAnswer) {
		this.columnDateBetwenCommentAnswer = columnDateBetwenCommentAnswer;
	}

	public int getColumnCoerenciaTeD() {
		return columnCoerenciaTeD;
	}

	public void setColumnCoerenciaTeD(int columnCoerenciaTeD) {
		this.columnCoerenciaTeD = columnCoerenciaTeD;
	}

	public int getColumnTituloBemDefinido() {
		return columnTituloBemDefinido;
	}

	public void setColumnTituloBemDefinido(int columnTituloBemDefinido) {
		this.columnTituloBemDefinido = columnTituloBemDefinido;
	}

	public int getColumnExemplo() {
		return columnExemplo;
	}

	public void setColumnExemplo(int columnExemplo) {
		this.columnExemplo = columnExemplo;
	}

	public int getColumnUsoNormaCultaLingua() {
		return columnUsoNormaCultaLingua;
	}

	public void setColumnUsoNormaCultaLingua(int columnUsoNormaCultaLingua) {
		this.columnUsoNormaCultaLingua = columnUsoNormaCultaLingua;
	}

	public int getColumnEducacao() {
		return columnEducacao;
	}

	public void setColumnEducacao(int columnEducacao) {
		this.columnEducacao = columnEducacao;
	}

	public int getColumnDetailContexto() {
		return columnDetailContexto;
	}

	public void setColumnDetailContexto(int columnDetailContexto) {
		this.columnDetailContexto = columnDetailContexto;
	}

	public int getColumnDescricaoCurta() {
		return columnDescricaoCurta;
	}

	public void setColumnDescricaoCurta(int columnDescricaoCurta) {
		this.columnDescricaoCurta = columnDescricaoCurta;
	}

	public int getColumnMuchCode() {
		return columnMuchCode;
	}

	public void setColumnMuchCode(int columnMuchCode) {
		this.columnMuchCode = columnMuchCode;
	}

	public int getColumnQuestionUnique() {
		return columnQuestionUnique;
	}

	public void setColumnQuestionUnique(int columnQuestionUnique) {
		this.columnQuestionUnique = columnQuestionUnique;
	}

	public int getColumnEvidentProbleam() {
		return columnEvidentProbleam;
	}

	public void setColumnEvidentProbleam(int columnEvidentProbleam) {
		this.columnEvidentProbleam = columnEvidentProbleam;
	}

	public int getColumnEvPerguntaDuplicada() {
		return columnEvPerguntaDuplicada;
	}

	public void setColumnEvPerguntaDuplicada(int columnEvPerguntaDuplicada) {
		this.columnEvPerguntaDuplicada = columnEvPerguntaDuplicada;
	}

	public int getColumnEvPergSobreTrabAcademicos() {
		return columnEvPergSobreTrabAcademicos;
	}

	public void setColumnEvPergSobreTrabAcademicos(int columnEvPergSobreTrabAcademicos) {
		this.columnEvPergSobreTrabAcademicos = columnEvPergSobreTrabAcademicos;
	}

	public int getColumnPergBemDefinida() {
		return columnPergBemDefinida;
	}

	public void setColumnPergBemDefinida(int columnPergBemDefinida) {
		this.columnPergBemDefinida = columnPergBemDefinida;
	}

	public int getColumnObjetividade() {
		return columnObjetividade;
	}

	public void setColumnObjetividade(int columnObjetividade) {
		this.columnObjetividade = columnObjetividade;
	}

	public int getColumnClareza() {
		return columnClareza;
	}

	public void setColumnClareza(int columnClareza) {
		this.columnClareza = columnClareza;
	}

}
