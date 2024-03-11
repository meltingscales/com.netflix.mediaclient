package o;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.schedulers.Schedulers;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import o.aMN;

/* loaded from: classes.dex */
public class aST implements aMN {
    private WeakReference<ObservableEmitter<aMN.e>> a;
    private final Context b;
    private final SplitInstallManager c;
    private final SplitInstallStateUpdatedListener d;
    private final Map<String, WeakReference<ObservableEmitter<aMN.e>>> i = new HashMap();
    private Set<String> e = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    public void b(SplitInstallSessionState splitInstallSessionState) {
        if (splitInstallSessionState.status() == 5) {
            Context b = C8054ddD.b(this.b);
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(b != null);
            C1044Mm.c("NetflixModuleInstaller", "updateToNewContext got new context=%b", objArr);
            if (b != null) {
                if (b.getApplicationContext() != null) {
                    AbstractApplicationC1040Mh.getInstance().a(b);
                } else {
                    InterfaceC1598aHf.a(new C1596aHd("SPY-18291").b(false));
                }
            }
        }
    }

    public aST(Context context) {
        SplitInstallStateUpdatedListener splitInstallStateUpdatedListener = new SplitInstallStateUpdatedListener() { // from class: o.aST.4
            @Override // com.google.android.play.core.listener.StateUpdatedListener
            /* renamed from: e */
            public void onStateUpdate(SplitInstallSessionState splitInstallSessionState) {
                C1044Mm.a("NetflixModuleInstaller", "onStateUpdate splitInstallSessionState " + splitInstallSessionState);
                if (!splitInstallSessionState.languages().isEmpty()) {
                    ObservableEmitter<aMN.e> c = aST.this.c();
                    if (c != null) {
                        c.onNext(new aSQ(splitInstallSessionState));
                    }
                    aST.this.b(splitInstallSessionState);
                    return;
                }
                String str = splitInstallSessionState.moduleNames().size() > 0 ? splitInstallSessionState.moduleNames().get(0) : null;
                if (str == null) {
                    C1044Mm.d("NetflixModuleInstaller", "invalid module from SplitInstallSessionState");
                    return;
                }
                ObservableEmitter a = aST.this.a(str);
                if (a == null) {
                    C1044Mm.d("NetflixModuleInstaller", "no ui request pending for module " + str);
                    return;
                }
                C1044Mm.a("NetflixModuleInstaller", "SplitInstallStateUpdatedListener state " + splitInstallSessionState);
                a.onNext(new aSQ(splitInstallSessionState));
            }
        };
        this.d = splitInstallStateUpdatedListener;
        this.b = context;
        SplitInstallManager create = SplitInstallManagerFactory.create(context);
        this.c = create;
        create.registerListener(splitInstallStateUpdatedListener);
        d();
    }

    @Override // o.aMN
    public Set<String> a() {
        d();
        return this.e;
    }

    private void d() {
        Schedulers.computation().scheduleDirect(new Runnable() { // from class: o.aSU
            @Override // java.lang.Runnable
            public final void run() {
                aST.this.b();
            }
        }, 100L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        Set<String> installedLanguages = this.c.getInstalledLanguages();
        if (installedLanguages == null) {
            installedLanguages = Collections.emptySet();
        }
        this.e = installedLanguages;
    }

    @Override // o.aMN
    public void b(aMN.e eVar, Activity activity, int i) {
        this.c.startConfirmationDialogForResult(eVar.b(), activity, i);
    }

    @Override // o.aMN
    public Observable<aMN.e> c(final Collection<Locale> collection) {
        return Observable.create(new ObservableOnSubscribe<aMN.e>() { // from class: o.aST.1
            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(ObservableEmitter<aMN.e> observableEmitter) {
                if (collection.isEmpty()) {
                    return;
                }
                aST.this.a = new WeakReference(observableEmitter);
                SplitInstallRequest.Builder newBuilder = SplitInstallRequest.newBuilder();
                for (Locale locale : collection) {
                    newBuilder.addLanguage(locale);
                }
                SplitInstallRequest build = newBuilder.build();
                C1044Mm.a("NetflixModuleInstaller", "startLanguageInstallForeground");
                aST.this.c.startInstall(build).addOnSuccessListener(new OnSuccessListener<Integer>() { // from class: o.aST.1.4
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    /* renamed from: e */
                    public void onSuccess(Integer num) {
                        C1044Mm.a("NetflixModuleInstaller", "onSuccess for languages ");
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: o.aST.1.2
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public void onFailure(Exception exc) {
                        ObservableEmitter<aMN.e> c = aST.this.c();
                        if (c == null) {
                            C1044Mm.d("NetflixModuleInstaller", "onFailure no ui request pending for languages");
                        } else {
                            c.onError(exc);
                        }
                    }
                });
            }
        });
    }

    @Override // o.aMN
    public void b(List<Locale> list) {
        this.c.deferredLanguageInstall(list);
    }

    @Override // o.aMN
    public Observable<aMN.e> a(final aMN.d dVar) {
        return Observable.create(new ObservableOnSubscribe<aMN.e>() { // from class: o.aST.5
            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(ObservableEmitter<aMN.e> observableEmitter) {
                aST.this.b(dVar.a(), observableEmitter);
                aST.this.e(dVar.a());
            }
        });
    }

    @Override // o.aMN
    public boolean c(aMN.d dVar) {
        Set<String> installedModules = this.c.getInstalledModules();
        C1044Mm.c("NetflixModuleInstaller", "isModuleInstalled number of modules installed=%d", Integer.valueOf(installedModules.size()));
        boolean z = false;
        for (String str : installedModules) {
            C1044Mm.c("NetflixModuleInstaller", "installed moduleName=%s", str);
            if (str.equals(dVar.a())) {
                z = true;
            }
        }
        return z;
    }

    @Override // o.aMN
    public void e(aMN.d dVar) {
        if (c(dVar)) {
            return;
        }
        C1044Mm.a("NetflixModuleInstaller", "SplitsManager deferredInstall");
        this.c.deferredInstall(Collections.singletonList(dVar.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final String str) {
        SplitInstallRequest build = SplitInstallRequest.newBuilder().addModule(str).build();
        C1044Mm.a("NetflixModuleInstaller", "SplitsManager startInstall");
        this.c.startInstall(build).addOnSuccessListener(new OnSuccessListener<Integer>() { // from class: o.aST.3
            @Override // com.google.android.gms.tasks.OnSuccessListener
            /* renamed from: b */
            public void onSuccess(Integer num) {
                C1044Mm.a("NetflixModuleInstaller", "onSuccess for " + str);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: o.aST.2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                ObservableEmitter a = aST.this.a(str);
                if (a == null) {
                    C1044Mm.d("NetflixModuleInstaller", "onFailure no ui request pending for module " + str);
                    return;
                }
                a.onError(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, ObservableEmitter<aMN.e> observableEmitter) {
        this.i.put(str, new WeakReference<>(observableEmitter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObservableEmitter<aMN.e> a(String str) {
        WeakReference<ObservableEmitter<aMN.e>> weakReference = this.i.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    ObservableEmitter<aMN.e> c() {
        WeakReference<ObservableEmitter<aMN.e>> weakReference = this.a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
