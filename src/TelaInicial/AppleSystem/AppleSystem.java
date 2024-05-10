package TelaInicial.AppleSystem;

import TelaInicial.AppleMusic.AppleMusic;
import TelaInicial.ApplePhone.ApplePhone;
import TelaInicial.AppleSafari.AppleSafari;

public class AppleSystem implements AppleMusic, ApplePhone, AppleSafari{
    public void tocar(){
        System.out.println("Bem vindo ao AppleMusic\n1-Tocar Musica\n2-Pausar Musica\n3-Selecionar Musica\n0-Sair");
    }

    public void ligar(){
        System.out.println("Bem vindo ao ApplePhone\n1-Correio de voz\n2-Fazer ligacao\n3-Atender Ligacao\n0-Sair");

    }
    public void navegar(){
        System.out.println("Bem vindo ao Safari\n1-Atualizar Pagina\n2-Abrir nova aba\n0-SAIR");

    }
}
