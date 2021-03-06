package com.devsuperior.dvpesquisa.dto;

import com.devsuperior.dvpesquisa.entities.Game;
import com.devsuperior.dvpesquisa.entities.enums.Platform;

public class GameDto {
	
	private Long id;
	private String title;
	private Platform platform;
	
	public GameDto() {
		
	}
	
	public GameDto(Game entity) {
		id= entity.getId();
		title = entity.getTitle();
		platform = entity.getPlatform();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}
	
	
}
