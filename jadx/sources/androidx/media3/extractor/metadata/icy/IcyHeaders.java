package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import o.C9581sN;

/* loaded from: classes5.dex */
public final class IcyHeaders implements Metadata.Entry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Parcelable.Creator<IcyHeaders> CREATOR;
    private static char[] b$s43$119 = null;
    private static int d = 0;
    private static long d$s44$119 = 0;
    private static int e = 1;
    public final int bitrate;
    public final String genre;
    public final boolean isPublic;
    public final int metadataInterval;
    public final String name;
    public final String url;

    static void b() {
        d$s44$119 = -3221895664218339134L;
        b$s43$119 = new char[]{18283};
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 61;
        e = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 107;
        e = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.extractor.metadata.icy.IcyHeaders parse(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r15) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.icy.IcyHeaders.parse(java.util.Map):androidx.media3.extractor.metadata.icy.IcyHeaders");
    }

    public IcyHeaders(int i, String str, String str2, String str3, boolean z, int i2) {
        boolean z2;
        if (i2 == -1 || i2 > 0) {
            z2 = true;
        } else {
            int i3 = e + 21;
            d = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
            z2 = false;
        }
        Assertions.checkArgument(z2);
        this.bitrate = i;
        this.genre = str;
        this.name = str2;
        this.url = str3;
        this.isPublic = z;
        this.metadataInterval = i2;
        int i5 = d + 121;
        e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
    }

    IcyHeaders(Parcel parcel) {
        this.bitrate = parcel.readInt();
        this.genre = parcel.readString();
        this.name = parcel.readString();
        this.url = parcel.readString();
        this.isPublic = Util.readBoolean(parcel);
        this.metadataInterval = parcel.readInt();
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        int i = 2 % 2;
        String str = this.name;
        if (str != null) {
            builder.setStation(str);
            int i2 = e + 117;
            d = i2 % 128;
            int i3 = i2 % 2;
        }
        String str2 = this.genre;
        if (str2 != null) {
            int i4 = d + 113;
            e = i4 % 128;
            int i5 = i4 % 2;
            builder.setGenre(str2);
        }
        int i6 = d + 107;
        e = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r6 == r7) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = androidx.media3.extractor.metadata.icy.IcyHeaders.d
            int r2 = r1 + 55
            int r3 = r2 % 128
            androidx.media3.extractor.metadata.icy.IcyHeaders.e = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L15
            if (r6 != r7) goto L13
            goto L17
        L13:
            r3 = r4
            goto L1f
        L15:
            if (r6 != r7) goto L1f
        L17:
            int r1 = r1 + 51
            int r7 = r1 % 128
            androidx.media3.extractor.metadata.icy.IcyHeaders.e = r7
            int r1 = r1 % r0
            return r3
        L1f:
            if (r7 == 0) goto L93
            java.lang.Class<androidx.media3.extractor.metadata.icy.IcyHeaders> r1 = androidx.media3.extractor.metadata.icy.IcyHeaders.class
            java.lang.Class r2 = r7.getClass()
            if (r1 == r2) goto L2a
            goto L93
        L2a:
            androidx.media3.extractor.metadata.icy.IcyHeaders r7 = (androidx.media3.extractor.metadata.icy.IcyHeaders) r7
            int r1 = r6.bitrate
            int r2 = r7.bitrate
            if (r1 != r2) goto L86
            int r1 = androidx.media3.extractor.metadata.icy.IcyHeaders.d
            int r1 = r1 + 39
            int r2 = r1 % 128
            androidx.media3.extractor.metadata.icy.IcyHeaders.e = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L7b
            java.lang.String r1 = r6.genre
            java.lang.String r5 = r7.genre
            boolean r1 = androidx.media3.common.util.Util.areEqual(r1, r5)
            if (r1 == 0) goto L86
            java.lang.String r1 = r6.name
            java.lang.String r5 = r7.name
            boolean r1 = androidx.media3.common.util.Util.areEqual(r1, r5)
            if (r1 == 0) goto L86
            java.lang.String r1 = r6.url
            java.lang.String r5 = r7.url
            boolean r1 = androidx.media3.common.util.Util.areEqual(r1, r5)
            if (r1 == 0) goto L86
            boolean r1 = r6.isPublic
            boolean r5 = r7.isPublic
            if (r1 != r5) goto L86
            int r1 = androidx.media3.extractor.metadata.icy.IcyHeaders.d
            int r1 = r1 + 45
            int r5 = r1 % 128
            androidx.media3.extractor.metadata.icy.IcyHeaders.e = r5
            int r1 = r1 % r0
            if (r1 == 0) goto L75
            int r1 = r6.metadataInterval
            int r7 = r7.metadataInterval
            if (r1 != r7) goto L86
            r4 = r3
            goto L93
        L75:
            int r7 = r7.metadataInterval
            r2.hashCode()
            throw r2
        L7b:
            java.lang.String r0 = r6.genre
            java.lang.String r7 = r7.genre
            androidx.media3.common.util.Util.areEqual(r0, r7)
            r2.hashCode()
            throw r2
        L86:
            int r7 = androidx.media3.extractor.metadata.icy.IcyHeaders.d
            int r7 = r7 + 39
            int r1 = r7 % 128
            androidx.media3.extractor.metadata.icy.IcyHeaders.e = r1
            int r7 = r7 % r0
            if (r7 != 0) goto L93
            int r0 = r0 % 4
        L93:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.icy.IcyHeaders.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = e + 77;
        d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.bitrate;
        String str = this.genre;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.name;
        if (str2 != null) {
            int i6 = d + 89;
            e = i6 % 128;
            int i7 = i6 % 2;
            i = str2.hashCode();
            int i8 = d + 53;
            e = i8 % 128;
            int i9 = i8 % 2;
        } else {
            i = 0;
        }
        String str3 = this.url;
        return ((((((((((i5 + 527) * 31) + hashCode) * 31) + i) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.isPublic ? 1 : 0)) * 31) + this.metadataInterval;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IcyHeaders: name=\"" + this.name + "\", genre=\"" + this.genre + "\", bitrate=" + this.bitrate + ", metadataInterval=" + this.metadataInterval;
        int i2 = d + 109;
        e = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = d + 65;
        e = i3 % 128;
        int i4 = i3 % 2;
        parcel.writeInt(this.bitrate);
        parcel.writeString(this.genre);
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        Util.writeBoolean(parcel, this.isPublic);
        parcel.writeInt(this.metadataInterval);
        int i5 = d + 123;
        e = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        b();
        CREATOR = new Parcelable.Creator<IcyHeaders>() { // from class: androidx.media3.extractor.metadata.icy.IcyHeaders.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public IcyHeaders createFromParcel(Parcel parcel) {
                return new IcyHeaders(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public IcyHeaders[] newArray(int i) {
                return new IcyHeaders[i];
            }
        };
        int i = e + 121;
        d = i % 128;
        int i2 = i % 2;
    }

    private static void c(int i, char c, int i2, Object[] objArr) {
        int i3 = 2 % 2;
        C9581sN c9581sN = new C9581sN();
        long[] jArr = new long[i];
        c9581sN.d = 0;
        int i4 = $10 + 69;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (c9581sN.d < i) {
            int i6 = $11 + 121;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            jArr[c9581sN.d] = (((char) (b$s43$119[i2 + c9581sN.d] ^ 8527296503698573146L)) ^ (c9581sN.d * (8527296503698573146L ^ d$s44$119))) ^ c;
            c9581sN.d++;
        }
        char[] cArr = new char[i];
        c9581sN.d = 0;
        while (c9581sN.d < i) {
            cArr[c9581sN.d] = (char) jArr[c9581sN.d];
            c9581sN.d++;
        }
        objArr[0] = new String(cArr);
    }
}
