package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	
		public static void main(String[] args) {
			Curso curso1 = new Curso();
			curso1.setTitulo("Curso Java");
			curso1.setDescricao("Descrição curso Java");
			curso1.setCargaHoraria(8);
			
			Curso curso2 = new Curso();
			curso2.setTitulo("Curso JavaScript");
			curso2.setDescricao("Descrição curso JavaScript");
			curso2.setCargaHoraria(4);
			
			
			Mentoria mentoria = new Mentoria();
			mentoria.setTitulo("Mentoria Java"); 
			mentoria.setDescricao("Descrição mentoria Java");
			mentoria.setData(LocalDate.now());
			
			
			Bootcamp bootcamp = new Bootcamp();
			bootcamp.setNome("Bootcamp Java Developer");
			bootcamp.setDescricao("Descrição Bootcamp Java Developer");
			bootcamp.getConteudos().add(curso1);
			bootcamp.getConteudos().add(curso2);
			bootcamp.getConteudos().add(mentoria);
			
			Dev devMateus = new Dev();
			devMateus.setNome("Mateus");
			devMateus.inscreverBootcamp(bootcamp);
			System.out.println("Conteúdos Inscritos" + devMateus.getConteudosInscritos());
			devMateus.progredir();
			devMateus.progredir();
			System.out.println("-");
			System.out.println("Conteúdos Inscritos" + devMateus.getConteudosInscritos());
			System.out.println("Conteúdos Concluídos" + devMateus.getConteudosConcluidos());
			System.out.println("XP" + devMateus.calcularTotalXp());
			
			
			System.out.println("---------------");
			
			
			Dev devCamila = new Dev();
			devCamila.setNome("Camila");
			devCamila.inscreverBootcamp(bootcamp);
			System.out.println("Conteúdos Inscritos" + devCamila.getConteudosInscritos());
			devMateus.progredir();
			devCamila.progredir();
			System.out.println("-");
			System.out.println("Conteúdos Inscritos" + devCamila.getConteudosInscritos());
			System.out.println("Conteúdos Concluídos" + devCamila.getConteudosConcluidos());
			System.out.println("XP" + devCamila.calcularTotalXp());
			
		}
}
