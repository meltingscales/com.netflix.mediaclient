package org.chromium.base;

import org.chromium.base.annotations.CalledByNative;

@FunctionalInterface
/* loaded from: classes6.dex */
public interface Callback<T> {
    /* renamed from: onResult */
    void lambda$bind$0(T t);

    default Runnable bind(final T t) {
        return new Runnable() { // from class: org.chromium.base.Callback$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Callback.this.lambda$bind$0(t);
            }
        };
    }

    /* loaded from: classes6.dex */
    public static abstract class Helper {
        @CalledByNative
        static void onObjectResultFromNative(Callback callback, Object obj) {
            callback.lambda$bind$0(obj);
        }

        @CalledByNative
        static void onBooleanResultFromNative(Callback callback, boolean z) {
            callback.lambda$bind$0(Boolean.valueOf(z));
        }

        @CalledByNative
        static void onIntResultFromNative(Callback callback, int i) {
            callback.lambda$bind$0(Integer.valueOf(i));
        }

        @CalledByNative
        static void onLongResultFromNative(Callback callback, long j) {
            callback.lambda$bind$0(Long.valueOf(j));
        }

        @CalledByNative
        static void onTimeResultFromNative(Callback callback, long j) {
            callback.lambda$bind$0(Long.valueOf(j));
        }

        @CalledByNative
        static void runRunnable(Runnable runnable) {
            runnable.run();
        }
    }
}
