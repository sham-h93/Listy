package org.hotaku.listy

import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

internal val Project.libs
    get(): VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

internal fun VersionCatalog.getPluginId(version: String) = findPlugin(version)
    .orElseThrow {
        IllegalArgumentException("Plugin '$name' not found in version catalog")
    }.get().pluginId

internal fun VersionCatalog.getVersion(version: String) = findVersion(version).get()

internal fun VersionCatalog.getLibrary(library: String) = findLibrary(library).get()

internal fun VersionCatalog.getBundle(bundle: String) = findBundle(bundle).get()