package com.wellsfargo.counselor.entity;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Security {
	
	@Id
	@GeneratedValue
	private long securityId;
	
	@ManyToOne
	@JoinColumn(name= "portfolioId")
	private long portfolioId;
	
    @Column(nullable = false)
	private String name;
	
    
    @Column(nullable = false)
	private String category;
	 
    @Column(nullable = false)
	private Double purchasePrice;
	
    
    @Column(nullable = false)
	private Date purchaseDate;
	
    @Column(nullable = false)
	private int quanity;

	public Security(long securityId, long portfolioId, String name, String category, Double purchasePrice,
			Date purchaseDate, int quanity) {
		super();
		this.securityId = securityId;
		this.portfolioId = portfolioId;
		this.name = name;
		this.category = category;
		this.purchasePrice = purchasePrice;
		this.purchaseDate = purchaseDate;
		this.quanity = quanity;
	}

	public long getSecurityId() {
		return securityId;
	}

	public void setSecurityId(long securityId) {
		this.securityId = securityId;
	}

	public long getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(long portfolioId) {
		this.portfolioId = portfolioId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getQuanity() {
		return quanity;
	}

	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}

}
