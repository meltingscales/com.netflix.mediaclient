package com.netflix.mediaclient.ui.login;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.netflix.cl.Logger;
import com.netflix.mediaclient.acquisition.api.sms.SMSRetriever;
import com.netflix.mediaclient.ui.R;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Iterator;
import javax.inject.Inject;
import o.AbstractC6317cay;
import o.C1204Sr;
import o.C1208Sv;
import o.C6283caQ;
import o.C6361cbp;
import o.C8150deu;
import o.C8627dsp;
import o.C8632dsu;
import o.bEM;
import o.dpR;
import o.drM;
import o.drO;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class OneTimePassCodeFragmentAb54131 extends AbstractC6317cay {
    private final CompositeDisposable a = new CompositeDisposable();
    private String d;
    private Long e;
    private bEM f;
    @Inject
    public C6283caQ loginOtpDelegate;
    @Inject
    public SMSRetriever smsRetriever;
    public static final d c = new d(null);
    public static final int b = 8;

    public final SMSRetriever j() {
        SMSRetriever sMSRetriever = this.smsRetriever;
        if (sMSRetriever != null) {
            return sMSRetriever;
        }
        C8632dsu.d("");
        return null;
    }

    public final C6283caQ e() {
        C6283caQ c6283caQ = this.loginOtpDelegate;
        if (c6283caQ != null) {
            return c6283caQ;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (r2 == null) goto L31;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.login.OneTimePassCodeFragmentAb54131.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* loaded from: classes4.dex */
    public static final class e implements C1208Sv.d {
        final /* synthetic */ int a;
        final /* synthetic */ OneTimePassCodeFragmentAb54131 c;
        final /* synthetic */ FrameLayout d;

        e(FrameLayout frameLayout, OneTimePassCodeFragmentAb54131 oneTimePassCodeFragmentAb54131, int i) {
            this.d = frameLayout;
            this.c = oneTimePassCodeFragmentAb54131;
            this.a = i;
        }

        @Override // o.C1208Sv.d
        public void b(String str) {
            C8632dsu.c((Object) str, "");
            View findViewById = this.d.findViewById(R.g.fL);
            if (findViewById != null) {
                boolean z = str.length() == this.a;
                findViewById.setEnabled(z);
                findViewById.setActivated(z);
            }
            OneTimePassCodeFragmentAb54131.a(this.c, false, null, 2, null);
        }

        @Override // o.C1208Sv.d
        public void e() {
            this.c.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(OneTimePassCodeFragmentAb54131 oneTimePassCodeFragmentAb54131, View view) {
        C8632dsu.c((Object) oneTimePassCodeFragmentAb54131, "");
        oneTimePassCodeFragmentAb54131.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final bEM bem, OneTimePassCodeFragmentAb54131 oneTimePassCodeFragmentAb54131, View view) {
        C8632dsu.c((Object) bem, "");
        C8632dsu.c((Object) oneTimePassCodeFragmentAb54131, "");
        bem.j.setEnabled(false);
        CompositeDisposable compositeDisposable = oneTimePassCodeFragmentAb54131.a;
        C6283caQ e2 = oneTimePassCodeFragmentAb54131.e();
        String str = oneTimePassCodeFragmentAb54131.d;
        if (str == null) {
            C8632dsu.d("");
            str = null;
        }
        DisposableKt.plusAssign(compositeDisposable, SubscribersKt.subscribeBy(e2.b(str), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFragmentAb54131$onCreateView$4$3$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                e(th);
                return dpR.c;
            }

            public final void e(Throwable th) {
                C8632dsu.c((Object) th, "");
                bEM.this.j.setEnabled(true);
            }
        }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFragmentAb54131$onCreateView$4$3$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                c();
                return dpR.c;
            }

            public final void c() {
                bEM.this.j.setEnabled(true);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final bEM bem, OneTimePassCodeFragmentAb54131 oneTimePassCodeFragmentAb54131, View view) {
        C8632dsu.c((Object) bem, "");
        C8632dsu.c((Object) oneTimePassCodeFragmentAb54131, "");
        bem.g.setEnabled(false);
        C6283caQ e2 = oneTimePassCodeFragmentAb54131.e();
        String str = oneTimePassCodeFragmentAb54131.d;
        if (str == null) {
            C8632dsu.d("");
            str = null;
        }
        C6283caQ.c(e2, str, null, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFragmentAb54131$onCreateView$4$4$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                d();
                return dpR.c;
            }

            public final void d() {
                bEM.this.g.setEnabled(true);
            }
        }, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(C6283caQ.d dVar) {
        if (C8632dsu.c(dVar, C6283caQ.d.e.d)) {
            String string = getString(C6361cbp.b.s);
            C8632dsu.a(string, "");
            b(true, string);
        } else if (C8632dsu.c(dVar, C6283caQ.d.b.a)) {
            String string2 = getString(C6361cbp.b.f13717o);
            C8632dsu.a(string2, "");
            b(true, string2);
        }
    }

    static /* synthetic */ void a(OneTimePassCodeFragmentAb54131 oneTimePassCodeFragmentAb54131, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        oneTimePassCodeFragmentAb54131.b(z, str);
    }

    private final void b(boolean z, String str) {
        bEM bem = this.f;
        bEM bem2 = null;
        if (bem == null) {
            C8632dsu.d("");
            bem = null;
        }
        bem.f.setErrorState(z);
        bEM bem3 = this.f;
        if (bem3 == null) {
            C8632dsu.d("");
        } else {
            bem2 = bem3;
        }
        C1204Sr c1204Sr = bem2.i;
        if (z) {
            c1204Sr.setText(str);
            c1204Sr.setVisibility(0);
            return;
        }
        c1204Sr.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.a.clear();
        e().c();
        Logger.INSTANCE.endSession(this.e);
        super.onDestroyView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        Object obj;
        FragmentActivity activity = getActivity();
        bEM bem = this.f;
        bEM bem2 = null;
        if (bem == null) {
            C8632dsu.d("");
            bem = null;
        }
        Iterator<T> it = bem.f.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((EditText) obj).isFocused()) {
                break;
            }
        }
        C8150deu.b(activity, (EditText) obj);
        e(true);
        C6283caQ e2 = e();
        String str = this.d;
        if (str == null) {
            C8632dsu.d("");
            str = null;
        }
        bEM bem3 = this.f;
        if (bem3 == null) {
            C8632dsu.d("");
        } else {
            bem2 = bem3;
        }
        DisposableKt.addTo(SubscribersKt.subscribeBy(e2.c(str, bem2.f.c()), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFragmentAb54131$submitPin$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
                C8632dsu.c((Object) th, "");
                OneTimePassCodeFragmentAb54131.this.e(false);
            }
        }, new drM<C6283caQ.d, dpR>() { // from class: com.netflix.mediaclient.ui.login.OneTimePassCodeFragmentAb54131$submitPin$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C6283caQ.d dVar) {
                b(dVar);
                return dpR.c;
            }

            public final void b(C6283caQ.d dVar) {
                C8632dsu.c((Object) dVar, "");
                if (!(dVar instanceof C6283caQ.d.c)) {
                    OneTimePassCodeFragmentAb54131.this.e(false);
                }
                OneTimePassCodeFragmentAb54131.this.b(dVar);
            }
        }), this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(boolean z) {
        bEM bem = this.f;
        if (bem == null) {
            C8632dsu.d("");
            bem = null;
        }
        bem.b.setVisibility(z ? 0 : 8);
        bem.e.setVisibility(z ? 8 : 0);
    }

    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
