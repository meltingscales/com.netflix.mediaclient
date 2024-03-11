package o;

import com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation;
import com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerType;
import com.netflix.mediaclient.graphql.models.type.NGPRedeemBeaconFailureReason;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2259acq;
import o.C9018hf;
import o.InterfaceC8990hD;

/* renamed from: o.Zo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1390Zo implements InterfaceC8990hD<c> {
    public static final d b = new d(null);
    private final boolean a;
    private final String c;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "6f476a5c-6b9b-4489-86d2-aa7ca6dd5b1f";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1390Zo) && C8632dsu.c((Object) this.c, (Object) ((C1390Zo) obj).c);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "RedeemBeacon";
    }

    public final String g() {
        return this.c;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        String str = this.c;
        return "RedeemBeaconMutation(beaconCode=" + str + ")";
    }

    public C1390Zo(String str) {
        C8632dsu.c((Object) str, "");
        this.c = str;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2264acv.d.b(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<c> e() {
        return C8953gT.c(C2259acq.a.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2823anO.b.a()).d();
    }

    /* renamed from: o.Zo$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8990hD.b {
        private final e d;

        public final e b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.d, ((c) obj).d);
        }

        public int hashCode() {
            e eVar = this.d;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public String toString() {
            e eVar = this.d;
            return "Data(ngpRedeemBeacon=" + eVar + ")";
        }

        public c(e eVar) {
            this.d = eVar;
        }
    }

    /* renamed from: o.Zo$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final b c;
        private final h d;

        public final b c() {
            return this.c;
        }

        public final h d() {
            return this.d;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c(this.d, eVar.d) && C8632dsu.c(this.c, eVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            h hVar = this.d;
            int hashCode2 = hVar == null ? 0 : hVar.hashCode();
            b bVar = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            h hVar = this.d;
            b bVar = this.c;
            return "NgpRedeemBeacon(__typename=" + str + ", onNGPRedeemBeaconSuccess=" + hVar + ", onNGPRedeemBeaconFailed=" + bVar + ")";
        }

        public e(String str, h hVar, b bVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = hVar;
            this.c = bVar;
        }
    }

    /* renamed from: o.Zo$h */
    /* loaded from: classes3.dex */
    public static final class h {
        private final List<a> a;
        private final String b;
        private final List<NGPBeaconControllerOrientation> c;
        private final String d;
        private final NGPBeaconControllerType e;
        private final String f;
        private final String g;
        private final String h;
        private final int i;

        public final String a() {
            return this.d;
        }

        public final List<NGPBeaconControllerOrientation> b() {
            return this.c;
        }

        public final NGPBeaconControllerType c() {
            return this.e;
        }

        public final String d() {
            return this.b;
        }

        public final List<a> e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c((Object) this.b, (Object) hVar.b) && this.i == hVar.i && C8632dsu.c((Object) this.h, (Object) hVar.h) && C8632dsu.c((Object) this.d, (Object) hVar.d) && C8632dsu.c((Object) this.f, (Object) hVar.f) && C8632dsu.c(this.a, hVar.a) && C8632dsu.c(this.c, hVar.c) && this.e == hVar.e && C8632dsu.c((Object) this.g, (Object) hVar.g);
            }
            return false;
        }

        public final String f() {
            return this.h;
        }

        public final int g() {
            return this.i;
        }

        public final String h() {
            return this.g;
        }

        public int hashCode() {
            return (((((((((((((((this.b.hashCode() * 31) + Integer.hashCode(this.i)) * 31) + this.h.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f.hashCode()) * 31) + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.g.hashCode();
        }

        public final String i() {
            return this.f;
        }

        public String toString() {
            String str = this.b;
            int i = this.i;
            String str2 = this.h;
            String str3 = this.d;
            String str4 = this.f;
            List<a> list = this.a;
            List<NGPBeaconControllerOrientation> list2 = this.c;
            NGPBeaconControllerType nGPBeaconControllerType = this.e;
            String str5 = this.g;
            return "OnNGPRedeemBeaconSuccess(connectionSecret=" + str + ", gameId=" + i + ", gameplaySessionId=" + str2 + ", connectionUrl=" + str3 + ", controllerUiUrl=" + str4 + ", controllerUiParameters=" + list + ", controllerUiOrientations=" + list2 + ", controllerUiType=" + nGPBeaconControllerType + ", ocgaUuid=" + str5 + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public h(String str, int i, String str2, String str3, String str4, List<a> list, List<? extends NGPBeaconControllerOrientation> list2, NGPBeaconControllerType nGPBeaconControllerType, String str5) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) str3, "");
            C8632dsu.c((Object) str4, "");
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) list2, "");
            C8632dsu.c((Object) nGPBeaconControllerType, "");
            C8632dsu.c((Object) str5, "");
            this.b = str;
            this.i = i;
            this.h = str2;
            this.d = str3;
            this.f = str4;
            this.a = list;
            this.c = list2;
            this.e = nGPBeaconControllerType;
            this.g = str5;
        }
    }

    /* renamed from: o.Zo$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final String b;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c((Object) this.b, (Object) aVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (((this.d.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.d;
            String str2 = this.a;
            String str3 = this.b;
            return "ControllerUiParameter(__typename=" + str + ", key=" + str2 + ", value=" + str3 + ")";
        }

        public a(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) str3, "");
            this.d = str;
            this.a = str2;
            this.b = str3;
        }
    }

    /* renamed from: o.Zo$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final NGPRedeemBeaconFailureReason b;

        public final NGPRedeemBeaconFailureReason a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            NGPRedeemBeaconFailureReason nGPRedeemBeaconFailureReason = this.b;
            return "OnNGPRedeemBeaconFailed(reason=" + nGPRedeemBeaconFailureReason + ")";
        }

        public b(NGPRedeemBeaconFailureReason nGPRedeemBeaconFailureReason) {
            C8632dsu.c((Object) nGPRedeemBeaconFailureReason, "");
            this.b = nGPRedeemBeaconFailureReason;
        }
    }

    /* renamed from: o.Zo$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
