CREATE DATABASE Acesso_Senha;
USE Acesso_Senha;

	CREATE TABLE Dados_Senha ( 
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    Nome VARCHAR(60) NOT NULL,
    Login VARCHAR(60) NOT NULL,
    Senha VARCHAR(20) NOT NULL,
    Data_Castrado DATE );
 select*from Dados_Senha;   
DELETE FROM Dados_Senha WHERE id = 13;