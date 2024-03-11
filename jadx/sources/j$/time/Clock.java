package j$.time;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes5.dex */
public abstract class Clock {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class SystemClock extends Clock implements Serializable {
        private static final long serialVersionUID = 6740630888130243051L;
        private final ZoneId d;
        private static final long e = (System.currentTimeMillis() / 1000) - PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        static final SystemClock b = new SystemClock(ZoneOffset.e);

        SystemClock(ZoneId zoneId) {
            this.d = zoneId;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
        }

        @Override // j$.time.Clock
        public long a() {
            return System.currentTimeMillis();
        }

        @Override // j$.time.Clock
        public Instant b() {
            return Instant.a(a());
        }

        @Override // j$.time.Clock
        public ZoneId d() {
            return this.d;
        }

        @Override // j$.time.Clock
        public boolean equals(Object obj) {
            if (obj instanceof SystemClock) {
                return this.d.equals(((SystemClock) obj).d);
            }
            return false;
        }

        @Override // j$.time.Clock
        public int hashCode() {
            return this.d.hashCode() + 1;
        }

        public String toString() {
            ZoneId zoneId = this.d;
            return "SystemClock[" + zoneId + "]";
        }
    }

    protected Clock() {
    }

    public static Clock c() {
        return new SystemClock(ZoneId.e());
    }

    public static Clock e() {
        return SystemClock.b;
    }

    public long a() {
        return b().b();
    }

    public abstract Instant b();

    public abstract ZoneId d();

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
