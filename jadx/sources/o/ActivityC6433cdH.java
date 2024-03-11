package o;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;

@aIA
/* renamed from: o.cdH  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class ActivityC6433cdH extends MO {
    private GenreItem a;
    private String c;
    private LoMo e;

    private AppView o() {
        return null;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean canApplyBrowseExperience() {
        return true;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public int getActionBarParentViewId() {
        return com.netflix.mediaclient.ui.R.g.gw;
    }

    @Override // o.MO
    public boolean i() {
        return false;
    }

    public static Class<?> c() {
        return NetflixApplication.getInstance().M() ? ActivityC6436cdK.class : ActivityC6433cdH.class;
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.e = (LoMo) getIntent().getParcelableExtra("lomo_parcel");
        this.c = getIntent().getStringExtra("genre_id");
        this.a = (GenreItem) getIntent().getParcelableExtra("genre_parcel");
        super.onCreate(bundle);
        updateActionBar();
    }

    @Override // o.MO
    public Fragment d() {
        LoMo loMo = this.e;
        if (loMo != null) {
            return C6409cck.c(loMo);
        }
        return C6404ccf.d(this.c, (String) null, this.a, "");
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        LoMo loMo = this.e;
        if (loMo != null) {
            String id = loMo.getId();
            id.hashCode();
            if (id.equals("queue")) {
                return AppView.myListGallery;
            }
            return o();
        }
        GenreItem genreItem = this.a;
        if (genreItem != null) {
            if (AnonymousClass1.c[genreItem.getGenreType().ordinal()] == 1) {
                return AppView.browseTitles;
            }
            return o();
        }
        return o();
    }

    /* renamed from: o.cdH$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[GenreItem.GenreType.values().length];
            c = iArr;
            try {
                iArr[GenreItem.GenreType.GALLERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public InterfaceC5091bsH createManagerStatusListener() {
        return new InterfaceC5091bsH() { // from class: o.cdH.3
            @Override // o.InterfaceC5091bsH
            public void onManagerReady(ServiceManager serviceManager, Status status) {
                if (C8054ddD.l(ActivityC6433cdH.this) || !(ActivityC6433cdH.this.h() instanceof NetflixFrag)) {
                    return;
                }
                ((NetflixFrag) ActivityC6433cdH.this.h()).onManagerReady(serviceManager, status);
            }

            @Override // o.InterfaceC5091bsH
            public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
                if (C8054ddD.l(ActivityC6433cdH.this)) {
                    return;
                }
                C1044Mm.d("nf_gallery_lomo", "NetflixService is NOT available!");
                if (ActivityC6433cdH.this.h() instanceof NetflixFrag) {
                    ((NetflixFrag) ActivityC6433cdH.this.h()).onManagerUnavailable(serviceManager, status);
                }
            }
        };
    }
}
