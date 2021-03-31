/*
 * Copyright 2021 Alexi Bre
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tech.alexib.plaid.client.infrastructure

import kotlin.reflect.KProperty

public class PlaidResponse<T>(
    public val content: T,
    public val status: Int,
    public val headers: Map<String, List<String>>
) {
    /**
     * Get the response content using property delegation.
     *
     * ```kt
     * val content by response
     * ```
     */
    @JvmSynthetic
    public operator fun getValue(thisRef: Any?, property: KProperty<*>): T = content

    /**
     * Get a header by name. If multiple headers with the name exist the first is returned.
     * Use [getHeaders] to get all headers with [name].
     */
    public fun getHeader(name: String): String? = getHeaders(name).firstOrNull()

    /**
     * Get multiple headers sharing the same name. Use [getHeader] to retrieve the first occurrence.
     */
    public fun getHeaders(name: String): List<String> = headers[name].orEmpty()

    //    fun body() = content
    @Suppress("MagicNumber")
    val success = status in 200..299
}

suspend inline fun <reified T> PlaidResponse<T>.body() = this.content
