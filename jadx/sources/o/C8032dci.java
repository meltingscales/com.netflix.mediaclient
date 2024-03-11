package o;

import android.app.Application;
import androidx.fragment.app.Fragment;
import com.netflix.mediaclient.startup.ApplicationStartupListener;
import javax.inject.Inject;
import o.AbstractC6677chn;
import o.dpR;

/* renamed from: o.dci  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8032dci implements ApplicationStartupListener {
    private final Application b;

    @Inject
    public C8032dci(Application application) {
        C8632dsu.c((Object) application, "");
        this.b = application;
    }

    /* renamed from: o.dci$e */
    /* loaded from: classes5.dex */
    public static final class e implements AbstractC6677chn.a {
        @Override // o.AbstractC6677chn.a
        public AbstractC6677chn d(Fragment fragment) {
            C8632dsu.c((Object) fragment, "");
            return new C8028dce(new drO<dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksApplicationImpl$onApplicationCreated$1$create$1
                public final void b() {
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    b();
                    return dpR.c;
                }
            });
        }

        e() {
        }
    }

    @Override // com.netflix.mediaclient.startup.ApplicationStartupListener
    public void onApplicationCreated(Application application) {
        C8632dsu.c((Object) application, "");
        AbstractC6677chn.j.d("CreateUserMarks", new e());
    }
}
