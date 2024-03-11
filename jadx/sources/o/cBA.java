package o;

import androidx.core.view.WindowInsetsCompat;
import com.netflix.mediaclient.media.Watermark;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.ui.player.v2.interactive.Interactivity;
import com.netflix.mediaclient.ui.player.v2.interactive.MomentState;
import com.netflix.model.leafs.PostPlayAction;
import com.netflix.model.leafs.PostPlayExperience;
import com.netflix.model.leafs.PostPlayItem;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class cBA extends C9941zV {
    public /* synthetic */ cBA(C8627dsp c8627dsp) {
        this();
    }

    private cBA() {
    }

    /* loaded from: classes4.dex */
    public static final class ai extends cBA {
        private final float a;
        private final boolean b;
        private final float c;
        private final int d;
        private final int e;
        private final Watermark f;
        private final C7535cxz g;
        private final boolean h;

        public final int a() {
            return this.e;
        }

        public final C7535cxz b() {
            return this.g;
        }

        public final int c() {
            return this.d;
        }

        public final float d() {
            return this.a;
        }

        public final float e() {
            return this.c;
        }

        public final Watermark h() {
            return this.f;
        }

        public final boolean i() {
            return this.h;
        }

        public final boolean j() {
            return this.b;
        }

        public ai(C7535cxz c7535cxz, int i, int i2, boolean z, boolean z2, Watermark watermark, float f, float f2) {
            super(null);
            this.g = c7535cxz;
            this.d = i;
            this.e = i2;
            this.h = z;
            this.b = z2;
            this.f = watermark;
            this.c = f;
            this.a = f2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class J extends cBA {
        private final C7535cxz a;

        public final C7535cxz e() {
            return this.a;
        }

        public J(C7535cxz c7535cxz) {
            super(null);
            this.a = c7535cxz;
        }
    }

    /* loaded from: classes4.dex */
    public static final class ah extends cBA {
        private final IPlayer.PlaybackType c;

        public final IPlayer.PlaybackType d() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ah(IPlayer.PlaybackType playbackType) {
            super(null);
            C8632dsu.c((Object) playbackType, "");
            this.c = playbackType;
        }
    }

    /* loaded from: classes4.dex */
    public static final class C extends cBA {
        private final int b;

        public C(int i, String str) {
            super(null);
            this.b = i;
        }
    }

    /* loaded from: classes4.dex */
    public static final class X extends cBA {
        private final int b;

        public final int b() {
            return this.b;
        }

        public X(int i) {
            super(null);
            this.b = i;
        }
    }

    /* renamed from: o.cBA$n  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5552n extends cBA {
        private final int d;

        public final int d() {
            return this.d;
        }

        public C5552n(int i) {
            super(null);
            this.d = i;
        }
    }

    /* loaded from: classes4.dex */
    public static final class E extends cBA {
        public static final E e = new E();

        private E() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class T extends cBA {
        public static final T b = new T();

        private T() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class ao extends cBA {
        public static final ao d = new ao();

        private ao() {
            super(null);
        }
    }

    /* renamed from: o.cBA$t  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5558t extends cBA {
        public static final C5558t d = new C5558t();

        private C5558t() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class P extends cBA {
        public static final P a = new P();

        private P() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class O extends cBA {
        public static final O d = new O();

        private O() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class N extends cBA {
        public static final N d = new N();

        private N() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class Q extends cBA {
        private final String c;
        private final int d;

        public final int c() {
            return this.d;
        }

        public final String e() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Q(String str, int i) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.d = i;
        }
    }

    /* loaded from: classes4.dex */
    public static final class R extends cBA {
        public static final R b = new R();

        private R() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class L extends cBA {
        public static final L c = new L();

        private L() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class M extends cBA {
        public static final M e = new M();

        private M() {
            super(null);
        }
    }

    /* renamed from: o.cBA$g  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5545g extends cBA {
        private final boolean d;

        public final boolean b() {
            return this.d;
        }

        public C5545g(boolean z) {
            super(null);
            this.d = z;
        }
    }

    /* renamed from: o.cBA$c  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5541c extends cBA {
        public static final C5541c c = new C5541c();

        private C5541c() {
            super(null);
        }
    }

    /* renamed from: o.cBA$j  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5548j extends cBA {
        public static final C5548j d = new C5548j();

        private C5548j() {
            super(null);
        }
    }

    /* renamed from: o.cBA$s  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5557s extends cBA {
        public static final C5557s c = new C5557s();

        private C5557s() {
            super(null);
        }
    }

    /* renamed from: o.cBA$v  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5560v extends cBA {
        public static final C5560v b = new C5560v();

        private C5560v() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class an extends cBA {
        private final ByteBuffer a;
        private final boolean b;
        private final int d;
        private final int e;

        public final int b() {
            return this.d;
        }

        public final ByteBuffer d() {
            return this.a;
        }

        public final int e() {
            return this.e;
        }

        public /* synthetic */ an(int i, int i2, ByteBuffer byteBuffer, boolean z, int i3, C8627dsp c8627dsp) {
            this(i, i2, byteBuffer, (i3 & 8) != 0 ? false : z);
        }

        public an(int i, int i2, ByteBuffer byteBuffer, boolean z) {
            super(null);
            this.e = i;
            this.d = i2;
            this.a = byteBuffer;
            this.b = z;
        }
    }

    /* loaded from: classes4.dex */
    public static final class aq extends cBA {
        private final int a;
        private final ByteBuffer b;
        private final int c;
        private final boolean e;

        public final int a() {
            return this.c;
        }

        public final ByteBuffer b() {
            return this.b;
        }

        public final boolean c() {
            return this.e;
        }

        public final int d() {
            return this.a;
        }

        public aq(int i, int i2, boolean z, ByteBuffer byteBuffer) {
            super(null);
            this.c = i;
            this.a = i2;
            this.e = z;
            this.b = byteBuffer;
        }
    }

    /* loaded from: classes4.dex */
    public static final class ap extends cBA {
        public static final ap a = new ap();

        private ap() {
            super(null);
        }
    }

    /* renamed from: o.cBA$f  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5544f extends cBA {
        private final boolean d;

        public C5544f(boolean z) {
            super(null);
            this.d = z;
        }
    }

    /* loaded from: classes4.dex */
    public static final class K extends cBA {
        public static final K a = new K();

        private K() {
            super(null);
        }
    }

    /* renamed from: o.cBA$z  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5564z extends cBA {
        public static final C5564z e = new C5564z();

        private C5564z() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class aA extends cBA {
        public static final aA a = new aA();

        private aA() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class as extends cBA {
        public static final as b = new as();

        private as() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class ad extends cBA {
        private final InterfaceC7448cwR a;

        public final InterfaceC7448cwR e() {
            return this.a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ad(InterfaceC7448cwR interfaceC7448cwR) {
            super(null);
            C8632dsu.c((Object) interfaceC7448cwR, "");
            this.a = interfaceC7448cwR;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Z extends cBA {
        private final PostPlayExperience c;

        public final PostPlayExperience d() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Z(PostPlayExperience postPlayExperience) {
            super(null);
            C8632dsu.c((Object) postPlayExperience, "");
            this.c = postPlayExperience;
        }
    }

    /* loaded from: classes4.dex */
    public static final class W extends cBA {
        private final long d;
        private final long e;

        public final long a() {
            return this.d;
        }

        public W(long j, long j2) {
            super(null);
            this.d = j;
            this.e = j2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class am extends cBA {
        public am() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class ak extends cBA {
        public static final ak b = new ak();

        private ak() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class ac extends cBA {
        private final PostPlayItem d;

        public final PostPlayItem d() {
            return this.d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ac(PostPlayItem postPlayItem) {
            super(null);
            C8632dsu.c((Object) postPlayItem, "");
            this.d = postPlayItem;
        }
    }

    /* renamed from: o.cBA$ab  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5538ab extends cBA {
        private final PostPlayItem b;
        private final PostPlayAction d;

        public final PostPlayItem a() {
            return this.b;
        }

        public final PostPlayAction c() {
            return this.d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5538ab(PostPlayItem postPlayItem, PostPlayAction postPlayAction) {
            super(null);
            C8632dsu.c((Object) postPlayItem, "");
            C8632dsu.c((Object) postPlayAction, "");
            this.b = postPlayItem;
            this.d = postPlayAction;
        }
    }

    /* renamed from: o.cBA$af  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5539af extends cBA {
        private final PostPlayItem c;
        private final PostPlayAction e;

        public final PostPlayItem a() {
            return this.c;
        }

        public final PostPlayAction d() {
            return this.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5539af(PostPlayItem postPlayItem, PostPlayAction postPlayAction) {
            super(null);
            C8632dsu.c((Object) postPlayItem, "");
            C8632dsu.c((Object) postPlayAction, "");
            this.c = postPlayItem;
            this.e = postPlayAction;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Y extends cBA {
        public static final Y a = new Y();

        private Y() {
            super(null);
        }
    }

    /* renamed from: o.cBA$aa  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5537aa extends cBA {
        public static final C5537aa b = new C5537aa();

        private C5537aa() {
            super(null);
        }
    }

    /* renamed from: o.cBA$r  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5556r extends cBA {
        private final C7535cxz c;

        public final C7535cxz c() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5556r(C7535cxz c7535cxz) {
            super(null);
            C8632dsu.c((Object) c7535cxz, "");
            this.c = c7535cxz;
        }
    }

    /* renamed from: o.cBA$u  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5559u extends cBA {
        public static final C5559u b = new C5559u();

        private C5559u() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class au extends cBA {
        private final aJY c;

        public final aJY b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public au(aJY ajy) {
            super(null);
            C8632dsu.c((Object) ajy, "");
            this.c = ajy;
        }
    }

    /* loaded from: classes4.dex */
    public static final class ae extends cBA {
        public static final ae e = new ae();

        private ae() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class U extends cBA {
        private final boolean d;

        public final boolean a() {
            return this.d;
        }

        public U(boolean z) {
            super(null);
            this.d = z;
        }
    }

    /* loaded from: classes4.dex */
    public static final class aw extends cBA {
        public static final aw c = new aw();

        private aw() {
            super(null);
        }
    }

    /* renamed from: o.cBA$k  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5549k extends cBA {
        private final boolean a;
        private final boolean c;

        public final boolean a() {
            return this.a;
        }

        public final boolean e() {
            return this.c;
        }

        public C5549k(boolean z, boolean z2) {
            super(null);
            this.a = z;
            this.c = z2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class ax extends cBA {
        private final InterfaceC5198buI c;

        public final InterfaceC5198buI c() {
            return this.c;
        }

        public ax(InterfaceC5198buI interfaceC5198buI) {
            super(null);
            this.c = interfaceC5198buI;
        }
    }

    /* loaded from: classes4.dex */
    public static final class V extends cBA {
        private final InterfaceC5198buI d;

        public final InterfaceC5198buI c() {
            return this.d;
        }

        public V(InterfaceC5198buI interfaceC5198buI) {
            super(null);
            this.d = interfaceC5198buI;
        }
    }

    /* renamed from: o.cBA$d  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5542d extends cBA {
        private final C7535cxz a;
        private final Interactivity b;
        private final C5596cBg c;
        private final boolean d;
        private final String e;

        public final boolean a() {
            return this.d;
        }

        public final String b() {
            return this.e;
        }

        public final Interactivity c() {
            return this.b;
        }

        public final C5596cBg d() {
            return this.c;
        }

        public final C7535cxz e() {
            return this.a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5542d(C7535cxz c7535cxz, Interactivity interactivity, String str, boolean z, C5596cBg c5596cBg) {
            super(null);
            C8632dsu.c((Object) c7535cxz, "");
            C8632dsu.c((Object) c5596cBg, "");
            this.a = c7535cxz;
            this.b = interactivity;
            this.e = str;
            this.d = z;
            this.c = c5596cBg;
        }
    }

    /* renamed from: o.cBA$l  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5550l extends cBA {
        public static final C5550l a = new C5550l();

        private C5550l() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class I extends cBA {
        public static final I e = new I();

        private I() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class aB extends cBA {
        private final int a;

        public final int b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof aB) && this.a == ((aB) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        public String toString() {
            int i = this.a;
            return "SystemUIVisibilityUpdated(systemVisibilityFlags=" + i + ")";
        }

        public aB(int i) {
            super(null);
            this.a = i;
        }
    }

    /* loaded from: classes4.dex */
    public static final class aF extends cBA {
        private final boolean b;
        private final WindowInsetsCompat e;

        public final boolean a() {
            return this.b;
        }

        public final WindowInsetsCompat b() {
            return this.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public aF(boolean z, WindowInsetsCompat windowInsetsCompat) {
            super(null);
            C8632dsu.c((Object) windowInsetsCompat, "");
            this.b = z;
            this.e = windowInsetsCompat;
        }
    }

    /* renamed from: o.cBA$o  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5553o extends cBA {
        private final PlaylistTimestamp d;

        public final PlaylistTimestamp d() {
            return this.d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5553o(PlaylistTimestamp playlistTimestamp) {
            super(null);
            C8632dsu.c((Object) playlistTimestamp, "");
            this.d = playlistTimestamp;
        }
    }

    /* renamed from: o.cBA$i  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5547i extends cBA {
        private final Moment c;
        private final MomentState e;

        public final Moment a() {
            return this.c;
        }

        public final MomentState b() {
            return this.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5547i(MomentState momentState, Moment moment) {
            super(null);
            C8632dsu.c((Object) momentState, "");
            C8632dsu.c((Object) moment, "");
            this.e = momentState;
            this.c = moment;
        }
    }

    /* renamed from: o.cBA$h  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5546h extends cBA {
        private final InteractiveMoments d;

        public final InteractiveMoments e() {
            return this.d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5546h(InteractiveMoments interactiveMoments) {
            super(null);
            C8632dsu.c((Object) interactiveMoments, "");
            this.d = interactiveMoments;
        }
    }

    /* loaded from: classes4.dex */
    public static final class G extends cBA {
        private final Moment a;
        private final String b;
        private final String c;
        private final boolean d;
        private final String e;
        private final boolean j;

        public final Moment a() {
            return this.a;
        }

        public final String b() {
            return this.e;
        }

        public final String c() {
            return this.b;
        }

        public final boolean d() {
            return this.d;
        }

        public final String e() {
            return this.c;
        }

        public final boolean h() {
            return this.j;
        }

        public /* synthetic */ G(String str, String str2, Moment moment, boolean z, boolean z2, String str3, int i, C8627dsp c8627dsp) {
            this(str, str2, moment, z, z2, (i & 32) != 0 ? null : str3);
        }

        public G(String str, String str2, Moment moment, boolean z, boolean z2, String str3) {
            super(null);
            this.b = str;
            this.c = str2;
            this.a = moment;
            this.j = z;
            this.d = z2;
            this.e = str3;
        }
    }

    /* renamed from: o.cBA$a  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5536a extends cBA {
        private final String c;

        public final String c() {
            return this.c;
        }

        public C5536a(String str) {
            super(null);
            this.c = str;
        }
    }

    /* renamed from: o.cBA$b  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5540b extends cBA {
        private final boolean c;

        public final boolean d() {
            return this.c;
        }

        public C5540b(boolean z) {
            super(null);
            this.c = z;
        }
    }

    /* renamed from: o.cBA$m  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5551m extends cBA {
        private final float e;

        public final float c() {
            return this.e;
        }

        public C5551m(float f) {
            super(null);
            this.e = f;
        }
    }

    /* loaded from: classes4.dex */
    public static final class ag extends cBA {
        private final boolean d;

        public final boolean c() {
            return this.d;
        }

        public ag(boolean z) {
            super(null);
            this.d = z;
        }
    }

    /* loaded from: classes4.dex */
    public static final class F extends cBA {
        public static final F a = new F();

        private F() {
            super(null);
        }
    }

    /* renamed from: o.cBA$q  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5555q extends cBA {
        public static final C5555q a = new C5555q();

        private C5555q() {
            super(null);
        }
    }

    /* renamed from: o.cBA$p  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5554p extends cBA {
        private final float b;

        public final float e() {
            return this.b;
        }

        public C5554p(float f) {
            super(null);
            this.b = f;
        }
    }

    /* loaded from: classes4.dex */
    public static final class ar extends cBA {
        private final int a;
        private final int b;
        private final int c;
        private final int d;

        public final int a() {
            return this.d;
        }

        public final int b() {
            return this.b;
        }

        public final int d() {
            return this.c;
        }

        public final int e() {
            return this.a;
        }

        public ar(int i, int i2, int i3, int i4) {
            super(null);
            this.a = i;
            this.c = i2;
            this.d = i3;
            this.b = i4;
        }
    }

    /* loaded from: classes4.dex */
    public static final class A extends cBA {
        private final int b;

        public final int e() {
            return this.b;
        }

        public A(int i) {
            super(null);
            this.b = i;
        }
    }

    /* renamed from: o.cBA$w  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5561w extends cBA {
        public static final C5561w a = new C5561w();

        private C5561w() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class B extends cBA {
        public static final B b = new B();

        private B() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class D extends cBA {
        public static final D e = new D();

        private D() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class al extends cBA {
        public static final al c = new al();

        private al() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class H extends cBA {
        public static final H b = new H();

        private H() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class ay extends cBA {
        private final String c;

        public final String c() {
            return this.c;
        }

        public ay(String str) {
            super(null);
            this.c = str;
        }
    }

    /* loaded from: classes4.dex */
    public static final class az extends cBA {
        private final boolean a;

        public final boolean c() {
            return this.a;
        }

        public az(boolean z) {
            super(null);
            this.a = z;
        }
    }

    /* renamed from: o.cBA$e  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5543e extends cBA {
        private final int c;

        public C5543e(int i) {
            super(null);
            this.c = i;
        }
    }

    /* renamed from: o.cBA$x  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5562x extends cBA {
        private final List<Long> a;

        public final List<Long> b() {
            return this.a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5562x(List<Long> list) {
            super(null);
            C8632dsu.c((Object) list, "");
            this.a = list;
        }
    }

    /* renamed from: o.cBA$y  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C5563y extends cBA {
        private final int d;

        public final int a() {
            return this.d;
        }

        public C5563y(int i) {
            super(null);
            this.d = i;
        }
    }

    /* loaded from: classes4.dex */
    public static final class aj extends cBA {
        public static final aj b = new aj();

        private aj() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class S extends cBA {
        private final C7593czD c;

        public final C7593czD b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public S(C7593czD c7593czD) {
            super(null);
            C8632dsu.c((Object) c7593czD, "");
            this.c = c7593czD;
        }
    }

    /* loaded from: classes4.dex */
    public static final class at extends cBA {
        public static final at e = new at();

        private at() {
            super(null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class av extends cBA {
        public static final av e = new av();

        private av() {
            super(null);
        }
    }
}
