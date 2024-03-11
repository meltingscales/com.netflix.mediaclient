package o;

import android.content.Context;
import android.view.View;
import com.netflix.mediaclient.android.fragment.NetflixFrag;

/* renamed from: o.caz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6318caz extends NetflixFrag {
    protected Context e;
    public InterfaceC6278caL j;

    public void c(View view) {
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    @Override // o.NY, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        b(context);
    }

    protected void b(Context context) {
        this.e = context;
        if (context instanceof InterfaceC6278caL) {
            this.j = (InterfaceC6278caL) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement LoginFragmentListener");
    }
}
