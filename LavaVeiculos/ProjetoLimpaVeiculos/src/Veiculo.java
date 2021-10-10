public class Veiculo {
    private char tipoVeiculo;//c para carga, ou p para passeio
    private boolean limpo;//1 para limpo, ou 0 para sujo

    public Veiculo(char tipoVeiculo){
        setTipoVeiculo(tipoVeiculo);
        limpa();
    }
    public char getTipoVeiculo(){
        return tipoVeiculo;
    }
    public void setTipoVeiculo(char tipoVeiculo){
        if(tipoVeiculo=='c' || tipoVeiculo=='p'){
          this.tipoVeiculo = tipoVeiculo;
        }else{
            this.tipoVeiculo='p';
            System.out.println("Erro: seu veiculo foi setado como passeio devido a nao especificao com c ou p");
        }
    }
    public void limpa(){
        this.limpo=true;
    }    
    public void suja(){
        this.limpo=false;
    }
    public void status(){
        String strTipoVeiculo = this.tipoVeiculo=='c'?"carga":"passeio";
        String strLimpo = this.limpo?"limpo":"sujo";
        System.out.println("O Veiculo eh de " + strTipoVeiculo + " e esta " + strLimpo);
    }  
}