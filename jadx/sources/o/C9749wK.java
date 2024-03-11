package o;

import android.view.View;
import android.view.ViewStub;
import com.netflix.android.mdxpanel.postplay.MdxPostPlayUIViewImpl$lazyViews$2;
import o.C9795wi;

/* renamed from: o.wK  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9749wK extends AbstractC9710vY implements InterfaceC9747wI {
    private final InterfaceC8554dpx a;
    private final int c;
    private Boolean d;
    private String e;
    private final View f;
    private String i;

    @Override // o.AbstractC9944zY
    public View e() {
        return this.f;
    }

    @Override // o.InterfaceC9747wI
    public void j() {
        this.i = null;
        this.e = null;
        this.d = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9749wK(View view, C9812wz c9812wz) {
        super(view);
        InterfaceC8554dpx b;
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) c9812wz, "");
        b = dpB.b(new MdxPostPlayUIViewImpl$lazyViews$2(view, this));
        this.a = b;
        View t = t();
        this.f = t == null ? r().b() : t;
        this.c = e().getId();
    }

    /* renamed from: o.wK$a */
    /* loaded from: classes2.dex */
    public final class a extends C9938zS {
        final /* synthetic */ C9749wK a;
        private final C1203Sq b;
        private final C1204Sr c;
        private final C9741wC d;
        private final C1193Sg e;
        private final C1193Sg h;
        private final C1204Sr i;
        private final View j;

        public final C1193Sg a() {
            return this.h;
        }

        public final View b() {
            return this.j;
        }

        public final C1193Sg c() {
            return this.e;
        }

        public final C1203Sq d() {
            return this.b;
        }

        public final C1204Sr e() {
            return this.c;
        }

        public final C1204Sr i() {
            return this.i;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C9749wK c9749wK, View view) {
            super(view);
            C8632dsu.c((Object) view, "");
            this.a = c9749wK;
            this.j = view;
            C9741wC d = C9741wC.d(view);
            C8632dsu.a(d, "");
            this.d = d;
            C1204Sr c1204Sr = d.j;
            C8632dsu.a(c1204Sr, "");
            this.i = c1204Sr;
            C1204Sr c1204Sr2 = d.d;
            C8632dsu.a(c1204Sr2, "");
            this.c = c1204Sr2;
            C1193Sg c1193Sg = d.a;
            C8632dsu.a(c1193Sg, "");
            this.h = c1193Sg;
            C1193Sg c1193Sg2 = d.c;
            C8632dsu.a(c1193Sg2, "");
            this.e = c1193Sg2;
            C1203Sq c1203Sq = d.b;
            C8632dsu.a(c1203Sq, "");
            this.b = c1203Sq;
        }
    }

    private final ViewStub t() {
        return (ViewStub) o_().findViewById(C9795wi.a.w);
    }

    private final a r() {
        return (a) this.a.getValue();
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        r().b().setVisibility(8);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        r().b().setVisibility(0);
    }

    @Override // o.InterfaceC9747wI
    public void d(String str, String str2, String str3, String str4, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        r().i().setText(str);
        r().e().setText(str2);
        this.i = str3;
        this.e = str4;
        this.d = Boolean.valueOf(z);
    }
}
