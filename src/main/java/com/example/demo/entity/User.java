package com.example.demo.entity;

import java.util.Date;

public class User {
	/**
	 * ID
	 */
	private Long id;
	/**
	 * 名前
	 */
	private String name;
	/**
	 * 住所
	 */
	private String address;
	/**
	 * 電話番号
	 */
	private String phone;
	/**
	 * 更新日時
	 */
	private Date updateDate;
	/**
	 * 登録日時
	 */
	private Date createDate;
	/**
	 * 削除日時
	 */
	private Date deleteDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}
}
