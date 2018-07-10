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

/**
 * Verify the input parameters.
 *
 * @author linxin (dblx.lin@gmail.com) 2018-07-10 20:54
 */
public final class ParameterUtils {

    public static String requireNotNull(String value, String name) {
        if (value == null) {
            throw new IllegalArgumentException(name + " is null");
        }
        return value;
    }

    public static String requireNotEmpty(String value, String name) {
        requireNotNull(value, name);
        if (value.length() == 0) {
            throw new IllegalArgumentException(name + " is empty");
        }
        return value;
    }

    public static String requireNotBlank(String value, String name) {
        requireNotEmpty(value, name);
        if (StringUtils.isBlank(value)) {
            throw new IllegalArgumentException(name + " is blank");
        }
        return value;
    }

    public static int requirePositive(int value, String name) {
        if (value <= 0) {
            throw new IllegalArgumentException(name + " is zero or negative");
        }
        return value;
    }

    public static int requireNotNegative(int value, String name) {
        if (value < 0) {
            throw new IllegalArgumentException(name + " is negative");
        }
        return value;
    }

    public static long requirePositive(long value, String name) {
        if (value <= 0L) {
            throw new IllegalArgumentException(name + " is zero or negative");
        }
        return value;
    }

    public static long requireNotNegative(long value, String name) {
        if (value < 0L) {
            throw new IllegalArgumentException(name + " is negative");
        }
        return value;
    }
}
