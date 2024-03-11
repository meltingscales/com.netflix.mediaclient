package o;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.ComposeView;
import java.util.Arrays;

/* renamed from: o.ae  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2322ae extends AbstractC3442az<ComposeView> {
    private final Object[] b;
    private final drX<Composer, Integer, dpR> c;
    private final InterfaceC8554dpx d;

    /* JADX WARN: Multi-variable type inference failed */
    public C2322ae(Object[] objArr, drX<? super Composer, ? super Integer, dpR> drx) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) objArr, "");
        C8632dsu.c((Object) drx, "");
        this.b = objArr;
        this.c = drx;
        b = dpB.b(new drO<SparseArray<Object>>() { // from class: com.airbnb.epoxy.ComposeEpoxyModel$keyedTags$2
            @Override // o.drO
            /* renamed from: c */
            public final SparseArray<Object> invoke() {
                return new SparseArray<>(2);
            }
        });
        this.d = b;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public ComposeView d(ViewGroup viewGroup) {
        C8632dsu.c((Object) viewGroup, "");
        Context context = viewGroup.getContext();
        C8632dsu.a(context, "");
        return new ComposeView(context, null, 0, 6, null);
    }

    @Override // o.AbstractC3073as
    public void c(ComposeView composeView) {
        C8632dsu.c((Object) composeView, "");
        super.c((C2322ae) composeView);
        composeView.setContent(this.c);
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2322ae) {
            return Arrays.equals(this.b, ((C2322ae) obj).b);
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        for (Object obj : this.b) {
            hashCode = (hashCode * 31) + obj.hashCode();
        }
        return hashCode;
    }
}
