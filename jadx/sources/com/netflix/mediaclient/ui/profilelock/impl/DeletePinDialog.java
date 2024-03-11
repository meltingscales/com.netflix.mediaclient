package com.netflix.mediaclient.ui.profilelock.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.netflix.mediaclient.ui.profilelock.impl.DeletePinDialog;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.C1045Mp;
import o.C1204Sr;
import o.C5874cLo;
import o.C8627dsp;
import o.C8632dsu;
import o.C8737dwr;
import o.C9935zP;
import o.GF;
import o.InterfaceC8554dpx;
import o.cKA;
import o.cKI;
import o.dpB;
import o.drO;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class DeletePinDialog extends cKI {
    public static final d a = new d(null);
    public static final int d = 8;
    private final InterfaceC8554dpx b;
    private e c;
    @Inject
    public cKA profileLockRepository;

    public DeletePinDialog() {
        InterfaceC8554dpx b;
        b = dpB.b(new drO<String>() { // from class: com.netflix.mediaclient.ui.profilelock.impl.DeletePinDialog$profileGuid$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final String invoke() {
                String string = DeletePinDialog.this.requireArguments().getString("extra_profile_id");
                if (string != null) {
                    return string;
                }
                throw new IllegalArgumentException("profileId cannot be null".toString());
            }
        });
        this.b = b;
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("DeletePinDialog");
        }

        public final DeletePinDialog c(Bundle bundle) {
            DeletePinDialog deletePinDialog = new DeletePinDialog();
            deletePinDialog.setArguments(bundle);
            return deletePinDialog;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e {
        private final C5874cLo e;

        public final C5874cLo c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.e, ((e) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            C5874cLo c5874cLo = this.e;
            return "Holder(viewBinding=" + c5874cLo + ")";
        }

        public e(C5874cLo c5874cLo) {
            C8632dsu.c((Object) c5874cLo, "");
            this.e = c5874cLo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g() {
        return (String) this.b.getValue();
    }

    public final cKA e() {
        cKA cka = this.profileLockRepository;
        if (cka != null) {
            return cka;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        C5874cLo b = C5874cLo.b(layoutInflater, viewGroup, false);
        C8632dsu.a(b, "");
        e eVar = new e(b);
        this.c = eVar;
        C5874cLo c = eVar.c();
        if (c != null) {
            return c.a();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle bundle) {
        C5874cLo c;
        C1204Sr c1204Sr;
        C5874cLo c2;
        C1204Sr c1204Sr2;
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        C9935zP.b bVar = C9935zP.b;
        FragmentActivity requireActivity = requireActivity();
        C8632dsu.a(requireActivity, "");
        final C9935zP d2 = bVar.d(requireActivity);
        e eVar = this.c;
        if (eVar != null && (c2 = eVar.c()) != null && (c1204Sr2 = c2.e) != null) {
            c1204Sr2.setOnClickListener(new View.OnClickListener() { // from class: o.cKF
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DeletePinDialog.c(DeletePinDialog.this, view, d2, view2);
                }
            });
            c1204Sr2.setClickable(true);
        }
        e eVar2 = this.c;
        if (eVar2 == null || (c = eVar2.c()) == null || (c1204Sr = c.b) == null) {
            return;
        }
        c1204Sr.setOnClickListener(new View.OnClickListener() { // from class: o.cKE
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DeletePinDialog.e(DeletePinDialog.this, view2);
            }
        });
        c1204Sr.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(DeletePinDialog deletePinDialog, View view, C9935zP c9935zP, View view2) {
        C8632dsu.c((Object) deletePinDialog, "");
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) c9935zP, "");
        deletePinDialog.b(true);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(deletePinDialog);
        GF gf = GF.e;
        Context context = view.getContext();
        C8632dsu.a(context, "");
        C8737dwr.c(lifecycleScope, gf.d(context), null, new DeletePinDialog$onViewCreated$1$1(deletePinDialog, c9935zP, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(DeletePinDialog deletePinDialog, View view) {
        C8632dsu.c((Object) deletePinDialog, "");
        deletePinDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(boolean z) {
        C5874cLo c;
        e eVar = this.c;
        if (eVar == null || (c = eVar.c()) == null) {
            return;
        }
        ProgressBar progressBar = c.d;
        C8632dsu.a(progressBar, "");
        progressBar.setVisibility(z ? 0 : 8);
        boolean z2 = !z;
        c.e.setEnabled(z2);
        c.b.setEnabled(z2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.c = null;
        super.onDestroy();
    }
}
