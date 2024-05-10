package Iphone;

import TelaInicial.AppleSystem.AppleSystem;

import java.util.Scanner;

import TelaInicial.AppleMusic.AppleMusic;
import TelaInicial.AppleMusic.PausarMusica;
import TelaInicial.AppleMusic.SelecionarMusica;
import TelaInicial.AppleMusic.TocaMusica;
import TelaInicial.ApplePhone.ApplePhone;
import TelaInicial.ApplePhone.AtenderTelefone;
import TelaInicial.ApplePhone.IniciarCorreioVoz;
import TelaInicial.ApplePhone.LigarTelefone;
import TelaInicial.AppleSafari.AbrirNovaAba;
import TelaInicial.AppleSafari.AppleSafari;
import TelaInicial.AppleSafari.AtualizarPagina;
import TelaInicial.AppleSafari.Navegador;

public class Iphone{
    
    public static void main(String[] args) {
    int opcao=0;
    Scanner scan = new Scanner(System.in);
    while(true){
        System.out.println("Qual app Voce quer repoduzir?\n1-Apple Music\n2-Phone\n3-Safari\n5-Sair");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                ouvirMusica(opcao);
                break;
            case 2:
                fazerLigacao(opcao);
            break;
            case 3:
                navegarInternet(opcao);
            break;
            case 5:
                scan.close();
                System.exit(opcao);
            default:
            System.out.println("opcao invalida");

                break;
        }
    }

        
    }
    public static void ouvirMusica(int opcao){
        Scanner scan = new Scanner(System.in);
        while (true){
            AppleMusic musica = new AppleSystem();
            musica.tocar();
            opcao = scan.nextInt();
            
            switch (opcao) {
                case 1:
                    musica = new TocaMusica();
                    musica.tocar();
                    break;
            
                case 2:
                    musica = new PausarMusica();
                    musica.tocar();
                    break;
                case 3:
                    musica = new SelecionarMusica();
                    musica.tocar();
                    break;
                case 0:
                    
                    break;
                    
                default:
                    System.out.println("opcao invalida");
                    break;
            }
            if (opcao == 0){
                break;
            }
        }
    }
    public static void fazerLigacao(int opcao){
        Scanner scan = new Scanner(System.in);
        while (true){
            ApplePhone telefone = new AppleSystem();
            telefone.ligar();
            opcao = scan.nextInt();
            
            switch (opcao) {
                case 1:
                    telefone = new IniciarCorreioVoz();
                    telefone.ligar();
                    break;
            
                case 2:
                    telefone = new LigarTelefone();
                    telefone.ligar();
                    break;
                case 3:
                    telefone = new AtenderTelefone();
                    telefone.ligar();
                    break;
                case 0:
                    
                    break;
                    
                default:
                    System.out.println("opcao invalida");
                    break;
            }
            if (opcao == 0){
                break;
            }
        }
    }

    public static void navegarInternet(int opcao){ 
        Scanner scan = new Scanner(System.in);
        while (true){
            AppleSafari navegador = new Navegador();
            navegador.navegar();
            navegador = new AppleSystem();
            navegador.navegar();
            opcao = scan.nextInt();
            
            switch (opcao) {
            
                case 1:
                    navegador = new AtualizarPagina();
                    navegador.navegar();
                    break;
                case 2:
                    navegador = new AbrirNovaAba();
                    navegador.navegar();
                    break;
                case 0:
                    
                    break;
                    
                default:
                    System.out.println("opcao invalida");
                    break;
            }
            if (opcao == 0){
                break;
            }
        }
    }
}
