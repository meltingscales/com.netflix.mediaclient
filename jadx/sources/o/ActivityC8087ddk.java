package o;

import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Base64;
import android.view.View;
import android.widget.ViewFlipper;
import androidx.core.app.ActivityCompat;
import com.google.android.material.snackbar.Snackbar;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.context.Volume;
import com.netflix.cl.model.event.discrete.VolumeChanged;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.webclient.model.leafs.VoipCallConfigData;
import com.netflix.mediaclient.servicemgr.CustomerServiceLogging;
import com.netflix.mediaclient.servicemgr.IVoip;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import java.nio.charset.StandardCharsets;
import o.C1163Rc;
import o.C8094ddr;

@InterfaceC1639aIt
/* renamed from: o.ddk  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class ActivityC8087ddk extends NetflixActivity implements IVoip.d {
    private static String[] b = null;
    private static final String[] d;
    private static byte e$ss2$7118 = 0;
    private static int r = 0;
    private static int s = 1;
    private a a;
    private boolean e;
    private CustomerServiceLogging.EntryPoint f;
    private View g;
    private C8088ddl i;
    private boolean j;
    private C8086ddj k;
    private CustomerServiceLogging.ReturnToDialScreenFrom m;
    private ViewFlipper n;

    /* renamed from: o  reason: collision with root package name */
    private ServiceManager f13833o;
    private boolean p;
    private IVoip t;
    private boolean h = false;
    private boolean c = false;
    private final View.OnClickListener l = new View.OnClickListener() { // from class: o.ddk.4
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityC8087ddk.this.performAction(view);
        }
    };

    private void a(int i, String[] strArr, int[] iArr) {
    }

    static void h() {
        e$ss2$7118 = (byte) 24;
    }

    private int m() {
        return 4718592;
    }

    public void a() {
        this.c = true;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean alwaysAllowScreenMirroring() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IVoip e() {
        return this.t;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean hasUpAction() {
        return true;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean shouldFinishOnManagerError() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean shouldStartLaunchActivityIfVisibleOnManagerUnavailable() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showMdxInMenu() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showSettingsInMenu() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showSignOutInMenu() {
        return false;
    }

    static {
        h();
        d = l();
        b = new String[]{"android.permission.RECORD_AUDIO", "android.permission.MODIFY_AUDIO_SETTINGS"};
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1044Mm.e("VoipActivity", "onCreate");
        e(getIntent());
        this.a = new a(this);
        setVolumeControlStream(0);
        getApplicationContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.a);
        if (bundle != null) {
            this.p = bundle.getBoolean("com.netflix.mediaclient.ui.voip.verification_dialog");
            this.h = bundle.getBoolean("com.netflix.mediaclient.ui.voip.dial.requested", false);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C1044Mm.e("VoipActivity", "Saving dialog state...");
        bundle.putBoolean("com.netflix.mediaclient.ui.voip.verification_dialog", this.p);
        bundle.putBoolean("com.netflix.mediaclient.ui.voip.dial.requested", this.h);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        synchronized (this) {
            super.onResume();
            if (getServiceManager() != null && this.p) {
                j();
            }
        }
    }

    private void s() {
        getWindow().addFlags(m());
    }

    private void f() {
        getWindow().clearFlags(m());
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.f13833o != null) {
            t();
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f = null;
    }

    private void t() {
        C1044Mm.e("VoipActivity", "Back to ContactUsActivity");
        if (this.j) {
            C1044Mm.e("VoipActivity", "Dialer visible, report back to ");
        } else {
            C1044Mm.e("VoipActivity", "Help section visible, report new help request session started");
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        e(getIntent());
        if (this.f13833o != null) {
            t();
        }
    }

    private void e(Intent intent) {
        b(intent);
        d(intent);
    }

    private void d(Intent intent) {
        if (intent == null || !intent.getBooleanExtra("AUTODIAL", false)) {
            this.e = false;
        } else {
            C1044Mm.e("VoipActivity", "AutoDial requested");
            this.e = true;
        }
        if (!this.e || this.f13833o == null) {
            return;
        }
        C1044Mm.e("VoipActivity", "Start autodial, service manager exist");
        c();
    }

    private void b(Intent intent) {
        if (intent == null) {
            return;
        }
        C1044Mm.c("VoipActivity", intent);
        if (intent.getStringExtra(NetflixActivity.EXTRA_FROM) != null) {
            this.m = CustomerServiceLogging.ReturnToDialScreenFrom.valueOf(intent.getStringExtra(NetflixActivity.EXTRA_FROM));
            C1044Mm.e("VoipActivity", "From found: " + this.m);
        }
        if (intent.getStringExtra(NetflixActivity.EXTRA_ENTRY) != null) {
            this.f = CustomerServiceLogging.EntryPoint.valueOf(intent.getStringExtra(NetflixActivity.EXTRA_ENTRY));
            C1044Mm.e("VoipActivity", "Entry point found: " + this.f);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, o.AbstractActivityC1635aIp, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ServiceManager serviceManager;
        super.onDestroy();
        C8088ddl c8088ddl = this.i;
        if (c8088ddl != null) {
            c8088ddl.e();
        }
        C8086ddj c8086ddj = this.k;
        if (c8086ddj != null) {
            c8086ddj.b();
        }
        IVoip iVoip = this.t;
        if (iVoip != null) {
            iVoip.b(this);
            if (!this.t.g() && (serviceManager = this.f13833o) != null && serviceManager.B() != null) {
                this.f13833o.B().a();
            }
            this.t = null;
        }
        getApplicationContext().getContentResolver().unregisterContentObserver(this.a);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return new InterfaceC5091bsH() { // from class: o.ddk.3
            @Override // o.InterfaceC5091bsH
            public void onManagerReady(ServiceManager serviceManager, Status status) {
                C1044Mm.e("VoipActivity", "Manager is here!");
                ActivityC8087ddk.this.c(serviceManager, status);
            }

            @Override // o.InterfaceC5091bsH
            public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
                C1044Mm.d("VoipActivity", "Netflix service is not fully initialized, but we still need to provide help!");
                ActivityC8087ddk.this.c(serviceManager, status);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(ServiceManager serviceManager, Status status) {
        this.f13833o = serviceManager;
        this.t = serviceManager.y();
        d(status.i());
        IVoip iVoip = this.t;
        if (iVoip != null) {
            iVoip.e(this);
        } else {
            C1044Mm.j("VoipActivity", "VOIP is null!");
        }
        t();
        if (this.p) {
            C1044Mm.e("VoipActivity", "Verification dialog was previosly displayed, show it again");
            j();
        }
    }

    private void d(boolean z) {
        setContentView(C8094ddr.a.e);
        b(C8094ddr.b.I);
        b(C8094ddr.b.F);
        b(C8094ddr.b.K);
        b(C8094ddr.b.s);
        b(C8094ddr.b.G);
        b(C8094ddr.b.C);
        b(C8094ddr.b.E);
        b(C8094ddr.b.f13835J);
        b(C8094ddr.b.M);
        b(C8094ddr.b.r);
        b(C8094ddr.b.B);
        getSupportActionBar().hide();
        this.n = (ViewFlipper) findViewById(C8094ddr.b.f13836o);
        this.k = new C8086ddj(this);
        this.i = new C8088ddl(this);
        this.g = findViewById(C8094ddr.b.s);
        if (z || this.f13833o.B().b()) {
            C1044Mm.a("VoipActivity", "VOIP is enabled, show dial button on landing page! This is force enabled: %b", Boolean.valueOf(z));
            this.g.setVisibility(0);
        } else {
            C1044Mm.e("VoipActivity", "VOIP is disabled, do not show dial button on landing page!");
            this.g.setVisibility(8);
        }
        this.k.a();
        this.i.e(this.f13833o.y() != null && this.f13833o.y().j());
        this.i.d();
        IVoip iVoip = this.t;
        if (iVoip != null && iVoip.g()) {
            C1044Mm.e("VoipActivity", "Call is in progress, move to dialer");
            o();
        } else if (this.h) {
            C1044Mm.e("VoipActivity", "Dial was requested in Landscape mode, dialing now");
            this.h = false;
            g();
        } else {
            C1044Mm.e("VoipActivity", "Call is not in progress, leave on landing page");
        }
    }

    private void b(int i) {
        View findViewById = findViewById(i);
        if (findViewById != null) {
            findViewById.setOnClickListener(this.l);
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip.d
    public void b(IVoip.b bVar) {
        if (isFinishing()) {
            return;
        }
        this.i.c();
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip.d
    public void d(IVoip.b bVar) {
        if (isFinishing()) {
            return;
        }
        this.i.b();
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip.d
    public void c(IVoip.b bVar) {
        if (isFinishing()) {
            return;
        }
        if (this.j) {
            C1044Mm.e("VoipActivity", "callDisconnected:: Back to landing page contact us");
            p();
        } else {
            C1044Mm.e("VoipActivity", "callDisconnected:: Already back to landing page contact us");
        }
        this.i.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        f();
        if (!isTablet()) {
            C1044Mm.e("VoipActivity", "Phone, release lock on portrait for dial screen");
            setRequestedOrientation(-1);
        }
        this.n.showPrevious();
        this.j = false;
    }

    private void o() {
        s();
        if (!isTablet()) {
            C1044Mm.e("VoipActivity", "Phone, lock on portrait for dial screen");
            setRequestedOrientation(1);
        }
        this.n.showNext();
        this.j = true;
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip.d
    public void e(IVoip.b bVar) {
        if (isFinishing()) {
            return;
        }
        if (this.j) {
            C1044Mm.e("VoipActivity", "networkFailed:: Back to landing page contact us");
            p();
        } else {
            C1044Mm.e("VoipActivity", "networkFailed:: Already back to landing page contact us");
        }
        this.i.a();
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip.d
    public void a(IVoip.b bVar) {
        if (isFinishing()) {
            return;
        }
        if (this.j) {
            C1044Mm.e("VoipActivity", "callEnded:: Back to landing page contact us");
            p();
            return;
        }
        C1044Mm.e("VoipActivity", "callEnded:: Already back to landing page contact us");
    }

    public void e(IVoip.b bVar, String str, int i) {
        if (isFinishing()) {
            return;
        }
        if (this.j) {
            C1044Mm.e("VoipActivity", "callFailed:: Back to landing page contact us");
            p();
        } else {
            C1044Mm.e("VoipActivity", "callFailed:: Already back to landing page contact us");
        }
        C8088ddl c8088ddl = this.i;
        if (c8088ddl != null) {
            c8088ddl.a();
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.IVoip.d
    public void c(boolean z) {
        if (isFinishing()) {
            return;
        }
        this.g.setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (q()) {
            C1044Mm.e("VoipActivity", "User is in test cell to display confirmation dialog");
            j();
            return;
        }
        C1044Mm.e("VoipActivity", "Start call");
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        C1044Mm.e("VoipActivity", "fetching voip config before dialing");
        if (C8204dfv.e(this, b)) {
            C1044Mm.e("VoipActivity", "Record audio permission (and bluetooth connect) are not granted. Requested them.");
            r();
            return;
        }
        ServiceManager serviceManager = this.f13833o;
        if (serviceManager != null && serviceManager.B() != null && !this.f13833o.B().e()) {
            C1044Mm.e("VoipActivity", "startDial Failed:: a GSM call is currently ongoing");
            d(getResources().getString(C8094ddr.i.g));
            return;
        }
        C1044Mm.e("VoipActivity", "Record audio permission has already been granted. Start dialing.");
        if (!this.j) {
            if (!isTablet() && getResources().getConfiguration().orientation == 2) {
                C1044Mm.e("VoipActivity", "We are in Landscape, switch to portrait first and then dial");
                this.h = true;
                o();
                return;
            }
            o();
            this.c = false;
            ServiceManager serviceManager2 = this.f13833o;
            if (serviceManager2 == null || serviceManager2.B() == null) {
                return;
            }
            this.f13833o.B().c(new InterfaceC1832aPx() { // from class: o.ddk.2
                @Override // o.InterfaceC1832aPx
                public void c(VoipCallConfigData voipCallConfigData, Status status) {
                    if (status.j() && voipCallConfigData != null) {
                        ActivityC8087ddk.this.a(voipCallConfigData);
                        return;
                    }
                    C1044Mm.e("VoipActivity", "fetchVoipConfigData Failed:: Back to landing page contact us");
                    ActivityC8087ddk activityC8087ddk = ActivityC8087ddk.this;
                    activityC8087ddk.d(activityC8087ddk.getResources().getString(C8094ddr.i.f));
                    ActivityC8087ddk.this.p();
                }
            });
            return;
        }
        C1044Mm.e("VoipActivity", "fetchConfigAndDial:: Already in dialer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        displayDialog(C1163Rc.c(this, this.handler, new C1907aSr("", str, null, null), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(VoipCallConfigData voipCallConfigData) {
        if (isFinishing() || this.c) {
            this.c = false;
            return;
        }
        if (!isTablet()) {
            C1044Mm.e("VoipActivity", "Phone, force portrait for dial screen");
            setRequestedOrientation(7);
        }
        b(voipCallConfigData);
        IVoip iVoip = this.t;
        if (iVoip != null) {
            if (iVoip.f() && C8204dfv.e(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})) {
                ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, 0);
            }
            i();
            return;
        }
        C1044Mm.d("VoipActivity", "Error while creating VoIP engine");
        d(getResources().getString(C8094ddr.i.f));
        p();
    }

    private void i() {
        IVoip iVoip = this.t;
        if (iVoip != null && iVoip.g()) {
            C1044Mm.d("VoipActivity", "Call is already in progress, what to start?");
            return;
        }
        C1044Mm.e("VoipActivity", "startDial:: Start call");
        try {
            this.i.g();
        } catch (Exception e) {
            C1044Mm.e("VoipActivity", "Failed to dial", e);
            e(null, null, -1);
        }
    }

    private void b(VoipCallConfigData voipCallConfigData) {
        ServiceManager serviceManager = this.f13833o;
        if (serviceManager != null && serviceManager.B() != null) {
            this.t = this.f13833o.B().a(voipCallConfigData);
        }
        IVoip iVoip = this.t;
        if (iVoip != null) {
            iVoip.e(this);
        }
    }

    private boolean q() {
        return (getServiceManager() == null || getServiceManager().g() == null || getServiceManager().g().ac() == null || !getServiceManager().g().ac().isShowConfirmationDialog()) ? false : true;
    }

    private void j() {
        String str;
        int i = 2 % 2;
        this.p = true;
        Runnable runnable = new Runnable() { // from class: o.ddk.5
            @Override // java.lang.Runnable
            public void run() {
                C1044Mm.e("VoipActivity", "User verified call to proceed!");
                ActivityC8087ddk.this.p = false;
                ActivityC8087ddk.this.g();
            }
        };
        Runnable runnable2 = new Runnable() { // from class: o.ddk.1
            @Override // java.lang.Runnable
            public void run() {
                C1044Mm.e("VoipActivity", "User did NOT verified call to proceed!");
                ActivityC8087ddk.this.p = false;
                ActivityC8087ddk.this.e(null, null, -1);
            }
        };
        String string = getString(C8094ddr.i.j);
        if (string.startsWith("'!#+")) {
            int i2 = r + 63;
            s = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            u(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        String str2 = string;
        String string2 = getString(C8094ddr.i.b);
        if (string2.startsWith("'!#+")) {
            int i4 = s + 97;
            r = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                u(string2.substring(4), objArr2);
                ((String) objArr2[0]).intern();
                throw null;
            }
            Object[] objArr3 = new Object[1];
            u(string2.substring(4), objArr3);
            string2 = ((String) objArr3[0]).intern();
        }
        String str3 = string2;
        String string3 = getString(C8094ddr.i.e);
        if (string3.startsWith("'!#+")) {
            Object[] objArr4 = new Object[1];
            u(string3.substring(4), objArr4);
            String intern = ((String) objArr4[0]).intern();
            int i5 = r + 13;
            s = i5 % 128;
            int i6 = i5 % 2;
            str = intern;
        } else {
            str = string3;
        }
        displayDialog(C1163Rc.c(this, this.handler, new C1163Rc.e(null, str2, str3, runnable, str, runnable2), null));
    }

    public void performAction(View view) {
        if (this.k.d(view)) {
            C1044Mm.e("VoipActivity", "Handled by landing page");
        } else if (this.i.b(view)) {
            C1044Mm.e("VoipActivity", "Handled by dialer page");
        } else {
            C1044Mm.j("VoipActivity", "Handled by nobody!");
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.contactUs;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void performUpAction() {
        boolean z = getServiceManager().c() && getServiceManager().E();
        CLv2Utils.d();
        if (Boolean.valueOf(z).booleanValue()) {
            try {
                super.performUpAction();
                finish();
                return;
            } catch (Throwable unused) {
                C1044Mm.d("VoipActivity", "Running app in broken state, go for relaunch...");
                finish();
                return;
            }
        }
        onBackPressed();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 0) {
            C1044Mm.e("VoipActivity", "Received response for Audio (and BT for A12) permission request.");
            a(i, strArr, iArr);
            if (c(strArr, iArr)) {
                C1044Mm.e("VoipActivity", "Audio (and optionally BT for A12) permission has now been granted. Go to dialer...");
                g();
                return;
            }
            C1044Mm.a("VoipActivity", "Audio (and/or BT for A12) permission was NOT granted.");
            Snackbar.make(this.k.c(), C8094ddr.i.a, -1).show();
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    private boolean c(String[] strArr, int[] iArr) {
        if (C8204dfv.a(iArr, d.length)) {
            C1044Mm.e("VoipActivity", "All requested permissions are granted, even optional");
            e(true);
            return true;
        } else if (C8204dfv.d(strArr, k(), iArr)) {
            C1044Mm.j("VoipActivity", "Only mandatory audio permissions are granted, we need to disable bluetooth!");
            e(false);
            return true;
        } else {
            C1044Mm.d("VoipActivity", "Mandatory permission(s) where declined, we can not proceed!");
            return false;
        }
    }

    private void e(boolean z) {
        ServiceManager serviceManager = this.f13833o;
        if (serviceManager != null && serviceManager.B() != null) {
            C1044Mm.a("VoipActivity", "Granted access to BT: %b", Boolean.valueOf(z));
            this.f13833o.B().e(z);
            return;
        }
        C1044Mm.e("VoipActivity", "VOIP is not available, unable to set grant %b access to BT!", Boolean.valueOf(z));
    }

    private void r() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.RECORD_AUDIO")) {
            C1044Mm.a("VoipActivity", "Displaying audio (and bluetooth) permission rationale to provide additional context.");
            Snackbar.make(this.k.c(), C8094ddr.i.d, -2).setAction(com.netflix.mediaclient.ui.R.o.f13253fi, new View.OnClickListener() { // from class: o.ddk.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ActivityCompat.requestPermissions(ActivityC8087ddk.this, ActivityC8087ddk.d, 0);
                }
            }).show();
            return;
        }
        ActivityCompat.requestPermissions(this, d, 0);
    }

    public static Class<?> b() {
        return NetflixApplication.getInstance().M() ? ActivityC8090ddn.class : ActivityC8087ddk.class;
    }

    public static Intent a(Context context) {
        return new Intent(context, b());
    }

    public static Intent c(Context context) {
        Intent intent = new Intent(context, b());
        intent.addFlags(268435456);
        intent.putExtra("AUTODIAL", true);
        return intent;
    }

    /* renamed from: o.ddk$a */
    /* loaded from: classes5.dex */
    class a extends ContentObserver {
        Context a;
        int d;

        public a(Context context) {
            super(ActivityC8087ddk.this.handler);
            this.a = context;
            this.d = ((AudioManager) context.getSystemService("audio")).getStreamVolume(3);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return super.deliverSelfNotifications();
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            super.onChange(z);
            AudioManager audioManager = (AudioManager) this.a.getSystemService("audio");
            boolean z2 = false;
            int streamVolume = audioManager.getStreamVolume(0);
            double streamMaxVolume = streamVolume / audioManager.getStreamMaxVolume(0);
            int i = this.d - streamVolume;
            if (i > 0) {
                C1044Mm.e("VoipActivity", "Decreased");
                this.d = streamVolume;
            } else if (i < 0) {
                C1044Mm.e("VoipActivity", "Increased");
                this.d = streamVolume;
            }
            if (ActivityC8087ddk.this.i != null && ActivityC8087ddk.this.i.i()) {
                z2 = true;
            }
            Volume volume = new Volume(Boolean.valueOf(z2), Double.valueOf(streamMaxVolume));
            Logger logger = Logger.INSTANCE;
            logger.addContext(volume);
            logger.logEvent(new VolumeChanged());
            logger.removeContext(Long.valueOf(volume.getId()));
            if (ActivityC8087ddk.this.t != null) {
                ActivityC8087ddk.this.t.d(streamMaxVolume);
            }
        }
    }

    private static String[] k() {
        return C8054ddD.j() ? new String[]{"android.permission.BLUETOOTH_CONNECT"} : new String[0];
    }

    private static String[] l() {
        return C8054ddD.j() ? new String[]{"android.permission.RECORD_AUDIO", "android.permission.MODIFY_AUDIO_SETTINGS", "android.permission.BLUETOOTH_CONNECT"} : new String[]{"android.permission.RECORD_AUDIO", "android.permission.MODIFY_AUDIO_SETTINGS"};
    }

    private void u(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$7118);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
