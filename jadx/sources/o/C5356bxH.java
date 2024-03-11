package o;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import o.SY;

/* renamed from: o.bxH  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5356bxH extends AbstractC5349bxA {
    @Override // o.InterfaceC5350bxB
    public void c(NetflixActivity netflixActivity, int i) {
        C8632dsu.c((Object) netflixActivity, "");
    }

    public C5356bxH() {
        super("netflixAppUpdateDialog");
    }

    @Override // o.InterfaceC5350bxB
    public boolean e(final NetflixActivity netflixActivity, boolean z) {
        C8632dsu.c((Object) netflixActivity, "");
        SY.e eVar = new SY.e(netflixActivity);
        eVar.c("");
        if (z) {
            a("nfUpdate", false);
            eVar.d(com.netflix.mediaclient.ui.R.o.eh);
        } else if (!d()) {
            return false;
        } else {
            a("nfUpdate", true);
            eVar.d(com.netflix.mediaclient.ui.R.o.cE);
            eVar.d(false);
            eVar.e(com.netflix.mediaclient.ui.R.o.cL, new DialogInterface.OnClickListener() { // from class: o.bxM
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C5356bxH.e(C5356bxH.this, netflixActivity, dialogInterface, i);
                }
            });
        }
        eVar.c(com.netflix.mediaclient.ui.R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.bxN
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C5356bxH.a(C5356bxH.this, netflixActivity, dialogInterface, i);
            }
        });
        eVar.c();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C5356bxH c5356bxH, NetflixActivity netflixActivity, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) c5356bxH, "");
        C8632dsu.c((Object) netflixActivity, "");
        c5356bxH.e((Context) netflixActivity);
        c5356bxH.d(netflixActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C5356bxH c5356bxH, NetflixActivity netflixActivity, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) c5356bxH, "");
        C8632dsu.c((Object) netflixActivity, "");
        c5356bxH.e((Context) netflixActivity);
        Intent e = C8061ddK.e(netflixActivity);
        if (e != null) {
            e.addFlags(268435456);
            try {
                netflixActivity.startActivity(e);
            } catch (ActivityNotFoundException unused) {
            } catch (Throwable th) {
                netflixActivity.finish();
                throw th;
            }
            netflixActivity.finish();
        }
    }
}
