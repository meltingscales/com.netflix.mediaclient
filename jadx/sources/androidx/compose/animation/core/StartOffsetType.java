package androidx.compose.animation.core;

import o.C8627dsp;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class StartOffsetType {
    public static final Companion Companion = new Companion(null);
    private static final int Delay = m73constructorimpl(-1);
    private static final int FastForward = m73constructorimpl(1);
    private final int value;

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m73constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m74equalsimpl(int i, Object obj) {
        return (obj instanceof StartOffsetType) && i == ((StartOffsetType) obj).m77unboximpl();
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m75hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m76toStringimpl(int i) {
        return "StartOffsetType(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m74equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m75hashCodeimpl(this.value);
    }

    public String toString() {
        return m76toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m77unboximpl() {
        return this.value;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getDelay-Eo1U57Q  reason: not valid java name */
        public final int m78getDelayEo1U57Q() {
            return StartOffsetType.Delay;
        }
    }
}
