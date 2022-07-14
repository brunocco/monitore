package com.project.monitore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Administrador {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long codigo;
		
		@Column(length = 50, nullable = false, unique = true)
		private String nome;
		
		

		public Administrador(Long codigo, String nome) {
			super();
			this.codigo = codigo;
			this.nome = nome;
		}
		



		public Administrador() {
			super();

		}




		public Long getCodigo() {
			return codigo;
		}




		public void setCodigo(Long codigo) {
			this.codigo = codigo;
		}




		public String getNome() {
			return nome;
		}




		public void setNome(String nome) {
			this.nome = nome;
		}





		/* teste
		public Long getAdministradorById() {
			
			return codigo;
		}
		*/
		
}
