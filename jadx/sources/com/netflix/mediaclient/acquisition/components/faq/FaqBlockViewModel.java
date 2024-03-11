package com.netflix.mediaclient.acquisition.components.faq;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class FaqBlockViewModel implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FaqBlockViewModel> CREATOR = new Creator();
    private final String faqItemId;
    private final CharSequence header;
    private final CharSequence value;

    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<FaqBlockViewModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FaqBlockViewModel createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            return new FaqBlockViewModel((CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FaqBlockViewModel[] newArray(int i) {
            return new FaqBlockViewModel[i];
        }
    }

    public static /* synthetic */ FaqBlockViewModel copy$default(FaqBlockViewModel faqBlockViewModel, CharSequence charSequence, CharSequence charSequence2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = faqBlockViewModel.header;
        }
        if ((i & 2) != 0) {
            charSequence2 = faqBlockViewModel.value;
        }
        if ((i & 4) != 0) {
            str = faqBlockViewModel.faqItemId;
        }
        return faqBlockViewModel.copy(charSequence, charSequence2, str);
    }

    public final CharSequence component1() {
        return this.header;
    }

    public final CharSequence component2() {
        return this.value;
    }

    public final String component3() {
        return this.faqItemId;
    }

    public final FaqBlockViewModel copy(CharSequence charSequence, CharSequence charSequence2, String str) {
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) charSequence2, "");
        C8632dsu.c((Object) str, "");
        return new FaqBlockViewModel(charSequence, charSequence2, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FaqBlockViewModel) {
            FaqBlockViewModel faqBlockViewModel = (FaqBlockViewModel) obj;
            return C8632dsu.c(this.header, faqBlockViewModel.header) && C8632dsu.c(this.value, faqBlockViewModel.value) && C8632dsu.c((Object) this.faqItemId, (Object) faqBlockViewModel.faqItemId);
        }
        return false;
    }

    public final String getFaqItemId() {
        return this.faqItemId;
    }

    public final CharSequence getHeader() {
        return this.header;
    }

    public final CharSequence getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.header.hashCode() * 31) + this.value.hashCode()) * 31) + this.faqItemId.hashCode();
    }

    public String toString() {
        CharSequence charSequence = this.header;
        CharSequence charSequence2 = this.value;
        String str = this.faqItemId;
        return "FaqBlockViewModel(header=" + ((Object) charSequence) + ", value=" + ((Object) charSequence2) + ", faqItemId=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        TextUtils.writeToParcel(this.header, parcel, i);
        TextUtils.writeToParcel(this.value, parcel, i);
        parcel.writeString(this.faqItemId);
    }

    public FaqBlockViewModel(CharSequence charSequence, CharSequence charSequence2, String str) {
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) charSequence2, "");
        C8632dsu.c((Object) str, "");
        this.header = charSequence;
        this.value = charSequence2;
        this.faqItemId = str;
    }
}
