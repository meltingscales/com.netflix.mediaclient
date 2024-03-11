package com.netflix.mediaclient.ui.offline;

import o.C7353cuc;
import o.InterfaceC4208baF;
import o.InterfaceC5204buO;
import o.InterfaceC5206buQ;

/* loaded from: classes6.dex */
public class StorageSwitchHelper {

    /* loaded from: classes6.dex */
    public enum StorageSwitchOption {
        CAN_NOT_SWITCH,
        SWITCH_TO_INTERNAL_STORAGE,
        SWITCH_TO_SD_CARD
    }

    StorageSwitchHelper() {
    }

    public static StorageSwitchOption b(InterfaceC4208baF interfaceC4208baF, String str) {
        InterfaceC5204buO l = interfaceC4208baF.l();
        if (l.c() != 2) {
            return StorageSwitchOption.CAN_NOT_SWITCH;
        }
        if (C7353cuc.a().b() >= 2) {
            return StorageSwitchOption.CAN_NOT_SWITCH;
        }
        int b = l.b();
        int i = b == 0 ? 1 : 0;
        long c = l.c(b).c();
        long h = l.c(b).h();
        long c2 = l.c(i).c() - l.c(i).h();
        if (c2 <= c - h) {
            return StorageSwitchOption.CAN_NOT_SWITCH;
        }
        InterfaceC5206buQ c3 = C7353cuc.a().c(str);
        if (c2 <= ((c3 == null || c3.aP_() <= 0) ? 1000000000L : c3.aP_())) {
            return StorageSwitchOption.CAN_NOT_SWITCH;
        }
        return i == 0 ? StorageSwitchOption.SWITCH_TO_INTERNAL_STORAGE : StorageSwitchOption.SWITCH_TO_SD_CARD;
    }
}
