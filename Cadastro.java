import java.time.LocalDateTime;
import java.util.*;

class Usuario {
    String nome;
    int idade;
    String estadoCivil;

    Usuario(String nome, int idade, String estadoCivil) {
        this.nome = nome;
        this.idade = idade;
        this.estadoCivil = estadoCivil;
    }
}

class Evento {
    String nome;
    String endereco;
    String categoria;
    LocalDateTime horario;
    String descricao;

    Evento(String nome, String endereco, String categoria, LocalDateTime horario, String descricao) {
        this.nome = nome;
        this.endereco = endereco;
        this.categoria = categoria;
        this.horario = horario;
        this.descricao = descricao;
    }
}

class Sistema {
    List<Usuario> usuarios = new ArrayList<>();
    List<Evento> eventos = new ArrayList<>();

    void cadastrarUsuario(String nome, int idade, String estadoCivil) {
        Usuario usuario = new Usuario(nome, idade, estadoCivil);
        usuarios.add(usuario);
    }

    void cadastrarEvento(String nome, String endereco, String categoria, LocalDateTime horario, String descricao) {
        Evento evento = new Evento(nome, endereco, categoria, horario, descricao);
        eventos.add(evento);
    }
}

public class Cadastro {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para cadastrar suas informações
        System.out.println("Digite o seu nome:");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        System.out.println("Digite o seu estado civil:");
        String estadoCivil = scanner.nextLine();

        // Cadastra o usuário
        sistema.cadastrarUsuario(nomeUsuario, idade, estadoCivil);

        // Solicita ao usuário para cadastrar um evento
        System.out.println("Digite o nome do evento:");
        String nomeEvento = scanner.nextLine();

        System.out.println("Digite o endereço do evento:");
        String endereco = scanner.nextLine();

        System.out.println("Digite a categoria do evento:");
        String categoria = scanner.nextLine();

        System.out.println("Digite o horário do evento no formato YYYY-MM-DDTHH:MM:SS (por exemplo, 2022-12-31T23:59:59):");
        String horarioStr = scanner.nextLine().trim();  // Adiciona .trim() para remover espaços em branco extras
        LocalDateTime horario = LocalDateTime.parse(horarioStr);
           
           
                
        System.out.println("Digite a descrição do evento:");
        String descricao = scanner.nextLine();

        // Cadastra o evento
        sistema.cadastrarEvento(nomeEvento, endereco, categoria, horario, descricao);

        // Imprime os detalhes do usuário cadastrado
        Usuario usuario = sistema.usuarios.get(0);
        System.out.println("Usuário cadastrado com sucesso!");
        System.out.println("Nome: " + usuario.nome);
        System.out.println("Idade: " + usuario.idade);
        System.out.println("Estado Civil: " + usuario.estadoCivil);

        // Imprime os detalhes do evento cadastrado
        Evento evento = sistema.eventos.get(0);
        System.out.println("Evento cadastrado com sucesso!");
        System.out.println("Nome: " + evento.nome);
        System.out.println("Endereço: " + evento.endereco);
        System.out.println("Categoria: " + evento.categoria);
        System.out.println("Horário: " + evento.horario);
        System.out.println("Descrição: " + evento.descricao);
    }
}
