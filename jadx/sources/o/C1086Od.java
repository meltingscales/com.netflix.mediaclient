package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.android.fragment.NetflixFrag;

/* renamed from: o.Od  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C1086Od extends NetflixFrag {
    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new C1090Oh(getActivity());
    }
}
