package com.netflix.mediaclient.ui.collectphone.impl.collectphone;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.netflix.mediaclient.ui.collectphone.api.CollectPhone;
import com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneFragment$onCountryPickerClicked$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.C3497bAa;
import o.C5479bzY;
import o.C5480bzZ;
import o.C8572dqo;
import o.C8632dsu;
import o.drM;

/* loaded from: classes4.dex */
public final class CollectPhoneFragment$onCountryPickerClicked$1 extends Lambda implements drM<C3497bAa.e, AlertDialog> {
    final /* synthetic */ CollectPhoneFragment a;
    final /* synthetic */ Context b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectPhoneFragment$onCountryPickerClicked$1(Context context, CollectPhoneFragment collectPhoneFragment) {
        super(1);
        this.b = context;
        this.a = collectPhoneFragment;
    }

    @Override // o.drM
    /* renamed from: d */
    public final AlertDialog invoke(C3497bAa.e eVar) {
        int d;
        C8632dsu.c((Object) eVar, "");
        final List<CollectPhone.d> c = eVar.c();
        AlertDialog.Builder builder = new AlertDialog.Builder(this.b);
        Context context = this.b;
        d = C8572dqo.d(c, 10);
        ArrayList arrayList = new ArrayList(d);
        for (CollectPhone.d dVar : c) {
            arrayList.add(new C5479bzY(dVar.b(), dVar.e(), dVar.d()));
        }
        C5480bzZ c5480bzZ = new C5480bzZ(context, arrayList);
        final CollectPhoneFragment collectPhoneFragment = this.a;
        return builder.setAdapter(c5480bzZ, new DialogInterface.OnClickListener() { // from class: o.bzW
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CollectPhoneFragment$onCountryPickerClicked$1.b(c, collectPhoneFragment, dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(List list, CollectPhoneFragment collectPhoneFragment, DialogInterface dialogInterface, int i) {
        C3497bAa g;
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) collectPhoneFragment, "");
        g = collectPhoneFragment.g();
        g.c((CollectPhone.d) list.get(i));
    }
}
