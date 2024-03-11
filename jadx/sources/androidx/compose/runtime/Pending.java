package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.dpB;
import o.drO;

/* loaded from: classes.dex */
final class Pending {
    private int groupIndex;
    private final HashMap<Integer, GroupInfo> groupInfos;
    private final List<KeyInfo> keyInfos;
    private final InterfaceC8554dpx keyMap$delegate;
    private final int startIndex;
    private final List<KeyInfo> usedKeys;

    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public final List<KeyInfo> getKeyInfos() {
        return this.keyInfos;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final List<KeyInfo> getUsed() {
        return this.usedKeys;
    }

    public final void setGroupIndex(int i) {
        this.groupIndex = i;
    }

    public Pending(List<KeyInfo> list, int i) {
        InterfaceC8554dpx b;
        this.keyInfos = list;
        this.startIndex = i;
        if (i < 0) {
            throw new IllegalArgumentException("Invalid start index".toString());
        }
        this.usedKeys = new ArrayList();
        HashMap<Integer, GroupInfo> hashMap = new HashMap<>();
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            KeyInfo keyInfo = this.keyInfos.get(i3);
            hashMap.put(Integer.valueOf(keyInfo.getLocation()), new GroupInfo(i3, i2, keyInfo.getNodes()));
            i2 += keyInfo.getNodes();
        }
        this.groupInfos = hashMap;
        b = dpB.b(new drO<HashMap<Object, LinkedHashSet<KeyInfo>>>() { // from class: androidx.compose.runtime.Pending$keyMap$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public final HashMap<Object, LinkedHashSet<KeyInfo>> invoke() {
                HashMap<Object, LinkedHashSet<KeyInfo>> multiMap;
                Object joinedKey;
                multiMap = ComposerKt.multiMap();
                Pending pending = Pending.this;
                int size2 = pending.getKeyInfos().size();
                for (int i4 = 0; i4 < size2; i4++) {
                    KeyInfo keyInfo2 = pending.getKeyInfos().get(i4);
                    joinedKey = ComposerKt.getJoinedKey(keyInfo2);
                    ComposerKt.put(multiMap, joinedKey, keyInfo2);
                }
                return multiMap;
            }
        });
        this.keyMap$delegate = b;
    }

    public final HashMap<Object, LinkedHashSet<KeyInfo>> getKeyMap() {
        return (HashMap) this.keyMap$delegate.getValue();
    }

    public final KeyInfo getNext(int i, Object obj) {
        Object pop;
        pop = ComposerKt.pop(getKeyMap(), obj != null ? new JoinedKey(Integer.valueOf(i), obj) : Integer.valueOf(i));
        return (KeyInfo) pop;
    }

    public final boolean recordUsed(KeyInfo keyInfo) {
        return this.usedKeys.add(keyInfo);
    }

    public final void registerMoveSlot(int i, int i2) {
        if (i > i2) {
            for (GroupInfo groupInfo : this.groupInfos.values()) {
                int slotIndex = groupInfo.getSlotIndex();
                if (slotIndex == i) {
                    groupInfo.setSlotIndex(i2);
                } else if (i2 <= slotIndex && slotIndex < i) {
                    groupInfo.setSlotIndex(slotIndex + 1);
                }
            }
        } else if (i2 > i) {
            for (GroupInfo groupInfo2 : this.groupInfos.values()) {
                int slotIndex2 = groupInfo2.getSlotIndex();
                if (slotIndex2 == i) {
                    groupInfo2.setSlotIndex(i2);
                } else if (i + 1 <= slotIndex2 && slotIndex2 < i2) {
                    groupInfo2.setSlotIndex(slotIndex2 - 1);
                }
            }
        }
    }

    public final void registerMoveNode(int i, int i2, int i3) {
        if (i > i2) {
            for (GroupInfo groupInfo : this.groupInfos.values()) {
                int nodeIndex = groupInfo.getNodeIndex();
                if (i <= nodeIndex && nodeIndex < i + i3) {
                    groupInfo.setNodeIndex((nodeIndex - i) + i2);
                } else if (i2 <= nodeIndex && nodeIndex < i) {
                    groupInfo.setNodeIndex(nodeIndex + i3);
                }
            }
        } else if (i2 > i) {
            for (GroupInfo groupInfo2 : this.groupInfos.values()) {
                int nodeIndex2 = groupInfo2.getNodeIndex();
                if (i <= nodeIndex2 && nodeIndex2 < i + i3) {
                    groupInfo2.setNodeIndex((nodeIndex2 - i) + i2);
                } else if (i + 1 <= nodeIndex2 && nodeIndex2 < i2) {
                    groupInfo2.setNodeIndex(nodeIndex2 - i3);
                }
            }
        }
    }

    public final void registerInsert(KeyInfo keyInfo, int i) {
        this.groupInfos.put(Integer.valueOf(keyInfo.getLocation()), new GroupInfo(-1, i, 0));
    }

    public final boolean updateNodeCount(int i, int i2) {
        int nodeIndex;
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(i));
        if (groupInfo != null) {
            int nodeIndex2 = groupInfo.getNodeIndex();
            int nodeCount = i2 - groupInfo.getNodeCount();
            groupInfo.setNodeCount(i2);
            if (nodeCount != 0) {
                for (GroupInfo groupInfo2 : this.groupInfos.values()) {
                    if (groupInfo2.getNodeIndex() >= nodeIndex2 && !C8632dsu.c(groupInfo2, groupInfo) && (nodeIndex = groupInfo2.getNodeIndex() + nodeCount) >= 0) {
                        groupInfo2.setNodeIndex(nodeIndex);
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final int slotPositionOf(KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        if (groupInfo != null) {
            return groupInfo.getSlotIndex();
        }
        return -1;
    }

    public final int nodePositionOf(KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        if (groupInfo != null) {
            return groupInfo.getNodeIndex();
        }
        return -1;
    }

    public final int updatedNodeCountOf(KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        return groupInfo != null ? groupInfo.getNodeCount() : keyInfo.getNodes();
    }
}
