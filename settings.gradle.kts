pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "net.minecraftforge.gradle") {
                useModule("${requested.id}:ForgeGradle:${requested.version}")
            }
        }
    }

    repositories {
        gradlePluginPortal()
        maven {
            url = uri("https://files.minecraftforge.net/maven")
        }
        maven {
            name = "FancyGradle"
            url = uri("https://gitlab.com/api/v4/projects/26758973/packages/maven")
        }
        maven {
            name = "Garden of Fancy"
            url = uri("https://maven.gofancy.wtf/releases")
        }
    }
}

rootProject.name = "IC2-Patcher"

include(":IC2-Base")
include(":IC2-Patched")

project(":IC2-Base").projectDir = file("projects/IC2-Base")
project(":IC2-Patched").projectDir = file("projects/IC2-Patched")
