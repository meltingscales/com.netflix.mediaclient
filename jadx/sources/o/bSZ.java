package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab55851_MobileNav;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.home.HomeActivity;
import io.reactivex.Observable;
import io.reactivex.Single;
import javax.inject.Inject;
import kotlin.LazyThreadSafetyMode;
import o.C8168dfL;
import o.C8632dsu;
import o.C9936zQ;
import o.InterfaceC9934zO;

/* loaded from: classes6.dex */
public final class bSZ implements InterfaceC9934zO {
    private final AppView a;
    private final Application b;
    private final Class<HomeActivity> c;
    private final InterfaceC9934zO.b.a d;
    private final CommandValue e;
    private final InterfaceC8554dpx h;

    @Override // o.InterfaceC9934zO
    public CommandValue a() {
        return this.e;
    }

    @Override // o.InterfaceC9934zO
    public Class<HomeActivity> c() {
        return this.c;
    }

    @Override // o.InterfaceC9934zO
    public AppView d() {
        return this.a;
    }

    @Override // o.InterfaceC9934zO
    public boolean e(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return true;
    }

    @Override // o.InterfaceC9934zO
    /* renamed from: i */
    public InterfaceC9934zO.b.a e() {
        return this.d;
    }

    @Inject
    public bSZ(Application application) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) application, "");
        this.b = application;
        this.c = HomeActivity.class;
        this.a = AppView.homeTab;
        this.e = CommandValue.HomeCommand;
        this.d = InterfaceC9934zO.b.a.c;
        b = dpB.b(LazyThreadSafetyMode.e, new drO<C9936zQ>() { // from class: com.netflix.mediaclient.ui.home.impl.HomeTab$tab$2

            /* loaded from: classes6.dex */
            public final /* synthetic */ class c {
                public static final /* synthetic */ int[] a;
                public static final /* synthetic */ int[] b;

                static {
                    int[] iArr = new int[Config_Ab55851_MobileNav.LolomoTabIcon.values().length];
                    try {
                        iArr[Config_Ab55851_MobileNav.LolomoTabIcon.b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Config_Ab55851_MobileNav.LolomoTabIcon.d.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    b = iArr;
                    int[] iArr2 = new int[Config_Ab55851_MobileNav.LolomoTabName.values().length];
                    try {
                        iArr2[Config_Ab55851_MobileNav.LolomoTabName.d.ordinal()] = 1;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr2[Config_Ab55851_MobileNav.LolomoTabName.c.ordinal()] = 2;
                    } catch (NoSuchFieldError unused4) {
                    }
                    a = iArr2;
                }
            }

            @Override // o.drO
            /* renamed from: b */
            public final C9936zQ invoke() {
                Config_Ab55851_MobileNav.c cVar = Config_Ab55851_MobileNav.a;
                int i = c.b[cVar.d().a().ordinal()];
                int i2 = i != 1 ? i != 2 ? R.e.al : R.e.ak : R.e.ai;
                int i3 = c.a[cVar.d().i().ordinal()];
                int i4 = i3 != 1 ? i3 != 2 ? R.o.lF : R.o.li : R.o.lI;
                int i5 = R.g.cu;
                String d = C8168dfL.d(i4);
                C8632dsu.a(d, "");
                return new C9936zQ(i5, d, i2, null, 8, null);
            }
        });
        this.h = b;
    }

    @Override // o.InterfaceC9934zO
    public Single<Boolean> a(Activity activity) {
        return InterfaceC9934zO.a.c(this, activity);
    }

    @Override // o.InterfaceC9934zO
    public Observable<AbstractC9927zH> b(Activity activity) {
        return InterfaceC9934zO.a.d(this, activity);
    }

    @Override // o.InterfaceC9934zO
    public boolean c(Activity activity) {
        return InterfaceC9934zO.a.a(this, activity);
    }

    @Override // o.InterfaceC9934zO
    public boolean d(Activity activity) {
        return InterfaceC9934zO.a.b(this, activity);
    }

    @Override // o.InterfaceC9934zO
    public Observable<String> f() {
        return InterfaceC9934zO.a.c(this);
    }

    @Override // o.InterfaceC9934zO
    public Observable<Boolean> g() {
        return InterfaceC9934zO.a.d(this);
    }

    @Override // o.InterfaceC9934zO
    public C9936zQ b() {
        return (C9936zQ) this.h.getValue();
    }

    @Override // o.InterfaceC9934zO
    public Intent b(AppView appView) {
        Intent d = HomeActivity.d((Context) this.b, appView, false);
        C8632dsu.a(d, "");
        return d;
    }
}
