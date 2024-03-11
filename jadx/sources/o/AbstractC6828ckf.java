package o;

import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;

/* renamed from: o.ckf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6828ckf extends C9941zV {
    public /* synthetic */ AbstractC6828ckf(C8627dsp c8627dsp) {
        this();
    }

    /* renamed from: o.ckf$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC6828ckf {
        public static final e d = new e();

        private e() {
            super(null);
        }
    }

    private AbstractC6828ckf() {
    }

    /* renamed from: o.ckf$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC6828ckf {
        public static final b c = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: o.ckf$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC6828ckf {
        private final drM<NetworkRequestResponseListener, dpR> b;

        public final drM<NetworkRequestResponseListener, dpR> a() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(drM<? super NetworkRequestResponseListener, dpR> drm) {
            super(null);
            C8632dsu.c((Object) drm, "");
            this.b = drm;
        }
    }
}
