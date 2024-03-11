package com.netflix.mediaclient.ui.login.recaptchav3;

import android.app.Activity;
import com.google.android.gms.recaptcha.Recaptcha;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import com.google.android.gms.recaptcha.RecaptchaResultData;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.netflix.mediaclient.ui.login.recaptchav3.RecaptchaV3Manager;
import com.netflix.mediaclient.ui.login.recaptchav3.RecaptchaV3Manager$execute$1;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import kotlin.jvm.internal.Lambda;
import o.C6365cbt;
import o.C8632dsu;
import o.InterfaceC1270Vf;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final class RecaptchaV3Manager$execute$1 extends Lambda implements drM<RecaptchaHandle, ObservableSource<? extends C6365cbt>> {
    final /* synthetic */ RecaptchaV3Manager b;
    final /* synthetic */ long c;
    final /* synthetic */ RecaptchaAction e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecaptchaV3Manager$execute$1(RecaptchaV3Manager recaptchaV3Manager, RecaptchaAction recaptchaAction, long j) {
        super(1);
        this.b = recaptchaV3Manager;
        this.e = recaptchaAction;
        this.c = j;
    }

    @Override // o.drM
    /* renamed from: a */
    public final ObservableSource<? extends C6365cbt> invoke(final RecaptchaHandle recaptchaHandle) {
        C8632dsu.c((Object) recaptchaHandle, "");
        final RecaptchaV3Manager recaptchaV3Manager = this.b;
        final RecaptchaAction recaptchaAction = this.e;
        final long j = this.c;
        return Observable.create(new ObservableOnSubscribe() { // from class: o.cbP
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                RecaptchaV3Manager$execute$1.a(RecaptchaV3Manager.this, recaptchaHandle, recaptchaAction, j, observableEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final RecaptchaV3Manager recaptchaV3Manager, RecaptchaHandle recaptchaHandle, RecaptchaAction recaptchaAction, final long j, final ObservableEmitter observableEmitter) {
        Activity activity;
        Activity activity2;
        Activity activity3;
        C8632dsu.c((Object) recaptchaV3Manager, "");
        C8632dsu.c((Object) recaptchaHandle, "");
        C8632dsu.c((Object) recaptchaAction, "");
        C8632dsu.c((Object) observableEmitter, "");
        activity = recaptchaV3Manager.c;
        Task<RecaptchaResultData> execute = Recaptcha.getClient(activity).execute(recaptchaHandle, recaptchaAction);
        activity2 = recaptchaV3Manager.c;
        final drM<RecaptchaResultData, dpR> drm = new drM<RecaptchaResultData, dpR>() { // from class: com.netflix.mediaclient.ui.login.recaptchav3.RecaptchaV3Manager$execute$1$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(RecaptchaResultData recaptchaResultData) {
                c(recaptchaResultData);
                return dpR.c;
            }

            public final void c(RecaptchaResultData recaptchaResultData) {
                InterfaceC1270Vf interfaceC1270Vf;
                interfaceC1270Vf = RecaptchaV3Manager.this.a;
                long c = interfaceC1270Vf.c();
                long j2 = j;
                String tokenResult = recaptchaResultData.getTokenResult();
                C8632dsu.a(tokenResult, "");
                C6365cbt c6365cbt = new C6365cbt(tokenResult, null, c - j2);
                if (observableEmitter.isDisposed()) {
                    return;
                }
                observableEmitter.onNext(c6365cbt);
                observableEmitter.onComplete();
            }
        };
        Task<RecaptchaResultData> addOnSuccessListener = execute.addOnSuccessListener(activity2, new OnSuccessListener() { // from class: o.cbS
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RecaptchaV3Manager$execute$1.e(drM.this, obj);
            }
        });
        activity3 = recaptchaV3Manager.c;
        addOnSuccessListener.addOnFailureListener(activity3, new OnFailureListener() { // from class: o.cbU
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                RecaptchaV3Manager$execute$1.d(ObservableEmitter.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ObservableEmitter observableEmitter, Exception exc) {
        C8632dsu.c((Object) observableEmitter, "");
        C8632dsu.c((Object) exc, "");
        RecaptchaV3Manager.RecaptchaError recaptchaError = new RecaptchaV3Manager.RecaptchaError("GPS_EXECUTE_ERROR", exc);
        if (observableEmitter.isDisposed()) {
            return;
        }
        observableEmitter.onError(recaptchaError);
    }
}
