package com.netflix.model.branches;

import android.os.Parcel;
import com.netflix.falkor.BranchMap;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.model.leafs.ListOfMoviesSummaryImpl;
import o.C8370djb;
import o.IF;
import o.IN;
import o.InterfaceC8322diG;
import org.chromium.net.NetError;

/* loaded from: classes5.dex */
public class FalkorList<T extends InterfaceC8322diG> extends BranchMap<T> implements LoMo {
    private UnsummarizedList<UnsummarizedList<IF>> a;
    private UnsummarizedList<FalkorBillboardData> b;
    private UnsummarizedList<IF> d;
    private ListOfMoviesSummaryImpl e;

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public String getItemImpressionTokenForPosition(int i) {
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public String titleIconId() {
        return null;
    }

    public FalkorList(IN<T> in) {
        super(in);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.netflix.falkor.BranchMap, o.InterfaceC0943Io
    public InterfaceC8322diG b(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1857640538:
                if (str.equals("summary")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -172498039:
                if (str.equals("billboardData")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 116091890:
                if (str.equals("videoEvidence")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1781258279:
                if (str.equals("discoveryEvidence")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? super.b(str) : this.a : this.d : this.b : this.e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.netflix.falkor.BranchMap, o.InterfaceC0943Io
    public InterfaceC8322diG e(String str) {
        char c;
        InterfaceC8322diG b = b(str);
        if (b != null) {
            return b;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1857640538:
                if (str.equals("summary")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -172498039:
                if (str.equals("billboardData")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 116091890:
                if (str.equals("videoEvidence")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1781258279:
                if (str.equals("discoveryEvidence")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            ListOfMoviesSummaryImpl listOfMoviesSummaryImpl = new ListOfMoviesSummaryImpl();
            this.e = listOfMoviesSummaryImpl;
            return listOfMoviesSummaryImpl;
        } else if (c == 1) {
            UnsummarizedList<FalkorBillboardData> unsummarizedList = new UnsummarizedList<>(C8370djb.c());
            this.b = unsummarizedList;
            return unsummarizedList;
        } else if (c == 2) {
            UnsummarizedList<IF> unsummarizedList2 = new UnsummarizedList<>(C8370djb.n);
            this.d = unsummarizedList2;
            return unsummarizedList2;
        } else if (c == 3) {
            UnsummarizedList<UnsummarizedList<IF>> unsummarizedList3 = new UnsummarizedList<>(C8370djb.B);
            this.a = unsummarizedList3;
            return unsummarizedList3;
        } else {
            return super.e(str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.netflix.falkor.BranchMap, o.InterfaceC0943Io
    public void d(String str, InterfaceC8322diG interfaceC8322diG) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1857640538:
                if (str.equals("summary")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -172498039:
                if (str.equals("billboardData")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 116091890:
                if (str.equals("videoEvidence")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1781258279:
                if (str.equals("discoveryEvidence")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            this.e = (ListOfMoviesSummaryImpl) interfaceC8322diG;
        } else if (c == 1) {
            this.b = (UnsummarizedList) interfaceC8322diG;
        } else if (c == 2) {
            this.d = (UnsummarizedList) interfaceC8322diG;
        } else if (c == 3) {
            this.a = (UnsummarizedList) interfaceC8322diG;
        } else {
            super.d(str, interfaceC8322diG);
        }
    }

    @Override // com.netflix.falkor.BranchMap, o.InterfaceC0943Io
    public void a(String str) {
        d(str, null);
    }

    @Override // o.InterfaceC5178btp
    public String getId() {
        ListOfMoviesSummaryImpl listOfMoviesSummaryImpl = this.e;
        if (listOfMoviesSummaryImpl == null) {
            return null;
        }
        return listOfMoviesSummaryImpl.getId();
    }

    @Override // o.InterfaceC5178btp
    public String getTitle() {
        ListOfMoviesSummaryImpl listOfMoviesSummaryImpl = this.e;
        if (listOfMoviesSummaryImpl == null) {
            return null;
        }
        return listOfMoviesSummaryImpl.getTitle();
    }

    @Override // o.InterfaceC5178btp
    public LoMoType getType() {
        ListOfMoviesSummaryImpl listOfMoviesSummaryImpl = this.e;
        return listOfMoviesSummaryImpl == null ? LoMoType.STANDARD : listOfMoviesSummaryImpl.getType();
    }

    @Override // o.InterfaceC5281bvm
    public String getSectionUid() {
        ListOfMoviesSummaryImpl listOfMoviesSummaryImpl = this.e;
        if (listOfMoviesSummaryImpl == null) {
            return null;
        }
        return listOfMoviesSummaryImpl.getSectionUid();
    }

    @Override // o.InterfaceC5281bvm
    public int getTrackId() {
        ListOfMoviesSummaryImpl listOfMoviesSummaryImpl = this.e;
        return listOfMoviesSummaryImpl == null ? NetError.ERR_CERT_NON_UNIQUE_NAME : listOfMoviesSummaryImpl.getTrackId();
    }

    @Override // o.InterfaceC5281bvm
    public int getListPos() {
        ListOfMoviesSummaryImpl listOfMoviesSummaryImpl = this.e;
        if (listOfMoviesSummaryImpl == null) {
            return 0;
        }
        return listOfMoviesSummaryImpl.getListPos();
    }

    @Override // o.InterfaceC5281bvm
    public String getRequestId() {
        ListOfMoviesSummaryImpl listOfMoviesSummaryImpl = this.e;
        if (listOfMoviesSummaryImpl == null) {
            return null;
        }
        return listOfMoviesSummaryImpl.getRequestId();
    }

    @Override // o.InterfaceC5281bvm
    public String getListId() {
        ListOfMoviesSummaryImpl listOfMoviesSummaryImpl = this.e;
        if (listOfMoviesSummaryImpl == null) {
            return null;
        }
        return listOfMoviesSummaryImpl.getId();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        throw new IllegalStateException("unsupported method");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        throw new IllegalStateException("unsupported method");
    }

    @Override // o.InterfaceC5174btl
    public int getLength() {
        ListOfMoviesSummaryImpl listOfMoviesSummaryImpl = this.e;
        if (listOfMoviesSummaryImpl == null) {
            return 0;
        }
        return listOfMoviesSummaryImpl.getLength();
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public boolean isRichUITreatment() {
        ListOfMoviesSummaryImpl listOfMoviesSummaryImpl = this.e;
        return listOfMoviesSummaryImpl != null && listOfMoviesSummaryImpl.isRichUITreatment();
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public void setListPos(int i) {
        ListOfMoviesSummaryImpl listOfMoviesSummaryImpl = this.e;
        if (listOfMoviesSummaryImpl != null) {
            listOfMoviesSummaryImpl.setListPos(i);
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public void setLengthOverride(int i) {
        throw new IllegalStateException("unsupported method");
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public boolean isVolatile() {
        ListOfMoviesSummaryImpl listOfMoviesSummaryImpl = this.e;
        return listOfMoviesSummaryImpl != null && listOfMoviesSummaryImpl.isVolatile();
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public boolean needsRefresh() {
        ListOfMoviesSummaryImpl listOfMoviesSummaryImpl = this.e;
        return listOfMoviesSummaryImpl == null || listOfMoviesSummaryImpl.needsRefresh();
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo, o.InterfaceC5281bvm
    public String getListContext() {
        ListOfMoviesSummaryImpl listOfMoviesSummaryImpl = this.e;
        if (listOfMoviesSummaryImpl == null) {
            return null;
        }
        return listOfMoviesSummaryImpl.getListContext();
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public String getAnnotation(String str) {
        return this.e.getAnnotation(str);
    }

    @Override // o.InterfaceC5281bvm
    public String getImpressionToken() {
        return this.e.getImpressionToken();
    }
}
