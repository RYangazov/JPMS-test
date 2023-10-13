plugins {
  `java-library`
  kotlin("jvm")
  idea
}

dependencies {
  implementation(kotlin("stdlib-jdk8"))
  implementation("ch.qos.logback:logback-classic:1.2.3")
  testImplementation(kotlin("test"))
  testRuntimeOnly("org.hamcrest:hamcrest-all:1.3")
}

val moduleName by extra { "org.jetbrains.letsPlot.kotlin.modules.shape" }

java {
  sourceCompatibility = JavaVersion.VERSION_11
  targetCompatibility = JavaVersion.VERSION_11
}

apply(from = "../module.gradle")
