package o;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.netflix.mediaclient.ui.gamecontrollermagicpath.api.MagicPathUiType;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import o.AbstractC3870bNs;
import o.C3869bNr;
import o.C3871bNt;
import o.C8632dsu;
import o.InterfaceC3862bNk;
import o.InterfaceC8812dzl;
import o.dpR;

/* renamed from: o.bNr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3869bNr extends AbstractC8899fS<C3871bNt> {
    public static final d b = new d(null);
    public static final int d = 8;
    private final InterfaceC3862bNk a;
    private final dyS<AbstractC3870bNs> c;
    private final InterfaceC8812dzl<AbstractC3870bNs> e;

    @AssistedFactory
    /* renamed from: o.bNr$c */
    /* loaded from: classes6.dex */
    public interface c extends InterfaceC8985gz<C3869bNr, C3871bNt> {
    }

    public final dyS<AbstractC3870bNs> g() {
        return this.c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public C3869bNr(@Assisted C3871bNt c3871bNt, InterfaceC3862bNk interfaceC3862bNk) {
        super(c3871bNt, null, 2, null);
        C8632dsu.c((Object) c3871bNt, "");
        C8632dsu.c((Object) interfaceC3862bNk, "");
        this.a = interfaceC3862bNk;
        InterfaceC8812dzl<AbstractC3870bNs> d2 = dzB.d(AbstractC3870bNs.a.c);
        this.e = d2;
        this.c = d2;
        e(new drM<C3871bNt, dpR>() { // from class: com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.MagicPathViewModel$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3871bNt c3871bNt2) {
                a(c3871bNt2);
                return dpR.c;
            }

            public final void a(C3871bNt c3871bNt2) {
                InterfaceC3862bNk interfaceC3862bNk2;
                C8632dsu.c((Object) c3871bNt2, "");
                interfaceC3862bNk2 = C3869bNr.this.a;
                interfaceC3862bNk2.c(c3871bNt2.e());
            }
        });
    }

    /* renamed from: o.bNr$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC8906fZ<C3869bNr, C3871bNt> {
        private final /* synthetic */ C8982gw<C3869bNr, C3871bNt> d;

        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        public C3869bNr create(AbstractC8979gt abstractC8979gt, C3871bNt c3871bNt) {
            C8632dsu.c((Object) abstractC8979gt, "");
            C8632dsu.c((Object) c3871bNt, "");
            return this.d.create(abstractC8979gt, c3871bNt);
        }

        private d() {
            this.d = new C8982gw<>(C3869bNr.class);
        }

        /* renamed from: initialState */
        public C3871bNt m3162initialState(AbstractC8979gt abstractC8979gt) {
            C8632dsu.c((Object) abstractC8979gt, "");
            Bundle bundle = (Bundle) abstractC8979gt.b();
            if (bundle == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String string = bundle.getString("EXTRA_BEACON_CODE");
            if (string == null) {
                throw new IllegalArgumentException("EXTRA_BEACON_CODE must be specified".toString());
            }
            C8632dsu.a(string, "");
            String string2 = bundle.getString("EXTRA_MAGIC_PATH_UI_TYPE");
            if (string2 == null) {
                throw new IllegalArgumentException("EXTRA_MAGIC_PATH_UI_TYPE must be specified".toString());
            }
            C8632dsu.a(string2, "");
            return new C3871bNt(string, MagicPathUiType.valueOf(string2));
        }
    }

    public final void h() {
        e(new drM<C3871bNt, dpR>() { // from class: com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.MagicPathViewModel$confirmClick$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3871bNt c3871bNt) {
                d(c3871bNt);
                return dpR.c;
            }

            public final void d(C3871bNt c3871bNt) {
                InterfaceC8812dzl interfaceC8812dzl;
                C8632dsu.c((Object) c3871bNt, "");
                interfaceC8812dzl = C3869bNr.this.e;
                interfaceC8812dzl.d(new AbstractC3870bNs.b(c3871bNt.e()));
            }
        });
    }

    public final void j() {
        e(new drM<C3871bNt, dpR>() { // from class: com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.MagicPathViewModel$dismissClick$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3871bNt c3871bNt) {
                a(c3871bNt);
                return dpR.c;
            }

            public final void a(C3871bNt c3871bNt) {
                InterfaceC3862bNk interfaceC3862bNk;
                InterfaceC8812dzl interfaceC8812dzl;
                C8632dsu.c((Object) c3871bNt, "");
                interfaceC3862bNk = C3869bNr.this.a;
                interfaceC3862bNk.b(c3871bNt.e());
                interfaceC8812dzl = C3869bNr.this.e;
                interfaceC8812dzl.d(AbstractC3870bNs.c.a);
            }
        });
    }

    @SuppressLint({"CheckResult"})
    public final void d(final String str) {
        C8632dsu.c((Object) str, "");
        b(new drM<C3871bNt, C3871bNt>() { // from class: com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.MagicPathViewModel$setBeaconCode$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final C3871bNt invoke(C3871bNt c3871bNt) {
                C8632dsu.c((Object) c3871bNt, "");
                return C3871bNt.copy$default(c3871bNt, str, null, 2, null);
            }
        });
    }

    public final void b(final MagicPathUiType magicPathUiType) {
        C8632dsu.c((Object) magicPathUiType, "");
        b(new drM<C3871bNt, C3871bNt>() { // from class: com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.MagicPathViewModel$setUiType$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final C3871bNt invoke(C3871bNt c3871bNt) {
                C8632dsu.c((Object) c3871bNt, "");
                return C3871bNt.copy$default(c3871bNt, null, MagicPathUiType.this, 1, null);
            }
        });
    }
}
