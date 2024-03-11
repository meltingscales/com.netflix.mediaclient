package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import o.C7142cqd;

/* renamed from: o.cql  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7150cql extends AbstractC7118cqF {
    private final int d;
    private final String e;

    public C7150cql() {
        this(0, null, 3, null);
    }

    @Override // o.AbstractC7118cqF
    public int d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public /* synthetic */ C7150cql(int i, String str, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? 2 : i, (i2 & 2) != 0 ? "" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7150cql(int i, String str) {
        super(false, 1, null);
        C8632dsu.c((Object) str, "");
        this.d = i;
        this.e = str;
    }

    /* renamed from: o.cql$e */
    /* loaded from: classes4.dex */
    public static final class e extends RecyclerView.ViewHolder {
        private final C1204Sr e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(view);
            C8632dsu.c((Object) view, "");
            this.e = (C1204Sr) view.findViewById(C7142cqd.b.j);
        }

        public final void c(C7150cql c7150cql) {
            C8632dsu.c((Object) c7150cql, "");
            this.e.setText(c7150cql.e());
        }
    }
}
