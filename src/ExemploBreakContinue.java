public class ExemploBreakContinue {
    public static void main(String[] args) {

        for(int i = 0; i <= 5; i++){
            if(i == 3) 
                //break sai da instrução
                //continue apenas pula para a proxima iteração
                continue;
            
            System.out.println(i);
        }

    }
}
