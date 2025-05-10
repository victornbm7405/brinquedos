#  API REST - Cadastro de Brinquedos

Este projeto foi desenvolvido como parte do Checkpoint 2 da disciplina de Programação com Persistência, utilizando Spring Boot e banco de dados Oracle.

---

##  Funcionalidades da API

- `POST /brinquedos` → Cadastra um novo brinquedo
- `GET /brinquedos` → Lista todos os brinquedos cadastrados
- `GET /brinquedos/{id}` → Consulta um brinquedo específico pelo ID

---

## 🧾 Exemplo de JSON (POST)

```json
{
    "nome": "peteca",
    "tipo": "pena de galinha",
    "classificacao": "7+",
    "tamanho": "media",
    "preco": 57
}
