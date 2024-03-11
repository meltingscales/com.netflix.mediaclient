package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.PlayerStateMachine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: o.bmL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4777bmL extends BaseEventJson {
    @SerializedName("strmsel")
    protected ArrayList<b> e;

    private static int c(int i, boolean z) {
        if (i == 1) {
            return z ? 2 : 0;
        } else if (i != 2) {
            return -1;
        } else {
            return z ? 3 : 1;
        }
    }

    public C4777bmL(String str, String str2, String str3, String str4, String str5) {
        super("asereport", str, str2, str3, str4, str5);
        this.e = new ArrayList<>();
    }

    public void a(int i, PlayerStateMachine.State state, int[] iArr, long j, int i2, long j2, long j3, long j4, int i3, int i4, int i5, int i6, boolean z) {
        b bVar;
        b bVar2;
        int c = c(i, z);
        int a = a(state);
        Iterator<b> it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = it.next();
            if (bVar.d == c) {
                break;
            }
        }
        if (bVar == null) {
            b bVar3 = new b(c, iArr);
            this.e.add(bVar3);
            bVar2 = bVar3;
        } else {
            bVar2 = bVar;
        }
        bVar2.c(j, i2, j2, j3, j4, i3, i4, a, i5, i6, z);
    }

    public boolean b(int i, int[] iArr, boolean z) {
        int c = c(i, z);
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.d == c && !Arrays.equals(next.b, iArr)) {
                return true;
            }
        }
        return false;
    }

    public boolean c() {
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            if (!it.next().a()) {
                return false;
            }
        }
        return true;
    }

    public void a() {
        this.e.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bmL$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[PlayerStateMachine.State.values().length];
            c = iArr;
            try {
                iArr[PlayerStateMachine.State.INITIALIZING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[PlayerStateMachine.State.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[PlayerStateMachine.State.PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[PlayerStateMachine.State.REBUFFERING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[PlayerStateMachine.State.SEEKING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[PlayerStateMachine.State.SKIPPING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[PlayerStateMachine.State.AUDIO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static final int a(PlayerStateMachine.State state) {
        switch (AnonymousClass1.c[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 5;
            case 3:
                return 3;
            case 4:
                return 2;
            case 5:
            case 6:
            case 7:
                return 1;
            default:
                return -1;
        }
    }

    /* renamed from: o.bmL$b */
    /* loaded from: classes3.dex */
    public static class b {
        @SerializedName("seltrace")
        private ArrayList<long[]> a = new ArrayList<>();
        @SerializedName("bitrates")
        private int[] b;
        private transient long[] c;
        @SerializedName("dltype")
        private int d;

        public b(int i, int[] iArr) {
            this.d = i;
            this.b = iArr;
        }

        public void c(long j, int i, long j2, long j3, long j4, int i2, int i3, int i4, int i5, int i6, boolean z) {
            long[] jArr;
            long j5 = i;
            long j6 = i3;
            long j7 = i2;
            long j8 = i4;
            long j9 = i5;
            long j10 = i6;
            long[] jArr2 = {j5, j, j2, j3, j4, j6, j7, j8, j9, j2, j10};
            long[] jArr3 = this.c;
            if (jArr3 == null) {
                this.a.add(jArr2);
                jArr = jArr2;
            } else {
                this.a.add(new long[]{j5 - jArr3[0], j - jArr3[1], j2 - jArr3[2], j3 - jArr3[3], j4 - jArr3[4], j6 - jArr3[5], j7 - jArr3[6], j8 - jArr3[7], j9 - jArr3[8], j2 - jArr3[9], j10 - jArr3[10]});
                jArr = jArr2;
            }
            this.c = jArr;
        }

        public boolean a() {
            return this.a.isEmpty();
        }
    }
}
