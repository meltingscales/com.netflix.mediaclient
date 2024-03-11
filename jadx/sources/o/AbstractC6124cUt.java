package o;

import android.view.View;
import o.C6035cRo;

/* renamed from: o.cUt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6124cUt extends AbstractC3336ax<b> {
    private View.OnClickListener b;
    public String c;
    private int d;
    private String g = "";

    @Override // o.AbstractC3073as
    public int a() {
        return C6035cRo.e.g;
    }

    public final void e(View.OnClickListener onClickListener) {
        this.b = onClickListener;
    }

    public final View.OnClickListener i() {
        return this.b;
    }

    public final int o() {
        return this.d;
    }

    public final String n() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        C1204Sr e = bVar.e();
        View.OnClickListener onClickListener = this.b;
        e.setOnClickListener(onClickListener);
        e.setClickable(onClickListener != null);
        bVar.e().setText(n());
    }

    /* renamed from: o.cUt$b */
    /* loaded from: classes4.dex */
    public final class b extends AbstractC3179au {
        public View a;
        public C1204Sr c;

        public final void b(View view) {
            C8632dsu.c((Object) view, "");
            this.a = view;
        }

        public final void b(C1204Sr c1204Sr) {
            C8632dsu.c((Object) c1204Sr, "");
            this.c = c1204Sr;
        }

        public b() {
        }

        public final C1204Sr e() {
            C1204Sr c1204Sr = this.c;
            if (c1204Sr != null) {
                return c1204Sr;
            }
            C8632dsu.d("");
            return null;
        }

        @Override // o.AbstractC3179au
        public void e(View view) {
            C8632dsu.c((Object) view, "");
            b(view);
            View findViewById = view.findViewById(C6035cRo.d.i);
            C8632dsu.a(findViewById, "");
            b((C1204Sr) findViewById);
        }
    }
}
