package com.mycompany.trabalho_final.inscricao.faces.mngbeans;

import com.mycompany.trabalho_final.controller.faces.support.PageBean;
import com.mycompany.trabalho_final.inscricao.faces.converter.CEPConverter;
import com.mycompany.trabalho_final.inscricao.faces.converter.CPFConverter;
import com.mycompany.trabalho_final.inscricao.faces.validator.AlphaNumericValidator;
import com.mycompany.trabalho_final.inscricao.faces.validator.CPFValidator;
import com.mycompany.trabalho_final.inscricao.faces.validator.EmailValidator;
import com.mycompany.trabalho_final.inscricao.faces.validator.StringValidator;
import com.mycompany.trabalho_final.model.Pessoa;
import java.math.BigDecimal;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Guilherme dos Santos Fujiyoshi
 */
@ManagedBean
@RequestScoped
public class InscricaoBean extends PageBean {

    private Pessoa pessoa = new Pessoa();
    private CPFConverter cpfConverter = new CPFConverter();
    private CEPConverter cepConverter = new CEPConverter();
    private CPFValidator cpfValidator = new CPFValidator();
    private StringValidator stringValidator = new StringValidator();
    private AlphaNumericValidator alphaNumericValidator = new AlphaNumericValidator();
    private EmailValidator emailValidator = new EmailValidator();
    private BigDecimal valor = new BigDecimal("100.00");
    private boolean cursoJava = false;
    private boolean cursoRuby = false;
    private boolean cursoPython = false;
    private boolean cursoHtml = false;
    private boolean cursoWebservice = false;

    public InscricaoBean() {
    }

    public void cadastroAction() {
        this.calculaValor();
        info("-----------");
        info("Nome: " + pessoa.getNome());
        info("CPF: " + pessoa.getCpf());
        info("RG: " + pessoa.getRg());
        info("Endereço: " + pessoa.getEnderecoRua());
        info("Número: " + pessoa.getEnderecoNumero());
        info("Complemento: " + pessoa.getEnderecoComplemento());
        info("Cidade: " + pessoa.getEnderecoCidade());
        info("Estado: " + pessoa.getEnderecoEstado());
        info("CEP: " + pessoa.getCep());
        info("Bairro: " + pessoa.getEnderecoBairro());
        info("Fone: " + pessoa.getTelefone());
        info("E-Mail: " + pessoa.getEmail());
        info("Curso Java: " + this.isCursoJava());
        info("Curso Python: " + this.isCursoPython());
        info("Curso Ruby: " + this.isCursoRuby());
        info("Curso HTML: " + this.isCursoHtml());
        info("Curso Webservies: " + this.isCursoWebservice());
        info("Valor: " + this.getValor().toString());
        info("-----------");
        info("Inscrição realizada com sucesso");
    }
    
    private void calculaValor() {
        this.checaCurso(cursoJava);
        this.checaCurso(cursoPython);
        this.checaCurso(cursoRuby);
        this.checaCurso(cursoHtml);
        this.checaCurso(cursoWebservice);
    }

    private void checaCurso(boolean op) {
        if(op) {
            this.valor = valor.add(new BigDecimal("50.00"));
        }
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public Pessoa getPessoa() {
        return pessoa;
    }

    public CEPConverter getCepConverter() {
        return cepConverter;
    }

    public CPFConverter getCpfConverter() {
        return cpfConverter;
    }
    
    public CPFValidator getCpfValidator() {
        return cpfValidator;
    }
    
    public StringValidator getStringValidator() {
        return stringValidator;
    }
    
    public AlphaNumericValidator getAlphaNumericValidator() {
        return alphaNumericValidator;
    }
    
    public EmailValidator getEmailValidator() {
        return emailValidator;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public boolean isCursoJava() {
        return cursoJava;
    }

    public boolean isCursoRuby() {
        return cursoRuby;
    }

    public boolean isCursoPython() {
        return cursoPython;
    }

    public boolean isCursoHtml() {
        return cursoHtml;
    }

    public boolean isCursoWebservice() {
        return cursoWebservice;
    }

    public void setCursoJava(boolean cursoJava) {
        this.cursoJava = cursoJava;
    }

    public void setCursoRuby(boolean cursoRuby) {
        this.cursoRuby = cursoRuby;
    }

    public void setCursoPython(boolean cursoPython) {
        this.cursoPython = cursoPython;
    }

    public void setCursoHtml(boolean cursoHtml) {
        this.cursoHtml = cursoHtml;
    }

    public void setCursoWebservice(boolean cursoWebservice) {
        this.cursoWebservice = cursoWebservice;
    }
}
