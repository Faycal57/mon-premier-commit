package com.stock.mvc.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "commande client")
@EntityListeners(AuditingEntityListener.class)
public class CommandeClient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommandeClient;
    private String code;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCommande;

    @ManyToOne
    @JoinColumn(name = "/idClient")
    private Client client;

    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClients;

    public CommandeClient() { }

    public Long getIdCommandeClient() {
        return idCommandeClient;
    }

    public void setIdCommandeClient(Long idCommandeClient) {
        this.idCommandeClient = idCommandeClient;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<LigneCommandeClient> getLigneCommandeClients() {
        return ligneCommandeClients;
    }

    public void setLigneCommandeClients(List<LigneCommandeClient> ligneCommandeClients) {
        this.ligneCommandeClients = ligneCommandeClients;
    }
}
