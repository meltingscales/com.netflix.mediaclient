package o;

import java.util.List;

/* renamed from: o.bFo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3646bFo extends C9941zV {

    /* renamed from: o.bFo$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3646bFo {
        private final boolean a;

        public final boolean b() {
            return this.a;
        }
    }

    /* renamed from: o.bFo$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3646bFo {
        private final boolean c;

        public final boolean c() {
            return this.c;
        }
    }

    public /* synthetic */ AbstractC3646bFo(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC3646bFo() {
    }

    /* renamed from: o.bFo$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3646bFo {
        private final List<InterfaceC5195buF> a;

        public final List<InterfaceC5195buF> e() {
            return this.a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(List<? extends InterfaceC5195buF> list) {
            super(null);
            C8632dsu.c((Object) list, "");
            this.a = list;
        }
    }

    /* renamed from: o.bFo$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3646bFo {
        private final int d;

        public final int e() {
            return this.d;
        }

        public b(int i) {
            super(null);
            this.d = i;
        }
    }
}
