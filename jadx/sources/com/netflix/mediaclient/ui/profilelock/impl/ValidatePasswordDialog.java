package com.netflix.mediaclient.ui.profilelock.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.graphql.models.type.TokenScope;
import com.netflix.mediaclient.ui.profilelock.impl.ValidatePasswordDialog;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.C1045Mp;
import o.C1204Sr;
import o.C3985bRz;
import o.C5875cLp;
import o.C8627dsp;
import o.C8632dsu;
import o.C8737dwr;
import o.C9737vz;
import o.C9935zP;
import o.TW;
import o.cKA;
import o.cKL;
import o.dpR;
import o.drM;
import o.dwQ;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class ValidatePasswordDialog extends cKL {
    @Inject
    public TW autoLoginUrlOpener;
    private e d;
    @Inject
    public cKA profileLockRepository;
    @Inject
    public dwQ uiDispatcher;
    public static final a e = new a(null);
    public static final int b = 8;

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("ValidatePasswordDialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e {
        private final C5875cLp a;

        public final C5875cLp c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.a, ((e) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            C5875cLp c5875cLp = this.a;
            return "Holder(viewBinding=" + c5875cLp + ")";
        }

        public e(C5875cLp c5875cLp) {
            C8632dsu.c((Object) c5875cLp, "");
            this.a = c5875cLp;
        }
    }

    public final cKA g() {
        cKA cka = this.profileLockRepository;
        if (cka != null) {
            return cka;
        }
        C8632dsu.d("");
        return null;
    }

    public final TW a() {
        TW tw = this.autoLoginUrlOpener;
        if (tw != null) {
            return tw;
        }
        C8632dsu.d("");
        return null;
    }

    public final dwQ i() {
        dwQ dwq = this.uiDispatcher;
        if (dwq != null) {
            return dwq;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        C5875cLp a2 = C5875cLp.a(layoutInflater, viewGroup, false);
        C8632dsu.a(a2, "");
        e eVar = new e(a2);
        this.d = eVar;
        C5875cLp c = eVar.c();
        if (c != null) {
            return c.a();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"CheckResult"})
    public void onViewCreated(View view, Bundle bundle) {
        C5875cLp c;
        C1204Sr c1204Sr;
        C5875cLp c2;
        C1204Sr c1204Sr2;
        String string;
        C5875cLp c3;
        C5875cLp c4;
        EditText editText;
        C5875cLp c5;
        EditText editText2;
        C5875cLp c6;
        C1204Sr c1204Sr3;
        C5875cLp c7;
        C1204Sr c1204Sr4;
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        C9935zP.b bVar = C9935zP.b;
        FragmentActivity requireActivity = requireActivity();
        C8632dsu.a(requireActivity, "");
        final C9935zP d = bVar.d(requireActivity);
        e eVar = this.d;
        C1204Sr c1204Sr5 = null;
        TextPaint paint = (eVar == null || (c7 = eVar.c()) == null || (c1204Sr4 = c7.a) == null) ? null : c1204Sr4.getPaint();
        if (paint != null) {
            paint.setUnderlineText(true);
        }
        e eVar2 = this.d;
        if (eVar2 != null && (c6 = eVar2.c()) != null && (c1204Sr3 = c6.a) != null) {
            c1204Sr3.setOnClickListener(new View.OnClickListener() { // from class: o.cLe
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ValidatePasswordDialog.e(ValidatePasswordDialog.this, view2);
                }
            });
            c1204Sr3.setClickable(true);
        }
        e eVar3 = this.d;
        if (eVar3 != null && (c5 = eVar3.c()) != null && (editText2 = c5.e) != null) {
            C8737dwr.c(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ValidatePasswordDialog$onViewCreated$2$1(editText2, this, null), 3, null);
        }
        e eVar4 = this.d;
        if (eVar4 != null && (c4 = eVar4.c()) != null && (editText = c4.e) != null) {
            editText.setOnEditorActionListener(new b(d));
        }
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("extra_dialog_text")) != null) {
            e eVar5 = this.d;
            if (eVar5 != null && (c3 = eVar5.c()) != null) {
                c1204Sr5 = c3.g;
            }
            if (c1204Sr5 != null) {
                c1204Sr5.setText(string);
            }
        }
        e eVar6 = this.d;
        if (eVar6 != null && (c2 = eVar6.c()) != null && (c1204Sr2 = c2.b) != null) {
            c1204Sr2.setOnClickListener(new View.OnClickListener() { // from class: o.cLh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ValidatePasswordDialog.c(ValidatePasswordDialog.this, d, view2);
                }
            });
            c1204Sr2.setClickable(true);
        }
        e eVar7 = this.d;
        if (eVar7 == null || (c = eVar7.c()) == null || (c1204Sr = c.c) == null) {
            return;
        }
        c1204Sr.setOnClickListener(new View.OnClickListener() { // from class: o.cLi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ValidatePasswordDialog.c(ValidatePasswordDialog.this, view2);
            }
        });
        c1204Sr.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ValidatePasswordDialog validatePasswordDialog, View view) {
        C8632dsu.c((Object) validatePasswordDialog, "");
        validatePasswordDialog.a().c(TokenScope.c, "loginhelp", new drM<Activity, dpR>() { // from class: com.netflix.mediaclient.ui.profilelock.impl.ValidatePasswordDialog$onViewCreated$1$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Activity activity) {
                a(activity);
                return dpR.c;
            }

            public final void a(Activity activity) {
                C8632dsu.c((Object) activity, "");
                ((NetflixActivity) C9737vz.e(activity, NetflixActivity.class)).showDialog(C3985bRz.a.e());
            }
        });
    }

    /* loaded from: classes4.dex */
    public static final class b implements TextView.OnEditorActionListener {
        final /* synthetic */ C9935zP e;

        b(C9935zP c9935zP) {
            this.e = c9935zP;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            ValidatePasswordDialog.this.c(this.e);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ValidatePasswordDialog validatePasswordDialog, C9935zP c9935zP, View view) {
        C8632dsu.c((Object) validatePasswordDialog, "");
        C8632dsu.c((Object) c9935zP, "");
        validatePasswordDialog.c(c9935zP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ValidatePasswordDialog validatePasswordDialog, View view) {
        C8632dsu.c((Object) validatePasswordDialog, "");
        validatePasswordDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(C9935zP c9935zP) {
        b(true);
        C8737dwr.c(LifecycleOwnerKt.getLifecycleScope(this), i(), null, new ValidatePasswordDialog$formSubmit$1(this, c9935zP, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(boolean z) {
        C5875cLp c;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(!z);
        }
        e eVar = this.d;
        if (eVar == null || (c = eVar.c()) == null) {
            return;
        }
        ProgressBar progressBar = c.d;
        C8632dsu.a(progressBar, "");
        progressBar.setVisibility(z ? 0 : 8);
        boolean z2 = !z;
        c.b.setEnabled(z2);
        c.c.setEnabled(z2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.d = null;
        super.onDestroy();
    }
}
