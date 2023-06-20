package com.bolsadeideas.springboot.app.util.paginator;

import org.springframework.data.domain.Page;

public class PagerRender<T> {
	
	private String url;
	private Page<T> page;
	
	private int totalPaginas;
	
	private int numeroElementosPorPagina;
	
	public PagerRender(String url, Page<T> page) {		
		this.url = url;
		this.page = page;
		
		numeroElementosPorPagina = page.getSize();
		totalPaginas = page.getTotalPages();
	}
	
	

}
