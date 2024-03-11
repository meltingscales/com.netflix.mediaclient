package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;

/* renamed from: o.chK  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6648chK extends C6720cid {
    @Override // o.C6720cid, o.C6717cia.a
    public void b(Fragment fragment, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel) {
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
        super.b(fragment, miniPlayerVideoGroupViewModel);
        FragmentActivity requireActivity = fragment.requireActivity();
        C8632dsu.a(requireActivity, "");
        ((NetflixActivity) C9726vo.d(requireActivity, NetflixActivity.class)).hideActionAndBottomBars();
    }

    @Override // o.C6720cid, o.C6717cia.a
    public void e(Fragment fragment, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel) {
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
        super.e(fragment, miniPlayerVideoGroupViewModel);
        FragmentActivity requireActivity = fragment.requireActivity();
        C8632dsu.a(requireActivity, "");
        ((NetflixActivity) C9726vo.d(requireActivity, NetflixActivity.class)).showActionAndBottomBars();
    }
}
