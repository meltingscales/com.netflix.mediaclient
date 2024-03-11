package com.netflix.mediaclient.android.sharing.impl.types;

import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.sharing.impl.types.VideoDetailsShareable;
import com.netflix.mediaclient.ui.R;
import o.C1333Xq;
import o.C8632dsu;
import o.QI;
import o.bEY;

/* loaded from: classes3.dex */
public class GameSharable extends VideoDetailsShareable {
    public static final Parcelable.Creator<GameSharable> CREATOR = new Creator();
    private final VideoDetailsShareable.VideoDetailsParcelable c;

    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<GameSharable> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final GameSharable createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new GameSharable(VideoDetailsShareable.VideoDetailsParcelable.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public final GameSharable[] newArray(int i) {
            return new GameSharable[i];
        }
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.VideoDetailsShareable, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        this.c.writeToParcel(parcel, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameSharable(VideoDetailsShareable.VideoDetailsParcelable videoDetailsParcelable) {
        super(videoDetailsParcelable);
        C8632dsu.c((Object) videoDetailsParcelable, "");
        this.c = videoDetailsParcelable;
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.VideoDetailsShareable, com.netflix.mediaclient.android.sharing.impl.types.Shareable
    public String d(bEY bey, QI<VideoDetailsShareable.VideoDetailsParcelable> qi) {
        C8632dsu.c((Object) bey, "");
        C8632dsu.c((Object) qi, "");
        return bEY.c.a(bey, "game", this.c.b(), qi.d(), null, null, 0, 56, null);
    }

    @Override // com.netflix.mediaclient.android.sharing.impl.types.VideoDetailsShareable, com.netflix.mediaclient.android.sharing.impl.types.Shareable
    public CharSequence b(bEY bey, QI<VideoDetailsShareable.VideoDetailsParcelable> qi) {
        C8632dsu.c((Object) bey, "");
        C8632dsu.c((Object) qi, "");
        String c = C1333Xq.d(R.o.bU).d(SignupConstants.Field.VIDEO_TITLE, this.c.e()).d(SignupConstants.Field.URL, d(bey, qi)).c();
        C8632dsu.a(c, "");
        return c;
    }
}
