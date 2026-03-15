# Product Flavors

Demo Android app demonstrating product flavors with three environments: dev, uat, and prod.

Each flavor has its own API endpoint, logging configuration, and application ID.

Companion project for [Product Flavors in Android](https://pcsalt.com/android/product-flavors-android/).

## Tech Stack

- Kotlin
- View Binding
- Material 3
- Min SDK 34 / Target SDK 36

## Flavors

| Flavor | App ID | API Endpoint | Logging |
|---|---|---|---|
| dev | com.pcsalt.example.productflavors.dev | dev.api-server.com | Enabled |
| uat | com.pcsalt.example.productflavors.uat | uat.api-server.com | Enabled |
| prod | com.pcsalt.example.productflavors | api-server.com | Disabled |
