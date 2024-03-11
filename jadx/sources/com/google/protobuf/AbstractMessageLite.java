package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessageLite.Builder;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class AbstractMessageLite<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite {
    protected int memoizedHashCode = 0;

    @Override // com.google.protobuf.MessageLite
    public ByteString toByteString() {
        try {
            ByteString.CodedBuilder newCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(newCodedBuilder.getCodedOutput());
            return newCodedBuilder.build();
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    @Override // com.google.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream newInstance = CodedOutputStream.newInstance(bArr);
            writeTo(newInstance);
            newInstance.checkNoSpaceLeft();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    public void writeTo(OutputStream outputStream) {
        CodedOutputStream newInstance = CodedOutputStream.newInstance(outputStream, CodedOutputStream.computePreferredBufferSize(getSerializedSize()));
        writeTo(newInstance);
        newInstance.flush();
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        CodedOutputStream newInstance = CodedOutputStream.newInstance(outputStream, CodedOutputStream.computePreferredBufferSize(CodedOutputStream.computeUInt32SizeNoTag(serializedSize) + serializedSize));
        newInstance.writeUInt32NoTag(serializedSize);
        writeTo(newInstance);
        newInstance.flush();
    }

    int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSerializedSize(Schema schema) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize == -1) {
            int serializedSize = schema.getSerializedSize(this);
            setMemoizedSerializedSize(serializedSize);
            return serializedSize;
        }
        return memoizedSerializedSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException(this);
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    protected static void checkByteStringIsUtf8(ByteString byteString) {
        if (!byteString.isValidUtf8()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    @Deprecated
    protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        Builder.addAll((Iterable) iterable, (List) collection);
    }

    protected static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        Builder.addAll((Iterable) iterable, (List) list);
    }

    /* loaded from: classes2.dex */
    public static abstract class Builder<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite.Builder {
        @Override // 
        /* renamed from: clone */
        public abstract BuilderType mo2781clone();

        protected abstract BuilderType internalMergeFrom(MessageType messagetype);

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public abstract BuilderType mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        @Override // 
        /* renamed from: mergeFrom */
        public BuilderType mo2782mergeFrom(CodedInputStream codedInputStream) {
            return mergeFrom(codedInputStream, ExtensionRegistryLite.getEmptyRegistry());
        }

        public BuilderType mergeFrom(ByteString byteString) {
            try {
                CodedInputStream newCodedInput = byteString.newCodedInput();
                mo2782mergeFrom(newCodedInput);
                newCodedInput.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        public BuilderType mergeFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            try {
                CodedInputStream newCodedInput = byteString.newCodedInput();
                mergeFrom(newCodedInput, extensionRegistryLite);
                newCodedInput.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public BuilderType mergeFrom(byte[] bArr) {
            return mo2785mergeFrom(bArr, 0, bArr.length);
        }

        @Override // 
        /* renamed from: mergeFrom */
        public BuilderType mo2785mergeFrom(byte[] bArr, int i, int i2) {
            try {
                CodedInputStream newInstance = CodedInputStream.newInstance(bArr, i, i2);
                mo2782mergeFrom(newInstance);
                newInstance.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
            }
        }

        @Override // 
        /* renamed from: mergeFrom */
        public BuilderType mo2787mergeFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return mo2786mergeFrom(bArr, 0, bArr.length, extensionRegistryLite);
        }

        @Override // 
        /* renamed from: mergeFrom */
        public BuilderType mo2786mergeFrom(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) {
            try {
                CodedInputStream newInstance = CodedInputStream.newInstance(bArr, i, i2);
                mergeFrom(newInstance, extensionRegistryLite);
                newInstance.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
            }
        }

        @Override // 
        /* renamed from: mergeFrom */
        public BuilderType mo2783mergeFrom(InputStream inputStream) {
            CodedInputStream newInstance = CodedInputStream.newInstance(inputStream);
            mo2782mergeFrom(newInstance);
            newInstance.checkLastTagWas(0);
            return this;
        }

        @Override // 
        /* renamed from: mergeFrom */
        public BuilderType mo2784mergeFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            CodedInputStream newInstance = CodedInputStream.newInstance(inputStream);
            mergeFrom(newInstance, extensionRegistryLite);
            newInstance.checkLastTagWas(0);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class LimitedInputStream extends FilterInputStream {
            private int limit;

            /* JADX INFO: Access modifiers changed from: package-private */
            public LimitedInputStream(InputStream inputStream, int i) {
                super(inputStream);
                this.limit = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.limit);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() {
                if (this.limit <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.limit--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                int i3 = this.limit;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.limit -= read;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) {
                int skip = (int) super.skip(Math.min(j, this.limit));
                if (skip >= 0) {
                    this.limit -= skip;
                }
                return skip;
            }
        }

        public boolean mergeDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            int read = inputStream.read();
            if (read == -1) {
                return false;
            }
            mo2784mergeFrom((InputStream) new LimitedInputStream(inputStream, CodedInputStream.readRawVarint32(read, inputStream)), extensionRegistryLite);
            return true;
        }

        public boolean mergeDelimitedFrom(InputStream inputStream) {
            return mergeDelimitedFrom(inputStream, ExtensionRegistryLite.getEmptyRegistry());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(MessageLite messageLite) {
            if (!getDefaultInstanceForType().getClass().isInstance(messageLite)) {
                throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
            }
            return (BuilderType) internalMergeFrom((AbstractMessageLite) messageLite);
        }

        private String getReadingExceptionMessage(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        private static <T> void addAllCheckingNulls(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t : iterable) {
                if (t == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public static UninitializedMessageException newUninitializedMessageException(MessageLite messageLite) {
            return new UninitializedMessageException(messageLite);
        }

        @Deprecated
        protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll((Iterable) iterable, (List) collection);
        }

        protected static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            Internal.checkNotNull(iterable);
            if (iterable instanceof LazyStringList) {
                List<?> underlyingElements = ((LazyStringList) iterable).getUnderlyingElements();
                LazyStringList lazyStringList = (LazyStringList) list;
                int size = list.size();
                for (Object obj : underlyingElements) {
                    if (obj == null) {
                        String str = "Element at index " + (lazyStringList.size() - size) + " is null.";
                        for (int size2 = lazyStringList.size() - 1; size2 >= size; size2--) {
                            lazyStringList.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (obj instanceof ByteString) {
                        lazyStringList.add((ByteString) obj);
                    } else {
                        lazyStringList.add((LazyStringList) ((String) obj));
                    }
                }
            } else if (iterable instanceof PrimitiveNonBoxingCollection) {
                list.addAll((Collection) iterable);
            } else {
                addAllCheckingNulls(iterable, list);
            }
        }
    }
}