package org.devinhouse.superherois.cli;

import org.devinhouse.superherois.exception.OpcaoInvalidaException;

import org.devinhouse.superherois.model.Heroi;
import org.devinhouse.superherois.model.Personagem;
import org.devinhouse.superherois.model.Vilao;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Display {
    private List<Personagem> personagens;
    Scanner scan = new Scanner(System.in);

    public Display() {
        this.personagens = new ArrayList<>();
        this.scan = new Scanner(System.in);
    }


    public void exibirMenu{

        int escolha = 0;

        do{

            System.out.println("== MENU ==");
            System.out.println("1 - Cadastrar Herói");
            System.out.println("2 - Cadastrar Vilão");
            System.out.println("3 - Listar");
            System.out.println("4 - Sair");


            System.out.print("Escolha uma opção: ");
            try {
                escolha = scan.nextInt();
                validarOpcao(escolha);
                executarOpcao(escolha);
            } catch (OpcaoInvalidaException e) {
                System.out.println("Erro: " + e.getMessage());
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
                scan.nextLine();
            }


        } while (escolha != 4);
    }

    private void validarOpcao(int opcao) throws OpcaoInvalidaException {
        if (opcao < 1 || opcao > 4) {
            throw new OpcaoInvalidaException("Opção inválida. Tente novamente.");
        }
    }

    private void executarOpcao(int opcao){
        switch (opcao){
            case 1:
                cadastrarHeroi();
                break;
            case 2:
                cadastrarVilao();
                break;
            case 3:
                listar();
                break;
            case 4:
                System.out.println("Encerrando o cadastro. Flws!");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }


    private void listar() {
        for(Personagem p : personagens){
            System.out.println(personagens);
        }
    }

    private void cadastrarHeroi() {

        //String nome, String superpoder, String nomeVidaReal

        System.out.println("Nome do super herói: ");
        String nome = scan.next();

        System.out.println("Nome da vida real: ");
        String nomeReal = scan.next();

        System.out.println("Superpoder: ");
        String superpoder = scan.next();

        Heroi heroi = new Heroi(nome, superpoder, nomeReal);
        personagens.add(heroi);

        System.out.println("Herói cadastrado com sucesso meu amigo :)");

    }


    private void cadastrarVilao() {

        //String nome, String superpoder, Integer tempoDePrisao

        System.out.println("Nome do vilão: ");
        String nome = scan.next();

        System.out.println("Superpoder: ");
        String superpoder = scan.next();

        System.out.println("Tempo de prisão: ");
        Integer tempoDePrisao = scan.nextInt();

        Vilao vilao = new Vilao(nome, superpoder, tempoDePrisao);
        personagens.add(vilao);

        System.out.println("Vilão cadastrado com sucesso meu amigo :)");

    }

}
