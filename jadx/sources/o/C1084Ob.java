package o;

import android.app.Dialog;
import android.os.Bundle;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.InteractiveMdxWarningDialogFragment$onCreateDialog$1;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.ui.verifyplay.PlayVerifierVault;
import kotlin.jvm.internal.Ref;

/* renamed from: o.Ob  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1084Ob extends NetflixDialogFrag {
    public static final d a = new d(null);

    public static final C1084Ob b(boolean z, PlayVerifierVault playVerifierVault) {
        return a.e(z, playVerifierVault);
    }

    /* renamed from: o.Ob$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("InteractiveChromecastWarningDialogFragment");
        }

        public final C1084Ob e(boolean z, PlayVerifierVault playVerifierVault) {
            C8632dsu.c((Object) playVerifierVault, "");
            Bundle bundle = new Bundle();
            bundle.putBoolean("age_protected", z);
            bundle.putParcelable("play_verifier_vault", new PlayVerifierVault(playVerifierVault.b(), playVerifierVault.d(), playVerifierVault.h(), playVerifierVault.i(), playVerifierVault.g(), false, playVerifierVault.c(), playVerifierVault.e()));
            C1084Ob c1084Ob = new C1084Ob();
            c1084Ob.setArguments(bundle);
            return c1084Ob;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, android.app.Dialog, java.lang.Object] */
    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? onCreateDialog = super.onCreateDialog(bundle);
        C8632dsu.a((Object) onCreateDialog, "");
        objectRef.d = onCreateDialog;
        C9726vo.d(getActivity(), getArguments(), new InteractiveMdxWarningDialogFragment$onCreateDialog$1(this, objectRef));
        return (Dialog) objectRef.d;
    }

    public final void b(NetflixActivity netflixActivity) {
        if (netflixActivity != null) {
            show(netflixActivity.getSupportFragmentManager(), a.getLogTag());
        }
    }
}
