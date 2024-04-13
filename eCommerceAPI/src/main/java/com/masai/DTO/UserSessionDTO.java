package com.masai.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class UserSessionDTO {

    private Integer uuid;
    private String userId;
    private LocalDateTime start;
    private LocalDateTime end;
	public Integer getUuid() {
		return uuid;
	}
	public UserSessionDTO(Integer uuid, String userId, LocalDateTime start, LocalDateTime end) {
		super();
		this.uuid = uuid;
		this.userId = userId;
		this.start = start;
		this.end = end;
	}
	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public LocalDateTime getStart() {
		return start;
	}
	public void setStart(LocalDateTime start) {
		this.start = start;
	}
	public LocalDateTime getEnd() {
		return end;
	}
	public void setEnd(LocalDateTime end) {
		this.end = end;
	}
}
