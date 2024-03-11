package o;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.details.DetailsActivityAction;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* renamed from: o.bFl */
/* loaded from: classes.dex */
public interface InterfaceC3643bFl {
    public static final b c = b.b;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.bFl$d */
    /* loaded from: classes.dex */
    public interface d {
        InterfaceC3643bFl A();
    }

    static InterfaceC3643bFl a(Context context) {
        return c.a(context);
    }

    void a(Activity activity, InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder, DetailsActivityAction detailsActivityAction, String str, String str2, Bundle bundle);

    boolean a(Activity activity);

    void b(Activity activity, VideoType videoType, String str, String str2, TrackingInfoHolder trackingInfoHolder, String str3, PlayerExtras playerExtras);

    Class<?> c();

    void c(Activity activity, VideoType videoType, String str, String str2, TrackingInfoHolder trackingInfoHolder, DetailsActivityAction detailsActivityAction, String str3, String str4);

    void c(Activity activity, String str, String str2, TrackingInfoHolder trackingInfoHolder, DetailsActivityAction detailsActivityAction, String str3);

    void c(Context context, VideoType videoType, String str, String str2, TrackingInfoHolder trackingInfoHolder, String str3, Bundle bundle);

    void d(Activity activity, InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder, String str);

    void d(Activity activity, InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder, String str, Bundle bundle);

    boolean d(Activity activity);

    InterfaceC5344bww e();

    void e(Activity activity, InterfaceC5223buh interfaceC5223buh, String str, String str2, TrackingInfoHolder trackingInfoHolder, String str3);

    /* renamed from: o.bFl$b */
    /* loaded from: classes.dex */
    public static final class b {
        static final /* synthetic */ b b = new b();

        private b() {
        }

        public final InterfaceC3643bFl a(Context context) {
            C8632dsu.c((Object) context, "");
            return ((d) EntryPointAccessors.fromApplication(context, d.class)).A();
        }
    }

    /* renamed from: o.bFl$c */
    /* loaded from: classes.dex */
    public static final class c {
        public static /* synthetic */ void a(InterfaceC3643bFl interfaceC3643bFl, Activity activity, VideoType videoType, String str, String str2, TrackingInfoHolder trackingInfoHolder, String str3, PlayerExtras playerExtras, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
            }
            interfaceC3643bFl.b(activity, videoType, str, str2, trackingInfoHolder, str3, (i & 64) != 0 ? null : playerExtras);
        }
    }
}
