package com.netflix.mediaclient.servicemgr.interface_.player.playlist;

import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment;
import java.util.List;
import java.util.Map;
import o.C5209buT;

/* loaded from: classes4.dex */
public class LegacyBranchingBookmark extends PlaylistTimestamp {
    @Override // com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp
    public long e(PlaylistMap playlistMap) {
        return this.e;
    }

    public LegacyBranchingBookmark(long j, long j2) {
        super(String.valueOf(j), "ENTIRE_PLAYABLE_AS_A_SEGMENT", j2);
    }

    public PlaylistTimestamp a(PlaylistMap playlistMap) {
        return e(playlistMap, OnRampFragment.ARTIFICIAL_PERSONALIZATION_WAIT_TIME);
    }

    private PlaylistTimestamp e(PlaylistMap playlistMap, long j) {
        long max;
        if (this.c.equals(playlistMap.b())) {
            for (Map.Entry entry : playlistMap.h().entrySet()) {
                C5209buT c5209buT = (C5209buT) entry.getValue();
                long j2 = c5209buT.c;
                long j3 = j2 == 0 ? 0L : j2 - 1;
                long j4 = this.e;
                if (j4 >= j3) {
                    long j5 = c5209buT.b;
                    if (j4 < j5) {
                        if (j4 + j > j5) {
                            max = Math.max((j5 - j) - j2, 0L);
                        } else {
                            max = Math.max(j4 - j2, 0L);
                        }
                        List<List<Long>> list = c5209buT.d;
                        if (list != null) {
                            for (int size = list.size() - 1; size >= 0; size--) {
                                List<Long> list2 = c5209buT.d.get(size);
                                if (max > list2.get(0).longValue() && max <= list2.get(1).longValue()) {
                                    max = Math.max(list2.get(0).longValue() - OnRampFragment.ARTIFICIAL_PERSONALIZATION_WAIT_TIME, 0L);
                                }
                            }
                        }
                        return new PlaylistTimestamp(this.c, (String) entry.getKey(), max);
                    }
                }
            }
            return null;
        }
        return null;
    }

    public PlaylistTimestamp b(PlaylistMap playlistMap) {
        return e(playlistMap, 0L);
    }
}
