package o;

import com.netflix.model.leafs.PostPlayAction;
import com.netflix.model.leafs.PostPlayItem;

/* loaded from: classes4.dex */
public abstract class cBO extends C9941zV {

    /* loaded from: classes4.dex */
    public static final class B extends cBO {
        private final boolean c;
        private final int e;

        public final boolean a() {
            return this.c;
        }

        public final int d() {
            return this.e;
        }
    }

    /* loaded from: classes4.dex */
    public static final class R extends cBO {
        private final C7535cxz e;

        public final C7535cxz c() {
            return this.e;
        }
    }

    public /* synthetic */ cBO(C8627dsp c8627dsp) {
        this();
    }

    /* renamed from: o.cBO$c  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5567c extends cBO {
        public static final C5567c c = new C5567c();

        private C5567c() {
            super(null);
        }
    }

    private cBO() {
    }

    /* renamed from: o.cBO$a  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5565a extends cBO {
        public static final C5565a c = new C5565a();

        private C5565a() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class F extends cBO {
        public static final F a = new F();

        private F() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class D extends cBO {
        public static final D d = new D();

        private D() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class A extends cBO {
        private final String d;

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof A) && C8632dsu.c((Object) this.d, (Object) ((A) obj).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            String str = this.d;
            return "IntentShare(message=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.d = str;
        }
    }

    /* renamed from: o.cBO$z  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5589z extends cBO {
        private final String b;

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5589z) && C8632dsu.c((Object) this.b, (Object) ((C5589z) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            String str = this.b;
            return "IntentShareToWatch(message=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5589z(String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.b = str;
        }
    }

    /* renamed from: o.cBO$q  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5581q extends cBO {
        public static final C5581q d = new C5581q();

        private C5581q() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class U extends cBO {
        public static final U b = new U();

        private U() {
            super(null);
        }
    }

    /* renamed from: o.cBO$n  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5578n extends cBO {
        public static final C5578n e = new C5578n();

        private C5578n() {
            super(null);
        }
    }

    /* renamed from: o.cBO$k  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5575k extends cBO {
        public static final C5575k a = new C5575k();

        private C5575k() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class S extends cBO {
        public static final S d = new S();

        private S() {
            super(null);
        }
    }

    /* renamed from: o.cBO$r  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5582r extends cBO {
        private final boolean a;
        private final int b;
        private final int c;
        private final boolean d;

        public final int b() {
            return this.c;
        }

        public final boolean d() {
            return this.d;
        }

        public final boolean e() {
            return this.a;
        }

        public /* synthetic */ C5582r(boolean z, int i, boolean z2, int i2, int i3, C8627dsp c8627dsp) {
            this(z, i, z2, (i3 & 8) != 0 ? 0 : i2);
        }

        public C5582r(boolean z, int i, boolean z2, int i2) {
            super(null);
            this.d = z;
            this.c = i;
            this.a = z2;
            this.b = i2;
        }
    }

    /* renamed from: o.cBO$m  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5577m extends cBO {
        private final int a;
        private final int e;

        public final int c() {
            return this.a;
        }

        public final int d() {
            return this.e;
        }

        public C5577m(int i, int i2) {
            super(null);
            this.e = i;
            this.a = i2;
        }
    }

    /* renamed from: o.cBO$o  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5579o extends cBO {
        private final boolean a;
        private final int b;
        private final int d;

        public final int b() {
            return this.b;
        }

        public final boolean c() {
            return this.a;
        }

        public final int d() {
            return this.d;
        }

        public C5579o(int i, int i2, boolean z) {
            super(null);
            this.d = i;
            this.b = i2;
            this.a = z;
        }
    }

    /* renamed from: o.cBO$t  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5584t extends cBO {
        private final boolean e;

        public final boolean c() {
            return this.e;
        }

        public C5584t(boolean z) {
            super(null);
            this.e = z;
        }
    }

    /* loaded from: classes4.dex */
    public static final class G extends cBO {
        public static final G c = new G();

        private G() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class C extends cBO {
        public static final C d = new C();

        private C() {
            super(null);
        }
    }

    /* renamed from: o.cBO$s  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5583s extends cBO {
        public static final C5583s d = new C5583s();

        private C5583s() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class J extends cBO {
        public static final J b = new J();

        private J() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class L extends cBO {
        public static final L b = new L();

        private L() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class M extends cBO {
        public static final M c = new M();

        private M() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class K extends cBO {
        private final int c;

        public final int d() {
            return this.c;
        }

        public K(int i) {
            super(null);
            this.c = i;
        }
    }

    /* loaded from: classes4.dex */
    public static final class O extends cBO {
        public static final O c = new O();

        private O() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class P extends cBO {
        private final boolean a;

        public final boolean c() {
            return this.a;
        }

        public P(boolean z) {
            super(null);
            this.a = z;
        }
    }

    /* renamed from: o.cBO$v  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5586v extends cBO {
        private final boolean a;
        private final boolean b;

        public final boolean d() {
            return this.a;
        }

        public final boolean e() {
            return this.b;
        }

        public C5586v(boolean z, boolean z2) {
            super(null);
            this.b = z;
            this.a = z2;
        }
    }

    /* renamed from: o.cBO$d  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5568d extends cBO {
        public static final C5568d e = new C5568d();

        private C5568d() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class I extends cBO {
        public static final I b = new I();

        private I() {
            super(null);
        }
    }

    /* renamed from: o.cBO$p  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5580p extends cBO {
        public static final C5580p c = new C5580p();

        private C5580p() {
            super(null);
        }
    }

    /* renamed from: o.cBO$l  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5576l extends cBO {
        public static final C5576l c = new C5576l();

        private C5576l() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class X extends cBO {
        public static final X a = new X();

        private X() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class y extends cBO {
        public static final y c = new y();

        private y() {
            super(null);
        }
    }

    /* renamed from: o.cBO$x  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5588x extends cBO {
        public static final C5588x e = new C5588x();

        private C5588x() {
            super(null);
        }
    }

    /* renamed from: o.cBO$g  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5571g extends cBO {
        public static final C5571g e = new C5571g();

        private C5571g() {
            super(null);
        }
    }

    /* renamed from: o.cBO$f  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5570f extends cBO {
        public static final C5570f b = new C5570f();

        private C5570f() {
            super(null);
        }
    }

    /* renamed from: o.cBO$e  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5569e extends cBO {
        public static final C5569e b = new C5569e();

        private C5569e() {
            super(null);
        }
    }

    /* renamed from: o.cBO$w  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5587w extends cBO {
        public static final C5587w a = new C5587w();

        private C5587w() {
            super(null);
        }
    }

    /* renamed from: o.cBO$j  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5574j extends cBO {
        public static final C5574j e = new C5574j();

        private C5574j() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class E extends cBO {
        public static final E a = new E();

        private E() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class T extends cBO {
        private final PostPlayItem e;

        public final PostPlayItem d() {
            return this.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public T(PostPlayItem postPlayItem) {
            super(null);
            C8632dsu.c((Object) postPlayItem, "");
            this.e = postPlayItem;
        }
    }

    /* loaded from: classes4.dex */
    public static final class V extends cBO {
        private final PostPlayItem b;
        private final PostPlayAction d;

        public final PostPlayAction a() {
            return this.d;
        }

        public final PostPlayItem b() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public V(PostPlayItem postPlayItem, PostPlayAction postPlayAction) {
            super(null);
            C8632dsu.c((Object) postPlayItem, "");
            C8632dsu.c((Object) postPlayAction, "");
            this.b = postPlayItem;
            this.d = postPlayAction;
        }
    }

    /* loaded from: classes4.dex */
    public static final class ab extends cBO {
        private final PostPlayItem c;
        private final PostPlayAction d;

        public final PostPlayItem a() {
            return this.c;
        }

        public final PostPlayAction b() {
            return this.d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ab(PostPlayItem postPlayItem, PostPlayAction postPlayAction) {
            super(null);
            C8632dsu.c((Object) postPlayItem, "");
            C8632dsu.c((Object) postPlayAction, "");
            this.c = postPlayItem;
            this.d = postPlayAction;
        }
    }

    /* loaded from: classes4.dex */
    public static final class ac extends cBO {
        public static final ac b = new ac();

        private ac() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class aa extends cBO {
        public static final aa e = new aa();

        private aa() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class H extends cBO {
        public static final H d = new H();

        private H() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class W extends cBO {
        private final float b;

        public final float e() {
            return this.b;
        }

        public W(float f) {
            super(null);
            this.b = f;
        }
    }

    /* renamed from: o.cBO$h  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5572h extends cBO {
        private final boolean b;

        public final boolean c() {
            return this.b;
        }

        public C5572h(boolean z) {
            super(null);
            this.b = z;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Q extends cBO {
        public static final Q e = new Q();

        private Q() {
            super(null);
        }
    }

    /* renamed from: o.cBO$b  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5566b extends cBO {
        private final float b;

        public final float e() {
            return this.b;
        }

        public C5566b(float f) {
            super(null);
            this.b = f;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Z extends cBO {
        public static final Z b = new Z();

        private Z() {
            super(null);
        }
    }

    /* renamed from: o.cBO$u  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5585u extends cBO {
        public static final C5585u a = new C5585u();

        private C5585u() {
            super(null);
        }
    }

    /* renamed from: o.cBO$i  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5573i extends cBO {
        public static final C5573i e = new C5573i();

        private C5573i() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class N extends cBO {
        private final int d;

        public final int e() {
            return this.d;
        }

        public N(int i) {
            super(null);
            this.d = i;
        }
    }
}
