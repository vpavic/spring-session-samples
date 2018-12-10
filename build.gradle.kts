plugins {
	base
	id("io.spring.dependency-management") version "1.0.6.RELEASE" apply false
	id("org.springframework.boot") version "2.1.1.RELEASE" apply false
}

subprojects {
	extra.set("profile", properties.getOrDefault("profile", "default"))

	apply(plugin = "java")
	apply(plugin = "io.spring.dependency-management")
	apply(plugin = "org.springframework.boot")

	configure<JavaPluginConvention> {
		sourceCompatibility = JavaVersion.VERSION_1_8
	}

	repositories {
		mavenCentral()
	}

	dependencies {
		"implementation"("org.springframework.boot:spring-boot-starter-actuator")
		"implementation"("org.springframework.boot:spring-boot-starter-security")

		"testImplementation"("org.springframework.boot:spring-boot-starter-test")
	}
}
