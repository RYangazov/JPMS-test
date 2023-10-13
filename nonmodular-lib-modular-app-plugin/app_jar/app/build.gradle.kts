import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
  application
  kotlin("jvm")
  id("org.gradle.java.experimental-jigsaw")
  id("com.github.johnrengelman.shadow")
  idea
}

dependencies {

  //implementation(project(":shape"))
  implementation(kotlin("stdlib-jdk8"))
  implementation("ch.qos.logback:logback-classic:1.2.3")

  testImplementation(kotlin("test"))
  testRuntimeOnly("org.hamcrest:hamcrest-all:1.3")
}

val moduleName by extra { "org.jetbrains.letsPlot.kotlin.modules.app" }

java {
  sourceCompatibility = JavaVersion.VERSION_11
  targetCompatibility = JavaVersion.VERSION_11
}

application {
  mainClassName = "org.jetbrains.letsPlot.kotlin.modules.app.AppKt"
}

tasks.withType<ShadowJar> {
  mergeServiceFiles()
  archiveClassifier.set("uber")
  archiveVersion.set("")
}

