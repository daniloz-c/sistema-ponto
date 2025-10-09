import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    static class Registro {
        String tipo; // "Entrada" ou "Saída"
        LocalDateTime horario;

        Registro(String tipo, LocalDateTime horario) {
            this.tipo = tipo;
            this.horario = horario;
        }

        @Override
        public String toString() {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            return tipo + ": " + horario.format(formato);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Mapa para armazenar registros por usuário
        Map<String, List<Registro>> registrosPorUsuario = new HashMap<>();

        while (true) { // Laço externo para reiniciar o programa desde o login
            // Login do usuário
            String usuario = "";
            boolean usuarioLogado = false;

            while (!usuarioLogado) {
                System.out.println("Digite o seu login:");
                usuario = scanner.nextLine();
                if (!usuario.isEmpty()) {
                    usuarioLogado = true;
                    System.out.println("Usuário " + usuario + " logado com sucesso.");
                    registrosPorUsuario.putIfAbsent(usuario, new ArrayList<>());
                } else {
                    System.out.println("Login inválido, tente novamente.");
                }
            }

            // Menu do usuário logado
            menuUsuario: while (true) {
                System.out.println("\nMENU DE PONTO - Usuário: " + usuario);
                System.out.println("1 - Apontar entrada");
                System.out.println("2 - Apontar saída");
                System.out.println("3 - Listar seus apontamentos");
                if (usuario.equalsIgnoreCase("admin")) {
                    System.out.println("4 - Listar todos os apontamentos");
                    System.out.println("5 - Voltar ao início (login)");
                    System.out.println("6 - Sair");
                } else {
                    System.out.println("4 - Voltar ao início (login)");
                    System.out.println("5 - Sair");
                }
                System.out.print("Escolha uma opção: ");

                int opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir quebra de linha

                if (usuario.equalsIgnoreCase("admin")) {
                    switch (opcao) {
                        case 1:
                            registrosPorUsuario.get(usuario).add(new Registro("Entrada", LocalDateTime.now()));
                            System.out.println("Entrada registrada em: " + LocalDateTime.now().format(formatoDataHora));
                            break;
                        case 2:
                            registrosPorUsuario.get(usuario).add(new Registro("Saída", LocalDateTime.now()));
                            System.out.println("Saída registrada em: " + LocalDateTime.now().format(formatoDataHora));
                            break;
                        case 3:
                            System.out.println("Seus apontamentos:");
                            listarRegistros(registrosPorUsuario.get(usuario));
                            break;
                        case 4:
                            System.out.println("Apontamentos de todos os usuários:");
                            for (String usr : registrosPorUsuario.keySet()) {
                                System.out.println("Usuário: " + usr);
                                listarRegistros(registrosPorUsuario.get(usr));
                            }
                            break;
                        case 5:
                            // Voltar ao início do programa (login)
                            System.out.println("Voltando ao início para novo login...");
                            break menuUsuario;
                        case 6:
                            System.out.println("Saindo do sistema...");
                            scanner.close();
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opção inválida, tente novamente.");
                    }
                } else {
                    switch (opcao) {
                        case 1:
                            registrosPorUsuario.get(usuario).add(new Registro("Entrada", LocalDateTime.now()));
                            System.out.println("Entrada registrada em: " + LocalDateTime.now().format(formatoDataHora));
                            break;
                        case 2:
                            registrosPorUsuario.get(usuario).add(new Registro("Saída", LocalDateTime.now()));
                            System.out.println("Saída registrada em: " + LocalDateTime.now().format(formatoDataHora));
                            break;
                        case 3:
                            System.out.println("Seus apontamentos:");
                            listarRegistros(registrosPorUsuario.get(usuario));
                            break;
                        case 4:
                            // Voltar ao início do programa (login)
                            System.out.println("Voltando ao início para novo login...");
                            break menuUsuario;
                        case 5:
                            System.out.println("Saindo do sistema...");
                            scanner.close();
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opção inválida, tente novamente.");
                    }
                }
            }
        }
    }

    private static void listarRegistros(List<Registro> registros) {
        if (registros.isEmpty()) {
            System.out.println("Nenhum apontamento registrado.");
        } else {
            for (Registro r : registros) {
                System.out.println(r);
            }
        }
    }
}
