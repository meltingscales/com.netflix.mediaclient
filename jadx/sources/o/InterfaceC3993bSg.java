package o;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import com.netflix.mediaclient.ui.home.api.Params;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import java.util.Optional;

/* renamed from: o.bSg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3993bSg {
    public static final a e = a.c;

    @EntryPoint
    @InstallIn({aFU.class})
    /* renamed from: o.bSg$b */
    /* loaded from: classes4.dex */
    public interface b {
        InterfaceC3993bSg k();
    }

    static InterfaceC3993bSg e(Context context) {
        return e.b(context);
    }

    Fragment a();

    Fragment a(Params.Lolomo lolomo);

    Object a(int i, int i2, InterfaceC8585dra<? super C4003bSq> interfaceC8585dra);

    Object a(int i, boolean z, InterfaceC8585dra<? super C4003bSq> interfaceC8585dra);

    Object a(InterfaceC8585dra<? super Optional<InterfaceC5155btS>> interfaceC8585dra);

    Fragment d(String str);

    Object d(InterfaceC8585dra<? super dpR> interfaceC8585dra);

    void d(Activity activity, drO<dpR> dro);

    Fragment e(String str);

    Object e(int i, boolean z, InterfaceC8585dra<? super C4003bSq> interfaceC8585dra);

    Object e(String str, int i, int i2, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    /* renamed from: o.bSg$a */
    /* loaded from: classes4.dex */
    public static final class a {
        static final /* synthetic */ a c = new a();

        private a() {
        }

        public final InterfaceC3993bSg b(Context context) {
            Object e;
            C8632dsu.c((Object) context, "");
            if (context instanceof NetflixActivityBase) {
                e = (Activity) context;
            } else if (context instanceof Fragment) {
                e = ((Fragment) context).requireActivity();
            } else if (!(context instanceof View)) {
                throw new IllegalStateException("Injecting profile scoped object into " + context + " is not supported");
            } else {
                e = C8141del.e((View) context);
            }
            C8632dsu.d(e);
            return ((b) C1642aIw.b((NetflixActivityBase) e, b.class)).k();
        }
    }
}
