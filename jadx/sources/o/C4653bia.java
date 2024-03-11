package o;

import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyKeepConnectionOnCancel;

/* renamed from: o.bia  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4653bia {
    public final int a;
    public final boolean b;
    public final int c;
    public final int d;

    public C4653bia(int i, int i2, int i3) {
        this(i, i2, i3, ConfigFastPropertyKeepConnectionOnCancel.enabled());
    }

    public C4653bia(int i, int i2, int i3, boolean z) {
        this.d = i;
        this.c = i2;
        this.a = i3;
        this.b = z;
    }
}
