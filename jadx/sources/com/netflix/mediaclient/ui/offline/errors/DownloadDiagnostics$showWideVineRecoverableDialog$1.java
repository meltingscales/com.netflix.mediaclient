package com.netflix.mediaclient.ui.offline.errors;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.offline.errors.DownloadDiagnostics$showWideVineRecoverableDialog$1;
import kotlin.jvm.internal.Lambda;
import o.AbstractApplicationC1040Mh;
import o.C7400cvW;
import o.C7403cvZ;
import o.C8054ddD;
import o.C8189dfg;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final class DownloadDiagnostics$showWideVineRecoverableDialog$1 extends Lambda implements drM<C7403cvZ.b, dpR> {
    final /* synthetic */ NetflixActivity a;
    final /* synthetic */ C7400cvW c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadDiagnostics$showWideVineRecoverableDialog$1(C7400cvW c7400cvW, NetflixActivity netflixActivity) {
        super(1);
        this.c = c7400cvW;
        this.a = netflixActivity;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(C7403cvZ.b bVar) {
        a(bVar);
        return dpR.c;
    }

    public final void a(C7403cvZ.b bVar) {
        DialogInterface.OnClickListener onClickListener;
        C7400cvW c7400cvW = this.c;
        AlertDialog.Builder message = new AlertDialog.Builder(this.a).setTitle(bVar.a()).setMessage(bVar.e());
        int i = R.o.cL;
        onClickListener = this.c.d;
        AlertDialog.Builder negativeButton = message.setNegativeButton(i, onClickListener);
        int i2 = R.o.f13253fi;
        final NetflixActivity netflixActivity = this.a;
        AlertDialog create = negativeButton.setPositiveButton(i2, new DialogInterface.OnClickListener() { // from class: o.cwb
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                DownloadDiagnostics$showWideVineRecoverableDialog$1.c(NetflixActivity.this, dialogInterface, i3);
            }
        }).create();
        C8632dsu.a(create, "");
        c7400cvW.d(create);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(NetflixActivity netflixActivity, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) netflixActivity, "");
        if (C8054ddD.l(netflixActivity)) {
            return;
        }
        C8189dfg.b(netflixActivity);
        dialogInterface.dismiss();
        AbstractApplicationC1040Mh.getInstance().d(netflixActivity, "download diagnostics");
    }
}
