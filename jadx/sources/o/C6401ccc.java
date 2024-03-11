package o;

import android.content.Context;
import android.os.Parcel;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.model.leafs.ListOfMoviesSummary;
import o.C6401ccc;
import o.InterfaceC6419ccu;

/* renamed from: o.ccc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6401ccc extends C6388ccP<InterfaceC5223buh> {
    private final LoMo c;

    @Override // o.AbstractC6337cbR
    protected boolean e(int i) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6401ccc(Context context, LoMo loMo, ServiceManager serviceManager, C1729aMb c1729aMb, int i, InterfaceC6394ccV interfaceC6394ccV, TrackingInfoHolder trackingInfoHolder) {
        super(context, loMo, null, serviceManager, c1729aMb, i, interfaceC6394ccV, trackingInfoHolder);
        this.c = loMo;
    }

    @Override // o.AbstractC6337cbR
    int h() {
        return InterfaceC6419ccu.a.b(g().size(), d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC6337cbR
    public int c(Context context, int i) {
        return InterfaceC6419ccu.a.d(context, i);
    }

    @Override // o.AbstractC6337cbR
    protected void c(Context context, ServiceManager serviceManager, int i, int i2, InterfaceC5094bsK interfaceC5094bsK) {
        serviceManager.j().a(f(), i, i2, interfaceC5094bsK);
    }

    @Override // o.AbstractC6337cbR
    protected void c(final ListOfMoviesSummary listOfMoviesSummary) {
        LoMo loMo = new LoMo() { // from class: com.netflix.mediaclient.ui.lolomo.GalleryGenreListAdapter$1
            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
            public String getAnnotation(String str) {
                return null;
            }

            @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
            public String getItemImpressionTokenForPosition(int i) {
                return null;
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

            @Override // o.InterfaceC5174btl
            public int getLength() {
                return listOfMoviesSummary.getLength();
            }

            @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo, o.InterfaceC5281bvm
            public String getListContext() {
                return listOfMoviesSummary.getListContext();
            }

            @Override // o.InterfaceC5178btp
            public String getId() {
                LoMo loMo2;
                LoMo loMo3;
                loMo2 = C6401ccc.this.c;
                if (loMo2.getType() != listOfMoviesSummary.getType()) {
                    loMo3 = C6401ccc.this.c;
                    return loMo3.getId();
                }
                return listOfMoviesSummary.getId();
            }

            @Override // o.InterfaceC5178btp
            public LoMoType getType() {
                return LoMoType.FLAT_GENRE;
            }

            @Override // o.InterfaceC5281bvm
            public int getTrackId() {
                return listOfMoviesSummary.getTrackId();
            }

            @Override // o.InterfaceC5281bvm
            public int getListPos() {
                return listOfMoviesSummary.getListPos();
            }

            @Override // o.InterfaceC5281bvm
            public String getRequestId() {
                return listOfMoviesSummary.getRequestId();
            }

            @Override // o.InterfaceC5281bvm
            public String getListId() {
                return listOfMoviesSummary.getListId();
            }

            @Override // o.InterfaceC5281bvm
            public String getImpressionToken() {
                return listOfMoviesSummary.getImpressionToken();
            }
        };
        e(j().a(loMo));
        ((AbstractC6337cbR) this).a = ((AbstractC6337cbR) this).a.a(loMo);
    }
}
