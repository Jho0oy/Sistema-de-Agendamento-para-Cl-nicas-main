import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static final ArrayList<Paciente> pacientes = new ArrayList<>();
    private static final ArrayList<Medico> medicos = new ArrayList<>();

    // Cores ANSI para deixar o console mais 'vivo'
    private static final String RESET = "\u001B[0m";
    private static final String CYAN = "\u001B[36m";
    private static final String PURPLE = "\u001B[35m";
    private static final String YELLOW = "\u001B[33m";
    private static final String GREEN = "\u001B[32m";
    private static final String RED = "\u001B[31m";
    private static final String BLUE = "\u001B[34m";

    // Limpa o console (funciona em terminais que suportam ANSI)
    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Imprime um cabeçalho bonito
    private static void printHeader() {
        System.out.println(CYAN + "===============================================" + RESET);
        System.out.println(PURPLE + "   Sistema de Agendamento - Clínica" + RESET);
        System.out.println(CYAN + "===============================================\n" + RESET);
    }

    private static String menuUfCrm ()
    {
        int escolha;

        do {
            System.out.println("\n" + YELLOW + "========== ESCOLHA A UFCRM ==========" + RESET); //menu de escolha de estados para o CRM
            System.out.println("1. Acre (AC)");
            System.out.println("2. Alagoas (AL)");
            System.out.println("3. Amapá (AP)");
            System.out.println("4. Amazonas (AM)");
            System.out.println("5. Bahia (BA)");
            System.out.println("6. Ceará (CE)");
            System.out.println("7. Espírito Santo (ES)");
            System.out.println("8. Goiás (GO)");
            System.out.println("9. Maranhão (MA)");
            System.out.println("10. Mato Grosso (MT)");
            System.out.println("11 Mato Grosso do Sul (MS)");
            System.out.println("12. Minas Gerais (MG)");
            System.out.println("13. Pará (PA)");
            System.out.println("14. Paraíba (PB)");
            System.out.println("15. Paraná (PR)");
            System.out.println("16. Pernambuco (PE)");
            System.out.println("17. Piauí (PI)");
            System.out.println("18. Rio de Janeiro (RJ)");
            System.out.println("19. Rio Grande do Norte (RN)");
            System.out.println("20. Rio Grande do Sul (RS)");
            System.out.println("21. Rondônia (RO)");
            System.out.println("22 Roraima (RR)");
            System.out.println("23. Santa Catarina (SC)");
            System.out.println("24. São Paulo (SP)");
            System.out.println("25. Sergipe (SE)");
            System.out.println("26. Tocantins (TO)");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (escolha) {
                case 1:
                    return "Acre (AC)";
                case 2:
                    return "Alagoas (AL)";
                case 3:
                    return "Amapá (AP)";
                case 4:
                    return "Amazonas (AM)";
                case 5:
                    return "Bahia (BA)";
                case 6:
                    return "Ceará (CE)";
                case 7:
                    return "Espírito Santo (ES)";
                case 8:
                    return "Goiás (GO)";
                case 9:
                    return "Maranhão (MA)";
                case 10:
                    return "Mato Grosso (MT)";
                case 11:
                    return "Mato Grosso do Sul (MS)";
                case 12:
                    return "Minas Gerais (MG)";
                case 13:
                    return "Pará (PA)";
                case 14:
                    return "Paraíba (PB)";
                case 15:
                    return "Paraná (PR)";
                case 16:
                    return "Pernambuco (PE)";
                case 17:
                    return "Piauí (PI)";
                case 18:
                    return "Rio de Janeiro (RJ)";
                case 19:
                    return "Rio Grande do Norte (RN)";
                case 20:
                    return "Rio Grande do Sul (RS)";
                case 21:
                    return "Rondônia (RO)";
                case 22:
                    return "Roraima (RR)";
                case 23:
                    return "Santa Catarina (SC)";
                case 24:
                    return "São Paulo (SP)";
                case 25:
                    return "Sergipe (SE)";
                case 26:
                    return "Tocantins (TO)";
                default:
                    System.out.println(RED + "Opção inválida! Digite uma opção do menu." + RESET);
            }
        } while (true);
    }

    private static String menuEspecialidades() {
        int escolha;

        do {
            System.out.println("\n" + YELLOW + "========== ESCOLHA A ESPECIALIDADE ==========" + RESET); // menu de escolha de especialidades médicas
            System.out.println("1. Cardiologia");
            System.out.println("2. Dermatologia");
            System.out.println("3. Endocrinologia");
            System.out.println("4. Ginecologia");
            System.out.println("5. Oftalmologia");
            System.out.println("6. Ortopedia");
            System.out.println("7. Pediatria");
            System.out.println("8. Clínica Geral");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (escolha) {
                case 1:
                    return "Cardiologia";
                case 2:
                    return "Dermatologia";
                case 3:
                    return "Endocrinologia";
                case 4:
                    return "Ginecologia";
                case 5:
                    return "Oftalmologia";
                case 6:
                    return "Ortopedia";
                case 7:
                    return "Pediatria";
                case 8:
                    return "Clínica Geral";
                default:
                    System.out.println("Opção inválida! Digite uma opção do menu.");
            }
        } while (true);
    }

    public static void main(String[] args) {
        int opcao;

        do {
            clearConsole();
            printHeader();
            System.out.println("\n" + YELLOW + "========== MENU ==========" + RESET); // menu principal do sistema
            System.out.println("1. Cadastrar Paciente");
            System.out.println("2. Listar pacientes cadastrados");
            System.out.println("3. Cadastrar Médico");
            System.out.println("4. Listar Médicos");
            System.out.println("5. Ver horários disponíveis");
            System.out.println("6. Agendar consulta");
            System.out.println("7. Ver consultas");
            System.out.println("8. Check-in");
            System.out.println("0 Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            if (opcao == 1) { //OPÇÃO PARA CADASTRAR PACIENTE
                String nome;
                do {
                    System.out.print("Nome do paciente: ");
                    nome = scanner.nextLine();

                    if (nome.isBlank()) {
                        System.out.println("O nome do paciente não pode ficar vazio!");
                    }
                } while (nome.isBlank());

                String cpf;
                do {
                    System.out.print("CPF (apenas numeros): ");
                    cpf = scanner.nextLine();

                    if (!cpf.matches("\\d{11}")) {
                        System.out.println("CPF inválido! Digite exatamente 11 números.");
                    }

                } while (!cpf.matches("\\d{11}"));

                    String telefone;

                do {
                    System.out.print("Telefone (Apenas números): ");
                    telefone = scanner.nextLine();

                    if (!telefone.matches("\\d{11}")) {
                        System.out.println("Telefone inválido! Digite exatamente 11 números.");
                    }

                } while (!telefone.matches("\\d{11}"));

                Paciente paciente = new Paciente(nome, cpf, telefone);

                pacientes.add(paciente);

                System.out.println(GREEN + "Paciente cadastrado com sucesso!" + RESET);
            }

            if (opcao == 2) { //OPÇÃO PARA VERIFICAR PACIENTE CADASTRADO
                System.out.print("Digite o CPF do paciente (apenas números): ");
                String cpfBusca = scanner.nextLine();

                boolean pacienteEncontrado = false;
                for (Paciente paciente : pacientes) {
                    if (paciente.getCpf().equals(cpfBusca)) {
                        System.out.println(GREEN + "Paciente encontrado!" + RESET);
                        System.out.println(GREEN + "Nome: " + paciente.getNome() + RESET);
                        System.out.println(GREEN + "CPF: " + paciente.getCpfFormatado() + RESET);
                        System.out.println(GREEN + "Telefone: " + paciente.getTelefoneFormatado() + RESET);
                        pacienteEncontrado = true;
                        break;
                    }
                }

                if (!pacienteEncontrado) {
                    System.out.println(RED + "Paciente não encontrado!" + RESET);
                }
            }

            if (opcao == 3) { //OPÇÃO PARA CADASTRAR MÉDICOS
                String nome;
                String crm;
                do {
                    System.out.print("Nome do médico: ");
                    nome = scanner.nextLine();

                    if (nome.isBlank()) {
                        System.out.println("O nome do médico não pode ficar vazio!");
                    }
                } while (nome.isBlank());

                do {
                    System.out.print("Número do CRM: ");
                    crm = scanner.nextLine();

                    if (!crm.matches("\\d{6}")) {
                        System.out.println(RED + "CRM inválido! Digite exatamente 6 números." + RESET);
                    }

                } while (!crm.matches("\\d{6}"));

                String ufCrm = menuUfCrm();
                String especialidade = menuEspecialidades();
                Medico medico = new Medico(nome, especialidade, crm, ufCrm);
                medicos.add(medico);

                System.out.println(GREEN + "Médico cadastrado com sucesso!" + RESET);
            }

            if (opcao == 4) { //OPÇÃO PARA LISTAR MÉDICOS CADASTRADOS
                System.out.println(YELLOW + "========== Lista de Médicos: ==========" + RESET);
                for (Medico medico : medicos) {
                    System.out.println(GREEN + " Nome:" + medico.getNome() + RESET);
                    System.out.println(GREEN + " Especialidade: " + medico.getEspecialidade() + RESET);
                    System.out.println(GREEN + " CRM: " + medico.getCrm() + " - " + medico.getUfCrm() + RESET);
                }
            }


        } while (opcao != 0);
        System.out.println(GREEN + "Saindo do sistema... Até logo! ;)" + RESET);

    }
}