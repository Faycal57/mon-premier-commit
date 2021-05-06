package com.stock.mvc.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "article")
@EntityListeners(AuditingEntityListener.class)
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArticle;
    private String codeArticle;
    private String designation;
    private BigDecimal prixUnitaireHT;
    private BigDecimal tauxTva;
    private BigDecimal prixUnitaireTTC;
    private String photo;

    public Article() { }

    @ManyToOne
    @JoinColumn(name = "idCategory")
    private Categorie category;

    public Long getId() {
        return idArticle;
    }

    public void setId(Long id) {
        this.idArticle = idArticle;
    }

    public String getCodeArticle() {
        return codeArticle;
    }

    public void setCodeArticle(String codeArticle) {
        this.codeArticle = codeArticle;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public BigDecimal getPrixUnitaireHT() {
        return prixUnitaireHT;
    }

    public void setPrixUnitaireHT(BigDecimal prixUnitaireHT) {
        this.prixUnitaireHT = prixUnitaireHT;
    }

    public BigDecimal getTauxTva() {
        return tauxTva;
    }

    public void setTauxTva(BigDecimal tauxTva) {
        this.tauxTva = tauxTva;
    }

    public BigDecimal getPrixUnitaireTTC() {
        return prixUnitaireTTC;
    }

    public void setPrixUnitaireTTC(BigDecimal prixUnitaireTTC) {
        this.prixUnitaireTTC = prixUnitaireTTC;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Categorie getCategory() {
        return category;
    }

    public void setCategory(Categorie category) {
        this.category = category;
    }
}
