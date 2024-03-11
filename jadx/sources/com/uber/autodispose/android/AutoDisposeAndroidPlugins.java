package com.uber.autodispose.android;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;

/* loaded from: classes5.dex */
public final class AutoDisposeAndroidPlugins {
    private static volatile BooleanSupplier d;

    public static boolean a(BooleanSupplier booleanSupplier) {
        if (booleanSupplier == null) {
            throw new NullPointerException("defaultChecker == null");
        }
        BooleanSupplier booleanSupplier2 = d;
        try {
            if (booleanSupplier2 == null) {
                return booleanSupplier.getAsBoolean();
            }
            return booleanSupplier2.getAsBoolean();
        } catch (Exception e) {
            throw Exceptions.propagate(e);
        }
    }
}
