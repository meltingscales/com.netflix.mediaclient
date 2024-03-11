package o;

import android.content.SharedPreferences;
import javax.inject.Inject;
import javax.inject.Named;
import o.AbstractC3855bNd;

/* loaded from: classes4.dex */
public final class bNB implements InterfaceC3864bNm {
    private final InterfaceC3856bNe c;
    private final SharedPreferences d;
    public static final b b = new b(null);
    public static final int a = 8;

    @Inject
    public bNB(@Named("GameControllerSharedPreferences") SharedPreferences sharedPreferences, InterfaceC3856bNe interfaceC3856bNe) {
        C8632dsu.c((Object) sharedPreferences, "");
        C8632dsu.c((Object) interfaceC3856bNe, "");
        this.d = sharedPreferences;
        this.c = interfaceC3856bNe;
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    @Override // o.InterfaceC3864bNm
    public AbstractC3855bNd.c a() {
        String string = this.d.getString("UNSHOWN", null);
        if (string == null) {
            string = "";
        }
        return (AbstractC3855bNd.c) this.c.c(string);
    }

    @Override // o.InterfaceC3864bNm
    public AbstractC3855bNd.c c() {
        String string = this.d.getString("SHOWN", null);
        if (string == null) {
            string = "";
        }
        return (AbstractC3855bNd.c) this.c.c(string);
    }

    @Override // o.InterfaceC3864bNm
    public AbstractC3855bNd.c d() {
        String string = this.d.getString("DISMISSED", null);
        if (string == null) {
            string = "";
        }
        return (AbstractC3855bNd.c) this.c.c(string);
    }

    @Override // o.InterfaceC3864bNm
    public void b(AbstractC3855bNd.c cVar) {
        c("UNSHOWN", cVar);
    }

    @Override // o.InterfaceC3864bNm
    public void c(AbstractC3855bNd.c cVar) {
        c("SHOWN", cVar);
    }

    @Override // o.InterfaceC3864bNm
    public void d(AbstractC3855bNd.c cVar) {
        c("DISMISSED", cVar);
    }

    private final void c(String str, AbstractC3855bNd.c cVar) {
        SharedPreferences.Editor edit = this.d.edit();
        if (cVar != null) {
            edit.putString(str, this.c.a(cVar));
        } else {
            edit.putString(str, null);
        }
        edit.apply();
    }
}
