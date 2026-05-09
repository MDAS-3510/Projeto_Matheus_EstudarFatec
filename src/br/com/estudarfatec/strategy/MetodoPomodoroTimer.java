package br.com.estudarfatec.strategy;


public class MetodoPomodoroTimer implements MetodoEstudo {
    private int minutosFoco;
    private int minutosPausa;

    public MetodoPomodoroTimer(int minutosFoco, int minutosPausa) {
        this.minutosFoco = minutosFoco;
        this.minutosPausa = minutosPausa;
    }

    @Override
    public void estudar() {
        try {
            System.out.println("⏱ Iniciando " + minutosFoco + " minutos de foco...");
            contarRegressivo(minutosFoco);
            
            System.out.println("\n✅ Foco encerrado! Iniciando pausa...");
            contarRegressivo(minutosPausa);
            
            System.out.println("\n☕ Pausa encerrada! Próximo ciclo!");
        } catch (InterruptedException e) {
            System.out.println("Timer interrompido!");
        }
    }

    private void contarRegressivo(int minutos) throws InterruptedException {
        int totalSegundos = minutos * 60;
        for(int i = totalSegundos; i >= 0; i--) {
            System.out.printf("\r%02d:%02d", i / 60, i % 60);
            Thread.sleep(1000);
        }
    }
}

	// 1500000
	//300000


