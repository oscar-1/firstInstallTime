# firstInstallTime
firstInstallTime for Godot over Android

This plugin allows, to a Android game developed with Godot, to retrieve the time when the game was instaled in the device (in milliseconds since midnight, January 1, 1970 UTC, as string). 
It has been developed for Godot 3.5.1 and relies on godot-lib.3.5.1.stable.release.aar library.

Usage:
1. Copy the files StoreInfoLibrary-debug.aar and StoreInfoLibrary.gdap on foder \android\plugins.
2. Activate Use Custom build and Store Info Library on Project/Export onn Godot
3. Type in GDScript:
		if Engine.has_singleton("StoreInfo"):
			var INFO = Engine.get_singleton("StoreInfo")
			print('UNIX first install time in ms: ', INFO.installTime())
