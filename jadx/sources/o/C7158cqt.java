package o;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.cqt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7158cqt extends AbstractC7118cqF {
    private final int a;
    private final String b;
    private final String d;

    public C7158cqt() {
        this(0, null, null, 7, null);
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    @Override // o.AbstractC7118cqF
    public int d() {
        return this.a;
    }

    public /* synthetic */ C7158cqt(int i, String str, String str2, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7158cqt(int i, String str, String str2) {
        super(false, 1, null);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.a = i;
        this.b = str;
        this.d = str2;
    }

    /* renamed from: o.cqt$b */
    /* loaded from: classes4.dex */
    public static final class b extends RecyclerView.ViewHolder {
        private final C7146cqh d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C7146cqh c7146cqh) {
            super(c7146cqh.a());
            C8632dsu.c((Object) c7146cqh, "");
            this.d = c7146cqh;
        }

        public final void b(C7158cqt c7158cqt) {
            C8632dsu.c((Object) c7158cqt, "");
            this.d.b.setText(c7158cqt.c());
            this.d.a.setText(c7158cqt.b());
        }
    }
}
