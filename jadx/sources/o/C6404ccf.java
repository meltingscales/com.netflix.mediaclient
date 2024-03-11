package o;

import android.os.Bundle;
import android.os.Parcel;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.mediaclient.ui.home.HomeActivity;
import o.C6388ccP;
import o.C6404ccf;
import o.C6409cck;

/* renamed from: o.ccf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6404ccf extends C6409cck {
    private String p;
    private LoMo r = new LoMo() { // from class: com.netflix.mediaclient.ui.lolomo.GalleryGenreLoMoFrag$1
        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
        public String getAnnotation(String str) {
            return null;
        }

        @Override // o.InterfaceC5281bvm
        public String getImpressionToken() {
            return null;
        }

        @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
        public String getItemImpressionTokenForPosition(int i) {
            return null;
        }

        @Override // o.InterfaceC5174btl
        public int getLength() {
            return Integer.MAX_VALUE;
        }

        @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo, o.InterfaceC5281bvm
        public String getListContext() {
            return null;
        }

        @Override // o.InterfaceC5281bvm
        public int getListPos() {
            return 0;
        }

        @Override // o.InterfaceC5281bvm
        public String getSectionUid() {
            return null;
        }

        @Override // o.InterfaceC5178btp
        public String getTitle() {
            return null;
        }

        @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
        public boolean isRichUITreatment() {
            return false;
        }

        @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
        public boolean isVolatile() {
            return false;
        }

        @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
        public boolean needsRefresh() {
            return false;
        }

        @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
        public void setLengthOverride(int i) {
        }

        @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
        public void setListPos(int i) {
        }

        @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
        public String titleIconId() {
            return null;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        @Override // o.InterfaceC5178btp
        public String getId() {
            return C6404ccf.this.N();
        }

        @Override // o.InterfaceC5178btp
        public LoMoType getType() {
            return LoMoType.FLAT_GENRE;
        }

        @Override // o.InterfaceC5281bvm
        public int getTrackId() {
            GenreItem genreItem = ((C6409cck) C6404ccf.this).b;
            if (genreItem != null && genreItem.getTrackId() > 0) {
                return ((C6409cck) C6404ccf.this).b.getTrackId();
            }
            LoMo loMo = ((C6409cck) C6404ccf.this).m;
            if (loMo != null && loMo.getTrackId() > 0) {
                return ((C6409cck) C6404ccf.this).m.getTrackId();
            }
            C6388ccP c6388ccP = ((C6409cck) C6404ccf.this).e;
            if (c6388ccP == null || c6388ccP.j().c() == null) {
                return -220;
            }
            ((C6409cck) C6404ccf.this).e.j().c().getTrackId();
            return -220;
        }

        @Override // o.InterfaceC5281bvm
        public String getRequestId() {
            LoMo loMo = ((C6409cck) C6404ccf.this).m;
            return (loMo == null || loMo.getRequestId() == null) ? "flatGenreRequestId" : ((C6409cck) C6404ccf.this).m.getRequestId();
        }

        @Override // o.InterfaceC5281bvm
        public String getListId() {
            return C6404ccf.this.N();
        }
    };

    @Override // o.C6409cck
    public LoMo I() {
        return this.r;
    }

    public static C6404ccf a(String str, String str2, GenreItem genreItem) {
        return c(str, null, genreItem, str2, "");
    }

    public static C6404ccf e(String str, String str2, GenreItem genreItem) {
        return c(str, str2, genreItem, null, "");
    }

    public static C6404ccf d(String str, String str2, GenreItem genreItem, String str3) {
        return c(str, str2, genreItem, null, str3);
    }

    public static C6404ccf c(String str, String str2, GenreItem genreItem, String str3, String str4) {
        C6404ccf c6404ccf = new C6404ccf();
        Bundle bundle = new Bundle();
        bundle.putString("list_id", str);
        if (str2 != null) {
            bundle.putString("genre_filter", str2);
        }
        if (genreItem != null) {
            bundle.putParcelable("genre_parcel", genreItem);
        }
        bundle.putString("genre_from_lolomo", str4);
        if (str3 != null) {
            bundle.putString("similars_videotype", str3);
        }
        c6404ccf.setArguments(bundle);
        return c6404ccf;
    }

    @Override // o.C6409cck
    protected void F() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.setClassLoader(C6409cck.class.getClassLoader());
            this.p = getArguments().getString("genre_filter");
        }
        super.F();
    }

    @Override // o.C6409cck, com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        NetflixActionBar netflixActionBar;
        C6455cdd o2;
        NetflixActivity bj_ = bj_();
        String N = N();
        if (this.p != null && N != null && (bj_ instanceof HomeActivity) && (netflixActionBar = bj_.getNetflixActionBar()) != null && (o2 = ((HomeActivity) bj_).o()) != null) {
            o2.a(this, this.p, N);
            C6455cdd.b(netflixActionBar, false, 0, netflixActionBar.i() * 4);
            return true;
        }
        return super.bD_();
    }
}
