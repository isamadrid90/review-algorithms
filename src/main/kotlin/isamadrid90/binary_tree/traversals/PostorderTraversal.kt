package isamadrid90.binary_tree.traversals

import isamadrid90.binary_tree.Node
import isamadrid90.binary_tree.Tree
class PostorderTraversal {
    fun <T> execute(tree: Tree<T>): List<T> {
        return traverseTree(tree.root, listOf())
    }
    private fun <T> traverseTree(node: Node<T>?, traverse: List<T>): List<T> {
        return if (node == null) {
            traverse
        } else {
            val leftTraverse = traverseTree(node.left, traverse)
            val rightTraverse = traverseTree(node.right, leftTraverse)
            visitNode(node, rightTraverse)
        }
    }
    private fun <T> visitNode(node: Node<T>, traverse: List<T>) = traverse + listOf(node.value)
}
