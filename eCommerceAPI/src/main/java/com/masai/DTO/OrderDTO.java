package com.masai.DTO;

import com.masai.model.Payment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class OrderDTO {

    private String orderId;
    private Double totalPrice;
    private String shipping_Charges;
    private Payment payment;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getShipping_Charges() {
		return shipping_Charges;
	}
	public void setShipping_Charges(String shipping_Charges) {
		this.shipping_Charges = shipping_Charges;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	 

}
