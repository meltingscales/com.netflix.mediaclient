package com.netflix.model.leafs;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C8123deT;
import o.C8168dfL;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
public class ListOfMoviesSummaryImpl extends TrackableListSummaryImpl implements ListOfMoviesSummary, InterfaceC0952Ix {
    public static final Parcelable.Creator<ListOfMoviesSummary> CREATOR = new Parcelable.Creator<ListOfMoviesSummary>() { // from class: com.netflix.model.leafs.ListOfMoviesSummaryImpl.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ListOfMoviesSummary createFromParcel(Parcel parcel) {
            return new ListOfMoviesSummaryImpl(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ListOfMoviesSummary[] newArray(int i) {
            return new ListOfMoviesSummary[i];
        }
    };
    private static final String TAG = "ListOfMoviesSummary";
    private Map<String, String> annotationsMap;
    private String displayName;
    private LoMoType enumType;
    private String id;
    private List<String> itemImpressionTokens;
    private String listContext;
    private Long refreshTimestamp;
    private boolean renderRichUITreatment;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.netflix.model.leafs.TrackableListSummaryImpl, o.InterfaceC5178btp
    public String getId() {
        return this.id;
    }

    @Override // com.netflix.model.leafs.TrackableListSummaryImpl, o.InterfaceC5281bvm
    public String getListContext() {
        return this.listContext;
    }

    @Override // com.netflix.model.leafs.TrackableListSummaryImpl, o.InterfaceC5178btp
    public String getTitle() {
        return this.displayName;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public boolean isRichUITreatment() {
        return this.renderRichUITreatment;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public boolean isVolatile() {
        return this.refreshTimestamp != null;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public void setLengthOverride(int i) {
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public String titleIconId() {
        return null;
    }

    public ListOfMoviesSummaryImpl() {
        this.refreshTimestamp = null;
        this.itemImpressionTokens = Collections.emptyList();
        this.annotationsMap = Collections.emptyMap();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.netflix.model.leafs.TrackableListSummaryImpl, o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        char c;
        super.populate(jsonElement);
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            JsonElement value = entry.getValue();
            String key = entry.getKey();
            key.hashCode();
            switch (key.hashCode()) {
                case -1997286858:
                    if (key.equals("itemImpressionTokens")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1079985029:
                    if (key.equals("refreshTimestamp")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1027260046:
                    if (key.equals("renderRichUITreatment")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (key.equals(SignupConstants.Field.LANG_ID)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1263587121:
                    if (key.equals(Payload.PARAM_RENO_REFRESH_LIST_CONTEXT)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1445867416:
                    if (key.equals("annotationsMap")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1714148973:
                    if (key.equals("displayName")) {
                        c = 6;
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
                    this.itemImpressionTokens = C8123deT.c(value.getAsJsonArray());
                    break;
                case 1:
                    this.refreshTimestamp = Long.valueOf(value.getAsLong());
                    break;
                case 2:
                    this.renderRichUITreatment = value.getAsBoolean();
                    break;
                case 3:
                    this.id = value.getAsString();
                    break;
                case 4:
                    this.listContext = value.getAsString();
                    break;
                case 5:
                    parseAnnotations(value.getAsJsonObject());
                    break;
                case 6:
                    this.displayName = (value == null || value.isJsonNull()) ? "" : C8168dfL.b(value.getAsString());
                    break;
            }
        }
    }

    public ListOfMoviesSummaryImpl(Parcel parcel) {
        super(parcel);
        this.refreshTimestamp = null;
        this.itemImpressionTokens = Collections.emptyList();
        this.annotationsMap = Collections.emptyMap();
        this.id = parcel.readString();
        this.displayName = parcel.readString();
        this.listContext = parcel.readString();
        this.renderRichUITreatment = parcel.readByte() != 0;
        this.refreshTimestamp = Long.valueOf(parcel.readLong());
        parcel.readStringList(this.itemImpressionTokens);
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        if (readBundle.isEmpty()) {
            return;
        }
        this.annotationsMap = new HashMap();
        for (String str : readBundle.keySet()) {
            this.annotationsMap.put(str, readBundle.getString(str));
        }
    }

    @Override // com.netflix.model.leafs.TrackableListSummaryImpl, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.id);
        parcel.writeString(this.displayName);
        parcel.writeString(this.listContext);
        parcel.writeByte(this.renderRichUITreatment ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.refreshTimestamp.longValue());
        parcel.writeStringList(this.itemImpressionTokens);
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : this.annotationsMap.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        parcel.writeBundle(bundle);
    }

    private void parseAnnotations(JsonObject jsonObject) {
        this.annotationsMap = new HashMap(jsonObject.entrySet().size());
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            this.annotationsMap.put(entry.getKey(), entry.getValue().getAsString());
        }
    }

    @Override // com.netflix.model.leafs.TrackableListSummaryImpl, o.InterfaceC5178btp
    public LoMoType getType() {
        if (this.enumType == null) {
            this.enumType = LoMoType.a(this.listContext);
        }
        return this.enumType;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public boolean needsRefresh() {
        Long l = this.refreshTimestamp;
        return l != null && l.longValue() < System.currentTimeMillis();
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public String getItemImpressionTokenForPosition(int i) {
        if (i < 0 || i >= this.itemImpressionTokens.size()) {
            return null;
        }
        return this.itemImpressionTokens.get(i);
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public String getAnnotation(String str) {
        return this.annotationsMap.get(str);
    }

    @Override // com.netflix.model.leafs.TrackableListSummaryImpl
    public String toString() {
        return "ListOfMoviesSummary{id='" + this.id + "', displayName='" + this.displayName + "', listContext='" + this.listContext + "', isVolatile=" + isVolatile() + ", refreshTimestamp=" + this.refreshTimestamp + ", renderRichUITreatment='" + this.renderRichUITreatment + "', itemImpressionTokens='" + this.itemImpressionTokens + "'}";
    }
}
