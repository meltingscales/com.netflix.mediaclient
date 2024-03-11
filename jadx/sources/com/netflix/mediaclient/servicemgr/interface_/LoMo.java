package com.netflix.mediaclient.servicemgr.interface_;

import android.os.Parcelable;
import o.InterfaceC5174btl;

/* loaded from: classes4.dex */
public interface LoMo extends InterfaceC5174btl, Parcelable {
    @Deprecated
    String getAnnotation(String str);

    String getItemImpressionTokenForPosition(int i);

    String getListContext();

    boolean isRichUITreatment();

    boolean isVolatile();

    boolean needsRefresh();

    void setLengthOverride(int i);

    void setListPos(int i);

    String titleIconId();

    default boolean b() {
        throw new RuntimeException("This method should only be called from GraphQL implementations");
    }

    default boolean d() {
        throw new RuntimeException("This method should only be called from GraphQL implementation");
    }
}
