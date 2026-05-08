package org.hotaku.listy

import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.api.provider.Provider


internal fun DependencyHandler.implementation(
    dependencyNotation: Provider<MinimalExternalModuleDependency>,
) = add("implementation", dependencyNotation)


internal fun DependencyHandler.debugImplementation(
    dependencyNotation: Provider<MinimalExternalModuleDependency>,
) = add("debugImplementation", dependencyNotation)
