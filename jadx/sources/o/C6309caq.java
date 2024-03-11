package o;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.identity.SignInPassword;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.Error;
import com.netflix.cl.model.event.session.action.StoreSharedCredentials;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import o.C1044Mm;
import o.C6309caq;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC6276caJ;
import o.dpR;

/* renamed from: o.caq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6309caq implements InterfaceC6280caN {
    public static final c d = new c(null);
    public static final int e = 8;
    private final InterfaceC6276caJ a;
    private Long b;

    @Override // o.InterfaceC6280caN
    public void a() {
    }

    @Override // o.InterfaceC6280caN
    public void b() {
    }

    public C6309caq(InterfaceC6276caJ interfaceC6276caJ) {
        C8632dsu.c((Object) interfaceC6276caJ, "");
        this.a = interfaceC6276caJ;
    }

    /* renamed from: o.caq$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    @Override // o.InterfaceC6280caN
    public void a(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        try {
            d(str, str2);
        } catch (Throwable th) {
            b(th);
            this.a.handleBackToRegularWorkflow();
        }
    }

    private final void b(Throwable th) {
        Throwable th2;
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        C1596aHd d2 = new C1596aHd("Google Identity Login failed", null, null, false, null, false, false, 126, null).b(false).b(ErrorType.f13164o).d(th);
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
            th2 = new Throwable(d2.b(), d2.i);
        } else if (d2.b() != null) {
            th2 = new Throwable(d2.b());
        } else {
            th2 = d2.i;
            if (th2 == null) {
                th2 = new Throwable("Handled exception with no message");
            } else if (th2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a = dVar.a();
        if (a != null) {
            a.e(d2, th2);
        } else {
            dVar.e().b(d2, th2);
        }
        Activity ownerActivity = this.a.getOwnerActivity();
        if (ownerActivity != null) {
            C9720vi.a(ownerActivity, "Saving password failed via GoogleIdentity!");
        }
        CLv2Utils.c cVar2 = new CLv2Utils.c();
        cVar2.d("apiCalled", "GoogleIdentity.save");
        ExtLogger.INSTANCE.failedAction(this.b, CLv2Utils.a("GoogleIdentity.save", cVar2.e(), th).toJSONObject().toString());
    }

    private final void d(String str, String str2) {
        SavePasswordRequest build = SavePasswordRequest.builder().setSignInPassword(new SignInPassword(str, str2)).build();
        if (this.a.getOwnerActivity() == null) {
            C1044Mm.d("GoogleIdentityLoginProviderImpl", "Saving password failed, activity null!");
            return;
        }
        this.b = Logger.INSTANCE.startSession(new StoreSharedCredentials(null, null, null, null));
        Activity ownerActivity = this.a.getOwnerActivity();
        C8632dsu.d(ownerActivity);
        Task<SavePasswordResult> savePassword = Identity.getCredentialSavingClient(ownerActivity).savePassword(build);
        final drM<SavePasswordResult, dpR> drm = new drM<SavePasswordResult, dpR>() { // from class: com.netflix.mediaclient.ui.login.GoogleIdentityLoginProviderImpl$doSaveCredentials$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(SavePasswordResult savePasswordResult) {
                c(savePasswordResult);
                return dpR.c;
            }

            public final void c(SavePasswordResult savePasswordResult) {
                InterfaceC6276caJ interfaceC6276caJ;
                InterfaceC6276caJ interfaceC6276caJ2;
                try {
                    interfaceC6276caJ2 = C6309caq.this.a;
                    Activity ownerActivity2 = interfaceC6276caJ2.getOwnerActivity();
                    if (ownerActivity2 != null) {
                        ownerActivity2.startIntentSenderForResult(savePasswordResult.getPendingIntent().getIntentSender(), 1, null, 0, 0, 0, null);
                    }
                } catch (IntentSender.SendIntentException e2) {
                    C1044Mm.e("GoogleIdentityLoginProviderImpl", e2, "Launching the PendingIntent failed", new Object[0]);
                    interfaceC6276caJ = C6309caq.this.a;
                    interfaceC6276caJ.handleBackToRegularWorkflow();
                }
            }
        };
        savePassword.addOnSuccessListener(new OnSuccessListener() { // from class: o.cas
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C6309caq.b(drM.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: o.cat
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C6309caq.c(C6309caq.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C6309caq c6309caq, Exception exc) {
        C8632dsu.c((Object) c6309caq, "");
        C8632dsu.c((Object) exc, "");
        C1044Mm.b("GoogleIdentityLoginProviderImpl", exc, "Saving password failed, report and continue!", new Object[0]);
        Activity ownerActivity = c6309caq.a.getOwnerActivity();
        if (ownerActivity != null) {
            C9720vi.a(ownerActivity, "Saving password failed via GoogleIdentity!");
        }
        CLv2Utils.c cVar = new CLv2Utils.c();
        cVar.d("apiCalled", "GoogleIdentity.save");
        ExtLogger.INSTANCE.failedAction(c6309caq.b, new Error("GoogleIdentity.save", null, cVar.e()).toJSONObject().toString());
        c6309caq.a.handleBackToRegularWorkflow();
    }

    @Override // o.InterfaceC6280caN
    public void e(int i, int i2, Intent intent) {
        if (i != 1) {
            C1044Mm.d("GoogleIdentityLoginProviderImpl", "onActivityResult: unknown request code" + i);
        } else if (i2 == -1) {
            C1044Mm.e("GoogleIdentityLoginProviderImpl", "Password saved!");
            Activity ownerActivity = this.a.getOwnerActivity();
            if (ownerActivity != null) {
                C9720vi.a(ownerActivity, "Account credentials saved via GoogleIdentity!");
            }
            Logger.INSTANCE.endSession(this.b);
        } else if (i2 == 0) {
            C1044Mm.d("GoogleIdentityLoginProviderImpl", "Password saving canceled!");
            Activity ownerActivity2 = this.a.getOwnerActivity();
            if (ownerActivity2 != null) {
                C9720vi.a(ownerActivity2, "Saving password via GoogleIdentity canceled!");
            }
            Logger.INSTANCE.cancelSession(this.b);
        } else {
            C1044Mm.d("GoogleIdentityLoginProviderImpl", "Unknown result code " + i2);
            Activity ownerActivity3 = this.a.getOwnerActivity();
            if (ownerActivity3 != null) {
                C9720vi.a(ownerActivity3, "Saving password via GoogleIdentity failed with unknown result code " + i2 + "!");
            }
            CLv2Utils.c cVar = new CLv2Utils.c();
            cVar.d("apiCalled", "GoogleIdentity.save");
            cVar.c("resultCode", i2);
            String jSONObject = new Error("GoogleIdentity.save", null, cVar.e()).toJSONObject().toString();
            C8632dsu.a(jSONObject, "");
            ExtLogger.INSTANCE.failedAction(this.b, jSONObject);
        }
    }
}
