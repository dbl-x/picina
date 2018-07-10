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

import com.alibaba.fastjson.JSON;

/**
 * Serialization tools base Fastjson.
 *
 * @author linxin (dblx.lin@gmail.com)
 */
public final class JsonUtils {

    public static byte[] marshalToByte(Object object) {
        return JSON.toJSONBytes(object);
    }

    public static <T> T unmarshalFromByte(byte[] raw, Class<T> clazz) {
        return JSON.parseObject(raw, clazz);
    }

    public static String marshalToString(Object object, boolean prettyFormat) {
        return JSON.toJSONString(object, prettyFormat);
    }

    public static <T> T unmarshalFromString(String raw, Class<T> clazz) {
        return JSON.parseObject(raw, clazz);
    }

}
