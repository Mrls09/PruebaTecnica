# Sistema de Consultas Médicas - Backend

Este proyecto es la API REST para un sistema de gestión de consultas médicas desarrollado con Spring Boot.

## Características

- Gestión de médicos (CRUD completo)
- Gestión de pacientes (CRUD completo)
- Agendamiento de citas médicas
- Registro de consultas médicas (diagnóstico y tratamiento)
- Consulta de historial médico por paciente
- Consulta de historial de atenciones por médico

## Tecnologías utilizadas

- Java 8
- Spring Boot
- MyBatis
- Oracle Database
- RESTful API

## Estructura del proyecto

controller/ Controladores REST 
entity/ Clases de dominio 
mapper/ Interfaces de MyBatis para acceso a datos 
service/ Servicios de negocio 
utils/ Clases utilitarias 
resources/mapper/ Archivos XML de mapeo para MyBatis


## Requisitos

- JDK 8 o superior
- Maven
- Oracle Database


## Endpoints 

# Médicos

GET /doctor/get-all : Obtener todos los médicos

GET /doctor/{id} : Obtener un médico por ID

POST /doctor/create : Crear un nuevo médico

PUT /doctor/update/{id} : Actualizar un médico existente

DELETE /doctor/delete/{id} : Eliminar un médico

# Pacientes

GET /patient/get-all : Obtener todos los pacientes

GET /patient/{id} : Obtener un paciente por ID

POST /patient/create : Crear un nuevo paciente

PUT /patient/update/{id} : Actualizar un paciente existente

DELETE /patient/delete/{id} : Eliminar un paciente

# Citas Médicas

GET /appointment/get-all : Obtener todas las citas

GET /appointment/{id} : Obtener una cita por ID

POST /appointment/create : Crear una nueva cita

PUT /appointment/update/{id} : Actualizar una cita existente

DELETE /appointment/delete/{id} : Eliminar una cita

# Historial Médico

GET /medical-record/get-all : Obtener todos los registros médicos

GET /medical-record/{id} : Obtener un registro médico por ID

GET /medical-record/patient/{patientId} : Obtener historial médico de un paciente

GET /medical-record/doctor/{doctorId} : Obtener historial de consultas de un médico

POST /medical-record/create : Crear un nuevo registro médico

PUT /medical-record/update/{id} : Actualizar un registro médico existente

DELETE /medical-record/delete/{id} : Eliminar un registro médico
