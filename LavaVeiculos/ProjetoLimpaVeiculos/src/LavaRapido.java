public class LavaRapido {
    String nomeFantasia;
    float lucro;

    public LavaRapido(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
        this.lucro = 0;
    }

    public void lavaVeiculo(Veiculo veiculo){
        veiculo.limpa();
        if(veiculo.getTipoVeiculo()=='c'){
            lucro+=20;
        }else{
            lucro+=15;
        }
    }

    public void status(){
        System.out.println("LavaRapido " + this.nomeFantasia + " teve lucro de " + this.lucro);
    }
}