package androidx.compose.runtime;

import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drN;
import o.drX;

@drN
/* loaded from: classes.dex */
public final class Updater<T> {
    private final Composer composer;

    /* renamed from: constructor-impl  reason: not valid java name */
    public static <T> Composer m1009constructorimpl(Composer composer) {
        return composer;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1010equalsimpl(Composer composer, Object obj) {
        return (obj instanceof Updater) && C8632dsu.c(composer, ((Updater) obj).m1015unboximpl());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1011hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1014toStringimpl(Composer composer) {
        return "Updater(composer=" + composer + ')';
    }

    public boolean equals(Object obj) {
        return m1010equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m1011hashCodeimpl(this.composer);
    }

    public String toString() {
        return m1014toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Composer m1015unboximpl() {
        return this.composer;
    }

    /* renamed from: set-impl  reason: not valid java name */
    public static final <V> void m1013setimpl(Composer composer, V v, drX<? super T, ? super V, dpR> drx) {
        if (composer.getInserting() || !C8632dsu.c(composer.rememberedValue(), v)) {
            composer.updateRememberedValue(v);
            composer.apply(v, drx);
        }
    }

    /* renamed from: init-impl  reason: not valid java name */
    public static final void m1012initimpl(Composer composer, final drM<? super T, dpR> drm) {
        if (composer.getInserting()) {
            composer.apply(dpR.c, new drX<T, dpR, dpR>() { // from class: androidx.compose.runtime.Updater$init$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // o.drX
                public /* bridge */ /* synthetic */ dpR invoke(Object obj, dpR dpr) {
                    invoke2((Updater$init$1<T>) obj, dpr);
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(T t, dpR dpr) {
                    drm.invoke(t);
                }
            });
        }
    }
}
