<div align="center">

# 🐠 Nuraki

### Your Personal Ornamental Fish Encyclopedia

[![Android](https://img.shields.io/badge/Platform-Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://developer.android.com)
[![Kotlin](https://img.shields.io/badge/Kotlin-2.0.21-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org)
[![Min SDK](https://img.shields.io/badge/Min%20SDK-33-brightgreen?style=for-the-badge)](https://developer.android.com/about/versions/13)
[![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)](LICENSE)
[![Version](https://img.shields.io/badge/Version-1.0-orange?style=for-the-badge)](https://github.com/Andrian206/Nuraki-Android/releases)

<p align="center">
  <a href="#-about-the-project">About</a> •
  <a href="#-key-features">Features</a> •
  <a href="#-tech-stack">Tech Stack</a> •
  <a href="#-getting-started">Getting Started</a> •
  <a href="#-usage">Usage</a> •
  <a href="#-roadmap">Roadmap</a> •
  <a href="#-contributing">Contributing</a> •
  <a href="#-license">License</a>
</p>

</div>

---

## 📑 Table of Contents

<details>
<summary>Click to expand</summary>

- [📖 About The Project](#-about-the-project)
  - [Overview](#overview)
  - [Problem Statement](#problem-statement)
  - [Solution](#solution)
  - [Screenshots / Demo](#screenshots--demo)
- [🏗️ Technical Architecture](#️-technical-architecture)
  - [Tech Stack](#tech-stack)
  - [Project Architecture](#project-architecture)
- [✨ Key Features](#-key-features)
- [🚀 Getting Started](#-getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Configuration](#configuration)
- [📘 Usage / Documentation](#-usage--documentation)
- [🗺️ Roadmap](#️-roadmap)
- [🤝 Contributing](#-contributing)
- [📄 License](#-license)
- [📬 Contact](#-contact)
- [🙏 Acknowledgments](#-acknowledgments)

</details>

---

## 📖 About The Project

### Overview

**Nuraki** is a modern Android application designed as a comprehensive catalog of ornamental fish species. Built with Kotlin and following Android development best practices, this app provides detailed information about various popular ornamental fish, including their scientific names, natural habitats, and comprehensive descriptions.

This project was developed as a Dicoding Academy project submission, demonstrating proficiency in Android development fundamentals, RecyclerView implementation, activity navigation, and Material Design principles.

### Problem Statement

> Ornamental fish enthusiasts and aquarium hobbyists often struggle to find consolidated, reliable information about different fish species. Scattered information across multiple sources makes it challenging to learn about fish characteristics, habitat requirements, and compatibility before making purchase decisions.

### Solution

Nuraki provides a centralized, beautifully designed mobile catalog that offers:
- **Curated Fish Database:** 10 popular ornamental fish species with detailed information
- **Rich Visual Content:** High-quality images for each fish species
- **Educational Content:** Scientific names, native habitats, and care information
- **Seamless Experience:** Intuitive navigation with smooth transitions and modern UI

---

## 🏗️ Technical Architecture

### Tech Stack

<table>
  <tr>
    <th>Category</th>
    <th>Technologies</th>
  </tr>
  <tr>
    <td><strong>Language</strong></td>
    <td>
      <img src="https://img.shields.io/badge/Kotlin-2.0.21-7F52FF?style=flat-square&logo=kotlin&logoColor=white" alt="Kotlin"/>
    </td>
  </tr>
  <tr>
    <td><strong>UI Framework</strong></td>
    <td>
      <img src="https://img.shields.io/badge/Android%20Views-XML-3DDC84?style=flat-square&logo=android&logoColor=white" alt="Android Views"/>
      <img src="https://img.shields.io/badge/Material%20Design%203-1.13.0-757575?style=flat-square&logo=materialdesign&logoColor=white" alt="Material Design"/>
    </td>
  </tr>
  <tr>
    <td><strong>Android SDK</strong></td>
    <td>
      <img src="https://img.shields.io/badge/Min%20SDK-33%20(Android%2013)-green?style=flat-square" alt="Min SDK"/>
      <img src="https://img.shields.io/badge/Target%20SDK-36%20(Android%2016)-blue?style=flat-square" alt="Target SDK"/>
    </td>
  </tr>
  <tr>
    <td><strong>Build System</strong></td>
    <td>
      <img src="https://img.shields.io/badge/Gradle-8.13.2-02303A?style=flat-square&logo=gradle&logoColor=white" alt="Gradle"/>
      <img src="https://img.shields.io/badge/Kotlin%20DSL-Enabled-7F52FF?style=flat-square" alt="Kotlin DSL"/>
    </td>
  </tr>
  <tr>
    <td><strong>Testing</strong></td>
    <td>
      <img src="https://img.shields.io/badge/JUnit-4.13.2-25A162?style=flat-square&logo=junit5&logoColor=white" alt="JUnit"/>
      <img src="https://img.shields.io/badge/Espresso-3.7.0-6DB33F?style=flat-square" alt="Espresso"/>
    </td>
  </tr>
</table>

<details>
<summary><strong>📦 Complete Dependencies List</strong></summary>

#### Production Dependencies
| Package | Version | Purpose |
|---------|---------|---------|
| `androidx.core:core-ktx` | 1.17.0 | Kotlin extensions for Android core |
| `androidx.appcompat:appcompat` | 1.7.1 | Backward-compatible Android components |
| `com.google.android.material:material` | 1.13.0 | Material Design components |
| `androidx.activity:activity` | 1.12.2 | Activity lifecycle management |
| `androidx.constraintlayout:constraintlayout` | 2.2.1 | Flexible layout system |
| `androidx.core:core-splashscreen` | 1.2.0 | Splash screen API |

#### Development Dependencies
| Package | Version | Purpose |
|---------|---------|---------|
| `junit:junit` | 4.13.2 | Unit testing framework |
| `androidx.test.ext:junit` | 1.3.0 | AndroidX JUnit extensions |
| `androidx.test.espresso:espresso-core` | 3.7.0 | UI testing framework |

</details>

### Project Architecture

```
Nuraki-Android
│
├── 📁 app/
│   ├── 📁 src/main/
│   │   ├── 📁 java/com/pab/nuraki_android/
│   │   │   ├── 📄 MainActivity.kt          # Main fish list screen
│   │   │   ├── 📄 DetailActivity.kt        # Fish detail view
│   │   │   ├── 📄 AboutActivity.kt         # Developer info screen
│   │   │   ├── 📄 Fish.kt                  # Data model (Parcelable)
│   │   │   └── 📄 ListFishAdapter.kt       # RecyclerView adapter
│   │   │
│   │   ├── 📁 res/
│   │   │   ├── 📁 layout/                  # XML layout files
│   │   │   ├── 📁 drawable/                # Fish images & icons
│   │   │   ├── 📁 values/                  # Strings, colors, themes
│   │   │   └── 📁 menu/                    # Menu resources
│   │   │
│   │   └── 📄 AndroidManifest.xml          # App configuration
│   │
│   └── 📄 build.gradle.kts                 # App-level build config
│
├── 📁 gradle/
│   └── 📄 libs.versions.toml               # Version catalog
│
└── 📄 build.gradle.kts                     # Project-level build config
```

**Architecture Pattern:** `Activity-based Architecture with Data Binding`

The application follows a simple yet effective architecture suitable for catalog-style applications:
- **Activities** handle UI logic and user interactions
- **Data Classes** with Parcelable for efficient data transfer between screens
- **RecyclerView Adapter** for efficient list rendering with ViewHolder pattern
- **Resource-based Data** using string-arrays for maintainable content management

<details>
<summary><strong>🔄 Data Flow Diagram</strong></summary>

```
┌─────────────────────────────────────────────────────────────┐
│                      PRESENTATION LAYER                      │
│  ┌─────────────┐  ┌─────────────┐  ┌─────────────────────┐  │
│  │ MainActivity│  │DetailActivity│  │   AboutActivity    │  │
│  │  (List)     │──│   (Details) │  │   (Developer)      │  │
│  └──────┬──────┘  └──────┬──────┘  └─────────────────────┘  │
│         │                │                                   │
│         ▼                │                                   │
│  ┌─────────────┐         │                                   │
│  │ListFishAdapter│       │                                   │
│  │(RecyclerView)│        │                                   │
│  └──────┬──────┘         │                                   │
└─────────┼────────────────┼──────────────────────────────────┘
          │                │
          ▼                ▼
┌─────────────────────────────────────────────────────────────┐
│                        DATA LAYER                            │
│  ┌─────────────────────────────────────────────────────┐    │
│  │              Fish (Parcelable Data Class)           │    │
│  │    name | scientificName | habitat | description    │    │
│  └─────────────────────────────────────────────────────┘    │
│                            ▲                                 │
│                            │                                 │
│  ┌─────────────────────────────────────────────────────┐    │
│  │           Resources (res/values/strings.xml)         │    │
│  │         String Arrays: names, habitats, etc.         │    │
│  └─────────────────────────────────────────────────────┘    │
└─────────────────────────────────────────────────────────────┘
```

</details>

---

## ✨ Key Features

<table>
  <tr>
    <td>🐟</td>
    <td><strong>Fish Catalog</strong></td>
    <td>Browse through 10 popular ornamental fish species with high-quality images</td>
  </tr>
  <tr>
    <td>📖</td>
    <td><strong>Detailed Information</strong></td>
    <td>View scientific names, native habitats, and comprehensive descriptions</td>
  </tr>
  <tr>
    <td>📤</td>
    <td><strong>Share Functionality</strong></td>
    <td>Share fish information with friends via any installed sharing app</td>
  </tr>
  <tr>
    <td>🎨</td>
    <td><strong>Modern UI/UX</strong></td>
    <td>Material Design 3 components with edge-to-edge display support</td>
  </tr>
  <tr>
    <td>🌊</td>
    <td><strong>Splash Screen</strong></td>
    <td>Native Android 12+ splash screen API implementation</td>
  </tr>
  <tr>
    <td>🌙</td>
    <td><strong>Dark Mode</strong></td>
    <td>Full support for system dark/light theme preferences</td>
  </tr>
</table>

<details>
<summary><strong>📋 Fish Species Included</strong></summary>

| No | Common Name | Scientific Name | Origin |
|----|-------------|-----------------|--------|
| 1 | Betta | *Betta splendens* | Southeast Asia |
| 2 | Buenos Aires Tetra | *Hyphessobrycon anisitsi* | South America |
| 3 | Cardinal Tetra | *Paracheirodon axelrodi* | Amazon Basin |
| 4 | Corydoras | *Corydoras paleatus* | South America |
| 5 | Guppy | *Poecilia reticulata* | South America |
| 6 | Manfish (Angelfish) | *Pterophyllum scalare* | Amazon Basin |
| 7 | Molly | *Poecilia sphenops* | Central America |
| 8 | Platy | *Xiphophorus maculatus* | Central America |
| 9 | Serpae Tetra | *Hyphessobrycon eques* | Amazon Basin |
| 10 | Tiger Barb | *Puntigrus tetrazona* | Southeast Asia |

</details>

---

## 🚀 Getting Started

### Prerequisites

Ensure you have the following installed on your development machine:

| Requirement | Version | Installation Guide |
|-------------|---------|-------------------|
| Android Studio | Ladybug (2024.2.1) or newer | [Download](https://developer.android.com/studio) |
| JDK | 11+ | Included with Android Studio |
| Android SDK | API 33+ (Android 13) | Via SDK Manager |
| Git | Latest | [Download](https://git-scm.com/downloads) |

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/Andrian206/Nuraki-Android.git
   ```

2. **Navigate to the project directory**
   ```bash
   cd Nuraki-Android
   ```

3. **Open in Android Studio**
   - Launch Android Studio
   - Select **File → Open**
   - Navigate to the cloned directory and select it
   - Wait for Gradle sync to complete

4. **Build the project**
   ```bash
   # Using command line (optional)
   ./gradlew build
   
   # Or use Android Studio: Build → Make Project (Ctrl+F9)
   ```

5. **Run the application**
   - Connect an Android device (API 33+) or start an emulator
   - Click the **Run** button (▶️) or press `Shift+F10`

### Configuration

This project uses local resources and does not require additional configuration files such as API keys or `google-services.json`.

<details>
<summary><strong>🔧 Build Variants</strong></summary>

| Variant | Description | ProGuard |
|---------|-------------|----------|
| `debug` | Development build with debugging enabled | Disabled |
| `release` | Production build with optimizations | Enabled |

To build a release APK:
```bash
./gradlew assembleRelease
```

</details>

---

## 📘 Usage / Documentation

### Quick Start

After launching the app, you'll be greeted with the main fish catalog screen:

1. **Browse Fish List** - Scroll through the list of ornamental fish
2. **View Details** - Tap on any fish card to see detailed information
3. **Share Information** - Use the share button (📤) on the detail screen to share fish info
4. **About Developer** - Access the About page via the toolbar menu (ℹ️)

### Navigation Flow

```
┌────────────────┐       ┌────────────────┐
│  Splash Screen │──────▶│  MainActivity  │
└────────────────┘       │   (Fish List)  │
                         └───────┬────────┘
                                 │
                    ┌────────────┼────────────┐
                    ▼                         ▼
           ┌────────────────┐        ┌────────────────┐
           │ DetailActivity │        │ AboutActivity  │
           │  (Fish Info)   │        │  (Developer)   │
           └────────────────┘        └────────────────┘
```

---

## 🗺️ Roadmap

See the [open issues](https://github.com/Andrian206/Nuraki-Android/issues) for a list of proposed features and known issues.

### Version 1.1 (Planned)

- [ ] Search functionality for fish catalog
- [ ] Favorite fish feature with local persistence
- [ ] Fish comparison feature
- [ ] Filter by habitat/origin

### Version 2.0 (Future)

- [ ] Online database with more fish species
- [ ] User authentication & cloud sync
- [ ] Community features (comments, ratings)
- [ ] Aquarium compatibility checker
- [ ] Fish care guides & tips

### Completed ✅

- [x] Basic fish catalog with RecyclerView
- [x] Detail view with comprehensive information
- [x] Share functionality
- [x] Splash screen implementation
- [x] Edge-to-edge display support
- [x] Material Design 3 theming
- [x] Dark mode support
- [x] About developer page

---

## 🤝 Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

### How to Contribute

1. **Fork the Project**
   ```bash
   # Click the Fork button on GitHub or use:
   gh repo fork Andrian206/Nuraki-Android
   ```

2. **Create your Feature Branch**
   ```bash
   git checkout -b feature/AmazingFeature
   ```

3. **Commit your Changes**
   ```bash
   git commit -m "feat: add some AmazingFeature"
   ```

   > We follow [Conventional Commits](https://www.conventionalcommits.org/) specification.

4. **Push to the Branch**
   ```bash
   git push origin feature/AmazingFeature
   ```

5. **Open a Pull Request**

### Contribution Guidelines

<details>
<summary><strong>📋 Commit Message Convention</strong></summary>

| Type | Description |
|------|-------------|
| `feat` | A new feature |
| `fix` | A bug fix |
| `docs` | Documentation only changes |
| `style` | Code style changes (formatting, semicolons, etc) |
| `refactor` | Code refactoring without feature or bug changes |
| `perf` | Performance improvements |
| `test` | Adding or updating tests |
| `chore` | Maintenance tasks |

**Examples:**
```
feat: add search functionality to fish catalog
fix: resolve crash on detail screen rotation
docs: update installation instructions
```

</details>

---

## 📄 License

Distributed under the **MIT** License. See [`LICENSE`](LICENSE) for more information.

```
MIT License

Copyright (c) 2026 Rio Andika Andriansyah

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software...
```

---

## 📬 Contact

<div align="center">

### Rio Andika Andriansyah

**Informatics Engineering Student @ Universitas Kuningan**

[![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:andikario0101@gmail.com)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Andrian206)

| Info | Detail |
|------|--------|
| 🎓 University | Universitas Kuningan |
| 📚 Major | Teknik Informatika |
| 🆔 Student ID | 20230810155 |

</div>

**Project Link:** [https://github.com/Andrian206/Nuraki-Android](https://github.com/Andrian206/Nuraki-Android)

---

## 🙏 Acknowledgments

- [Dicoding Academy](https://www.dicoding.com/) - For the Android development learning path
- [Android Developers](https://developer.android.com/) - Official documentation and guidelines
- [Material Design](https://m3.material.io/) - Design system and components
- [Shields.io](https://shields.io/) - For the beautiful badges
- Fish images sourced from various educational resources

---

<div align="center">

**[⬆ Back to Top](#-nuraki)**

---

Made with by **Rio Andika Andriansyah**

</div>
