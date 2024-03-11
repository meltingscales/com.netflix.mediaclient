package o;

import android.app.Activity;
import android.content.Context;
import com.netflix.android.volley.VolleyError;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.bDF;

/* loaded from: classes4.dex */
public abstract class bDE implements InteractiveTrackerInterface {
    private static a d;
    private boolean a;
    private boolean c;
    private InteractiveTrackerInterface.c e;
    private final List<C5165btc> f = new ArrayList();
    private final Set<bDF> i = new HashSet();
    private Set<C8261dgz> g = new HashSet();
    private HashMap<Integer, bDA> b = new HashMap<>();

    /* loaded from: classes4.dex */
    public interface a {
        void b(bDA bda);

        void e(String str);
    }

    /* loaded from: classes4.dex */
    public static class b extends bDE {
        public static final String e = Sessions.TTR.toString();

        @Override // com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface
        public String a() {
            return e;
        }
    }

    /* loaded from: classes4.dex */
    public static class c extends bDE {
        public static final String c = Sessions.PROFILE_GATE.toString();

        @Override // com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface
        public String a() {
            return c;
        }
    }

    /* loaded from: classes4.dex */
    public static class d extends bDE {
        public static final String e = Sessions.DP_TTR.toString();

        @Override // com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface
        public String a() {
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes4.dex */
    public interface e {
        InterfaceC5844cKl at();
    }

    public boolean b() {
        return this.a;
    }

    @Override // com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface
    public void a(InteractiveTrackerInterface.c cVar) {
        d();
        this.e = cVar;
    }

    @Override // com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface
    public void c(String str) {
        for (C8261dgz c8261dgz : this.g) {
            this.f.add(new C5165btc(c8261dgz.e(), c8261dgz.a, System.currentTimeMillis(), null, 0, null));
        }
        d();
        if (b()) {
            return;
        }
        b(IClientLogging.CompletionReason.canceled, str);
    }

    @Override // com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface
    public void e() {
        this.a = false;
        this.c = false;
        this.f.clear();
    }

    private void b(IClientLogging.CompletionReason completionReason, String str) {
        InteractiveTrackerInterface.c cVar = this.e;
        if (cVar == null) {
            C1044Mm.e("InteractiveTrackerImpl", "... but there was no listener attached so tracking has not completed");
            return;
        }
        this.a = true;
        this.c = true;
        cVar.c(completionReason.toImageLoaderReason(), str, this.f);
        this.f.clear();
        a aVar = d;
        if (aVar != null) {
            aVar.e(completionReason.toString());
        }
        C1044Mm.a("InteractiveTrackerImpl", "isNowInteractive() -> %s", a());
    }

    @Override // com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface
    public void b(C8261dgz c8261dgz, ImageLoader.a aVar, boolean z) {
        boolean a2 = a(z, aVar);
        if (d != null) {
            bDA bda = new bDA();
            bda.b(System.currentTimeMillis());
            bda.c(aVar != null);
            bda.b(a2);
            if (c8261dgz.e() != null) {
                bda.d(c8261dgz.e());
            }
            this.b.put(Integer.valueOf(c8261dgz.hashCode()), bda);
        }
        if (a2) {
            this.g.add(c8261dgz);
            if (aVar != null) {
                bDF bdf = new bDF(aVar.getImageView(), new bDF.e() { // from class: o.bDD
                    @Override // o.bDF.e
                    public final void a() {
                        bDE.this.i();
                    }
                });
                this.i.add(bdf);
                aVar.getImageView().getViewTreeObserver().addOnPreDrawListener(bdf);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        if (b() || !this.g.isEmpty()) {
            return;
        }
        b(IClientLogging.CompletionReason.success, "success");
    }

    protected boolean a(boolean z, ImageLoader.a aVar) {
        return z || b(aVar);
    }

    private void d() {
        for (bDF bdf : this.i) {
            bdf.e();
        }
        this.i.clear();
        this.g.clear();
    }

    @Override // com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface
    public void e(C8261dgz c8261dgz, C8259dgx c8259dgx, ImageLoader.AssetLocationType assetLocationType, VolleyError volleyError) {
        bDA remove;
        if (assetLocationType == ImageLoader.AssetLocationType.PLACEHOLDER) {
            return;
        }
        if (d != null && (remove = this.b.remove(Integer.valueOf(c8261dgz.hashCode()))) != null) {
            remove.d(System.currentTimeMillis());
            if (assetLocationType != null) {
                remove.e(assetLocationType.toString());
            }
            d.b(remove);
        }
        if (this.g.remove(c8261dgz)) {
            this.f.add(new C5165btc(c8261dgz.e(), c8261dgz.a, System.currentTimeMillis(), assetLocationType, (c8259dgx == null || c8259dgx.d() == null) ? 0 : c8259dgx.d().getAllocationByteCount(), volleyError));
            if (!this.g.isEmpty() || assetLocationType == ImageLoader.AssetLocationType.MEMCACHE) {
                return;
            }
            C1044Mm.e("InteractiveTrackerImpl", "onInteractive");
            b(IClientLogging.CompletionReason.success, "success");
        }
    }

    public boolean b(ImageLoader.a aVar) {
        if (this.c || b() || aVar == null) {
            return false;
        }
        boolean a2 = a((Activity) C8054ddD.a(aVar.getContext(), Activity.class));
        C1044Mm.d("InteractiveTrackerImpl", "Track %s for %s? - %b", aVar.getContentDescription(), a(), Boolean.valueOf(a2));
        return a2;
    }

    public boolean a(Activity activity) {
        if (c()) {
            if (activity == null || !InterfaceC3643bFl.a((Context) activity).a(activity)) {
                return false;
            }
            return ((NetflixActivity) activity).getFragmentHelper().j();
        } else if (f()) {
            return b(activity);
        } else {
            return activity instanceof HomeActivity;
        }
    }

    protected boolean c() {
        return a().equals(d.e);
    }

    private boolean f() {
        return a().equals(c.c);
    }

    private boolean b(Activity activity) {
        return ((e) EntryPointAccessors.fromApplication(activity, e.class)).at().b(activity);
    }
}
