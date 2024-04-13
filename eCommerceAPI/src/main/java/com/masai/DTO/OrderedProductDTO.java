package com.masai.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class OrderedProductDTO {

    private Integer orderedProductId;
    private String productName;
    private Double productPrice;
    private Integer gst;
    public OrderedProductDTO(Integer orderedProductId, String productName, Double productPrice, Integer gst,
			Double totalPrice) {
		super();
		this.orderedProductId = orderedProductId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.gst = gst;
		this.totalPrice = totalPrice;
	}
	private Double totalPrice;
	public Integer getOrderedProductId() {
		return orderedProductId;
	}
	public void setOrderedProductId(Integer orderedProductId) {
		this.orderedProductId = orderedProductId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public Integer getGst() {
		return gst;
	}
	public void setGst(Integer gst) {
		this.gst = gst;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
