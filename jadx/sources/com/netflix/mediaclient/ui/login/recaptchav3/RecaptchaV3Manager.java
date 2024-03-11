package com.netflix.mediaclient.ui.login.recaptchav3;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.recaptcha.Recaptcha;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.model.leafs.SignInConfigData;
import com.netflix.mediaclient.ui.login.recaptchav3.RecaptchaV3Manager;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.subjects.ReplaySubject;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import o.C1596aHd;
import o.C1823aPo;
import o.C6331cbL;
import o.C6365cbt;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1270Vf;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dpR;
import o.dqE;
import o.drM;

/* loaded from: classes4.dex */
public final class RecaptchaV3Manager {
    public static final a d = new a(null);
    public static final int e = 8;
    private final InterfaceC1270Vf a;
    private RecaptchaHandle b;
    private final Activity c;
    private final ReplaySubject<RecaptchaHandle> j;

    @AssistedFactory
    /* loaded from: classes4.dex */
    public interface c {
        RecaptchaV3Manager b(Activity activity, C6331cbL c6331cbL);
    }

    @AssistedInject
    public RecaptchaV3Manager(InterfaceC1270Vf interfaceC1270Vf, @Assisted Activity activity, @Assisted C6331cbL c6331cbL) {
        C8632dsu.c((Object) interfaceC1270Vf, "");
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) c6331cbL, "");
        this.a = interfaceC1270Vf;
        this.c = activity;
        ReplaySubject<RecaptchaHandle> create = ReplaySubject.create();
        C8632dsu.a(create, "");
        this.j = create;
        C6331cbL.b d2 = c6331cbL.d();
        if (d2 instanceof C6331cbL.b.d) {
            create.onError(new RecaptchaError(((C6331cbL.b.d) d2).b(), null, 2, null));
        } else if (d2 instanceof C6331cbL.b.C0112b) {
            Task<RecaptchaHandle> init = Recaptcha.getClient(activity).init(((C6331cbL.b.C0112b) d2).d());
            final drM<RecaptchaHandle, dpR> drm = new drM<RecaptchaHandle, dpR>() { // from class: com.netflix.mediaclient.ui.login.recaptchav3.RecaptchaV3Manager.1
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(RecaptchaHandle recaptchaHandle) {
                    b(recaptchaHandle);
                    return dpR.c;
                }

                public final void b(RecaptchaHandle recaptchaHandle) {
                    RecaptchaV3Manager.this.b = recaptchaHandle;
                    RecaptchaV3Manager.this.j.onNext(recaptchaHandle);
                    RecaptchaV3Manager.this.j.onComplete();
                }
            };
            init.addOnSuccessListener(activity, new OnSuccessListener() { // from class: o.cbQ
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    RecaptchaV3Manager.c(drM.this, obj);
                }
            }).addOnFailureListener(activity, new OnFailureListener() { // from class: o.cbN
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    RecaptchaV3Manager.c(RecaptchaV3Manager.this, exc);
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final String b(Context context) {
            Map d;
            Map k;
            Throwable th;
            if (context == null) {
                return null;
            }
            try {
                SignInConfigData a = new C1823aPo(context).a();
                if (a != null) {
                    return a.getRecaptchaSiteKey();
                }
                return null;
            } catch (Exception e) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd(null, e, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th);
                    return null;
                }
                dVar.e().b(c1596aHd, th);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(RecaptchaV3Manager recaptchaV3Manager, Exception exc) {
        C8632dsu.c((Object) recaptchaV3Manager, "");
        C8632dsu.c((Object) exc, "");
        recaptchaV3Manager.j.onError(new RecaptchaError("GPS_INIT_ERROR", exc));
    }

    public final Single<C6365cbt> b(RecaptchaAction recaptchaAction) {
        C8632dsu.c((Object) recaptchaAction, "");
        long c2 = this.a.c();
        ReplaySubject<RecaptchaHandle> replaySubject = this.j;
        final RecaptchaV3Manager$execute$1 recaptchaV3Manager$execute$1 = new RecaptchaV3Manager$execute$1(this, recaptchaAction, c2);
        Single<C6365cbt> observeOn = replaySubject.flatMap(new Function() { // from class: o.cbM
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource b;
                b = RecaptchaV3Manager.b(drM.this, obj);
                return b;
            }
        }).take(2500L, TimeUnit.MILLISECONDS).firstOrError().onErrorReturn(new Function() { // from class: o.cbO
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                C6365cbt e2;
                e2 = RecaptchaV3Manager.e(RecaptchaV3Manager.this, (Throwable) obj);
                return e2;
            }
        }).observeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(observeOn, "");
        return observeOn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (ObservableSource) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6365cbt e(RecaptchaV3Manager recaptchaV3Manager, Throwable th) {
        Map d2;
        Map k;
        Throwable th2;
        String str;
        Map d3;
        Map k2;
        Throwable th3;
        C8632dsu.c((Object) recaptchaV3Manager, "");
        C8632dsu.c((Object) th, "");
        if (th instanceof NoSuchElementException) {
            str = "GPS_TIMEOUT";
        } else if (th instanceof RecaptchaError) {
            Throwable cause = th.getCause();
            if (cause != null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d3 = dqE.d();
                k2 = dqE.k(d3);
                C1596aHd c1596aHd = new C1596aHd(null, cause, null, true, k2, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c2 = errorType.c();
                        c1596aHd.a(c2 + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th3 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th3 = new Throwable(c1596aHd.b());
                } else {
                    th3 = c1596aHd.i;
                    if (th3 == null) {
                        th3 = new Throwable("Handled exception with no message");
                    } else if (th3 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th3);
                } else {
                    dVar.e().b(c1596aHd, th3);
                }
            }
            str = ((RecaptchaError) th).b();
        } else {
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd2 = new C1596aHd(null, th, null, true, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd2.a;
            if (errorType2 != null) {
                c1596aHd2.e.put("errorType", errorType2.c());
                String b2 = c1596aHd2.b();
                if (b2 != null) {
                    String c3 = errorType2.c();
                    c1596aHd2.a(c3 + " " + b2);
                }
            }
            if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                th2 = new Throwable(c1596aHd2.b(), c1596aHd2.i);
            } else if (c1596aHd2.b() != null) {
                th2 = new Throwable(c1596aHd2.b());
            } else {
                th2 = c1596aHd2.i;
                if (th2 == null) {
                    th2 = new Throwable("Handled exception with no message");
                } else if (th2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a3 = dVar2.a();
            if (a3 != null) {
                a3.e(c1596aHd2, th2);
            } else {
                dVar2.e().b(c1596aHd2, th2);
            }
            str = "UNKNOWN_ERROR";
        }
        return recaptchaV3Manager.c(str);
    }

    public final void e() {
        RecaptchaHandle recaptchaHandle = this.b;
        if (recaptchaHandle == null) {
            return;
        }
        Recaptcha.getClient(this.c).close(recaptchaHandle);
    }

    private final C6365cbt c(String str) {
        return new C6365cbt(" ", str, -1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class RecaptchaError extends Exception {
        private final String d;

        public final String b() {
            return this.d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecaptchaError(String str, Throwable th) {
            super(th);
            C8632dsu.c((Object) str, "");
            this.d = str;
        }

        public /* synthetic */ RecaptchaError(String str, Throwable th, int i, C8627dsp c8627dsp) {
            this(str, (i & 2) != 0 ? null : th);
        }
    }
}
