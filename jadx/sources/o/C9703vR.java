package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: o.vR  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9703vR {

    /* renamed from: o.vR$d */
    /* loaded from: classes2.dex */
    public static final class d implements Iterable<View>, dsK {
        final /* synthetic */ ViewGroup e;

        /* renamed from: o.vR$d$e */
        /* loaded from: classes2.dex */
        public static final class e implements Iterator<View>, dsK {
            final /* synthetic */ ViewGroup d;
            private int e;

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            e(ViewGroup viewGroup) {
                this.d = viewGroup;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.e < this.d.getChildCount();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public View next() {
                ViewGroup viewGroup = this.d;
                int i = this.e;
                this.e = i + 1;
                return viewGroup.getChildAt(i);
            }
        }

        d(ViewGroup viewGroup) {
            this.e = viewGroup;
        }

        @Override // java.lang.Iterable
        /* renamed from: d */
        public e iterator() {
            return new e(this.e);
        }
    }

    public static final Iterable<View> e(ViewGroup viewGroup) {
        C8632dsu.c((Object) viewGroup, "");
        return new d(viewGroup);
    }

    public static final View b(ViewGroup viewGroup, int i) {
        C8632dsu.c((Object) viewGroup, "");
        return viewGroup.getChildAt(i);
    }

    public static final boolean c(ViewGroup viewGroup, View view) {
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c((Object) view, "");
        return viewGroup.indexOfChild(view) != -1;
    }

    public static /* synthetic */ View e(ViewGroup viewGroup, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        return e(viewGroup, i, i2);
    }

    public static final View e(ViewGroup viewGroup, int i, int i2) {
        C8632dsu.c((Object) viewGroup, "");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        viewGroup.addView(inflate, i2);
        C8632dsu.a(inflate, "");
        return inflate;
    }
}
