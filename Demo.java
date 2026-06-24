import javax.swing.*;

public class Demo {

    public static void main(String[] args) {
        int opc = 0;

        do {
           opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha a opção:\n"
                            + "0 = sair\n"
                            + "1 = O Cliente possui contrato\n"
                            + "2 = O Cliente não possui contrato\n"
            ));
            switch (opc) {
                case 1: {
                    // Menu para clientes com contrato
                    String resposta = JOptionPane.showInputDialog(
                            "Escolha o modelo:\n"
                                    + "0 = voltar\n"
                                    + "A = Corolla\n"
                                    + "B = Audi\n"
                    );
                    switch (resposta.toUpperCase()) {
                        case "A": {
                            // Cliente escolheu Corolla
                            System.out.println("Corolla selecionado");
                            Custumer cliente = new Custumer("A", true);
                             Factory factory = getClass(cliente);
                            Car car = factory.creat(cliente.getGradeResquest());
                             car.startEndine();
                            break;
                        }
                        case "B": {
                            // Cliente escolheu Audi
                            System.out.println("Audi selecionado");
                            Custumer cliente = new Custumer("B", true);
                            Factory factory = getClass(cliente);
                            Car car = factory.creat(cliente.getGradeResquest());
                            car.startEndine();
                            break;
                        }
                        case "0": {
                            System.out.println("Voltando ao menu principal");
                            break;
                        }
                        default: {
                            System.out.println("Opção inválida!");
                            break;
                        }
                    }
                    break;
                }

                case 2: {
                    // Menu para clientes sem contrato
                    String resposta = JOptionPane.showInputDialog(
                            "Escolha o modelo:\n"
                                    + "0 = voltar\n"
                                    + "A = Creta\n"
                                    + "B = Nivus\n"
                    );
                    switch (resposta.toUpperCase()) {
                        case "A": {
                            // Cliente escolheu Creta
                            System.out.println("Corolla selecionado");
                            Custumer cliente = new Custumer("A", false);
                            Factory factory = getClass(cliente);
                            Car car = factory.creat(cliente.getGradeResquest());
                            car.startEndine();
                            break;
                        }
                        case "B": {
                            // Cliente escolheu Nivus
                            System.out.println("Audi selecionado");
                            Custumer cliente = new Custumer("B", false);
                            Factory factory = getClass(cliente);
                            Car car = factory.creat(cliente.getGradeResquest());
                            car.startEndine();
                            break;
                        }
                        case "0": {
                            System.out.println("Voltando ao menu principal");
                            break;
                        }
                        default: {
                            System.out.println("Opção inválida!");
                            break;
                        }
                    }
                    break;
                }


                case 0: {
                    System.out.println("Saindo do sistema");
                    break;
                }

                default: {
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
                    break;
                }
            }

        } while (opc != 0);

        System.out.println("Programa finalizado!");
    }
    private static Factory getClass(Custumer cliente) {
        if (cliente.HasCompanyContract()){
            return new ContratosFactory();
        } else {
            return new SemContratosFactory();
        }
    }
}
