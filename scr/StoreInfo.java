package com.example.storeinfolibrary;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;

import androidx.annotation.NonNull;

import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPlugin;

import java.util.Arrays;
import java.util.List;

public class StoreInfo extends GodotPlugin {
    public StoreInfo(Godot godot) {
        super(godot);
    }

    public String installTime() {
 
        PackageManager manager = getActivity().getPackageManager();
        long installTime = 0;
        try {
            PackageInfo info = manager.getPackageInfo(getActivity().getPackageName(), 0);
            installTime = info.firstInstallTime;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
        return Long.toString(installTime);
        //return installTime;
    }

    @SuppressWarnings("deprecation")
    @NonNull
    @Override
    public String getPluginName() {
        return "StoreInfo";
    }

    @SuppressWarnings("deprecation")
    @NonNull
    @Override
    public List<String> getPluginMethods() {
        return Arrays.asList("installTime");
    }

}
