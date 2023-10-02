# README - API REST Spring Boot

## Descrizione generale

Questa applicazione è un'API REST sviluppata in Spring Boot che fornisce endpoint per l'esecuzione di operazioni CRUD (Create, Read, Update, Delete) su entità come "Autor", "Localidad" e "Persona". Implementa inoltre il sistema di controllo Hibernate Envers per tenere traccia delle revisioni nell'entità "Revision".

## Struttura delle cartelle

- `com.colmena.ejcolmenatec.config`: contiene una configurazione personalizzata, come `CustomRevisionListener`, utilizzata per il controllo delle revisioni.
- `com.colmena.ejcolmenatec.controllers`: contiene controller che gestiscono richieste e risposte HTTP.
- `com.colmena.ejcolmenatec.entities`: contiene classi di entità come "Autore", "Posizione", "Persona", ecc.
- `com.colmena.ejcolmenatec.repositories`: contiene le interfacce del repository per le entità.
- `com.colmena.ejcolmenatec.services`: contiene interfacce di servizio e implementazioni che gestiscono la logica aziendale.
- `resources`: contiene il file di configurazione del database (`application.properties`)

## Controllori

- `AutorController`, `LocalidadController`, `PersonaController`: controller che gestiscono le operazioni CRUD per le entità `Autor`, `Localidad` e `Persona`.

## Servizi

- `AutorServiceImpl`, `LocalidadServiceImpl`, `PersonaServiceImpl`: implementazioni del servizio che eseguono operazioni sulle entità corrispondenti.

## Controllo

- `Revision`: classe di entità che memorizza informazioni di revisione come data e ora.
- `CustomRevisionListener`: classe di configurazione che ascolta le revisioni delle entità ed esegue azioni personalizzate, se necessario.

## Banca dati

L'applicazione utilizza un database SQL in memoria con la console SQL abilitata per facilitare il debug e lo sviluppo. È possibile accedere alla console SQL all'indirizzo [http://localhost:8080/partial_prog3/](http://localhost:8080/partial_prog3/). La configurazione del database si trova in "application.properties".

## Documentazione API

L'API è documentata utilizzando Springdoc OpenAPI. È possibile accedere alla documentazione dell'API all'indirizzo [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html) una volta che l'applicazione è in esecuzione.

## Esecuzione dell'applicazione

Per eseguire l'applicazione, puoi utilizzare il metodo "main" nella classe "SpringbootApiRestApplication". Assicurati che il database sia configurato correttamente in "application.properties" prima di eseguire l'applicazione.

## Note aggiuntive

- L'applicazione utilizza le annotazioni Lombok per generare automaticamente getter, setter e altri metodi di accesso nelle classi di entità.
- Hibernate Envers viene utilizzato per verificare le revisioni delle entità, consentendo il monitoraggio delle modifiche dei dati nel tempo.

Questa è una panoramica di alto livello dell'applicazione API REST Spring Boot. Puoi esplorare singole classi e pacchetti per maggiori dettagli sull'implementazione e sulle funzionalità specifiche di ciascun componente.
