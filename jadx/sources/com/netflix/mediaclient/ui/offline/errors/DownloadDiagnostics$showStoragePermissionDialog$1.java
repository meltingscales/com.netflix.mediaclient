package com.netflix.mediaclient.ui.offline.errors;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.offline.errors.DownloadDiagnostics$showStoragePermissionDialog$1;
import kotlin.jvm.internal.Lambda;
import o.C7353cuc;
import o.C7400cvW;
import o.C7403cvZ;
import o.C8054ddD;
import o.C8632dsu;
import o.cUS;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final class DownloadDiagnostics$showStoragePermissionDialog$1 extends Lambda implements drM<C7403cvZ.b, dpR> {
    final /* synthetic */ cUS c;
    final /* synthetic */ C7400cvW d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadDiagnostics$showStoragePermissionDialog$1(C7400cvW c7400cvW, cUS cus) {
        super(1);
        this.d = c7400cvW;
        this.c = cus;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(C7403cvZ.b bVar) {
        d(bVar);
        return dpR.c;
    }

    public final void d(C7403cvZ.b bVar) {
        DialogInterface.OnClickListener onClickListener;
        C7400cvW c7400cvW = this.d;
        AlertDialog.Builder message = new AlertDialog.Builder(this.c).setTitle(bVar.a()).setMessage(bVar.e());
        int i = R.o.cL;
        onClickListener = this.d.d;
        AlertDialog.Builder negativeButton = message.setNegativeButton(i, onClickListener);
        int i2 = R.o.f13253fi;
        final cUS cus = this.c;
        AlertDialog create = negativeButton.setPositiveButton(i2, new DialogInterface.OnClickListener() { // from class: o.cvX
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                DownloadDiagnostics$showStoragePermissionDialog$1.a(cUS.this, dialogInterface, i3);
            }
        }).create();
        C8632dsu.a(create, "");
        c7400cvW.d(create);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(cUS cus, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) cus, "");
        if (C8054ddD.l(cus)) {
            return;
        }
        C7353cuc.c(2, cus);
        dialogInterface.dismiss();
    }
}
