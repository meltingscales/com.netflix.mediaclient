package o;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import o.C4757bl;
import o.C5401by;
import o.C8632dsu;
import o.C8670due;
import o.dtQ;
import o.dtY;

/* renamed from: o.bl  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4757bl {
    public static final void c(View view, C1511aE c1511aE) {
        C8632dsu.c((Object) view, "");
        view.setTag(C5401by.d.e, c1511aE);
    }

    public static final C1511aE e(View view) {
        C8632dsu.c((Object) view, "");
        return (C1511aE) view.getTag(C5401by.d.e);
    }

    public static final String d(View view) {
        Resources resources;
        C8632dsu.c((Object) view, "");
        try {
            if (view.getId() != -1 && (resources = view.getResources()) != null) {
                return resources.getResourceEntryName(view.getId());
            }
        } catch (Resources.NotFoundException unused) {
        }
        return null;
    }

    public static final dtQ<View> d(ViewGroup viewGroup) {
        dtQ<View> n;
        C8632dsu.c((Object) viewGroup, "");
        n = C8670due.n(ViewGroupKt.getChildren(viewGroup), new drM<View, dtQ<? extends View>>() { // from class: com.airbnb.epoxy.ViewExtensionsKt$allRecursiveChildren$1
            @Override // o.drM
            /* renamed from: c */
            public final dtQ<View> invoke(View view) {
                dtQ b;
                dtQ<View> e;
                C8632dsu.c((Object) view, "");
                b = dtY.b(view);
                e = C8670due.e(b, (dtQ) (view instanceof ViewGroup ? C4757bl.d((ViewGroup) view) : dtY.d()));
                return e;
            }
        });
        return n;
    }
}
