package javacore.Oexception.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo...");
            System.out.println("Escrevendo dados no arquivo...");
            return "Conexão feita com sucesso";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO...");
        }
        return null;
    }
}
