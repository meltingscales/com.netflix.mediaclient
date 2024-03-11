package com.netflix.mediaclient.ngpstore.api;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes3.dex */
public interface NgpStoreApi {

    /* loaded from: classes3.dex */
    public interface e<T> {
        boolean c(T t);

        void d(T t);
    }

    List<String> getInstalledPackages(Context context);

    void readDeviceIdStore(e<a> eVar);

    void readLogoutStore(e<d> eVar);

    void readSsoStore(e<c> eVar);

    void writeDeviceIdStore(a aVar);

    void writeLogoutStore(d dVar);

    void writeSsoStore(c cVar);

    /* loaded from: classes3.dex */
    public static class a {
        @SerializedName("deviceIdToken")
        public String b;
        @SerializedName("creationTimeInMs")
        public long c;
        @SerializedName("writer")
        public String e;

        public String toString() {
            return "NgpDeviceIdStoreBlob{deviceIdToken='" + this.b + "', creationTimeInMs=" + this.c + ", writer='" + this.e + "'}";
        }
    }

    /* loaded from: classes3.dex */
    public static class c {
        @SerializedName("creationTimeInMs")
        public long a;
        @SerializedName("writer")
        public String b;
        @SerializedName("ssoToken")
        public String e;

        public String toString() {
            return "NgpSsoStoreBlob{, ssoToken='" + this.e + "', creationTimeInMs=" + this.a + ", writer='" + this.b + "'}";
        }
    }

    /* loaded from: classes3.dex */
    public static class d {
        @SerializedName("sharedSignOutTime")
        public long a;
        @SerializedName("writer")
        public String b;
        @SerializedName("creationTimeInMs")
        public long d;

        public String toString() {
            return "LogoutStoreBlob{sharedSignOutTime='" + this.a + "', creationTimeInMs=" + this.d + ", writer='" + this.b + "'}";
        }
    }
}
