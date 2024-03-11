package o;

import android.app.Activity;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityComponent;
import o.C8632dsu;
import o.aIB;
import o.dpR;

/* loaded from: classes.dex */
public interface aIB {
    public static final d e = d.e;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes3.dex */
    public interface c {
        aIB x();
    }

    /* loaded from: classes.dex */
    public interface e {
        void run(ServiceManager serviceManager);
    }

    static void b(Activity activity, e eVar) {
        e.c(activity, eVar);
    }

    void c(e eVar);

    void e(drM<? super ServiceManager, dpR> drm);

    /* loaded from: classes3.dex */
    public static final class d {
        static final /* synthetic */ d e = new d();

        private d() {
        }

        public final void c(Activity activity, e eVar) {
            C8632dsu.c((Object) activity, "");
            C8632dsu.c((Object) eVar, "");
            d(activity).c(eVar);
        }

        public final aIB d(Activity activity) {
            C8632dsu.c((Object) activity, "");
            return ((c) EntryPointAccessors.fromActivity(activity, c.class)).x();
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(aIB aib, final e eVar) {
            C8632dsu.c((Object) eVar, "");
            aib.e(new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.netflixactivity.api.ServiceManagerRunner$runWhenManagerIsReady$1
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                    e(serviceManager);
                    return dpR.c;
                }

                public final void e(ServiceManager serviceManager) {
                    C8632dsu.c((Object) serviceManager, "");
                    aIB.e.this.run(serviceManager);
                }
            });
        }
    }
}
