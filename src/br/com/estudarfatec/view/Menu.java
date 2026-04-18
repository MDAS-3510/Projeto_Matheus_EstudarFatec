package br.com.estudarfatec.view;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.estudarfatec.model.Disciplina;
import br.com.estudarfatec.model.MatrizEisenhower;
import br.com.estudarfatec.model.Tarefa;
import br.com.estudarfatec.model.Disciplina.DiaSemana;

public class Menu {
	
	public void iniciar() {
		
	ArrayList<Disciplina> disciplinas = new ArrayList<>();
	
	MatrizEisenhower matriz = new MatrizEisenhower();
	
	Scanner scanner = new Scanner(System.in);
	int opcao = 1;
	
		

	while (opcao != 0) {
		System.out.println("                      ");
		System.out.println("                      ");
		System.out.println(" ==== Disciplina ==== ");
		System.out.println("1 - Listar Disciplina ");
		System.out.println("2 - Criar Disciplina ");
		System.out.println("3 - Editar Disciplina ");
		System.out.println("4 - Excluir Disciplina ");
		System.out.println("5 - Mostrar Tarefas da Disciplina");
		System.out.println("6 - Metodo Pomodoro");
		System.out.println("0 - Sair");
		
		opcao = scanner.nextInt();
		scanner.nextLine(); 

		switch (opcao) {
			
			case 1:
				if (disciplinas.isEmpty()) {
					System.out.println("                      ");
					System.out.println("Nenhuma Disciplina cadastrada!");
				}
				for (Disciplina d : disciplinas) {
					System.out.println(d.getId() + " - " + d.getNome() + " | " + d.getDiaSemana().getNomeDia());
				}
				break;
				
			case 2:
				System.out.println("Digite o nome da disciplina");
				String nome = scanner.nextLine();
				DiaSemana[] dias = DiaSemana.values();
				for (int i = 0; i < dias.length; i++) {
					System.out.println((i + 1) + " - " + dias[i].getNomeDia());
				}
				int escolha = scanner.nextInt();
				scanner.nextLine();
				DiaSemana diaSemana = DiaSemana.values()[escolha - 1];
				Disciplina nova = new Disciplina(disciplinas.size() + 1, nome, diaSemana);
				disciplinas.add(nova);
				break;
				
			case 3:
				
				for (Disciplina d : disciplinas) {
					System.out.println(d.getId() + " - " + d.getNome() + " | " + d.getDiaSemana().getNomeDia());
				}
				
				System.out.println("Digite o id da disciplina");
				int idEscolhidoEdita = scanner.nextInt();
				
				for(Disciplina d: disciplinas) {
					if(d.getId() == idEscolhidoEdita) {
						System.out.println("Digite um novo nome: ");
						String novoNome = scanner.nextLine();
						
						DiaSemana[] diasEdita = DiaSemana.values();
						for(int i = 0; i < diasEdita.length; i++) {
							System.out.println((i+1) + " - " + diasEdita[i].getNomeDia());
						}
						System.out.println("                                            ");
						System.out.println("escolhe qual dia da semana você quer mudar: ");
						System.out.println("                                            ");
						int nomeDia = scanner.nextInt();
						
						DiaSemana diaSemanaEdita = DiaSemana.values()[nomeDia - 1];
						d.setNome(novoNome);
						d.setDiaSemana(diaSemanaEdita);
						
					}
				}
				break;
				
			case 4: 
				for (Disciplina d : disciplinas) {
					System.out.println(d.getId() + " - " + d.getNome() + " | " + d.getDiaSemana().getNomeDia());
				}
				
				System.out.println("Digite o id qual disciplina você quer deletar");
				int idEscolhidoExcluir = scanner.nextInt();
				disciplinas.removeIf(d -> d.getId() == idEscolhidoExcluir);
				System.out.println("Disciplina removida com sucesso!");
				break;
				
				
			case 5:
				for(Disciplina d: disciplinas) {
					
					System.out.println(d.getId() + " - " + d.getNome() + " | " + d.getDiaSemana().getNomeDia());
				}
					System.out.println("                                                ");
					System.out.println("Qual Disciplina você quer entrar para visualizar");
					int idEntrarDisciplina = scanner.nextInt();
					
					
					for(Disciplina d: disciplinas) {
						
						if(d.getId() == idEntrarDisciplina) {
							int opcaoTarefa = 1;
							while (opcaoTarefa != 0) {
								System.out.println("                      ");
								System.out.println("                      ");
								System.out.println(" ==== Tarefas ==== ");
								System.out.println("1 - Listar Tarefas ");
								System.out.println("2 - Criar Tarefa ");
								System.out.println("3 - Editar Tarefa ");
								System.out.println("4 - Concluir Tarefa ");
								System.out.println("5 - Excluir Tarefa ");
								System.out.println("6 - Ver Matriz de Eisenhower");
								System.out.println("0 - voltar");
								opcaoTarefa = scanner.nextInt();
								scanner.nextLine(); 
								
								switch (opcaoTarefa) {
								case 1: 
									if (d.getTarefas().isEmpty()) {
										System.out.println("                      ");
										System.out.println("Nenhuma Tarefa Visualizada");
									}
									for (Tarefa t: d.getTarefas()) {
										System.out.println(t.toString());
									}
									
									break;
								case 2:
									System.out.println("Digite o titulo da tarefa");
									String tituloTarefa = scanner.nextLine();	
									
									System.out.println("Digite a descrição da tarefa");
									String descricaoTarefa = scanner.nextLine();
									Tarefa novaTarefa = new Tarefa(d.getTarefas().size() + 1, tituloTarefa, descricaoTarefa);
									d.adicionarTarefa(novaTarefa);
									
									
										System.out.println("Essa tarefa e urgente");
										System.out.println("1 - Sim");
										System.out.println("2 - Não");
										int opcaoUrgente = scanner.nextInt();
										novaTarefa.setUrgente(opcaoUrgente == 1);
										
										System.out.println("Essa tarefa e importante");
										System.out.println("1 - Sim");
										System.out.println("2 - Não");
										int opcaoImportante = scanner.nextInt();
										novaTarefa.setImportante(opcaoImportante == 1);
									
										matriz.classificarTarefa(novaTarefa);
									
									break;
									
								case 3:
									for (Tarefa t: d.getTarefas()) {
										System.out.println(t.toString());
									}
									
									System.out.println("Digite o id da Tarefa");
									int idEditaTarefa = scanner.nextInt();
									scanner.nextLine();

									
									for (Tarefa t: d.getTarefas()) {
										if(t.getId() == idEditaTarefa) {
											System.out.println("Digite um novo titulo");
											String editaTituloTarefa = scanner.nextLine();
											
											System.out.println("Digite uma nova descrição");
											String editaDescricaoTarefa = scanner.nextLine();
											
											System.out.println("Essa tarefa e urgente");
											System.out.println("1 - Sim");
											System.out.println("2 - Não");
											int opcaoUrgenteEdita = scanner.nextInt();
											t.setUrgente(opcaoUrgenteEdita == 1);
											
											System.out.println("Essa tarefa e importante");
											System.out.println("1 - Sim");
											System.out.println("2 - Não");
											int opcaoImportanteEdita = scanner.nextInt();
											t.setImportante(opcaoImportanteEdita == 1);

											t.setTitulo(editaTituloTarefa);
											t.setDescricao(editaDescricaoTarefa);
											
											matriz.removerTarefa(t);      
											matriz.classificarTarefa(t);  
											
											System.out.println("Tarefa Atualizada");
											
										}
									}
									break;
								case 4:
									for(Tarefa t: d.getTarefas()) {
										System.out.println(t.toString());
									}
									
									System.out.println("Digite o id que você que colocar para concluir a tarefa ou não");
									int conlcuirTarefa = scanner.nextInt();
									scanner.nextLine();
									
									for(Tarefa t: d.getTarefas()) {
										if(t.getId() == conlcuirTarefa) {
											System.out.println("1 - concluir");
											System.out.println("2 - desconcluir");
											int opcaoConcluir = scanner.nextInt();
											
											if(opcaoConcluir == 1) t.concluir();
											if(opcaoConcluir == 2) t.desconcluir();
										}
									}
									break;
									
								case 5:
									for(Tarefa t: d.getTarefas()) {
										System.out.println(t.toString());
									}
									System.out.println("Qual tarefa você quer deletar (digite o id)");
									int excluirTerefa = scanner.nextInt();
									
									d.getTarefas().removeIf(t -> t.getId() == excluirTerefa);
									System.out.println("Tarefa removida com sucesso!");
									break;
								case 6:
									System.out.println("=== Q1 - FAZER AGORA (Urgente e Importante) ===");
									for(Tarefa t : matriz.getFazerAgora()) {
										System.out.println(t.toString());
									}
									System.out.println("=== Q2 - AGENDAR (Importante mas não Urgente) ===");
									for(Tarefa t : matriz.getAgendar()) {
										System.out.println(t.toString());
									}
									System.out.println("=== Q3 - DELEGAR (Urgente mas não Importante) ===");
									for(Tarefa t : matriz.getDelegar()) {
										System.out.println(t.toString());
									}
									System.out.println("=== Q4 - ELIMINAR (nem Urgente e  nem Importante) ===");
									for(Tarefa t : matriz.getEliminar()) {
										System.out.println(t.toString());
									}
									break;
									
									
								default:
								}
							}
						}
					}
					
			case 6:
				System.out.println("                ");
				System.out.println("1 - Começar Timer ");
				System.out.println("2 - Flash Cards ");
				System.out.println("3 - Revisão ");
				
				
				
					
				break;
			default:
				System.out.println("Opção invalida! Digite 1, 2 ou 0");
			}
		}
	scanner.close();
	}
}




