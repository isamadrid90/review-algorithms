package isamadrid90.binary_tree.traversals

import isamadrid90.binary_tree.Node
import isamadrid90.binary_tree.Tree
import kotlin.test.assertEquals
import org.junit.jupiter.api.Test
class PreorderTraversalTest {

    @Test
    fun `should return a correct list with one leaf`() {
        val tree = Tree(Node(2, null, null))

        val result = PreorderTraversal().execute(tree)

        assertEquals(listOf(2), result)
    }

    @Test
    fun `should return a correct list with one left child`() {
        val tree = Tree(Node(2, Node(1, null, null), null))

        val result = PreorderTraversal().execute(tree)

        assertEquals(listOf(2, 1), result)
    }

    @Test
    fun `should return a correct list with both children`() {
        val tree = Tree(Node(2, Node(1, null, null), Node(3, null, null)))

        val result = PreorderTraversal().execute(tree)

        assertEquals(listOf(2, 1, 3), result)
    }

    @Test
    fun `should return a correct list with two deep`() {
        val tree = Tree(Node(1, Node(2, Node(4, null, null), Node(5, null, null)), Node(3, null, null)))

        val result = PreorderTraversal().execute(tree)

        assertEquals(listOf(1, 2, 4, 5, 3), result)
    }
}
