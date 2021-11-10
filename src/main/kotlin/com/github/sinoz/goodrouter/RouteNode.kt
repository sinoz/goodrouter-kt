package com.github.sinoz.goodrouter

public class RouteNode : Comparable<RouteNode> {
    public var name = ""
    public var anchor = ""
    public var parameter: String? = null
    public val children = mutableListOf<RouteNode>()
    public var parent: RouteNode? = null

    public val root: RouteNode?
        get() {
            var node = parent
            while (node != null) {
                node = node.parent
            }

            return node
        }

    public override fun compareTo(other: RouteNode): Int {
        return 0
    }

    public companion object {
        public fun make(name: String, template: String): RouteNode {
            return RouteNode()
        }

        public fun stringify(
            node: RouteNode?,
            params: Map<String, String>,
            encode: (String) -> String
        ): String {
            return ""
        }

        public fun parse(
            node: RouteNode?,
            path: String,
            decode: (String) -> String,
            params: Map<String, String> = mapOf()
        ): Route? {
            return null
        }

        public fun optimize(newNode: RouteNode) {
        }
    }
}