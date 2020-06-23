package com.internous.ecsite.model.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import com.internous.ecsite.model.entity.Purchase;

public class HistoryDto {

	private long id;
	private long userId;
	private long goodsId;
	private String goodsName;
	private long itemCount;
	private long total;
	private String createdAt;
	
	public HistoryDto() {}
	
	public HistoryDto(Purchase entity) {
		this.id = entity.getId();
		this.userId = entity.getUserId();
		this.goodsId = entity.getGoodsId();
		this.goodsName = entity.getGoodsName();
		this.itemCount = entity.getItemCount();
		this.total = entity.getTotal();
		
		Timestamp d = entity.getCreatedAt();
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		this.createdAt = f.format(d);
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) { 
		this.id = id;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	
	public void setGodsName(String goodsName) { 
		this.goodsName = goodsName;
	}
	
	public long getGoodsId() {
		return goodsId;
	}
	
	public void setPrice(long goodsId) { 
		this.goodsId = goodsId;
	}
	
	public long getUserId() {
		return userId;
	}
	
	public void setUserId(long userId) { 
		this.userId = userId;
	}
	
	public long getItemCount() {
		return itemCount;
	}
	
	public void setItemCount(long itemCount) { 
		this.itemCount = itemCount;
	}
	
	public long getTotal() {
		return total;
	}
	
	public void setTotal(long total) { 
		this.total = total;
	}
	
	public String getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(String createdAt) { 
		this.createdAt = createdAt;
	}
}
