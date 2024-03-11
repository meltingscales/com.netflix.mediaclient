package o;

import com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C1333Xq;
import o.C3895bOq;
import o.C8168dfL;
import o.C8632dsu;
import o.KP;
import o.KV;
import o.bQX;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public abstract class bQX extends AbstractC3336ax<b> {
    private drM<? super String, dpR> b;
    private String c;
    private int g = 3;
    private int f = 16;
    private IdentityViewModel.a d = IdentityViewModel.a.j.d;
    private final drX<KV, String, dpR> j = new drX<KV, String, dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.models.InputHandleModel$textChangeListener$1
        {
            super(2);
        }

        public final void b(KV kv, String str) {
            C8632dsu.c((Object) kv, "");
            C8632dsu.c((Object) str, "");
            drM<String, dpR> m = bQX.this.m();
            if (m != null) {
                m.invoke(str);
            }
        }

        @Override // o.drX
        public /* synthetic */ dpR invoke(KV kv, String str) {
            b(kv, str);
            return dpR.c;
        }
    };

    @Override // o.AbstractC3073as
    public int a() {
        return C3895bOq.c.R;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final void b(drM<? super String, dpR> drm) {
        this.b = drm;
    }

    public final void d(int i) {
        this.f = i;
    }

    public final void e(IdentityViewModel.a aVar) {
        C8632dsu.c((Object) aVar, "");
        this.d = aVar;
    }

    public final IdentityViewModel.a i() {
        return this.d;
    }

    public final int k() {
        return this.f;
    }

    public final int l() {
        return this.g;
    }

    public final drM<String, dpR> m() {
        return this.b;
    }

    public final void n_(int i) {
        this.g = i;
    }

    public final String o() {
        return this.c;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        KV b2 = bVar.b();
        String c = bVar.c();
        C8632dsu.a(c, "");
        b2.setLabel(c);
        String str = this.c;
        if (str != null) {
            bVar.b().setText(str);
        }
        bVar.b().setOnValueChange(this.j);
        bVar.b().setMaxCharacterCount(Integer.valueOf(this.f));
        IdentityViewModel.a aVar = this.d;
        if (C8632dsu.c(aVar, IdentityViewModel.a.j.d)) {
            bVar.b().setValidation(new KP.c(""));
        } else if (C8632dsu.c(aVar, IdentityViewModel.a.C0067a.a)) {
            KV b3 = bVar.b();
            String e = bVar.e();
            C8632dsu.a(e, "");
            b3.setValidation(new KP.a(e));
        } else if (C8632dsu.c(aVar, IdentityViewModel.a.c.e)) {
            KV b4 = bVar.b();
            String d = bVar.d();
            C8632dsu.a(d, "");
            b4.setValidation(new KP.b(d));
        } else {
            bVar.b().setValidation(new KP.e(e(this.d, bVar)));
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        super.b((bQX) bVar);
        bVar.b().setOnValueChange(null);
    }

    private final String e(IdentityViewModel.a aVar, b bVar) {
        if (aVar instanceof IdentityViewModel.a.f) {
            String f = bVar.f();
            C8632dsu.a(f, "");
            return f;
        } else if (C8632dsu.c(aVar, IdentityViewModel.a.g.d)) {
            String i = bVar.i();
            C8632dsu.a(i, "");
            return i;
        } else if (C8632dsu.c(aVar, IdentityViewModel.a.o.d)) {
            String h = bVar.h();
            C8632dsu.a(h, "");
            return h;
        } else if (C8632dsu.c(aVar, IdentityViewModel.a.h.a)) {
            String c1333Xq = bVar.g().d("count", Integer.valueOf(this.g)).toString();
            C8632dsu.a(c1333Xq, "");
            return c1333Xq;
        } else if (C8632dsu.c(aVar, IdentityViewModel.a.d.a)) {
            String c1333Xq2 = bVar.a().d("count", Integer.valueOf(this.f)).toString();
            C8632dsu.a(c1333Xq2, "");
            return c1333Xq2;
        } else {
            String j = bVar.j();
            C8632dsu.a(j, "");
            return j;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(b.class, "inputView", "getInputView()Lcom/netflix/hawkins/consumer/component/input/HawkinsInputView;", 0))};
        private final InterfaceC8554dpx a;
        private final InterfaceC8554dpx c;
        private final InterfaceC8554dpx d;
        private final dsZ e = bIF.d(this, C3895bOq.b.D, false, 2, null);
        private final InterfaceC8554dpx f;
        private final InterfaceC8554dpx g;
        private final InterfaceC8554dpx h;
        private final InterfaceC8554dpx j;
        private final InterfaceC8554dpx m;

        /* renamed from: o  reason: collision with root package name */
        private final InterfaceC8554dpx f13532o;

        public b() {
            InterfaceC8554dpx b2;
            InterfaceC8554dpx b3;
            InterfaceC8554dpx b4;
            InterfaceC8554dpx b5;
            InterfaceC8554dpx b6;
            InterfaceC8554dpx b7;
            InterfaceC8554dpx b8;
            InterfaceC8554dpx b9;
            InterfaceC8554dpx b10;
            b2 = dpB.b(new drO<String>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.models.InputHandleModel$Holder$unavailable$2
                @Override // o.drO
                /* renamed from: c */
                public final String invoke() {
                    return C8168dfL.d(C3895bOq.e.N);
                }
            });
            this.m = b2;
            b3 = dpB.b(new drO<String>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.models.InputHandleModel$Holder$noNetworkError$2
                @Override // o.drO
                /* renamed from: b */
                public final String invoke() {
                    return C8168dfL.d(C3895bOq.e.i);
                }
            });
            this.g = b3;
            b4 = dpB.b(new drO<String>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.models.InputHandleModel$Holder$validationError$2
                @Override // o.drO
                /* renamed from: d */
                public final String invoke() {
                    return C8168dfL.d(C3895bOq.e.M);
                }
            });
            this.f13532o = b4;
            b5 = dpB.b(new drO<String>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.models.InputHandleModel$Holder$tryAgain$2
                @Override // o.drO
                /* renamed from: b */
                public final String invoke() {
                    return C8168dfL.d(C3895bOq.e.E);
                }
            });
            this.f = b5;
            b6 = dpB.b(new drO<String>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.models.InputHandleModel$Holder$label$2
                @Override // o.drO
                /* renamed from: e */
                public final String invoke() {
                    return C8168dfL.d(C3895bOq.e.O);
                }
            });
            this.d = b6;
            b7 = dpB.b(new drO<String>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.models.InputHandleModel$Holder$checking$2
                @Override // o.drO
                /* renamed from: e */
                public final String invoke() {
                    return C8168dfL.d(C3895bOq.e.B);
                }
            });
            this.c = b7;
            b8 = dpB.b(new drO<String>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.models.InputHandleModel$Holder$available$2
                @Override // o.drO
                /* renamed from: e */
                public final String invoke() {
                    return C8168dfL.d(C3895bOq.e.A);
                }
            });
            this.a = b8;
            b9 = dpB.b(new drO<C1333Xq>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.models.InputHandleModel$Holder$minCharCountError$2
                @Override // o.drO
                /* renamed from: b */
                public final C1333Xq invoke() {
                    return C1333Xq.d(C3895bOq.e.G);
                }
            });
            this.j = b9;
            b10 = dpB.b(new drO<C1333Xq>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.models.InputHandleModel$Holder$maxCharCountError$2
                @Override // o.drO
                /* renamed from: b */
                public final C1333Xq invoke() {
                    return C1333Xq.d(C3895bOq.e.I);
                }
            });
            this.h = b10;
        }

        public final KV b() {
            return (KV) this.e.getValue(this, b[0]);
        }

        public final String f() {
            return (String) this.m.getValue();
        }

        public final String i() {
            return (String) this.g.getValue();
        }

        public final String h() {
            return (String) this.f13532o.getValue();
        }

        public final String j() {
            return (String) this.f.getValue();
        }

        public final String c() {
            return (String) this.d.getValue();
        }

        public final String e() {
            return (String) this.c.getValue();
        }

        public final String d() {
            return (String) this.a.getValue();
        }

        public final C1333Xq g() {
            Object value = this.j.getValue();
            C8632dsu.a(value, "");
            return (C1333Xq) value;
        }

        public final C1333Xq a() {
            Object value = this.h.getValue();
            C8632dsu.a(value, "");
            return (C1333Xq) value;
        }
    }
}
