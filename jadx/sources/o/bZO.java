package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.ui.Modifier;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Theme;
import javax.inject.Inject;
import o.AbstractC1017Lk;
import o.bZW;

/* loaded from: classes4.dex */
public final class bZO implements bZN {
    public static final c d = new c(null);
    public static final int e = 8;
    private final Activity b;
    private final aGT c;

    @Inject
    public bZO(Activity activity, aGT agt) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) agt, "");
        this.b = activity;
        this.c = agt;
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("LocalDiscoveryConsentUiImpl");
        }
    }

    @Override // o.bZN
    public boolean b() {
        return this.c.d() && !this.c.b();
    }

    @Override // o.bZN
    public boolean e() {
        return (this.c.c() || this.c.b()) ? false : true;
    }

    @Override // o.bZN
    @SuppressLint({"InflateParams"})
    public Dialog c(final C9872yF c9872yF) {
        C8632dsu.c((Object) c9872yF, "");
        View inflate = LayoutInflater.from(this.b).inflate(bZW.a.c, (ViewGroup) null, false);
        AlertDialog create = new AlertDialog.Builder(this.b, bZW.e.b).setCustomTitle(inflate).setView(LayoutInflater.from(this.b).inflate(bZW.a.e, (ViewGroup) null, false)).setNegativeButton(this.b.getResources().getString(bZW.b.c), new DialogInterface.OnClickListener() { // from class: o.bZR
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                bZO.b(bZO.this, c9872yF, dialogInterface, i);
            }
        }).setPositiveButton(this.b.getResources().getString(bZW.b.a), new DialogInterface.OnClickListener() { // from class: o.bZU
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                bZO.c(bZO.this, c9872yF, dialogInterface, i);
            }
        }).create();
        C8632dsu.a(create, "");
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: o.bZT
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                bZO.e(dialogInterface);
            }
        });
        create.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: o.bZS
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                bZO.c(dialogInterface);
            }
        });
        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.bZQ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bZO.i(dialogInterface);
            }
        });
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(bZO bzo, C9872yF c9872yF, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) bzo, "");
        C8632dsu.c((Object) c9872yF, "");
        bzo.c.c(false);
        bZL.d.b();
        dialogInterface.dismiss();
        bzo.d(c9872yF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(bZO bzo, C9872yF c9872yF, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) bzo, "");
        C8632dsu.c((Object) c9872yF, "");
        bzo.c.c(true);
        bZL.d.c();
        dialogInterface.dismiss();
        bzo.d(c9872yF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(DialogInterface dialogInterface) {
        bZL.d.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(DialogInterface dialogInterface) {
        bZL.d.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(DialogInterface dialogInterface) {
        bZL.d.a();
    }

    @Override // o.bZN
    public void d(C9872yF c9872yF) {
        C8632dsu.c((Object) c9872yF, "");
        String string = this.b.getResources().getString(bZW.b.b);
        C8632dsu.a(string, "");
        C9878yL.d(c9872yF, (r22 & 1) != 0 ? Modifier.Companion : null, string, (r22 & 4) != 0 ? null : HawkinsIcon.aP.e, (r22 & 8) != 0 ? null : null, (r22 & 16) != 0 ? new AbstractC1017Lk.d(null, 1, null) : new AbstractC1017Lk.b(null, 1, null), (r22 & 32) != 0 ? Theme.b : null, (r22 & 64) != 0 ? 3000 : 0, (r22 & 128) != 0, (r22 & JSONzip.end) != 0 ? null : null);
    }

    @Override // o.bZN
    public void a() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://help.netflix.com/node/100131?headless=true&netflixsource=android"));
        intent.setFlags(872415232);
        this.b.startActivity(intent);
    }
}
