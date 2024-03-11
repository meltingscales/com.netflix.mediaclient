package o;

import android.os.SystemClock;
import com.netflix.cl.model.event.Event;

/* renamed from: o.dfH  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8164dfH extends AbstractC8152dew implements InterfaceC8154dey {
    private Event b;
    private int e;

    protected abstract void b(boolean z);

    @Override // o.AbstractC8152dew
    public int c() {
        return this.e;
    }

    public AbstractC8164dfH(String str) {
        super(str);
    }

    public boolean a(Event event, int i) {
        synchronized (this) {
            this.e = i;
            this.b = event;
            C1044Mm.a(this.a, "Events counter: %d", Integer.valueOf(i));
            if (d()) {
                d(true);
                return true;
            }
            return false;
        }
    }

    @Override // o.InterfaceC8154dey
    public Event b() {
        Event event;
        synchronized (this) {
            event = this.b;
            this.b = null;
        }
        return event;
    }

    @Override // o.AbstractC8152dew
    public void d(boolean z) {
        if (!this.j.get()) {
            C1044Mm.j(this.a, "flushEvents:: can NOT flush queue, it is not started yet!");
            return;
        }
        C1044Mm.a(this.a, "Flushing %d events, save if failed %b", Integer.valueOf(this.e), Boolean.valueOf(z));
        b(z);
        this.g = SystemClock.elapsedRealtime();
        this.e = 0;
    }
}
