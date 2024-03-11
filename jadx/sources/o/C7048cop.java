package o;

import com.netflix.mediaclient.ui.mylist.impl.tab.MyListTabItems;
import kotlin.NoWhenBranchMatchedException;
import o.C6956cnA;

/* renamed from: o.cop  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7048cop {

    /* renamed from: o.cop$d */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[MyListTabItems.Type.values().length];
            try {
                iArr[MyListTabItems.Type.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MyListTabItems.Type.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            d = iArr;
        }
    }

    public static final int d(MyListTabItems.Type type) {
        C8632dsu.c((Object) type, "");
        int i = d.d[type.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C6956cnA.c.N;
            }
            throw new NoWhenBranchMatchedException();
        }
        return C6956cnA.c.B;
    }

    public static final int e(MyListTabItems.Type type) {
        C8632dsu.c((Object) type, "");
        int i = d.d[type.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C6956cnA.e.t;
            }
            throw new NoWhenBranchMatchedException();
        }
        return C6956cnA.e.r;
    }
}
