package o;

import android.content.Intent;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.rdid.RdidConsentStateRepo;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_RecordRdid;
import com.netflix.mediaclient.service.player.bladerunnerclient.AdsConsentAndOptOut$1;
import com.netflix.mediaclient.service.player.bladerunnerclient.AdsConsentAndOptOut$updateAdvertisingIdInfo$1;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.util.List;

/* renamed from: o.bcV  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4330bcV extends C1076Nu {
    private static C4330bcV b;
    public static final e d = new e(null);
    private Boolean a;
    private List<d> e;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.bcV$c */
    /* loaded from: classes3.dex */
    public interface c {
        RdidConsentStateRepo aQ();
    }

    public /* synthetic */ C4330bcV(C8627dsp c8627dsp) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Exception exc) {
    }

    public final List<d> b() {
        return this.e;
    }

    public final Boolean e() {
        return this.a;
    }

    /* renamed from: o.bcV$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("AdsConsentAndOptOut");
        }

        public final C4330bcV e() {
            if (C4330bcV.b == null) {
                synchronized (this) {
                    if (C4330bcV.b == null) {
                        e eVar = C4330bcV.d;
                        C4330bcV.b = new C4330bcV(null);
                    }
                    dpR dpr = dpR.c;
                }
            }
            C4330bcV c4330bcV = C4330bcV.b;
            C8632dsu.d(c4330bcV);
            return c4330bcV;
        }

        public final boolean b() {
            return C8153dex.h() && Config_FastProperty_RecordRdid.Companion.c();
        }
    }

    private C4330bcV() {
        AbstractApplicationC1040Mh.getInstance().o().c(this);
        if (d.b()) {
            d();
        }
        C8737dwr.c(dwY.c(GF.c()), null, null, new AdsConsentAndOptOut$1(this, null), 3, null);
    }

    @Override // o.C1076Nu, o.InterfaceC1072Nq
    public void c(NC nc, Intent intent) {
        C8632dsu.c((Object) nc, "");
        super.c(nc, intent);
        if (d.b()) {
            d();
        }
    }

    private final dxD d() {
        dxD c2;
        c2 = C8737dwr.c(dwY.c(GF.c()), null, null, new AdsConsentAndOptOut$updateAdvertisingIdInfo$1(this, null), 3, null);
        return c2;
    }

    /* renamed from: o.bcV$d */
    /* loaded from: classes3.dex */
    public static final class d {
        @SerializedName("consentId")
        private final String b;
        @SerializedName("displayedAt")
        private final String c;
        @SerializedName("isDenied")
        private final boolean d;

        public final String b() {
            return this.c;
        }

        public final boolean c() {
            return this.d;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c((Object) this.c, (Object) dVar.c) && this.d == dVar.d;
            }
            return false;
        }

        public int hashCode() {
            return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.c;
            boolean z = this.d;
            return "RdidConsent(consentId=" + str + ", displayedAt=" + str2 + ", isDenied=" + z + ")";
        }

        public d(String str, String str2, boolean z) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.b = str;
            this.c = str2;
            this.d = z;
        }
    }
}
