package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C0740Aw;
import o.C9018hf;
import o.InterfaceC8990hD;

/* renamed from: o.Ai  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0726Ai implements InterfaceC8990hD<d> {
    private final List<DR> a;
    private final String c;
    private final boolean e;
    private final String h;
    public static final c d = new c(null);
    public static final int b = 8;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "d1c66bcc-f044-4b5c-acd2-88c5293c4d79";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0726Ai) {
            C0726Ai c0726Ai = (C0726Ai) obj;
            return C8632dsu.c((Object) this.h, (Object) c0726Ai.h) && C8632dsu.c((Object) this.c, (Object) c0726Ai.c) && C8632dsu.c(this.a, c0726Ai.a);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "InterstitialSendFeedback";
    }

    public final String h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = this.h.hashCode();
        int hashCode2 = this.c.hashCode();
        List<DR> list = this.a;
        return (((hashCode * 31) + hashCode2) * 31) + (list == null ? 0 : list.hashCode());
    }

    public final List<DR> i() {
        return this.a;
    }

    public final String j() {
        return this.c;
    }

    public String toString() {
        String str = this.h;
        String str2 = this.c;
        List<DR> list = this.a;
        return "InterstitialSendFeedbackMutation(serverState=" + str + ", serverFeedback=" + str2 + ", inputFields=" + list + ")";
    }

    public C0726Ai(String str, String str2, List<DR> list) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.h = str;
        this.c = str2;
        this.a = list;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        return d.b();
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C0739Av.a.e(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<d> e() {
        return C8953gT.c(C0740Aw.e.e, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, EH.d.a()).e(C0808Dj.c.e()).d();
    }

    /* renamed from: o.Ai$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8990hD.b {
        private final Boolean b;

        public final Boolean b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.b, ((d) obj).b);
        }

        public int hashCode() {
            Boolean bool = this.b;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            Boolean bool = this.b;
            return "Data(clcsSendFeedback=" + bool + ")";
        }

        public d(Boolean bool) {
            this.b = bool;
        }
    }

    /* renamed from: o.Ai$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        public final String b() {
            return "mutation InterstitialSendFeedback($serverState: CLCSServerState!, $serverFeedback: CLCSServerFeedback!, $inputFields: [CLCSInputField!]) { clcsSendFeedback(serverState: $serverState, serverFeedback: $serverFeedback, inputFields: $inputFields) }";
        }

        private c() {
        }
    }
}
