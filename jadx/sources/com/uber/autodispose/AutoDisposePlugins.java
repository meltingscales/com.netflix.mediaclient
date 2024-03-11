package com.uber.autodispose;

import io.reactivex.functions.Consumer;

/* loaded from: classes5.dex */
public final class AutoDisposePlugins {
    private static volatile boolean a;
    private static volatile Consumer<? super OutsideScopeException> b;

    public static Consumer<? super OutsideScopeException> d() {
        return b;
    }

    public static boolean e() {
        return a;
    }
}
