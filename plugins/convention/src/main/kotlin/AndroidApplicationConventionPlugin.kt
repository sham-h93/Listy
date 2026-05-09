import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.dependencies
import org.hotaku.listy.configureKotlinAndroid
import org.hotaku.listy.getLibrary
import org.hotaku.listy.getPluginId
import org.hotaku.listy.implementation
import org.hotaku.listy.libs

class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        with(pluginManager) {
            apply(libs.getPluginId("kotlinAndroid"))
            apply(libs.getPluginId("androidApplication"))
        }

        configureKotlinAndroid()

        dependencies {
            implementation(libs.getLibrary("androidx.core.ktx"))
            implementation(libs.getLibrary("androidx.activity.compose"))
        }
    }
}
