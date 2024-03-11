package o;

import androidx.media3.common.Format;
import com.netflix.mediaclient.event.IStreamPresenting;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.Event;
import java.util.Objects;

/* renamed from: o.bhk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4610bhk extends InterfaceC4345bck, InterfaceC4683bjD {
    void a(long j, b bVar);

    void a(IStreamPresenting iStreamPresenting);

    void c(long j, Format format);

    void c(Event event);

    void e(int i, long j);

    void i();

    /* renamed from: o.bhk$b */
    /* loaded from: classes3.dex */
    public static class b {
        public final long a;
        public final int b;
        public final String d;

        public b(String str, long j, int i) {
            this.d = str;
            this.a = j;
            this.b = i;
        }

        public String toString() {
            return "Format{id='" + this.d + "', bitrateInBps=" + this.a + '}';
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && Objects.equals(this.d, bVar.d);
        }

        public int hashCode() {
            return Objects.hash(this.d, Long.valueOf(this.a), Integer.valueOf(this.b));
        }
    }
}
