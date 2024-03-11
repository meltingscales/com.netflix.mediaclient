package o;

import com.netflix.mediaclient.api.mdx.MdxNotificationIntentRetriever;
import o.C8241dgf;

/* renamed from: o.aWn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2010aWn {
    private String a;
    private boolean b;
    private boolean c;
    private String d;
    d e;
    private C2012aWp f;
    private int h;
    private C8241dgf.e i;
    private int j;

    /* renamed from: o.aWn$d */
    /* loaded from: classes.dex */
    public interface d {
        void d(String str);
    }

    public C2010aWn(C2012aWp c2012aWp, d dVar) {
        this.f = c2012aWp;
        this.e = dVar;
    }

    public void b(String str, String str2, C8241dgf.e eVar, int i, int i2, boolean z, String str3) {
        if (this.c) {
            C1044Mm.d("nf_mdxSwitchTarget", "switching already undergoing");
        }
        if (C8168dfL.g(str)) {
            C1044Mm.d("nf_mdxSwitchTarget", "current target is not a mdx target");
            return;
        }
        this.c = true;
        this.a = str2;
        this.i = eVar;
        this.h = i;
        this.j = i2;
        this.f.e(str, MdxNotificationIntentRetriever.InvocSource.Disconnect.a());
        this.b = z;
        this.d = str3;
    }

    public void c() {
        if (this.c) {
            if (C8168dfL.h(this.a)) {
                this.e.d(this.a);
                C2012aWp c2012aWp = this.f;
                String str = this.a;
                C8241dgf.e eVar = this.i;
                c2012aWp.c(str, eVar.b, this.j, eVar.d, this.h, this.b, this.d);
            }
            this.c = false;
        }
    }
}
