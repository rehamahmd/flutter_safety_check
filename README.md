# safety_check

Check whether the device meets the following criteria-

- Is Rooted
- Is an Emulator
- Is Hooked
- Is Debuggable
- Is Tampered

## Note: only Android is Supported till now

## Getting Started

1. Install plugin

    ```yaml
    safety_check:
    git:
        url: https://turndigital.visualstudio.com/FE%20Library/_git/FE%20Library  
        ref: Mobile/Packages/Safety_Check
    ```

2. import plugin

    ```dart
    import 'package:safety_check/safety_check.dart';
    ```

## Usage

- Check all safety cases

```dart
    bool? isSafe = await safetyCheckPlugin.checkSafety();
    // Take your sha-1 key as parameter to check signature [optional]
```

- Check if usb debugging is on

```dart
    bool? isDebuggable = await safetyCheckPlugin.isDebuggable();
```

- Check if device is rooted

```dart
    bool? isRooted = await safetyCheckPlugin.isRooted();
```

- Check if is Emulator

```dart
    bool? isEmulator = await safetyCheckPlugin.isEmulator();
```

- Check if device is hooked

```dart
    bool? isHooked = await safetyCheckPlugin.isHooked();
```

- Check if device is tampered

```dart
    bool? isTampred = await safetyCheckPlugin.isTampred("<your-sha1-key>");
    // Take your sha-1 key as parameter to check signature
```
# flutter_safety_check
