package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.function.Supplier;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TrackingInfo implements Parcelable {
    public static final Parcelable.Creator<TrackingInfo> CREATOR = new Parcelable.Creator<TrackingInfo>() { // from class: com.netflix.model.leafs.originals.interactive.TrackingInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TrackingInfo createFromParcel(Parcel parcel) {
            return new TrackingInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TrackingInfo[] newArray(int i) {
            return new TrackingInfo[i];
        }
    };
    final JSONObject trackingInfo;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TrackingInfo(JSONObject jSONObject) {
        this.trackingInfo = (JSONObject) TrackingInfo$$ExternalSyntheticBackport0.m(jSONObject, new Supplier() { // from class: com.netflix.model.leafs.originals.interactive.TrackingInfo$$ExternalSyntheticLambda1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new JSONObject();
            }
        });
    }

    public JSONObject copyValues(JSONObject jSONObject) {
        Iterator keys = this.trackingInfo.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            jSONObject.put(str, this.trackingInfo.get(str));
        }
        return jSONObject;
    }

    protected TrackingInfo(Parcel parcel) {
        JSONObject jSONObject = new JSONObject();
        if ("trackingInfo".equals(parcel.readString())) {
            try {
                jSONObject = new JSONObject(parcel.readString());
            } catch (JSONException unused) {
            }
        }
        this.trackingInfo = jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString("trackingInfo");
        parcel.writeString(this.trackingInfo.toString());
    }

    public TrackingInfo merge(TrackingInfo trackingInfo) {
        if (trackingInfo == null) {
            return this;
        }
        try {
            JSONObject copyValues = copyValues(new JSONObject());
            trackingInfo.copyValues(copyValues);
            return new TrackingInfo(copyValues);
        } catch (JSONException unused) {
            return null;
        }
    }
}
