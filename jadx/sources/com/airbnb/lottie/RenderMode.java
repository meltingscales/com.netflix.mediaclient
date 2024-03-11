package com.airbnb.lottie;

/* loaded from: classes2.dex */
public enum RenderMode {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* renamed from: com.airbnb.lottie.RenderMode$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[RenderMode.values().length];
            c = iArr;
            try {
                iArr[RenderMode.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[RenderMode.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[RenderMode.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean a(int i, boolean z, int i2) {
        int i3 = AnonymousClass2.c[ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                return (z && i < 28) || i2 > 4 || i <= 25;
            }
            return true;
        }
        return false;
    }
}
