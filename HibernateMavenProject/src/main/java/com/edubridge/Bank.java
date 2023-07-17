package com.edubridge;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bank_table")
public class Bank {@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Bank_id")
	private int bankId;
	@Column(name="Bank_name",nullable=false,length=30)
	private String bankName;
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
