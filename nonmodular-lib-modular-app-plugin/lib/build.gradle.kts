import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask


plugins {
  kotlin("jvm") version "1.3.71" apply false
  id("org.gradle.java.experimental-jigsaw") version "0.1.1"
  id("com.github.johnrengelman.shadow") version "5.2.0" apply false
  id("com.github.ben-manes.versions") version "0.28.0"
}

subprojects {
  repositories {
    mavenCentral()
    jcenter()
  }
}
