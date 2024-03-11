package o;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.functions.Action;
import io.reactivex.subjects.CompletableSubject;
import java.util.List;
import javax.inject.Inject;

/* renamed from: o.bFq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3648bFq implements InterfaceC3645bFn {
    public static final d e = new d(null);
    private final InterfaceC3663bGe c;
    private final InterfaceC3659bGa d;

    @Override // o.InterfaceC3645bFn
    public void c(ServiceManager serviceManager, List<? extends InterfaceC5177bto> list) {
    }

    @Override // o.InterfaceC3645bFn
    public void e(ServiceManager serviceManager, List<? extends InterfaceC5177bto> list) {
    }

    @Inject
    public C3648bFq(InterfaceC3663bGe interfaceC3663bGe, InterfaceC3659bGa interfaceC3659bGa) {
        C8632dsu.c((Object) interfaceC3663bGe, "");
        C8632dsu.c((Object) interfaceC3659bGa, "");
        this.c = interfaceC3663bGe;
        this.d = interfaceC3659bGa;
    }

    /* renamed from: o.bFq$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("DetailsPagePrefetcherImpl ");
        }
    }

    @Override // o.InterfaceC3645bFn
    public void e(final ServiceManager serviceManager, final List<? extends InterfaceC5177bto> list, Activity activity) {
        C8632dsu.c((Object) activity, "");
        CompletableSubject j = NetflixApplication.getInstance().j();
        C8632dsu.a(j, "");
        AndroidLifecycleScopeProvider a = AndroidLifecycleScopeProvider.a((AppCompatActivity) activity, Lifecycle.Event.ON_DESTROY);
        C8632dsu.a(a, "");
        Object as = j.as(AutoDispose.b(a));
        C8632dsu.b(as, "");
        ((CompletableSubscribeProxy) as).e(new Action() { // from class: o.bFs
            @Override // io.reactivex.functions.Action
            public final void run() {
                C3648bFq.d(C3648bFq.this, serviceManager, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C3648bFq c3648bFq, ServiceManager serviceManager, List list) {
        C8632dsu.c((Object) c3648bFq, "");
        e.getLogTag();
        c3648bFq.c(serviceManager, list);
    }
}
