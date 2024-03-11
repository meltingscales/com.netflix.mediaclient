package com.netflix.mediaclient.servicemgr;

import android.os.SystemClock;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC5171bti;
import o.InterfaceC8598drn;

/* loaded from: classes.dex */
public interface ZuulAgent {
    int b();

    boolean b(String str);

    void c(InterfaceC5171bti interfaceC5171bti);

    void d(InterfaceC5171bti interfaceC5171bti);

    ConnectionStatus e();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class ConnectionStatus {
        private static final /* synthetic */ InterfaceC8598drn h;
        private static final /* synthetic */ ConnectionStatus[] i;
        public static final ConnectionStatus c = new ConnectionStatus("CLOSING", 0);
        public static final ConnectionStatus d = new ConnectionStatus("CLOSED", 1);
        public static final ConnectionStatus e = new ConnectionStatus("OPENING", 2);
        public static final ConnectionStatus b = new ConnectionStatus("OPEN", 3);
        public static final ConnectionStatus a = new ConnectionStatus("FAILED", 4);

        private static final /* synthetic */ ConnectionStatus[] b() {
            return new ConnectionStatus[]{c, d, e, b, a};
        }

        public static ConnectionStatus valueOf(String str) {
            return (ConnectionStatus) Enum.valueOf(ConnectionStatus.class, str);
        }

        public static ConnectionStatus[] values() {
            return (ConnectionStatus[]) i.clone();
        }

        private ConnectionStatus(String str, int i2) {
        }

        static {
            ConnectionStatus[] b2 = b();
            i = b2;
            h = C8600drp.e(b2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e {
        private ConnectionStatus a;
        private boolean b;
        private int c;
        private long d;
        private long e;
        private int f;
        private boolean g;

        public e() {
            this(null, 1, null);
        }

        public final ConnectionStatus a() {
            return this.a;
        }

        public final void a(int i) {
            this.c = i;
        }

        public final void a(boolean z) {
            this.b = z;
        }

        public final void b(long j) {
            this.e = j;
        }

        public final boolean b() {
            return this.b;
        }

        public final int c() {
            return this.f;
        }

        public final void c(ConnectionStatus connectionStatus) {
            C8632dsu.c((Object) connectionStatus, "");
            this.a = connectionStatus;
        }

        public final int d() {
            return this.c;
        }

        public final void d(int i) {
            this.f = i;
        }

        public final void d(boolean z) {
            this.g = z;
        }

        public final boolean e() {
            return this.g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final void g() {
            this.f = 0;
            this.g = true;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            ConnectionStatus connectionStatus = this.a;
            return "Status(connectionStatus=" + connectionStatus + ")";
        }

        public e(ConnectionStatus connectionStatus) {
            C8632dsu.c((Object) connectionStatus, "");
            this.a = connectionStatus;
            this.d = SystemClock.elapsedRealtime();
            this.g = true;
        }

        public /* synthetic */ e(ConnectionStatus connectionStatus, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? ConnectionStatus.d : connectionStatus);
        }

        public final boolean i() {
            ConnectionStatus connectionStatus = this.a;
            return connectionStatus == ConnectionStatus.b || connectionStatus == ConnectionStatus.e;
        }
    }
}
