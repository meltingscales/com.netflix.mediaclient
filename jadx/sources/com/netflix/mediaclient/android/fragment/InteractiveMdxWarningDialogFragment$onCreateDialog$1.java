package com.netflix.mediaclient.android.fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.InteractiveMdxWarningDialogFragment$onCreateDialog$1;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.verifyplay.PlayVerifierVault;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o.C1084Ob;
import o.C8021dcX;
import o.C8141del;
import o.C8632dsu;
import o.dpR;
import o.drX;

/* loaded from: classes3.dex */
public final class InteractiveMdxWarningDialogFragment$onCreateDialog$1 extends Lambda implements drX<FragmentActivity, Bundle, dpR> {
    final /* synthetic */ Ref.ObjectRef<Dialog> c;
    final /* synthetic */ C1084Ob e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractiveMdxWarningDialogFragment$onCreateDialog$1(C1084Ob c1084Ob, Ref.ObjectRef<Dialog> objectRef) {
        super(2);
        this.e = c1084Ob;
        this.c = objectRef;
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.appcompat.app.AlertDialog, T, java.lang.Object] */
    @Override // o.drX
    /* renamed from: c */
    public final dpR invoke(FragmentActivity fragmentActivity, final Bundle bundle) {
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) bundle, "");
        if (((NetflixActivity) C8141del.d(fragmentActivity, NetflixActivity.class)) != null) {
            final C1084Ob c1084Ob = this.e;
            Ref.ObjectRef<Dialog> objectRef = this.c;
            ?? create = new AlertDialog.Builder(c1084Ob.requireNetflixActivity()).setMessage(R.o.cn).setNegativeButton(17039360, new DialogInterface.OnClickListener() { // from class: o.Of
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    InteractiveMdxWarningDialogFragment$onCreateDialog$1.e(dialogInterface, i);
                }
            }).setPositiveButton(R.o.cp, new DialogInterface.OnClickListener() { // from class: o.Og
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    InteractiveMdxWarningDialogFragment$onCreateDialog$1.c(bundle, c1084Ob, dialogInterface, i);
                }
            }).setTitle(R.o.cj).create();
            C8632dsu.a((Object) create, "");
            objectRef.d = create;
            return dpR.c;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(DialogInterface dialogInterface, int i) {
        C1084Ob.a.getLogTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Bundle bundle, C1084Ob c1084Ob, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) bundle, "");
        C8632dsu.c((Object) c1084Ob, "");
        C1084Ob.a.getLogTag();
        C8021dcX.b(c1084Ob.requireNetflixActivity(), bundle.getBoolean("age_protected"), (PlayVerifierVault) bundle.getParcelable("play_verifier_vault"));
    }
}
