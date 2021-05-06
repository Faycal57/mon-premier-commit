package com.stock.mvc.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "ligne commande client")
@EntityListeners(AuditingEntityListener.class)
public class LigneCommandeClient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLigneCdeClt;

    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article;
    private CommandeClient commandeClient;

    public LigneCommandeClient() { }

    public int getIdLigneCdeClt() {
        return idLigneCdeClt;
    }

    public void setIdLigneCdeClt(int idLigneCdeClt) {
        this.idLigneCdeClt = idLigneCdeClt;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public CommandeClient getCommandeClient() {
        return commandeClient;
    }

    public void setCommandeClient(CommandeClient commandeClient) {
        this.commandeClient = commandeClient;
    }
}
