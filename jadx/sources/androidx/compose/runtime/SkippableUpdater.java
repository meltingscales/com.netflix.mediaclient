package androidx.compose.runtime;

import o.C8632dsu;
import o.drN;

@drN
/* loaded from: classes.dex */
public final class SkippableUpdater<T> {
    private final Composer composer;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ SkippableUpdater m1003boximpl(Composer composer) {
        return new SkippableUpdater(composer);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static <T> Composer m1004constructorimpl(Composer composer) {
        return composer;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1005equalsimpl(Composer composer, Object obj) {
        return (obj instanceof SkippableUpdater) && C8632dsu.c(composer, ((SkippableUpdater) obj).m1008unboximpl());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1006hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1007toStringimpl(Composer composer) {
        return "SkippableUpdater(composer=" + composer + ')';
    }

    public boolean equals(Object obj) {
        return m1005equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m1006hashCodeimpl(this.composer);
    }

    public String toString() {
        return m1007toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Composer m1008unboximpl() {
        return this.composer;
    }

    private /* synthetic */ SkippableUpdater(Composer composer) {
        this.composer = composer;
    }
}
