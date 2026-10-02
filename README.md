# Gadomancy 1.5.11 - Thaumic Energistics API 兼容补丁

## 用途

补回 Gadomancy 1.5.11 在加载 `TileEssentiaCompressor` 时需要的旧接口：

```java
thaumicenergistics.api.storage.IAspectStorage
```

## 适用对象

- Minecraft 1.7.10
- Gadomancy 1.5.11
- 兼容修复目录中的 Thaumic Energistics 1.1.3.0（该版本使用新版 API，但不再包含 `IAspectStorage`）

## 安装

1. 将生成的 `Gadomancy-ThaumicEnergistics-API-Compat-1.0.jar` 放入当前实例的 `mods` 文件夹。
2. 保留 Gadomancy 1.5.11 和 Thaumic Energistics。
3. 不要同时放入同名的其他 `IAspectStorage` API 补丁。

## 说明

这是二进制兼容 shim，不修改 Gadomancy 和 Thaumic Energistics 原始 JAR。

`IAspectStorage` 在 Gadomancy 中只用于可选接口声明；Gadomancy 自身已经实现对应的容器方法。

若启动后出现新的方法缺失错误（`NoSuchMethodError` 或 `AbstractMethodError`），说明当前整合包中的其他模组也依赖旧版 `IAspectStorage`，需要进一步扩展接口，不能只靠这个最小补丁解决。

# Gadomancy 1.5.11 - Thaumic Energistics API Compatibility Patch

## Purpose

Restores the legacy interface required by Gadomancy 1.5.11 when loading `TileEssentiaCompressor`:

```java
thaumicenergistics.api.storage.IAspectStorage
```

## Applies To

- Minecraft 1.7.10
- Gadomancy 1.5.11
- Thaumic Energistics 1.1.3.0 in the compatibility fix directory (this version uses the newer API but no longer includes `IAspectStorage`)

## Installation

1. Place the generated `Gadomancy-ThaumicEnergistics-API-Compat-1.0.jar` into the `mods` folder of the current instance.
2. Keep Gadomancy 1.5.11 and Thaumic Energistics installed.
3. Do not install other `IAspectStorage` API patches with the same name at the same time.

## Notes

This is a binary compatibility shim. It does not modify the original Gadomancy or Thaumic Energistics JARs.

In Gadomancy, `IAspectStorage` is only used for optional interface declarations; Gadomancy itself already implements the corresponding container methods.

If new missing-method errors occur after startup (`NoSuchMethodError` or `AbstractMethodError`), it means other mods in the current modpack also depend on the old `IAspectStorage` API. The interface must then be extended further; this minimal patch alone cannot solve that.