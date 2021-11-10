package com.github.sinoz.goodrouter

import com.github.sinoz.goodrouter.uri.URIDecoder
import com.github.sinoz.goodrouter.uri.URIEncoder

public class Router(
    public val decoder: URIDecoder = URIDecoder.ECHO,
    public val encoder: URIEncoder = URIEncoder.ECHO,
) {
    public fun parse(path: String): Route? {
        return null
    }

    public operator fun set(name: String, template: String) {
    }

    public fun stringify(route: Route): String? {
        return null
    }
}