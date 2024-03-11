package com.netflix.mediaclient.ui.profilelock.impl;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.graphql.models.type.TokenScope;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.ui.profilelock.api.PinVerifySource;
import com.netflix.mediaclient.ui.profilelock.impl.ProfileLockPinDialog;
import com.netflix.mediaclient.ui.profilelock.impl.VerifyPinDialog;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import o.AbstractApplicationC1040Mh;
import o.C1045Mp;
import o.C1204Sr;
import o.C3985bRz;
import o.C5863cLd;
import o.C5873cLn;
import o.C8627dsp;
import o.C8632dsu;
import o.C9737vz;
import o.C9935zP;
import o.InterfaceC5283bvo;
import o.InterfaceC8554dpx;
import o.TW;
import o.cKB;
import o.cKK;
import o.cKO;
import o.dpB;
import o.dpR;
import o.drM;
import o.drO;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class VerifyPinDialog extends cKK {
    public static final a b = new a(null);
    public static final int d = 8;
    @Inject
    public TW autoLoginUrlOpener;
    private final cKO c;
    private final InterfaceC8554dpx g;

    public VerifyPinDialog() {
        InterfaceC8554dpx b2;
        b2 = dpB.b(new drO<PinVerifySource>() { // from class: com.netflix.mediaclient.ui.profilelock.impl.VerifyPinDialog$verifyPinSource$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final PinVerifySource invoke() {
                Serializable serializable = VerifyPinDialog.this.requireArguments().getSerializable("pinverifysource");
                C8632dsu.d(serializable);
                return (PinVerifySource) serializable;
            }
        });
        this.g = b2;
        this.c = new cKO();
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("ProfileLockPinDialog");
        }

        public final VerifyPinDialog d(Bundle bundle, PinVerifySource pinVerifySource) {
            C8632dsu.c((Object) bundle, "");
            C8632dsu.c((Object) pinVerifySource, "");
            VerifyPinDialog verifyPinDialog = new VerifyPinDialog();
            bundle.putSerializable("pinverifysource", pinVerifySource);
            verifyPinDialog.setArguments(bundle);
            return verifyPinDialog;
        }
    }

    public final TW g() {
        TW tw = this.autoLoginUrlOpener;
        if (tw != null) {
            return tw;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PinVerifySource i() {
        return (PinVerifySource) this.g.getValue();
    }

    @Override // com.netflix.mediaclient.ui.profilelock.impl.ProfileLockPinDialog, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C5873cLn a2;
        EditText editText;
        C5873cLn a3;
        EditText editText2;
        C5873cLn a4;
        C1204Sr c1204Sr;
        C5873cLn a5;
        C1204Sr c1204Sr2;
        C5873cLn a6;
        C5873cLn a7;
        C5873cLn a8;
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        C9935zP.b bVar = C9935zP.b;
        FragmentActivity requireActivity = requireActivity();
        C8632dsu.a(requireActivity, "");
        C9935zP d2 = bVar.d(requireActivity);
        ProfileLockPinDialog.b e2 = e();
        TextPaint textPaint = null;
        C1204Sr c1204Sr3 = (e2 == null || (a8 = e2.a()) == null) ? null : a8.j;
        if (c1204Sr3 != null) {
            c1204Sr3.setVisibility(8);
        }
        ProfileLockPinDialog.b e3 = e();
        C1204Sr c1204Sr4 = (e3 == null || (a7 = e3.a()) == null) ? null : a7.d;
        if (c1204Sr4 != null) {
            c1204Sr4.setText(getString(C5863cLd.a.c));
        }
        ProfileLockPinDialog.b e4 = e();
        C1204Sr c1204Sr5 = (e4 == null || (a6 = e4.a()) == null) ? null : a6.a;
        if (c1204Sr5 != null) {
            c1204Sr5.setVisibility(0);
        }
        ProfileLockPinDialog.b e5 = e();
        if (e5 != null && (a5 = e5.a()) != null && (c1204Sr2 = a5.a) != null) {
            textPaint = c1204Sr2.getPaint();
        }
        if (textPaint != null) {
            textPaint.setUnderlineText(true);
        }
        ProfileLockPinDialog.b e6 = e();
        if (e6 != null && (a4 = e6.a()) != null && (c1204Sr = a4.a) != null) {
            c1204Sr.setOnClickListener(new View.OnClickListener() { // from class: o.cLk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    VerifyPinDialog.b(VerifyPinDialog.this, view2);
                }
            });
            c1204Sr.setClickable(true);
        }
        ProfileLockPinDialog.b e7 = e();
        if (e7 != null && (a3 = e7.a()) != null && (editText2 = a3.e) != null) {
            editText2.setOnEditorActionListener(new c());
        }
        ProfileLockPinDialog.b e8 = e();
        if (e8 != null && (a2 = e8.a()) != null && (editText = a2.e) != null) {
            editText.addTextChangedListener(new e(d2));
        }
        this.c.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(VerifyPinDialog verifyPinDialog, View view) {
        C8632dsu.c((Object) verifyPinDialog, "");
        TW g = verifyPinDialog.g();
        TokenScope tokenScope = TokenScope.i;
        String h = verifyPinDialog.h();
        g.c(tokenScope, "profiles/lock/" + h, new drM<Activity, dpR>() { // from class: com.netflix.mediaclient.ui.profilelock.impl.VerifyPinDialog$onViewCreated$1$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Activity activity) {
                b(activity);
                return dpR.c;
            }

            public final void b(Activity activity) {
                C8632dsu.c((Object) activity, "");
                ((NetflixActivity) C9737vz.e(activity, NetflixActivity.class)).showDialog(C3985bRz.a.e());
            }
        });
    }

    /* loaded from: classes4.dex */
    public static final class c implements TextView.OnEditorActionListener {
        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            return i == 6;
        }

        c() {
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements TextWatcher {
        final /* synthetic */ C9935zP e;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        e(C9935zP c9935zP) {
            this.e = c9935zP;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            InterfaceC5283bvo interfaceC5283bvo;
            C5873cLn a;
            List<? extends InterfaceC5283bvo> b;
            Object obj;
            C5873cLn a2;
            EditText editText;
            Editable text;
            ProfileLockPinDialog.b e = VerifyPinDialog.this.e();
            String str = (e == null || (a2 = e.a()) == null || (editText = a2.e) == null || (text = editText.getText()) == null || (str = text.toString()) == null) ? "" : "";
            UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
            EditText editText2 = null;
            if (k == null || (b = k.b()) == null) {
                interfaceC5283bvo = null;
            } else {
                VerifyPinDialog verifyPinDialog = VerifyPinDialog.this;
                Iterator<T> it = b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C8632dsu.c((Object) ((InterfaceC5283bvo) obj).getProfileGuid(), (Object) verifyPinDialog.h())) {
                        break;
                    }
                }
                interfaceC5283bvo = (InterfaceC5283bvo) obj;
            }
            if (!C8632dsu.c((Object) str, (Object) (interfaceC5283bvo != null ? interfaceC5283bvo.getProfileLockPin() : null))) {
                if (str.length() == 4) {
                    ProfileLockPinDialog.b e2 = VerifyPinDialog.this.e();
                    if (e2 != null && (a = e2.a()) != null) {
                        editText2 = a.e;
                    }
                    if (editText2 != null) {
                        editText2.setError(VerifyPinDialog.this.getString(C5863cLd.a.d));
                    }
                    VerifyPinDialog.this.c.c(false);
                    return;
                }
                return;
            }
            this.e.b(cKB.class, new cKB.c(VerifyPinDialog.this.i()));
            VerifyPinDialog.this.c.c(true);
            VerifyPinDialog.this.dismiss();
        }
    }

    @Override // com.netflix.mediaclient.ui.profilelock.impl.ProfileLockPinDialog, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.c.c();
    }
}
