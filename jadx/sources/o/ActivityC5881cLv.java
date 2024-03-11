package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.ProgressBar;
import androidx.lifecycle.Lifecycle;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.nio.charset.StandardCharsets;
import o.ActivityC5881cLv;
import o.C1044Mm;
import o.C8632dsu;
import o.InterfaceC5283bvo;
import o.SY;
import o.dpR;

@aIA
/* renamed from: o.cLv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ActivityC5881cLv extends NetflixActivity implements InterfaceC5091bsH {
    public static final c a;
    public static final int c;
    private static byte e$ss2$286 = 0;
    private static int f = 0;
    private static int g = 1;
    private String b;
    private ProgressBar d;
    private String e;

    static {
        e();
        a = new c(null);
        c = 8;
    }

    static void e() {
        e$ss2$286 = (byte) 24;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    /* renamed from: d */
    public ActivityC5881cLv createManagerStatusListener() {
        return this;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return null;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean shouldAttachToolbar() {
        return false;
    }

    /* renamed from: o.cLv$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("ActivateProfileActivity");
        }

        public final Intent a(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C1332Xp c1332Xp = C1332Xp.b;
            Intent intent = new Intent((Context) C1332Xp.b(Context.class), ActivityC5881cLv.class);
            intent.putExtra("ProfileName", str);
            intent.putExtra("ProfileGuid", str2);
            return intent;
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            this.b = intent.getStringExtra("ProfileName");
            this.e = intent.getStringExtra("ProfileGuid");
            setContentView(com.netflix.mediaclient.ui.R.i.h);
            View findViewById = findViewById(com.netflix.mediaclient.ui.R.g.dk);
            C8632dsu.a(findViewById, "");
            this.d = (ProgressBar) findViewById;
            if (bundle == null) {
                String str = this.e;
                if (str == null || str.length() == 0) {
                    finish();
                } else {
                    c(this.b, str);
                }
            } else {
                C1645aIz.a(this, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ActivateProfileActivity$onCreate$2
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                        a(serviceManager);
                        return dpR.c;
                    }

                    public final void a(ServiceManager serviceManager) {
                        C8632dsu.c((Object) serviceManager, "");
                        if (serviceManager.F()) {
                            return;
                        }
                        ActivityC5881cLv.this.finish();
                    }
                });
            }
            overridePendingTransition(0, 0);
            return;
        }
        finish();
    }

    @Override // o.InterfaceC5091bsH
    public void onManagerReady(ServiceManager serviceManager, Status status) {
        C8632dsu.c((Object) serviceManager, "");
        C8632dsu.c((Object) status, "");
        PublishSubject<InterfaceC5283bvo> h = C4987bqJ.h();
        Lifecycle.Event event = Lifecycle.Event.ON_DESTROY;
        AndroidLifecycleScopeProvider a2 = AndroidLifecycleScopeProvider.a(this, event);
        C8632dsu.a(a2, "");
        Object as = h.as(AutoDispose.b(a2));
        C8632dsu.b(as, "");
        final drM<InterfaceC5283bvo, dpR> drm = new drM<InterfaceC5283bvo, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ActivateProfileActivity$onManagerReady$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(InterfaceC5283bvo interfaceC5283bvo) {
                b(interfaceC5283bvo);
                return dpR.c;
            }

            public final void b(InterfaceC5283bvo interfaceC5283bvo) {
                ActivityC5881cLv.this.b();
            }
        };
        ((ObservableSubscribeProxy) as).e(new Consumer() { // from class: o.cLw
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ActivityC5881cLv.d(drM.this, obj);
            }
        });
        PublishSubject<StatusCode> e = C4987bqJ.e();
        AndroidLifecycleScopeProvider a3 = AndroidLifecycleScopeProvider.a(this, event);
        C8632dsu.a(a3, "");
        Object as2 = e.as(AutoDispose.b(a3));
        C8632dsu.b(as2, "");
        final drM<StatusCode, dpR> drm2 = new drM<StatusCode, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ActivateProfileActivity$onManagerReady$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(StatusCode statusCode) {
                a(statusCode);
                return dpR.c;
            }

            public final void a(StatusCode statusCode) {
                ActivityC5881cLv activityC5881cLv = ActivityC5881cLv.this;
                C8632dsu.d(statusCode);
                activityC5881cLv.c(statusCode);
            }
        };
        ((ObservableSubscribeProxy) as2).e(new Consumer() { // from class: o.cLs
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ActivityC5881cLv.c(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final void c(final String str, final String str2) {
        C8632dsu.c((Object) str2, "");
        C1645aIz.a(this, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ActivateProfileActivity$startChangeProfile$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                d(serviceManager);
                return dpR.c;
            }

            public final void d(ServiceManager serviceManager) {
                ProgressBar progressBar;
                C8632dsu.c((Object) serviceManager, "");
                ActivityC5881cLv.a.getLogTag();
                C1044Mm.a("Selecting profile: " + str + ", id: " + str2);
                if (!ConnectivityUtils.l(this)) {
                    this.c();
                    return;
                }
                progressBar = this.d;
                if (progressBar == null) {
                    C8632dsu.d("");
                    progressBar = null;
                }
                progressBar.setVisibility(0);
                serviceManager.e(str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ActivityC5881cLv activityC5881cLv) {
        C8632dsu.c((Object) activityC5881cLv, "");
        activityC5881cLv.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ActivityC5881cLv activityC5881cLv, DialogInterface dialogInterface) {
        C8632dsu.c((Object) activityC5881cLv, "");
        activityC5881cLv.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        int i = 2 % 2;
        int i2 = g + 79;
        f = i2 % 128;
        int i3 = i2 % 2;
        String string = getString(com.netflix.mediaclient.ui.R.o.eH);
        if (string.startsWith("'!#+")) {
            int i4 = f + 37;
            g = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            h(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        String string2 = getString(com.netflix.mediaclient.ui.R.o.f13253fi);
        Object obj = null;
        if (!(!string2.startsWith("'!#+"))) {
            int i6 = f + NetflixImageView.DEFAULT_LAYER_GRAVITY;
            g = i6 % 128;
            if (i6 % 2 == 0) {
                Object[] objArr2 = new Object[1];
                h(string2.substring(4), objArr2);
                ((String) objArr2[0]).intern();
                obj.hashCode();
                throw null;
            }
            Object[] objArr3 = new Object[1];
            h(string2.substring(4), objArr3);
            string2 = ((String) objArr3[0]).intern();
        }
        SY.e e = C1163Rc.e(this, this.handler, new C1907aSr(null, string, string2, new Runnable() { // from class: o.cLt
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC5881cLv.c(ActivityC5881cLv.this);
            }
        }));
        e.a(new DialogInterface.OnCancelListener() { // from class: o.cLu
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ActivityC5881cLv.d(ActivityC5881cLv.this, dialogInterface);
            }
        });
        displayDialog(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(StatusCode statusCode) {
        ProgressBar progressBar = this.d;
        if (progressBar == null) {
            C8632dsu.d("");
            progressBar = null;
        }
        progressBar.setVisibility(8);
        if (statusCode != StatusCode.OK) {
            NetflixStatus netflixStatus = new NetflixStatus(statusCode);
            netflixStatus.a((String) null);
            netflixStatus.c(true);
            InterfaceC1640aIu.d.c(this, netflixStatus, false);
            return;
        }
        a.getLogTag();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean handleBackPressed() {
        return getServiceManager().c() && getServiceManager().F();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        a.getLogTag();
        NetflixActivity.finishAllActivities(this);
        startActivity(ActivityC4183bZh.c(this, getUiScreen(), false, false).addFlags(67108864));
    }

    private void h(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$286);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
