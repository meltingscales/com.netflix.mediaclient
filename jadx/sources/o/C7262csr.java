package o;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import java.util.Arrays;
import java.util.Locale;
import javax.inject.Inject;
import o.AbstractC9927zH;

/* renamed from: o.csr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7262csr implements InterfaceC7261csq {
    private final InterfaceC7249cse b;
    private final InterfaceC7303ctf d;

    @Inject
    public C7262csr(InterfaceC7303ctf interfaceC7303ctf, InterfaceC7249cse interfaceC7249cse) {
        C8632dsu.c((Object) interfaceC7303ctf, "");
        C8632dsu.c((Object) interfaceC7249cse, "");
        this.d = interfaceC7303ctf;
        this.b = interfaceC7249cse;
    }

    @Override // o.InterfaceC7261csq
    public AbstractC9927zH e(AbstractC7233csO abstractC7233csO, Activity activity) {
        C8632dsu.c((Object) abstractC7233csO, "");
        C8632dsu.c((Object) activity, "");
        if (!e(abstractC7233csO)) {
            int d = this.d.d(activity, this.b.e());
            if (d > 0) {
                dsE dse = dsE.b;
                String format = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(d)}, 1));
                C8632dsu.a(format, "");
                return new AbstractC9927zH.c(format, null, 2, null);
            } else if (c(abstractC7233csO)) {
                Drawable drawable = AppCompatResources.getDrawable(activity, com.netflix.mediaclient.ui.R.e.z);
                C8632dsu.d(drawable);
                return new AbstractC9927zH.b(drawable);
            } else {
                return AbstractC9927zH.a.d;
            }
        } else if (!abstractC7233csO.i() && abstractC7233csO.b() > 0) {
            Drawable drawable2 = AppCompatResources.getDrawable(activity, com.netflix.mediaclient.ui.R.e.B);
            C8632dsu.d(drawable2);
            return new AbstractC9927zH.b(drawable2);
        } else if (!abstractC7233csO.i() && abstractC7233csO.e() > 0) {
            if (this.d.e()) {
                Drawable drawable3 = AppCompatResources.getDrawable(activity, com.netflix.mediaclient.ui.R.e.A);
                C8632dsu.d(drawable3);
                return new AbstractC9927zH.b(drawable3);
            }
            Drawable drawable4 = AppCompatResources.getDrawable(activity, com.netflix.mediaclient.ui.R.e.C);
            C8632dsu.d(drawable4);
            return new AbstractC9927zH.b(drawable4);
        } else {
            return new AbstractC9927zH.d(abstractC7233csO.d());
        }
    }

    private final boolean c(AbstractC7233csO abstractC7233csO) {
        return abstractC7233csO != null && abstractC7233csO.c() > 0 && abstractC7233csO.a() == abstractC7233csO.c();
    }

    private final boolean e(AbstractC7233csO abstractC7233csO) {
        return (abstractC7233csO == null || abstractC7233csO.c() == 0 || abstractC7233csO.a() == abstractC7233csO.c()) ? false : true;
    }
}
