# `meta-jr`

**Yocto-Based Embedded Linux Layer for Embedded Systems with Graphics**

A Yocto Project meta layer providing packages and configurations for embedded Linux builds.

---

## Table of Contents

1. [Overview](#overview)
2. [Prerequisites & Dependencies](#prerequisites--dependencies)
3. [Adding the Layer to Your Build](#adding-the-layer-to-your-build)
4. [Layer Structure](#layer-structure)
5. [Maintainer & Contact](#maintainer--contact)
6. [License](#license)

---

## Overview

This layer, **meta-jr**, extends a standard Yocto build (e.g., based on the Kirkstone branch) with custom recipes and configurations tailored for **embedded systems with graphical user interfaces (GUIs)**.

It includes fundamental system packages, development tools, image recipes, and Qt integrations that enable running graphical applications on target hardware.



## Prerequisites & Dependencies

Ensure the following before incorporating `meta-jr` into your build:

* You are using a compatible **Yocto Project version** (e.g., the *Kirkstone* branch).
* **Layer dependencies** (e.g., `meta-oe`, `meta-python`, or other layers) — details to be filled in.

---

## Adding the Layer to Your Build

```bash
bitbake-layers add-layer path/to/meta-jr
```

After adding, don’t forget to include any required dependencies in your `bblayers.conf`.

---

## Layer Structure

```
meta-jr/
├── conf/                      # Configuration files (e.g., layer.conf)
├── recipes-core/              # Core package recipes
├── recipes-devtools/python/   # Recipes for Python devtools
├── recipes-images/images/     # Image recipes
├── recipes-qt/packagegroups/  # Qt-related package groups
├── COPYING.MIT                # Project license
└── README.md                  # This README
```

---

## Maintainer & Contact

* **Maintainer:** *Javad Ramezanzadeh*
* **Email:** *javadramezanzadeh@gmail.com*

---

## License

This project is distributed under the **MIT License**. See the `COPYING.MIT` file for full license text.
