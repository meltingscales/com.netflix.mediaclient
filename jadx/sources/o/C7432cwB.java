package o;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.session.action.ValidatePin;
import com.netflix.cl.model.event.session.command.SubmitCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.ui.pin.ProfilePinDialog$overrideDialogViews$1$1;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import o.AbstractC7431cwA;
import o.C8632dsu;
import o.cQQ;
import o.dpR;

/* renamed from: o.cwB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7432cwB extends AbstractC7476cwt {
    public static final c a;
    public static final int c;
    private static byte e$ss2$216 = 0;
    private static int l = 0;

    /* renamed from: o  reason: collision with root package name */
    private static int f13781o = 1;
    private boolean d;
    private boolean e;
    private InterfaceC5283bvo k;

    static {
        b();
        a = new c(null);
        c = 8;
    }

    static void b() {
        e$ss2$216 = (byte) 24;
    }

    public static final C7432cwB e(NetflixActivity netflixActivity, InterfaceC5283bvo interfaceC5283bvo) {
        return a.e(netflixActivity, interfaceC5283bvo);
    }

    /* renamed from: o.cwB$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("ProfilePinDialog");
        }

        public final C7432cwB e(NetflixActivity netflixActivity, InterfaceC5283bvo interfaceC5283bvo) {
            C8632dsu.c((Object) netflixActivity, "");
            C8632dsu.c((Object) interfaceC5283bvo, "");
            getLogTag();
            return new C7432cwB(netflixActivity, interfaceC5283bvo);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7432cwB() {
        /*
            r6 = this;
            o.Xp r0 = o.C1332Xp.b
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Object r0 = o.C1332Xp.b(r0)
            android.content.Context r0 = (android.content.Context) r0
            int r1 = com.netflix.mediaclient.ui.R.o.kG
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "'!#+"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L5b
            int r1 = o.C7432cwB.f13781o
            int r1 = r1 + 81
            int r2 = r1 % 128
            o.C7432cwB.l = r2
            r2 = 2
            int r1 = r1 % r2
            r3 = 0
            r4 = 1
            r5 = 4
            if (r1 != 0) goto L46
            java.lang.String r0 = r0.substring(r5)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            s(r0, r1)
            r0 = r1[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            int r1 = o.C7432cwB.l
            int r1 = r1 + 99
            int r3 = r1 % 128
            o.C7432cwB.f13781o = r3
            int r1 = r1 % r2
            if (r1 != 0) goto L44
            goto L5b
        L44:
            int r2 = r2 % r2
            goto L5b
        L46:
            java.lang.String r0 = r0.substring(r5)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            s(r0, r1)
            r0 = r1[r3]
            java.lang.String r0 = (java.lang.String) r0
            r0.intern()
            r0 = 0
            r0.hashCode()
            throw r0
        L5b:
            java.lang.String r1 = ""
            o.C8632dsu.a(r0, r1)
            r6.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7432cwB.<init>():void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7432cwB(com.netflix.mediaclient.android.activity.NetflixActivity r5, o.InterfaceC5283bvo r6) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r5, r0)
            o.C8632dsu.c(r6, r0)
            int r1 = com.netflix.mediaclient.ui.R.o.kG
            java.lang.String r5 = r5.getString(r1)
            java.lang.String r1 = "'!#+"
            boolean r1 = r5.startsWith(r1)
            if (r1 == 0) goto L41
            int r1 = o.C7432cwB.l
            int r1 = r1 + 73
            int r2 = r1 % 128
            o.C7432cwB.f13781o = r2
            r2 = 2
            int r1 = r1 % r2
            r1 = 4
            java.lang.String r5 = r5.substring(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            s(r5, r1)
            r5 = 0
            r5 = r1[r5]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.intern()
            int r1 = o.C7432cwB.l
            int r1 = r1 + 61
            int r3 = r1 % 128
            o.C7432cwB.f13781o = r3
            int r1 = r1 % r2
            if (r1 != 0) goto L40
            goto L41
        L40:
            int r2 = r2 % r2
        L41:
            o.C8632dsu.a(r5, r0)
            r4.<init>(r5)
            r4.k = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7432cwB.<init>(com.netflix.mediaclient.android.activity.NetflixActivity, o.bvo):void");
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismiss();
        }
    }

    /* renamed from: o.cwB$b */
    /* loaded from: classes4.dex */
    public static final class b<T> implements ObservableOnSubscribe {
        final /* synthetic */ LifecycleOwner e;

        public b(LifecycleOwner lifecycleOwner) {
            this.e = lifecycleOwner;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public final void subscribe(final ObservableEmitter<dpR> observableEmitter) {
            C8632dsu.c((Object) observableEmitter, "");
            LifecycleOwner lifecycleOwner = this.e;
            if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                observableEmitter.onNext(dpR.c);
                observableEmitter.onComplete();
                return;
            }
            this.e.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.pin.ProfilePinDialog$refreshProfileIfNeeded$$inlined$createDestroyObservable$1$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner lifecycleOwner2) {
                    C8632dsu.c((Object) lifecycleOwner2, "");
                    if (!ObservableEmitter.this.isDisposed()) {
                        ObservableEmitter.this.onNext(dpR.c);
                        try {
                            ObservableEmitter.this.onComplete();
                        } catch (CancellationException unused) {
                        }
                    }
                    super.onDestroy(lifecycleOwner2);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.d) {
            this.d = false;
            return;
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            onCancel(dialog);
            dismiss();
        }
    }

    @Override // o.AbstractC7476cwt, o.C8019dcV
    public void b(Dialog dialog) {
        C8632dsu.c((Object) dialog, "");
        super.b(dialog);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: o.cwy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7432cwB.d(C7432cwB.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C7432cwB c7432cwB, View view) {
        C8632dsu.c((Object) c7432cwB, "");
        if (c7432cwB.d) {
            return;
        }
        C9726vo.d(c7432cwB.k, c7432cwB.getNetflixActivity(), new ProfilePinDialog$overrideDialogViews$1$1(c7432cwB));
    }

    @Override // o.C8019dcV, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        n();
    }

    @Override // o.AbstractC7476cwt, o.C8019dcV
    public void a(NetflixActivity netflixActivity, String str) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) str, "");
        super.a(netflixActivity, str);
        Logger logger = Logger.INSTANCE;
        Long startSession = logger.startSession(new SubmitCommand());
        Long startSession2 = logger.startSession(new ValidatePin(null, null, null, null));
        logger.endSession(startSession);
        InterfaceC5283bvo interfaceC5283bvo = this.k;
        if (C8632dsu.c((Object) (interfaceC5283bvo != null ? interfaceC5283bvo.getProfileLockPin() : null), (Object) str)) {
            a.getLogTag();
            logger.endSession(startSession2);
            e(AbstractC7431cwA.c.a);
            return;
        }
        a.getLogTag();
        ExtLogger.INSTANCE.failedAction(startSession2, null);
        e(new AbstractC7431cwA.a(null, false, 2, null));
    }

    @SuppressLint({"AutoDispose"})
    private final void n() {
        if (this.e) {
            this.e = false;
            a(true, getString(com.netflix.mediaclient.ui.R.o.lf));
            Observable<cQQ.e> observeOn = new cQQ().o().observeOn(AndroidSchedulers.mainThread());
            Observable subscribeOn = Observable.create(new b(this)).subscribeOn(AndroidSchedulers.mainThread());
            C8632dsu.a(subscribeOn, "");
            observeOn.takeUntil(subscribeOn).subscribe(new e());
        }
    }

    /* renamed from: o.cwB$e */
    /* loaded from: classes4.dex */
    public static final class e extends bDM<cQQ.e> {
        private static int b = 1;
        private static int c = 0;
        private static byte e$ss2$52 = 24;

        e() {
            super("ProfilePinDialog refreshProfileIfNeeded");
        }

        @Override // io.reactivex.Observer
        /* renamed from: d */
        public void onNext(cQQ.e eVar) {
            List<InterfaceC5283bvo> userProfiles;
            Object obj;
            String str;
            int i = 2 % 2;
            C8632dsu.c((Object) eVar, "");
            AccountData c2 = eVar.c();
            if (c2 != null && (userProfiles = c2.getUserProfiles()) != null) {
                C7432cwB c7432cwB = C7432cwB.this;
                Iterator<T> it = userProfiles.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    String profileGuid = ((InterfaceC5283bvo) obj).getProfileGuid();
                    InterfaceC5283bvo interfaceC5283bvo = c7432cwB.k;
                    if (interfaceC5283bvo != null) {
                        int i2 = b + 123;
                        c = i2 % 128;
                        int i3 = i2 % 2;
                        str = interfaceC5283bvo.getProfileGuid();
                    } else {
                        str = null;
                    }
                    if (!(!C8632dsu.c((Object) profileGuid, (Object) str))) {
                        int i4 = b + 123;
                        c = i4 % 128;
                        int i5 = i4 % 2;
                        break;
                    }
                }
                InterfaceC5283bvo interfaceC5283bvo2 = (InterfaceC5283bvo) obj;
                if (interfaceC5283bvo2 != null) {
                    C7432cwB.this.k = interfaceC5283bvo2;
                }
            }
            C7432cwB.this.a(false);
            TextView textView = C7432cwB.this.j;
            int i6 = com.netflix.mediaclient.ui.R.o.kG;
            Context context = textView.getContext();
            String string = context.getString(i6);
            if (string.startsWith("'!#+")) {
                Object[] objArr = new Object[1];
                e(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
                CharSequence text = context.getText(i6);
                if (text instanceof Spanned) {
                    SpannableString spannableString = new SpannableString(string);
                    TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                    string = spannableString;
                }
            }
            textView.setText(string);
            int i7 = b + 121;
            c = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
        }

        @Override // o.bDM, io.reactivex.Observer
        public void onError(Throwable th) {
            C8632dsu.c((Object) th, "");
            C7432cwB.this.dismiss();
        }

        private void e(String str, Object[] objArr) {
            byte[] decode = Base64.decode(str, 0);
            byte[] bArr = new byte[decode.length];
            for (int i = 0; i < decode.length; i++) {
                bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$52);
            }
            objArr[0] = new String(bArr, StandardCharsets.UTF_8);
        }
    }

    private static void s(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$216);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
