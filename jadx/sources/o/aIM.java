package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes3.dex */
public final class aIM implements aII {
    public static final a a = new a(null);
    private final aIP c;
    private final aIQ d;

    @Override // o.aII
    public aIK e() {
        return this.c;
    }

    @Inject
    public aIM() {
        aIQ aiq = new aIQ();
        this.d = aiq;
        this.c = new aIP(aiq);
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("NfuImpl");
        }
    }
}
