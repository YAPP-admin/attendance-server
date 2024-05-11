import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.2.5" apply false
	id("io.spring.dependency-management") version "1.1.4" apply false
	kotlin("jvm") version "1.9.23"
	kotlin("plugin.spring") version "1.9.23" apply false
	kotlin("plugin.jpa") version "1.9.23" apply false
}

allprojects {
	group = "kr.co.yapp.attendance"
	version = "0.0.1-SNAPSHOT"

	repositories {
		mavenCentral()
	}

	tasks.withType<KotlinCompile> {
		kotlinOptions {
			freeCompilerArgs += "-Xjsr305=strict"
			jvmTarget = "17"
		}
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}
}

java {
	sourceCompatibility = JavaVersion.VERSION_17
}
