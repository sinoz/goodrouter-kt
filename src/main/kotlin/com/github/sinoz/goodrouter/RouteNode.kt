package com.github.sinoz.goodrouter

public class RouteNode {
    public var name = ""
    public var anchor = ""
    public var parameter: String? = null
    public val children = mutableListOf<RouteNode>()
    public var parent: RouteNode? = null
}