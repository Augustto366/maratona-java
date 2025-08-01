package javacore.Exercicios.dominio.gerenciamentoFuncionarios.dominio;

public enum Cargo {
    AUX_ADM("Auxiliar Administrativo"),
    GERENTE("Gerente"),
    ;

    private final String cargo;

    Cargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}
