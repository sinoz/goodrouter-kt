package com.github.sinoz.goodrouter.uri

public interface URIEncoder {
    public fun encode(input: String): String

    public companion object {
        public val ECHO = object : URIEncoder {
            override fun encode(input: String): String {
                return ""
            }
        }
    }
}