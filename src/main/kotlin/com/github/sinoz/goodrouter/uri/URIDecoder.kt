package com.github.sinoz.goodrouter.uri

public interface URIDecoder {
    public fun decode(input: String): String

    public companion object {
        public val ECHO = object : URIDecoder {
            override fun decode(input: String): String {
                return ""
            }
        }
    }
}