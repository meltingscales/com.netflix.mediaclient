package o;

import o.AbstractC6677chn;
import o.C6651chN;
import o.C8632dsu;
import o.InterfaceC8966gg;

/* renamed from: o.chL  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6649chL extends C9943zX<C6651chN> {
    public static final e b = new e(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6649chL(C6651chN c6651chN) {
        super(c6651chN);
        C8632dsu.c((Object) c6651chN, "");
    }

    /* renamed from: o.chL$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp implements InterfaceC8966gg<C6649chL, C6651chN> {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("MessagingViewModel");
        }

        public C6649chL create(AbstractC8979gt abstractC8979gt, C6651chN c6651chN) {
            return (C6649chL) InterfaceC8966gg.c.a(this, abstractC8979gt, c6651chN);
        }

        /* renamed from: initialState */
        public C6651chN m3178initialState(AbstractC8979gt abstractC8979gt) {
            C8632dsu.c((Object) abstractC8979gt, "");
            return new C6651chN(null, 1, null);
        }
    }

    public final void a(final AbstractC6677chn abstractC6677chn) {
        b(new drM<C6651chN, C6651chN>() { // from class: com.netflix.mediaclient.ui.messaging.impl.mvrx.MessagingViewModel$setScreen$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final C6651chN invoke(C6651chN c6651chN) {
                C8632dsu.c((Object) c6651chN, "");
                return c6651chN.d(AbstractC6677chn.this);
            }
        });
    }
}
