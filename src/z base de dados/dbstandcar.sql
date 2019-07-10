-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 10-Jul-2019 às 18:02
-- Versão do servidor: 10.1.31-MariaDB
-- PHP Version: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbstandcar`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluger`
--

CREATE TABLE `aluger` (
  `id_aluger` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `id_automovel` int(11) NOT NULL,
  `valor_aluguer` float NOT NULL,
  `data_inicio` date NOT NULL,
  `data_termino` date NOT NULL,
  `hora_termino` varchar(25) NOT NULL,
  `veiculo` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `aluger`
--

INSERT INTO `aluger` (`id_aluger`, `id_cliente`, `id_automovel`, `valor_aluguer`, `data_inicio`, `data_termino`, `hora_termino`, `veiculo`) VALUES
(10, 30, 17, 1223, '2019-06-19', '2019-06-28', '15:17:00', 'Devolvido'),
(11, 29, 17, 10723, '2019-06-30', '2019-07-05', '15:17:00', 'Devolvido'),
(14, 29, 16, 2700, '2019-06-30', '2019-07-01', '16:41', 'Devolvido'),
(15, 31, 4, 1050000, '2019-07-02', '2019-07-03', '12:31', 'Devolvido'),
(16, 34, 4, 2800000, '2019-07-03', '2019-07-05', '13:40', 'Devolvido'),
(17, 29, 3, 2000000, '2019-07-05', '2019-07-09', '17:10', 'Devolvido');

-- --------------------------------------------------------

--
-- Estrutura da tabela `automovel`
--

CREATE TABLE `automovel` (
  `id_automovel` int(11) NOT NULL,
  `modelo` varchar(25) NOT NULL,
  `marca` varchar(25) NOT NULL,
  `matricula` varchar(10) NOT NULL,
  `fornecedor` varchar(11) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `combustivel` varchar(11) NOT NULL,
  `numero_de_assento` int(11) NOT NULL,
  `ano` year(4) NOT NULL,
  `cor` varchar(35) NOT NULL,
  `preco` double NOT NULL,
  `categoria_servico` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `automovel`
--

INSERT INTO `automovel` (`id_automovel`, `modelo`, `marca`, `matricula`, `fornecedor`, `estado`, `combustivel`, `numero_de_assento`, `ano`, `cor`, `preco`, `categoria_servico`) VALUES
(3, 'SQ 262', 'AUDIU', 'STP 56-65', 'FIA', 1, 'Gasolina', 4, 2019, 'LARANJA', 500000, 'Aluguer'),
(4, 'SW 245', 'TOYTA', 'STP 54-42', 'CEFAO', 1, 'Gasólina', 2, 2019, 'PRETA', 350000, 'Aluguer'),
(5, 'KP 6373', 'AUDIU', 'STP 34-34', 'FIA', 1, 'Gasólina', 4, 2019, 'PRETA', 600000, 'Venda'),
(10, 'WQ 324', 'MERCEDEZ', 'STP 89-89', 'FIA', 1, 'Gasóleo', 4, 2019, 'PRETA', 189000, 'Venda'),
(15, 'H600', 'NISSAN', 'STP 78-32', 'CFAO MOTORS', 1, 'Gasólina', 4, 2019, 'Vermelha', 1000, 'Aluguer'),
(16, 'FR435J', 'ILUXE', 'STP 34-23', 'CFAO', 1, 'Gasóleo', 4, 2019, 'VERDE', 900, 'Aluguer'),
(17, 'FR5325', 'ILUXE', 'STP 24-28', 'CFAO', 1, 'Gasólina', 6, 2019, 'BRANCA', 9500, 'Aluguer'),
(18, 'KX300', 'Honda', 'STP 65-09', 'CFAO MOTORS', 0, 'Gasolina', 4, 2019, 'Verde', 350000, 'Venda'),
(19, 'MH 276', 'MITSUBITHI', 'STP 28-90', 'CFAO MOTORS', 1, 'Gasólina', 5, 2019, 'BRANCA', 300000, 'Venda'),
(20, 'RV678', 'TOYTA', 'STP 19-52', 'CEFAO', 0, 'Gasólina', 4, 2019, 'Branca', 240000, 'Venda');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `contacto` int(11) NOT NULL,
  `nacionalidade` varchar(45) NOT NULL,
  `tipo_documento` varchar(25) NOT NULL,
  `numero_documento` varchar(11) NOT NULL,
  `distrito` varchar(25) NOT NULL,
  `morada` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `nome`, `sexo`, `contacto`, `nacionalidade`, `tipo_documento`, `numero_documento`, `distrito`, `morada`) VALUES
(29, 'Jose Alves', 'Masculino', 9875643, 'Angolano', 'Bilhete de Identidade', '876543', 'Água Grande', 'Boa Morte'),
(30, 'Josias Barreto', 'Masculino', 9956624, 'Santomense', 'Bilhete de Identidade', '141487', 'Lobata', 'Mesquita'),
(31, 'Ana Tomé', 'Feminino', 2226512, 'Santomense', 'Bilhete de Identidade', '328614', 'Mé-zochi', 'Guêba'),
(32, 'Pedro Dias', 'Masculino', 9876354, 'Santomense', 'Bilhete de Identidade', '634859', 'Água Grande', 'Boa Morte'),
(33, 'Sandro Afonso', 'Masculino', 9876352, 'Santomense', 'Bilhete de Identidade', '142546', 'Mé-zochi', 'Pema Pema'),
(34, 'Edilson Manuel', 'Masculino', 9991812, 'Santomense', 'Passaporte', 'S765423', 'Água Grande', 'Madre Deus'),
(35, 'lklxc', 'Masculino', 1234567, 'Santomense', 'Bilhete de Identidade', '123456', 'Água Grande', 'kjf'),
(36, 'Santos Abreu', 'Masculino', 2224356, 'Santomense', 'Bilhete de Identidade', '345672', 'Lobata', 'mesquita');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `id_funcionario` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `sexo` varchar(11) NOT NULL,
  `contacto` int(11) NOT NULL,
  `nacionalidade` varchar(45) DEFAULT NULL,
  `distrito` varchar(20) NOT NULL,
  `morada` varchar(27) DEFAULT NULL,
  `cargo` varchar(30) DEFAULT NULL,
  `tipo_documento` varchar(27) DEFAULT NULL,
  `numero_documento` varchar(24) NOT NULL,
  `data_nascimento` varchar(24) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`id_funcionario`, `nome`, `sexo`, `contacto`, `nacionalidade`, `distrito`, `morada`, `cargo`, `tipo_documento`, `numero_documento`, `data_nascimento`) VALUES
(39, 'Wiliam Trindade', 'Masculino', 9874563, 'Santomense', 'Água Grande', 'Boa Morte', 'Recepcionista', 'Bilhete de Identidade', '1425615', '1998/02/02'),
(40, 'Josias Tavares', 'Masculino', 9945952, 'Santomense', 'Agua Grande', 'Bairro Hospital', 'Recepcionista', 'Bilhete de Indentidade', '908790', '2019-05-01'),
(41, 'Carlos Afonso', 'Masculino', 2228762, 'Santomense', 'Cantagalo', 'Bairro Hospital', 'Recepcionista', 'Bilhete de Indentidade', '131422', '2019-05-14'),
(42, 'Bela Sanchês', 'Feminino', 9827654, 'Santomense', 'Lobata', 'Mesquita', 'Secretária', 'Passaporte', 'S234151', '1998/09/09'),
(43, 'kedson dosanjos', 'Masculino', 9986058, 'Santomense', 'Água Grande', 'palha', 'Recepcionista', 'Bilhete de Identidade', '1234567', '1993/02/05'),
(44, 'Pedro Tomas', 'Masculino', 2226736, 'Santomense', 'Água Grande', 'Bairro Hospital', 'Mecanico de Manutenção', 'Bilhete de Identidade', '536281', '1998/02/08');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `nome` varchar(20) NOT NULL,
  `senha` varchar(10) NOT NULL,
  `id_funcionario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `nome`, `senha`, `id_funcionario`) VALUES
(3, 'Admin', 'admin', 41),
(5, 'Josias Barreto', 'java1234', 40);

-- --------------------------------------------------------

--
-- Estrutura da tabela `venda`
--

CREATE TABLE `venda` (
  `id_venda` int(11) NOT NULL,
  `id_automovel` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `tipo_pagamento` varchar(15) NOT NULL,
  `descontos` varchar(7) NOT NULL,
  `valor_venda` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `venda`
--

INSERT INTO `venda` (`id_venda`, `id_automovel`, `id_cliente`, `tipo_pagamento`, `descontos`, `valor_venda`) VALUES
(1, 18, 34, 'À Dinheiro', '10%', 315000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `aluger`
--
ALTER TABLE `aluger`
  ADD PRIMARY KEY (`id_aluger`),
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `id_automovel` (`id_automovel`);

--
-- Indexes for table `automovel`
--
ALTER TABLE `automovel`
  ADD PRIMARY KEY (`id_automovel`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`),
  ADD UNIQUE KEY `numero_documento` (`numero_documento`),
  ADD UNIQUE KEY `contacto` (`contacto`);

--
-- Indexes for table `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`id_funcionario`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`),
  ADD UNIQUE KEY `nome` (`nome`,`senha`),
  ADD UNIQUE KEY `nome_2` (`nome`,`senha`),
  ADD UNIQUE KEY `id_funcionario_2` (`id_funcionario`),
  ADD KEY `id_funcionario` (`id_funcionario`);

--
-- Indexes for table `venda`
--
ALTER TABLE `venda`
  ADD PRIMARY KEY (`id_venda`),
  ADD KEY `id_automovel` (`id_automovel`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `aluger`
--
ALTER TABLE `aluger`
  MODIFY `id_aluger` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `automovel`
--
ALTER TABLE `automovel`
  MODIFY `id_automovel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT for table `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `id_funcionario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `venda`
--
ALTER TABLE `venda`
  MODIFY `id_venda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `aluger`
--
ALTER TABLE `aluger`
  ADD CONSTRAINT `aluger_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`),
  ADD CONSTRAINT `aluger_ibfk_2` FOREIGN KEY (`id_automovel`) REFERENCES `automovel` (`id_automovel`);

--
-- Limitadores para a tabela `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`id_funcionario`) REFERENCES `funcionario` (`id_funcionario`);

--
-- Limitadores para a tabela `venda`
--
ALTER TABLE `venda`
  ADD CONSTRAINT `venda_ibfk_1` FOREIGN KEY (`id_automovel`) REFERENCES `automovel` (`id_automovel`),
  ADD CONSTRAINT `venda_ibfk_2` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
