package o;

import android.content.Context;
import android.os.Parcel;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.service.falkor.FalkorAgentStatus;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.ListOfMoviesSummary;
import com.netflix.model.leafs.VideoEntityModelImplKt;
import java.util.List;
import o.InterfaceC6419ccu;

/* renamed from: o.cci  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6407cci extends C6388ccP<InterfaceC5223buh> {
    private VideoType c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6407cci(Context context, LoMo loMo, VideoType videoType, ServiceManager serviceManager, C1729aMb c1729aMb, int i, InterfaceC6394ccV interfaceC6394ccV, TrackingInfoHolder trackingInfoHolder) {
        super(context, loMo, null, serviceManager, c1729aMb, i, interfaceC6394ccV, trackingInfoHolder);
        this.c = videoType;
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
    protected void c(Context context, ServiceManager serviceManager, int i, int i2, final InterfaceC5094bsK interfaceC5094bsK) {
        serviceManager.j().b(new JM(f().getId(), this.c, false), new AbstractC5164btb() { // from class: o.cci.1
            @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
            public void n(List<InterfaceC8366diy> list, Status status) {
                super.n(list, status);
                if (status.j() && !(status instanceof FalkorAgentStatus)) {
                    status = FalkorAgentStatus.c(InterfaceC1078Nw.aJ, "FetchSimsTask", "FetchSimsTask", false);
                }
                interfaceC5094bsK.d(VideoEntityModelImplKt.videosToEntitiesFromJava(list, C6407cci.this.g().size()), status);
            }
        });
    }

    @Override // o.AbstractC6337cbR, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return Math.max(6, g().size());
    }

    @Override // o.AbstractC6337cbR
    protected void c(final ListOfMoviesSummary listOfMoviesSummary) {
        e(j().a(new LoMo() { // from class: com.netflix.mediaclient.ui.lolomo.GallerySimilarsListAdapter$2
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

            @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo, o.InterfaceC5281bvm
            public String getListContext() {
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

            @Override // o.InterfaceC5178btp
            public String getId() {
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
        }));
    }
}
