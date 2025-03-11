package utils;

public class Texts {
    // Retorna métodos que trazem textos prontos para serem usados em outras classes
    // Como Menus, mensagens de erro, etc.

    // TEXTOS FRENTE DE LOJA - OPÇÕES MAIS SIMPLES
    public String menuPrincipal() {
        String menuApresentacao = """
                --------Gerenciador de Veiculos---------
                [1] - Frente de Loja
                [2] - Administracao de Cadastro
                [3] - Sair
                ---------------------------------------
                """;
        return menuApresentacao;
    }   
// ------------------------OPCAO 1 - FRENTE DE LOJA -----------------------------------------------------
    public String menuFrenteDeLoja() {
        String menuFrenteDeLoja = """
                --------Frente de Loja---------
                [1] - Localizar Veiculos
                [2] - Gerenciar Loja
                [3] - Consultar Vendedor
                [4] - Gerenciar Cliente
                [5] - Gerenciar Vendas
                [6] - Voltar
               ---------------------------------------
                """;
        return menuFrenteDeLoja;
    }

    public String menuGerenciarVeiculos() {
        String menuGerenciarVeiculos = """
                --------Gerenciar Veiculos---------
                [1] - Consultar Veículo por Placa
                [2] - Voltar
                ---------------------------------------
                """;
        return menuGerenciarVeiculos;
    }

    public String menuGerenciarLoja(){
        String menuGerenciarLoja = """
                --------Gerenciar Loja---------
                [1] - Listar Veículos Disponíveis na Loja
                [2] - Listar Vendedores na Loja
                [3] - Voltar 
                ---------------------------------------
                """;
        return menuGerenciarLoja;
    }

    public String menuGerenciarVendedor(){
        String menuGerenciarVendedor = """
                --------Gerenciar Vendedor---------
                [1] - Consultar Vendedor 
                [2] - Voltar
                ---------------------------------------
                """;
        return menuGerenciarVendedor;
    }

    public String menuGerenciarCliente(){
        String menuGerenciarCliente = """
                --------Gerenciar Cliente--------- 
                [1] - Consultar Cliente por CPF
                [2] - Voltar
                ---------------------------------------
                """;
        return menuGerenciarCliente;    
    }

    public String menuGerenciarVendas(){
        String menuGerenciarVendas = """
                --------Gerenciar Vendas---------
                [1] - Cadastrar Venda
                [2] - Voltar 
                ---------------------------------------
                """;
        return menuGerenciarVendas;
    }

// TEXTOS ADMINISTRAÇÃO DE CADASTRO - OPÇÕES MAIS COMPLEXAS -----------------------------------------------------
 
    public String menuAdministracaoCadastro() {
        String menuAdministracaoCadastro = """
                --------Administracao de Cadastro---------
                [1] - Gerenciar Veiculos
                [2] - Gerenciar Loja
                [3] - Gerenciar Vendedor
                [4] - Gerenciar Cliente
                [5] - Gerenciar Vendas
                [6] - Voltar
                ---------------------------------------
                """;
        return menuAdministracaoCadastro;
    }

    public String menuGerenciarVeiculosAdmin(){
        String menuAdminGerenciarVeiculos = """
                --------Gerenciar Veiculos---------
                [1] - Cadastrar Veículo
                [2] - Excluir Veículo
                [3] - Alterar Dados do Veículo
                [4] - Listar Veículos
                [5] - Voltar
                ---------------------------------------
                """;
        return menuAdminGerenciarVeiculos;
    }

    public String menuGerenciarLojaAdmin(){
        String menuAdminGerenciarLoja = """
                --------Gerenciar Loja---------
                [1] - Alterar Dados da Loja
                [2] - Associar Vendedor à Loja
                [3] - Voltar
                ---------------------------------------
                """;
        return menuAdminGerenciarLoja;
    }

    public String menuGerenciarVendedorAdmin(){
        String menuAdminGerenciarVendedor = """
                --------Gerenciar Vendedor---------
                [1] - Cadastrar Vendedor
                [2] - Excluir Vendedor
                [3] - Alterar Dados do Vendedor
                [4] - Voltar
                ---------------------------------------
                """;
        return menuAdminGerenciarVendedor;
    }

    public String menuGerenciarClienteAdmin(){
        String menuAdminGerenciarCliente = """
                --------Gerenciar Cliente---------
                [1] - Cadastrar
                [2] - Excluir Cliente
                [3] - Alterar Dados do Cliente
                [4] - Voltar
                ---------------------------------------
                """;
        return menuAdminGerenciarCliente;
    }

    public String menuGerenciadorVendaAdmin(){
        String menuAdminGerenciarVenda = """
                --------Gerenciar Venda---------
                [1] - Cadastrar Venda
                [2] - Alterar Dados da Venda
                [3] - Voltar
                ---------------------------------------
                """;
        return menuAdminGerenciarVenda;
    }

}


