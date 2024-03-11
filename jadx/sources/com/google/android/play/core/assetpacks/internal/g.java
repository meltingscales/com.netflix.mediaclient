package com.google.android.play.core.assetpacks.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public abstract class g extends b implements h {
    public g() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // com.google.android.play.core.assetpacks.internal.b
    protected final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                c.b(parcel);
                n(parcel.readInt(), (Bundle) c.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                c.b(parcel);
                b(parcel.readInt(), (Bundle) c.a(parcel, Bundle.CREATOR));
                return true;
            case 4:
                c.b(parcel);
                f(parcel.readInt(), (Bundle) c.a(parcel, Bundle.CREATOR));
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                c.b(parcel);
                g(createTypedArrayList);
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                c.b(parcel);
                i((Bundle) c.a(parcel, creator), (Bundle) c.a(parcel, creator));
                return true;
            case 7:
                c.b(parcel);
                d((Bundle) c.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                c.b(parcel);
                j((Bundle) c.a(parcel, creator2), (Bundle) c.a(parcel, creator2));
                return true;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                c.b(parcel);
                k((Bundle) c.a(parcel, creator3), (Bundle) c.a(parcel, creator3));
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                c.b(parcel);
                h((Bundle) c.a(parcel, creator4), (Bundle) c.a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                c.b(parcel);
                e((Bundle) c.a(parcel, creator5), (Bundle) c.a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                c.b(parcel);
                m((Bundle) c.a(parcel, creator6), (Bundle) c.a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                c.b(parcel);
                l((Bundle) c.a(parcel, creator7), (Bundle) c.a(parcel, creator7));
                return true;
            case 15:
                c.b(parcel);
                c((Bundle) c.a(parcel, Bundle.CREATOR));
                return true;
        }
    }
}
