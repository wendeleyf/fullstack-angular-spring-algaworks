CREATE TABLE pessoa (
    codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    logradouro VARCHAR(100),
    numero VARCHAR(8),
    complemento VARCHAR(200),
    bairro VARCHAR(50),
    cep VARCHAR(10),
    cidade VARCHAR(50),
    estado VARCHAR(20),
    ativo BOOLEAN NOT NULL
);

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES ('Wendeley','Rua Maria Aparecida Neiva Gouveia', '72', 'Apto 701', 'Jardim Oceania', '58037267', 'João Pessoa',
        'Paraíba', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES ('Tatiana','Rua Maria Aparecida Neiva Gouveia', '72', 'Apto 701', 'Jardim Oceania', '58037267', 'João Pessoa',
        'Paraíba', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES ('João','Rua 123', '01', 'Em frente à rua 321', 'Bairro Fictício', '58111111', 'São Paulo',
        'São Paulo', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES ('Maria da Silva','Rua Maria Aparecida Neiva Gouveia', '72', 'Apto 701', 'Jardim Oceania', '58037267', 'João Pessoa',
        'Paraíba', false);