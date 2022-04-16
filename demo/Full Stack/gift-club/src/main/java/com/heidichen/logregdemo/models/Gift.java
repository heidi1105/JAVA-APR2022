package com.heidichen.logregdemo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="gifts")
public class Gift {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=2)
	private String giftName;
	
	@NotNull
	@Min(0)
	private Integer quantity;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	@PrePersist
	protected void onCreated() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
    }	
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="sender_id")
    private User sender;	
	
    public Gift() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGiftName() {
		return giftName;
	}

	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}
    
    
	
}











