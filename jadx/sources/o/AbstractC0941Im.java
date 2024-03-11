package o;

/* renamed from: o.Im  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0941Im implements InterfaceC8321diF {
    private Long expires;
    private long timestamp = System.currentTimeMillis();

    public Long getExpires() {
        return this.expires;
    }

    @Override // o.InterfaceC8323diH
    public final long getTimestamp() {
        return this.timestamp;
    }

    @Override // o.InterfaceC8321diF
    public final boolean needsRefresh(long j) {
        long j2 = this.timestamp;
        return j2 > 0 && j2 < j;
    }

    @Override // o.InterfaceC8321diF
    public void setExpires(Long l) {
        this.expires = l;
    }

    @Override // o.InterfaceC8323diH
    public final void setTimestamp(long j) {
        this.timestamp = j;
    }
}
