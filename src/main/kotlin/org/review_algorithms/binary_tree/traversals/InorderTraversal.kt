package org.review_algorithms.binary_tree.traversals

import org.review_algorithms.binary_tree.Node
import org.review_algorithms.binary_tree.Tree
class InorderTraversal {
    fun <T> execute(tree: Tree<T>): List<T> {
        return traverseTree(tree.root, listOf())
    }

    private fun <T> traverseTree(node: Node<T>?, traverse: List<T>): List<T> {
        return if (node == null) {
            traverse
        } else {
            val leftTraverse = traverseTree(node.left, traverse)
            val rootTraverse = visitNode(node, leftTraverse)
            traverseTree(node.right, rootTraverse)
        }
    }

    private fun <T> visitNode(node: Node<T>, traverse: List<T>) = traverse + listOf(node.value)
}
