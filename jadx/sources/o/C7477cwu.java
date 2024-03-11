package o;

import android.app.Dialog;
import android.os.Bundle;

/* renamed from: o.cwu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7477cwu extends AbstractC7476cwt {
    public static final d e = new d(null);
    private final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7477cwu(String str) {
        super(str);
        C8632dsu.c((Object) str, "");
        this.d = 5;
        this.f = 5;
    }

    public C7477cwu() {
        super("");
        this.d = 5;
        this.f = 5;
    }

    /* renamed from: o.cwu$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("MdxRegPairPinDialog");
        }

        public final C7477cwu b(String str) {
            C8632dsu.c((Object) str, "");
            getLogTag();
            return new C7477cwu(str);
        }
    }

    @Override // o.AbstractC7476cwt, o.C8019dcV
    public void b(Dialog dialog) {
        C8632dsu.c((Object) dialog, "");
        super.b(dialog);
        this.h.setVisibility(8);
    }

    @Override // o.C8019dcV
    public void a(boolean z) {
        super.a(z);
        this.h.setVisibility(8);
    }

    @Override // o.C8019dcV, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C8632dsu.a(onCreateDialog, "");
        a(this.d);
        return onCreateDialog;
    }
}
