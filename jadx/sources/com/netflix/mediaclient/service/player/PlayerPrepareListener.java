package com.netflix.mediaclient.service.player;

import o.C5102bsS;
import o.C8600drp;
import o.InterfaceC8598drn;

/* loaded from: classes3.dex */
public interface PlayerPrepareListener {
    void c(C5102bsS c5102bsS, PrepareResult prepareResult);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class PrepareResult {
        private static final /* synthetic */ InterfaceC8598drn e;
        private static final /* synthetic */ PrepareResult[] f;
        public static final PrepareResult d = new PrepareResult("ERROR", 0);
        public static final PrepareResult b = new PrepareResult("SUCCESS", 1);
        public static final PrepareResult c = new PrepareResult("SKIPPED", 2);
        public static final PrepareResult a = new PrepareResult("CANCELED", 3);

        private static final /* synthetic */ PrepareResult[] c() {
            return new PrepareResult[]{d, b, c, a};
        }

        public static PrepareResult valueOf(String str) {
            return (PrepareResult) Enum.valueOf(PrepareResult.class, str);
        }

        public static PrepareResult[] values() {
            return (PrepareResult[]) f.clone();
        }

        private PrepareResult(String str, int i) {
        }

        static {
            PrepareResult[] c2 = c();
            f = c2;
            e = C8600drp.e(c2);
        }
    }
}
