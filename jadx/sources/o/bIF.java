package o;

import android.view.View;
import kotlin.KotlinNothingValueException;
import o.C8632dsu;
import o.bIF;
import o.bIG;
import o.dtC;

/* loaded from: classes4.dex */
public final class bIF {
    private static final drX<bIG, Integer, View> b(bIG big) {
        return new drX<bIG, Integer, View>() { // from class: com.netflix.mediaclient.ui.epoxy.KotlinEpoxyHolderKt$viewFinder$1
            public final View c(bIG big2, int i) {
                C8632dsu.c((Object) big2, "");
                return big2.r().findViewById(i);
            }

            @Override // o.drX
            public /* synthetic */ View invoke(bIG big2, Integer num) {
                return c(big2, num.intValue());
            }
        };
    }

    private static final drX<bIG, Integer, View> c(bIG big) {
        return new drX<bIG, Integer, View>() { // from class: com.netflix.mediaclient.ui.epoxy.KotlinEpoxyHolderKt$viewFinderOrItemView$1
            public final View b(bIG big2, int i) {
                C8632dsu.c((Object) big2, "");
                View findViewById = big2.r().findViewById(i);
                return findViewById == null ? big2.r() : findViewById;
            }

            @Override // o.drX
            public /* synthetic */ View invoke(bIG big2, Integer num) {
                return b(big2, num.intValue());
            }
        };
    }

    public static /* synthetic */ dsZ d(bIG big, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return c(big, i, z);
    }

    public static final <V extends View> dsZ<bIG, V> c(bIG big, int i, boolean z) {
        C8632dsu.c((Object) big, "");
        if (z) {
            return a(i, c(big));
        }
        return a(i, b(big));
    }

    public static final <V extends View> dsZ<bIG, V> c(bIG big, int i) {
        C8632dsu.c((Object) big, "");
        return c(i, b(big));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void d(int i, dtC<?> dtc) {
        String name = dtc.getName();
        throw new IllegalStateException("View ID " + i + " for '" + name + "' not found.");
    }

    private static final <T, V extends View> bII<T, V> a(final int i, final drX<? super T, ? super Integer, ? extends View> drx) {
        return new bII<>(new drX<T, dtC<?>, V>() { // from class: com.netflix.mediaclient.ui.epoxy.KotlinEpoxyHolderKt$required$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX WARN: Incorrect return type in method signature: (TT;Lo/dtC<*>;)TV; */
            @Override // o.drX
            /* renamed from: e */
            public final View invoke(Object obj, dtC dtc) {
                C8632dsu.c((Object) dtc, "");
                View invoke = drx.invoke(obj, Integer.valueOf(i));
                if (invoke != null) {
                    return invoke;
                }
                bIF.d(i, dtc);
                throw new KotlinNothingValueException();
            }
        });
    }

    private static final <T, V extends View> bII<T, V> c(final int i, final drX<? super T, ? super Integer, ? extends View> drx) {
        return new bII<>(new drX<T, dtC<?>, V>() { // from class: com.netflix.mediaclient.ui.epoxy.KotlinEpoxyHolderKt$optional$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX WARN: Incorrect return type in method signature: (TT;Lo/dtC<*>;)TV; */
            @Override // o.drX
            /* renamed from: d */
            public final View invoke(Object obj, dtC dtc) {
                C8632dsu.c((Object) dtc, "");
                return drx.invoke(obj, Integer.valueOf(i));
            }
        });
    }
}
