package o;

import androidx.compose.runtime.MutableState;
import com.airbnb.android.showkase.models.ShowkaseCurrentScreen;
import o.C8632dsu;
import o.D;

/* loaded from: classes5.dex */
public final class H {
    public static final boolean a(String str) {
        return C8632dsu.c((Object) str, (Object) ShowkaseCurrentScreen.COMPONENTS_IN_A_GROUP.name()) || C8632dsu.c((Object) str, (Object) ShowkaseCurrentScreen.COLORS_IN_A_GROUP.name()) || C8632dsu.c((Object) str, (Object) ShowkaseCurrentScreen.TYPOGRAPHY_IN_A_GROUP.name());
    }

    public static final void d(MutableState<D> mutableState) {
        C8632dsu.c((Object) mutableState, "");
        b(mutableState, new drM<D, D>() { // from class: com.airbnb.android.showkase.models.ShowkaseBrowserScreenMetadataKt$clear$1
            @Override // o.drM
            /* renamed from: e */
            public final D invoke(D d) {
                C8632dsu.c((Object) d, "");
                return d.b(null, null, null, null, false, null);
            }
        });
    }

    public static final void c(MutableState<D> mutableState) {
        C8632dsu.c((Object) mutableState, "");
        b(mutableState, new drM<D, D>() { // from class: com.airbnb.android.showkase.models.ShowkaseBrowserScreenMetadataKt$clearActiveSearch$1
            @Override // o.drM
            /* renamed from: d */
            public final D invoke(D d2) {
                C8632dsu.c((Object) d2, "");
                return D.e(d2, null, null, null, null, false, null, 15, null);
            }
        });
    }

    public static final <T> void b(MutableState<T> mutableState, drM<? super T, ? extends T> drm) {
        C8632dsu.c((Object) mutableState, "");
        C8632dsu.c((Object) drm, "");
        mutableState.setValue(drm.invoke((T) mutableState.component1()));
    }
}
