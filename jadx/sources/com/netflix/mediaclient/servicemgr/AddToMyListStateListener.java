package com.netflix.mediaclient.servicemgr;

import o.C8600drp;
import o.InterfaceC8598drn;

/* loaded from: classes4.dex */
public interface AddToMyListStateListener {
    void b(AddToMyListState addToMyListState);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class AddToMyListState {
        private static final /* synthetic */ AddToMyListState[] b;
        private static final /* synthetic */ InterfaceC8598drn c;
        public static final AddToMyListState d = new AddToMyListState("IN_LIST", 0);
        public static final AddToMyListState a = new AddToMyListState("NOT_IN_LIST", 1);
        public static final AddToMyListState e = new AddToMyListState("LOADING", 2);

        private static final /* synthetic */ AddToMyListState[] c() {
            return new AddToMyListState[]{d, a, e};
        }

        public static AddToMyListState valueOf(String str) {
            return (AddToMyListState) Enum.valueOf(AddToMyListState.class, str);
        }

        public static AddToMyListState[] values() {
            return (AddToMyListState[]) b.clone();
        }

        private AddToMyListState(String str, int i) {
        }

        static {
            AddToMyListState[] c2 = c();
            b = c2;
            c = C8600drp.e(c2);
        }
    }
}
