package com.netflix.model.leafs;

import android.os.Parcel;
import com.google.gson.JsonElement;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import java.util.Map;
import o.AbstractC0941Im;
import o.C8123deT;
import o.C8168dfL;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
public class TrackableListSummaryImpl extends AbstractC0941Im implements InterfaceC0952Ix, TrackableListSummary {
    private static final String TAG = "TrackableListSummary";
    private String displayName;
    private LoMoType enumType;
    private String impressionToken;
    private int length;
    private String listContext;
    private String listId;
    private int listPos;
    private String requestId;
    private String sectionUid;
    private int trackId;

    public String getId() {
        return this.listId;
    }

    @Override // o.InterfaceC5281bvm
    public String getImpressionToken() {
        return this.impressionToken;
    }

    @Override // o.InterfaceC5174btl
    public int getLength() {
        return this.length;
    }

    public String getListContext() {
        return this.listContext;
    }

    public String getListId() {
        return this.listId;
    }

    @Override // o.InterfaceC5281bvm
    public int getListPos() {
        int i = this.listPos;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // o.InterfaceC5281bvm
    public String getRequestId() {
        return this.requestId;
    }

    @Override // o.InterfaceC5281bvm
    public String getSectionUid() {
        return this.sectionUid;
    }

    public String getTitle() {
        return this.displayName;
    }

    @Override // o.InterfaceC5281bvm
    public int getTrackId() {
        return this.trackId;
    }

    public void setListPos(int i) {
        if (this.listPos == -1) {
            this.listPos = i;
        }
    }

    public void setTrackId(int i) {
        this.trackId = i;
    }

    public TrackableListSummaryImpl() {
        this.sectionUid = null;
        this.trackId = -100;
        this.listPos = -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void populate(JsonElement jsonElement) {
        char c;
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            String key = entry.getKey();
            key.hashCode();
            switch (key.hashCode()) {
                case -1106363674:
                    if (key.equals("length")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1067396154:
                    if (key.equals("trackId")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (key.equals(SignupConstants.Field.LANG_ID)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 181951702:
                    if (key.equals("listPos")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 434186027:
                    if (key.equals("sectionUid")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 693933066:
                    if (key.equals(Payload.PARAM_RENO_REQUEST_ID)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 780801392:
                    if (key.equals("impressionToken")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1263587121:
                    if (key.equals(Payload.PARAM_RENO_REFRESH_LIST_CONTEXT)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1714148973:
                    if (key.equals("displayName")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    this.length = entry.getValue().getAsInt();
                    break;
                case 1:
                    this.trackId = C8123deT.c(entry.getValue());
                    break;
                case 2:
                    this.listId = C8123deT.b(entry.getValue());
                    break;
                case 3:
                    this.listPos = C8123deT.c(entry.getValue());
                    break;
                case 4:
                    this.sectionUid = entry.getValue().getAsString();
                    break;
                case 5:
                    this.requestId = C8123deT.b(entry.getValue());
                    break;
                case 6:
                    this.impressionToken = C8123deT.b(entry.getValue());
                    break;
                case 7:
                    this.listContext = C8123deT.b(entry.getValue());
                    break;
                case '\b':
                    this.displayName = (entry.getValue() == null || entry.getValue().isJsonNull()) ? "" : C8168dfL.b(entry.getValue().getAsString());
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TrackableListSummaryImpl(Parcel parcel) {
        this.sectionUid = null;
        this.trackId = -100;
        this.listPos = -1;
        this.length = parcel.readInt();
        this.sectionUid = parcel.readString();
        this.trackId = parcel.readInt();
        this.listPos = parcel.readInt();
        this.requestId = parcel.readString();
        this.listContext = parcel.readString();
        this.impressionToken = parcel.readString();
        this.displayName = parcel.readString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.length);
        parcel.writeString(this.sectionUid);
        parcel.writeInt(this.trackId);
        parcel.writeInt(this.listPos);
        parcel.writeString(this.requestId);
        parcel.writeString(this.listContext);
        parcel.writeString(this.impressionToken);
        parcel.writeString(this.displayName);
    }

    public LoMoType getType() {
        if (this.enumType == null) {
            this.enumType = LoMoType.a(this.listContext);
        }
        return this.enumType;
    }

    public String toString() {
        return "TrackableListSummary [listId=" + this.listId + ", sectionUid=" + this.sectionUid + ", trackId=" + this.trackId + ", listPos=" + this.listPos + ", requestId=" + this.requestId + ", impressionToken=" + this.impressionToken + "]";
    }
}
