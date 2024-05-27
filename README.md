# Kotlin Custom App

## Introduction

This project is an Android application developed using Kotlin, Google Places API, and SQLite database. The app is designed to demonstrate location-based functionalities by integrating Google Places API for fetching location data and storing it in a local SQLite database.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Dependencies](#dependencies)
- [Configuration](#configuration)
- [Detailed Code Analysis](#detailed-code-analysis)
  - [Overview](#overview)
  - [Code Structure](#code-structure)
  - [Key Components](#key-components)
  - [Google Places API Integration](#google-places-api-integration)
  - [Database Management](#database-management)
- [Contributors](#contributors)

## Features

- **Location-based Services**: Fetches location data using Google Places API.
- **Local Storage**: Stores location data in an SQLite database.
- **User Interface**: Interactive UI to display and manage locations.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Adnan25z/kotlinCustomApp.git
2. Open the project in Android Studio.
3. Build the project and install it on an Android device or emulator.

## Usage 
1. Launch the application on your Android device.
2. Use the interface to search for locations using the Google Places API.
3. Save and manage the fetched location data in the app.
   
## Dependencies
- Kotlin
- Android SDK
- Google Places API
- SQLite
- 
## Configuration
1. Obtain an API key from the Google Cloud Platform for the Google Places API.
2. Add your API key to the local.properties file:
   ```bash
   google.places.api.key=YOUR_API_KEY

## Detailed Code Analysis
### Overview
This project is an Android application that integrates location-based services using the Google Places API and stores the data in a local SQLite database. The app is developed using Kotlin and follows the principles of clean architecture.

### Code Structure
1. Model Layer: Contains data classes and database entities.
2. Repository Layer: Manages data operations and interactions with the Google Places API and SQLite database.
3. ViewModel Layer: Handles the app's business logic and prepares data for the UI.
4. View Layer: Comprises the activities and fragments that form the user interface.
   
### Key Components
- Google Places API Integration: Fetches location data based on user input.
- SQLite Database: Stores and retrieves location data.
- User Interface: Displays location data and allows user interactions.
  
### Google Places API Integration
The integration with Google Places API allows the app to fetch real-time location data. This is managed through network calls that handle API requests and responses. The fetched data is then parsed and displayed in the app.

### Database Management
The app uses SQLite to store location data locally. The database schema is defined using data classes annotated with Room annotations. CRUD operations are managed through DAO interfaces, providing a robust way to handle data persistence.

## Contributors
Adnan Zafar
