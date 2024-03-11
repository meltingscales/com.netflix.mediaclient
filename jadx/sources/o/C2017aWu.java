package o;

import android.content.Context;
import android.content.Intent;
import androidx.mediarouter.media.MediaRouter;
import com.google.android.gms.cast.framework.CastContext;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Mdx;

/* renamed from: o.aWu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2017aWu extends MediaRouter.Callback {
    private final CastContext a;
    private final InterfaceC2018aWv b;
    private final MediaRouter c;
    private InterfaceC1072Nq d;
    private final boolean e = Config_FastProperty_Mdx.shouldRemoveCallbackOnBackground();

    public C2017aWu(Context context, CastContext castContext, InterfaceC2018aWv interfaceC2018aWv) {
        this.c = MediaRouter.getInstance(context.getApplicationContext());
        this.a = castContext;
        this.b = interfaceC2018aWv;
        h();
    }

    public void b() {
        C1044Mm.e("CafRouteManager", "enable - enabling router");
        if (this.c != null) {
            if (Config_FastProperty_Mdx.shouldCastScanActivelyAlways()) {
                a();
            } else {
                e();
            }
            d();
        }
    }

    public void c() {
        C1044Mm.e("CafRouteManager", "disable - disabling router");
        MediaRouter mediaRouter = this.c;
        if (mediaRouter != null) {
            mediaRouter.removeCallback(this);
        }
    }

    public MediaRouter.RouteInfo e(String str) {
        if (C8168dfL.h(str)) {
            for (MediaRouter.RouteInfo routeInfo : this.c.getRoutes()) {
                if (str.equalsIgnoreCase(C8183dfa.e(routeInfo.getId()))) {
                    return routeInfo;
                }
            }
            return null;
        }
        return null;
    }

    private void h() {
        if (!this.e) {
            C1044Mm.e("CafRouteManager", "Do NOT remove callback on background, do NOT ADD listener for app state.");
            return;
        }
        this.d = new C1076Nu() { // from class: o.aWu.1
            @Override // o.C1076Nu, o.InterfaceC1072Nq
            public void c(NC nc, Intent intent) {
                if (C2017aWu.this.c != null) {
                    if (Config_FastProperty_Mdx.shouldCastScanActivelyAlways()) {
                        C1044Mm.e("CafRouteManager", "Foregrounding:: start active scan!");
                        C2017aWu.this.a();
                        return;
                    }
                    C1044Mm.e("CafRouteManager", "Foregrounding:: start passive scan!");
                    C2017aWu.this.e();
                    return;
                }
                C1044Mm.j("CafRouteManager", "Foregrounding:: media router is null!");
            }

            @Override // o.C1076Nu, o.InterfaceC1072Nq
            public void a(NC nc, boolean z) {
                boolean z2 = C2017aWu.this.c != null;
                if (z2 && C2017aWu.this.e) {
                    C1044Mm.e("CafRouteManager", "Backgrounding:: remove callback from media router");
                    C2017aWu.this.c.removeCallback(C2017aWu.this);
                    return;
                }
                C1044Mm.j("CafRouteManager", "Backgrounding:: media router is null (%b) or we do not allow removal of callback on backgrounding (%b)", Boolean.valueOf(!z2), Boolean.valueOf(true ^ C2017aWu.this.e));
            }
        };
        C1044Mm.e("CafRouteManager", "Remove callback on background, do ADD listener for app state.");
        AbstractApplicationC1040Mh.getInstance().o().c(this.d);
    }

    public void a() {
        if (this.c != null) {
            C1044Mm.e("CafRouteManager", "doActiveScan");
            this.c.addCallback(this.a.getMergedSelector(), this, 1);
        }
    }

    public void e() {
        if (this.c != null) {
            C1044Mm.e("CafRouteManager", "doPassiveScan");
            this.c.addCallback(this.a.getMergedSelector(), this, 4);
        }
    }

    @Override // androidx.mediarouter.media.MediaRouter.Callback
    public void onRouteSelected(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        C1044Mm.a("CafRouteManager", "CafRouteManager onRouteSelected - route: %s", routeInfo.getName());
        super.onRouteSelected(mediaRouter, routeInfo);
    }

    @Override // androidx.mediarouter.media.MediaRouter.Callback
    public void onRouteUnselected(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, int i) {
        C1044Mm.a("CafRouteManager", "CafRouteManager onRouteUnselected - route: %s", routeInfo.getName());
        super.onRouteUnselected(mediaRouter, routeInfo, i);
    }

    @Override // androidx.mediarouter.media.MediaRouter.Callback
    public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        super.onRouteAdded(mediaRouter, routeInfo);
        c(routeInfo);
    }

    @Override // androidx.mediarouter.media.MediaRouter.Callback
    public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        super.onRouteRemoved(mediaRouter, routeInfo);
        String e = C8183dfa.e(routeInfo.getId());
        if (e == null) {
            C1044Mm.j("CafRouteManager", "CafRouteManager onRouteRemoved - couldn't get UUID for route - routeId: %s", routeInfo.getId());
            return;
        }
        C1044Mm.c("CafRouteManager", "CafRouteManager onRouteRemoved - name: %s, uuid: %s", routeInfo.getName(), e);
        this.b.a(e);
    }

    @Override // androidx.mediarouter.media.MediaRouter.Callback
    public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        C1044Mm.a("CafRouteManager", "CafRouteManager onRouteChanged - name: %s, uuid: %s", routeInfo.getName(), routeInfo.getId());
        super.onRouteChanged(mediaRouter, routeInfo);
        c(routeInfo);
    }

    private void d() {
        for (MediaRouter.RouteInfo routeInfo : this.c.getRoutes()) {
            if (routeInfo.matchesSelector(this.a.getMergedSelector())) {
                C1044Mm.a("CafRouteManager", "handleExistingRoutes - route matches selector: %s", routeInfo.getName());
                c(routeInfo);
            }
        }
    }

    private void c(MediaRouter.RouteInfo routeInfo) {
        boolean z;
        String e = C8183dfa.e(routeInfo.getId());
        if (e == null) {
            C1044Mm.j("CafRouteManager", "CafRouteManager handleAddedRoute - couldn't get UUID for route - routeId: %s", routeInfo.getId());
            return;
        }
        String name = routeInfo.getName();
        String d = C8183dfa.d(routeInfo);
        try {
            z = routeInfo.isSelected();
        } catch (IllegalStateException e2) {
            C1044Mm.b("CafRouteManager", e2, "The media router has not yet been fully initialized, no selected route", new Object[0]);
            InterfaceC1598aHf.a("CAST:handleAddedRoute:: There is no currently selected route. The media router has not yet been fully initialized");
            z = false;
        }
        C1044Mm.c("CafRouteManager", "CafRouteManager handleAddedRoute - friendlyName: %s, uuid: %s, location: %s, isSelected: %b", name, e, d, Boolean.valueOf(z));
        this.b.a(e, name, d, z);
    }
}
