package com.netflix.mediaclient.net;

/* loaded from: classes.dex */
enum AppVisibilityState {
    FOREGROUND,
    BACKGROUND;

    /* renamed from: com.netflix.mediaclient.net.AppVisibilityState$4  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AppVisibilityState.values().length];
            a = iArr;
            try {
                iArr[AppVisibilityState.FOREGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AppVisibilityState.BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass4.a[ordinal()];
        return i != 1 ? i != 2 ? "unknown" : "background" : "foreground";
    }
}
