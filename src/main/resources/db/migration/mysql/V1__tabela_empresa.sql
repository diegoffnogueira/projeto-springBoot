CREATE TABLE `empresa` (
`id` INT(10) NOT NULL,
`cnpj` VARCHAR(20) NOT NULL,
`data_atualizacao` DATETIME NOT NULL,
`data_criacao` DATETIME NOT NULL,
`razao_social` VARCHAR(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `empresa`
    ADD PRIMARY KEY (`id`);

ALTER TABLE `empresa`
    MODIFY `id` INT(10) NOT NULL AUTO_INCREMENT;