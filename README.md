Themes
======

This application is a single Activity application that displays themed screens, laid out depending on the screen size and orientation of the device. The app is able to toggle and reload its theme at runtime. The objectives set for this app are:

•  Multiple screen density support
•	Multiple screen orientation support
•	Multiple screen size support
•	Theming and styling
•	Stretchable 9 patches
•	State list drawables
•	Creating and using configuration specific resources

The reach the objectives, the app responds to the following requirements.


1.  Support at a minimum Android 2.2 (API 8), and work with the latest version of Android (API 17+).
2.	Contain and use ONLY one Activity.
3.	The app may NOT set ANY view attributes in code, they must ALL be set in xml using themes/styles/layouts. No credit will be given for circumventing using themes/styles.
4.	Have density specific versions for every drawable (EXCEPT the buttons) that support mdpi, hdpi, and xhdpi at the appropriate sizes. 
5.	Use a custom dark (default) and light theme, that use custom attributes to set view properties.
6.	Allow its theme to be toggled at runtime by an action bar item (3.0+) or menu item (< 3.0), depending on the OS version.
7.	Save the current theme “state” that it is set to and restore it on orientation change (or low memory situations).
8.	Support 4 different layouts, depending on screen size and orientation (must match screenshots below)

