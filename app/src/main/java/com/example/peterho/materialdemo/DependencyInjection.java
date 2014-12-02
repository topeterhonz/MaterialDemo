package com.example.peterho.materialdemo;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class DependencyInjection {
    private static Injector sInjector;
    public static void initialiseInjector() {
        sInjector = Guice.createInjector(new ApplicationModule());
    }

    public static Injector getInjector() {
        return sInjector;
    }
}
