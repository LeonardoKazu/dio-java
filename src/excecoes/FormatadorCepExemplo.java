package excecoes;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String formatado = formatarCep("2375664");
            System.out.println(formatado);
        } catch (CepInvalidoExcelption e) {
            System.out.println("O cep não corresponde com as regras de negocio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoExcelption{
        if(cep.length() != 8)
            throw new CepInvalidoExcelption();

        //Simulando um cep formatado
        return "23.765-064";
    }
}
