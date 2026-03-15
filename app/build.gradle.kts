plugins {
  alias(libs.plugins.android.application)
}

android {
  namespace = "com.pcsalt.example.productflavors"
  compileSdk = 36

  defaultConfig {
    minSdk = 34
    targetSdk = 36
    versionCode = 1
    versionName = "1.0"
  }

  buildTypes {
    debug {
      versionNameSuffix = "-debug"
    }
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }

  flavorDimensions += "server"

  productFlavors {
    create("dev") {
      dimension = "server"
      applicationId = "com.pcsalt.example.productflavors.dev"
      versionNameSuffix = "-dev"
    }
    create("uat") {
      dimension = "server"
      applicationId = "com.pcsalt.example.productflavors.uat"
      versionNameSuffix = "-uat"
    }
    create("prod") {
      dimension = "server"
      applicationId = "com.pcsalt.example.productflavors"
      versionNameSuffix = "-prod"
    }
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }

  buildFeatures {
    viewBinding = true
    buildConfig = true
  }
}

dependencies {
  implementation(libs.core.ktx)
  implementation(libs.appcompat)
  implementation(libs.material)
}
