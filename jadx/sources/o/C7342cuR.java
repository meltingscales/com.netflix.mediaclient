package o;

import android.app.Activity;
import android.content.Context;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import o.InterfaceC7343cuS;

/* renamed from: o.cuR  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7342cuR implements InterfaceC7343cuS {
    public static final b e = new b(null);

    @Override // o.InterfaceC7343cuS
    public void a() {
    }

    @Override // o.InterfaceC7343cuS
    public void b() {
    }

    @Override // o.InterfaceC7343cuS
    public void b(boolean z) {
    }

    @Override // o.InterfaceC7343cuS
    public void c() {
    }

    @Override // o.InterfaceC7343cuS
    public boolean c(InterfaceC7343cuS.d dVar, Activity activity, ServiceManager serviceManager) {
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) serviceManager, "");
        return false;
    }

    @Override // o.InterfaceC7343cuS
    public void d() {
    }

    @Override // o.InterfaceC7343cuS
    public boolean d(ServiceManager serviceManager, boolean z) {
        C8632dsu.c((Object) serviceManager, "");
        return false;
    }

    @Override // o.InterfaceC7343cuS
    public boolean e() {
        return false;
    }

    @Override // o.InterfaceC7343cuS
    public boolean f() {
        return false;
    }

    @Override // o.InterfaceC7343cuS
    public boolean g() {
        return false;
    }

    @Override // o.InterfaceC7343cuS
    public boolean h() {
        return false;
    }

    /* renamed from: o.cuR$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("TutorialHelperImpl");
        }
    }

    @Override // o.InterfaceC7343cuS
    public boolean d(Context context) {
        C8632dsu.c((Object) context, "");
        return NetflixActivity.isTutorialOn() && !C9764wZ.b.a(context, "USER_FIRST_TIME_PROFILE_EDUCATION");
    }

    @Override // o.InterfaceC7343cuS
    public void b(Context context) {
        C8632dsu.c((Object) context, "");
        C9764wZ.b.c(context, "USER_FIRST_TIME_PROFILE_EDUCATION");
    }
}
