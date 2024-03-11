package com.netflix.mediaclient.ui.profilelock.impl;

import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.netflix.mediaclient.ui.profilelock.impl.ProfileLockPinDialog;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.C1045Mp;
import o.C1204Sr;
import o.C5863cLd;
import o.C5873cLn;
import o.C8627dsp;
import o.C8632dsu;
import o.C8689dux;
import o.C8737dwr;
import o.C9935zP;
import o.InterfaceC8554dpx;
import o.cKA;
import o.cKJ;
import o.dpB;
import o.drO;
import o.dwQ;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public class ProfileLockPinDialog extends cKJ {
    public static final e a = new e(null);
    public static final int e = 8;
    private b c;
    private final InterfaceC8554dpx d;
    @Inject
    public cKA profileLockRepository;
    @Inject
    public dwQ uiDispatcher;

    /* JADX INFO: Access modifiers changed from: protected */
    public final b e() {
        return this.c;
    }

    public ProfileLockPinDialog() {
        InterfaceC8554dpx b2;
        b2 = dpB.b(new drO<String>() { // from class: com.netflix.mediaclient.ui.profilelock.impl.ProfileLockPinDialog$profileGuid$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final String invoke() {
                String string = ProfileLockPinDialog.this.requireArguments().getString("extra_profile_id");
                if (string != null) {
                    return string;
                }
                throw new IllegalArgumentException("profileId cannot be null".toString());
            }
        });
        this.d = b2;
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("ProfileLockPinDialog");
        }

        public final ProfileLockPinDialog a(Bundle bundle) {
            ProfileLockPinDialog profileLockPinDialog = new ProfileLockPinDialog();
            profileLockPinDialog.setArguments(bundle);
            return profileLockPinDialog;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private final C5873cLn c;

        public final C5873cLn a() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.c, ((b) obj).c);
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            C5873cLn c5873cLn = this.c;
            return "Holder(viewBinding=" + c5873cLn + ")";
        }

        public b(C5873cLn c5873cLn) {
            C8632dsu.c((Object) c5873cLn, "");
            this.c = c5873cLn;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String h() {
        return (String) this.d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cKA f() {
        cKA cka = this.profileLockRepository;
        if (cka != null) {
            return cka;
        }
        C8632dsu.d("");
        return null;
    }

    protected final dwQ j() {
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
        C5873cLn a2 = C5873cLn.a(layoutInflater, viewGroup, false);
        C8632dsu.a(a2, "");
        b bVar = new b(a2);
        this.c = bVar;
        C5873cLn a3 = bVar.a();
        if (a3 != null) {
            return a3.c();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C5873cLn a2;
        C1204Sr c1204Sr;
        C5873cLn a3;
        C1204Sr c1204Sr2;
        C5873cLn a4;
        EditText editText;
        C5873cLn a5;
        EditText editText2;
        C5873cLn a6;
        C5873cLn a7;
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        C9935zP.b bVar = C9935zP.b;
        FragmentActivity requireActivity = requireActivity();
        C8632dsu.a(requireActivity, "");
        final C9935zP d = bVar.d(requireActivity);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("extra_pin_edit_mode", false)) {
            b bVar2 = this.c;
            C1204Sr c1204Sr3 = (bVar2 == null || (a7 = bVar2.a()) == null) ? null : a7.d;
            if (c1204Sr3 != null) {
                c1204Sr3.setText(getString(C5863cLd.a.e));
            }
        }
        b bVar3 = this.c;
        C1204Sr c1204Sr4 = (bVar3 == null || (a6 = bVar3.a()) == null) ? null : a6.a;
        if (c1204Sr4 != null) {
            c1204Sr4.setVisibility(8);
        }
        b bVar4 = this.c;
        if (bVar4 != null && (a5 = bVar4.a()) != null && (editText2 = a5.e) != null) {
            C8737dwr.c(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ProfileLockPinDialog$onViewCreated$1$1(editText2, this, null), 3, null);
        }
        b bVar5 = this.c;
        if (bVar5 != null && (a4 = bVar5.a()) != null && (editText = a4.e) != null) {
            editText.setOnEditorActionListener(new c(d));
        }
        b bVar6 = this.c;
        if (bVar6 != null && (a3 = bVar6.a()) != null && (c1204Sr2 = a3.j) != null) {
            c1204Sr2.setOnClickListener(new View.OnClickListener() { // from class: o.cLc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ProfileLockPinDialog.b(ProfileLockPinDialog.this, d, view2);
                }
            });
            c1204Sr2.setClickable(true);
        }
        b bVar7 = this.c;
        if (bVar7 == null || (a2 = bVar7.a()) == null || (c1204Sr = a2.c) == null) {
            return;
        }
        c1204Sr.setOnClickListener(new View.OnClickListener() { // from class: o.cKZ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ProfileLockPinDialog.e(ProfileLockPinDialog.this, view2);
            }
        });
        c1204Sr.setClickable(true);
    }

    /* loaded from: classes4.dex */
    public static final class c implements TextView.OnEditorActionListener {
        final /* synthetic */ C9935zP c;

        c(C9935zP c9935zP) {
            this.c = c9935zP;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            C5873cLn a;
            EditText editText;
            Editable text;
            if (i != 6) {
                return false;
            }
            b e = ProfileLockPinDialog.this.e();
            ProfileLockPinDialog.this.c(this.c, (e == null || (a = e.a()) == null || (editText = a.e) == null || (text = editText.getText()) == null || (r1 = text.toString()) == null) ? "" : "");
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ProfileLockPinDialog profileLockPinDialog, C9935zP c9935zP, View view) {
        C5873cLn a2;
        EditText editText;
        Editable text;
        String obj;
        String str = "";
        C8632dsu.c((Object) profileLockPinDialog, "");
        C8632dsu.c((Object) c9935zP, "");
        b bVar = profileLockPinDialog.c;
        if (bVar != null && (a2 = bVar.a()) != null && (editText = a2.e) != null && (text = editText.getText()) != null && (obj = text.toString()) != null) {
            str = obj;
        }
        profileLockPinDialog.c(c9935zP, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ProfileLockPinDialog profileLockPinDialog, View view) {
        C8632dsu.c((Object) profileLockPinDialog, "");
        profileLockPinDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(C9935zP c9935zP, String str) {
        C5873cLn a2;
        Integer n;
        EditText editText = null;
        if (str.length() == 4) {
            n = C8689dux.n(str);
            if (n != null) {
                C8737dwr.c(LifecycleOwnerKt.getLifecycleScope(this), j(), null, new ProfileLockPinDialog$formSubmit$1(this, str, c9935zP, null), 2, null);
                return;
            }
        }
        b bVar = this.c;
        if (bVar != null && (a2 = bVar.a()) != null) {
            editText = a2.e;
        }
        if (editText == null) {
            return;
        }
        editText.setError(getString(C5863cLd.a.i));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.c = null;
        super.onDestroy();
    }
}
