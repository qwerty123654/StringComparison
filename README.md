Here’s the updated `README.md` without the **Contributing** section:

---

````markdown
# StringComparison

[![Build Status](https://img.shields.io/github/actions/workflow/status/qwerty123654/StringComparison/ci.yml?branch=main)](#)
[![License: MIT](https://img.shields.io/github/license/qwerty123654/StringComparison)](#LICENSE)

A tiny utility for comparing strings safely and efficiently, designed to help prevent unintended `NullPointerExceptions` and support flexible comparison strategies.

## 🧩 Table of Contents

- [Features](#-features)  
- [Installation](#-installation)  
- [Usage](#-usage)  
- [API](#-api)  
- [License](#-license)

---

## 🎯 Features

- **Safe comparisons**: prevents null-pointer exceptions (e.g. `"foo".equals(bar)`).
- **Case-insensitive** and **locale-aware** comparisons (supports `StringComparison`–style strategies).
- Clear, reusable methods to help enforce best-practices when comparing strings.

---

## 📦 Installation

```bash
# Clone the repo
git clone https://github.com/qwerty123654/StringComparison.git
cd StringComparison
````

---

## 🚀 Usage

### Basic null-safe comparison

```java
if (StringComparison.equals("ACTIVE", user.getStatus())) {
  // safe even if getStatus() returns null
}
```

### Case-insensitive comparison

```java
boolean isMatch = StringComparison.equalsIgnoreCase("Foo", "foo");
```

### Locale-aware comparison

```java
boolean isTurkishMatch = StringComparison.equals("I", "ı", Locale.forLanguageTag("tr-TR"));
```

---

## 🧰 API

| Method                               | Description                                                    |
| ------------------------------------ | -------------------------------------------------------------- |
| `equals(literal, other)`             | Safe, null‑avoiding check (`literal.equals(other)`).           |
| `equalsIgnoreCase(a, b)`             | Case-insensitive, null-safe comparison.                        |
| `equals(a, b, Locale locale)`        | Locale-aware comparison.                                       |
| `compare(a, b, ComparisonType type)` | Compare with explicit strategy (`ORDINAL`, `INVARIANT`, etc.). |

> Use `equals("foo", bar)` instead of `bar.equals("foo")` to safely handle `bar == null`.

---

## 📝 License

This project is licensed under the MIT License – see the [LICENSE](LICENSE) file for details.

---

## 📬 Contact

Created and maintained by **qwerty123654**. For feedback or questions, please open an issue or start a discussion on GitHub.

```

Let me know if you want to strip it down further or adapt it for a different tone (e.g., casual or enterprise).
```
