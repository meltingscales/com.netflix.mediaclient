package o;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.cl.model.AppView;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: o.aJx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1670aJx implements InterfaceC1659aJm {
    public static final e d = new e(null);
    private InterfaceC1666aJt c;
    private final Context e;

    @Inject
    public C1670aJx(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        this.e = context;
    }

    /* renamed from: o.aJx$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("PerfImpl");
        }
    }

    @Override // o.InterfaceC1659aJm
    public boolean e() {
        return aJK.d.b(this.e);
    }

    @Override // o.InterfaceC1659aJm
    public InterfaceC1666aJt e(boolean z) {
        if (this.c == null) {
            this.c = new C1669aJw(this.e, z, false, 10000L, null, null, 48, null);
        }
        InterfaceC1666aJt interfaceC1666aJt = this.c;
        C8632dsu.d(interfaceC1666aJt);
        return interfaceC1666aJt;
    }

    @Override // o.InterfaceC1659aJm
    public void c(RecyclerView recyclerView, AppView appView, String str) {
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) str, "");
        if (e()) {
            aJH.b.e(recyclerView, appView, str);
        }
    }

    @Override // o.InterfaceC1659aJm
    public boolean a() {
        return aJK.d.e(this.e);
    }
}
