# WE-WORK

Seja bem-vindo ao Tech Challenge FIAP - WE-WORK!

O objetivo deste projeto é criar um sistema de gestão de espaços compartilhados que permita aos usuários reservarem espaços de forma eficiente e conveniente. Inspirado no modelo de negócios da WeWork, o sistema visa oferecer uma plataforma intuitiva e integrada para a gestão de espaços, locações e perfis de usuários.

O sistema incluirá funcionalidades para:
  - Cadastro e gerenciamento de usuários, permitindo que eles criem perfis personalizados e acessem os espaços disponíveis.
  - Cadastro e gerenciamento de espaços, permitindo que os locatários cadastrem novos espaços, alterem suas características e os excluam conforme necessário.
  - Reserva de espaços, permitindo que os usuários reservem espaços disponíveis de acordo com suas necessidades.
  - Notificação automática aos locadores quando um espaço for reservado, garantindo que estejam cientes da presença dos usuários.
  - Notificação aos locatários para garantir que os pagamentos sejam processados de forma eficiente.


#### Este projeto está em fase de desenvolvimento!

Tecnologias Utilizadas:
  - Java 17;
  - Spring framework 3.2.5;
  - Spring Security;
  - H2;
  - Lombok
  
Links Úteis:
  - https://miro.com/welcomeonboard/cEc3SDhhaXJITFFXbmlQVWdxNm1jNW9xQVZVb1ZURUlsYkc5UndSYjlXUGxJUjRweVBzZzhVRmJCdUxneGs3T3wzNDU4NzY0NTg1NjQwMTU1NTA5fDI=?share_link_id=418132598250


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



