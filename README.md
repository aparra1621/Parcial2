# 🧾 Sistema de Registro de Usuarios (Parcial #2)

Este es un programa de consola en Java que permite gestionar el **registro de usuarios** con validación de datos utilizando **expresiones regulares** y siguiendo los principios de **Programación Orientada a Objetos (POO)**.

---

## 🎯 Objetivo

Registrar usuarios validando correctamente:
- Nombre completo
- Correo electrónico
- Contraseña segura

---

## 🧪 Validaciones aplicadas

| Campo       | Requisitos                                                                 |
|-------------|----------------------------------------------------------------------------|
| Nombre      | Solo letras y espacios. Debe tener **al menos dos palabras**              |
| Correo      | Formato válido: `usuario@dominio.com`                                      |
| Contraseña  | Mínimo 8 caracteres, **2 mayúsculas**, **3 minúsculas**, **1 número**, **1 carácter especial** |

---

## 📦 Estructura del proyecto

```bash
Parcial2/
├── Usuario.java              # Clase para almacenar los datos del usuario
├── Validador.java            # Contiene los métodos de validación con regex
├── RegistroUsuarioApp.java   # Clase principal con la lógica del programa
└── README.md
