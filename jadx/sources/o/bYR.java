package o;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SignInClient;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.Error;
import com.netflix.cl.model.event.session.action.RequestSharedCredentials;
import com.netflix.cl.model.event.session.action.SignInWithGoogleSmartLock;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* loaded from: classes4.dex */
public final class bYR implements InterfaceC4189bZn {
    public static final c c = new c(null);
    public static final int d = 8;
    private SignInClient a;
    private Long b;
    private final InterfaceC4185bZj e;

    @Override // o.InterfaceC4189bZn
    public void c() {
    }

    public bYR(InterfaceC4185bZj interfaceC4185bZj) {
        C8632dsu.c((Object) interfaceC4185bZj, "");
        this.e = interfaceC4185bZj;
    }

    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    private final boolean d() {
        return C8632dsu.c(Looper.myLooper(), Looper.getMainLooper());
    }

    @Override // o.InterfaceC4189bZn
    public void a() {
        C1044Mm.a("GoogleIdentitySignInProviderImpl", "startSignInWorkFlow:: run on UI thread %b", Boolean.valueOf(d()));
        NetflixActivity a = this.e.a();
        if (a != null) {
            a.runInUiThread(new Runnable() { // from class: o.bYN
                @Override // java.lang.Runnable
                public final void run() {
                    bYR.e(bYR.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(bYR byr) {
        C8632dsu.c((Object) byr, "");
        byr.e();
    }

    private final void e() {
        Throwable th;
        C1044Mm.e("GoogleIdentitySignInProviderImpl", "startSignInWorkFlow::");
        Logger logger = Logger.INSTANCE;
        AppView appView = AppView.appLoading;
        CommandValue commandValue = CommandValue.SignInWithAppCommand;
        this.b = logger.startSession(new SignInWithGoogleSmartLock("onetouch", appView, null, commandValue, null));
        SignInClient signInClient = null;
        final Long startSession = logger.startSession(new RequestSharedCredentials(appView, null, commandValue, null));
        try {
            NetflixActivity a = this.e.a();
            C8632dsu.d(a);
            SignInClient signInClient2 = Identity.getSignInClient(a);
            C8632dsu.a(signInClient2, "");
            this.a = signInClient2;
            C1044Mm.e("GoogleIdentitySignInProviderImpl", "startSignInWorkFlow:: client created");
            BeginSignInRequest build = BeginSignInRequest.builder().setPasswordRequestOptions(BeginSignInRequest.PasswordRequestOptions.builder().setSupported(true).build()).build();
            C1044Mm.e("GoogleIdentitySignInProviderImpl", "startSignInWorkFlow:: request created");
            SignInClient signInClient3 = this.a;
            if (signInClient3 == null) {
                C8632dsu.d("");
            } else {
                signInClient = signInClient3;
            }
            Task<BeginSignInResult> beginSignIn = signInClient.beginSignIn(build);
            C1044Mm.e("GoogleIdentitySignInProviderImpl", "startSignInWorkFlow:: start credential retrieval");
            if (beginSignIn.isComplete()) {
                C8632dsu.d(beginSignIn);
                e(beginSignIn, startSession);
                return;
            }
            C1044Mm.e("GoogleIdentitySignInProviderImpl", "Task is is not complete, listen to it");
            beginSignIn.addOnCompleteListener(new OnCompleteListener() { // from class: o.bYQ
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    bYR.a(bYR.this, startSession, task);
                }
            });
        } catch (Throwable th2) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            C1596aHd d2 = new C1596aHd("Google Identity SignIn failed", null, null, false, null, false, false, 126, null).b(false).b(ErrorType.f13164o).d(th2);
            ErrorType errorType = d2.a;
            if (errorType != null) {
                d2.e.put("errorType", errorType.c());
                String b = d2.b();
                if (b != null) {
                    String c2 = errorType.c();
                    d2.a(c2 + " " + b);
                }
            }
            if (d2.b() != null && d2.i != null) {
                th = new Throwable(d2.b(), d2.i);
            } else if (d2.b() != null) {
                th = new Throwable(d2.b());
            } else {
                th = d2.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(d2, th);
            } else {
                dVar.e().b(d2, th);
            }
            e(startSession, new C8114deK(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(bYR byr, Long l, Task task) {
        C8632dsu.c((Object) byr, "");
        C8632dsu.c((Object) task, "");
        byr.e(task, l);
    }

    private final void e(Task<BeginSignInResult> task, Long l) {
        C1044Mm.e("GoogleIdentitySignInProviderImpl", "Task is complete, handle it");
        if (task.isSuccessful()) {
            C1044Mm.e("GoogleIdentitySignInProviderImpl", "startSignInWorkFlow:: at least one credential found probably");
            BeginSignInResult result = task.getResult();
            if (result == null) {
                C1044Mm.e("GoogleIdentitySignInProviderImpl", "startSignInWorkFlow:: no results");
                e(l, task);
                return;
            }
            PendingIntent pendingIntent = result.getPendingIntent();
            if (pendingIntent == null) {
                C1044Mm.e("GoogleIdentitySignInProviderImpl", "startSignInWorkFlow:: no pending intent");
                e(l, task);
                return;
            }
            try {
                NetflixActivity a = this.e.a();
                if (a != null) {
                    a.startIntentSenderForResult(pendingIntent.getIntentSender(), 2, null, 0, 0, 0);
                    return;
                }
                return;
            } catch (PendingIntent.CanceledException e) {
                C1044Mm.b("GoogleIdentitySignInProviderImpl", e, "Couldn't start One Tap UI!", new Object[0]);
                e(l, task);
                return;
            }
        }
        C1044Mm.e("GoogleIdentitySignInProviderImpl", "startSignInWorkFlow:: not one credential was found");
        e(l, task);
    }

    private final void e(Long l, Task<BeginSignInResult> task) {
        CLv2Utils.e(l, "GoogleIdentity.request", task);
        CLv2Utils.c(this.b, "GoogleIdentity.request", task);
        this.e.e();
    }

    private final void a(int i) {
        NetflixActivity a = this.e.a();
        if (a != null) {
            a.showDebugToast("Google Play Services: Credential Read Failed, code: " + i);
        }
        C1044Mm.d("GoogleIdentitySignInProviderImpl", "handleApiError: resultCode: " + i);
        CLv2Utils.c cVar = new CLv2Utils.c();
        cVar.d("apiCalled", "GoogleIdentity.resolve");
        cVar.c("resultCode", i);
        String jSONObject = new Error("GoogleIdentity.request", null, cVar.e()).toJSONObject().toString();
        C8632dsu.a(jSONObject, "");
        ExtLogger extLogger = ExtLogger.INSTANCE;
        extLogger.failedAction(this.e.c(), jSONObject);
        extLogger.failedAction(this.b, jSONObject);
        this.e.e();
    }

    @Override // o.InterfaceC4189bZn
    public void b(int i, int i2, Intent intent) {
        C8632dsu.c((Object) intent, "");
        if (i2 == -1) {
            C1044Mm.e("GoogleIdentitySignInProviderImpl", "onActivityResult: credentials returned");
            Logger logger = Logger.INSTANCE;
            logger.endSession(this.e.c());
            logger.endSession(this.b);
            try {
                SignInClient signInClient = this.a;
                if (signInClient == null) {
                    C8632dsu.d("");
                    signInClient = null;
                }
                d(signInClient.getSignInCredentialFromIntent(intent));
                return;
            } catch (ApiException e) {
                C1044Mm.b("GoogleIdentitySignInProviderImpl", e, "Failed to get credentials", new Object[0]);
                a(i2);
                return;
            }
        }
        C1044Mm.d("GoogleIdentitySignInProviderImpl", "Credential Read: NOT OK");
        a(i2);
    }

    private final void d(SignInCredential signInCredential) {
        if (C8126deW.c(this.e.a()) != null) {
            String id = signInCredential != null ? signInCredential.getId() : null;
            String password = signInCredential != null ? signInCredential.getPassword() : null;
            if (C8168dfL.h(id) && C8168dfL.h(password)) {
                InterfaceC4185bZj interfaceC4185bZj = this.e;
                C8632dsu.d((Object) id);
                C8632dsu.d((Object) password);
                interfaceC4185bZj.b(id, password, true);
                return;
            }
            this.e.e();
        }
    }
}
