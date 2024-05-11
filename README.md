# WE-WORK

Seja bem-vindo ao Tech Challenge FIAP - WE-WORK!

Gerencie seus eventos, salas e reservas com facilidade e eficiência com nosso sistema WE-WORK. Uma plataforma completa para.

Gerenciamento de Eventos: 
  - Crie, edite e visualize eventos com todos os detalhes, incluindo local, data, hora, palestrantes e inscrições.
    
Gerenciamento de Salas: 
  - Cadastre, visualize e gerencie suas salas, anfiteatros e espaços para locação. Inclua fotos, descrições detalhadas e defina horários de disponibilidade.
    
Sistema de Reservas: 
  - Permita que os usuários reservem salas para seus eventos de forma online, automatizando o processo e evitando conflitos.

Painel Administrativo:
  - Acesse um painel completo com relatórios, estatísticas e ferramentas para gerenciar seus eventos, salas e reservas.

Funcionalidades Adicionais:
  - Envie convites e lembretes para os participantes dos eventos.

#### Este projeto está em fase de desenvolvimento e buscamos a colaboração da comunidade para aprimorá-lo. Se você tem conhecimentos em desenvolvimento web, design ou UX, junte-se a nós!

Tecnologias Utilizadas:
  - Java 11;
  - Spring framework
  - Lombok
  - Azure
  - H2
  
Links Úteis:
  - [Inserir aqui links do MIRO, etc.]


Junte-se à comunidade Tech Challenge FIAP e torne o WE-WORK a melhor plataforma de gerenciamento de eventos, salas e reservas!

## Payload ###

#### Autenticação #### 
```console
curl --location 'http://localhost:8080/auth/login' \
--header 'Content-Type: application/json' \
--data-raw '{
    "email": "bruno@email.com",
    "password": "123456" 
}'
```



