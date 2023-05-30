package com.wellsfargo.counselor.entity;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class Portfolio {
	
	@OneToMany(mappedBy="portfolioId")
	@Id
	@GeneratedValue()
	private long portfolioId;
	
	@ManyToOne
	@JoinColumn(name = "clientId")
	private long clientId;
	
    @Column(nullable = false)
	public long getPortfolioId() {
		return portfolioId;
	}

    @Column(nullable = false)
	public void setPortfolioId(long portfolioId) {
		this.portfolioId = portfolioId;
	}

    @Column(nullable = false)
	public long getClientId() {
		return clientId;
	}

    @Column(nullable = false)
	public void setClientId(long clientId) {
		this.clientId = clientId;
	}

    @Column(nullable = false)
	private Date creationDate;

	public Portfolio(long portfolioId, long clientId, Date creationDate) {
		this.portfolioId = portfolioId;
		this.clientId = clientId;
		this.setCreationDate(creationDate);
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
