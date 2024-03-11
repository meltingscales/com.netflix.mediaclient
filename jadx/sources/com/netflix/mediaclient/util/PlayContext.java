package com.netflix.mediaclient.util;

import android.os.Parcelable;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import o.InterfaceC5281bvm;

/* loaded from: classes.dex */
public interface PlayContext extends InterfaceC5281bvm, Parcelable {
    String a();

    void b(String str);

    void b(boolean z);

    boolean b();

    String d();

    void d(PlayLocationType playLocationType);

    PlayLocationType e();

    String f();

    String g();

    @Override // o.InterfaceC5281bvm
    String getSectionUid();

    String h();

    int i();

    PlayLocationType j();
}
