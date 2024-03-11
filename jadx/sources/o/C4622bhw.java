package o;

import com.netflix.mediaclient.event.IStreamPresenting;

/* renamed from: o.bhw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4622bhw implements IStreamPresenting {
    private String a;
    private IStreamPresenting.StreamType b;

    @Override // com.netflix.mediaclient.event.IStreamPresenting
    public IStreamPresenting.StreamType b() {
        return this.b;
    }

    @Override // com.netflix.mediaclient.event.IStreamPresenting
    public String c() {
        return this.a;
    }

    public C4622bhw(IStreamPresenting.StreamType streamType, String str) {
        this.b = streamType;
        this.a = str;
    }

    public String toString() {
        return "ExoStreamPresenting{type=" + this.b + ", id=" + this.a + "}";
    }
}
