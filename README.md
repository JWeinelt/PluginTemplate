# 🧩 PluginTemplate
A modern **template for Bukkit/Paper plugins**, built to provide a clean foundation and preconfigured utilities — perfect for kickstarting new projects with speed and structure.

## ✨ Features
This template comes with everything you need to get started right away:

* ⚙️ **JSON-based Configuration**
  * A simple yet powerful class for loading and saving configuration data in JSON format.
  * Automatically handles default values.
* 💾 **LocalStorage**
  * Centralized class for reading, writing, and updating configuration files.
  * Fully integrated with Gson for clean serialization and deserialization.
* 🗄️ **DatabaseManager (MySQL Ready)**
  * Prebuilt structure for MySQL database connections (easily extendable to other SQL systems).
* 🧱 **Paper/Bukkit Plugin Base**
  * Organized package structure for commands, listeners, services, and utilities.
  * Ready-to-run setup with `plugin.yml` and example initialization.

## 🧰 Dependencies
This template integrates with my own repositories and libraries:

* [**CodeBlocksMC-Repo**](https://repo.codeblocksmc.de/#/)
  Contains build tools, shared utilities, and other open-source projects that complement this template.

* [**CodeLib (v3)**](https://github.com/JWeinelt/CodeLib)
  A utility library offering common helper functions, database handlers, logging, and JSON management — ready to be integrated directly into your plugin.

## 🚀 Getting Started
1. **Use the Template**
   Click on **“Use this template”** at the top of the GitHub repository to create your own project based on it.
2. **Clone the Project**
   ```bash
   git clone https://github.com/your-user/PluginTemplate.git
   cd PluginTemplate
   ```
3. **Adjust Package and Plugin Info**
   * Update `plugin.yml`
   * Modify your main class (e.g. `de.julian.plugintemplate.PluginTemplate`)
4. **(Optional) Enable MySQL Connection**
   Configure your database credentials inside the generated ``config.json`` file after startup.

## 🧩 Project Structure
```
src/main/java/
├── de/julianweinelt/plugins/
│   ├── PluginTemplate.java          // Main class
│   ├── storage/
│   │   ├── LocalStorage.java       // JSON configuration handler
│   │   ├── DatabaseManager.java     // MySQL setup
│   │   ├── Configuration.java     // Example configuration wrapper class
│   └── ...
```

## 🧠 Purpose

This project serves as a **solid foundation** for any Bukkit or Paper plugin — lightweight, well-structured, and easily extendable.
Designed for developers who value **clarity, code quality, and scalability**.


## 📄 License
This repository is licensed under the **MIT License**.
You’re free to use, modify, and distribute it — as long as proper credit is given.
