
---

# Project Name: PowerBI-like Microservices Platform

![Project Logo](./full-version/public/logo.png)

## Table of Contents

- [Overview](#overview)
- [Architecture](#architecture)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Database Setup](#database-setup)
- [Microservices](#microservices)
- [Installation](#installation)
- [Usage](#usage)
- [API Documentation](#api-documentation)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Overview

**PowerBI-like Microservices Platform** is an implementation of a business intelligence (BI) solution (close to Power BI) which offers society SPE a synthesized view of the performance of the company through dynamique creation of indicators, dashboards, detailed reports and multidimensional data analysis. This project mimics the functionality of PowerBI, providing advanced data analytics, visualization, and reporting capabilities in a microservices architecture.

## Architecture

![Architecture Diagram](./arch_micro.png)

This project follows a microservices architecture (Microservices implementation — Netflix stack), designed for scalability, flexibility, and robustness. The system is composed of the following core components:

- **Frontend**: Vue Js
- **Backend Services**: Multiple microservices with Spring Boot, each responsible for specific functionalities(auth ,query optimization....).
- **Databases**: 
  - **PostgreSQL**: Data warehouse for complex analytics.
  - **MySQL**: Core database to support the main application functionality.
  - **MongoDB**: Used for caching to improve performance and reduce latency.

## Features

- **Data Analytics**: Provides powerful analytics capabilities, enabling users to gain insights from large datasets. Offers tools for performing descriptive, diagnostic, predictive, and prescriptive analytics to help businesses make data-driven decisions.
- **Customizable Dashboards**: Empowers users to design personalized dashboards by adding, removing, or rearranging widgets such as charts, graphs, and tables. Supports various visualization types and filters to tailor dashboards to specific needs or preferences.
- **Real-time Data Processing**: Delivers real-time data processing to ensure users have access to the most up-to-date information. This includes streaming data analytics, live dashboards, and immediate updates for critical metrics, helping teams act quickly.
- **User Management**: eatures a comprehensive user management system that includes role-based access control (RBAC), authentication mechanisms (e.g., OAuth, LDAP), and user activity tracking. Ensures data security and tailored access for different organizational roles.
- **Report Generation**: Simplifies the creation of detailed reports with customizable templates and export options (e.g., PDF, Excel, CSV). Users can schedule automated report generation and delivery or generate them on-demand based on their chosen parameters.

## Technologies Used

- **Frontend**: [Vue.js, React, etc.]
- **Backend**: [Node.js, Python, etc.]
- **Database**: PostgreSQL, MySQL, MongoDB
- **Caching**: [Redis, MongoDB]
- **Messaging**: [Kafka, RabbitMQ, etc.]
- **Containerization**: Docker, Kubernetes
- **APIs**: REST, GraphQL

## Database Setup

### PostgreSQL (Data Warehouse)

- **Host**: `your-postgresql-host`
- **Port**: `5432`
- **Username**: `your-username`
- **Password**: `your-password`
- **Database**: `your-database-name`

### MySQL (Application Database)

- **Host**: `your-mysql-host`
- **Port**: `3306`
- **Username**: `your-username`
- **Password**: `your-password`
- **Database**: `your-database-name`

### MongoDB (Caching)

- **Host**: `your-mongodb-host`
- **Port**: `27017`
- **Username**: `your-username`
- **Password**: `your-password`
- **Database**: `your-database-name`

## Microservices

### 1. **User Service**

Handles user authentication, authorization, and management.

- **Language**: [e.g., Node.js, Python]
- **Port**: `3001`
- **Endpoints**: `/api/users`

### 2. **Data Service**

Manages data fetching, transformation, and processing.

- **Language**: [e.g., Python, Go]
- **Port**: `3002`
- **Endpoints**: `/api/data`

### 3. **Report Service**

Generates reports based on user-defined criteria.

- **Language**: [e.g., Java, Node.js]
- **Port**: `3003`
- **Endpoints**: `/api/reports`

### [Add more microservices as needed]

## Installation

### Prerequisites

- **Docker**: [Installation guide](https://docs.docker.com/get-docker/)
- **Docker Compose**: [Installation guide](https://docs.docker.com/compose/install/)
- **Node.js**: [Installation guide](https://nodejs.org/)

### Steps

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/your-repo-name.git
    cd your-repo-name
    ```

2. Configure environment variables for each microservice. See `.env.example` for a template.

3. Start the services using Docker Compose:

    ```bash
    docker-compose up --build
    ```

4. Access the application at `http://localhost:3000`.

## Usage

1. **Login**: Access the login page and enter your credentials.
2. **Dashboard**: Navigate to the dashboard to view your data and reports.
3. **Data Upload**: Upload data files or connect to data sources.
4. **Generate Reports**: Use the report service to create custom reports.

## API Documentation

API documentation is available [here](./path-to-api-docs.md) or can be accessed via Swagger UI at `http://localhost:3000/api-docs`.

## Contributing

1. Fork the repository.
2. Create a new branch: `git checkout -b feature/your-feature-name`
3. Commit your changes: `git commit -m 'Add some feature'`
4. Push to the branch: `git push origin feature/your-feature-name`
5. Submit a pull request.

## License

This project is licensed under the [MIT License](./LICENSE).

## Contact

- **Project Maintainer**: [Your Name](mailto:your-email@example.com)
- **GitHub Issues**: [Issue Tracker](https://github.com/your-username/your-repo-name/issues)

---

Feel free to modify this template according to your project's needs! If you need more specific sections or details, just let me know.

# solution_BI_ELIT
 microservices BI solution
 ![char1](https://github.com/islemmohamed/solution_BI_ELIT/blob/main/login.png)
 ![char1](https://github.com/islemmohamed/solution_BI_ELIT/blob/main/login%20chargement.png)
 ![char1](https://github.com/islemmohamed/solution_BI_ELIT/blob/main/dashboard.png)
 ![char1](https://github.com/islemmohamed/solution_BI_ELIT/blob/main/query%20creator.png)
 ![char1](https://github.com/islemmohamed/solution_BI_ELIT/blob/main/query%20creator%202.png)
 ![char1](https://github.com/islemmohamed/solution_BI_ELIT/blob/main/query%20creator%203.png)
 ![char1](https://github.com/islemmohamed/solution_BI_ELIT/blob/main/query%20creator%204.png)
 ![char1](https://github.com/islemmohamed/solution_BI_ELIT/blob/main/query%20creator%20after%20done.png)
 ![char1](https://github.com/islemmohamed/solution_BI_ELIT/blob/main/create%20chart.png)
 ![char1](https://github.com/islemmohamed/solution_BI_ELIT/blob/main/chart%201.png)
 ![char1](https://github.com/islemmohamed/solution_BI_ELIT/blob/main/chart%202.png)
 ![char1](https://github.com/islemmohamed/solution_BI_ELIT/blob/main/chart%203.png)
 ![char1](https://github.com/islemmohamed/solution_BI_ELIT/blob/main/export%20excel.png)
 ![char1](https://github.com/islemmohamed/solution_BI_ELIT/blob/main/query%20saver.png)
 ![char1](https://github.com/islemmohamed/solution_BI_ELIT/blob/main/partage%20query.png)
 ![char1](https://github.com/islemmohamed/solution_BI_ELIT/blob/main/insert%20query%20into%20report.png)
 ![char1](https://github.com/islemmohamed/solution_BI_ELIT/blob/main/report%20saver.png)
 ![char1](https://github.com/islemmohamed/solution_BI_ELIT/blob/main/create%20rapport.png)
 ![char1](https://github.com/islemmohamed/solution_BI_ELIT/blob/main/import%20Excel.png)
 ![char1](https://github.com/islemmohamed/solution_BI_ELIT/blob/main/user%20settings.png)
 ![char1](https://github.com/islemmohamed/solution_BI_ELIT/blob/main/edit%20delete%20user.png)
 ![char1](https://github.com/islemmohamed/solution_BI_ELIT/blob/main/liste%20users.png)

