/*
 * Copyright 2018 DBL-X All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at following link.
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tech.dblx.picina.utils;

import java.util.zip.CRC32;

/**
 * @author linxin (dblx.lin@gmail.com)
 */
public class CRC32Utils {

    private static final ThreadLocal<CRC32> CRC_32_THREAD_LOCAL = ThreadLocal.withInitial(CRC32::new);

    public static int crc32(byte[] bytes) {
        CRC32 crc32 = CRC_32_THREAD_LOCAL.get();
        crc32.update(bytes);
        int ret = (int) crc32.getValue();
        crc32.reset();
        return ret;
    }

    public static int crc32(byte[] bytes, int offset, int length)
    {
        CRC32 crc32 = CRC_32_THREAD_LOCAL.get();
        crc32.update(bytes, offset, length);
        int ret = (int) crc32.getValue();
        crc32.reset();
        return ret;
    }
}
