Basic Android System Service - Client Application
=================================================

https://github.com/gibsson/BasicClient

This project intends to be a sample application using the previously created Basic Android System Service.
Therefore it requires the latter to be running on your device/emulator:
https://github.com/gibsson/BasicService

This has been inspired from the more featured Marakana Log Service Client example:
https://github.com/twitter-university/alpha

The application consists of only one Activity that exercise the Basic Service API (see BasicActivity.java).

When clicking on the button, this will call the service `setValue()` method with a random integer as parameter.
Then the application will call the service `getValue()` method and display both integers.

In order to have the service built-in your Android device or emulator, the packages must be explicitly requested as follows:

PRODUCT_PACKAGES += \
    BasicClient

This application can also be built within Eclipse as long as the Basic Service Add-On has been installed:
https://github.com/gibsson/basic_sdk_addon

