package o;

import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.pds.AdsAuditPingSender$doPing$1;

/* renamed from: o.bms  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4810bms {
    public static final a b = new a(null);

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, Exception exc) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, Integer num, String str2) {
    }

    private final dxD c(String str) {
        dxD c;
        c = C8737dwr.c(dwY.c(GF.d()), null, null, new AdsAuditPingSender$doPing$1(str, this, null), 3, null);
        return c;
    }

    /* renamed from: o.bms$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("AdsAuditPing");
        }
    }

    public final void b(String str) {
        C8632dsu.c((Object) str, "");
        b.getLogTag();
        c(str);
    }
}
