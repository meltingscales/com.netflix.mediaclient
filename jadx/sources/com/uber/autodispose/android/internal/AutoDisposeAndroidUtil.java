package com.uber.autodispose.android.internal;

import android.os.Looper;
import com.uber.autodispose.android.AutoDisposeAndroidPlugins;
import io.reactivex.functions.BooleanSupplier;

/* loaded from: classes5.dex */
public class AutoDisposeAndroidUtil {
    private static final BooleanSupplier c = new BooleanSupplier() { // from class: com.uber.autodispose.android.internal.AutoDisposeAndroidUtil$$ExternalSyntheticLambda0
        @Override // io.reactivex.functions.BooleanSupplier
        public final boolean getAsBoolean() {
            boolean e;
            e = AutoDisposeAndroidUtil.e();
            return e;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean e() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean d() {
        return AutoDisposeAndroidPlugins.a(c);
    }
}
