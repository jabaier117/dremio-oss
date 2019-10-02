/*
 * Copyright (C) 2017-2019 Dremio Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dremio.io;

import com.dremio.io.file.Path;

/**
 * Compression codec factory interface
 */
public interface CompressionCodecFactory {
  /**
   * Gets a compression codec based on {@code path} filename
   * @param path
   * @return a codec suitable for {@code path}, or null if none is available
   */
  CompressionCodec getCodec(Path path);
}